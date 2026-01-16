package ukorandomadditionsmod.items.musicdisc;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import ukorandomadditionsmod.URA;

public class ItemDiscSG extends ItemRecord {
    public ItemDiscSG() {
        super("ItemDiscSG");
        this.setUnlocalizedName("ItemDiscSG");
        this.setCreativeTab(URA.URATab);

        if (URA.enable32x32texture == true) {
            this.setTextureName("ura:disc4");
        } else {
            this.setTextureName("ura:disc4(2)");
        }
    }
    
    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation("ura:music.ba_shady_girls");
    }
}