package com.frio.http;

import java.net.Socket;
import java.nio.ByteBuffer;

/**
 * Created by frio on 16-6-12.
 */
public interface MessageReader {
    Message read(Socket socket);
}
