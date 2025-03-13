package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class DateValidatorPointBackward$1
  implements Parcelable.Creator
{
  public DateValidatorPointBackward createFromParcel(Parcel paramParcel)
  {
    DateValidatorPointBackward localDateValidatorPointBackward = new com/google/android/material/datepicker/DateValidatorPointBackward;
    long l = paramParcel.readLong();
    localDateValidatorPointBackward.<init>(l, null);
    return localDateValidatorPointBackward;
  }
  
  public DateValidatorPointBackward[] newArray(int paramInt)
  {
    return new DateValidatorPointBackward[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.DateValidatorPointBackward.1
 * JD-Core Version:    0.7.0.1
 */