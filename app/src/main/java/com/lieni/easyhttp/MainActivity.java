package com.lieni.easyhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lieni.library.EasyBuilder;
import com.lieni.library.EasyHttp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EasyHttp.init(new  EasyBuilder(getApplication(),"test"));
    }
}
