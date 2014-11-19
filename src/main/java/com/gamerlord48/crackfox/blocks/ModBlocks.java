package com.gamerlord48.crackfox.blocks;

import com.gamerlord48.crackfox.help.RegisterHelper;
import net.minecraft.block.Block;


public class ModBlocks {
    //assign the object as a Block
    public static Block crackFoxBlock;
    public static Block blockChromiumOre;

    public static void loadBlocks() {
        //Declare the item here
        crackFoxBlock = new CrackFoxBlock();
        blockChromiumOre = new BlockChromiumOre();

        RegisterHelper.registerBlock(crackFoxBlock);
        RegisterHelper.registerBlock(blockChromiumOre);
    }
}
