package com.shelzi.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import com.udojava.evalex.Expression;

import java.util.Arrays;
import java.util.Objects;

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
    Button btnBack;
    Button btnPercent;
    Button btnClear;
    Button btnPlus;
    Button btnMultiply;
    Button btnExponentiation;
    Button btnSubtruct;
    Button btnDivide;
    Button btnComma;
    Button btnLeftBracket;
    Button btnRightBracket;
    Button btnSin;
    Button btnCos;
    Button btnTan;
    Button btnLg;
    Button btnLn;
    Button btnSqrt;
    Button btnFact;
    Button btnOneDivByX;


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
        btnBack = (Button) findViewById(R.id.btnBack);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnPercent = (Button) findViewById(R.id.btnPercent);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnResult = (Button) findViewById(R.id.btnResult);
        btnExponentiation = (Button) findViewById(R.id.btnExponentiation);
        btnSubtruct = (Button) findViewById(R.id.btnSubtruct);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnComma = (Button) findViewById(R.id.btnComma);
        tvIn = (TextView) findViewById(R.id.tvIn);
        tvOut = (TextView) findViewById(R.id.tvOut);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            btnRightBracket = (Button) findViewById(R.id.btnRightBracket);
            btnLeftBracket = (Button) findViewById(R.id.btnLeftBracket);
            btnSin = (Button) findViewById(R.id.btnSin);
            btnCos = (Button) findViewById(R.id.btnCos);
            btnTan = (Button) findViewById(R.id.btnTan);
            btnLg = (Button) findViewById(R.id.btnLg);
            btnLn = (Button) findViewById(R.id.btnLn);
            btnFact = (Button) findViewById(R.id.btnFact);
            btnOneDivByX = (Button) findViewById(R.id.btnOneDivByX);
        }
/*      ScrollView scrollView = new ScrollView(this);
        scrollView.addView(tvOut);
        setContentView(scrollView);*/
        Objects.requireNonNull(getSupportActionBar()).hide();
        initView();
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

    public void initView() {
        View.OnClickListener oclBtn = new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!(tvIn.getText().length() == 0)) {
                    String lastChar = (String) tvIn.getText();
                    lastChar = lastChar.substring(lastChar.length() - 1);
                    String finalLastChar = lastChar;
                    switch (v.getId()) {
                        case R.id.btnPlus: {
                            if (!finalLastChar.equals("+")) tvIn.setText(tvIn.getText() + "+");
                            break;
                        }
                        case R.id.btnMultiply: {
                            if (!finalLastChar.equals("*")) tvIn.setText(tvIn.getText() + "*");
                            break;
                        }
                        case R.id.btnPercent: {
                            if (!finalLastChar.equals("%")) tvIn.setText(tvIn.getText() + "%");
                            break;
                        }
                        case R.id.btnExponentiation: {
                            if (!finalLastChar.equals("^")) tvIn.setText(tvIn.getText() + "^");
                            break;
                        }
                        case R.id.btnClear: {
                            tvIn.setText("");
                            break;
                        }
                        case R.id.btnComma: {
                            if (!finalLastChar.equals(".")) tvIn.setText(tvIn.getText() + ".");
                            break;
                        }
                        case R.id.btnDivide: {
                            if (!finalLastChar.equals("/")) tvIn.setText(tvIn.getText() + "/");
                            break;
                        }

                    }
                }
            }
        };

        View.OnClickListener oclBtnSubtruct = new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (tvIn.getText().length() == 0) {
                    tvIn.setText("-");
                } else {
                    String lastChar = (String) tvIn.getText();
                    lastChar = lastChar.substring(lastChar.length() - 1);
                    if (!lastChar.equals("-")) tvIn.setText(tvIn.getText() + "-");
                }
            }
        };

        View.OnClickListener oclBtnResult = new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!(tvIn.getText().length() == 0)) {
                    Expression expression = new Expression((String) tvIn.getText());
                    String answer = "";
                    try {
                        answer = String.valueOf(expression.eval().doubleValue());
                    } catch (Exception e) {
                        answer = "Error";
                    } finally {
                        tvOut.setText(answer);
                    }
                }
            }
        };

        View.OnClickListener oclBtnBack = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(tvIn.getText().length() == 0)) {
                    String temp = (String) tvIn.getText();
                    temp = temp.substring(0, temp.length() - 1);
                    tvIn.setText(temp);
                }
            }
        };

        View.OnClickListener oclBtnRightBracket = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvIn.setText(tvIn.getText() + ")");
            }
        };

        View.OnClickListener oclBtnLeftBracket = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvIn.setText(tvIn.getText() + "(");
            }
        };




        btnResult.setOnClickListener(oclBtnResult);
        btnBack.setOnClickListener(oclBtnBack);
        btnSubtruct.setOnClickListener(oclBtnSubtruct);
        btnClear.setOnClickListener(oclBtn);
        btnPercent.setOnClickListener(oclBtn);
        btnPlus.setOnClickListener(oclBtn);
        btnMultiply.setOnClickListener(oclBtn);
        btnComma.setOnClickListener(oclBtn);
        btnExponentiation.setOnClickListener(oclBtn);
        btnDivide.setOnClickListener(oclBtn);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            btnRightBracket.setOnClickListener(oclBtnRightBracket);
            btnLeftBracket.setOnClickListener(oclBtnLeftBracket);
            btnSin.setOnClickListener(oclBtnLeftBracket);
            btnCos.setOnClickListener(oclBtnLeftBracket);
            btnTan.setOnClickListener(oclBtnLeftBracket);
            btnLn.setOnClickListener(oclBtnLeftBracket);
            btnLg.setOnClickListener(oclBtnLeftBracket);
            btnFact.setOnClickListener(oclBtnLeftBracket);
            btnOneDivByX.setOnClickListener(oclBtnLeftBracket);
        }

    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("tvIn", tvIn.getText().toString());
        outState.putString("tvOut", tvOut.getText().toString());

    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        tvIn.setText(savedInstanceState.getString("tvIn"));
        tvOut.setText(savedInstanceState.getString("tvOut"));

    }
}


