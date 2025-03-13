package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class DateValidatorPointForward$1
  implements Parcelable.Creator
{
  public DateValidatorPointForward createFromParcel(Parcel paramParcel)
  {
    DateValidatorPointForward localDateValidatorPointForward = new com/google/android/material/datepicker/DateValidatorPointForward;
    long l = paramParcel.readLong();
    localDateValidatorPointForward.<init>(l, null);
    return localDateValidatorPointForward;
  }
  
  public DateValidatorPointForward[] newArray(int paramInt)
  {
    return new DateValidatorPointForward[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.DateValidatorPointForward.1
 * JD-Core Version:    0.7.0.1
 */