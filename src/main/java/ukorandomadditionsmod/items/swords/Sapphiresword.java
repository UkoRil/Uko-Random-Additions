package ukorandomadditionsmod.items.swords;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import ukorandomadditionsmod.URA;
import ukorandomadditionsmod.items.gems.Sapphire;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class Sapphiresword extends ItemSword {
    public static final ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial(
        "SAPPHIRE",
        1,
        1800,
        1.0F,
        4.0F,
        14
    );

    public Sapphiresword() {
        super(SAPPHIRE);
        this.setUnlocalizedName("sapphiresword");
        this.setCreativeTab(URA.URATab);
        this.setTextureName("ura:sapphiresword");
    }

    @Override
    public boolean func_150897_b(Block block) {
        return block != Blocks.bedrock && block != Blocks.obsidian;
    }

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
    if (entity instanceof EntityPlayer) {
        EntityPlayer player = (EntityPlayer) entity;

        if (selected) {
            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 40, 0, true));
        }
    }
}
}
