package ukorandomadditionsmod.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ukorandomadditionsmod.UItems;

public class Disc5Recipe {
    private Disc5Recipe() {
    }
    public static void register() {
        GameRegistry.addShapedRecipe(
            new ItemStack(UItems.DISC5),
            "DDD",
            "DWD",
            "DDD",
            'D', Items.gold_ingot,
            'W', Items.record_11
        );
    }
}