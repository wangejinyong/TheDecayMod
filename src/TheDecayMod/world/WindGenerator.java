package TheDecayMod.world;

import TheDecayMod.ModModules.RandomForWind;
import mindustry.world.blocks.power.PowerGenerator;
import arc.struct.*;
import mindustry.world.meta.*;


public class WindGenerator extends PowerGenerator {
    //use to adjust ticks
    int ticksAdjustment = -1;
    public WindGenerator(String name)
    {
        super(name);
        //Decrease the desire that enemy attack on it.
        flags = EnumSet.of();
        //Can't affect by any floor.
        envEnabled = Env.any;
    }

    @Override
    public void setStats(){
        super.setStats();
        stats.remove(generationType);
        stats.add(generationType, powerProduction * 60.0f, StatUnit.powerSecond);
    }

    public class WindGeneratorBuild extends GeneratorBuild{
        @Override
        public void updateTile(){
            if(ticksAdjustment==-1 || ticksAdjustment == 1200) {
                productionEfficiency = enabled ? RandomForWind.randomWindMultiply() : 0f;
                ticksAdjustment = 0;
            }
            else {
                ticksAdjustment++;
            }
        }
    }

}
