package com.evershy.yeet;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntitySlimeball extends EntityThrowable
{
	
	
	    public EntitySlimeball(World worldIn, String name)
	    {
	    	super(worldIn);
	    	cachedUniqueIdString = name;
	    }
		public EntitySlimeball(World worldIn)
	    {
	        super(worldIn);
	    }

	    public EntitySlimeball(World worldIn, EntityLivingBase throwerIn)
	    {
	    	super(worldIn, throwerIn);
	    }

	    public EntitySlimeball(World worldIn, double x, double y, double z)
	    {
	        super(worldIn, x, y, z);
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
			 
			        if (result.entityHit != null)
			        {
			            int i = 2;

			            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);
			            result.entityHit.addVelocity(-1, -1, -1);
			        }

			        if (!this.world.isRemote)
			        {
			            this.world.setEntityState(this, (byte)3);
			            this.setDead();
			        }
			        
		}
}

