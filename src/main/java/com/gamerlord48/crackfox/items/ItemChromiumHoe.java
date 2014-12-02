package com.gamerlord48.crackfox.items;

import com.gamerlord48.crackfox.CrackFox;
import com.gamerlord48.crackfox.help.Reference;
import net.minecraft.item.ItemHoe;


/**
 * Created by corey on 12/1/14.
 */
public class ItemChromiumHoe extends ItemHoe{

    public ItemChromiumHoe(ToolMaterial material) {
        super(material);
        setUnlocalizedName("chromiumHoe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CrackFox.tabCrackFox);
    }
}
