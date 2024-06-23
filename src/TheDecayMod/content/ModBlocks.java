package TheDecayMod.content;

import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.power.ConsumeGenerator;
import mindustry.world.blocks.power.SolarGenerator;
import mindustry.world.blocks.production.GenericCrafter;


import static TheDecayMod.content.ModItem.*;

import static mindustry.type.ItemStack.with;

public class ModBlocks {

    //load the blocks
    public static Block
            //connection power
    energyContainerCreator,energyContainerCharger,energyContainerConsumer,
            //solar generator
    solarThermalCollector,largeSolarThermalCollector
            ;

    public static void load(){
        energyContainerCreator=new GenericCrafter("energy-container-creator")
        {{
            requirements(Category.crafting,with(Items.copper,40,Items.lead,25,Items.titanium,15));
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
            consumeItem(Items.copper,1);
            consumeItem(Items.lead,1);
        }};

        energyContainerConsumer=new ConsumeGenerator("energy-container-consumer")
        {{
            requirements(Category.power,with(Items.copper,40,Items.lead,25,Items.titanium,15));
            hasItems = true;
            hasLiquids = false;
            hasPower = true;
            itemCapacity = 20;
            //wait for editing
            generateEffect = Fx.generatespark;
            powerProduction = 8f;
            itemDuration = 120f;
            size = 2;
            //wait for editing
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.06f;

            consumeItem(fullEnergyContainers,1);

        }};

        energyContainerCharger=new GenericCrafter("energy-container-charger")
        {{
            requirements(Category.power,with(Items.copper,40,Items.lead,25,Items.titanium,15));
            hasItems = true;
            hasLiquids = false;
            hasPower = true;
            itemCapacity = 20;
            //wait for editing
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(fullEnergyContainers,1);
            craftTime = 120f;
            size = 2;
            //wait for editing
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.06f;

            consumePower(8.00f);
            consumeItem(emptyEnergyContainers,1);
        }};

        solarThermalCollector=new SolarGenerator("solar-thermal-collector")
        {{
            requirements(Category.power, with(Items.lead, 10, Items.metaglass, 15));
            powerProduction = 0.2f;
            size = 2;
            //can float on the water
            floating=true;
        }};

        largeSolarThermalCollector=new SolarGenerator("large-solar-thermal-collector")
        {{
            requirements(Category.power, with(Items.lead, 80, Items.metaglass, 115, Items.silicon, 10, Items.titanium,40));
            powerProduction = 0.2f;
            size = 3;
            floating=true;
        }};

    }
}
