package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class Birth2 extends AppCompatActivity {

    TextView tv;
    MediaPlayer mediaPlayer =new MediaPlayer();

    @Override
    public void onBackPressed() {
        mediaPlayer.stop();
        finish();
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth2);
        tv = (TextView) findViewById( R.id.tvDisplay );
        Intent intent = getIntent();
        String nameTo=intent.getStringExtra("edNameBirth");
        tv.setText( "Happy BirthDay "+nameTo );

        mediaPlayer=MediaPlayer.create( Birth2.this,R.raw.happy );

        mediaPlayer.start();

    }
}