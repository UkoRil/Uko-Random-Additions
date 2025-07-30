package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;

public class ItemDiscHoneyJam extends ItemRecord {
    public ItemDiscHoneyJam() {
        super("ba_hone_yjam");
        this.setUnlocalizedName("ba_honey_jam");
        this.setTextureName("ura:disc2");
        this.setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabMisc);
    }

    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_honey_jam");
    }
}