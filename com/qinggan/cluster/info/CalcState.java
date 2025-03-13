package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum CalcState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    Object localObject1 = new com/qinggan/cluster/info/CalcState;
    Object localObject2 = m54207b69.F54207b69_11(")P13121E1613171B1E2127");
    ((CalcState)localObject1).<init>((String)localObject2, 0);
    o00Ooo00 = (CalcState)localObject1;
    localObject2 = new com/qinggan/cluster/info/CalcState;
    Object localObject3 = m54207b69.F54207b69_11("T<7F7E728267746F868782797A");
    ((CalcState)localObject2).<init>((String)localObject3, 1);
    o00Ooo0O = (CalcState)localObject2;
    localObject3 = new com/qinggan/cluster/info/CalcState;
    Object localObject4 = m54207b69.F54207b69_11("'V15181C180D151D2622");
    ((CalcState)localObject3).<init>((String)localObject4, 2);
    o00Ooo0 = (CalcState)localObject3;
    localObject4 = new com/qinggan/cluster/info/CalcState;
    String str = m54207b69.F54207b69_11("0b372D2B2F313A32");
    ((CalcState)localObject4).<init>(str, 3);
    o00Ooo0o = (CalcState)localObject4;
    CalcState[] tmp86_83 = new CalcState[4];
    CalcState[] tmp87_86 = tmp86_83;
    CalcState[] tmp87_86 = tmp86_83;
    tmp87_86[0] = localObject1;
    tmp87_86[1] = localObject2;
    tmp87_86[2] = localObject3;
    CalcState[] tmp97_87 = tmp87_86;
    tmp97_87[3] = localObject4;
    o00OoOoo = tmp97_87;
    localObject1 = new com/qinggan/cluster/info/CalcState$1;
    ((CalcState.1)localObject1).<init>();
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
 * Qualified Name:     com.qinggan.cluster.info.CalcState
 * JD-Core Version:    0.7.0.1
 */