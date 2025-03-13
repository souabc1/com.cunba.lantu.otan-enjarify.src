package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum Send2CarType
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final String o00OooO0;
  public String o00OoOoo;
  
  static
  {
    Object localObject = new com/qinggan/now/common/Send2CarType;
    String str1 = m54207b69.F54207b69_11("-A1205110822121409081E12191B");
    ((Send2CarType)localObject).<init>(str1, 0, "位置分享");
    o00Ooo0 = (Send2CarType)localObject;
    Send2CarType localSend2CarType1 = new com/qinggan/now/common/Send2CarType;
    String str2 = m54207b69.F54207b69_11("CF15040A051D10191C170E");
    localSend2CarType1.<init>(str2, 1, "音乐分享");
    o00Ooo0O = localSend2CarType1;
    Send2CarType localSend2CarType2 = new com/qinggan/now/common/Send2CarType;
    String str3 = m54207b69.F54207b69_11("Lf35242A253D2E38352B3D");
    localSend2CarType2.<init>(str3, 2, "其他");
    o00Ooo0o = localSend2CarType2;
    Send2CarType[] tmp75_72 = new Send2CarType[3];
    Send2CarType[] tmp76_75 = tmp75_72;
    Send2CarType[] tmp76_75 = tmp75_72;
    tmp76_75[0] = localObject;
    tmp76_75[1] = localSend2CarType1;
    tmp76_75[2] = localSend2CarType2;
    o00Ooo00 = tmp76_75;
    o00OooO0 = Send2CarType.class.getSimpleName();
    localObject = new com/qinggan/now/common/Send2CarType$1;
    ((Send2CarType.1)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
  }
  
  public Send2CarType(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public static Send2CarType OooO0Oo(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i) {
        return o00Ooo0o;
      }
      return o00Ooo0O;
    }
    return o00Ooo0;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getKeyWord()
  {
    return this.o00OoOoo;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = ordinal();
    paramParcel.writeInt(paramInt);
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Send2CarType
 * JD-Core Version:    0.7.0.1
 */