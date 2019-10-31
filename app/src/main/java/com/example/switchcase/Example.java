package com.example.switchcase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Example extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        int week=4;
        String day;
        switch (week){
            case 1:
                day="sun";
                break;
            case 2:
                day="mon";
                break;
            case 3:
                day="tue";
                break;
            case 4:
                day="wed";
                break;
            case 5:
                day="thurs";
            case 6:
                day="Fri";
                break;
            case 7:
                day="Sat";
                break;
                default:
                    day="invalid day";
                    break;
        }
        System.out.println("Value of day is="+day);
    }
}
