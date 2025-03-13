package com.just.agentweb.core.url;

import androidx.collection.ArrayMap;
import java.util.Map;
import m54207b69;

public class HttpHeaders
{
  public Map OooO00o = null;
  
  public HttpHeaders()
  {
    ArrayMap localArrayMap = new androidx/collection/ArrayMap;
    localArrayMap.<init>();
    this.OooO00o = localArrayMap;
  }
  
  public static HttpHeaders OooO00o()
  {
    HttpHeaders localHttpHeaders = new com/just/agentweb/core/url/HttpHeaders;
    localHttpHeaders.<init>();
    return localHttpHeaders;
  }
  
  public Map getHeaders()
  {
    return this.OooO00o;
  }
  
  public boolean isEmptyHeaders()
  {
    Map localMap = this.OooO00o;
    if (localMap != null)
    {
      bool = localMap.isEmpty();
      if (!bool)
      {
        bool = false;
        localMap = null;
        return bool;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("Ol24191A1F280E130F112729220D31171C181A303265");
    localStringBuilder.append((String)localObject);
    localObject = this.OooO00o;
    localStringBuilder.append(localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.core.url.HttpHeaders
 * JD-Core Version:    0.7.0.1
 */