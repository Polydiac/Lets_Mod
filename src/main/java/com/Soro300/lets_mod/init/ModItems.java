package com.Soro300.lets_mod.init;

import com.Soro300.lets_mod.item.ItemGermanFlag;
import com.Soro300.lets_mod.item.Itemlm;
import cpw.mods.fml.common.registry.GameRegistry;
import com.Soro300.lets_mod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final Itemlm germanFlag = new ItemGermanFlag();
	
	
	public static void init () {
		GameRegistry.registerItem(germanFlag, "germanFlag");
	}

}
