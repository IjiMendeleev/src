package com.evershy.yeet;



import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.evershy.yeet.util.Reference;

public class EntityShuriken extends EntityThrowable 
{
		
	public EntityShuriken(World worldIn, String name)
    {
    	super(worldIn);
    	cachedUniqueIdString = name;
    }
	public EntityShuriken(World worldIn)
    {
        super(worldIn);
    }

    public EntityShuriken(World worldIn, EntityLivingBase throwerIn)
    {
        super(worldIn, throwerIn);
    }

    public EntityShuriken(World worldIn, double x, double y, double z)
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
	public void onAddedToWorld() 
	{
		super.onAddedToWorld();
	}
	@Override
	protected void onImpact(RayTraceResult result) 
	{
		 
		        if (result.entityHit != null)
		        {
		            int i = 10;

		            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);
		           
		        }

		        if (!this.world.isRemote)
		        {   
		        	this.dropItem(AItems.SHURIKEN, 1);
		            this.world.setEntityState(this, (byte)3);
		            this.setDead();
		        }
		        
	}
}