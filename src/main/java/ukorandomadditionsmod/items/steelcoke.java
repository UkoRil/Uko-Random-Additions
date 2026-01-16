package ukorandomadditionsmod.items;

import net.minecraft.item.*;
import ukorandomadditionsmod.URA;
import net.minecraft.item.Item;

public class steelcoke extends Item {
    public steelcoke() {

        this.setUnlocalizedName("steelcoke");
        this.setCreativeTab(URA.URATab);

        if (URA.enable32x32texture == true) {
            this.setTextureName("ura:steelcoke");
        } else {
            this.setTextureName("ura:steelcoke2");
        }
    }
}