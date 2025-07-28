package ukorandomadditionsmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod.EventHandler;
import net.minecraftforge.common.config.Configuration;
import ukorandomadditionsmod.crafting.WoolToString;
import ukorandomadditionsmod.crafting.WitherSkullRecipe;
import ukorandomadditionsmod.smelting.ZombieHeadToSkel;

import java.io.File;

@Mod(modid = URA.MODID, name = URA.NAME, version = URA.VERSION)
public class URA {
    public static final String MODID = "URA";
    public static final String NAME = "Uko's Random Additions";
    public static final String VERSION = "2.0";

    private static final String RECIPES_CATEGORY = "recipes";
    private static Configuration config;

    private static boolean enableWoolToString;
    private static boolean enableWitherSkullRecipe;
    private static boolean enableZombieHeadToSkel;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        File configFile = event.getSuggestedConfigurationFile();
        config = new Configuration(configFile);
        syncConfig();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        if (isWoolToStringEnabled()) {
            WoolToString.register();
        }
        if (isWitherSkullRecipeEnabled()) {
            WitherSkullRecipe.register();
        }
        if (isZombieHeadToSkelEnabled()) {
            ZombieHeadToSkel.register();
        }
    }

    public static void syncConfig() {
        enableWoolToString = config.get(RECIPES_CATEGORY, "Enable Wool to String", true).getBoolean(true);
        enableWitherSkullRecipe = config.get(RECIPES_CATEGORY, "Enable Wither Skull Recipe", true).getBoolean(true);
        enableZombieHeadToSkel = config.get(RECIPES_CATEGORY, "Enable Zombie Head to Skeleton", true).getBoolean(true);

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
}