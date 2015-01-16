package com.gamerlord48.crackfox;

import com.gamerlord48.crackfox.blocks.ModBlocks;
import com.gamerlord48.crackfox.event.CrackFoxEventManager;
import com.gamerlord48.crackfox.handler.CrackFoxFuelHandler;
import com.gamerlord48.crackfox.handler.ModRecipes;
import com.gamerlord48.crackfox.help.Reference;
import com.gamerlord48.crackfox.items.ModItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


/**
 * This @Mod annotation tells forge that we are creating a new mod. Without this, forge wont
 * find your mod. This takes 2 values, a modid, which is a "name" for your mod. This cant be the
 * same for ANY mod. So find a name which is new. Version is the current mod version.
 */
@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class CrackFox {

    public static final CreativeTabs tabCrackFox = new CreativeTabs(12, "tabCrackFox") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(ModBlocks.crackFoxBlock);
        }
    };

    CrackFoxEventManager crackFoxEventManager = new CrackFoxEventManager();
    CrackFoxFuelHandler crackFoxFuelHandler = new CrackFoxFuelHandler();

    /**
     * This is where you can add your own stuff.
     * In the preInit, you add stuff like blocks, items, recipes, etc.
     * Basically everything needed before the world starts playing.
     *
     * @param event
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Block handlers, handles all blocks
        ModBlocks.loadBlocks();

        //Item handlers, handles all items
        ModItems.loadItems();

        //Register handler, adds all the recipes
        ModRecipes.addRecipes();

        GameRegistry.registerWorldGenerator(crackFoxEventManager, 4);
        GameRegistry.registerFuelHandler(crackFoxFuelHandler);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
