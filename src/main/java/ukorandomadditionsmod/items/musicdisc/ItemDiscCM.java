package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import ukorandomadditionsmod.URA;

public class ItemDiscCM extends ItemRecord {
    public ItemDiscCM() {
        super("ItemDiscCM");
        this.setUnlocalizedName("ItemDiscCM");
        this.setTextureName("ura:disc1");
        this.setCreativeTab(URA.URATab);
    }

    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_constant_moderato");
    }
}