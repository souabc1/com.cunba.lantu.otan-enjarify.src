package com.xuexiang.xhttp2.model;

import com.xuexiang.xhttp2.annotation.RequestParams;
import com.xuexiang.xhttp2.cache.model.CacheMode;
import com.xuexiang.xhttp2.utils.Utils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import m54207b69;

public abstract class XHttpRequest
{
  public static RequestParams getHttpRequestParams(Class paramClass)
  {
    paramClass = (RequestParams)paramClass.getAnnotation(RequestParams.class);
    String str = m54207b69.F54207b69_11("Tv04140906170A082D1F0D21261163595A6629152D2E");
    return (RequestParams)Utils.OooO00o(paramClass, str);
  }
  
  public static String getUrl(Class paramClass)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramClass;
    return (String)m54207b69.F54207b69_09(1357, arrayOfObject);
  }
  
  public String getBaseUrl()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1351, arrayOfObject);
  }
  
  public CacheMode getCacheMode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (CacheMode)m54207b69.F54207b69_09(1352, arrayOfObject);
  }
  
  public RequestParams getRequestParams()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (RequestParams)m54207b69.F54207b69_09(1354, arrayOfObject);
  }
  
  public abstract Object getResponseEntityType();
  
  public long getTimeout()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_06(1355, arrayOfObject);
  }
  
  public String getUrl()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1356, arrayOfObject);
  }
  
  public boolean isAccessToken()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(1358, arrayOfObject);
  }
  
  public Type parseReturnType()
  {
    try
    {
      Object localObject = getClass();
      String str2 = "aA2625371628373735373B2E0F3B42364448264A4438";
      str2 = m54207b69.F54207b69_11(str2);
      Class[] arrayOfClass = null;
      arrayOfClass = new Class[0];
      localObject = ((Class)localObject).getDeclaredMethod(str2, arrayOfClass);
      boolean bool = true;
      ((AccessibleObject)localObject).setAccessible(bool);
      localObject = ((Method)localObject).getGenericReturnType();
    }
    catch (SecurityException localSecurityException) {}catch (NoSuchMethodException localNoSuchMethodException) {}
    localNoSuchMethodException.printStackTrace();
    String str1 = String.class;
    return str1;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1360, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.model.XHttpRequest
 * JD-Core Version:    0.7.0.1
 */