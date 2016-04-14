package com.example.tanishka.cpro;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class quiz3 extends AppCompatActivity {
    String ans1="",ans2="",ans3="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
    }
    public  void  onclickRadio31(View view)
    { RadioButton r31;

        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.a31:
                if(checked)
                {r31= (RadioButton) findViewById(R.id.a31);
                    ans1=r31.getText().toString();}
                break;
            case R.id.b31:
                if(checked)
                { r31= (RadioButton) findViewById(R.id.b31);ans1=r31.getText().toString();}break;
            case R.id.c31:
                if(checked)
                {  r31= (RadioButton) findViewById(R.id.c31); ans1=r31.getText().toString();}break;
            case R.id.d31:
                if(checked)
                { r31= (RadioButton) findViewById(R.id.d31); ans1=r31.getText().toString();}
        }

    }


    public  void  onclickRadio32(View view)
    { RadioButton r32;

        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.a32:
                if(checked)
                {r32= (RadioButton) findViewById(R.id.a32);

                    ans2=r32.getText().toString();}
                break;
            case R.id.b32:
                if(checked)
                { r32= (RadioButton) findViewById(R.id.b32);ans2=r32.getText().toString();}break;
            case R.id.c32:
                if(checked)
                {  r32= (RadioButton) findViewById(R.id.c32); ans2=r32.getText().toString();}break;
            case R.id.d32:
                if(checked)
                { r32= (RadioButton) findViewById(R.id.d32); ans2=r32.getText().toString();}
        }

    }

    public  void  onclickRadio33(View view)
    { RadioButton r33;

        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.a33:
                if(checked)
                {r33= (RadioButton) findViewById(R.id.a33);
                    ans3=r33.getText().toString();}
                break;
            case R.id.b33:
                if(checked)
                { r33= (RadioButton) findViewById(R.id.b33);ans3=r33.getText().toString();}break;
            case R.id.c33:
                if(checked)
                {  r33= (RadioButton) findViewById(R.id.c33); ans3=r33.getText().toString();}break;
            case R.id.d33:
                if(checked)
                { r33= (RadioButton) findViewById(R.id.d33); ans3=r33.getText().toString();}
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

        if(ans1.equals("1 2")&&ans2.equals("1 2")&&ans3.equals("Depends on the compiler")) {
            Toast.makeText(this, "Correct!!well done!!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, Array.class);

            startActivity(intent);
            finish();
        }else if (ans1.equals("")||ans2.equals("")||ans3.equals(""))
            alert("Sorry","Answer all questions");

         else
            alert("Sorry","Try again!!!");

    }
}
