package ukorandomadditionsmod.items.gems;

import net.minecraft.item.*;
import ukorandomadditionsmod.URA;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Amber extends Item {
    public static final ItemArmor.ArmorMaterial AMBER =
        EnumHelper.addArmorMaterial("AMBER", 33, new int[]{2, 6, 5, 2}, 15);
        
    public Amber() {

        this.setUnlocalizedName("amber");
        this.setTextureName("ura:amber");
        this.setCreativeTab(URA.URATab);
    }
}