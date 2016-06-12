package com.frio.http;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * we use two thread pools, one is for acceptor,the other is for io processor
 * Created by frio on 16-6-12.
 */
public class Server {
    private InetAddress inetAddress;
    private List<Processor> processorList;
    private int port;
    volatile boolean isShutDown = false;
    BlockingQueue<Socket> acceptedSockets = new ArrayBlockingQueue<Socket>(1024);

    public Server(InetAddress inetAddress, List<Processor> processorList){
        this.inetAddress = inetAddress;
        this.processorList = processorList;
    }
    /**
     * start http server
     */
    public void start(){

    }

    /**
     * stop http server
     */
    public void stop(){

    }

    public InetAddress getInetAddress() {
        return inetAddress;
    }

    public void setInetAddress(InetAddress inetAddress) {
        this.inetAddress = inetAddress;
    }

    public List<Processor> getProcessorList() {
        return processorList;
    }

    public void setProcessorList(List<Processor> processorList) {
        this.processorList = processorList;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
