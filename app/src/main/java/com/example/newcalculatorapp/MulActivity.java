package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MulActivity extends AppCompatActivity {
    Button abt1,abt2;
    EditText et1,et2;
    TextView tv;
    int num1,num2,sum;
    String getN1,getN2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mul);
        abt1=(Button) findViewById(R.id.mmenu);
        abt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob2=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob2);
            }
        });
        abt2=(Button) findViewById(R.id.mulopr);
        et1=(EditText)findViewById(R.id.mn1)  ;
        et2=(EditText)findViewById(R.id.mn2)  ;
        tv=(TextView) findViewById(R.id.reToDisplay);
        abt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getN1=et1.getText().toString();
                getN2=et2.getText().toString();
                num1=Integer.parseInt(getN1);
                num2=Integer.parseInt(getN2);
                sum=num1*num2;
                result=String.valueOf(sum);
                System.out.println(result);
                tv.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });
    }
}