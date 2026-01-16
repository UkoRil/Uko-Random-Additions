package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import ukorandomadditionsmod.URA;

public class ItemDiscHoneyJam extends ItemRecord {
    public ItemDiscHoneyJam() {
        super("ItemDiscHoneyJam");
        this.setUnlocalizedName("ItemDiscHoneyJam");
        this.setCreativeTab(URA.URATab);

        if (URA.enable32x32texture == true) {
            this.setTextureName("ura:disc2");
        } else {
            this.setTextureName("ura:disc2(2)");
        }
    }

    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_honey_jam");
    }
}