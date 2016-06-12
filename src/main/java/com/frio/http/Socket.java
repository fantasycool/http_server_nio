package com.frio.http;

import java.nio.channels.SocketChannel;

/**
 * add other info to Socket Chanel
 * Created by frio on 16-6-12.
 */
public class Socket {
    private SocketChannel socketChannel;

    public Socket(SocketChannel socketChannel) {

        this.socketChannel = socketChannel;
    }

    public SocketChannel getSocketChannel() {
        return socketChannel;
    }

    public void setSocketChannel(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
    }
}
