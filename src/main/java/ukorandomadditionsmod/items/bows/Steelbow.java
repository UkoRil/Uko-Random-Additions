package ukorandomadditionsmod.items.bows;

import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.item.EnumAction;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ukorandomadditionsmod.URA;

public class Steelbow extends ItemBow {

    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public Steelbow() {
        this.setUnlocalizedName("steelbow");
        this.setCreativeTab(URA.URATab);
    }

    @Override
    public int getItemEnchantability() {
        return 14;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining) {
        if (player.getItemInUse() == null) return this.itemIcon;

        int drawTime = stack.getMaxItemUseDuration() - useRemaining;

        if (drawTime >= 18) return icons[2];
        if (drawTime > 13) return icons[1];
        if (drawTime > 0) return icons[0];

        return this.itemIcon;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.bow;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 72000;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
        return stack;
    }

    @Override
    public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int timeLeft) {
        super.onPlayerStoppedUsing(stack, world, player, timeLeft);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(URA.MODID + ":" + "steelbow");
        this.icons = new IIcon[3];

        this.icons[0] = iconRegister.registerIcon(URA.MODID + ":" + "steelbow");
        this.icons[1] = iconRegister.registerIcon(URA.MODID + ":" + "steelbowdraw1");
        this.icons[2] = iconRegister.registerIcon(URA.MODID + ":" + "steelbowdrawfull");
    }
}
