
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.weiplus.rheniumarmament.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import cn.weiplus.rheniumarmament.block.RheniumOreBlock;
import cn.weiplus.rheniumarmament.block.QROBlock;
import cn.weiplus.rheniumarmament.RheniumArmamentMod;

public class RheniumArmamentModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RheniumArmamentMod.MODID);
	public static final RegistryObject<Block> RHENIUM_ORE = REGISTRY.register("rhenium_ore", () -> new RheniumOreBlock());
	public static final RegistryObject<Block> QRO = REGISTRY.register("qro", () -> new QROBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
