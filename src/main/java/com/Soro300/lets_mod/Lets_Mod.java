package com.Soro300.lets_mod;

import com.Soro300.lets_mod.client.handler.KeyInputEventHandler;
import com.Soro300.lets_mod.handler.ConfigurationHandler;
import com.Soro300.lets_mod.init.ModBlocks;
import com.Soro300.lets_mod.init.ModItems;
import com.Soro300.lets_mod.init.Recipes;
import com.Soro300.lets_mod.proxy.IProxy;
import com.Soro300.lets_mod.reference.Reference;
import com.Soro300.lets_mod.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

 @Mod(modid=Reference.MOD_ID , name=Reference.MOD_NAME , version=Reference.VERSION , guiFactory = Reference.GUI_FACTORY_CLASS)
public class Lets_Mod {
	 
	 @Mod.Instance(Reference.MOD_ID)
	 public static Lets_Mod instance;
	 
	 @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS )
	 public static IProxy proxy;
	 
	 
	 @Mod.EventHandler
	 public void preInit(FMLPreInitializationEvent event)
	 {
		 
		 ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		 FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		 
		 proxy.registerKeyBindings();
		 
		 ModItems.init();
		 ModBlocks.init();
		 Recipes.init();
		 
		 LogHelper.info("Pre Initilization completed");
	  }
	 @Mod.EventHandler
	 public void Init(FMLInitializationEvent event)
	 {
		 FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
		 
		 
		 LogHelper.info("Initilization complete");
	     //
		 
	 }
	 @Mod.EventHandler
	 public void postInit(FMLPostInitializationEvent event)
	 {
		 LogHelper.info("Post Initialization complete");
	 }

}
