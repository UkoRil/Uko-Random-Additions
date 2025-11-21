package ukorandomadditionsmod;

import java.util.Random;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import ukorandomadditionsmod.blocksreg;

public class oreworldgen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        switch (world.provider.dimensionId) {
            case 0:
                generateOre(blocksreg.AMBERORE, world, random, chunkX * 16, chunkZ * 16, 0, 16, 1 + random.nextInt(8), 1 + random.nextInt(10));
                generateOre(blocksreg.RUBYORE, world, random, chunkX * 16, chunkZ * 16, 0, 16, 1 + random.nextInt(8), 1 + random.nextInt(10));
                generateOre(blocksreg.SAPPHIREORE, world, random, chunkX * 16, chunkZ * 16, 0, 16, 1 + random.nextInt(8), 1 + random.nextInt(10));
                break;
        }
    }

    private void generateOre(Block block, World world, Random random, int x, int z,
                             int minY, int maxY, int veinSize, int chances) {
        int deltaY = maxY - minY;
        for (int i = 0; i < chances; i++) {
            int posX = x + random.nextInt(16);
            int posY = minY + random.nextInt(deltaY);
            int posZ = z + random.nextInt(16);
            new WorldGenMinable(block, veinSize, net.minecraft.init.Blocks.stone)
                    .generate(world, random, posX, posY, posZ);
        }
    }
}
