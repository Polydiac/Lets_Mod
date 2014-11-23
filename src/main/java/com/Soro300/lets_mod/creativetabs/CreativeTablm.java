package com.Soro300.lets_mod.creativetabs;

import com.Soro300.lets_mod.init.ModItems;
import com.Soro300.lets_mod.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTablm {
	public static final CreativeTabs lm_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		@Override
		public Item getTabIconItem() {
			return ModItems.germanFlag;
		}

	};

}
