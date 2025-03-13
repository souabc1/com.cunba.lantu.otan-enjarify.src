package com.xuexiang.xui.widget.banner.recycler.layout;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

class OverFlyingLayoutManager$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public boolean o00Ooo0;
  public float o00Ooo00;
  
  static
  {
    OverFlyingLayoutManager.SavedState.1 local1 = new com/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public OverFlyingLayoutManager$SavedState() {}
  
  public OverFlyingLayoutManager$SavedState(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.o00OoOoo = i;
    float f = paramParcel.readFloat();
    this.o00Ooo00 = f;
    int j = paramParcel.readInt();
    i = 1;
    f = 1.4E-45F;
    if (j != i)
    {
      i = 0;
      f = 0.0F;
    }
    this.o00Ooo0 = i;
  }
  
  public OverFlyingLayoutManager$SavedState(SavedState paramSavedState)
  {
    int i = paramSavedState.o00OoOoo;
    this.o00OoOoo = i;
    float f = paramSavedState.o00Ooo00;
    this.o00Ooo00 = f;
    boolean bool = paramSavedState.o00Ooo0;
    this.o00Ooo0 = bool;
  }
  
  public int describeContents()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(2471, arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramParcel;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(2472, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.banner.recycler.layout.OverFlyingLayoutManager.SavedState
 * JD-Core Version:    0.7.0.1
 */