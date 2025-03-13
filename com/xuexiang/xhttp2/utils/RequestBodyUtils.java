package com.xuexiang.xhttp2.utils;

import java.io.InputStream;
import m54207b69;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public final class RequestBodyUtils
{
  private RequestBodyUtils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static RequestBody OooO00o(MediaType paramMediaType, InputStream paramInputStream)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramMediaType;
    arrayOfObject[1] = paramInputStream;
    return (RequestBody)m54207b69.F54207b69_09(1536, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.utils.RequestBodyUtils
 * JD-Core Version:    0.7.0.1
 */