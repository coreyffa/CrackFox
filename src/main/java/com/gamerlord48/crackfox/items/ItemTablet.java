package com.gamerlord48.crackfox.items;

import com.gamerlord48.crackfox.CrackFox;
import com.gamerlord48.crackfox.help.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


/**
 * Created by corey on 12/3/14.
 */
public class ItemTablet extends ItemFood
{
    public ItemTablet(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite)
    {
        super(healAmount, saturationModifier, wolvesFavorite);
        setUnlocalizedName(unlocalizedName);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        this.setCreativeTab(CrackFox.tabCrackFox);
    }

    protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_)
    {
        if (!p_77849_2_.isRemote)
        {
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.nightVision.id, 2400, 0));
        }
        else
        {
            super.onFoodEaten(p_77849_1_, p_77849_2_, p_77849_3_);
        }
    }
}
