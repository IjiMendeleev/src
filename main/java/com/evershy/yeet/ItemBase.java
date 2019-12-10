package com.evershy.yeet;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.evershy.yeet.util.handlers.iHasModel;

public class ItemBase extends Item implements iHasModel
{
	public ItemBase(String name)
	{
       setUnlocalizedName(name);
       setRegistryName(name);
       setCreativeTab(CreativeTabs.MISC);
              
       AItems.ITEMS.add(this); 
	}
	@Override 
	public void registerModels()
	    {
	        Main.proxy.registerItemRenderer(this, 0, "inventory");
	    }
}
