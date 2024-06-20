package TheDecayMod.content;

import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.production.AttributeCrafter;

import static TheDecayMod.content.ModItem.emptyEnergyContainers;
import static mindustry.type.ItemStack.with;

public class ModBuilding {
    //load the blocks
    public static Block
            //producer
    energyContainerCreator,energyContainerCharger;

    public static void load(){
        energyContainerCreator=new AttributeCrafter("energy container creator")
        {{
            requirements(Category.crafting,with(Items.copper,60,Items.lead,30,Items.titanium,15));
            this.hasItems = true;
            this.hasLiquids = false;
            this.hasPower = true;
            this.itemCapacity = 20;
            //wait for editing
            this.craftEffect = Fx.smeltsmoke;
            this.outputItem = new ItemStack(emptyEnergyContainers,1);
            this.craftTime = 60f;
            this.size = 2;
            //wait for editing
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.06f;

            consumePower(1.60f);

        }};

    }
}
