
/*
*    MCreator note:
*
*    If you lock base mod element files, you can edit this file and the proxy files
*    and they won't get overwritten. If you change your mod package or modid, you
*    need to apply these changes to this file MANUALLY.
*
*
*    If you do not lock base mod element files in Workspace settings, this file
*    will be REGENERATED on each build.
*
*/
package net.mcreator.mod.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class CacaDustItem extends Item {
	public CacaDustItem() {
		super(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));
	}

	@Override
	public int getMaxUseTime(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
		return (float) (1F);
	}

	@Override
	public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
		if (slot == EquipmentSlot.MAINHAND) {
			return ImmutableMultimap.of(EntityAttributes.GENERIC_ATTACK_DAMAGE,
					new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "item_damage", (double) -2, EntityAttributeModifier.Operation.ADDITION),
					EntityAttributes.GENERIC_ATTACK_SPEED,
					new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "item_attack_speed", -2.4, EntityAttributeModifier.Operation.ADDITION));
		}
		return super.getAttributeModifiers(slot);
	}

	@Override
	public int getEnchantability() {
		return 0;
	}
}
