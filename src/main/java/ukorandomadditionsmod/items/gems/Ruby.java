package ukorandomadditionsmod.items.gems;

import net.minecraft.item.*;
import ukorandomadditionsmod.URA;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Ruby extends Item {
    public static final ItemArmor.ArmorMaterial RUBY =
        EnumHelper.addArmorMaterial("RUBY", 33, new int[]{3, 8, 6, 3}, 20);
        
    public Ruby() {
        
        this.setUnlocalizedName("ruby");
        this.setTextureName("ura:ruby");
        this.setCreativeTab(URA.URATab);
    }
}