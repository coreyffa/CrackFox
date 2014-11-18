package com.gamerlord48.crackfox.blocks;


import com.gamerlord48.crackfox.CrackFox;
import com.gamerlord48.crackfox.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class CrackFoxBlock extends Block {

    public CrackFoxBlock() {
        super(Material.wood);
        setBlockName("crackFoxBlock");
        setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CrackFox.tabCrackFox);
        setStepSound(soundTypeWood);
        setHardness(1.0F);
        setHarvestLevel("any", 1);
        setLightLevel(1.0F);
    }

    //return the metadata of the block when it is dropped
    @Override
    public int damageDropped(int metadata)
    {
        return metadata;
    }
}
