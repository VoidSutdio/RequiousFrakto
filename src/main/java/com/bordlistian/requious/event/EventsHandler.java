package com.bordlistian.requious.event;

import com.bordlistian.requious.Requious;
import com.bordlistian.requious.gui.ContainerAssembly;
import com.bordlistian.requious.tile.TileEntityAssembly;
import net.minecraftforge.event.entity.player.PlayerContainerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Requious.MODID)
public class EventsHandler {

    @SubscribeEvent
    public static void onPlayerContainerOpen(PlayerContainerEvent.Open event) {
        if (event.getContainer() instanceof ContainerAssembly container) {
            TileEntityAssembly assembly = (TileEntityAssembly) container.getProcessor().getTile();

            assembly.setGuiContainerOpen(true);
        }
    }

    @SubscribeEvent
    public static void onPlayerContainerClosed(PlayerContainerEvent.Close event) {
        if (event.getContainer() instanceof ContainerAssembly container) {
            TileEntityAssembly assembly = (TileEntityAssembly) container.getProcessor().getTile();

            assembly.setGuiContainerOpen(false);
        }
    }
}
