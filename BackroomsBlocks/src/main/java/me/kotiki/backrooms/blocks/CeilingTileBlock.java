package me.kotiki.backrooms.blocks;

import cn.nukkit.block.Block;
import cn.nukkit.block.BlockProperties;
import cn.nukkit.block.BlockState;
import cn.nukkit.block.customblock.CustomBlock;
import cn.nukkit.block.customblock.CustomBlockDefinition;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CeilingTileBlock extends Block implements CustomBlock {

    public static final BlockProperties PROPERTIES =
            new BlockProperties("backrooms:ceiling_tile");

    public CeilingTileBlock() {
        super(PROPERTIES.getDefaultState());
    }

    public CeilingTileBlock(@Nullable BlockState state) {
        super(state);
    }

    @Override
    public @NotNull BlockProperties getProperties() {
        return PROPERTIES;
    }

    @Override
    public CustomBlockDefinition getDefinition() {
        return CustomBlockDefinition.builder(this)
                .texture("ceiling_tile")
                .name("Ceiling Tile")
                .build();
    }
}