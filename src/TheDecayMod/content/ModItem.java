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

        emptyEnergyContainers = new Item("empty-energy-container")
        {{
            this.buildable = false;
            this.hidden = false;
        }};
        fullEnergyContainers = new Item("full-energy-container")
        {{
            this.explosiveness = 0.1f;
            this.flammability = 0.2f;
            this.buildable = true;//if true, it won't be destroyed;
            this.hidden = false;
        }};


        //waiting for adding

    }
}
