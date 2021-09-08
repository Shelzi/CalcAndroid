package com.shelzi.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    TextView tvOut;
    TextView tvIn;
    Button btnOne;
    Button btnTwo;
    TextView myAwesomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        tvIn = (TextView)findViewById(R.id.tvIn);
        tvOut = (TextView)findViewById(R.id.tvOut);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnOne:
                String tempString = new String("");
                if (tvIn.getText() != "")
                    tempString = (String) tvIn.getText();
                tvIn.setText(tempString + "1");

                break;

            case R.id.btnTwo:
                tvIn.setText("2");
                break;

            case R.id.btnResult:
/*                Expression expression = new Expression("1+1/3");
                tvOut.setText(expression.toString());*/
        }
    }

    public void oclBtnOne(View view) {
        tvIn.setText("1");
    }

    public void testCalc(){

    }
}

