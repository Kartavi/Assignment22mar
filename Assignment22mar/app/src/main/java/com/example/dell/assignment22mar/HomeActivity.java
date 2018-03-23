package com.example.dell.assignment22mar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    public static String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.i(TAG, "HomeActivity created");
        String str1 = getIntent().getExtras().getString(Constants.KEY1);
        String str2 = getIntent().getExtras().getString(Constants.KEY2);
        TextView result = (TextView)findViewById(R.id.textView);
        result.setText("Welcome to Assignment "+ str1+" ur password is: "+str2);
    }
}
