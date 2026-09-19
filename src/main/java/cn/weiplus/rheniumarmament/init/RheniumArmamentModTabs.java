
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.weiplus.rheniumarmament.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import cn.weiplus.rheniumarmament.RheniumArmamentMod;

public class RheniumArmamentModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RheniumArmamentMod.MODID);
	public static final RegistryObject<CreativeModeTab> RA = REGISTRY.register("ra",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.rhenium_armament.ra")).icon(() -> new ItemStack(Items.CHAINMAIL_CHESTPLATE)).displayItems((parameters, tabData) -> {
				tabData.accept(RheniumArmamentModItems.RHENIUM_INGOT.get());
			}).build());
}
