package com.qinggan.airtrip.bean;

import android.text.TextUtils;
import m54207b69;

public enum PlanType
{
  public String o00OoOoo;
  public String o00Ooo00;
  
  static
  {
    PlanType localPlanType = new com/qinggan/airtrip/bean/PlanType;
    Object localObject1 = m54207b69.F54207b69_11("7<0F0F0F43131412471711164B1B161A4F1F151E531F1D21572322255B2727295F2B2C2D632F29316799A13B3839");
    String str1 = m54207b69.F54207b69_11("U97B51606C595D5D63");
    localPlanType.<init>(str1, 0, (String)localObject1, "大飞机");
    o00Ooo0O = localPlanType;
    localObject1 = new com/qinggan/airtrip/bean/PlanType;
    Object localObject2 = m54207b69.F54207b69_11("CD77767E3B7B7A833F7F7F7E437F8181478386854B878B894F8B908D538F949A5729218B9F9A5D2F2791A69E6332322FA4A0A36A4345AAA7A770563F4AA5ADB477455750B9B97D4DC4BDC6");
    String str2 = m54207b69.F54207b69_11("@,7F424F43448146544A52");
    ((PlanType)localObject1).<init>(str2, 1, (String)localObject2, "小飞机");
    o00Ooo0o = (PlanType)localObject1;
    localObject2 = new com/qinggan/airtrip/bean/PlanType;
    String str3 = m54207b69.F54207b69_11("6[343035412D");
    ((PlanType)localObject2).<init>(str3, 2, "-1", "暂时还没有确定");
    o00OooO0 = (PlanType)localObject2;
    PlanType[] tmp90_87 = new PlanType[3];
    PlanType[] tmp91_90 = tmp90_87;
    PlanType[] tmp91_90 = tmp90_87;
    tmp91_90[0] = localPlanType;
    tmp91_90[1] = localObject1;
    tmp91_90[2] = localObject2;
  }
  
  public PlanType(String paramString1, String paramString2)
  {
    this.o00Ooo00 = paramString1;
    this.o00OoOoo = paramString2;
  }
  
  public static PlanType OooO0O0(String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    if (bool1) {
      return o00OooO0;
    }
    Object localObject = "-";
    paramString = paramString.split((String)localObject);
    if (paramString == null) {
      return o00OooO0;
    }
    int i = paramString.length;
    if (i == 0) {
      return o00OooO0;
    }
    localObject = values();
    int j = localObject.length;
    int k = 0;
    while (k < j)
    {
      PlanType localPlanType = localObject[k];
      String str = localPlanType.o00Ooo00;
      CharSequence localCharSequence = paramString[0];
      boolean bool2 = str.contains(localCharSequence);
      if (bool2) {
        return localPlanType;
      }
      k += 1;
    }
    return o00OooO0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.PlanType
 * JD-Core Version:    0.7.0.1
 */