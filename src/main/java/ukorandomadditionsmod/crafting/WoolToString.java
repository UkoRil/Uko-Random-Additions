package ukorandomadditionsmod.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class WoolToString {
    private WoolToString() {}

    public static void register() {
        // This recipe converts wool into string
        GameRegistry.addRecipe(new ItemStack(Items.string, 4), 
            "W", 
            'W', new ItemStack(Blocks.wool, 1, 0) // 0 is the metadata for white wool
        );
    }
}
