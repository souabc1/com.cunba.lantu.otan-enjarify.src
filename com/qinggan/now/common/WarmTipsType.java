package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum WarmTipsType
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/WarmTipsType;
    Object localObject2 = m54207b69.F54207b69_11("Xa37050B0B06120A2B210916131B0D23171E20");
    int i = 1;
    ((WarmTipsType)localObject1).<init>((String)localObject2, 0, i);
    o00OooOo = (WarmTipsType)localObject1;
    localObject2 = new com/qinggan/now/common/WarmTipsType;
    Object localObject3 = m54207b69.F54207b69_11("f%664E4E495245517D52595F");
    int j = 2;
    ((WarmTipsType)localObject2).<init>((String)localObject3, i, j);
    o00Ooo0o = (WarmTipsType)localObject2;
    localObject3 = new com/qinggan/now/common/WarmTipsType;
    Object localObject4 = m54207b69.F54207b69_11("K`28100E0C08061F");
    int k = 3;
    ((WarmTipsType)localObject3).<init>((String)localObject4, j, k);
    o00OooO0 = (WarmTipsType)localObject3;
    localObject4 = new com/qinggan/now/common/WarmTipsType;
    Object localObject5 = m54207b69.F54207b69_11("z879494A5A555B525C655F56");
    int m = 4;
    ((WarmTipsType)localObject4).<init>((String)localObject5, k, m);
    o00Ooo0 = (WarmTipsType)localObject4;
    localObject5 = new com/qinggan/now/common/WarmTipsType;
    Object localObject6 = m54207b69.F54207b69_11("rm2F0D0B3D0C111F0C1028");
    int n = 5;
    ((WarmTipsType)localObject5).<init>((String)localObject6, m, n);
    o00Ooo0O = (WarmTipsType)localObject5;
    localObject6 = new com/qinggan/now/common/WarmTipsType;
    Object localObject7 = m54207b69.F54207b69_11("IK07252E252921342E302D3039");
    int i1 = 6;
    ((WarmTipsType)localObject6).<init>((String)localObject7, n, i1);
    o00OooO = (WarmTipsType)localObject6;
    localObject7 = new com/qinggan/now/common/WarmTipsType;
    String str = m54207b69.F54207b69_11("`:754F54624C");
    ((WarmTipsType)localObject7).<init>(str, i1, 7);
    o00OooOO = (WarmTipsType)localObject7;
    WarmTipsType[] tmp203_200 = new WarmTipsType[7];
    WarmTipsType[] tmp204_203 = tmp203_200;
    WarmTipsType[] tmp204_203 = tmp203_200;
    tmp204_203[0] = localObject1;
    tmp204_203[1] = localObject2;
    WarmTipsType[] tmp211_204 = tmp204_203;
    WarmTipsType[] tmp211_204 = tmp204_203;
    tmp211_204[2] = localObject3;
    tmp211_204[3] = localObject4;
    WarmTipsType[] tmp219_211 = tmp211_204;
    WarmTipsType[] tmp219_211 = tmp211_204;
    tmp219_211[4] = localObject5;
    tmp219_211[5] = localObject6;
    tmp219_211[6] = localObject7;
    o00Ooo00 = tmp219_211;
    localObject1 = new com/qinggan/now/common/WarmTipsType$1;
    ((WarmTipsType.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public WarmTipsType(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public static WarmTipsType OooO0OO(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return o00OooOO;
    case 6: 
      return o00OooO;
    case 5: 
      return o00Ooo0O;
    case 4: 
      return o00Ooo0;
    case 3: 
      return o00OooO0;
    case 2: 
      return o00Ooo0o;
    }
    return o00OooOo;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.WarmTipsType
 * JD-Core Version:    0.7.0.1
 */