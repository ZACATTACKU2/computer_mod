
package net.mcreator.linuxmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.linuxmod.item.GpuItem;
import net.mcreator.linuxmod.LinuxModModElements;

@LinuxModModElements.ModElement.Tag
public class GpusItemGroup extends LinuxModModElements.ModElement {
	public GpusItemGroup(LinuxModModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabgpus") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GpuItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
