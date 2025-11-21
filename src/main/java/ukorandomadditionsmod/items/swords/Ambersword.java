package ukorandomadditionsmod.items.swords;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import ukorandomadditionsmod.URA;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class Ambersword extends ItemSword {
    public static final ToolMaterial AMBER = EnumHelper.addToolMaterial(
        "AMBER",
        1,          // harvest level
        1800,       // durable
        1.0F,       // Efficiency (not used for swords, so doesn't matter)
        4.0F,       // damage
        14          // enchantability
    );

    public Ambersword() {
        super(AMBER);
        this.setUnlocalizedName("ambersword");
        this.setCreativeTab(URA.URATab);
        this.setTextureName("ura:ambersword");
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
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 40, 0, true));
        }
    }
}
}
