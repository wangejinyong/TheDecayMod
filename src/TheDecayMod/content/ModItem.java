package TheDecayMod.content;

import mindustry.type.Item;

public class ModItem {

    //load mod items

    //this function can add item unlimitedly
    public static Item
            emptyEnergyContainers,
            fullEnergyContainers;

    //load the item we want to add
    public static void load(){

        emptyEnergyContainers = new Item("empty energy containers")
        {{
            this.buildable = false;
            this.hidden = false;
        }};
        fullEnergyContainers = new Item("full energy containers")
        {{
            this.explosiveness = 0.5f;
            this.flammability = 0.3f;
            this.buildable = true;//if true, it won't be destroyed;
            this.hidden = false;
        }};


        //waiting for adding

    }
}
