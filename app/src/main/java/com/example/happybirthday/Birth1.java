package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Birth1 extends AppCompatActivity {
   EditText ed1;
   Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth1);
        bt=(Button) findViewById(R.id.btNext);
        ed1=(EditText) findViewById(R.id.edName);

        bt.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nw = ed1.getText().toString();
                if(TextUtils.isEmpty(nw)){
                   Toast.makeText( Birth1.this, "Please Enter The name", Toast.LENGTH_SHORT ).show();
                }
                else{
                    Intent intent = new Intent(Birth1.this,Birth2.class);
                    intent.putExtra( "edNameBirth",nw );
                    startActivity( intent );
                    finish();
                }
            }
        } );
    }
}