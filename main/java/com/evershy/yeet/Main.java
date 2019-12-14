package com.evershy.yeet;


import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.chunk.BlockStatePaletteRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.evershy.yeet.proxy.CommonProxy;
import com.evershy.yeet.util.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event)
	{
		//GameRegistry.addShapelessRecipe(new ResourceLocation("cobble_pebble"), new ResourceLocation(Reference.MOD_ID), new ItemStack(AItems.PEBBLE, 1, 0), Ingredient.fromStacks(new ItemStack(Blocks.COBBLESTONE)));
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "cobble_pebble"), EntityPebble.class, "cobble_pebble", 31, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "brick"), EntityBrick.class, "brick", 32, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "Nbrick"), EntityNBrick.class, "nether_brick", 33, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "red_ornament"), EntityRedOrnament.class, "red_ornament", 34, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "SlimeBall"), EntitySlimeball.class, "slime_ball", 35, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "black_ornament"), EntityBlackOrnament.class, "black_ornament", 36, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "blue_ornament"), EntityBlueOrnament.class, "blue_ornament", 37, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "creeper_ornament"), EntityCreeperOrnament.class, "creeper_ornament", 38, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "electric_ornament"), EntityElectricOrnament.class, "electric_ornament", 39, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "ender_ornament"), EntityEnderOrnament.class, "ender_ornament", 40, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "funny_ornament"), EntityFunnyOrnament.class, "funny_ornament", 41, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "green_ornament"), EntityGreenOrnament.class, "green_ornament", 42, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "grey_ornament"), EntityGreyOrnament.class, "grey_ornament", 43, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "moo_ornament"), EntityMooOrnament.class, "moo_ornament", 44, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "orange_ornament"), EntityOrangeOrnament.class, "orange_ornament", 45, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "pink_ornament"), EntityPinkOrnament.class, "pink_ornament", 46, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "purple_ornament"), EntityPurpleOrnament.class, "purple_ornament", 47, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "skull_ornament"), EntitySkullOrnament.class, "skull_ornament", 48, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "white_ornament"), EntityWhiteOrnament.class, "white_ornament", 49, Main.instance, 50, 1, true, 0x696969, 0x111111);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "yellow_ornament"), EntityYellowOrnament.class, "yellow_ornament", 50, Main.instance, 50, 1, true, 0x696969, 0x111111);
		RenderingRegistry.registerEntityRenderingHandler(EntityPebble.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.PEBBLE,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrick.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.BRICK,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityNBrick.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.NETHERBRICK,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityRedOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.REDORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntitySlimeball.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.SLIMEBALL,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlackOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.BLKORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlueOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.BLUORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityCreeperOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.CREORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityElectricOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.ETCORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.ENDORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityFunnyOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.FUNORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityGreenOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.GREORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityGreyOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.GRYORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityMooOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.MOOORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityPinkOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.PNKORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityPurpleOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.PURORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntitySkullOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.SKLORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityWhiteOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.WHTORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityYellowOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.YELORNAMENT,Minecraft.getMinecraft().getRenderItem()));
		}
	
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
