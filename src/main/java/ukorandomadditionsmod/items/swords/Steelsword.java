package ukorandomadditionsmod.items.swords;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import ukorandomadditionsmod.URA;

public class Steelsword extends ItemSword {

    public static final ToolMaterial STEEL = EnumHelper.addToolMaterial(
        "STEEL",
        1,
        750,
        1.0F,
        2.5F,
        12
    );

    public Steelsword() {
        super(STEEL);
        this.setUnlocalizedName("steelsword");
        this.setCreativeTab(URA.URATab);
        this.setTextureName("ura:steelsword");
    }

    @Override
    public boolean func_150897_b(Block block) {
        return block != Blocks.bedrock && block != Blocks.obsidian;
    }
}
