package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class CalendarConstraints$1
  implements Parcelable.Creator
{
  public CalendarConstraints createFromParcel(Parcel paramParcel)
  {
    Object localObject1 = Month.class;
    Object localObject2 = ((Class)localObject1).getClassLoader();
    localObject2 = paramParcel.readParcelable((ClassLoader)localObject2);
    Object localObject3 = localObject2;
    localObject3 = (Month)localObject2;
    localObject2 = ((Class)localObject1).getClassLoader();
    localObject2 = paramParcel.readParcelable((ClassLoader)localObject2);
    Object localObject4 = localObject2;
    localObject4 = (Month)localObject2;
    localObject1 = ((Class)localObject1).getClassLoader();
    localObject1 = paramParcel.readParcelable((ClassLoader)localObject1);
    Object localObject5 = localObject1;
    localObject5 = (Month)localObject1;
    localObject1 = CalendarConstraints.DateValidator.class.getClassLoader();
    localObject1 = paramParcel.readParcelable((ClassLoader)localObject1);
    Object localObject6 = localObject1;
    localObject6 = (CalendarConstraints.DateValidator)localObject1;
    int i = paramParcel.readInt();
    paramParcel = new com/google/android/material/datepicker/CalendarConstraints;
    paramParcel.<init>((Month)localObject3, (Month)localObject4, (CalendarConstraints.DateValidator)localObject6, (Month)localObject5, i, null);
    return paramParcel;
  }
  
  public CalendarConstraints[] newArray(int paramInt)
  {
    return new CalendarConstraints[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.CalendarConstraints.1
 * JD-Core Version:    0.7.0.1
 */