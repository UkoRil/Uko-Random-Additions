package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;

public class ItemDiscUS extends ItemRecord {
    public ItemDiscUS() {
        super("ba_unwelcome_school");
        this.setUnlocalizedName("ba_unwelcome_school");
        this.setTextureName("ura:disc5");
        this.setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabMisc);
    }

    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_unwelcome_school");
    }
}