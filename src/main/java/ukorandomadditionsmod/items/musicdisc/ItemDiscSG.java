package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;

public class ItemDiscSG extends ItemRecord {
    public ItemDiscSG() {
        super("ba_shady_girls");
        this.setUnlocalizedName("ba_shady_girls");
        this.setTextureName("ura:disc4");
        this.setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabMisc);
    }

    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_shady_girls");
    }
}