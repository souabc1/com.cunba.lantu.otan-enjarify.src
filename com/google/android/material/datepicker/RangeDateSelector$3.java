package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class RangeDateSelector$3
  implements Parcelable.Creator
{
  public RangeDateSelector createFromParcel(Parcel paramParcel)
  {
    RangeDateSelector localRangeDateSelector = new com/google/android/material/datepicker/RangeDateSelector;
    localRangeDateSelector.<init>();
    Object localObject1 = Long.class;
    Object localObject2 = ((Class)localObject1).getClassLoader();
    localObject2 = (Long)paramParcel.readValue((ClassLoader)localObject2);
    RangeDateSelector.access$302(localRangeDateSelector, (Long)localObject2);
    localObject1 = ((Class)localObject1).getClassLoader();
    paramParcel = (Long)paramParcel.readValue((ClassLoader)localObject1);
    RangeDateSelector.access$402(localRangeDateSelector, paramParcel);
    return localRangeDateSelector;
  }
  
  public RangeDateSelector[] newArray(int paramInt)
  {
    return new RangeDateSelector[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.RangeDateSelector.3
 * JD-Core Version:    0.7.0.1
 */