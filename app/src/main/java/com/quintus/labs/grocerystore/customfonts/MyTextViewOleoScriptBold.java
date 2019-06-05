package com.quintus.labs.grocerystore.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class MyTextViewOleoScriptBold extends TextView {

    public MyTextViewOleoScriptBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextViewOleoScriptBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewOleoScriptBold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OleoScript-Bold.ttf");
            setTypeface(tf);
        }
    }

}