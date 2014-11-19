package com.gamerlord48.crackfox.handler;

import com.gamerlord48.crackfox.blocks.ModBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


public class ModRecipes {

    /**
     * Adds the recipes.
     * Called in the preInit
     */
    public static void addRecipes() {
        /**
         * A basic recipe. This requires 2 values: Output, an itemstack output, and an Object Array, of what the
         * recipe is.
         * Pretend the array as an crafting grid, where spaces are empty places.
         * All other chars can be any item assigned.
         */

        GameRegistry.addRecipe(new ItemStack(ModBlocks.crackFoxBlock), new Object[]
                {
                        "XXX",
                        "XYX",
                        "XXX",
                        'X', Blocks.planks, 'Y', Items.arrow
                });

        /**
         * Shapeless recipes are the same as normal recipes, except that they dont have a layout.
         */

        /**
         GameRegistry.addShapelessRecipe(new ItemStack(ModItems.chromiumNugget), new Object[]
         {
         Items.iron_ingot, new ItemStack(Items.dye, 1, 11)
         });
         */
        GameRegistry.addShapelessRecipe(new ItemStack(Items.flint, 1), new ItemStack(Blocks.gravel));
    }
}
