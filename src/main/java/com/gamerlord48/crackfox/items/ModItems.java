package com.gamerlord48.crackfox.items;

import com.gamerlord48.crackfox.help.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;


public class ModItems {

    //Food Items
    public static Item testFood;
    public static Item poisonFood;

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

        testFood =new ItemTestFood("testFood", 2, 0.2f, false, new PotionEffect(Potion.damageBoost.id, 1000, 1)).setAlwaysEdible();

        poisonFood = new ItemPoisonFood("poisonFood", 2, 0.2f, false, new PotionEffect(Potion.poison.id, 100, 1)).setAlwaysEdible();

        chromiumNugget = new ItemChromiumNugget();

        RegisterHelper.registerItem(chromiumNugget);

        //Tools
        chromiumPickaxe = new ItemChromiumPickaxe(chromiumToolMaterial);
        chromiumAxe = new ItemChromiumAxe(chromiumToolMaterial);
        chromiumSpade = new ItemChromiumSpade(chromiumToolMaterial);

        RegisterHelper.registerItem(chromiumPickaxe);
        RegisterHelper.registerItem(chromiumAxe);
        RegisterHelper.registerItem(chromiumSpade);

        RegisterHelper.registerItem(poisonFood);
        RegisterHelper.registerItem(testFood);
    }
}
