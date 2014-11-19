package com.gamerlord48.crackfox.items;

import com.gamerlord48.crackfox.help.RegisterHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;


public class ModItems {

    //Food Items
    public static Item testFood;
    public static Item posionFood;

    //non-functional items.
    public static Item chromiumNugget;

    //Tools
    public static Item chromiumPickaxe;
    public static Item chromiumAxe;
    public static Item chromiumSpade;


    // Armor

    //materials
    static Item.ToolMaterial chromiumToolMaterial = EnumHelper.addToolMaterial("chromiumToolMaterial", 2, 750, 7, 2.0F, 20);

    /**
     * We call this in our main mod file.
     * We add all items here to the game.
     */

    public static void loadItems() {
        ItemFood testFood;
        GameRegistry.registerItem(testFood =
                new ItemTestFood("testFood", 2, 0.2f, false,
                        new PotionEffect(Potion.damageBoost.id, 1000, 1)).setAlwaysEdible(), "testFood");

        ItemFood posionFood;
        posionFood = new ItemPoisonFood("posionFood", 2, 0.2f, false, new PotionEffect(Potion.poison.id, 100, 1)).setAlwaysEdible();

        chromiumNugget = new ItemChromiumNugget();

        RegisterHelper.registerItem(chromiumNugget);

        //Tools
        chromiumPickaxe = new ItemChromiumPickaxe(chromiumToolMaterial);
        chromiumAxe = new ItemChromiumAxe(chromiumToolMaterial);
        chromiumSpade = new ItemChromiumSpade(chromiumToolMaterial);

        RegisterHelper.registerItem(chromiumPickaxe);
        RegisterHelper.registerItem(chromiumAxe);
        RegisterHelper.registerItem(chromiumSpade);

        RegisterHelper.registerItem(posionFood);
    }
}
