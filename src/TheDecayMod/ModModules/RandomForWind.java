package TheDecayMod.ModModules;

import java.util.Random;


public class RandomForWind {
    public static float windMultiply = 0f;
    public static int  ticksAdjustment = -1;


    public static float randomWindMultiply(){
        Random randW = new Random();
        windMultiply = randW.nextFloat() + 1f;
        return windMultiply;
    }

    public static boolean randomWindEfficient(){
        if(ticksAdjustment==-1 || ticksAdjustment == 1200) {
            ticksAdjustment = 0;
            return true;
        }
        else {
            ticksAdjustment++;
            return false;
        }
    }



}
