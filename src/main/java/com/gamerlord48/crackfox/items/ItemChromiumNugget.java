package com.gamerlord48.crackfox.items;

import com.gamerlord48.crackfox.CrackFox;
import com.gamerlord48.crackfox.help.Reference;
import net.minecraft.item.Item;


public class ItemChromiumNugget extends Item {
    public ItemChromiumNugget() {
        super();
        setUnlocalizedName("chromiumNugget");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CrackFox.tabCrackFox);
    }
}
