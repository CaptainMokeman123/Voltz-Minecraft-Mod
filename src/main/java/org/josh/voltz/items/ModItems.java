package org.josh.voltz.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.josh.voltz.Voltz;

import static org.josh.voltz.blocks.ModBlocks.*;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS , Voltz.MODID);

    public static final RegistryObject<Item> METERLERGICAL_COAL_ORE_ITEM = ITEMS.register("meterlergical_coal_ore",
            () -> new BlockItem(METCOAL.get(), new Item.Properties()));

    public static final RegistryObject<Item> METERLERGICAL_COAL = ITEMS.register("meterlergical_coal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COKE = ITEMS.register("coke",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_ORE_ITEM = ITEMS.register("blockOreTin",
            () -> new BlockItem(TIN_ORE.get(), new Item.Properties()));

    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("blockOreCopper",
            () -> new BlockItem(COPPER_ORE.get(), new Item.Properties()));

    public static final RegistryObject<Item> URANIUM_ORE_ITEM = ITEMS.register("blockOreUranium",
            () -> new BlockItem(URANIUM_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item>LEAD_ORE_ITEM = ITEMS.register("meterlergical_coal_ore",
            () -> new BlockItem(METCOAL.get(), new Item.Properties()));
    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
