package com.frio.http;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * get connection operation
 * Created by frio on 16-6-12.
 */
public class Reactor implements Runnable {
    Server server;

    public Reactor(Server server){
        this.server = server;
    }
    public void run() {
        try {
            Selector selector = Selector.open();
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.socket().bind(new InetSocketAddress(server.getInetAddress(), server.getPort()));
            serverSocketChannel.configureBlocking(false);
            SelectionKey selectionKey = serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            while(true) {
                if(server.isShutDown){
                    System.out.println("shutdown server now!");
                    break;
                }
                selector.select();
                Socket socket = new Socket(serverSocketChannel.accept());
                boolean b = server.acceptedSockets.offer(socket);
                if (!b){
                    //TODO
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
