package TheDecayMod.content;

import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.power.ConsumeGenerator;
import mindustry.world.blocks.production.AttributeCrafter;

import static TheDecayMod.content.ModItem.emptyEnergyContainers;
import static mindustry.type.ItemStack.with;

public class ModBlocks {

    //load the blocks
    public static Block
            //producer
    energyContainerCreator,energyContainerCharger,energyContainerConsumer
            ;

    public static void load(){
        energyContainerCreator=new AttributeCrafter("energy container creator")
        {{
            requirements(Category.crafting,with(Items.copper,60,Items.lead,30,Items.titanium,15));
            hasItems = true;
            hasLiquids = false;
            hasPower = true;
            itemCapacity = 20;
            //wait for editing
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(emptyEnergyContainers,1);
            craftTime = 60f;
            size = 2;
            //wait for editing
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.06f;

            consumePower(1.60f);
        }};

        energyContainerConsumer=new ConsumeGenerator("energy container consumer")
        {{
            requirements(Category.power,with(Items.copper,60,Items.lead,30,Items.titanium,15));
            hasItems = true;
            hasLiquids = false;
            hasPower = true;
            itemCapacity = 20;
            //wait for editing
            generateEffect = Fx.generatespark;
            powerProduction = 2f;
            itemDuration = 60f;
            size = 2;
            //wait for editing
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.06f;

        }};

    }
}
