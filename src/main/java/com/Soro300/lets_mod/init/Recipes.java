package com.Soro300.lets_mod.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init() {
		
	
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack (ModItems.germanFlag), "bbb" , "rrr" , "yyy", 'b' , new ItemStack(Items.beef),'r' , new ItemStack(Items.chicken) , 'y' , new ItemStack(Items.book) ));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.chocolate) , new ItemStack(ModItems.germanFlag)));
		
	}

}
