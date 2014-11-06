package com.gamerlord48.crackfox.blocks;

import com.gamerlord48.crackfox.help.RegisterHelper;
import net.minecraft.block.Block;


public class ModBlocks {
    //assign the object as a Block
    public static Block crackFoxBlock;
    public static Block crackFoxBlock2;
    public static Block crackFoxBlock3;
    public static Block crackFoxBlock4;
    public static Block crackFoxBlock5;
    public static Block crackFoxBlock6;
    public static Block crackFoxBlock7;
    public static Block crackFoxBlock8;
    public static Block crackFoxBlock9;

    public static void loadBlocks() {
        //Declare the item here
        crackFoxBlock = new CrackFoxBlock();
        crackFoxBlock2 = new CrackFoxBlock();
        crackFoxBlock3 = new CrackFoxBlock();
        crackFoxBlock4 = new CrackFoxBlock();
        crackFoxBlock5 = new CrackFoxBlock();
        crackFoxBlock6 = new CrackFoxBlock();
        crackFoxBlock7 = new CrackFoxBlock();
        crackFoxBlock8 = new CrackFoxBlock();
        crackFoxBlock9 = new CrackFoxBlock();

        RegisterHelper.registerBlock(crackFoxBlock);
    }
}
