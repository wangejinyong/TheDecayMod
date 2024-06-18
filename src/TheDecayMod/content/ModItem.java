package TheDecayMod.content;

import mindustry.type.Item;

public class ModItem {

    //load mod items

    //this function can add item unlimitedly
    public static Item
    energyContainers;

    //load the item we want to add
    public static void load(){
        energyContainers = new Item("energy containers")
        {{
            explosiveness = 0.5f;
            flammability = 0.3f;
            radioactivity = 0f;
            buildable = true;//if true, it won't be destroyed;
            hidden = false;
        }};

        //waiting for adding

    }
}
