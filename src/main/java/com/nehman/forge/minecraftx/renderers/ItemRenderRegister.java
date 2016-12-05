package com.nehman.forge.minecraftx.renderers;

import com.nehman.forge.minecraftx.Main;
import com.nehman.forge.minecraftx.items.XItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {
	public static void registerRenderers() {
		register(XItems.dead_bark);
	}
	
	private static void register(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
