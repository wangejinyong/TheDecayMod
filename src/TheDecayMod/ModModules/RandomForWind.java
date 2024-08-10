package TheDecayMod.ModModules;

import arc.util.Timekeeper;

import java.util.Random;


public class RandomForWind {
    public static float windMultiply = 0f;
    public static Timekeeper TK = new Timekeeper(20);


    public static float randomWindMultiply(){
        Random randW = new Random();
        windMultiply = randW.nextFloat() + 1f;
        return windMultiply;
    }

    public static boolean randomWindEfficient(){
        if(TK.get()) {
            TK.reset();
            return true;
        }
        return false;
    }



}
