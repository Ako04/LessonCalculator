package com.example.bakeninsabagy4_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn7, btn8, btn9, btn6, btn5, btn4, btn3, btn2, btn1, btn0;
    Button btn_delete, btn_plusminus;
    TextView textview_san;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculatordesign);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn6 = findViewById(R.id.btn6);
        btn5 = findViewById(R.id.btn5);
        btn4 = findViewById(R.id.btn4);
        btn3 = findViewById(R.id.btn3);
        btn2 = findViewById(R.id.btn2);
        btn1 = findViewById(R.id.btn1);
        btn0 = findViewById(R.id.btn0);


        btn_delete = findViewById(R.id.btn_del);
        btn_plusminus = findViewById(R.id.btn_plusminus);


        textview_san = findViewById(R.id.textview_san);

        View.OnClickListener btnSandar = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aldyngiSan = textview_san.getText().toString();
                String basilganSan = "";
                String result = "";


                switch (view.getId()){
                    case R.id.btn0:
                        basilganSan ="0";
                        break;

                    case R.id.btn1:
                        basilganSan ="1";
                        break;

                    case R.id.btn2:
                        basilganSan ="2";
                        break;

                    case R.id.btn3:
                        basilganSan ="3";
                        break;

                    case R.id.btn4:
                        basilganSan ="4";
                        break;

                    case R.id.btn5:
                        basilganSan ="5";
                        break;

                    case R.id.btn6:
                        basilganSan ="6";
                        break;

                    case R.id.btn9:
                        basilganSan ="9";
                        break;

                    case R.id.btn7:
                        basilganSan = "7";
                        break;


                    case R.id.btn8:
                        basilganSan ="8";
                        break;

                }

                if (!aldyngiSan.equals("0")) result = aldyngiSan + basilganSan;
                else result = basilganSan;

                textview_san.setText(result);

            }
        };

        btn7.setOnClickListener(btnSandar);
        btn8.setOnClickListener(btnSandar);
        btn9.setOnClickListener(btnSandar);
        btn6.setOnClickListener(btnSandar);
        btn5.setOnClickListener(btnSandar);
        btn4.setOnClickListener(btnSandar);
        btn3.setOnClickListener(btnSandar);
        btn2.setOnClickListener(btnSandar);
        btn1.setOnClickListener(btnSandar);
        btn0.setOnClickListener(btnSandar);

        View.OnClickListener btn_deleter = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.btn_del:

                        textview_san.setText("0");
                        break;
                    case R.id.btn_plusminus:

                        String sanText = textview_san.getText().toString();
                        int san = Integer.parseInt(sanText);

                        if(san > 0) textview_san.setText("-"+sanText);

                        else {
                            san = san * (-1);
                            textview_san.setText(""+san);
                        }
                        break;
                }
            }
        };

        btn_delete.setOnClickListener(btn_deleter);
        btn_plusminus.setOnClickListener(btn_deleter);

    }
}