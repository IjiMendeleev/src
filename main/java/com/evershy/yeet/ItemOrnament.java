package com.evershy.yeet;

import com.evershy.yeet.util.Reference;
import com.evershy.yeet.util.handlers.iHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemOrnament extends Item  implements iHasModel 
{
  
  public String color;
  public ItemOrnament(String name)
  {     this.color = name; 
        setUnlocalizedName(name);
        setRegistryName(name);
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

       if (!worldIn.isRemote && this.color == "red_ornament")
       {
        EntityRedOrnament entitycoloredornament = new EntityRedOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       if (!worldIn.isRemote && this.color == "black_ornament")
       {
        EntityBlackOrnament entityblackornament = new EntityBlackOrnament(worldIn, playerIn);
        entityblackornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entityblackornament);
       }
       if (!worldIn.isRemote && this.color == "blue_ornament")
       {
        EntityBlueOrnament entitycoloredornament = new EntityBlueOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       if (!worldIn.isRemote && this.color == "creeper_ornament")
       {
        EntityCreeperOrnament entitycoloredornament = new EntityCreeperOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       if (!worldIn.isRemote && this.color == "electric_ornament")
       {
        EntityElectricOrnament entitycoloredornament = new EntityElectricOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       if (!worldIn.isRemote && this.color == "ender_ornament")
       {
        EntityEnderOrnament entitycoloredornament = new EntityEnderOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       if (!worldIn.isRemote && this.color == "funny_ornament")
       {
        EntityFunnyOrnament entitycoloredornament = new EntityFunnyOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       if (!worldIn.isRemote && this.color == "green_ornament")
       {
        EntityGreenOrnament entitycoloredornament = new EntityGreenOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       if (!worldIn.isRemote && this.color == "grey_ornament")
       {
        EntityGreyOrnament entitycoloredornament = new EntityGreyOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       if (!worldIn.isRemote && this.color == "moo_ornament")
       {
        EntityMooOrnament entitycoloredornament = new EntityMooOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       if (!worldIn.isRemote && this.color == "orange_ornament")
       {
        EntityOrangeOrnament entitycoloredornament = new EntityOrangeOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       if (!worldIn.isRemote && this.color == "pink_ornament")
       {
        EntityPinkOrnament entitycoloredornament = new EntityPinkOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       if (!worldIn.isRemote && this.color == "purple_ornament")
       {
        EntityPurpleOrnament entitycoloredornament = new EntityPurpleOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       if (!worldIn.isRemote && this.color == "skull_ornament")
       {
        EntitySkullOrnament entitycoloredornament = new EntitySkullOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       if (!worldIn.isRemote && this.color == "white_ornament")
       {
        EntityWhiteOrnament entitycoloredornament = new EntityWhiteOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       if (!worldIn.isRemote && this.color == "yellow_ornament")
       {
        EntityYellowOrnament entitycoloredornament = new EntityYellowOrnament(worldIn, playerIn);
        entitycoloredornament.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
        worldIn.spawnEntity(entitycoloredornament);
       }
       
       playerIn.addStat(StatList.getObjectUseStats(this));
       return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
   }
}