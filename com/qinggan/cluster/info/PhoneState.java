package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum PhoneState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/cluster/info/PhoneState;
    Object localObject2 = m54207b69.F54207b69_11("<$6A6C726F716F69");
    ((PhoneState)localObject1).<init>((String)localObject2, 0, 0);
    o00OooOO = (PhoneState)localObject1;
    localObject2 = new com/qinggan/cluster/info/PhoneState;
    Object localObject3 = m54207b69.F54207b69_11("_)6A6766636B737C71706E6F");
    int i = 1;
    ((PhoneState)localObject2).<init>((String)localObject3, i, i);
    o00Ooo0 = (PhoneState)localObject2;
    localObject3 = new com/qinggan/cluster/info/PhoneState;
    Object localObject4 = m54207b69.F54207b69_11("Fk23252932");
    int j = 2;
    ((PhoneState)localObject3).<init>((String)localObject4, j, j);
    o00OooO = (PhoneState)localObject3;
    localObject4 = new com/qinggan/cluster/info/PhoneState;
    Object localObject5 = m54207b69.F54207b69_11("I27A747E78716C68");
    int k = 3;
    ((PhoneState)localObject4).<init>((String)localObject5, k, k);
    o00OooO0 = (PhoneState)localObject4;
    localObject5 = new com/qinggan/cluster/info/PhoneState;
    Object localObject6 = m54207b69.F54207b69_11("PJ0D060507111A0F120E0F");
    int m = 4;
    ((PhoneState)localObject5).<init>((String)localObject6, m, m);
    o00Ooo0o = (PhoneState)localObject5;
    localObject6 = new com/qinggan/cluster/info/PhoneState;
    String str = m54207b69.F54207b69_11("eU161B1D1E141B071719");
    int n = 5;
    ((PhoneState)localObject6).<init>(str, n, n);
    o00Ooo0O = (PhoneState)localObject6;
    PhoneState[] tmp170_167 = new PhoneState[6];
    PhoneState[] tmp171_170 = tmp170_167;
    PhoneState[] tmp171_170 = tmp170_167;
    tmp171_170[0] = localObject1;
    tmp171_170[1] = localObject2;
    PhoneState[] tmp178_171 = tmp171_170;
    PhoneState[] tmp178_171 = tmp171_170;
    tmp178_171[2] = localObject3;
    tmp178_171[3] = localObject4;
    tmp178_171[4] = localObject5;
    PhoneState[] tmp190_178 = tmp178_171;
    tmp190_178[5] = localObject6;
    o00Ooo00 = tmp190_178;
    localObject1 = new com/qinggan/cluster/info/PhoneState$1;
    ((PhoneState.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public PhoneState(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getValue()
  {
    return this.o00OoOoo;
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
 * Qualified Name:     com.qinggan.cluster.info.PhoneState
 * JD-Core Version:    0.7.0.1
 */