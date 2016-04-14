package com.example.tanishka.cpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Basic(View view) {
        Intent intent = new Intent(this, Basics.class);
        startActivity(intent);
    }

    public void array(View view) {
        Intent intent = new Intent(this, Array.class);
        startActivity(intent);
    }

    public void operators(View view) {
        Intent intent = new Intent(this, Operators.class);
        startActivity(intent);
    }

    public void functions(View view) {
        Intent intent = new Intent(this, Functions.class);
        startActivity(intent);
    }
   public  void structures(View view)
   {   Intent intent = new Intent(this, Structures.class);
       startActivity(intent);

   }
}