package com.gamerlord48.crackfox.items;

import com.gamerlord48.crackfox.CrackFox;
import com.gamerlord48.crackfox.help.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


/**
 * Created by corey on 12/1/14.
 */
public class ItemRadBull extends ItemBucketMilk {
    private PotionEffect[] effects;

    public ItemRadBull(String unlocalizedName, PotionEffect... effects) {
        this.setUnlocalizedName(unlocalizedName);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        this.setCreativeTab(CrackFox.tabCrackFox);
        this.effects = effects;
    }

    @Override
    public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --stack.stackSize;
        }

        for (int i = 0; i < effects.length; i ++) {
            if (!world.isRemote && effects[i] != null && effects[i].getPotionID() > 0)
                player.addPotionEffect(effects[i]);
        }

        return stack.stackSize <= 0 ? new ItemStack(Items.glass_bottle) : stack;
    }
}
