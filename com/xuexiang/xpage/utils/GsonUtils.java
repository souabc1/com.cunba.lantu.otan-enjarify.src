package com.xuexiang.xpage.utils;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import m54207b69;

public final class GsonUtils
{
  public static final Gson OooO00o;
  
  static
  {
    Gson localGson = new com/google/gson/Gson;
    localGson.<init>();
    OooO00o = localGson;
  }
  
  private GsonUtils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static Object OooO00o(String paramString, Type paramType)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = paramType;
    return m54207b69.F54207b69_09(1706, arrayOfObject);
  }
  
  public static String OooO0O0(Object paramObject)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject;
    return (String)m54207b69.F54207b69_09(1707, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xpage.utils.GsonUtils
 * JD-Core Version:    0.7.0.1
 */