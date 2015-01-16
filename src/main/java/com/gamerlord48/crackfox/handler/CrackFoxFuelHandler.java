package com.gamerlord48.crackfox.handler;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by crackfox on 1/16/15.
 */
public class CrackFoxFuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel) {
        Item var1 = fuel.getItem();

        if (var1 == Items.blaze_rod) {
            return 7200;
        } else {
            return 0;
        }
    }
}
