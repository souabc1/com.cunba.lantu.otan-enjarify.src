package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class CalcState$1
  implements Parcelable.Creator
{
  public CalcState OooO00o(Parcel paramParcel)
  {
    CalcState[] arrayOfCalcState = CalcState.values();
    int i = paramParcel.readInt();
    return arrayOfCalcState[i];
  }
  
  public CalcState[] OooO0O0(int paramInt)
  {
    return new CalcState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.info.CalcState.1
 * JD-Core Version:    0.7.0.1
 */