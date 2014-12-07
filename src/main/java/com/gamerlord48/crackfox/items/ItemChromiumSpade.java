package com.gamerlord48.crackfox.items;


import com.gamerlord48.crackfox.CrackFox;
import com.gamerlord48.crackfox.help.Reference;
import net.minecraft.item.ItemSpade;


public class ItemChromiumSpade extends ItemSpade {
    public ItemChromiumSpade(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("chromiumSpade");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CrackFox.tabCrackFox);
    }
}
