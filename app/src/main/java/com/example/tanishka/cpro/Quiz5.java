package com.example.tanishka.cpro;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Quiz5 extends AppCompatActivity {
    String ans1="",ans2="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
    }
    public  void  onclickRadio51(View view)
    { RadioButton r51;

        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.a51:
                if(checked)
                {r51= (RadioButton) findViewById(R.id.a51);
                    ans1=r51.getText().toString();}
                break;
            case R.id.b51:
                if(checked)
                { r51= (RadioButton) findViewById(R.id.b51);ans1=r51.getText().toString();}break;
            case R.id.c51:
                if(checked)
                {  r51= (RadioButton) findViewById(R.id.c51); ans1=r51.getText().toString();}break;
            case R.id.d51:
                if(checked)
                { r51= (RadioButton) findViewById(R.id.d51); ans1=r51.getText().toString();}
        }

    }


    public  void  onclickRadio52(View view)
    { RadioButton r52;

        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.a52:
                if(checked)
                {r52= (RadioButton) findViewById(R.id.a52);

                    ans2=r52.getText().toString();}
                break;
            case R.id.b52:
                if(checked)
                { r52= (RadioButton) findViewById(R.id.b52);ans2=r52.getText().toString();}break;
            case R.id.c52:
                if(checked)
                {  r52= (RadioButton) findViewById(R.id.c52); ans2=r52.getText().toString();}break;
            case R.id.d52:
                if(checked)
                { r52= (RadioButton) findViewById(R.id.d52); ans2=r52.getText().toString();}
        }

    }



    public void alert(String s1,String s2)
    {
        AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
        alertDialog.setTitle(s1);
        alertDialog.setCancelable(true);
        alertDialog.setMessage(s2);
        alertDialog.show();
    }


    public  void Continue(View view)
    {

        if(ans1.equals("structures")&&ans2.equals("Compile time error")) {
            Toast.makeText(this, "Correct!!well done!!", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this,MainActivity.class);

            startActivity(intent);
            finish();
        } else if (ans1.equals("")||ans2.equals(""))
            alert("Sorry","Answer all questions");

        else
            alert("Sorry","Try again!!!");
    }
}
