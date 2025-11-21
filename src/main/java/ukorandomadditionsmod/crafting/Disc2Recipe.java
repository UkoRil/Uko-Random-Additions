package ukorandomadditionsmod.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ukorandomadditionsmod.UItems;

public class Disc2Recipe {
    private Disc2Recipe() {
    }
    public static void register() {
        GameRegistry.addShapedRecipe(
            new ItemStack(UItems.DISC2),
            "DDD",
            "DWD",
            "DDD",
            'D', Items.coal,
            'W', Items.record_stal
        );
    }
}