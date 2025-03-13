package com.xuexiang.xhttp2.annotation;

import com.xuexiang.xhttp2.cache.model.CacheMode;
import java.lang.annotation.Annotation;

public @interface NetMethod
{
  public static final int ALL_PARAMS_INDEX = 255;
  public static final String DELETE = "delete";
  public static final int FORM_BODY = 2;
  public static final String GET = "get";
  public static final int JSON = 1;
  public static final int JSON_OBJECT = 4;
  public static final long NOT_SET_CACHE_TIME = 254L;
  public static final String POST = "post";
  public static final String PUT = "put";
  public static final int URL_GET = 3;
  
  boolean accessToken();
  
  String action();
  
  String baseUrl();
  
  int cacheKeyIndex();
  
  CacheMode cacheMode();
  
  long cacheTime();
  
  boolean keepJson();
  
  int paramType();
  
  String[] parameterNames();
  
  long timeout();
  
  String url();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.annotation.NetMethod
 * JD-Core Version:    0.7.0.1
 */