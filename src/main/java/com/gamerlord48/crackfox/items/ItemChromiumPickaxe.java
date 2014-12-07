package com.gamerlord48.crackfox.items;

import com.gamerlord48.crackfox.CrackFox;
import com.gamerlord48.crackfox.help.Reference;
import net.minecraft.item.ItemPickaxe;


public class ItemChromiumPickaxe extends ItemPickaxe {
    public ItemChromiumPickaxe(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("chromiumPickaxe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CrackFox.tabCrackFox);
    }
}
