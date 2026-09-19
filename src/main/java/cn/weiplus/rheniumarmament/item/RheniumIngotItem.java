
package cn.weiplus.rheniumarmament.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RheniumIngotItem extends Item {
	public RheniumIngotItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
