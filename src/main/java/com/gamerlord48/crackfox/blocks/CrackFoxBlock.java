package com.gamerlord48.crackfox.blocks;


import com.gamerlord48.crackfox.CrackFox;
import com.gamerlord48.crackfox.help.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;


public class CrackFoxBlock extends Block {

    @SideOnly(Side.CLIENT)
    private IIcon top;
    @SideOnly(Side.CLIENT)
    private IIcon front;
    @SideOnly(Side.CLIENT)
    private IIcon back;
    @SideOnly(Side.CLIENT)
    private IIcon face1;
    @SideOnly(Side.CLIENT)
    private IIcon face2;
    @SideOnly(Side.CLIENT)
    private IIcon face3;
    @SideOnly(Side.CLIENT)
    private IIcon bottom;

    public CrackFoxBlock() {
        super(Material.wood);
        setBlockName("crackFoxBlock");
        setBlockTextureName(Reference.MODID + ":" + "crackFoxBlock");
        setCreativeTab(CrackFox.tabCrackFox);
        setStepSound(soundTypeWood);
        setHardness(1.0F);
        setHarvestLevel("axe", 1);
        setLightLevel(1.0F);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return side == 1 || side == 0 ? this.top : (side == 2 ? this.front : this.blockIcon);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(getTextureName() + "_side");
        this.top = p_149651_1_.registerIcon(getTextureName() + "_top");
        this.front = p_149651_1_.registerIcon(getTextureName() + "_front");
    }
}
