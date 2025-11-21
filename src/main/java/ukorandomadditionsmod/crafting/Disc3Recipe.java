package ukorandomadditionsmod.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ukorandomadditionsmod.UItems;

public class Disc3Recipe {
    private Disc3Recipe() {
    }
    public static void register() {
        GameRegistry.addShapedRecipe(
            new ItemStack(UItems.DISC3),
            "DDD",
            "DWD",
            "DDD",
            'D', Items.emerald,
            'W', Items.record_strad
        );
    }
}