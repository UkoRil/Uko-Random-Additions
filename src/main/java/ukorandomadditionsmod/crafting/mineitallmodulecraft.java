package ukorandomadditionsmod.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ukorandomadditionsmod.GemsReg;
import cpw.mods.fml.common.registry.GameRegistry;

public class mineitallmodulecraft {
    private mineitallmodulecraft() {}

    public static void register() {
        GameRegistry.addRecipe(new ItemStack(GemsReg.MINEITALLMODULE, 1),

            "OSO",
            "OMO",
            "OSO",
            'M', new ItemStack(Items.diamond_pickaxe),
            'O', new ItemStack(GemsReg.STEEL),
            'S', new ItemStack(Items.iron_ingot)
        );
    }
}