package com.howard.daniel.homework2;

import android.content.Context;
import android.view.View;

import java.util.ArrayList;
import java.util.Calendar;

public class ControlClass {

    private CalndrClass calClass;
    private Context context;
    private ArrayList<AddClocks> moreClocks = new ArrayList<>();


    public ControlClass(Context context) {
        this.context = context;
        calClass = new CalndrClass();
    }

    public AddClocks addAnotherClock(int num) {
//        if(num == 0) {
//
//        }
        return new AnalogPlus(context);
    }

    public void addAnalogClock1() {
        moreClocks.add(addAnotherClock(0));

    }

    public View updateClock() {
       return moreClocks.get(moreClocks.size()-1).clockChange();
    }

    public void addMinute1() {
        for (AddClocks time : moreClocks) {
            Calendar c = calClass.getC();
            c.add(Calendar.MINUTE, + 1);
            time.changeTime(calClass.getC());
        }
    }

    public void subMinute1() {
        for (AddClocks time : moreClocks) {
            Calendar c = calClass.getC();
            c.add(Calendar.MINUTE, - 1);
            time.changeTime(calClass.getC());
        }
    }

    public void addSecond1() {
        for (AddClocks time : moreClocks) {
            Calendar c = calClass.getC();
            c.add(Calendar.SECOND, + 1);
            time.changeTime(calClass.getC());
        }
    }

    public void subSecond1() {
        for (AddClocks time : moreClocks) {
            Calendar c = calClass.getC();
            c.add(Calendar.SECOND, - 1);
            time.changeTime(calClass.getC());
        }
    }

    public void addHour1() {
        for (AddClocks time : moreClocks) {
            Calendar c = calClass.getC();
            c.add(Calendar.HOUR, + 1);
            time.changeTime(calClass.getC());
        }
    }

    public void subHour1() {
        for (AddClocks time : moreClocks) {
            Calendar c = calClass.getC();
            c.add(Calendar.HOUR, - 1);
            time.changeTime(calClass.getC());
        }
    }

}
