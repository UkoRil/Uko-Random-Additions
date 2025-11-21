package ukorandomadditionsmod.crafting;

import net.minecraft.item.ItemStack;
import ukorandomadditionsmod.GemsReg;
import ukorandomadditionsmod.blocksreg;
import cpw.mods.fml.common.registry.GameRegistry;
import ukorandomadditionsmod.items.gems.Amber;
import ukorandomadditionsmod.items.gems.Ruby;
import ukorandomadditionsmod.items.gems.Sapphire;
import ukorandomadditionsmod.items.gems.Steel;

public class GemBlockRecipes {

    private GemBlockRecipes() {}

    public static void register() {
        GameRegistry.addRecipe(new ItemStack(blocksreg.RUBYBLOCK, 1),
                "RRR",
                "RRR",
                "RRR",
                'R', new ItemStack(GemsReg.RUBY));

        GameRegistry.addRecipe(new ItemStack(blocksreg.STEELBLOCK, 1),
                "SSS",
                "SSS",
                "SSS",
                'S', new ItemStack(GemsReg.STEEL));

        GameRegistry.addRecipe(new ItemStack(blocksreg.SAPPHIREBLOCK, 1),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(GemsReg.SAPPHIRE));

        GameRegistry.addRecipe(new ItemStack(blocksreg.AMBERBLOCK, 1),
                "BBB",
                "BBB",
                "BBB",
                'B', new ItemStack(GemsReg.AMBER));
    }
}
