package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Date;

class DiagnosisInfo$1
  implements Parcelable.Creator
{
  public DiagnosisInfo OooO00o(Parcel paramParcel)
  {
    DiagnosisInfo localDiagnosisInfo = new com/qinggan/now/common/DiagnosisInfo;
    localDiagnosisInfo.<init>();
    long l1 = paramParcel.readLong();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      Date localDate = new java/util/Date;
      localDate.<init>(l1);
      localDiagnosisInfo.o00OoOoo = localDate;
    }
    else
    {
      i = 0;
      str = null;
      localDiagnosisInfo.o00OoOoo = null;
    }
    String str = paramParcel.readString();
    localDiagnosisInfo.o00Ooo00 = str;
    int i = paramParcel.readInt();
    localDiagnosisInfo.o00Ooo0o = i;
    int j = paramParcel.readInt();
    localDiagnosisInfo.o00Ooo0O = j;
    return localDiagnosisInfo;
  }
  
  public DiagnosisInfo[] OooO0O0(int paramInt)
  {
    return new DiagnosisInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.DiagnosisInfo.1
 * JD-Core Version:    0.7.0.1
 */