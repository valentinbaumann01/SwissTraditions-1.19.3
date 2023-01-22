package net.valentinbaumann01.swisstraditions.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import net.valentinbaumann01.swisstraditions.SwissTraditions;

@Mod.EventBusSubscriber(modid = SwissTraditions.MODID_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab SIWSSTRADITION_TAB;

    private static String resourceName = "swisstraditions_tab";
    private static String displayName = "Swiss Traditions Tab";
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        SIWSSTRADITION_TAB = event.registerCreativeModeTab(
            //resource name
            new ResourceLocation(
                    SwissTraditions.MODID_ID, resourceName
            ),
            //display icon
            builder -> builder.icon(() ->
                //display image
                new ItemStack(
                        ModItems.CHEESE.get()
                )
            )
            //display name
            .title(Component.literal(displayName)).build()
        );
    }


}
