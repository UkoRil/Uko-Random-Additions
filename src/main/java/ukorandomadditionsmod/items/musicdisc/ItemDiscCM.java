package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;

public class ItemDiscCM extends ItemRecord {
    public ItemDiscCM() {
        super("ba_constant_moderato");
        this.setUnlocalizedName("ba_constant_moderato");
        this.setTextureName("ura:disc1");
        this.setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabMisc);
    }

    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_constant_moderato");
    }
}