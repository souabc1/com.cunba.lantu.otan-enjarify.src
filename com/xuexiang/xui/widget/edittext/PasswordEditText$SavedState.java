package com.xuexiang.xui.widget.edittext;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import m54207b69;

public class PasswordEditText$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  public final boolean o00OoOoo;
  public final boolean o00Ooo00;
  
  static
  {
    PasswordEditText.SavedState.1 local1 = new com/xuexiang/xui/widget/edittext/PasswordEditText$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public PasswordEditText$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    int i = paramParcel.readByte();
    int j = 1;
    if (i != 0) {
      i = j;
    } else {
      i = 0;
    }
    this.o00OoOoo = i;
    int k = paramParcel.readByte();
    if (k == 0) {
      j = 0;
    }
    this.o00Ooo00 = j;
  }
  
  public PasswordEditText$SavedState(Parcelable paramParcelable, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramParcelable);
    this.o00OoOoo = paramBoolean1;
    this.o00Ooo00 = paramBoolean2;
  }
  
  public boolean isPasswordVisible()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(3326, arrayOfObject);
  }
  
  public boolean isShowingIcon()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(3327, arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramParcel;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(3328, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.edittext.PasswordEditText.SavedState
 * JD-Core Version:    0.7.0.1
 */