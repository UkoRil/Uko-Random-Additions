package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;

public class ItemDiscMS extends ItemRecord {
    public ItemDiscMS() {
        super("ba_mischievous_step");
        this.setUnlocalizedName("ba_mischievous_step");
        this.setTextureName("ura:disc3");
        this.setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabMisc);
    }

    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_mischievous_step");
    }
}