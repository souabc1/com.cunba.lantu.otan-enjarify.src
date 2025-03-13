package com.xuexiang.xhttp2.utils;

import com.google.gson.Gson;
import java.nio.charset.Charset;
import java.util.Map;
import m54207b69;
import okhttp3.MediaType;
import okhttp3.Response;

public final class HttpUtils
{
  public static final Charset OooO00o = Charset.forName(m54207b69.F54207b69_11("2i3C3E314755"));
  public static final Gson OooO0O0;
  
  static
  {
    Gson localGson = new com/google/gson/Gson;
    localGson.<init>();
    OooO0O0 = localGson;
  }
  
  private HttpUtils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static String OooO00o(String paramString, Map paramMap)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = paramMap;
    return (String)m54207b69.F54207b69_09(1516, arrayOfObject);
  }
  
  public static String OooO0O0(Response paramResponse)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramResponse;
    return (String)m54207b69.F54207b69_09(1517, arrayOfObject);
  }
  
  public static boolean OooO0OO(MediaType paramMediaType)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramMediaType;
    return m54207b69.F54207b69_01(1518, arrayOfObject);
  }
  
  public static boolean OooO0Oo(MediaType paramMediaType)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramMediaType;
    return m54207b69.F54207b69_01(1519, arrayOfObject);
  }
  
  public static String OooO0o(Object paramObject)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject;
    return (String)m54207b69.F54207b69_09(1520, arrayOfObject);
  }
  
  public static String OooO0o0(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return (String)m54207b69.F54207b69_09(1521, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.utils.HttpUtils
 * JD-Core Version:    0.7.0.1
 */