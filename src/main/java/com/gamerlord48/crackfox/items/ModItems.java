package com.gamerlord48.crackfox.items;

import com.gamerlord48.crackfox.help.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;


public class ModItems {

    //Food Items
    public static Item chocolate;
    public static Item radBull;
    public static Item tablet;

    //non-functional items.
    public static Item chromiumNugget;
    public static Item chromiumIngot;

    //Tools and weapons
    public static Item chromiumPickaxe;
    public static Item chromiumAxe;
    public static Item chromiumSpade;
    public static Item chromiumSword;
    public static Item chromiumHoe;

    // Armor

    //materials
    static Item.ToolMaterial chromiumToolMaterial = EnumHelper.addToolMaterial("chromiumToolMaterial", 1, 500, 10.0F, 4.0F, 20);

    /**
     * We call this in our main mod file.
     * We add all items here to the game.
     */

    public static void loadItems() {

        chocolate =new ItemTestFood("chocolate", 2, 0.2f, false, new PotionEffect(Potion.damageBoost.id, 500, 1), new PotionEffect(Potion.resistance.id, 500, 1), new PotionEffect(Potion.fireResistance.id, 1000, 1)).setAlwaysEdible();
        RegisterHelper.registerItem(chocolate);

        radBull = new ItemRadBull("radBull", 0, 0.2f, false).setAlwaysEdible();
        RegisterHelper.registerItem(radBull);

        tablet = new ItemTablet("tablet", 0, 0.2f, false);
        RegisterHelper.registerItem(tablet);

        chromiumNugget = new ItemChromiumNugget();
        chromiumIngot = new ItemChromiumIngot();

        RegisterHelper.registerItem(chromiumNugget);
        RegisterHelper.registerItem(chromiumIngot);

        //Tools and weapons
        chromiumPickaxe = new ItemChromiumPickaxe(chromiumToolMaterial);
        chromiumAxe = new ItemChromiumAxe(chromiumToolMaterial);
        chromiumSpade = new ItemChromiumSpade(chromiumToolMaterial);
        chromiumSword = new ItemChromiumSword(chromiumToolMaterial);
        chromiumHoe = new ItemChromiumHoe(chromiumToolMaterial);

        RegisterHelper.registerItem(chromiumHoe);
        RegisterHelper.registerItem(chromiumPickaxe);
        RegisterHelper.registerItem(chromiumAxe);
        RegisterHelper.registerItem(chromiumSpade);
        RegisterHelper.registerItem(chromiumSword);
    }
}
