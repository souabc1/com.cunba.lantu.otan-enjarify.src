package com.cunba.lantu.otan.utils;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Parcelable;
import com.tencent.mmkv.MMKV;
import java.util.Set;
import m54207b69;

public final class MMKVUtil
{
  public static MMKV OooO00o;
  
  private MMKVUtil()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static boolean OooO00o(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return m54207b69.F54207b69_01(836, arrayOfObject);
  }
  
  public static Object OooO0O0(String paramString, Object paramObject)
  {
    boolean bool1 = paramObject instanceof Integer;
    MMKV localMMKV;
    if (bool1)
    {
      localMMKV = getsMMKV();
      int i = ((Integer)paramObject).intValue();
      return Integer.valueOf(localMMKV.OooO0oo(paramString, i));
    }
    bool1 = paramObject instanceof Float;
    if (bool1)
    {
      localMMKV = getsMMKV();
      float f = ((Float)paramObject).floatValue();
      return Float.valueOf(localMMKV.OooO0oO(paramString, f));
    }
    bool1 = paramObject instanceof String;
    if (bool1)
    {
      localMMKV = getsMMKV();
      paramObject = (String)paramObject;
      return localMMKV.OooOO0(paramString, paramObject);
    }
    bool1 = paramObject instanceof Boolean;
    if (bool1)
    {
      localMMKV = getsMMKV();
      boolean bool2 = ((Boolean)paramObject).booleanValue();
      return Boolean.valueOf(localMMKV.OooO0OO(paramString, bool2));
    }
    bool1 = paramObject instanceof Long;
    if (bool1)
    {
      localMMKV = getsMMKV();
      long l = ((Long)paramObject).longValue();
      return Long.valueOf(localMMKV.OooO(paramString, l));
    }
    bool1 = paramObject instanceof Double;
    if (bool1)
    {
      localMMKV = getsMMKV();
      double d = ((Double)paramObject).doubleValue();
      return Double.valueOf(localMMKV.OooO0o(paramString, d));
    }
    bool1 = paramObject instanceof byte[];
    if (bool1) {
      return getsMMKV().OooO0Oo(paramString);
    }
    bool1 = paramObject instanceof Set;
    if (bool1)
    {
      localMMKV = getsMMKV();
      paramObject = (Set)paramObject;
      return localMMKV.OooOO0O(paramString, paramObject);
    }
    return null;
  }
  
  public static boolean OooO0OO(String paramString, boolean paramBoolean)
  {
    try
    {
      MMKV localMMKV = getsMMKV();
      return localMMKV.getBoolean(paramString, paramBoolean);
    }
    catch (Exception localException)
    {
      localException;
    }
    return paramBoolean;
  }
  
  public static int OooO0Oo(String paramString, int paramInt)
  {
    try
    {
      MMKV localMMKV = getsMMKV();
      return localMMKV.getInt(paramString, paramInt);
    }
    catch (Exception localException)
    {
      localException;
    }
    return paramInt;
  }
  
  public static void OooO0o(Context paramContext)
  {
    MMKV.OooOoO(paramContext.getApplicationContext());
    paramContext = MMKV.OooOOO0();
    OooO00o = paramContext;
    String str = m54207b69.F54207b69_11("ZL29232F31242E19463D4842342D2031473D");
    boolean bool = paramContext.contains(str);
    if (!bool)
    {
      paramContext = Boolean.FALSE;
      OooO0oO(str, paramContext);
    }
  }
  
  public static String OooO0o0(String paramString1, String paramString2)
  {
    try
    {
      MMKV localMMKV = getsMMKV();
      return localMMKV.getString(paramString1, paramString2);
    }
    catch (Exception localException)
    {
      localException;
    }
    return paramString2;
  }
  
  public static boolean OooO0oO(String paramString, Object paramObject)
  {
    boolean bool1 = paramObject instanceof Integer;
    MMKV localMMKV;
    if (bool1)
    {
      localMMKV = getsMMKV();
      int i = ((Integer)paramObject).intValue();
      return localMMKV.OooOOoo(paramString, i);
    }
    bool1 = paramObject instanceof Float;
    if (bool1)
    {
      localMMKV = getsMMKV();
      float f = ((Float)paramObject).floatValue();
      return localMMKV.OooOOo(paramString, f);
    }
    bool1 = paramObject instanceof String;
    if (bool1)
    {
      localMMKV = getsMMKV();
      paramObject = (String)paramObject;
      return localMMKV.OooOo0O(paramString, paramObject);
    }
    bool1 = paramObject instanceof Boolean;
    if (bool1)
    {
      localMMKV = getsMMKV();
      boolean bool2 = ((Boolean)paramObject).booleanValue();
      return localMMKV.OooOo(paramString, bool2);
    }
    bool1 = paramObject instanceof Long;
    if (bool1)
    {
      localMMKV = getsMMKV();
      long l = ((Long)paramObject).longValue();
      return localMMKV.OooOo00(paramString, l);
    }
    bool1 = paramObject instanceof Double;
    if (bool1)
    {
      localMMKV = getsMMKV();
      double d = ((Double)paramObject).doubleValue();
      return localMMKV.OooOOo0(paramString, d);
    }
    bool1 = paramObject instanceof Parcelable;
    if (bool1)
    {
      localMMKV = getsMMKV();
      paramObject = (Parcelable)paramObject;
      return localMMKV.OooOo0(paramString, paramObject);
    }
    bool1 = paramObject instanceof byte[];
    if (bool1)
    {
      localMMKV = getsMMKV();
      paramObject = (byte[])paramObject;
      return localMMKV.OooOoO0(paramString, paramObject);
    }
    bool1 = paramObject instanceof Set;
    if (bool1)
    {
      localMMKV = getsMMKV();
      paramObject = (Set)paramObject;
      return localMMKV.OooOo0o(paramString, paramObject);
    }
    return false;
  }
  
  public static void OooO0oo(String paramString)
  {
    getsMMKV().remove(paramString).apply();
  }
  
  public static String getLanguage()
  {
    Object[] arrayOfObject = new Object[0];
    return (String)m54207b69.F54207b69_09(837, arrayOfObject);
  }
  
  public static MMKV getsMMKV()
  {
    Object[] arrayOfObject = new Object[0];
    return (MMKV)m54207b69.F54207b69_09(838, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.utils.MMKVUtil
 * JD-Core Version:    0.7.0.1
 */