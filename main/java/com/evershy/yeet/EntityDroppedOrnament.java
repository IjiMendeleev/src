package com.evershy.yeet;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class EntityDroppedOrnament<hand> extends EntityArrow
{
    public EntityPlayer playerIn;
	public EnumHand hand;
	public EntityDroppedOrnament(World worldIn) 
	{
		super(worldIn);
	}

	@Override
	protected ItemStack getArrowStack() 
	{
       return playerIn.getHeldItem(hand);
	}

}
