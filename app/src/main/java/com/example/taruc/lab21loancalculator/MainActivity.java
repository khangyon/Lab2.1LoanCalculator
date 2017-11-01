package com.example.taruc.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.taruc.lab21loancalculator.R.id.editTextCarPrice;

public class MainActivity extends AppCompatActivity {

    public static final String MONTHLY_PAYMENT = "payment";
    public static final String LOAN_STATUS = "status";
    private EditText editTextCarPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calculateLoan(View view){
        //Create an Explicit intent
        Intent intent = new Intent(this, ResultActivity.class);

        //TODO: calculate monthly payment and determine
        double carPrice;
        double downPayment;
        double loadPeriod;
        double interestRate;

        

        //loan application status; approve or reject
        double monthlyPayment;
        String status;

        //Passing data using putExtra method
        //putExtra(TAG, value)
        intent.putExtra(MONTHLY_PAYMENT, monthlyPayment);
        intent.putExtra(LOAN_STATUS, status);
        startActivity(intent);
    }
}
