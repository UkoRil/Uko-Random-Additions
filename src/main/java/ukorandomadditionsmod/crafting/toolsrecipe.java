package ukorandomadditionsmod.crafting;

import net.minecraft.item.ItemStack;
import ukorandomadditionsmod.GemsReg;
import cpw.mods.fml.common.registry.GameRegistry;

public class toolsrecipe {
    private toolsrecipe() {}

    public static void register() {
        GameRegistry.addRecipe(new ItemStack(GemsReg.STEELBOW, 1),
                " AD",
                "A O",
                " AD",
                'A', new ItemStack(GemsReg.STEEL),
                'D', new ItemStack(net.minecraft.init.Items.iron_ingot),
                'O', new ItemStack(net.minecraft.init.Items.string)
        );

        GameRegistry.addRecipe(new ItemStack(GemsReg.STEELPICK, 1),
                "ADA",
                " S ",
                " S ",
                'A', new ItemStack(GemsReg.STEEL),
                'S', new ItemStack(net.minecraft.init.Items.stick),
                'D', new ItemStack(GemsReg.MINEITALLMODULE)
        );

        GameRegistry.addRecipe(new ItemStack(GemsReg.STEELSWORD, 1),
                " A ",
                " A ",
                " S ",
                'A', new ItemStack(GemsReg.STEEL),
                'S', new ItemStack(net.minecraft.init.Items.stick)
        );

        GameRegistry.addRecipe(new ItemStack(GemsReg.RUBYPICK, 1),
                "ADA",
                " S ",
                " S ",
                'A', new ItemStack(GemsReg.RUBY),
                'S', new ItemStack(net.minecraft.init.Items.stick),
                'D', new ItemStack(GemsReg.MINEITALLMODULE)
        );

        GameRegistry.addRecipe(new ItemStack(GemsReg.RUBYSWORD, 1),
                " A ",
                " A ",
                " S ",
                'A', new ItemStack(GemsReg.RUBY),
                'S', new ItemStack(net.minecraft.init.Items.stick)
        );

        GameRegistry.addRecipe(new ItemStack(GemsReg.SAPPHIREPICK, 1),
                "ADA",
                " S ",
                " S ",
                'A', new ItemStack(GemsReg.SAPPHIRE),
                'S', new ItemStack(net.minecraft.init.Items.stick),
                'D', new ItemStack(GemsReg.MINEITALLMODULE)
        );

        GameRegistry.addRecipe(new ItemStack(GemsReg.SAPPHIRESWORD, 1),
                " A ",
                " A ",
                " S ",
                'A', new ItemStack(GemsReg.SAPPHIRE),
                'S', new ItemStack(net.minecraft.init.Items.stick)
        );

        GameRegistry.addRecipe(new ItemStack(GemsReg.AMBERPICK, 1),
                "ADA",
                " S ",
                " S ",
                'A', new ItemStack(GemsReg.AMBER),
                'S', new ItemStack(net.minecraft.init.Items.stick),
                'D', new ItemStack(GemsReg.MINEITALLMODULE)
        );

        GameRegistry.addRecipe(new ItemStack(GemsReg.AMBERSWORD, 1),
                " A ",
                " A ",
                " S ",
                'A', new ItemStack(GemsReg.AMBER),
                'S', new ItemStack(net.minecraft.init.Items.stick)
        );
    }
}
