package ukorandomadditionsmod.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class WitherSkullRecipe {
    private WitherSkullRecipe() {}

    public static void register() {
        
        // for items like skull which doesn't use metadata for this version, it's set like this item.example, 1, 1
        // look up minecraft 1.7.10 item data for more details
        // metadata 1 = Wither Skeleton Skull
        GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 1),

        // this is the recipe pattern for crafiing, this is a set pattern, use shapeless if you want to use any pattern
        // also this is changeable, use different variations as you like
        // for items that works like the skulls, use new itemstack(name, num, num)
            "DSD",
            "OKO",
            "DSD",
            'D', Blocks.diamond_block,
            'S', Blocks.soul_sand,
            'O', Blocks.obsidian,
            'K', new ItemStack(Items.skull,1,0)
        );
    }
}