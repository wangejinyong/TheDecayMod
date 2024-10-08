package TheDecayMod.content;

import TheDecayMod.power.WaveGenerator;
import TheDecayMod.power.WindGenerator;
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
    solarThermalCollector,largeSolarThermalCollector,
            //wind generator
    windGenerator,
            //floor generator
    waveAndTidalGenerator
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
            requirements(Category.power, with(Items.lead, 80, Items.metaglass, 110, Items.silicon, 10, Items.titanium,10));
            powerProduction = 1.4f;
            size = 3;
            floating=true;
        }};

        windGenerator=new WindGenerator("wind-generator")
        {{
            requirements(Category.power, with(Items.copper,15,Items.lead, 15));
            powerProduction = 0.1f;
            size = 2;
            floating=true;
        }};


        waveAndTidalGenerator=new WaveGenerator("wave-and-tidal-generator")
        {{
            requirements(Category.power, with(Items.copper, 20, Items.lead, 15, Items.graphite, 10, Items.silicon, 10, Items.metaglass, 20));
            powerProduction = 0.3f;
            size = 5;
            floating = true;
            ambientSound = Sounds.hum;
            ambientSoundVolume = 0.06f;
            //dislike the water extractor,change the attribute.
            //attribute= Attribute.water;
        }};



    }
}
