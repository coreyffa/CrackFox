package com.gamerlord48.crackfox.items;


import com.gamerlord48.crackfox.CrackFox;
import com.gamerlord48.crackfox.help.Reference;
import net.minecraft.item.ItemSword;


public class ItemChromiumSword extends ItemSword{

    private float dam;

    public ItemChromiumSword(ToolMaterial material) {
        super(material);
        setUnlocalizedName("chromiumSword");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CrackFox.tabCrackFox);
        this.dam = 4.0F + material.getDamageVsEntity();
    }
}
