package com.lieni.library.interceptor;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public abstract class ResponseCodeInterceptor implements Interceptor {

    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        Request original = chain.request();
        Response response = chain.proceed(original);
        onResponse(response.code());
        return response;
    }
    public abstract void onResponse(int code);
}
