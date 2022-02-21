package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread= new Thread(){
          @Override
            public void run() {
              try {
                  sleep(3000);
                  Intent intent= new Intent(MainActivity.this,Birth1.class);
                  startActivity(intent);
                  finish();
              }
              catch (Exception e){

              }
              super.run();
          }

        };
        thread.start();
    }
}