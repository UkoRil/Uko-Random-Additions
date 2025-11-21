package ukorandomadditionsmod.crafting;

import net.minecraft.item.ItemStack;
import ukorandomadditionsmod.ArmorReg;
import ukorandomadditionsmod.GemsReg;
import cpw.mods.fml.common.registry.GameRegistry;

public class armorrecipes {

    private armorrecipes() {}

    public static void register() {
        GameRegistry.addRecipe(new ItemStack(ArmorReg.amberHelmet, 1),
                "RRR",
                "R R",
                'R', new ItemStack(GemsReg.AMBER)
        );

        GameRegistry.addRecipe(new ItemStack(ArmorReg.amberChestplate, 1),
                "R R",
                "RRR",
                "RRR",
                'R', new ItemStack(GemsReg.AMBER)
        );

        GameRegistry.addRecipe(new ItemStack(ArmorReg.amberLeggings, 1),
                "RRR",
                "R R",
                "R R",
                'R', new ItemStack(GemsReg.AMBER)
        );

        GameRegistry.addRecipe(new ItemStack(ArmorReg.amberBoots, 1),
                "R R",
                "R R",
                'R', new ItemStack(GemsReg.AMBER)
        );

        GameRegistry.addRecipe(new ItemStack(ArmorReg.rubyHelmet, 1),
                "RRR",
                "R R",
                'R', new ItemStack(GemsReg.RUBY)
        );

        GameRegistry.addRecipe(new ItemStack(ArmorReg.rubyChestplate, 1),
                "R R",
                "RRR",
                "RRR",
                'R', new ItemStack(GemsReg.RUBY)
        );

        GameRegistry.addRecipe(new ItemStack(ArmorReg.rubyLeggings, 1),
                "RRR",
                "R R",
                "R R",
                'R', new ItemStack(GemsReg.RUBY)
        );

        GameRegistry.addRecipe(new ItemStack(ArmorReg.rubyBoots, 1),
                "R R",
                "R R",
                'R', new ItemStack(GemsReg.RUBY)
        );

        GameRegistry.addRecipe(new ItemStack(ArmorReg.sapphireHelmet, 1),
                "RRR",
                "R R",
                'R', new ItemStack(GemsReg.SAPPHIRE)
        );

        GameRegistry.addRecipe(new ItemStack(ArmorReg.sapphireChestplate, 1),
                "R R",
                "RRR",
                "RRR",
                'R', new ItemStack(GemsReg.SAPPHIRE)
        );

        GameRegistry.addRecipe(new ItemStack(ArmorReg.sapphireLeggings, 1),
                "RRR",
                "R R",
                "R R",
                'R', new ItemStack(GemsReg.SAPPHIRE)
        );

        GameRegistry.addRecipe(new ItemStack(ArmorReg.sapphireBoots, 1),
                "R R",
                "R R",
                'R', new ItemStack(GemsReg.SAPPHIRE)
        );
    }
}
