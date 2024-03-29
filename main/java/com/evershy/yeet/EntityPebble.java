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

public class EntityPebble extends EntityThrowable 
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":" + "textures/items/cobble_pebble.png");
	
	public EntityPebble(World worldIn, String name)
    {
    	super(worldIn);
    	cachedUniqueIdString = name;
    }
	public EntityPebble(World worldIn)
    {
        super(worldIn);
    }

    public EntityPebble(World worldIn, EntityLivingBase throwerIn)
    {
        super(worldIn, throwerIn);
    }

    public EntityPebble(World worldIn, double x, double y, double z)
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
		            int i = 6;

		            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);
		           
		        }

		        if (!this.world.isRemote)
		        {
		            this.world.setEntityState(this, (byte)3);
		            this.setDead();
		        }
		        
	}
}