package com.nehman.forge.minecraftx.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class XItems {
	public static Item dead_bark;
	
	public static void registerItems() {
		GameRegistry.registerItem(dead_bark = new DeadBark(), DeadBark.unLocalizedName);
	}
}
