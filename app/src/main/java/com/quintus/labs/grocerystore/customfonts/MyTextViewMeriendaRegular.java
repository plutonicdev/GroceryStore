package com.quintus.labs.grocerystore.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class MyTextViewMeriendaRegular extends TextView {

    public MyTextViewMeriendaRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextViewMeriendaRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewMeriendaRegular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Merienda-Regular.ttf");
            setTypeface(tf);
        }
    }

}