package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum TrafficType
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/TrafficType;
    Object localObject2 = m54207b69.F54207b69_11("cf233F38262634382A");
    int i = 1;
    ((TrafficType)localObject1).<init>((String)localObject2, 0, i);
    o00Ooo0o = (TrafficType)localObject1;
    localObject2 = new com/qinggan/now/common/TrafficType;
    Object localObject3 = m54207b69.F54207b69_11(";i3A262841");
    int j = 2;
    ((TrafficType)localObject2).<init>((String)localObject3, i, j);
    o00OooO0 = (TrafficType)localObject2;
    localObject3 = new com/qinggan/now/common/TrafficType;
    Object localObject4 = m54207b69.F54207b69_11("Eg252C2A2730");
    int k = 3;
    ((TrafficType)localObject3).<init>((String)localObject4, j, k);
    o00Ooo0 = (TrafficType)localObject3;
    localObject4 = new com/qinggan/now/common/TrafficType;
    Object localObject5 = m54207b69.F54207b69_11("CH0B05091E1111");
    int m = 4;
    ((TrafficType)localObject4).<init>((String)localObject5, k, m);
    o00Ooo0O = (TrafficType)localObject4;
    localObject5 = new com/qinggan/now/common/TrafficType;
    String str = m54207b69.F54207b69_11("0b372D2B2F313A32");
    ((TrafficType)localObject5).<init>(str, m, -1);
    o00OooO = (TrafficType)localObject5;
    TrafficType[] tmp138_135 = new TrafficType[5];
    TrafficType[] tmp139_138 = tmp138_135;
    TrafficType[] tmp139_138 = tmp138_135;
    tmp139_138[0] = localObject1;
    tmp139_138[1] = localObject2;
    TrafficType[] tmp146_139 = tmp139_138;
    TrafficType[] tmp146_139 = tmp139_138;
    tmp146_139[2] = localObject3;
    tmp146_139[3] = localObject4;
    tmp146_139[4] = localObject5;
    o00Ooo00 = tmp146_139;
    localObject1 = new com/qinggan/now/common/TrafficType$1;
    ((TrafficType.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public TrafficType(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public static TrafficType OooO0OO(int paramInt)
  {
    int i = 1;
    if (paramInt != i)
    {
      i = 2;
      if (paramInt != i)
      {
        i = 3;
        if (paramInt != i)
        {
          i = 4;
          if (paramInt != i) {
            return o00OooO;
          }
          return o00Ooo0O;
        }
        return o00Ooo0;
      }
      return o00OooO0;
    }
    return o00Ooo0o;
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
 * Qualified Name:     com.qinggan.now.common.TrafficType
 * JD-Core Version:    0.7.0.1
 */