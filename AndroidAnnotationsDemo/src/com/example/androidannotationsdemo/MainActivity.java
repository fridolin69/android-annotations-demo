package com.example.androidannotationsdemo;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import android.app.Activity;
import android.content.Intent;

import com.example.androidannotationsdemo.test.SecondActivity_;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @Click
    void button1(){
        startActivity(new Intent(this, SecondActivity_.class));
    }


}
