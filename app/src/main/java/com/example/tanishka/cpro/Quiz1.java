package com.example.tanishka.cpro;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Quiz1 extends AppCompatActivity {
    String ans1="",ans2="",ans3="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
    }

    public  void  onclickRadio1(View view)
   { RadioButton r1;

       boolean checked=((RadioButton) view).isChecked();
       switch (view.getId())
       {
           case R.id.a1:
               if(checked)
               {r1= (RadioButton) findViewById(R.id.a1);
                    ans1=r1.getText().toString();}
           break;
           case R.id.b1:
               if(checked)
               { r1= (RadioButton) findViewById(R.id.b1);ans1=r1.getText().toString();}break;
           case R.id.c1:
               if(checked)
               {  r1= (RadioButton) findViewById(R.id.c1); ans1=r1.getText().toString();}break;
           case R.id.d1:
               if(checked)
               { r1= (RadioButton) findViewById(R.id.d1); ans1=r1.getText().toString();}
       }

   }


    public  void  onclickRadio2(View view)
    { RadioButton r2;

        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.a2:
                if(checked)
                {r2= (RadioButton) findViewById(R.id.a2);

                    ans2=r2.getText().toString();}
                break;
            case R.id.b2:
                if(checked)
                { r2= (RadioButton) findViewById(R.id.b2);ans2=r2.getText().toString();}break;
            case R.id.c2:
                if(checked)
                {  r2= (RadioButton) findViewById(R.id.c2); ans2=r2.getText().toString();}break;
            case R.id.d2:
                if(checked)
                { r2= (RadioButton) findViewById(R.id.d2); ans2=r2.getText().toString();}
        }

    }

    public  void  onclickRadio3(View view)
    { RadioButton r3;

        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.a3:
                if(checked)
                {r3= (RadioButton) findViewById(R.id.a3);
                    ans3=r3.getText().toString();}
                break;
            case R.id.b3:
                if(checked)
                { r3= (RadioButton) findViewById(R.id.b3);ans3=r3.getText().toString();}break;
            case R.id.c3:
                if(checked)
                {  r3= (RadioButton) findViewById(R.id.c3); ans3=r3.getText().toString();}break;
            case R.id.d3:
                if(checked)
                { r3= (RadioButton) findViewById(R.id.d3); ans3=r3.getText().toString();}
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

        if(ans1.equals("b")&&ans2.equals("8 3")&&ans3.equals("10")) {
            Toast.makeText(this, "Correct!!well done!!", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this,Operators.class);

            startActivity(intent);
            finish();
        } else if (ans1.equals("")||ans2.equals("")||ans3.equals(""))
            alert("Sorry","Answer all questions");

        else
            alert("Sorry","Try again!!!");


    }
}
