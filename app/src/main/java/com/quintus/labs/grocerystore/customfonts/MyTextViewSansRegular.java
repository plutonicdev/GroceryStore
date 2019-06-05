package com.quintus.labs.grocerystore.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class MyTextViewSansRegular extends TextView {

    public MyTextViewSansRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextViewSansRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewSansRegular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-Regular.ttf");
            setTypeface(tf);
        }
    }

}