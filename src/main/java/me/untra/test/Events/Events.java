package me.untra.test.Events;

import me.untra.test.Test;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class Events implements Listener {
    @EventHandler
    public void OnBreak(BlockBreakEvent e) {
        if (Test.getInstance().getConfig().contains(e.getBlock().getType().name())) {
            e.setDropItems(false);
            ItemStack itemStack = new ItemStack(Material.DIAMOND, Test.getInstance().getConfig().getInt(e.getBlock().getType().name()));
            e.getPlayer().getInventory().addItem(itemStack);
        }
    }
}
