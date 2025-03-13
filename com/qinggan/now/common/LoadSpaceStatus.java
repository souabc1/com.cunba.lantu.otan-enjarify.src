package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum LoadSpaceStatus
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/LoadSpaceStatus;
    Object localObject2 = m54207b69.F54207b69_11("y]1E3234313C3E");
    ((LoadSpaceStatus)localObject1).<init>((String)localObject2, 0);
    o00Ooo00 = (LoadSpaceStatus)localObject1;
    localObject2 = new com/qinggan/now/common/LoadSpaceStatus;
    Object localObject3 = m54207b69.F54207b69_11("8H07392F29");
    ((LoadSpaceStatus)localObject2).<init>((String)localObject3, 1);
    o00Ooo0 = (LoadSpaceStatus)localObject2;
    localObject3 = new com/qinggan/now/common/LoadSpaceStatus;
    String str = m54207b69.F54207b69_11("Qp251F1D21230C");
    ((LoadSpaceStatus)localObject3).<init>(str, 2);
    o00Ooo0O = (LoadSpaceStatus)localObject3;
    LoadSpaceStatus[] tmp64_61 = new LoadSpaceStatus[3];
    LoadSpaceStatus[] tmp65_64 = tmp64_61;
    LoadSpaceStatus[] tmp65_64 = tmp64_61;
    tmp65_64[0] = localObject1;
    tmp65_64[1] = localObject2;
    tmp65_64[2] = localObject3;
    o00OoOoo = tmp65_64;
    localObject1 = new com/qinggan/now/common/LoadSpaceStatus$1;
    ((LoadSpaceStatus.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = ordinal();
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.LoadSpaceStatus
 * JD-Core Version:    0.7.0.1
 */