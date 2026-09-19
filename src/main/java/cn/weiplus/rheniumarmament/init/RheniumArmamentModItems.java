
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.weiplus.rheniumarmament.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import cn.weiplus.rheniumarmament.item.RheniumIngotItem;
import cn.weiplus.rheniumarmament.RheniumArmamentMod;

public class RheniumArmamentModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RheniumArmamentMod.MODID);
	public static final RegistryObject<Item> RHENIUM_INGOT = REGISTRY.register("rhenium_ingot", () -> new RheniumIngotItem());
	public static final RegistryObject<Item> RHENIUM_ORE = block(RheniumArmamentModBlocks.RHENIUM_ORE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
