package com.xuexiang.xhttp2.cookie;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Map;
import m54207b69;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

public class PersistentCookieStore
{
  public final Map OooO00o;
  public final SharedPreferences OooO0O0;
  
  public void OooO00o(HttpUrl paramHttpUrl, Cookie paramCookie)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramHttpUrl;
    arrayOfObject[2] = paramCookie;
    m54207b69.F54207b69_00(1221, arrayOfObject);
  }
  
  public void OooO0O0(List paramList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramList;
    m54207b69.F54207b69_00(1222, arrayOfObject);
  }
  
  public final String OooO0OO(byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramArrayOfByte;
    return (String)m54207b69.F54207b69_09(1223, arrayOfObject);
  }
  
  public String OooO0Oo(SerializableOkHttpCookies paramSerializableOkHttpCookies)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramSerializableOkHttpCookies;
    return (String)m54207b69.F54207b69_09(1224, arrayOfObject);
  }
  
  public final String OooO0o(Cookie paramCookie)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCookie;
    return (String)m54207b69.F54207b69_09(1225, arrayOfObject);
  }
  
  public List OooO0o0(HttpUrl paramHttpUrl)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramHttpUrl;
    return (List)m54207b69.F54207b69_09(1226, arrayOfObject);
  }
  
  public List getCookies()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (List)m54207b69.F54207b69_09(1227, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.cookie.PersistentCookieStore
 * JD-Core Version:    0.7.0.1
 */