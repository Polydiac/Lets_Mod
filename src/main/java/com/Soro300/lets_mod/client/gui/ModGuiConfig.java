package com.Soro300.lets_mod.client.gui;

import com.Soro300.lets_mod.handler.ConfigurationHandler;
import com.Soro300.lets_mod.reference.Reference;
import com.Soro300.lets_mod.utility.LogHelper;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;

public class ModGuiConfig extends GuiConfig{
	public ModGuiConfig(GuiScreen guiScreen){
		super(guiScreen,
				new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MOD_ID,
				false,
				false,
				GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
		LogHelper.info("GuiConfig System loaded");
	}
	

}
