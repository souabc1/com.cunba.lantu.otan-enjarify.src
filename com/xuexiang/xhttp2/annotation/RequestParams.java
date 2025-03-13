package com.xuexiang.xhttp2.annotation;

import com.xuexiang.xhttp2.cache.model.CacheMode;
import java.lang.annotation.Annotation;

public @interface RequestParams
{
  boolean accessToken();
  
  String baseUrl();
  
  CacheMode cacheMode();
  
  long cacheTime();
  
  boolean keepJson();
  
  long timeout();
  
  String url();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.annotation.RequestParams
 * JD-Core Version:    0.7.0.1
 */