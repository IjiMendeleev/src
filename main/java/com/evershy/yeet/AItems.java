package com.evershy.yeet;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;

public class AItems extends Item
{
 public static final List<Item> ITEMS = new ArrayList<Item>(0);

 public static final ItemPebble PEBBLE = new ItemPebble("cobble_pebble");
 
 public static final BrickThrowable BRICK = new BrickThrowable("brick");
 
 public static final NBrickThrowable NETHERBRICK = new NBrickThrowable("nether_brick");
 
 public static final ItemRedOrnament ORNAMENT = new ItemRedOrnament("red_ornament");

 public static final SlimeBallThrowable SLIMEBALL = new SlimeBallThrowable("slime_ball");
}
