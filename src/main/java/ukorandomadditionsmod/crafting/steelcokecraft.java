package ukorandomadditionsmod.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ukorandomadditionsmod.GemsReg;
import cpw.mods.fml.common.registry.GameRegistry;

public class steelcokecraft {
    private steelcokecraft() {}

    public static void register() {
        GameRegistry.addRecipe(new ItemStack(GemsReg.STEELCOKE, 2),

            "AAA",
            "ACA",
            "AAA",
            'C', new ItemStack(net.minecraft.init.Items.iron_ingot),
            'A', new ItemStack(net.minecraft.init.Items.coal)
        );
    }

}
