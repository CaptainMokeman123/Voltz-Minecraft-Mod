package org.josh.voltz.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.josh.voltz.Voltz;


public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Voltz.MODID);

    public static final RegistryObject<Block> METCOAL = BLOCKS.register("metallurgical_coal_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("blockOreTin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.STONE)));

    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("blockOreCopper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).mapColor(MapColor.STONE)));

    public static final RegistryObject<Block> LEADORE = BLOCKS.register("blockOreLead",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).mapColor(MapColor.STONE)));

    public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("blockOreUran",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).mapColor(MapColor.STONE)));
        public static void register(IEventBus eventBus) {BLOCKS.register(eventBus);}









}
