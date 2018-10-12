package com.howard.daniel.homework2;

import android.content.Context;
import android.view.View;

import java.util.Calendar;

public class AnalogPlus extends AddClocks {
    private AnalogClockClass aClock;


    public AnalogPlus(Context context) {
        super(context);
        aClock = new AnalogClockClass(context);
    }

    @Override
    public View clockChange() {
        return aClock;
    }

    public void setTime(Calendar c) {
        aClock.setCalendar(c);
    }

    public void changeTime(Calendar c) {
        aClock.setCalendar(c);
    }

}
