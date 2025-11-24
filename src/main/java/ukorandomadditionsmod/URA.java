package ukorandomadditionsmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.config.Configuration;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

import ukorandomadditionsmod.crafting.WoolToString;
import ukorandomadditionsmod.crafting.mineitallmodulecraft;
import ukorandomadditionsmod.crafting.WitherSkullRecipe;
import ukorandomadditionsmod.smelting.ZombieHeadToSkel;
import ukorandomadditionsmod.crafting.GemBlockRecipes;
import ukorandomadditionsmod.crafting.armorrecipes;
import ukorandomadditionsmod.crafting.toolsrecipe;
import ukorandomadditionsmod.crafting.steelcokecraft;
import ukorandomadditionsmod.smelting.steelcoketosteelingot;

import java.io.File;

@Mod(modid = URA.MODID, name = URA.NAME, version = URA.VERSION)
public class URA {
    public static final String MODID = "ura";
    public static final String NAME = "Uko's Random Additions";
    public static final String VERSION = "3.0";

    public static final CreativeTabs URATab = new UraTab("uraTab");

    private static final String RECIPES_CATEGORY = "recipes";
    private static final String ITEMS_CATEGORY = "items";
    private static Configuration config;

    private static boolean enableWoolToString;
    private static boolean enableWitherSkullRecipe;
    private static boolean enableZombieHeadToSkel;
    private static boolean enableCustomDiscs;
    private static boolean enableCustomOres;
    private static boolean enablemineitallmodulecraft;
    private static boolean enablecraftingitems;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        File configFile = event.getSuggestedConfigurationFile();
        config = new Configuration(configFile);
        syncConfig();
        GameRegistry.registerWorldGenerator(new oreworldgen(), 0);
        if (isOresEnabled()) {
            GemsReg.preInit();
            blocksreg.preInit();
            ArmorReg.preInit();
        }
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        if (isDiscsEnabled()) {
            UItems.init();
            ukorandomadditionsmod.crafting.Disc1Recipe.register();
            ukorandomadditionsmod.crafting.Disc2Recipe.register();
            ukorandomadditionsmod.crafting.Disc3Recipe.register();
            ukorandomadditionsmod.crafting.Disc4Recipe.register();
            ukorandomadditionsmod.crafting.Disc5Recipe.register();
        }

        if (isWoolToStringEnabled()) {
            WoolToString.register();
        }
        if (isWitherSkullRecipeEnabled()) {
            WitherSkullRecipe.register();
        }
        if (isZombieHeadToSkelEnabled()) {
            ZombieHeadToSkel.register();
        }
        if (isenablecraftingitemsEnabled()) {
            mineitallmodulecraft.register();
            GemBlockRecipes.register();
            armorrecipes.register();
            toolsrecipe.register();
            steelcokecraft.register();
            steelcoketosteelingot.register();
        }
    }

    public static void syncConfig() {
        enableWoolToString = config.get(RECIPES_CATEGORY, "Enable Wool to String Crafting Recipe?", true).getBoolean(true);
        enablecraftingitems = config.get(RECIPES_CATEGORY, "Enable Mine It All Module Crafting Recipe?", true).getBoolean(true);
        enableWitherSkullRecipe = config.get(RECIPES_CATEGORY, "Enable Wither Skull Crafting Recipe?", true).getBoolean(true);
        enableZombieHeadToSkel = config.get(RECIPES_CATEGORY, "Enable Zombie Head to Skeleton Furnace Recipe?", true).getBoolean(true);
        enableCustomDiscs = config.get(RECIPES_CATEGORY, "Enable Custom Music Discs?", true).getBoolean(true);
        enableCustomOres = config.get(ITEMS_CATEGORY, "Enable Custom Ores?", true).getBoolean(true);

        if (config.hasChanged()) {
            config.save();
        }
    }

    public static boolean isWoolToStringEnabled() {
        return enableWoolToString;
    }
    public static boolean isWitherSkullRecipeEnabled() {
        return enableWitherSkullRecipe;
    }
    public static boolean isZombieHeadToSkelEnabled() {
        return enableZombieHeadToSkel;
    }
    public static boolean isDiscsEnabled() {
        return enableCustomDiscs;
    }
    public static boolean isOresEnabled() {
        return enableCustomOres;
    }
    public static boolean isenablecraftingitemsEnabled() {
        return enablecraftingitems;
    }
}