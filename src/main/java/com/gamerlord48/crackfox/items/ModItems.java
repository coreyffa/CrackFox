package com.gamerlord48.crackfox.items;

import com.gamerlord48.crackfox.help.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;


public class ModItems {

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

        //Non Functional Items
        chromiumNugget = new ItemChromiumNugget();


        //Tools
        chromiumPickaxe = new ItemChromiumPickaxe(chromiumToolMaterial);
        chromiumAxe = new ItemChromiumAxe(chromiumToolMaterial);
        chromiumSpade = new ItemChromiumSpade(chromiumToolMaterial);

        RegisterHelper.registerItem(chromiumPickaxe);
        RegisterHelper.registerItem(chromiumAxe);
        RegisterHelper.registerItem(chromiumSpade);

        RegisterHelper.registerItem(chromiumNugget);
    }
}
