package com.example.codelabs_adf_unit1_getstarted_11_helloworld_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(LOG_TAG,"LOG TAG Message for Verbose-lowest priority");
        Log.d(LOG_TAG,"LOG TAG Message for Debug");
        Log.i(LOG_TAG,"LOG TAG Message for Info");
        Log.w(LOG_TAG,"LOG TAG Message for Warning");
        Log.e(LOG_TAG,"LOG TAG Message for Error");

    }
}
