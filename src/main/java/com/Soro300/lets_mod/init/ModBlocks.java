package com.Soro300.lets_mod.init;

import com.Soro300.lets_mod.block.BlockChocolate;
import com.Soro300.lets_mod.block.Blocklm;
import cpw.mods.fml.common.registry.GameRegistry;
import com.Soro300.lets_mod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static final Blocklm chocolate = new BlockChocolate();
	
	public static void init () {
		GameRegistry.registerBlock(chocolate, "chocolate");
	}
	
	

}
