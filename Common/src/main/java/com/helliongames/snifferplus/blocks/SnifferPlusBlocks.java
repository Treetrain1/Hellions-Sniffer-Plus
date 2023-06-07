package com.helliongames.snifferplus.blocks;

import com.helliongames.snifferplus.Constants;
import com.helliongames.snifferplus.mixin.ButtonBlockAccessor;
import com.helliongames.snifferplus.mixin.DoorBlockAccessor;
import com.helliongames.snifferplus.mixin.PressurePlateBlockAccessor;
import com.helliongames.snifferplus.mixin.SaplingBlockAccessor;
import com.helliongames.snifferplus.mixin.StairBlockAccessor;
import com.helliongames.snifferplus.mixin.TallGrassBlockAccessor;
import com.helliongames.snifferplus.mixin.TrapDoorBlockAccessor;
import com.helliongames.snifferplus.world.level.block.grower.StonePineTreeGrower;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.HashMap;
import java.util.Map;

public class SnifferPlusBlocks {
    private static final Map<ResourceLocation, Block> blocks = new HashMap<>();

    public static final Block STONE_PINE_PLANKS = registerBlock("stone_pine_planks", new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0f, 3.0f).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block STONE_PINE_SAPLING = registerBlock("stone_pine_sapling", SaplingBlockAccessor.createSaplingBlock(new StonePineTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final Block STONE_PINE_LOG = registerBlock("stone_pine_log", new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0f).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block STRIPPED_STONE_PINE_LOG = registerBlock("stripped_stone_pine_log", new RotatedPillarBlock(BlockBehaviour.Properties.copy(STONE_PINE_LOG)));
    public static final Block STONE_PINE_WOOD = registerBlock("stone_pine_wood", new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_STONE_PINE_WOOD = registerBlock("stripped_stone_pine_wood", new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block STONE_PINE_LEAVES = registerBlock("stone_pine_leaves", new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final Block STONE_PINE_STAIRS = registerBlock("stone_pine_stairs", StairBlockAccessor.createStairBlock(STONE_PINE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_PINE_PLANKS)));
    public static final Block STONE_PINE_SLAB = registerBlock("stone_pine_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final Block STONE_PINE_SIGN = registerBlock("stone_pine_sign", new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), SnifferPlusWoodTypes.STONE_PINE));
    public static final Block STONE_PINE_WALL_SIGN = registerBlock("stone_pine_wall_sign", new WallSignBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0f).dropsLike(STONE_PINE_SIGN).ignitedByLava(), SnifferPlusWoodTypes.STONE_PINE));
    public static final Block STONE_PINE_HANGING_SIGN = registerBlock("stone_pine_hanging_sign", new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), SnifferPlusWoodTypes.STONE_PINE));
    public static final Block STONE_PINE_WALL_HANGING_SIGN = registerBlock("stone_pine_wall_hanging_sign", new WallHangingSignBlock(BlockBehaviour.Properties.of().mapColor(STONE_PINE_LOG.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0f).ignitedByLava().dropsLike(STONE_PINE_HANGING_SIGN), SnifferPlusWoodTypes.STONE_PINE));
    public static final Block STONE_PINE_DOOR = registerBlock("stone_pine_door", DoorBlockAccessor.createDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), SnifferPlusBlockSetTypes.STONE_PINE));
    public static final Block STONE_PINE_TRAPDOOR = registerBlock("stone_pine_trapdoor", TrapDoorBlockAccessor.createTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), SnifferPlusBlockSetTypes.STONE_PINE));
    public static final Block STONE_PINE_PRESSURE_PLATE = registerBlock("stone_pine_pressure_plate", PressurePlateBlockAccessor.createPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), SnifferPlusBlockSetTypes.STONE_PINE));
    public static final Block STONE_PINE_BUTTON = registerBlock("stone_pine_button", ButtonBlockAccessor.createButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), SnifferPlusBlockSetTypes.STONE_PINE, 30, true));
    public static final Block STONE_PINE_FENCE = registerBlock("stone_pine_fence", new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final Block STONE_PINE_FENCE_GATE = registerBlock("stone_pine_fence_gate", new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SnifferPlusWoodTypes.STONE_PINE));
    public static final Block POTTED_STONE_PINE_SAPLING = registerBlock("potted_stone_pine_sapling", new FlowerPotBlock(STONE_PINE_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING)));

    public static final IvyBodyBlock IVY_BODY = (IvyBodyBlock) registerBlock("ivy_body", new IvyBodyBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final IvyHeadBlock IVY_HEAD = (IvyHeadBlock) registerBlock("ivy_head", new IvyHeadBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final Block FIDDLEFERN = registerBlock("fiddlefern", TallGrassBlockAccessor.createTallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final Block TALL_FIDDLEFERN = registerBlock("tall_fiddlefern", new DoublePlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));


    private static Block registerBlock(String identifier, Block block) {
        blocks.put(new ResourceLocation(Constants.MOD_ID, identifier), block);
        return block;
    }

    public static void register() {
        for (Map.Entry<ResourceLocation, Block> entry : blocks.entrySet()) {
            Registry.register(BuiltInRegistries.BLOCK, entry.getKey(), entry.getValue());
        }
    }
}