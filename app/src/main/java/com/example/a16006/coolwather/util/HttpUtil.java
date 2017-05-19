package com.example.a16006.coolwather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 16006 on 2017/5/8.
 */

public class HttpUtil {
    public static void sendOKHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
