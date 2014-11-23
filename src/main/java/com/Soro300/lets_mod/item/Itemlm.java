package com.Soro300.lets_mod.item;

import com.Soro300.lets_mod.creativetabs.CreativeTablm;
import com.Soro300.lets_mod.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Itemlm extends Item {
	public Itemlm () {
		super();
		this.setCreativeTab(CreativeTablm.lm_TAB);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	//GitHub Pahimar
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
	    return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	//GitHub Pahimar
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
	    itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	//GitHub Pahimar
	 
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
    //GitHub Pahimar
}
