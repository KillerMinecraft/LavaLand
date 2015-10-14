package com.ftwinston.KillerMinecraft.Modules.LavaLand;

import org.bukkit.Material;

import com.ftwinston.KillerMinecraft.WorldGenerator;
import com.ftwinston.KillerMinecraft.WorldGeneratorPlugin;

public class Plugin extends WorldGeneratorPlugin
{
	@Override
	public String[] getDescriptionText() { return new String[] {"Add more lava to an", "otherwise-normal world"}; }
	
	@Override
	public Material getMenuIcon() { return Material.LAVA_BUCKET; }
	
	@Override
	public WorldGenerator createInstance()
	{
		return new LavaLand();
	}
}