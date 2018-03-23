package com.example.dell.assignment22mar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name, pwd;
    public static String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Created activity");
    }

    public void LoginHandler(View view) {
        switch (view.getId()){
            case R.id.button:
                Log.i(TAG,"Login Button Clicked");
                name = (EditText)findViewById(R.id.editText);
                pwd = (EditText)findViewById(R.id.editText2);
                String uname = name.getText().toString();
                String upwd = pwd.getText().toString();
                Intent loginIntent = new Intent(MainActivity.this, HomeActivity.class);
                loginIntent.putExtra(Constants.KEY1, uname);
                loginIntent.putExtra(Constants.KEY2, upwd);
                startActivity(loginIntent);
                break;

            case R.id.button2:
                Log.i(TAG,"Cancel button clicked");
                name = (EditText)findViewById(R.id.editText);
                pwd = (EditText)findViewById(R.id.editText2);
                name.setText("");
                pwd.setText("");


        }
    }
}
