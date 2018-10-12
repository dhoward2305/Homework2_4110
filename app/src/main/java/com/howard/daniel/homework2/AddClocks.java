package com.howard.daniel.homework2;

import android.content.Context;
import android.view.View;

import java.util.Calendar;

public abstract class AddClocks {

    private Context context;
    private AnalogClockClass aClock;

    public AddClocks(Context context) {
        this.context = context;
    }

    public View clockChange() {
        return null;
    }

    public void changeTime(Calendar c) {
        aClock.setCalendar(c);
    }

}
