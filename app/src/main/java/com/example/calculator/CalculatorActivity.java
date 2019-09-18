package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvDisplay;
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    Button btnClear, btnPlusMinus, btnPercent, btnDot, btnEqual;
    Button btnDivide, btnMultiply, btnSubtract, btnAdd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        initViews();
    }

    private void initViews() {
        tvDisplay = findViewById(R.id.tv_display);

        btnZero = findViewById(R.id.btn_zero);
        btnZero.setOnClickListener(this);

        btnOne = findViewById(R.id.btn_one);
        btnOne.setOnClickListener(this);

        btnTwo = findViewById(R.id.btn_two);
        btnTwo.setOnClickListener(this);

        btnThree = findViewById(R.id.btn_three);
        btnThree.setOnClickListener(this);

        btnFour = findViewById(R.id.btn_four);
        btnFour.setOnClickListener(this);

        btnFive = findViewById(R.id.btn_five);
        btnFive.setOnClickListener(this);

        btnSix = findViewById(R.id.btn_six);
        btnSix.setOnClickListener(this);

        btnSeven = findViewById(R.id.btn_seven);
        btnSeven.setOnClickListener(this);

        btnEight = findViewById(R.id.btn_eight);
        btnEight.setOnClickListener(this);

        btnNine = findViewById(R.id.btn_nine);
        btnNine.setOnClickListener(this);

        btnClear = findViewById(R.id.btn_clear);
        btnPlusMinus = findViewById(R.id.btn_plus_minus);
        btnPercent = findViewById(R.id.btn_percent);
        btnDot = findViewById(R.id.btn_dot);
        btnEqual = findViewById(R.id.btn_equals);
        btnDivide = findViewById(R.id.btn_divide);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnSubtract = findViewById(R.id.btn_subtract);
        btnAdd = findViewById(R.id.btn_addition);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_zero:
            case R.id.btn_one:
            case R.id.btn_two:
            case R.id.btn_three:
            case R.id.btn_four:
            case R.id.btn_five:
            case R.id.btn_six:
            case R.id.btn_seven:
            case R.id.btn_eight:
            case R.id.btn_nine:
                String numberValue = ((Button) view).getText().toString();
                tvDisplay.append(numberValue);
                break;
        }
    }
}
