package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import ukorandomadditionsmod.URA;

public class ItemDiscSG extends ItemRecord {
    public ItemDiscSG() {
        super("ItemDiscSG");
        this.setUnlocalizedName("ItemDiscSG");
        this.setTextureName("ura:disc4");
        this.setCreativeTab(URA.URATab);
    }
    
    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_shady_girls");
    }
}