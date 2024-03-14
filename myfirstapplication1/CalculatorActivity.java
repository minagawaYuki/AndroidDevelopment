package com.example.myfirstapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    Button btnZero, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot, btnPlus, btnDivide,
            btnMultiply, btnSubtract, btnEquals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        StringBuilder sb = new StringBuilder();

        btnZero = (Button) findViewById(R.id.btnZero);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnDot = (Button)  findViewById(R.id.btnDot);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnEquals = (Button) findViewById(R.id.btnEquals);
        TextView inputField = (TextView) findViewById(R.id.inputField);

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('0');
                inputField.setText(sb);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('1');
                inputField.setText(sb);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('2');
                inputField.setText(sb);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('3');
                inputField.setText(sb);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('4');
                inputField.setText(sb);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('5');
                inputField.setText(sb);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('6');
                inputField.setText(sb);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('7');
                inputField.setText(sb);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('8');
                inputField.setText(sb);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('9');
                inputField.setText(sb);
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('.');
                inputField.setText(sb);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('+');
                inputField.setText(sb);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('/');
                inputField.setText(sb);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('*');
                inputField.setText(sb);
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('-');
                inputField.setText(sb);
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.append('=');
                inputField.setText(sb);
            }
        });
    }
}