package fi.dy.masa.minihud.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket.class)
public interface IMixinChunkDeltaUpdateS2CPacket
{
    @Accessor("chunkPos")
    net.minecraft.util.math.ChunkPos getChunkPos();
}
