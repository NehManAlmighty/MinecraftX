package com.nehman.forge.minecraftx;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.nehman.forge.minecraftx.items.XItems;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		XItems.registerItems();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
