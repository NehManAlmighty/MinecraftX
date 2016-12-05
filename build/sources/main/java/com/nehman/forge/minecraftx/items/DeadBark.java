package com.nehman.forge.minecraftx.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DeadBark extends Item {
	public static String unLocalizedName = "dead_bark";
	
	public DeadBark() {
		super();
		this.setUnlocalizedName(unLocalizedName);
		this.setCreativeTab(CreativeTabs.BREWING);
	}
}
