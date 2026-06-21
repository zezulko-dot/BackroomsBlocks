package me.kotiki.backrooms.blocks;

import cn.nukkit.block.Block;
import cn.nukkit.block.BlockProperties;
import cn.nukkit.block.BlockState;
import cn.nukkit.block.customblock.CustomBlock;
import cn.nukkit.block.customblock.CustomBlockDefinition;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class YellowWallpaperBlock extends Block implements CustomBlock {

    public static final BlockProperties PROPERTIES =
            new BlockProperties("backrooms:yellow_wallpaper");

    public YellowWallpaperBlock() {
        super(PROPERTIES.getDefaultState());
    }

    public YellowWallpaperBlock(@Nullable BlockState state) {
        super(state);
    }

    @Override
    public @NotNull BlockProperties getProperties() {
        return PROPERTIES;
    }

    @Override
    public CustomBlockDefinition getDefinition() {
        return CustomBlockDefinition.builder(this)
                .texture("yellow_wallpaper")
                .name("Yellow Wallpaper")
                .build();
    }

    @Override
    public double getHardness() {
        return 1;
    }
}