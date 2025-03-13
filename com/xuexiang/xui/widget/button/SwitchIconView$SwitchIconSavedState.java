package com.xuexiang.xui.widget.button;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import m54207b69;

class SwitchIconView$SwitchIconSavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  public boolean o00OoOoo;
  
  static
  {
    SwitchIconView.SwitchIconSavedState.1 local1 = new com/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SwitchIconView$SwitchIconSavedState(Parcel paramParcel)
  {
    super(paramParcel);
    int i = paramParcel.readInt();
    int j = 1;
    if (i != j) {
      j = 0;
    }
    this.o00OoOoo = j;
  }
  
  public SwitchIconView$SwitchIconSavedState(Parcelable paramParcelable)
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
    m54207b69.F54207b69_00(2788, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.button.SwitchIconView.SwitchIconSavedState
 * JD-Core Version:    0.7.0.1
 */