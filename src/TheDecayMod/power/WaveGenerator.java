package TheDecayMod.power;


import TheDecayMod.ModModules.DecayToolFindTheWater;
import arc.Core;
import arc.util.Log;
import mindustry.content.Liquids;
import mindustry.game.Team;
import mindustry.world.Tile;
import mindustry.world.blocks.power.PowerGenerator;



public class WaveGenerator extends PowerGenerator {

    public boolean displayEfficiency = true;


    public WaveGenerator(String name){
        super(name);
        //blocks will never update
        noUpdateDisabled = true;
        baseExplosiveness = 0f;
    }


    public void drawPlace(int x, int y, int rotation, boolean valid){
        super.drawPlace(x, y, rotation, valid);
        DecayToolFindTheWater DTF = new DecayToolFindTheWater();
        if(displayEfficiency){
            drawPlaceText(Core.bundle.formatFloat("bar.efficiency", DTF.findTheWater(x,y,this,tempTiles) * 100, 1), x, y, valid);
        }
    }

    //Make the generator cannot place on floor without water.
    @Override
    public boolean canPlaceOn(Tile tile, Team team, int rotation) {
        for(Tile other :tile.getLinkedTilesAs(this,tempTiles)){
            if(other.floor().liquidDrop == Liquids.water){
                return true;
            }
        }

        return false;
    }

    public class WaveGeneratorBuild extends GeneratorBuild {
        public float efficientPerBlock = 0f;
        int update = -1;

        //power efficient controller
        public float powerEfficient()
        {
            for(Tile other : this.tile.getLinkedTilesAs(this.block,tempTiles))
            {
                if(other.floor().liquidDrop == Liquids.water){
                    efficientPerBlock += 0.5f;
                }
            }
            Log.info("eff is :" + efficientPerBlock);
            return efficientPerBlock;
        }



        public void updateTile(){
            if(update == -1) {
                productionEfficiency = 1f;
                productionEfficiency *= powerEfficient();
                update++;
            }
        }






    }







}

