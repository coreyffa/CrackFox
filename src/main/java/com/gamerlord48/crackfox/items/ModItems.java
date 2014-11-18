package com.gamerlord48.crackfox.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ModItems {
    //non-functional items.

    public static Item testFood;

    //public static Item chromiumNugget;

    //Tools
    //public static Item itemName;


    // Armor

    //materials
    //static ToolMaterial chromiumToolMaterial = EnumHelper.addToolMaterial("liveToolMaterial", 2, 750, 7, 2.0F, 20);

    /**
     * We call this in our main mod file.
     * We add all items here to the game.
     */

    public static void loadItems() {
        ItemFood testFood;
        GameRegistry.registerItem(testFood =
                new ItemTestFood("testFood", 2, 0.2f, false,
                        new PotionEffect(Potion.damageBoost.id, 1000, 1)).setAlwaysEdible(), "testFood");
        /**
        chromiumNugget = new ItemChromiumNugget();

        RegisterHelper.registerItem(chromiumNugget);

        //Tools
        chromiumPickaxe = new ItemChromiumPickaxe(chromiumToolMaterial);
        chromiumAxe = new ItemChromiumAxe(chromiumToolMaterial);
        chromiumSpade = new ItemChromiumSpade(chromiumToolMaterial);

        RegisterHelper.registerItem(chromiumPickaxe);
        RegisterHelper.registerItem(chromiumAxe);
        RegisterHelper.registerItem(chromiumSpade);
         */
    }
}
