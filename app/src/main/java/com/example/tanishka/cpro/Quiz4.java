package com.example.tanishka.cpro;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Quiz4 extends AppCompatActivity {
    String ans1="",ans2="",ans3="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
    }
    public  void  onclickRadio41(View view)
    { RadioButton r41;

        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.a41:
                if(checked)
                {r41= (RadioButton) findViewById(R.id.a41);
                    ans1=r41.getText().toString();}
                break;
            case R.id.b41:
                if(checked)
                { r41= (RadioButton) findViewById(R.id.b41);ans1=r41.getText().toString();}break;
            case R.id.c41:
                if(checked)
                {  r41= (RadioButton) findViewById(R.id.c41); ans1=r41.getText().toString();}break;
            case R.id.d41:
                if(checked)
                { r41= (RadioButton) findViewById(R.id.d41); ans1=r41.getText().toString();}
        }

    }


    public  void  onclickRadio42(View view)
    { RadioButton r42;

        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.a42:
                if(checked)
                {r42= (RadioButton) findViewById(R.id.a42);

                    ans2=r42.getText().toString();}
                break;
            case R.id.b42:
                if(checked)
                { r42= (RadioButton) findViewById(R.id.b42);ans2=r42.getText().toString();}break;
            case R.id.c42:
                if(checked)
                {  r42= (RadioButton) findViewById(R.id.c42); ans2=r42.getText().toString();}break;
            case R.id.d42:
                if(checked)
                { r42= (RadioButton) findViewById(R.id.d42); ans2=r42.getText().toString();}
        }

    }

    public  void  onclickRadio43(View view)
    { RadioButton r43;

        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.a43:
                if(checked)
                {r43= (RadioButton) findViewById(R.id.a43);
                    ans3=r43.getText().toString();}
                break;
            case R.id.b43:
                if(checked)
                { r43= (RadioButton) findViewById(R.id.b43);ans3=r43.getText().toString();}break;
            case R.id.c43:
                if(checked)
                {  r43= (RadioButton) findViewById(R.id.c43); ans3=r43.getText().toString();}break;
            case R.id.d43:
                if(checked)
                { r43= (RadioButton) findViewById(R.id.d43); ans3=r43.getText().toString();}
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

        if(ans1.equals("int num[6] = { 2, 4, 12, 5, 45, 5 };")&&ans2.equals("3, 2, 15")&&ans3.equals("Sequential")) {
            Toast.makeText(this, "Correct!!well done!!", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this,Structures.class);

            startActivity(intent);
            finish();
        } else if (ans1.equals("")||ans2.equals("")||ans3.equals(""))
            alert("Sorry","Answer all questions");

        else
            alert("Sorry","Try again!!!");
    }
}
