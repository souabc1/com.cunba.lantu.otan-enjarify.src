package com.xuexiang.xhttp2.model;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.xuexiang.xhttp2.XHttp;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import m54207b69;

public class HttpHeaders
  implements Serializable
{
  public static final String FORMAT_HTTP_DATA = "EEE, dd MMM y HH:mm:ss 'GMT'";
  public static final TimeZone GMT_TIME_ZONE = TimeZone.getTimeZone("GMT");
  public static final String HEAD_KEY_ACCEPT = "Accept";
  public static final String HEAD_KEY_ACCEPT_ENCODING = "Accept-Encoding";
  public static final String HEAD_KEY_ACCEPT_LANGUAGE = "Accept-Language";
  public static final String HEAD_KEY_CACHE_CONTROL = "Cache-Control";
  public static final String HEAD_KEY_CONNECTION = "Connection";
  public static final String HEAD_KEY_CONTENT_DISPOSITION = "Content-Disposition";
  public static final String HEAD_KEY_CONTENT_ENCODING = "Content-Encoding";
  public static final String HEAD_KEY_CONTENT_LENGTH = "Content-Length";
  public static final String HEAD_KEY_CONTENT_RANGE = "Content-Range";
  public static final String HEAD_KEY_CONTENT_TYPE = "Content-Type";
  public static final String HEAD_KEY_COOKIE = "Cookie";
  public static final String HEAD_KEY_COOKIE2 = "Cookie2";
  public static final String HEAD_KEY_DATE = "Date";
  public static final String HEAD_KEY_EXPIRES = "Expires";
  public static final String HEAD_KEY_E_TAG = "ETag";
  public static final String HEAD_KEY_IF_MODIFIED_SINCE = "If-Modified-Since";
  public static final String HEAD_KEY_IF_NONE_MATCH = "If-None-Match";
  public static final String HEAD_KEY_LAST_MODIFIED = "Last-Modified";
  public static final String HEAD_KEY_LOCATION = "Location";
  public static final String HEAD_KEY_PRAGMA = "Pragma";
  public static final String HEAD_KEY_RESPONSE_CODE = "ResponseCode";
  public static final String HEAD_KEY_RESPONSE_MESSAGE = "ResponseMessage";
  public static final String HEAD_KEY_SET_COOKIE = "Set-Cookie";
  public static final String HEAD_KEY_SET_COOKIE2 = "Set-Cookie2";
  public static final String HEAD_KEY_USER_AGENT = "User-Agent";
  public static final String HEAD_VALUE_ACCEPT_ENCODING = "gzip, deflate";
  public static final String HEAD_VALUE_CONNECTION_CLOSE = "close";
  public static final String HEAD_VALUE_CONNECTION_KEEP_ALIVE = "keep-alive";
  private static String acceptLanguage;
  private static String userAgent;
  public LinkedHashMap headersMap;
  
  public HttpHeaders()
  {
    init();
  }
  
  public HttpHeaders(String paramString1, String paramString2)
  {
    init();
    put(paramString1, paramString2);
  }
  
  private static String formatMillisToGMT(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[0] = localLong;
    return (String)m54207b69.F54207b69_09(1311, arrayOfObject);
  }
  
  public static String getAcceptLanguage()
  {
    Object[] arrayOfObject = new Object[0];
    return (String)m54207b69.F54207b69_09(1313, arrayOfObject);
  }
  
  public static String getCacheControl(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    return (String)m54207b69.F54207b69_09(1314, arrayOfObject);
  }
  
  public static long getDate(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return m54207b69.F54207b69_06(1315, arrayOfObject);
  }
  
  public static String getDate(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[0] = localLong;
    return (String)m54207b69.F54207b69_09(1316, arrayOfObject);
  }
  
  public static long getExpiration(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return m54207b69.F54207b69_06(1317, arrayOfObject);
  }
  
  public static long getLastModified(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return m54207b69.F54207b69_06(1318, arrayOfObject);
  }
  
  public static String getUserAgent()
  {
    String str1 = userAgent;
    boolean bool1 = TextUtils.isEmpty(str1);
    if (bool1)
    {
      bool1 = false;
      str1 = null;
      localObject1 = "Cz191619571F19240F1D1C285F1F211C2E18252D29683D742026212D2F39";
    }
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = Class.forName((String)localObject1);
      localObject2 = "6Z2D403A08332E452F0D44474A403B";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject1 = ((Class)localObject1).getDeclaredField((String)localObject2);
      localObject1 = ((Field)localObject1).get(null);
      localObject1 = (Integer)localObject1;
      localObject2 = XHttp.getContext();
      int i = ((Integer)localObject1).intValue();
      str1 = ((Context)localObject2).getString(i);
    }
    catch (Exception localException)
    {
      Object localObject2;
      label72:
      boolean bool2;
      String str2;
      int j;
      String str3;
      boolean bool3;
      String str4;
      int k;
      break label72;
    }
    bool2 = TextUtils.isEmpty(str1);
    if (bool2) {
      str1 = m54207b69.F54207b69_11("a(6548544448494F0E250F22130C714F556D61251B91281E805E6574625D69262C7B222A8C7C7D6A74A776748E6D89354C4B4C384C3C359997B49E9E3F44817F828D49B1908F888D4850C797A5A78E9595576E586B5C62B1D2A1A7A3B59D647B7A7B677B");
    }
    Object localObject1 = Locale.getDefault();
    localObject2 = new java/lang/StringBuffer;
    ((StringBuffer)localObject2).<init>();
    str2 = Build.VERSION.RELEASE;
    j = str2.length();
    if (j <= 0) {
      str2 = "1.0";
    }
    ((StringBuffer)localObject2).append(str2);
    str2 = "; ";
    ((StringBuffer)localObject2).append(str2);
    str3 = ((Locale)localObject1).getLanguage();
    if (str3 != null)
    {
      str3 = str3.toLowerCase((Locale)localObject1);
      ((StringBuffer)localObject2).append(str3);
      str3 = ((Locale)localObject1).getCountry();
      bool3 = TextUtils.isEmpty(str3);
      if (bool3) {
        break label217;
      }
      str4 = "-";
      ((StringBuffer)localObject2).append(str4);
      localObject1 = str3.toLowerCase((Locale)localObject1);
    }
    else
    {
      localObject1 = "en";
    }
    ((StringBuffer)localObject2).append((String)localObject1);
    label217:
    localObject1 = "REL";
    str3 = Build.VERSION.CODENAME;
    bool2 = ((String)localObject1).equals(str3);
    if (bool2)
    {
      localObject1 = Build.MODEL;
      j = ((String)localObject1).length();
      if (j > 0)
      {
        ((StringBuffer)localObject2).append(str2);
        ((StringBuffer)localObject2).append((String)localObject1);
      }
    }
    localObject1 = Build.ID;
    k = ((String)localObject1).length();
    if (k > 0)
    {
      str2 = m54207b69.F54207b69_11("851578425F5D5620");
      ((StringBuffer)localObject2).append(str2);
      ((StringBuffer)localObject2).append((String)localObject1);
    }
    localObject1 = m54207b69.F54207b69_11("&}30132117151D63");
    localObject1 = new Object[] { localObject2, localObject1 };
    str1 = String.format(str1, (Object[])localObject1);
    userAgent = str1;
    return str1;
    return userAgent;
  }
  
  private void init()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(1321, arrayOfObject);
  }
  
  private static long parseGMTToMillis(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return m54207b69.F54207b69_06(1323, arrayOfObject);
  }
  
  public static void setAcceptLanguage(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    m54207b69.F54207b69_00(1327, arrayOfObject);
  }
  
  public static void setUserAgent(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    m54207b69.F54207b69_00(1328, arrayOfObject);
  }
  
  public void clear()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(1310, arrayOfObject);
  }
  
  public String get(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (String)m54207b69.F54207b69_09(1312, arrayOfObject);
  }
  
  public Set getNames()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Set)m54207b69.F54207b69_09(1319, arrayOfObject);
  }
  
  public boolean isEmpty()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(1322, arrayOfObject);
  }
  
  public void put(HttpHeaders paramHttpHeaders)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramHttpHeaders;
    m54207b69.F54207b69_00(1324, arrayOfObject);
  }
  
  public void put(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString1;
    arrayOfObject[2] = paramString2;
    m54207b69.F54207b69_00(1325, arrayOfObject);
  }
  
  public String remove(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (String)m54207b69.F54207b69_09(1326, arrayOfObject);
  }
  
  public final String toJSONString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1329, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1330, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.model.HttpHeaders
 * JD-Core Version:    0.7.0.1
 */