package com.gamerlord48.crackfox.items;


import com.gamerlord48.crackfox.CrackFox;
import com.gamerlord48.crackfox.help.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class ItemTestFood extends ItemFood {
    private PotionEffect[] effects;

    public ItemTestFood(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite, PotionEffect... effects) {
        super(healAmount, saturationModifier, wolvesFavorite);
        this.setUnlocalizedName(unlocalizedName);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        this.setCreativeTab(CrackFox.tabCrackFox);
        this.effects = effects;
    }
    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onFoodEaten(stack, world, player);

        for (int i = 0; i < effects.length; i ++) {
            if (!world.isRemote && effects[i] != null && effects[i].getPotionID() > 0)
                player.addPotionEffect(effects[i]);
        }
    }
}
