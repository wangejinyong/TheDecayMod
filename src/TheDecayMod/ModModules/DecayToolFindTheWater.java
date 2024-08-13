package TheDecayMod.ModModules;

import arc.struct.Seq;
import mindustry.content.Liquids;
import mindustry.world.Block;
import mindustry.world.Tile;

import static mindustry.Vars.world;

public class DecayToolFindTheWater {

    public float efficientBlocks = 0f;

    /** @return the environmental value */
    public float findTheWater(int x, int y, Block block, Seq<Tile> tmpArray){
        Tile tile = world.tile(x,y);
        for(Tile other : tile.getLinkedTilesAs(block,tmpArray)){
            if(other.floor().liquidDrop == Liquids.water){
                efficientBlocks += 0.5f;
            }
        }
        return efficientBlocks;
    }




}
