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
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "RedOrnament"), EntityRedOrnament.class, "red_ornament", 33, Main.instance, 50, 1, true, 0x696969, 0x111111);
		RenderingRegistry.registerEntityRenderingHandler(EntityPebble.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.PEBBLE,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrick.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.BRICK,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityNBrick.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.NETHERBRICK,Minecraft.getMinecraft().getRenderItem()));
		RenderingRegistry.registerEntityRenderingHandler(EntityRedOrnament.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),AItems.ORNAMENT,Minecraft.getMinecraft().getRenderItem()));

	}
	
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
