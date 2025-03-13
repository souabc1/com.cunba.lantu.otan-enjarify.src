package com.xuexiang.xui.widget.button.switchbutton;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.view.View.BaseSavedState;
import m54207b69;

class SwitchButton$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  public CharSequence o00OoOoo;
  public CharSequence o00Ooo00;
  
  static
  {
    SwitchButton.SavedState.1 local1 = new com/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SwitchButton$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    CharSequence localCharSequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.o00OoOoo = localCharSequence;
    paramParcel = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.o00Ooo00 = paramParcel;
  }
  
  public SwitchButton$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramParcel;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(2908, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.button.switchbutton.SwitchButton.SavedState
 * JD-Core Version:    0.7.0.1
 */