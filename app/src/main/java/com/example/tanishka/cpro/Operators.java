package com.example.tanishka.cpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Operators extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators);
    }
 public void start2(View view)
 {
     Intent intent=new Intent(this,Quiz2.class);

     startActivity(intent);
 }
}
