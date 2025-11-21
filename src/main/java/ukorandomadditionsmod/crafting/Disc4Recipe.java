package ukorandomadditionsmod.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ukorandomadditionsmod.UItems;

public class Disc4Recipe {
    private Disc4Recipe() {
    }
    public static void register() {
        GameRegistry.addShapedRecipe(
            new ItemStack(UItems.DISC4),
            "DDD",
            "DWD",
            "DDD",
            'D', Items.redstone,
            'W', Items.record_11
        );
    }
}