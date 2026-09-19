
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.weiplus.rheniumarmament.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import cn.weiplus.rheniumarmament.RheniumArmamentMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RheniumArmamentModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RheniumArmamentMod.MODID);
	public static final RegistryObject<CreativeModeTab> RA = REGISTRY.register("ra",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.rhenium_armament.ra")).icon(() -> new ItemStack(RheniumArmamentModItems.RHENIUM_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RheniumArmamentModItems.RHENIUM_INGOT.get());
				tabData.accept(RheniumArmamentModBlocks.RHENIUM_ORE.get().asItem());
				tabData.accept(RheniumArmamentModBlocks.QRO.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(RheniumArmamentModItems.RHENIUM_INGOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(RheniumArmamentModBlocks.RHENIUM_ORE.get().asItem());
			tabData.accept(RheniumArmamentModBlocks.QRO.get().asItem());
		}
	}
}
