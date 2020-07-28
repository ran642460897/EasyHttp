package com.lieni.easyhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lieni.library.EasyBuilder;
import com.lieni.library.EasyHttp;
import com.lieni.library.interceptor.ResponseCodeInterceptor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EasyBuilder builder=new EasyBuilder(getApplication(),"http://www.baidu.com/")
                .addHeader("systemName","11")
                .addHeader("versionNum","11")
                .addInterceptor(new ResponseCodeInterceptor() {
                    @Override
                    public void onResponse(int code) {

                    }
                });


        EasyHttp.init(builder);
    }
}
