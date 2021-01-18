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
package net.mcreator.mod;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.block.Block;

import net.mcreator.mod.item.CacaDustItem;
import net.mcreator.mod.item.CacaArmorArmorMaterial;
import net.mcreator.mod.block.CacaOreBlock;
import net.mcreator.mod.block.CacaBlockBlock;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class ModMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Item CacaDust_ITEM = Registry.register(Registry.ITEM, id("caca_dust"), new CacaDustItem());
	public static final Block CacaOre_BLOCK = Registry.register(Registry.BLOCK, id("caca_ore"), new CacaOreBlock());
	public static final BlockItem CacaOre_ITEM = Registry.register(Registry.ITEM, id("caca_ore"),
			new BlockItem(CacaOre_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	public static final Block CacaBlock_BLOCK = Registry.register(Registry.BLOCK, id("caca_block"), new CacaBlockBlock());
	public static final BlockItem CacaBlock_ITEM = Registry.register(Registry.ITEM, id("caca_block"),
			new BlockItem(CacaBlock_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	public static final Item CacaArmor_HELMET = Registry.register(Registry.ITEM, id("caca_armor_helmet"),
			new ArmorItem(CacaArmorArmorMaterial.CACAARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item CacaArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("caca_armor_chestplate"),
			new ArmorItem(CacaArmorArmorMaterial.CACAARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item CacaArmor_LEGGINGS = Registry.register(Registry.ITEM, id("caca_armor_leggings"),
			new ArmorItem(CacaArmorArmorMaterial.CACAARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item CacaArmor_BOOTS = Registry.register(Registry.ITEM, id("caca_armor_boots"),
			new ArmorItem(CacaArmorArmorMaterial.CACAARMOR, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item CacaPickaxe_TOOL = Registry.register(Registry.ITEM, id("caca_pickaxe"), CacaPickaxeTool.INSTANCE);
	public static final Item CacaAxe_TOOL = Registry.register(Registry.ITEM, id("caca_axe"), CacaAxeTool.INSTANCE);
	public static final Item CacaSword_TOOL = Registry.register(Registry.ITEM, id("caca_sword"), CacaSwordTool.INSTANCE);
	public static final Item CacaShovel_TOOL = Registry.register(Registry.ITEM, id("caca_shovel"), CacaShovelTool.INSTANCE);
	public static final Item CacaHoe_TOOL = Registry.register(Registry.ITEM, id("caca_hoe"), CacaHoeTool.INSTANCE);
	public void onInitialize() {
		LOGGER.info("Initializing ModMod");
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("mod", s);
	}
}
