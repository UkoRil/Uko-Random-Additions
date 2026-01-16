package ukorandomadditionsmod.items.gems;

import net.minecraft.item.*;
import ukorandomadditionsmod.URA;

public class Steel extends Item {
    public Steel() {
        
        this.setUnlocalizedName("steel");
        this.setCreativeTab(URA.URATab);

        if (URA.enable32x32texture == true) {
            this.setTextureName("ura:steel");
        } else {
            this.setTextureName("ura:steel2");
        }
    }
}