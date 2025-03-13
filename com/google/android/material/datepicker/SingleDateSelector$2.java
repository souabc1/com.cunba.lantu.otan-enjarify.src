package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class SingleDateSelector$2
  implements Parcelable.Creator
{
  public SingleDateSelector createFromParcel(Parcel paramParcel)
  {
    SingleDateSelector localSingleDateSelector = new com/google/android/material/datepicker/SingleDateSelector;
    localSingleDateSelector.<init>();
    ClassLoader localClassLoader = Long.class.getClassLoader();
    paramParcel = (Long)paramParcel.readValue(localClassLoader);
    SingleDateSelector.access$202(localSingleDateSelector, paramParcel);
    return localSingleDateSelector;
  }
  
  public SingleDateSelector[] newArray(int paramInt)
  {
    return new SingleDateSelector[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.SingleDateSelector.2
 * JD-Core Version:    0.7.0.1
 */