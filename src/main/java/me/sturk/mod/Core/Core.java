package me.sturk.mod.Core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import me.sturk.mod.World.Biome.BiomeTest;
import net.minecraft.world.biome.BiomeGenBase;

@Mod(modid="mod", name="Mod", version="1.0")
public class Core {

	public static BiomeGenBase biomeTest;
	public int biomeTestID;

	@Mod.Instance
	public static Core instance;

	@Mod.EventHandler
	public void PreInit(FMLInitializationEvent event) {
		instance.biomeTest = new BiomeTest(Core.instance.biomeTestID);
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public void PostInit(FMLPostInitializationEvent event) {

	}
}
