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
        this.setTextureName("ura:sapphire");
        this.setCreativeTab(URA.URATab);
    }
}