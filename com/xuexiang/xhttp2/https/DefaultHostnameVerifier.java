package com.xuexiang.xhttp2.https;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import m54207b69;

public class DefaultHostnameVerifier
  implements HostnameVerifier
{
  public boolean verify(String paramString, SSLSession paramSSLSession)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    arrayOfObject[2] = paramSSLSession;
    return m54207b69.F54207b69_01(1237, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.https.DefaultHostnameVerifier
 * JD-Core Version:    0.7.0.1
 */