package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import ukorandomadditionsmod.URA;

public class ItemDiscHoneyJam extends ItemRecord {
    public ItemDiscHoneyJam() {
        super("ItemDiscHoneyJam");
        this.setUnlocalizedName("ItemDiscHoneyJam");
        this.setTextureName("ura:disc2");
        this.setCreativeTab(URA.URATab);
    }

    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_honey_jam");
    }
}