package ukorandomadditionsmod.items.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ukorandomadditionsmod.URA;

public class BlockSteel extends Block {

    @SideOnly(Side.CLIENT)
    private IIcon topIcon;
    @SideOnly(Side.CLIENT)
    private IIcon bottomIcon;
    @SideOnly(Side.CLIENT)
    private IIcon sideIcon;

    public BlockSteel() {
        super(Material.iron);
        this.setCreativeTab(URA.URATab);
        this.setBlockName("steelblock");
        this.setHardness(16.0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(net.minecraft.client.renderer.texture.IIconRegister reg) {
        this.topIcon = reg.registerIcon(URA.MODID + ":" + (URA.enable32x32texture ? "steelblock" : "steelblock2"));
    this.bottomIcon = reg.registerIcon(URA.MODID + ":" + (URA.enable32x32texture ? "steelblockbot" : "steelblockbot2"));
    this.sideIcon = reg.registerIcon(URA.MODID + ":" + (URA.enable32x32texture ? "steelblockside" : "steelblockside2"));
    }

        @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side == 0) return bottomIcon;
        if (side == 1) return topIcon;
        return sideIcon;
    }
}