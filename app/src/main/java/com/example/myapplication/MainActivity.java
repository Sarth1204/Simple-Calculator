package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Add(View v){
        EditText et1 =(EditText) findViewById(R.id.editTextNumberSigned);
        EditText et2 =(EditText) findViewById(R.id.editTextNumberSigned2);
        EditText et3 =(EditText) findViewById(R.id.editTextNumberSigned3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1+n2;

        et3.setText("Total Value  "+result);
    }
    public void Minus(View v) {
        EditText et1 = (EditText) findViewById(R.id.editTextNumberSigned);
        EditText et2 = (EditText) findViewById(R.id.editTextNumberSigned2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumberSigned3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 + -n2;

        et3.setText(" Value  " + result);
    }



    public void Product(View v) {
        EditText et1 = (EditText) findViewById(R.id.editTextNumberSigned);
        EditText et2 = (EditText) findViewById(R.id.editTextNumberSigned2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumberSigned3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 * n2;

        et3.setText("Total Value  " + result);
    }

    public void Divide(View v) {
        EditText et1 = (EditText) findViewById(R.id.editTextNumberSigned);
        EditText et2 = (EditText) findViewById(R.id.editTextNumberSigned2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumberSigned3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 / n2;

        et3.setText("Total Value  " + result);
    }



}