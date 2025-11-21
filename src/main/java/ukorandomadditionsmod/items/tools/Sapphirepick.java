package ukorandomadditionsmod.items.tools;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.util.EnumHelper;
import ukorandomadditionsmod.GemsReg;
import ukorandomadditionsmod.URA;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;

public class Sapphirepick extends ItemPickaxe {

    public static final ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 3, 1561, 8.0F, 3.0F, 10);

    public Sapphirepick() {
        super(SAPPHIRE);
        this.setUnlocalizedName("sapphirepick");
        this.setCreativeTab(URA.URATab);
        this.setTextureName("ura:sapphirepick");
    }

    @Override
    public float func_150893_a(ItemStack stack, Block block) {
        return this.efficiencyOnProperMaterial;
    }

    @Override
    public boolean func_150897_b(Block block) {
        return block != Blocks.bedrock;
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