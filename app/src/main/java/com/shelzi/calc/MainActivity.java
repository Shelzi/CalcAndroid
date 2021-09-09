package com.shelzi.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.udojava.evalex.Expression;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    TextView tvIn;
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFore;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    Button btnResult;
    TextView myAwesomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFore = (Button) findViewById(R.id.btnFore);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnZero = (Button) findViewById(R.id.btnZero);

        btnResult = (Button) findViewById(R.id.btnResult);
        tvIn = (TextView)findViewById(R.id.tvIn);
        tvOut = (TextView)findViewById(R.id.tvOut);
        tvOut.setText("Test"); // Это работает, текст изменяется
        getSupportActionBar().hide();

        View.OnClickListener oclBtnResult = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Expression expression = new Expression((String)tvIn.getText());
                String answer = new  String(String.valueOf(expression.eval()));
                tvOut.setText(answer);
            }
        };

        btnResult.setOnClickListener(oclBtnResult);
    }




    public void oclBtnOne(View view) {
        tvIn.setText(tvIn.getText() + "1");
    }
    public void oclBtnTwo(View view) {
        tvIn.setText(tvIn.getText() + "2");
    }
    public void oclBtnThree(View view) {
        tvIn.setText(tvIn.getText() + "3");
    }
    public void oclBtnFore(View view) {
        tvIn.setText(tvIn.getText() + "4");
    }
    public void oclBtnFive(View view) {
        tvIn.setText(tvIn.getText() + "5");
    }
    public void oclBtnSix(View view) {
        tvIn.setText(tvIn.getText() + "6");
    }
    public void oclBtnSeven(View view) {
        tvIn.setText(tvIn.getText() + "7");
    }
    public void oclBtnEight(View view) {
        tvIn.setText(tvIn.getText() + "8");
    }
    public void oclBtnNine(View view) {
        tvIn.setText(tvIn.getText() + "9");
    }
    public void oclBtnZero(View view) {
        tvIn.setText(tvIn.getText() + "0");
    }

    @SuppressLint("SetTextI18n")
    public void oclBtnPlus(View view) {
        String temp  = new String ((String)tvIn.getText());
        temp = temp.substring(temp.length() - 1);
        if(!temp.equals("+")) tvIn.setText(tvIn.getText() + "+");
    }

    @SuppressLint("SetTextI18n")
    public void oclBtnClear(View view) {
        String temp  = new String ((String)tvIn.getText());
        temp = temp.substring(temp.length() - 1);
        if(!temp.equals("+")) tvIn.setText(tvIn.getText() + "+");
    }

    @SuppressLint("SetTextI18n")
    /*public void oclBtnResult(View view) {
        Expression expression = new Expression((String)tvIn.getText());
        CharSequence answer = (CharSequence) expression.eval();
        tvOut.setText(answer);
    }*/

    public void oclBtnDelete (View view) {

    }

}

