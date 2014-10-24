package com.example.todays;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;

public class CustomDialogPreference extends DialogPreference 
{
    public CustomDialogPreference(Context oContext, AttributeSet attrs)
    {
        super(oContext, attrs);     
        setDialogLayoutResource(R.layout.password);
    }
}