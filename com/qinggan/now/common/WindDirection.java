package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum WindDirection
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/WindDirection;
    Object localObject2 = m54207b69.F54207b69_11("[_11110E0D1010241D19232513221E29");
    ((WindDirection)localObject1).<init>((String)localObject2, 0, 0);
    o00OooO = (WindDirection)localObject1;
    localObject2 = new com/qinggan/now/common/WindDirection;
    Object localObject3 = m54207b69.F54207b69_11("et3A3C282340363B2E28");
    int i = 1;
    ((WindDirection)localObject2).<init>((String)localObject3, i, i);
    o00Ooo0o = (WindDirection)localObject2;
    localObject3 = new com/qinggan/now/common/WindDirection;
    Object localObject4 = m54207b69.F54207b69_11("dT11160903");
    int j = 2;
    ((WindDirection)localObject3).<init>((String)localObject4, j, j);
    o00Ooo0 = (WindDirection)localObject3;
    localObject4 = new com/qinggan/now/common/WindDirection;
    Object localObject5 = m54207b69.F54207b69_11("Bv253A252542383D2C2A");
    int k = 3;
    ((WindDirection)localObject4).<init>((String)localObject5, k, k);
    o00OooOo = (WindDirection)localObject4;
    localObject5 = new com/qinggan/now/common/WindDirection;
    Object localObject6 = m54207b69.F54207b69_11("u%766B727471");
    int m = 4;
    ((WindDirection)localObject5).<init>((String)localObject6, m, m);
    o00OooOO = (WindDirection)localObject5;
    localObject6 = new com/qinggan/now/common/WindDirection;
    Object localObject7 = m54207b69.F54207b69_11("MI1A071E200523122125");
    int n = 5;
    ((WindDirection)localObject6).<init>((String)localObject7, n, n);
    o0O00o0 = (WindDirection)localObject6;
    localObject7 = new com/qinggan/now/common/WindDirection;
    Object localObject8 = m54207b69.F54207b69_11("v%72617874");
    int i1 = 6;
    ((WindDirection)localObject7).<init>((String)localObject8, i1, i1);
    o00Ooooo = (WindDirection)localObject7;
    localObject8 = new com/qinggan/now/common/WindDirection;
    Object localObject9 = m54207b69.F54207b69_11("U<7274706B78707F7670");
    int i2 = 7;
    ((WindDirection)localObject8).<init>((String)localObject9, i2, i2);
    o00OooO0 = (WindDirection)localObject8;
    localObject9 = new com/qinggan/now/common/WindDirection;
    Object localObject10 = m54207b69.F54207b69_11("5G0909171613");
    int i3 = 8;
    ((WindDirection)localObject9).<init>((String)localObject10, i3, i3);
    o00Ooo0O = (WindDirection)localObject9;
    localObject10 = new com/qinggan/now/common/WindDirection;
    String str = m54207b69.F54207b69_11("MT011B19140A051B2422");
    int i4 = 9;
    ((WindDirection)localObject10).<init>(str, i4, i4);
    o00OoooO = (WindDirection)localObject10;
    WindDirection[] tmp298_295 = new WindDirection[10];
    WindDirection[] tmp299_298 = tmp298_295;
    WindDirection[] tmp299_298 = tmp298_295;
    tmp299_298[0] = localObject1;
    tmp299_298[1] = localObject2;
    WindDirection[] tmp306_299 = tmp299_298;
    WindDirection[] tmp306_299 = tmp299_298;
    tmp306_299[2] = localObject3;
    tmp306_299[3] = localObject4;
    WindDirection[] tmp314_306 = tmp306_299;
    WindDirection[] tmp314_306 = tmp306_299;
    tmp314_306[4] = localObject5;
    tmp314_306[5] = localObject6;
    WindDirection[] tmp323_314 = tmp314_306;
    WindDirection[] tmp323_314 = tmp314_306;
    tmp323_314[6] = localObject7;
    tmp323_314[7] = localObject8;
    tmp323_314[8] = localObject9;
    WindDirection[] tmp339_323 = tmp323_314;
    tmp339_323[9] = localObject10;
    o00Ooo00 = tmp339_323;
    localObject1 = new com/qinggan/now/common/WindDirection$1;
    ((WindDirection.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public WindDirection(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = ordinal();
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.WindDirection
 * JD-Core Version:    0.7.0.1
 */