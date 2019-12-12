package com.evershy.yeet;



	import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
	import net.minecraft.util.EnumParticleTypes;
	import net.minecraft.util.ResourceLocation;
	import net.minecraft.util.datafix.DataFixer;
	import net.minecraft.util.math.RayTraceResult;
	import net.minecraft.world.World;
	import net.minecraftforge.fml.relauncher.Side;
	import net.minecraftforge.fml.relauncher.SideOnly;

	import com.evershy.yeet.util.Reference;

	public class EntityRedOrnament extends EntityThrowable 
	{
		public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":" + "textures/items/red_ornament.png");
		
		public EntityRedOrnament(World worldIn, String name)
	    {
	    	super(worldIn);
	    	cachedUniqueIdString = name;
	    }
		public EntityRedOrnament(World worldIn)
	    {
	        super(worldIn);
	    }

	    public EntityRedOrnament(World worldIn, EntityLivingBase throwerIn)
	    {
	        super(worldIn, throwerIn);
	    }

	    public EntityRedOrnament(World worldIn, double x, double y, double z)
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
		boolean candrop;
		@Override
		protected void onImpact(RayTraceResult result) 
		{
			 
			        if (result.entityHit != null)
			        {
			            int i = 0;

			            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);
			        }
			        if (!this.world.isRemote)
			        { 
			        	if (result.entityHit == null)
			        {
			        	this.dropItem(AItems.ORNAMENT, 1);
			        }
			            this.world.setEntityState(this, (byte)3);
			            this.setDead();   
			        }
			        
		}
}
	
