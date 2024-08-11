package TheDecayMod.ModModules;

import arc.util.Timekeeper;
import java.util.Random;


public class RandomForWind {
    public static float windMultiply = 0f;
    //set a timekeeper with 20 seconds,which means the energy changes once every 20 seconds
    public static Timekeeper TK = new Timekeeper(20);


    public static float randomWindMultiply(){
        Random randW = new Random();
        windMultiply = randW.nextFloat() + 1f;
        return windMultiply;
    }


    //TODO:Make the efficient smooth changes
    public static boolean randomWindEfficient(){
        if(TK.get()) {
            TK.reset();
            return true;
        }
        return false;
    }//if the timekeeper is over,return ture



}
