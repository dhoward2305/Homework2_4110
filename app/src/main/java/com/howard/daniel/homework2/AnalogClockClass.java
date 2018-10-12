package com.howard.daniel.homework2;

import android.content.Context;
import android.util.AttributeSet;

import com.turki.vectoranalogclockview.VectorAnalogClock;

public class AnalogClockClass extends VectorAnalogClock {

    private void init() {
        initializeSimple();

    }

    public AnalogClockClass(Context ctx) {
        super(ctx);
        init();
    }

    public AnalogClockClass(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AnalogClockClass(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }



}
