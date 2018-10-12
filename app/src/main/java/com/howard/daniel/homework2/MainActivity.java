package com.howard.daniel.homework2;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.DigitalClock;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.turki.vectoranalogclockview.VectorAnalogClock;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private ControlClass controlMe;
    private LinearLayout thisLayout;
    DialogFragment datePicker;


    DigitalClockClass dg;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thisLayout = findViewById(R.id.vertLayout);
        controlMe = new ControlClass(this);
        TextView tv = (TextView) findViewById(R.id.dateView);

        b1 = (Button) findViewById(R.id.datePicker);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePicker = new DatePickerClass();
                datePicker.show(getSupportFragmentManager(), "date picker");
            }
        });


        Calendar c = Calendar.getInstance();
        String origDate = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());
        tv.setText(origDate);

        controlMe.addAnalogClock1();
        thisLayout.addView(controlMe.updateClock());

    }

    public void addAnalogClock(View view) {
        controlMe.addAnalogClock1();
        thisLayout.addView(controlMe.updateClock());
    }

    public void addMinute(View view) {
        controlMe.addMinute1();
    }

    public void subMinute(View view) {
        controlMe.subMinute1();
    }

    public void addSecond(View view) {
        controlMe.addSecond1();
    }

    public void subSecond(View view) {
        controlMe.subSecond1();
    }

    public void addHour(View view) {
        controlMe.addHour1();
    }

    public void subHour(View view) {
        controlMe.subHour1();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String curDate = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        TextView tv = (TextView) findViewById(R.id.dateView);
        tv.setText(curDate);
    }
}
