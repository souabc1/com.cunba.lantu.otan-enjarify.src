package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum CoordSystem
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/CoordSystem;
    Object localObject2 = m54207b69.F54207b69_11("uk3C2D3A5663");
    int i = 1;
    ((CoordSystem)localObject1).<init>((String)localObject2, 0, i);
    o00OooO = (CoordSystem)localObject1;
    localObject2 = new com/qinggan/now/common/CoordSystem;
    Object localObject3 = m54207b69.F54207b69_11("bE12031880751F0E0719201611");
    int j = 2;
    ((CoordSystem)localObject2).<init>((String)localObject3, i, j);
    o00OooOO = (CoordSystem)localObject2;
    localObject3 = new com/qinggan/now/common/CoordSystem;
    Object localObject4 = m54207b69.F54207b69_11("C671767E0908");
    int k = 3;
    ((CoordSystem)localObject3).<init>((String)localObject4, j, k);
    o00Ooo0o = (CoordSystem)localObject3;
    localObject4 = new com/qinggan/now/common/CoordSystem;
    Object localObject5 = m54207b69.F54207b69_11("7~393E36515026394232354148");
    int m = 4;
    ((CoordSystem)localObject4).<init>((String)localObject5, k, m);
    o00OooO0 = (CoordSystem)localObject4;
    localObject5 = new com/qinggan/now/common/CoordSystem;
    Object localObject6 = m54207b69.F54207b69_11("rk29305D552B2C");
    int n = 5;
    ((CoordSystem)localObject5).<init>((String)localObject6, m, n);
    o00Ooo0 = (CoordSystem)localObject5;
    localObject6 = new com/qinggan/now/common/CoordSystem;
    String str = m54207b69.F54207b69_11("2g252459612E29");
    ((CoordSystem)localObject6).<init>(str, n, 6);
    o00Ooo0O = (CoordSystem)localObject6;
    CoordSystem[] tmp171_168 = new CoordSystem[6];
    CoordSystem[] tmp172_171 = tmp171_168;
    CoordSystem[] tmp172_171 = tmp171_168;
    tmp172_171[0] = localObject1;
    tmp172_171[1] = localObject2;
    CoordSystem[] tmp179_172 = tmp172_171;
    CoordSystem[] tmp179_172 = tmp172_171;
    tmp179_172[2] = localObject3;
    tmp179_172[3] = localObject4;
    tmp179_172[4] = localObject5;
    CoordSystem[] tmp191_179 = tmp179_172;
    tmp191_179[5] = localObject6;
    o00Ooo00 = tmp191_179;
    localObject1 = new com/qinggan/now/common/CoordSystem$1;
    ((CoordSystem.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public CoordSystem(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getCode()
  {
    return this.o00OoOoo;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = ordinal();
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.CoordSystem
 * JD-Core Version:    0.7.0.1
 */