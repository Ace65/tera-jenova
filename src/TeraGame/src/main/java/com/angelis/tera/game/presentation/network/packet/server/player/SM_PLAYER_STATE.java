package com.angelis.tera.game.presentation.network.packet.server.player;

import java.nio.ByteBuffer;

import com.angelis.tera.game.presentation.network.connection.TeraGameConnection;
import com.angelis.tera.game.presentation.network.packet.TeraServerPacket;
import com.angelis.tera.game.process.model.player.Player;

public class SM_PLAYER_STATE extends TeraServerPacket {

    private final Player player;
    
    public SM_PLAYER_STATE(final Player player) {
        this.player = player;
    }

    @Override
    protected void writeImpl(final TeraGameConnection connection, final ByteBuffer byteBuffer) {
        writeUid(byteBuffer, player);
        writeD(byteBuffer, player.getPlayerMode().value);
        writeC(byteBuffer, 0);
    }

}
