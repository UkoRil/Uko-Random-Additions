package ukorandomadditionsmod.smelting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ZombieHeadToSkel {
    private ZombieHeadToSkel() {}

    public static void register() {
        ItemStack input = new ItemStack(Items.skull, 1, 2); // 2 = Zombie Head
        
        ItemStack output = new ItemStack(Items.skull, 1, 0); // 0 = Skeleton Head
        float xp = 0.5F;

        FurnaceRecipes.smelting().func_151394_a(input, output, xp);
    }
}