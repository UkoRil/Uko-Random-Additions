package ukorandomadditionsmod.items.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ukorandomadditionsmod.URA;

public class BlockRuby extends Block {

    @SideOnly(Side.CLIENT)
    private IIcon topIcon;
    @SideOnly(Side.CLIENT)
    private IIcon bottomIcon;
    @SideOnly(Side.CLIENT)
    private IIcon sideIcon;

    public BlockRuby() {
        super(Material.iron);
        this.setCreativeTab(URA.URATab);
        this.setBlockName("rubyblock");
        this.setHardness(16.0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(net.minecraft.client.renderer.texture.IIconRegister reg) {
        this.topIcon = reg.registerIcon(URA.MODID + ":" + (URA.enable32x32texture ? "rubyblock" : "rubyblock2"));
    this.bottomIcon = reg.registerIcon(URA.MODID + ":" + (URA.enable32x32texture ? "rubyblockbot" : "rubyblockbot2"));
    this.sideIcon = reg.registerIcon(URA.MODID + ":" + (URA.enable32x32texture ? "rubyblockside" : "rubyblockside2"));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side == 0) return bottomIcon; // bottom
        if (side == 1) return topIcon;    // top
        return sideIcon;                  // sides
    }
}
