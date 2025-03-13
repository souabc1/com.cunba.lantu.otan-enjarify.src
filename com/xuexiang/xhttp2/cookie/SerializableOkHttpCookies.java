package com.xuexiang.xhttp2.cookie;

import java.io.Serializable;
import m54207b69;
import okhttp3.Cookie;

public class SerializableOkHttpCookies
  implements Serializable
{
  public final transient Cookie o00OoOoo;
  public transient Cookie o00Ooo00;
  
  public SerializableOkHttpCookies(Cookie paramCookie)
  {
    this.o00OoOoo = paramCookie;
  }
  
  public Cookie getCookies()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Cookie)m54207b69.F54207b69_09(1228, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.cookie.SerializableOkHttpCookies
 * JD-Core Version:    0.7.0.1
 */