package com.angelis.tera.game.presentation.network.packet.client;

import java.nio.ByteBuffer;

import com.angelis.tera.game.presentation.network.connection.TeraGameConnection;
import com.angelis.tera.game.presentation.network.packet.TeraClientPacket;

public class CM_PLAYER_INSPECT extends TeraClientPacket {

    public CM_PLAYER_INSPECT(final ByteBuffer byteBuffer, final TeraGameConnection connection) {
        super(byteBuffer, connection);
    }

    @Override
    protected void readImpl() {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void runImpl() {
        // TODO Auto-generated method stub
        
    }

}
