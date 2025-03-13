package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class Month$1
  implements Parcelable.Creator
{
  public Month createFromParcel(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    int j = paramParcel.readInt();
    return Month.create(i, j);
  }
  
  public Month[] newArray(int paramInt)
  {
    return new Month[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.Month.1
 * JD-Core Version:    0.7.0.1
 */