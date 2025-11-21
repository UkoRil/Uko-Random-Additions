package ukorandomadditionsmod.items.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import ukorandomadditionsmod.items.gems.Sapphire;
import ukorandomadditionsmod.GemsReg;
import ukorandomadditionsmod.URA;

public class BlockSapphireOre extends Block {

    public BlockSapphireOre() {
        super(Material.rock);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeStone);
        this.setBlockName("sapphireOre");
        this.setBlockTextureName("ura:sapphireore");
        this.setCreativeTab(URA.URATab);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return GemsReg.SAPPHIRE;
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        int bonus = fortune > 0 ? random.nextInt(fortune + 1) : 0;
        return this.quantityDropped(random) + bonus;
    }
}
