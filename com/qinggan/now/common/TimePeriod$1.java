package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCard;
import m54207b69;

class TimePeriod$1
  implements Parcelable.Creator
{
  public TimePeriod OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    String str1 = paramParcel.readString();
    paramParcel = paramParcel.readString();
    TimePeriod localTimePeriod = TimePeriod.OooO0OO(str1);
    Object localObject = NowCard.CREATOR;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str2 = m54207b69.F54207b69_11("%m0E030B0B5B");
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(str1);
    str1 = m54207b69.F54207b69_11("uf4A09090E0761");
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append(paramParcel);
    paramParcel = m54207b69.F54207b69_11("qB6E3329332F322C7F");
    ((StringBuilder)localObject).append(paramParcel);
    ((StringBuilder)localObject).append(localTimePeriod);
    return TimePeriod.values()[i];
  }
  
  public TimePeriod[] OooO0O0(int paramInt)
  {
    return new TimePeriod[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.TimePeriod.1
 * JD-Core Version:    0.7.0.1
 */