package com.gamerlord48.crackfox.items;

import com.gamerlord48.crackfox.CrackFox;
import com.gamerlord48.crackfox.help.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


/**
 * Created by corey on 12/1/14.
 */
public class ItemRadBull extends ItemFood {

    public ItemRadBull(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite) {
        super(healAmount, saturationModifier, wolvesFavorite);
        this.setUnlocalizedName(unlocalizedName);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        this.setCreativeTab(CrackFox.tabCrackFox);
        this.setMaxStackSize(1);
    }

    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
    {
        if (!world.isRemote)
        {
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 2400, 1));
            player.addPotionEffect(new PotionEffect(Potion.jump.id, 2400, 1));
        }
        else
        {
            super.onFoodEaten(stack, world, player);
        }
    }
    public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_)
    {
        super.onEaten(p_77654_1_, p_77654_2_, p_77654_3_);
        return new ItemStack(Items.glass_bottle);
    }
}
