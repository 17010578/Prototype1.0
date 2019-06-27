package com.myapplicationdev.android.prototype1;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class errand extends AppCompatActivity {

    EditText etTime;
    Button btnDone;
    int Year = 0;
    int Day = 0;
    int Month = 0;
    int Hour = 0;
    int Minute = 0;
    Calendar calander = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_errand);

        btnDone = findViewById(R.id.button9);
        etTime = findViewById(R.id.editTextTime);
        Intent intentReceived = getIntent();

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(errand.this,home.class);
                startActivity(i);
            }
        });


        etTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog.OnTimeSetListener myTimeListener = new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        String currMin = "";
                        if (minute < 10){
                            currMin += "0"+minute;
                        } else {
                            currMin += minute+"";
                        }
                        etTime.setText( hourOfDay+ ":" + currMin);
                        Hour = hourOfDay;
                        Minute = minute;
                    }
                };
                TimePickerDialog myTimeDialog = new TimePickerDialog(errand.this, myTimeListener, 23, 30,true);
                myTimeDialog.show();
            }
        });

    }
}
