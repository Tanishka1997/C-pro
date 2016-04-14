package com.example.tanishka.cpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Functions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functions);
    }
    public void start3(View view) {
        Intent intent = new Intent(this, quiz3.class);

        startActivity(intent);
    }

}
