package ukorandomadditionsmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ukorandomadditionsmod.items.musicdisc.ItemDiscCM;
import ukorandomadditionsmod.items.musicdisc.ItemDiscHoneyJam;
import ukorandomadditionsmod.items.musicdisc.ItemDiscMS;
import ukorandomadditionsmod.items.musicdisc.ItemDiscSG;
import ukorandomadditionsmod.items.musicdisc.ItemDiscUS;

public class UItems {
    public static final Item DISC1 = new ItemDiscCM();
    public static final Item DISC2 = new ItemDiscHoneyJam();
    public static final Item DISC3 = new ItemDiscMS();
    public static final Item DISC4 = new ItemDiscSG();
    public static final Item DISC5 = new ItemDiscUS();

private UItems() {
}

public static void init() {
    GameRegistry.registerItem(DISC1, "ItemDiscCM");
    GameRegistry.registerItem(DISC2, "ItemDiscHoneyJam");
    GameRegistry.registerItem(DISC3, "ItemDiscMS");
    GameRegistry.registerItem(DISC4, "ItemDiscSG");
    GameRegistry.registerItem(DISC5, "ItemDiscUS");
}
}