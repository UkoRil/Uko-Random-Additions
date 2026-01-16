package ukorandomadditionsmod.items.gems;

import net.minecraft.item.*;
import ukorandomadditionsmod.URA;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Sapphire extends Item {
    public static final ItemArmor.ArmorMaterial SAPPHIRE =
        EnumHelper.addArmorMaterial("SAPPHIRE", 33, new int[]{3, 8, 6, 3}, 20);

    public Sapphire() {
        
        this.setUnlocalizedName("sapphire");
        this.setCreativeTab(URA.URATab);

        if (URA.enable32x32texture == true) {
            this.setTextureName("ura:sapphire");
        } else {
            this.setTextureName("ura:sapphire2");
        }
    }
}