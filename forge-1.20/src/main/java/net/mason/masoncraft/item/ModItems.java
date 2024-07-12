package net.mason.masoncraft.item;

import net.mason.masoncraft.Masoncraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            // DeferredRegister = long list of things (items)
            // Registered at a specific time (when forge loads the items)
            DeferredRegister.create(ForgeRegistries.ITEMS, Masoncraft.MODID);

    // Create an item object
    public static final RegistryObject<Item> ITEM = ITEMS.register("item",
            // Supplier () ->
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLURP = ITEMS.register("blurp",
            // Supplier () ->
            () -> new Item(new Item.Properties()));

    // Register the deferred register
    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }

}
