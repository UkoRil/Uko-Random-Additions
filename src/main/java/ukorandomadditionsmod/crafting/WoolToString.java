package ukorandomadditionsmod.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class WoolToString {
    private WoolToString() {}

    public static void register() {
        for (int meta = 0; meta < 16; meta++) {
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 2), new ItemStack(Blocks.wool, 1, meta));
        }
    }
}
