package com.gamerlord48.crackfox.items;

import com.gamerlord48.crackfox.CrackFox;
import com.gamerlord48.crackfox.help.Reference;
import net.minecraft.item.ItemAxe;


public class ItemChromiumAxe extends ItemAxe {
    public ItemChromiumAxe(ToolMaterial material) {
        super(material);
        setUnlocalizedName("chromiumAxe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CrackFox.tabCrackFox);
    }
}
