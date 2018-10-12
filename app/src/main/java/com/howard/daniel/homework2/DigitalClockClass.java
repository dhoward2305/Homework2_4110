package com.howard.daniel.homework2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.format.Time;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Handler;

public class DigitalClockClass extends View{


    TextClock tc;

    public DigitalClockClass(Context context) {
        super(context);
    }

    public DigitalClockClass(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DigitalClockClass(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void changeTimee() {
            tc = findViewById(R.id.textClock);
//            tc.     how to change text clock?
        }
}


