
package net.mcreator.linuxmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.linuxmod.LinuxModModElements;

@LinuxModModElements.ModElement.Tag
public class GpuItem extends LinuxModModElements.ModElement {
	@ObjectHolder("linux_mod:gpu")
	public static final Item block = null;
	public GpuItem(LinuxModModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 40f;
			}

			public float getAttackDamage() {
				return 38f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, 6f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("gpu"));
	}
}
