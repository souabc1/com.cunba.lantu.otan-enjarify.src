package com.xuexiang.xhttp2;

import android.app.Application;
import android.content.Context;
import com.xuexiang.xhttp2.cache.RxCache;
import com.xuexiang.xhttp2.cache.RxCache.Builder;
import com.xuexiang.xhttp2.cache.converter.IDiskConverter;
import com.xuexiang.xhttp2.cache.converter.SerializableDiskConverter;
import com.xuexiang.xhttp2.cache.model.CacheMode;
import com.xuexiang.xhttp2.cookie.CookieManager;
import com.xuexiang.xhttp2.https.DefaultHostnameVerifier;
import com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor;
import com.xuexiang.xhttp2.model.HttpHeaders;
import com.xuexiang.xhttp2.model.HttpParams;
import com.xuexiang.xhttp2.request.DeleteRequest;
import com.xuexiang.xhttp2.request.DownloadRequest;
import com.xuexiang.xhttp2.request.GetRequest;
import com.xuexiang.xhttp2.request.PostRequest;
import com.xuexiang.xhttp2.request.PutRequest;
import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import m54207b69;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import retrofit2.Retrofit.Builder;

public final class XHttp
{
  public static volatile XHttp OooOOo;
  public static Application OooOOoo;
  public int OooO;
  public String OooO00o;
  public String OooO0O0 = "";
  public Cache OooO0OO = null;
  public CacheMode OooO0Oo;
  public File OooO0o;
  public long OooO0o0;
  public long OooO0oO;
  public int OooO0oo;
  public int OooOO0;
  public HttpHeaders OooOO0O;
  public HttpParams OooOO0o;
  public Retrofit.Builder OooOOO;
  public OkHttpClient.Builder OooOOO0;
  public RxCache.Builder OooOOOO;
  public CookieManager OooOOOo;
  public boolean OooOOo0;
  
  private XHttp()
  {
    Object localObject1 = CacheMode.NO_CACHE;
    this.OooO0Oo = ((CacheMode)localObject1);
    this.OooO0o0 = -1;
    this.OooO0oo = 0;
    this.OooO = 500;
    this.OooOO0 = 0;
    localObject1 = new okhttp3/OkHttpClient$Builder;
    ((OkHttpClient.Builder)localObject1).<init>();
    this.OooOOO0 = ((OkHttpClient.Builder)localObject1);
    Object localObject2 = new com/xuexiang/xhttp2/https/DefaultHostnameVerifier;
    ((DefaultHostnameVerifier)localObject2).<init>();
    ((OkHttpClient.Builder)localObject1).OooO0o((HostnameVerifier)localObject2);
    localObject1 = this.OooOOO0;
    localObject2 = TimeUnit.MILLISECONDS;
    long l = 15000L;
    ((OkHttpClient.Builder)localObject1).OooO0o0(l, (TimeUnit)localObject2);
    this.OooOOO0.OooO(l, (TimeUnit)localObject2);
    this.OooOOO0.OooOO0O(l, (TimeUnit)localObject2);
    localObject1 = new retrofit2/Retrofit$Builder;
    ((Retrofit.Builder)localObject1).<init>();
    this.OooOOO = ((Retrofit.Builder)localObject1);
    localObject1 = new com/xuexiang/xhttp2/cache/RxCache$Builder;
    ((RxCache.Builder)localObject1).<init>();
    localObject2 = OooOOoo;
    localObject1 = ((RxCache.Builder)localObject1).OooOOOO((Context)localObject2);
    localObject2 = new com/xuexiang/xhttp2/cache/converter/SerializableDiskConverter;
    ((SerializableDiskConverter)localObject2).<init>();
    localObject1 = ((RxCache.Builder)localObject1).OooOOO((IDiskConverter)localObject2);
    this.OooOOOO = ((RxCache.Builder)localObject1);
  }
  
  public static DeleteRequest OooO0OO(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return (DeleteRequest)m54207b69.F54207b69_09(1010, arrayOfObject);
  }
  
  public static DownloadRequest OooO0Oo(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return (DownloadRequest)m54207b69.F54207b69_09(1011, arrayOfObject);
  }
  
  public static void OooO0o(Application paramApplication)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramApplication;
    m54207b69.F54207b69_00(1012, arrayOfObject);
  }
  
  public static GetRequest OooO0o0(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return (GetRequest)m54207b69.F54207b69_09(1013, arrayOfObject);
  }
  
  public static PostRequest OooO0oO(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return (PostRequest)m54207b69.F54207b69_09(1014, arrayOfObject);
  }
  
  public static PutRequest OooO0oo(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return (PutRequest)m54207b69.F54207b69_09(1015, arrayOfObject);
  }
  
  public static void OooOOo0()
  {
    Object[] arrayOfObject = new Object[0];
    m54207b69.F54207b69_00(1023, arrayOfObject);
  }
  
  public static String getBaseUrl()
  {
    Object[] arrayOfObject = new Object[0];
    return (String)m54207b69.F54207b69_09(1024, arrayOfObject);
  }
  
  public static File getCacheDirectory()
  {
    Object[] arrayOfObject = new Object[0];
    return (File)m54207b69.F54207b69_09(1025, arrayOfObject);
  }
  
  public static long getCacheMaxSize()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_06(1026, arrayOfObject);
  }
  
  public static CacheMode getCacheMode()
  {
    Object[] arrayOfObject = new Object[0];
    return (CacheMode)m54207b69.F54207b69_09(1027, arrayOfObject);
  }
  
  public static long getCacheTime()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_06(1028, arrayOfObject);
  }
  
  public static HttpHeaders getCommonHeaders()
  {
    Object[] arrayOfObject = new Object[0];
    return (HttpHeaders)m54207b69.F54207b69_09(1029, arrayOfObject);
  }
  
  public static HttpParams getCommonParams()
  {
    Object[] arrayOfObject = new Object[0];
    return (HttpParams)m54207b69.F54207b69_09(1030, arrayOfObject);
  }
  
  public static Context getContext()
  {
    Object[] arrayOfObject = new Object[0];
    return (Context)m54207b69.F54207b69_09(1031, arrayOfObject);
  }
  
  public static CookieManager getCookieJar()
  {
    Object[] arrayOfObject = new Object[0];
    return (CookieManager)m54207b69.F54207b69_09(1032, arrayOfObject);
  }
  
  public static Cache getHttpCache()
  {
    Object[] arrayOfObject = new Object[0];
    return (Cache)m54207b69.F54207b69_09(1033, arrayOfObject);
  }
  
  public static XHttp getInstance()
  {
    Object[] arrayOfObject = new Object[0];
    return (XHttp)m54207b69.F54207b69_09(1034, arrayOfObject);
  }
  
  public static OkHttpClient getOkHttpClient()
  {
    Object[] arrayOfObject = new Object[0];
    return (OkHttpClient)m54207b69.F54207b69_09(1035, arrayOfObject);
  }
  
  public static OkHttpClient.Builder getOkHttpClientBuilder()
  {
    Object[] arrayOfObject = new Object[0];
    return (OkHttpClient.Builder)m54207b69.F54207b69_09(1036, arrayOfObject);
  }
  
  public static Retrofit.Builder getRetrofitBuilder()
  {
    Object[] arrayOfObject = new Object[0];
    return (Retrofit.Builder)m54207b69.F54207b69_09(1037, arrayOfObject);
  }
  
  public static int getRetryCount()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_05(1038, arrayOfObject);
  }
  
  public static int getRetryDelay()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_05(1039, arrayOfObject);
  }
  
  public static int getRetryIncreaseDelay()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_05(1040, arrayOfObject);
  }
  
  public static RxCache getRxCache()
  {
    Object[] arrayOfObject = new Object[0];
    return (RxCache)m54207b69.F54207b69_09(1041, arrayOfObject);
  }
  
  public static RxCache.Builder getRxCacheBuilder()
  {
    Object[] arrayOfObject = new Object[0];
    return (RxCache.Builder)m54207b69.F54207b69_09(1042, arrayOfObject);
  }
  
  public static String getSubUrl()
  {
    Object[] arrayOfObject = new Object[0];
    return (String)m54207b69.F54207b69_09(1043, arrayOfObject);
  }
  
  public XHttp OooO(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (XHttp)m54207b69.F54207b69_09(1007, arrayOfObject);
  }
  
  public XHttp OooO00o(HttpLoggingInterceptor paramHttpLoggingInterceptor)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramHttpLoggingInterceptor;
    return (XHttp)m54207b69.F54207b69_09(1008, arrayOfObject);
  }
  
  public XHttp OooO0O0(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (XHttp)m54207b69.F54207b69_09(1009, arrayOfObject);
  }
  
  public XHttp OooOO0(IDiskConverter paramIDiskConverter)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramIDiskConverter;
    return (XHttp)m54207b69.F54207b69_09(1016, arrayOfObject);
  }
  
  public XHttp OooOO0O(long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    return (XHttp)m54207b69.F54207b69_09(1017, arrayOfObject);
  }
  
  public XHttp OooOO0o(CacheMode paramCacheMode)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCacheMode;
    return (XHttp)m54207b69.F54207b69_09(1018, arrayOfObject);
  }
  
  public XHttp OooOOO(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (XHttp)m54207b69.F54207b69_09(1019, arrayOfObject);
  }
  
  public XHttp OooOOO0(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (XHttp)m54207b69.F54207b69_09(1020, arrayOfObject);
  }
  
  public XHttp OooOOOO(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (XHttp)m54207b69.F54207b69_09(1021, arrayOfObject);
  }
  
  public XHttp OooOOOo(long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    return (XHttp)m54207b69.F54207b69_09(1022, arrayOfObject);
  }
  
  public boolean isInStrictMode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(1044, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.XHttp
 * JD-Core Version:    0.7.0.1
 */