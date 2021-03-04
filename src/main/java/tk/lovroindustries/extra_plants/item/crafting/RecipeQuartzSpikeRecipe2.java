
package tk.lovroindustries.extra_plants.item.crafting;

import tk.lovroindustries.extra_plants.item.ItemQuartzSpike;
import tk.lovroindustries.extra_plants.ElementsExtraPlantsMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

@ElementsExtraPlantsMod.ModElement.Tag
public class RecipeQuartzSpikeRecipe2 extends ElementsExtraPlantsMod.ModElement {
	public RecipeQuartzSpikeRecipe2(ElementsExtraPlantsMod instance) {
		super(instance, 15);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.QUARTZ, (int) (1)), new ItemStack(ItemQuartzSpike.block, (int) (1)), 1F);
	}
}
