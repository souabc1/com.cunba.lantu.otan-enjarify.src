package com.xuexiang.xhttp2;

import android.app.Application;
import com.xuexiang.xhttp2.cache.key.ICacheKeyCreator;
import com.xuexiang.xhttp2.cache.key.IObjectSerializer;
import io.reactivex.disposables.Disposable;
import m54207b69;

public final class XHttpSDK
{
  private XHttpSDK()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static Disposable OooO00o(Object paramObject, Disposable paramDisposable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramObject;
    arrayOfObject[1] = paramDisposable;
    return (Disposable)m54207b69.F54207b69_09(1054, arrayOfObject);
  }
  
  public static void OooO0O0(Object paramObject)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject;
    m54207b69.F54207b69_00(1055, arrayOfObject);
  }
  
  public static void OooO0OO()
  {
    Object[] arrayOfObject = new Object[0];
    m54207b69.F54207b69_00(1056, arrayOfObject);
  }
  
  public static void OooO0Oo(Application paramApplication)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramApplication;
    m54207b69.F54207b69_00(1057, arrayOfObject);
  }
  
  public static boolean OooO0o(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return m54207b69.F54207b69_01(1058, arrayOfObject);
  }
  
  public static boolean OooO0o0(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return m54207b69.F54207b69_01(1059, arrayOfObject);
  }
  
  public static void setICacheKeyCreator(ICacheKeyCreator paramICacheKeyCreator)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramICacheKeyCreator;
    m54207b69.F54207b69_00(1060, arrayOfObject);
  }
  
  public static void setISerializer(IObjectSerializer paramIObjectSerializer)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramIObjectSerializer;
    m54207b69.F54207b69_00(1061, arrayOfObject);
  }
  
  public static void setSubUrl(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    m54207b69.F54207b69_00(1062, arrayOfObject);
  }
  
  public static void setSuccessCode(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    m54207b69.F54207b69_00(1063, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.XHttpSDK
 * JD-Core Version:    0.7.0.1
 */