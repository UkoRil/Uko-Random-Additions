package ukorandomadditionsmod.items.armor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ukorandomadditionsmod.URA;
import ukorandomadditionsmod.items.armor.Amberarmor;

public class Sapphirearmor extends ItemArmor {

    public Sapphirearmor(ItemArmor.ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        setCreativeTab(URA.URATab);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity player, int slot, String type) {
        if (this.armorType == 2) {
            return "ura:textures/models/armor/sapphire_layer_2.png";
        } else {
            return "ura:textures/models/armor/sapphire_layer_1.png";
        }
    }

    @Override
public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
    if (!world.isRemote) {
        ItemStack helmet = player.getCurrentArmor(3);
        ItemStack chest = player.getCurrentArmor(2);
        ItemStack legs = player.getCurrentArmor(1);
        ItemStack boots = player.getCurrentArmor(0);

        if (helmet != null && chest != null &&
            helmet.getItem() instanceof Sapphirearmor &&
            chest.getItem() instanceof Sapphirearmor) {
            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 40, 0, true));
        }

        if (legs != null && boots != null &&
            legs.getItem() instanceof Sapphirearmor &&
            boots.getItem() instanceof Sapphirearmor) {
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 40, 0, true));
        }
    }
}
}
