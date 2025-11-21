package ukorandomadditionsmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class UraTab extends CreativeTabs {
    public UraTab(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return GemsReg.RUBY;
    }
}