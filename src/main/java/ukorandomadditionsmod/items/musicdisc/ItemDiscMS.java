package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import ukorandomadditionsmod.URA;

public class ItemDiscMS extends ItemRecord {
    public ItemDiscMS() {
        super("ItemDiscMS");
        this.setUnlocalizedName("ItemDiscMS");
        this.setTextureName("ura:disc3");
        this.setCreativeTab(URA.URATab);
    }

    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_mischievous_step");
    }
}