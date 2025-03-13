package com.xuexiang.xhttp2.https;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import m54207b69;

class HttpsUtils$MyTrustManager
  implements X509TrustManager
{
  public X509TrustManager OooO00o;
  public X509TrustManager OooO0O0;
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramArrayOfX509Certificate;
    arrayOfObject[2] = paramString;
    m54207b69.F54207b69_00(1238, arrayOfObject);
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramArrayOfX509Certificate;
    arrayOfObject[2] = paramString;
    m54207b69.F54207b69_00(1239, arrayOfObject);
  }
  
  public X509Certificate[] getAcceptedIssuers()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (X509Certificate[])m54207b69.F54207b69_09(1240, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.https.HttpsUtils.MyTrustManager
 * JD-Core Version:    0.7.0.1
 */