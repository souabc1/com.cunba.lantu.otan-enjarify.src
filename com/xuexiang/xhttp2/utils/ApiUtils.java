package com.xuexiang.xhttp2.utils;

import com.xuexiang.xhttp2.model.ApiResult;
import m54207b69;

public final class ApiUtils
{
  public static ApiUtils.IRequestHandler OooO00o = ;
  public static int OooO0O0 = 0;
  
  private ApiUtils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static boolean OooO00o(ApiResult paramApiResult)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramApiResult;
    return m54207b69.F54207b69_01(1511, arrayOfObject);
  }
  
  private static ApiUtils.IRequestHandler getDefaultRequestHandler()
  {
    Object[] arrayOfObject = new Object[0];
    return (ApiUtils.IRequestHandler)m54207b69.F54207b69_09(1512, arrayOfObject);
  }
  
  public static int getSuccessCode()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_05(1513, arrayOfObject);
  }
  
  public static void setIRequestHandler(ApiUtils.IRequestHandler paramIRequestHandler)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramIRequestHandler;
    m54207b69.F54207b69_00(1514, arrayOfObject);
  }
  
  public static void setSuccessCode(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    m54207b69.F54207b69_00(1515, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.utils.ApiUtils
 * JD-Core Version:    0.7.0.1
 */