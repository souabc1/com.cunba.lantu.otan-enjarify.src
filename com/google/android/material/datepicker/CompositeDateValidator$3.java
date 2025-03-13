package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.core.util.Preconditions;
import java.util.List;

class CompositeDateValidator$3
  implements Parcelable.Creator
{
  public CompositeDateValidator createFromParcel(Parcel paramParcel)
  {
    Object localObject = CalendarConstraints.DateValidator.class.getClassLoader();
    localObject = paramParcel.readArrayList((ClassLoader)localObject);
    int i = paramParcel.readInt();
    int j = 2;
    if (i == j) {}
    do
    {
      paramParcel = CompositeDateValidator.access$000();
      break;
      j = 1;
    } while (i != j);
    paramParcel = CompositeDateValidator.access$100();
    CompositeDateValidator localCompositeDateValidator = new com/google/android/material/datepicker/CompositeDateValidator;
    localObject = (List)Preconditions.OooO0oo(localObject);
    localCompositeDateValidator.<init>((List)localObject, paramParcel, null);
    return localCompositeDateValidator;
  }
  
  public CompositeDateValidator[] newArray(int paramInt)
  {
    return new CompositeDateValidator[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.CompositeDateValidator.3
 * JD-Core Version:    0.7.0.1
 */