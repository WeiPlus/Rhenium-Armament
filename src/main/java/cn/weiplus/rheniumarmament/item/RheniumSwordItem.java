
package cn.weiplus.rheniumarmament.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import cn.weiplus.rheniumarmament.init.RheniumArmamentModItems;

public class RheniumSwordItem extends SwordItem {
	public RheniumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1700;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 3.5f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RheniumArmamentModItems.RHENIUM_INGOT.get()));
			}
		}, 3, -1f, new Item.Properties().fireResistant());
	}
}
