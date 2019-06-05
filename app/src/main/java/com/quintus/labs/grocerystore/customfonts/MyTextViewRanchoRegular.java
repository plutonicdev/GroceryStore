package com.quintus.labs.grocerystore.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class MyTextViewRanchoRegular extends TextView {

    public MyTextViewRanchoRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextViewRanchoRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewRanchoRegular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Rancho-Regular.ttf");
            setTypeface(tf);
        }
    }

}