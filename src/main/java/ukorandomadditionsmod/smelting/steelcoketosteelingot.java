package ukorandomadditionsmod.smelting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import ukorandomadditionsmod.items.gems.Steel;
import ukorandomadditionsmod.items.steelcoke;
import ukorandomadditionsmod.GemsReg;

public class steelcoketosteelingot {
    public static void register() {
        ItemStack input = new ItemStack(GemsReg.STEELCOKE, 1);
        
        ItemStack output = new ItemStack(GemsReg.STEEL, 1);
        float xp = 0.5F;

        FurnaceRecipes.smelting().func_151394_a(input, output, xp);
    }
}
