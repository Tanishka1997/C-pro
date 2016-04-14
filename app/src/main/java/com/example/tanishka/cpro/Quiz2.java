package com.example.tanishka.cpro;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Quiz2 extends AppCompatActivity {
    String ans1="",ans2="",ans3="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
    }
    public  void  onclickRadio21(View view)
    { RadioButton r21;

        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.a21:
                if(checked)
                {r21= (RadioButton) findViewById(R.id.a21);
                    ans1=r21.getText().toString();}
                break;
            case R.id.b21:
                if(checked)
                { r21= (RadioButton) findViewById(R.id.b21);ans1=r21.getText().toString();}break;
            case R.id.c21:
                if(checked)
                {  r21= (RadioButton) findViewById(R.id.c21); ans1=r21.getText().toString();}break;
            case R.id.d21:
                if(checked)
                { r21= (RadioButton) findViewById(R.id.d21); ans1=r21.getText().toString();}
        }

    }


    public  void  onclickRadio22(View view)
    { RadioButton r22;

        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.a22:
                if(checked)
                {r22= (RadioButton) findViewById(R.id.a22);

                    ans2=r22.getText().toString();}
                break;
            case R.id.b22:
                if(checked)
                { r22= (RadioButton) findViewById(R.id.b22);ans2=r22.getText().toString();}break;
            case R.id.c22:
                if(checked)
                {  r22= (RadioButton) findViewById(R.id.c22); ans2=r22.getText().toString();}break;
            case R.id.d22:
                if(checked)
                { r22= (RadioButton) findViewById(R.id.d22); ans2=r22.getText().toString();}
        }

    }

    public  void  onclickRadio23(View view)
    { RadioButton r23;

        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.a23:
                if(checked)
                {r23= (RadioButton) findViewById(R.id.a23);
                    ans3=r23.getText().toString();}
                break;
            case R.id.b23:
                if(checked)
                { r23= (RadioButton) findViewById(R.id.b23);ans3=r23.getText().toString();}break;
            case R.id.c23:
                if(checked)
                {  r23= (RadioButton) findViewById(R.id.c23); ans3=r23.getText().toString();}break;
            case R.id.d3:
                if(checked)
                { r23= (RadioButton) findViewById(R.id.d23); ans3=r23.getText().toString();}
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

        if(ans1.equals("-1")&&ans2.equals("-1 1")&&ans3.equals("1")) {
            Toast.makeText(this, "Correct!!well done!!", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this,Functions.class);

            startActivity(intent);
            finish();
        } else if (ans1.equals("")||ans2.equals("")||ans3.equals(""))
            alert("Sorry","Answer all questions");

        else
            alert("Sorry","Try again!!!");
    }
}
