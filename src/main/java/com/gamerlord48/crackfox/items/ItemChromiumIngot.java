package com.gamerlord48.crackfox.items;


import com.gamerlord48.crackfox.CrackFox;
import com.gamerlord48.crackfox.help.Reference;
import net.minecraft.item.Item;


public class ItemChromiumIngot extends Item{

    public ItemChromiumIngot() {
        super();
        setUnlocalizedName("chromiumIngot");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CrackFox.tabCrackFox);
    }
}
