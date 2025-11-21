package ukorandomadditionsmod.items.tools;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.util.EnumHelper;
import ukorandomadditionsmod.URA;

public class Steelpick extends ItemPickaxe {

    public static final ToolMaterial STEEL = EnumHelper.addToolMaterial("Steel", 3, 800, 7.0F, 2.5F, 12);

    public Steelpick() {
        super(STEEL);
        this.setUnlocalizedName("steelpick");
        this.setCreativeTab(URA.URATab);
        this.setTextureName("ura:steelpick");
    }

    @Override
    public float func_150893_a(ItemStack stack, Block block) {
        if (block == Blocks.stone || block == Blocks.cobblestone) {
            return this.efficiencyOnProperMaterial + 9.0f;
        } else {
            return this.efficiencyOnProperMaterial;
        }
    }

    @Override
    public boolean func_150897_b(Block block) {
        return block != Blocks.bedrock && block != Blocks.obsidian;
    }
}