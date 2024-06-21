package TheDecayMod;

import TheDecayMod.content.ModBlocks;
import TheDecayMod.content.ModItem;
import arc.util.*;
import mindustry.mod.*;


public class DecayMain extends Mod{

    public DecayMain(){
        Log.info("Loaded TheDecayMod constructor.");}


    @Override
    public void loadContent(){
        Log.info("Loading some TheDecayMod content.");

        //load mod contents
        DecayRegistration.LoadingAllTheContents();

    }

}
