package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button zero, one, two, three, four, five, six, seven, eight, nine, addition, subtraction, multiplication, division, equals, clear_all;
    Integer operation;
    TextView text1;
    String num1, num2;
    Boolean checkOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button intialization
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        addition = findViewById(R.id.addition);
        subtraction = findViewById(R.id.subtract);
        multiplication = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);
        equals = findViewById(R.id.equals);
        clear_all = findViewById(R.id.clear_button);

        //Text initialization
        text1 = findViewById(R.id.textView2);

        //Specification of listeners
        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        addition.setOnClickListener(this);
        subtraction.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        division.setOnClickListener(this);
        equals.setOnClickListener(this);
        clear_all.setOnClickListener(this);

        //Other variables
        num1 = "";
        num2 = "";
        checkOperation = false;
    }

    public void onClick(View view) {
        switch (view.getId()){


            case R.id.zero:
                text1.setText(text1.getText().toString()+"0");
                if(!checkOperation){
                    num1+="0";
                }
                else{
                    num2+="0";
                }
                break;


            case R.id.one:
                text1.setText(text1.getText().toString()+"1");
                if(!checkOperation){
                    num1+="1";
                }
                else{
                    num2+="1";
                }
                break;


            case R.id.two:
                text1.setText(text1.getText().toString()+"2");
                if(!checkOperation){
                    num1+="2";
                }
                else{
                    num2+="2";
                }
                break;


            case R.id.three:
                text1.setText(text1.getText().toString()+"3");
                if(!checkOperation){
                    num1+="3";
                }
                else{
                    num2+="3";
                }
                break;


            case R.id.four:
                text1.setText(text1.getText().toString()+"4");
                if(!checkOperation){
                    num1+="4";
                }
                else{
                    num2+="4";
                }
                break;


            case R.id.five:
                text1.setText(text1.getText().toString()+"5");
                if(!checkOperation){
                    num1+="5";
                }
                else{
                    num2+="5";
                }
                break;


            case R.id.six:
                text1.setText(text1.getText().toString()+"6");
                if(!checkOperation){
                    num1+="6";
                }
                else{
                    num2+="6";
                }
                break;


            case R.id.seven:
                text1.setText(text1.getText().toString()+"7");
                if(!checkOperation){
                    num1+="7";
                }
                else{
                    num2+="7";
                }
                break;


            case R.id.eight:
                text1.setText(text1.getText().toString()+"8");
                if(!checkOperation){
                    num1+="8";
                }
                else{
                    num2+="8";
                }
                break;


            case R.id.nine:
                text1.setText(text1.getText().toString()+"9");
                if(!checkOperation){
                    num1+="9";
                }
                else{
                    num2+="9";
                }
                break;


            case R.id.addition:
                text1.setText(text1.getText().toString()+"+");
                checkOperation = true;
                addition.setClickable(false);
                subtraction.setClickable(false);
                multiplication.setClickable(false);
                division.setClickable(false);
                operation = 1;
                break;


            case R.id.subtract:
                text1.setText(text1.getText().toString()+"-");
                checkOperation = true;
                addition.setClickable(false);
                subtraction.setClickable(false);
                multiplication.setClickable(false);
                division.setClickable(false);
                operation = 2;
                break;


            case R.id.multiplication:
                text1.setText(text1.getText().toString()+"*");
                checkOperation = true;
                addition.setClickable(false);
                subtraction.setClickable(false);
                multiplication.setClickable(false);
                division.setClickable(false);
                operation = 3;
                break;


            case R.id.division:
                text1.setText(text1.getText().toString()+"/");
                checkOperation = true;
                addition.setClickable(false);
                subtraction.setClickable(false);
                multiplication.setClickable(false);
                division.setClickable(false);
                operation = 4;
                break;


            case R.id.equals:
                if(checkOperation) {
                    switch (operation) {
                        case 1:
                            text1.setText("" + (Double.parseDouble(num1) + Double.parseDouble(num2)));
                            break;
                        case 2:
                            text1.setText("" + (Double.parseDouble(num1) - Double.parseDouble(num2)));
                            break;
                        case 3:
                            text1.setText("" + (Double.parseDouble(num1) * Double.parseDouble(num2)));
                            break;
                        case 4:
                            if(num2.equals("0") ||(num1.equals("0") && num2.equals("0"))){
                                text1.setText("Error, cannot divide by zero");
                                break;
                            }
                            else{
                                text1.setText("" + (Double.parseDouble(num1) / Double.parseDouble(num2)));
                            }
                            break;
                    }
                }
                break;


            case R.id.clear_button:
                text1.setText("");
                num1 = "";
                num2 = "";
                checkOperation = false;
                operation = null;
                addition.setClickable(true);
                subtraction.setClickable(true);
                multiplication.setClickable(true);
                division.setClickable(true);
                break;
        }
    }
}