package ukorandomadditionsmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ukorandomadditionsmod.items.gems.Ruby;
import ukorandomadditionsmod.items.gems.Steel;
import ukorandomadditionsmod.items.gems.Sapphire;
import ukorandomadditionsmod.items.gems.Amber;
import ukorandomadditionsmod.items.bows.Steelbow;
import ukorandomadditionsmod.items.tools.Steelpick;
import ukorandomadditionsmod.items.tools.Rubypick;
import ukorandomadditionsmod.items.tools.Sapphirepick;
import ukorandomadditionsmod.items.tools.Amberpick;
import ukorandomadditionsmod.items.swords.Rubysword;
import ukorandomadditionsmod.items.swords.Steelsword;
import ukorandomadditionsmod.items.swords.Sapphiresword;
import ukorandomadditionsmod.items.swords.Ambersword;
import ukorandomadditionsmod.items.Mineitallmodule;

public class GemsReg {

    public static final Item RUBY = new Ruby();
    public static final Item STEEL = new Steel();
    public static final Item SAPPHIRE = new Sapphire();
    public static final Item AMBER = new Amber();
    public static final Item STEELBOW = new Steelbow();
    public static final Item STEELPICK = new Steelpick();
    public static final Item RUBYPICK = new Rubypick();
    public static final Item SAPPHIREPICK = new Sapphirepick();
    public static final Item AMBERPICK = new Amberpick();
    public static final Item STEELSWORD = new Steelsword();
    public static final Item AMBERSWORD = new Ambersword();
    public static final Item SAPPHIRESWORD = new Sapphiresword();
    public static final Item RUBYSWORD = new Rubysword();
    public static final Item MINEITALLMODULE = new Mineitallmodule();

    private GemsReg() {}

    public static void preInit() {
        GameRegistry.registerItem(RUBY, "Ruby");
        GameRegistry.registerItem(STEEL, "Steel");
        GameRegistry.registerItem(SAPPHIRE, "Sapphire");
        GameRegistry.registerItem(AMBER, "Amber");
        GameRegistry.registerItem(STEELBOW, "steelbow");
        GameRegistry.registerItem(STEELPICK, "steelpick");
        GameRegistry.registerItem(RUBYPICK, "rubypick");
        GameRegistry.registerItem(SAPPHIREPICK, "sapphirepick");
        GameRegistry.registerItem(AMBERPICK, "amberpick");
        GameRegistry.registerItem(STEELSWORD, "steelsword");
        GameRegistry.registerItem(AMBERSWORD, "ambersword");
        GameRegistry.registerItem(SAPPHIRESWORD, "sapphiresword");
        GameRegistry.registerItem(RUBYSWORD, "rubysword");
        GameRegistry.registerItem(MINEITALLMODULE, "mineitallmodule");
    }
}
