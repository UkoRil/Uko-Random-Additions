package ukorandomadditionsmod.items;

import ukorandomadditionsmod.URA;
import net.minecraft.item.Item;
import ukorandomadditionsmod.URA;
import net.minecraft.item.*;

public class Mineitallmodule extends Item {
    public Mineitallmodule() {
        this.setUnlocalizedName("mineitallmodule");
        this.setCreativeTab(URA.URATab);

        if (URA.enable32x32texture == true) {
            this.setTextureName("ura:mineitallmodule");
        } else {
            this.setTextureName("ura:mineitallmodule2");
        }
    }
}
