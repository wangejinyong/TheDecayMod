package TheDecayMod.world;

import TheDecayMod.ModModules.RandomForWind;
import mindustry.world.blocks.power.PowerGenerator;
import arc.struct.*;
import mindustry.world.meta.*;



public class WindGenerator extends PowerGenerator {
    float WindPower = 1f;

    public WindGenerator(String name)
    {
        super(name);
        //Decrease the desire that enemy attack on it.
        flags = EnumSet.of();
        //Can't affect by any floor.
        envEnabled = Env.any;
        //creat a decider used to make the amount of energy generated by all generators consistent
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
            if(RandomForWind.randomWindEfficient()){
                WindPower=RandomForWind.randomWindMultiply();
            }
            productionEfficiency = enabled ? WindPower :1f;

        }

    }

}
