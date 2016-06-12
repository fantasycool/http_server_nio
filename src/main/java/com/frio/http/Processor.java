package com.frio.http;

/**
 * Created by frio on 16-6-12.
 */
public interface Processor {
    void process(Message message, Context context);
}
