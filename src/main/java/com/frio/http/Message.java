package com.frio.http;

/**
 *
 * Created by frio on 16-6-12.
 */
public abstract class Message {
    byte[] datas;

    public byte[] getBytesArray(){
        return datas;
    }
}
