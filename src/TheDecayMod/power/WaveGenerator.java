package TheDecayMod.power;

import arc.Core;
import mindustry.world.blocks.power.PowerGenerator;

public class WaveGenerator extends PowerGenerator {


    public WaveGenerator(String name){
        super(name);
        noUpdateDisabled = true;
        baseExplosiveness = 0f;
    }

    public void init(){
        super.init();
        //proper light clipping
        clipSize = Math.max(clipSize, 45f * size * 2f * 2f);
    }

    public void drawPlace(int x, int y, int rotation, boolean valid){
        super.drawPlace(x, y, rotation, valid);
            //TODO: make the efficient changes
            //drawPlaceText(Core.bundle.formatFloat("bar.efficiency", sumAttribute(attribute, x, y) * 100, 1), x, y, valid);
    }




}
