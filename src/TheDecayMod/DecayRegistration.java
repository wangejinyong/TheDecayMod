package TheDecayMod;

import TheDecayMod.content.ModBlocks;
import TheDecayMod.content.ModItem;
import arc.util.Log;

public class DecayRegistration {
    public DecayRegistration()
    {
        Log.info("THE DECAY is Loading the contents...");
    }

    public static void LoadingAllTheContents()
    {
        ModItem.load();
        ModBlocks.load();
        Log.info("loading contents complete.");
    }
}
