package com.gamerlord48.crackfox.help;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;


public class RegisterHelper {
    /**
     * Registers all blocks. The basic format is [MODID_NAME]
     * When you call this method, with your block assigned, it will take care of everything.
     *
     * @param block
     */
    public static void registerBlock(Block block)
    {
        GameRegistry.registerBlock(block, Reference.MODID + "_" + block.getUnlocalizedName().substring(5));
    }

    /**
     * Registers all items. The basic format is [MODID_NAME]
     * When you call this method, with your item assigned, it will take care of everything.
     *
     * @param item
     */
    public static void registerItem(Item item)
    {
        GameRegistry.registerItem(item, Reference.MODID + "_" + item.getUnlocalizedName().substring(5));
    }
}
