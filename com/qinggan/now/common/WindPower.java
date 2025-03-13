package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum WindPower
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/WindPower;
    Object localObject2 = m54207b69.F54207b69_11("]C011208091D0B");
    ((WindPower)localObject1).<init>((String)localObject2, 0, 0);
    o00Ooo0 = (WindPower)localObject1;
    localObject2 = new com/qinggan/now/common/WindPower;
    Object localObject3 = m54207b69.F54207b69_11("h)7E6169701E7B23");
    int i = 1;
    ((WindPower)localObject2).<init>((String)localObject3, i, i);
    o00OooO0 = (WindPower)localObject2;
    localObject3 = new com/qinggan/now/common/WindPower;
    Object localObject4 = m54207b69.F54207b69_11("9I1E010910811B82");
    int j = 2;
    ((WindPower)localObject3).<init>((String)localObject4, j, j);
    o00OooO = (WindPower)localObject3;
    localObject4 = new com/qinggan/now/common/WindPower;
    Object localObject5 = m54207b69.F54207b69_11("W*7D646671237A22");
    int k = 3;
    ((WindPower)localObject4).<init>((String)localObject5, k, k);
    o00OooOO = (WindPower)localObject4;
    localObject5 = new com/qinggan/now/common/WindPower;
    Object localObject6 = m54207b69.F54207b69_11("j7607F7B76056D06");
    int m = 4;
    ((WindPower)localObject5).<init>((String)localObject6, m, m);
    o00OooOo = (WindPower)localObject5;
    localObject6 = new com/qinggan/now/common/WindPower;
    Object localObject7 = m54207b69.F54207b69_11("%o3827232E5C355D");
    int n = 5;
    ((WindPower)localObject6).<init>((String)localObject7, n, n);
    o0O00o0 = (WindPower)localObject6;
    localObject7 = new com/qinggan/now/common/WindPower;
    Object localObject8 = m54207b69.F54207b69_11("Of31302A25623E65");
    int i1 = 6;
    ((WindPower)localObject7).<init>((String)localObject8, i1, i1);
    o00OoooO = (WindPower)localObject7;
    localObject8 = new com/qinggan/now/common/WindPower;
    Object localObject9 = m54207b69.F54207b69_11("'s243B3F3A4E31484A");
    int i2 = 7;
    ((WindPower)localObject8).<init>((String)localObject9, i2, i2);
    o00Ooooo = (WindPower)localObject8;
    localObject9 = new com/qinggan/now/common/WindPower;
    Object localObject10 = m54207b69.F54207b69_11("Ez2D3436414F4F2B5253");
    int i3 = 8;
    ((WindPower)localObject9).<init>((String)localObject10, i3, i3);
    o00Ooo0O = (WindPower)localObject9;
    localObject10 = new com/qinggan/now/common/WindPower;
    String str = m54207b69.F54207b69_11("tX0F12181F6D6E0D7072");
    int i4 = 9;
    ((WindPower)localObject10).<init>(str, i4, i4);
    o00Ooo0o = (WindPower)localObject10;
    WindPower[] tmp298_295 = new WindPower[10];
    WindPower[] tmp299_298 = tmp298_295;
    WindPower[] tmp299_298 = tmp298_295;
    tmp299_298[0] = localObject1;
    tmp299_298[1] = localObject2;
    WindPower[] tmp306_299 = tmp299_298;
    WindPower[] tmp306_299 = tmp299_298;
    tmp306_299[2] = localObject3;
    tmp306_299[3] = localObject4;
    WindPower[] tmp314_306 = tmp306_299;
    WindPower[] tmp314_306 = tmp306_299;
    tmp314_306[4] = localObject5;
    tmp314_306[5] = localObject6;
    WindPower[] tmp323_314 = tmp314_306;
    WindPower[] tmp323_314 = tmp314_306;
    tmp323_314[6] = localObject7;
    tmp323_314[7] = localObject8;
    tmp323_314[8] = localObject9;
    WindPower[] tmp339_323 = tmp323_314;
    tmp339_323[9] = localObject10;
    o00Ooo00 = tmp339_323;
    localObject1 = new com/qinggan/now/common/WindPower$1;
    ((WindPower.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public WindPower(int paramInt)
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
 * Qualified Name:     com.qinggan.now.common.WindPower
 * JD-Core Version:    0.7.0.1
 */