package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import ukorandomadditionsmod.URA;

public class ItemDiscMS extends ItemRecord {
    public ItemDiscMS() {
        super("ItemDiscMS");
        this.setUnlocalizedName("ItemDiscMS");
        this.setCreativeTab(URA.URATab);

        if (URA.enable32x32texture == true) {
            this.setTextureName("ura:disc3");
        } else {
            this.setTextureName("ura:disc3(2)");
        }
    }

    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_mischievous_step");
    }
}