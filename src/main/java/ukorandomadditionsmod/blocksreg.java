package ukorandomadditionsmod;

import cpw.mods.fml.common.registry.GameRegistry;
import ukorandomadditionsmod.items.blocks.BlockRuby;
import ukorandomadditionsmod.items.blocks.BlockAmber;
import ukorandomadditionsmod.items.blocks.BlockSteel;
import ukorandomadditionsmod.items.blocks.BlockSapphire;
import ukorandomadditionsmod.items.blocks.BlockAmberOre;
import ukorandomadditionsmod.items.blocks.BlockRubyOre;
import ukorandomadditionsmod.items.blocks.BlockSapphireOre;
import net.minecraft.block.Block;

public class blocksreg {
    public static final Block RUBYBLOCK = new BlockRuby();
    public static final Block AMBERBLOCK = new BlockAmber();
    public static final Block STEELBLOCK = new BlockSteel();
    public static final Block SAPPHIREBLOCK = new BlockSapphire();
    public static final Block AMBERORE = new BlockAmberOre();
    public static final Block RUBYORE = new BlockRubyOre();
    public static final Block SAPPHIREORE = new BlockSapphireOre();

    private blocksreg() {}

    public static void preInit() {
        GameRegistry.registerBlock(RUBYBLOCK, "BlockRuby");
        GameRegistry.registerBlock(AMBERBLOCK, "BlockAmber");
        GameRegistry.registerBlock(STEELBLOCK, "BlockSteel");
        GameRegistry.registerBlock(SAPPHIREBLOCK, "BlockSapphire");
        GameRegistry.registerBlock(AMBERORE, "BlockAmberOre");
        GameRegistry.registerBlock(RUBYORE, "BlockRubyOre");
        GameRegistry.registerBlock(SAPPHIREORE, "BlockSapphireOre");
    }
}
