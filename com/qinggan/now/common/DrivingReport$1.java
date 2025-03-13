package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class DrivingReport$1
  implements Parcelable.Creator
{
  public DrivingReport OooO00o(Parcel paramParcel)
  {
    DrivingReport localDrivingReport = new com/qinggan/now/common/DrivingReport;
    localDrivingReport.<init>();
    Object localObject = TimePeriod.class.getClassLoader();
    localObject = (TimePeriod)paramParcel.readParcelable((ClassLoader)localObject);
    DrivingReport.OooO00o(localDrivingReport, (TimePeriod)localObject);
    float f = paramParcel.readFloat();
    DrivingReport.OooO0OO(localDrivingReport, f);
    f = paramParcel.readFloat();
    DrivingReport.OooO0Oo(localDrivingReport, f);
    long l = paramParcel.readLong();
    DrivingReport.OooO0o0(localDrivingReport, l);
    f = paramParcel.readFloat();
    DrivingReport.OooO0o(localDrivingReport, f);
    int i = paramParcel.readInt();
    DrivingReport.OooO0oO(localDrivingReport, i);
    i = paramParcel.readInt();
    DrivingReport.OooO0oo(localDrivingReport, i);
    i = paramParcel.readInt();
    DrivingReport.OooO(localDrivingReport, i);
    i = paramParcel.readInt();
    DrivingReport.OooOO0(localDrivingReport, i);
    int j = paramParcel.readInt();
    DrivingReport.OooOO0O(localDrivingReport, j);
    return localDrivingReport;
  }
  
  public DrivingReport[] OooO0O0(int paramInt)
  {
    return new DrivingReport[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.DrivingReport.1
 * JD-Core Version:    0.7.0.1
 */