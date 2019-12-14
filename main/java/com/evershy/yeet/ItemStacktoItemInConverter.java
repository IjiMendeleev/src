package com.evershy.yeet;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumHand;


public class ItemStacktoItemInConverter extends Item
{
    public static Item ITEMIN;
	public  ItemStacktoItemInConverter(EntityPlayer playerIn,EnumHand hand)
   {
	
	if (playerIn.getHeldItem(hand) != null)
	{
		super.getUnlocalizedNameInefficiently(playerIn.getHeldItem(hand));
	    ItemStacktoItemInConverter.ITEMIN = super.getByNameOrId(getUnlocalizedName());
	}
	
 } 
}
