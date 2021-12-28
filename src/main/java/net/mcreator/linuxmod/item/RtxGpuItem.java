
package net.mcreator.linuxmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.linuxmod.itemgroup.GpusItemGroup;
import net.mcreator.linuxmod.LinuxModModElements;

@LinuxModModElements.ModElement.Tag
public class RtxGpuItem extends LinuxModModElements.ModElement {
	@ObjectHolder("linux_mod:rtx_gpu")
	public static final Item block = null;
	public RtxGpuItem(LinuxModModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 400f;
			}

			public float getAttackDamage() {
				return 398f;
			}

			public int getHarvestLevel() {
				return 100;
			}

			public int getEnchantability() {
				return 200;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(GpuItem.block));
			}
		}, 1, 96f, new Item.Properties().group(GpusItemGroup.tab)) {
		}.setRegistryName("rtx_gpu"));
	}
}
