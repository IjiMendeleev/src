package com.evershy.yeet;



	import com.evershy.yeet.util.Reference;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

	public class EntityMooOrnament extends EntityThrowable
	{
		
		public final InventoryBasic OrnamentInventory;
		
		
		
		public EntityMooOrnament(World worldIn, String name)
	    {
	    	
			super(worldIn);
	    	cachedUniqueIdString = name;
	    	this.OrnamentInventory = new InventoryBasic("Item", false, 1);
	    }
		public EntityMooOrnament(World worldIn)
	    {
	        
			super(worldIn);
			this.OrnamentInventory = new InventoryBasic("Item", false, 1);
	    }

	    public EntityMooOrnament(World worldIn, EntityLivingBase throwerIn)
	    {
	        super(worldIn, throwerIn);
	        this.OrnamentInventory = new InventoryBasic("Item", false, 1);
	    }

	    public EntityMooOrnament(World worldIn, double x, double y, double z)
	    {
	        
			super(worldIn, x, y, z);
			this.OrnamentInventory = new InventoryBasic("Item", false, 1);
	    }
			
		@SideOnly(Side.CLIENT)
	    public void handleStatusUpdate(byte id)
	    {
	        if (id == 3)
	        {
	            for (int i = 0; i < 8; ++i)
	            {
	                this.world.spawnParticle(EnumParticleTypes.CRIT, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
	            }
	        }
	    }
		@Override
		protected void onImpact(RayTraceResult result) 
		{
			 this.rand.ints(1);
			 int j = this.rand.nextInt(256);
			 
			        if (result.entityHit != null)
			        {
			            int i = 0;

			            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);
			            this.setDead();
			        }
			        if (!this.world.isRemote && result.entityHit == null)
			        {   
			           if (j <= 4)
			           {  
			        	EntityMooshroom creeper = new EntityMooshroom(this.world);
			        	creeper.setLocationAndAngles(this.posX, this.posY + 3, this.posZ, this.rotationYaw, 0.0F);
			        	creeper.setGrowingAge(-5000);
			        	this.world.spawnEntity(creeper);
			        	this.setDead();
			           }
			           if (j > 4)
			           {
			        	this.dropItem(AItems.MOOORNAMENT, 1);
			            this.world.setEntityState(this, (byte)3);
			            this.setDead();   
			           }  
			        }
		
			
		
}}
	
