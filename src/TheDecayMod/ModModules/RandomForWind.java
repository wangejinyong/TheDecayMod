package TheDecayMod.ModModules;

import java.util.Random;


public class RandomForWind {
    public static float windMultiply = 0f;

    public static float randomWindMultiply(){
        Random randW = new Random();
        windMultiply = randW.nextFloat() + 1f;
        return windMultiply;
    }
}
