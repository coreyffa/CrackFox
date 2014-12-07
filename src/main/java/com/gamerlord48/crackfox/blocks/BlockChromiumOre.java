package com.gamerlord48.crackfox.blocks;

import com.gamerlord48.crackfox.CrackFox;
import com.gamerlord48.crackfox.help.Reference;
import com.gamerlord48.crackfox.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;


public class BlockChromiumOre extends Block {
    public BlockChromiumOre()
    {
        super(Material.rock);
        setBlockName("blockChromiumOre");
        setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CrackFox.tabCrackFox);
        setStepSound(soundTypePiston);
        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 2);
    }

    /**
     * Determines what item is dropped when broken
     */
    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune)
    {
        return ModItems.chromiumNugget;
    }
}
