package com.dinastiasoft.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare Variables

    EditText number1, number2;
    TextView result;
    Button Add, Sub, Mul, Div, Clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Typecast Buttons, EditText and TextView

        number1= (EditText) findViewById(R.id.edText1);
        number2= (EditText) findViewById(R.id.edText2);
        result= (TextView) findViewById(R.id.tvAnswer);
        Add = (Button) findViewById(R.id.btnAdd);
        Sub = (Button) findViewById(R.id.btnSub);
        Mul = (Button) findViewById(R.id.btnMul);
        Div = (Button) findViewById(R.id.btnDiv);
        Clear = (Button) findViewById(R.id.btnClear);

        //Button for Addition Operation
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().length()==0){
                    number1.setError("Enter first number");
                }
                else if(number2.getText().length()==0){
                    number2.setError("Enter second number");
                }
                else {
                    int num1 = Integer.parseInt(number1.getText().toString());
                    int num2 = Integer.parseInt(number2.getText().toString());
                    Integer sum = num1 + num2;
                    result.setText(sum.toString());
                }
            }
        });

        //Button for Subtraction Operation
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Force user to enter a number
                if (number1.getText().length()==0){
                    number1.setError("Enter first number");
                }
                else if(number2.getText().length()==0){
                    number2.setError("Enter second number");
                }
                else {
                    //Code executes when two number are entered
                    int num1 = Integer.parseInt(number1.getText().toString());
                    int num2 = Integer.parseInt(number2.getText().toString());
                    Integer sum = num1 - num2;
                    result.setText(sum.toString());
                }

            }
        });

        //Button for Multiplication Operation
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Force user to enter a number
                if (number1.getText().length()==0){
                    number1.setError("Enter first number");
                }
                else if(number2.getText().length()==0){
                    number2.setError("Enter second number");
                }
                else {
                    int num1 = Integer.parseInt(number1.getText().toString());
                    int num2 = Integer.parseInt(number2.getText().toString());
                    Integer sum = num1 * num2;
                    result.setText(sum.toString());
                }

            }
        });

        //Button for Division Operation
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Force user to enter a number
                if (number1.getText().length()==0){
                    number1.setError("Enter first number");
                }
                else if(number2.getText().length()==0){
                    number2.setError("Enter second number");
                }
                else {
                    int num1 = Integer.parseInt(number1.getText().toString());
                    int num2 = Integer.parseInt(number2.getText().toString());
                    Integer sum = num1 / num2;
                    result.setText(sum.toString());
                }

            }
        });

        //Button to Clear Screen
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                number1.setText("");
                number2.setText("");
            }
        });
    }
}
