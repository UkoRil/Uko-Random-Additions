package ukorandomadditionsmod.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ukorandomadditionsmod.UItems;

public class Disc1Recipe {
    private Disc1Recipe() {
    }
    public static void register() {
        GameRegistry.addShapedRecipe(
            new ItemStack(UItems.DISC1),
            "DDD",
            "DWD",
            "DDD",
            'D', Items.diamond,
            'W', Items.record_ward
        );
    }
}