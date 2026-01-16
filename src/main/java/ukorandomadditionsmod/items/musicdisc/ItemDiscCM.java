package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import ukorandomadditionsmod.URA;

public class ItemDiscCM extends ItemRecord {
    public ItemDiscCM() {
        super("ItemDiscCM");
        this.setUnlocalizedName("ItemDiscCM");
        this.setCreativeTab(URA.URATab);

        if (URA.enable32x32texture == true) {
            this.setTextureName("ura:disc1");
        } else {
            this.setTextureName("ura:disc1(2)");
        }
    }

    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_constant_moderato");
    }
}