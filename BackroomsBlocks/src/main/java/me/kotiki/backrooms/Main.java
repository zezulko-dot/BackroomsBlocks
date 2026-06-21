package me.kotiki.backrooms;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.registry.Registries;
import cn.nukkit.registry.RegisterException;

import me.kotiki.backrooms.blocks.*;

public class Main extends PluginBase {

    @Override
    public void onLoad() {

        try {
            Registries.BLOCK.registerCustomBlock(this, YellowWallpaperBlock.class);
            Registries.BLOCK.registerCustomBlock(this, CeilingTileBlock.class);
            Registries.BLOCK.registerCustomBlock(this, DampCarpetBlock.class);

        } catch (RegisterException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onEnable() {
        getLogger().info("Backrooms blocks loaded!");
    }
}