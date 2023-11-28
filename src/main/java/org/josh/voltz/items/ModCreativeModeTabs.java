package org.josh.voltz.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import static org.josh.voltz.Voltz.MODID;
import static org.josh.voltz.items.ModItems.*;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static void register(IEventBus eventBus) { CREATIVE_MODE_TABS.register(eventBus); }
    public static final RegistryObject<CreativeModeTab> VOLTZ_MAIN_TAB = CREATIVE_MODE_TABS.register("voltz_base",
                    () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(METERLERGICAL_COAL.get()))
                    .title(Component.translatable("creativetab.voltz_main_tab"))
                    .displayItems((parameters, output) -> {

                                            output.accept(METERLERGICAL_COAL.get());
                                            output.accept(METERLERGICAL_COAL_ORE_ITEM.get());
                                            output.accept(COKE.get());
                                            output.accept(STEEL_INGOT.get());
                                            output.accept(TIN_ORE_ITEM.get());
                                            output.accept(URANIUM_ORE_ITEM.get());
                                            output.accept(LEAD_ORE_ITEM.get());
                                            output.accept(COPPER_ORE_ITEM.get());






            }).build());







}
