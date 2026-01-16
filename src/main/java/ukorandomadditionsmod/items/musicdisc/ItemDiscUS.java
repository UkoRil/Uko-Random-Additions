package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import ukorandomadditionsmod.URA;

public class ItemDiscUS extends ItemRecord {
    public ItemDiscUS() {
        super("ItemDiscUS");
        this.setUnlocalizedName("ItemDiscUS");
        this.setCreativeTab(URA.URATab);

        if (URA.enable32x32texture == true) {
            this.setTextureName("ura:disc5");
        } else {
            this.setTextureName("ura:disc5(2)");
        }
    }

    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_unwelcome_school");
    }
}