package com.frio.http;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by frio on 16-6-12.
 */
public class HttpHeader {
    private Map<String, String> values = new HashMap<String, String>();

    public String getHeader(String headerName){
        return values.get(headerName);
    }

    public String getCookieValue(String cookieName){
        return null;
    }
}
