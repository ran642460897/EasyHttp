package com.lieni.library.interceptor;

import android.content.Intent;


import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http2.Header;

public class HeaderInterceptor implements Interceptor {
    private List<Header> headers;
    public HeaderInterceptor(List<Header> headers) {
        this.headers=headers;
    }

    @NotNull
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        Request.Builder requestBuilder = original.newBuilder();
        if(headers!=null){
            for (Header header:headers){
                requestBuilder.addHeader(header.name.toString(),header.value.toString());
            }
        }
        return chain.proceed(requestBuilder.build());
    }
}
