package me.kotiki.backrooms.blocks;

import cn.nukkit.block.Block;
import cn.nukkit.block.BlockProperties;
import cn.nukkit.block.BlockState;
import cn.nukkit.block.customblock.CustomBlock;
import cn.nukkit.block.customblock.CustomBlockDefinition;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DampCarpetBlock extends Block implements CustomBlock {

    public static final BlockProperties PROPERTIES =
            new BlockProperties("backrooms:damp_carpet");

    public DampCarpetBlock() {
        super(PROPERTIES.getDefaultState());
    }

    public DampCarpetBlock(@Nullable BlockState state) {
        super(state);
    }

    @Override
    public @NotNull BlockProperties getProperties() {
        return PROPERTIES;
    }

    @Override
    public CustomBlockDefinition getDefinition() {
        return CustomBlockDefinition.builder(this)
                .texture("damp_carpet")
                .name("Damp Carpet")
                .build();
    }
}