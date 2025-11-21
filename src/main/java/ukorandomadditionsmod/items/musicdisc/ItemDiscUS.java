package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import ukorandomadditionsmod.URA;

public class ItemDiscUS extends ItemRecord {
    public ItemDiscUS() {
        super("ItemDiscUS");
        this.setUnlocalizedName("ItemDiscUS");
        this.setTextureName("ura:disc5");
        this.setCreativeTab(URA.URATab);
    }

    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_unwelcome_school");
    }
}