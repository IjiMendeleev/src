package com.evershy.yeet;

import com.evershy.yeet.util.handlers.iHasModel;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class BrickThrowable extends Item implements iHasModel
{

	public BrickThrowable(String name)
	{
       setUnlocalizedName(name);
       setRegistryName("minecraft:brick");
       setCreativeTab(CreativeTabs.COMBAT);
              
       AItems.ITEMS.add(this); 
	}
	@Override 
	public void registerModels()
	    {
	        Main.proxy.registerItemRenderer(this, 0, "inventory");
	    }


public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
{
   ItemStack itemstack = playerIn.getHeldItem(handIn);

   if (!playerIn.capabilities.isCreativeMode)
   {
       itemstack.shrink(1);
   }

   worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

   if (!worldIn.isRemote)
   {
	   EntityBrick entitybrick = new EntityBrick(worldIn, playerIn);
	   entitybrick.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
	   worldIn.spawnEntity(entitybrick);
   }

   playerIn.addStat(StatList.getObjectUseStats(this));
   return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
}
}

