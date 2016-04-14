package com.example.tanishka.cpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Array extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
    }
    public void start5(View view) {
        Intent intent = new Intent(this, Quiz4.class);

        startActivity(intent);
    }

}
