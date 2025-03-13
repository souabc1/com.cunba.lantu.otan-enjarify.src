package com.xuexiang.xui.utils;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.Properties;
import m54207b69;

public class DeviceUtils
{
  public static final String[] OooO00o;
  public static String OooO0O0;
  public static String OooO0OO;
  public static boolean OooO0Oo;
  public static final String OooO0o;
  public static boolean OooO0o0;
  
  static
  {
    String str1 = "M9";
    String[] tmp7_4 = new String[4];
    String[] tmp8_7 = tmp7_4;
    String[] tmp8_7 = tmp7_4;
    tmp8_7[0] = "m9";
    tmp8_7[1] = str1;
    tmp8_7[2] = "mx";
    String[] tmp20_8 = tmp8_7;
    tmp20_8[3] = "MX";
    OooO00o = tmp20_8;
    Object localObject1 = null;
    OooO0Oo = false;
    OooO0o0 = false;
    OooO0o = Build.BRAND.toLowerCase();
    Properties localProperties = new java/util/Properties;
    localProperties.<init>();
    Object localObject2 = "@[3A36412C3837457C3C317F132E353D4D461C3B473F533F464A5742";
    try
    {
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject2 = Class.forName((String)localObject2);
      str1 = "get";
      int i = 1;
      Class[] arrayOfClass = new Class[i];
      String str2 = String.class;
      arrayOfClass[0] = str2;
      localObject1 = ((Class)localObject2).getDeclaredMethod(str1, arrayOfClass);
      localObject2 = "[b100E4E120F1C11531F14561F131D1F1A1D1D5E1F17241D";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject2 = OooO00o(localProperties, (Method)localObject1, (String)localObject2);
      OooO0O0 = (String)localObject2;
      localObject2 = "W;4955175C52575D661D685C5357646851256371";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject1 = OooO00o(localProperties, (Method)localObject1, (String)localObject2);
      OooO0OO = (String)localObject1;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private DeviceUtils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static String OooO00o(Properties paramProperties, Method paramMethod, String paramString)
  {
    paramProperties = paramProperties.getProperty(paramString);
    if (paramProperties == null) {}
    try
    {
      paramString = new Object[] { paramString };
      paramMethod = paramMethod.invoke(null, paramString);
      paramMethod = (String)paramMethod;
      paramProperties = paramMethod;
    }
    catch (Exception localException)
    {
      label33:
      break label33;
    }
    if (paramProperties != null) {
      paramProperties = paramProperties.toLowerCase();
    }
    return paramProperties;
  }
  
  public static boolean OooO0O0(String[] paramArrayOfString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramArrayOfString;
    return m54207b69.F54207b69_01(2044, arrayOfObject);
  }
  
  public static boolean isEssentialPhone()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2045, arrayOfObject);
  }
  
  public static boolean isFlyme()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2046, arrayOfObject);
  }
  
  public static boolean isFlymeVersionHigher5_2_4()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2047, arrayOfObject);
  }
  
  public static boolean isHuawei()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2048, arrayOfObject);
  }
  
  public static boolean isMIUI()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2049, arrayOfObject);
  }
  
  public static boolean isMIUIV5()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2050, arrayOfObject);
  }
  
  public static boolean isMIUIV6()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2051, arrayOfObject);
  }
  
  public static boolean isMIUIV7()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2052, arrayOfObject);
  }
  
  public static boolean isMIUIV8()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2053, arrayOfObject);
  }
  
  public static boolean isMIUIV9()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2054, arrayOfObject);
  }
  
  public static boolean isMeizu()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2055, arrayOfObject);
  }
  
  public static boolean isOppo()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2056, arrayOfObject);
  }
  
  public static boolean isVivo()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2057, arrayOfObject);
  }
  
  public static boolean isXiaomi()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2058, arrayOfObject);
  }
  
  public static boolean isZTKC2016()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2059, arrayOfObject);
  }
  
  public static boolean isZUKZ1()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2060, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.utils.DeviceUtils
 * JD-Core Version:    0.7.0.1
 */