package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum TimePeriod
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo00;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/TimePeriod;
    Object localObject2 = m54207b69.F54207b69_11("[_2C3B3E333540");
    Object localObject3 = m54207b69.F54207b69_11("sB11080310100B");
    ((TimePeriod)localObject1).<init>((String)localObject3, 0, (String)localObject2, "秒");
    o00OooOO = (TimePeriod)localObject1;
    localObject2 = new com/qinggan/now/common/TimePeriod;
    Object localObject4 = m54207b69.F54207b69_11("{X353238303042");
    Object localObject5 = m54207b69.F54207b69_11("Kl2126243C3C2E");
    ((TimePeriod)localObject2).<init>((String)localObject5, 1, (String)localObject4, "分钟");
    o00OooO0 = (TimePeriod)localObject2;
    localObject4 = new com/qinggan/now/common/TimePeriod;
    localObject3 = m54207b69.F54207b69_11("(Y31372E2E");
    Object localObject6 = m54207b69.F54207b69_11("`27A7E6963");
    ((TimePeriod)localObject4).<init>((String)localObject6, 2, (String)localObject3, "小时");
    o00Ooo0o = (TimePeriod)localObject4;
    localObject3 = new com/qinggan/now/common/TimePeriod;
    ((TimePeriod)localObject3).<init>("DAY", 3, "day", "日");
    o00Ooo0O = (TimePeriod)localObject3;
    localObject5 = new com/qinggan/now/common/TimePeriod;
    localObject6 = m54207b69.F54207b69_11("B=4A595A59");
    String str1 = m54207b69.F54207b69_11("O$73626372");
    ((TimePeriod)localObject5).<init>(str1, 4, (String)localObject6, "周");
    o00OooOo = (TimePeriod)localObject5;
    localObject6 = new com/qinggan/now/common/TimePeriod;
    Object localObject7 = m54207b69.F54207b69_11("^&4B4A4A5552");
    String str2 = m54207b69.F54207b69_11("/]1013150C19");
    ((TimePeriod)localObject6).<init>(str2, 5, (String)localObject7, "月");
    o00OooO = (TimePeriod)localObject6;
    localObject7 = new com/qinggan/now/common/TimePeriod;
    str1 = m54207b69.F54207b69_11("2l150A0F21");
    String str3 = m54207b69.F54207b69_11("\\p29363325");
    ((TimePeriod)localObject7).<init>(str3, 6, str1, "年");
    o0O00o0 = (TimePeriod)localObject7;
    TimePeriod[] tmp224_221 = new TimePeriod[7];
    TimePeriod[] tmp225_224 = tmp224_221;
    TimePeriod[] tmp225_224 = tmp224_221;
    tmp225_224[0] = localObject1;
    tmp225_224[1] = localObject2;
    TimePeriod[] tmp232_225 = tmp225_224;
    TimePeriod[] tmp232_225 = tmp225_224;
    tmp232_225[2] = localObject4;
    tmp232_225[3] = localObject3;
    TimePeriod[] tmp239_232 = tmp232_225;
    TimePeriod[] tmp239_232 = tmp232_225;
    tmp239_232[4] = localObject5;
    tmp239_232[5] = localObject6;
    tmp239_232[6] = localObject7;
    o00Ooo0 = tmp239_232;
    localObject1 = new com/qinggan/now/common/TimePeriod$1;
    ((TimePeriod.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public TimePeriod(String paramString1, String paramString2)
  {
    this.o00OoOoo = paramString1;
    this.o00Ooo00 = paramString2;
  }
  
  public static TimePeriod OooO0OO(String paramString)
  {
    String str = m54207b69.F54207b69_11("[_2C3B3E333540");
    boolean bool1 = paramString.equalsIgnoreCase(str);
    if (bool1) {
      return o00OooOO;
    }
    str = m54207b69.F54207b69_11("{X353238303042");
    bool1 = paramString.equalsIgnoreCase(str);
    if (bool1) {
      return o00OooO0;
    }
    str = m54207b69.F54207b69_11("(Y31372E2E");
    bool1 = paramString.equalsIgnoreCase(str);
    if (bool1) {
      return o00Ooo0o;
    }
    str = "day";
    bool1 = paramString.equalsIgnoreCase(str);
    if (bool1) {
      return o00Ooo0O;
    }
    str = m54207b69.F54207b69_11("B=4A595A59");
    bool1 = paramString.equalsIgnoreCase(str);
    if (bool1) {
      return o00OooOo;
    }
    str = m54207b69.F54207b69_11("^&4B4A4A5552");
    bool1 = paramString.equalsIgnoreCase(str);
    if (bool1) {
      return o00OooO;
    }
    str = m54207b69.F54207b69_11("2l150A0F21");
    boolean bool2 = paramString.equalsIgnoreCase(str);
    if (bool2) {
      return o0O00o0;
    }
    return null;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getCode()
  {
    return this.o00OoOoo;
  }
  
  public String getName()
  {
    return this.o00Ooo00;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = ordinal();
    paramParcel.writeInt(paramInt);
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.TimePeriod
 * JD-Core Version:    0.7.0.1
 */