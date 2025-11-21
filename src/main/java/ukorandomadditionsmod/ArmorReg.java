package ukorandomadditionsmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ukorandomadditionsmod.items.armor.Amberarmor;
import ukorandomadditionsmod.items.gems.Amber;
import ukorandomadditionsmod.items.armor.Rubyarmor;
import ukorandomadditionsmod.items.gems.Ruby;
import ukorandomadditionsmod.items.armor.Sapphirearmor;
import ukorandomadditionsmod.items.gems.Sapphire;

public class ArmorReg {

    public static Item amberHelmet;
    public static Item amberChestplate;
    public static Item amberLeggings;
    public static Item amberBoots;

    public static Item rubyHelmet;
    public static Item rubyChestplate;
    public static Item rubyLeggings;
    public static Item rubyBoots;

    public static Item sapphireHelmet;
    public static Item sapphireChestplate;
    public static Item sapphireLeggings;
    public static Item sapphireBoots;

    public static void preInit() {
        amberHelmet = new Amberarmor(Amber.AMBER, 1, 0);
        amberHelmet.setUnlocalizedName("amberHelmet");
        amberHelmet.setTextureName("ura:amber_helmet");
        GameRegistry.registerItem(amberHelmet, "amberHelmet");

        amberChestplate = new Amberarmor(Amber.AMBER, 1, 1);
        amberChestplate.setUnlocalizedName("amberChestplate");
        amberChestplate.setTextureName("ura:amber_chestplate");
        GameRegistry.registerItem(amberChestplate, "amberChestplate");

        amberLeggings = new Amberarmor(Amber.AMBER, 2, 2);
        amberLeggings.setUnlocalizedName("amberLeggings");
        amberLeggings.setTextureName("ura:amber_leggings");
        GameRegistry.registerItem(amberLeggings, "amberLeggings");

        amberBoots = new Amberarmor(Amber.AMBER, 1, 3);
        amberBoots.setUnlocalizedName("amberBoots");
        amberBoots.setTextureName("ura:amber_boots");
        GameRegistry.registerItem(amberBoots, "amberBoots");

        rubyHelmet = new Rubyarmor(Ruby.RUBY, 1, 0);
        rubyHelmet.setUnlocalizedName("rubyHelmet");
        rubyHelmet.setTextureName("ura:ruby_helmet");
        GameRegistry.registerItem(rubyHelmet, "rubyHelmet");

        rubyChestplate = new Rubyarmor(Ruby.RUBY, 1, 1);
        rubyChestplate.setUnlocalizedName("rubyChestplate");
        rubyChestplate.setTextureName("ura:ruby_chestplate");
        GameRegistry.registerItem(rubyChestplate, "rubyChestplate");

        rubyLeggings = new Rubyarmor(Ruby.RUBY, 2, 2);
        rubyLeggings.setUnlocalizedName("rubyLeggings");
        rubyLeggings.setTextureName("ura:ruby_leggings");
        GameRegistry.registerItem(rubyLeggings, "rubyLeggings");

        rubyBoots = new Rubyarmor(Ruby.RUBY, 1, 3);
        rubyBoots.setUnlocalizedName("rubyBoots");
        rubyBoots.setTextureName("ura:ruby_boots");
        GameRegistry.registerItem(rubyBoots, "rubyBoots");

        sapphireHelmet = new Sapphirearmor(Sapphire.SAPPHIRE, 1, 0);
        sapphireHelmet.setUnlocalizedName("sapphireHelmet");
        sapphireHelmet.setTextureName("ura:sapphire_helmet");
        GameRegistry.registerItem(sapphireHelmet, "sapphireHelmet");

        sapphireChestplate = new Sapphirearmor(Sapphire.SAPPHIRE, 1, 1);
        sapphireChestplate.setUnlocalizedName("sapphireChestplate");
        sapphireChestplate.setTextureName("ura:sapphire_chestplate");
        GameRegistry.registerItem(sapphireChestplate, "sapphireChestplate");

        sapphireLeggings = new Sapphirearmor(Sapphire.SAPPHIRE, 2, 2);
        sapphireLeggings.setUnlocalizedName("sapphireLeggings");
        sapphireLeggings.setTextureName("ura:sapphire_leggings");
        GameRegistry.registerItem(sapphireLeggings, "sapphireLeggings");

        sapphireBoots = new Sapphirearmor(Sapphire.SAPPHIRE, 1, 3);
        sapphireBoots.setUnlocalizedName("sapphireBoots");
        sapphireBoots.setTextureName("ura:sapphire_boots");
        GameRegistry.registerItem(sapphireBoots, "sapphireBoots");
    }
}
