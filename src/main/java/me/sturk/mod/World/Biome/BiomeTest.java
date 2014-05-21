package me.sturk.mod.World.Biome;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeTest extends BiomeGenBase {
	public final Material blockMaterial;

	public BiomeTest(int par1) {
		super(par1);
		this.blockMaterial = Material.water;
		this.topBlock = Blocks.diamond_block;
		this.fillerBlock = Blocks.emerald_block;
		this.setBiomeName("Get Rich");
		this.waterColorMultiplier = 0xE42D17;
	}

	@Override
	public boolean canSpawnLightningBolt() {
		return true;
	}

	@Override
	public boolean getEnableSnow() {
		return false;
	}

}
