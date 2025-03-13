package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.internal.ViewUtils;
import java.text.SimpleDateFormat;
import java.util.Collection;

public abstract interface DateSelector
  extends Parcelable
{
  public static void showKeyboardWithAutoHideBehavior(EditText... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i == 0) {
      return;
    }
    OooO0OO localOooO0OO = new com/google/android/material/datepicker/OooO0OO;
    localOooO0OO.<init>(paramVarArgs);
    int j = paramVarArgs.length;
    int k = 0;
    while (k < j)
    {
      EditText localEditText = paramVarArgs[k];
      localEditText.setOnFocusChangeListener(localOooO0OO);
      k += 1;
    }
    ViewUtils.requestFocusAndShowKeyboard(paramVarArgs[0]);
  }
  
  public abstract int getDefaultThemeResId(Context paramContext);
  
  public abstract int getDefaultTitleResId();
  
  public abstract String getError();
  
  public abstract Collection getSelectedDays();
  
  public abstract Collection getSelectedRanges();
  
  public abstract Object getSelection();
  
  public abstract String getSelectionContentDescription(Context paramContext);
  
  public abstract String getSelectionDisplayString(Context paramContext);
  
  public abstract boolean isSelectionComplete();
  
  public abstract View onCreateTextInputView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle, CalendarConstraints paramCalendarConstraints, OnSelectionChangedListener paramOnSelectionChangedListener);
  
  public abstract void select(long paramLong);
  
  public abstract void setSelection(Object paramObject);
  
  public abstract void setTextInputFormat(SimpleDateFormat paramSimpleDateFormat);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.DateSelector
 * JD-Core Version:    0.7.0.1
 */