package com.xuexiang.xhttp2.request;

import android.content.Context;
import android.text.TextUtils;
import com.xuexiang.xhttp2.XHttp;
import com.xuexiang.xhttp2.api.ApiService;
import com.xuexiang.xhttp2.cache.RxCache;
import com.xuexiang.xhttp2.cache.RxCache.Builder;
import com.xuexiang.xhttp2.cache.converter.IDiskConverter;
import com.xuexiang.xhttp2.cache.model.CacheMode;
import com.xuexiang.xhttp2.callback.CallBack;
import com.xuexiang.xhttp2.callback.CallBackProxy;
import com.xuexiang.xhttp2.callback.CallClazzProxy;
import com.xuexiang.xhttp2.https.HttpsUtils.SSLParams;
import com.xuexiang.xhttp2.model.HttpHeaders;
import com.xuexiang.xhttp2.model.HttpParams;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.lang.reflect.Type;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import m54207b69;
import okhttp3.Cache;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;

public abstract class BaseRequest
{
  public boolean OooO;
  public Context OooO00o;
  public HttpUrl OooO0O0;
  public String OooO0OO;
  public String OooO0Oo;
  public boolean OooO0o;
  public String OooO0o0;
  public boolean OooO0oO;
  public boolean OooO0oo;
  public boolean OooOO0;
  public boolean OooOO0O;
  public long OooOO0o;
  public long OooOOO;
  public long OooOOO0;
  public int OooOOOO;
  public int OooOOOo;
  public HttpHeaders OooOOo;
  public int OooOOo0;
  public HttpParams OooOOoo;
  public String OooOo;
  public Cache OooOo0;
  public RxCache OooOo00;
  public CacheMode OooOo0O;
  public long OooOo0o;
  public OkHttpClient OooOoO;
  public IDiskConverter OooOoO0;
  public Proxy OooOoOO;
  public final List OooOoo;
  public final List OooOoo0;
  public Retrofit OooOooO;
  public ApiService OooOooo;
  public HostnameVerifier Oooo0;
  public List Oooo000;
  public List Oooo00O;
  public HttpsUtils.SSLParams Oooo00o;
  public List Oooo0O0;
  
  public BaseRequest(String paramString)
  {
    boolean bool1 = false;
    this.OooO0o = false;
    boolean bool2 = true;
    this.OooO0oO = bool2;
    this.OooO0oo = false;
    this.OooO = false;
    this.OooOO0 = false;
    this.OooOO0O = false;
    Object localObject = new com/xuexiang/xhttp2/model/HttpHeaders;
    ((HttpHeaders)localObject).<init>();
    this.OooOOo = ((HttpHeaders)localObject);
    localObject = new com/xuexiang/xhttp2/model/HttpParams;
    ((HttpParams)localObject).<init>();
    this.OooOOoo = ((HttpParams)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooOoo0 = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooOoo = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.Oooo000 = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.Oooo00O = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.Oooo0O0 = ((List)localObject);
    localObject = XHttp.getContext();
    this.OooO00o = ((Context)localObject);
    this.OooO0o0 = paramString;
    paramString = XHttp.getBaseUrl();
    this.OooO0OO = paramString;
    paramString = XHttp.getSubUrl();
    this.OooO0Oo = paramString;
    paramString = this.OooO0OO;
    boolean bool3 = TextUtils.isEmpty(paramString);
    if (!bool3)
    {
      paramString = HttpUrl.OooOOo0(this.OooO0OO);
      this.OooO0O0 = paramString;
    }
    paramString = XHttp.getCacheMode();
    this.OooOo0O = paramString;
    long l = XHttp.getCacheTime();
    this.OooOo0o = l;
    int i = XHttp.getRetryCount();
    this.OooOOOO = i;
    i = XHttp.getRetryDelay();
    this.OooOOOo = i;
    i = XHttp.getRetryIncreaseDelay();
    this.OooOOo0 = i;
    paramString = XHttp.getHttpCache();
    this.OooOo0 = paramString;
    paramString = HttpHeaders.getAcceptLanguage();
    bool1 = TextUtils.isEmpty(paramString);
    if (!bool1)
    {
      localObject = m54207b69.F54207b69_11("\\.6F4E4F4E625F0969574953665B5659");
      OooOOOO((String)localObject, paramString);
    }
    paramString = HttpHeaders.getUserAgent();
    bool1 = TextUtils.isEmpty(paramString);
    if (!bool1)
    {
      localObject = m54207b69.F54207b69_11("Ec3611081452270A0D1520");
      OooOOOO((String)localObject, paramString);
    }
    paramString = XHttp.getCommonParams();
    if (paramString != null)
    {
      paramString = this.OooOOoo;
      localObject = XHttp.getCommonParams();
      paramString.put((HttpParams)localObject);
    }
    paramString = XHttp.getCommonHeaders();
    if (paramString != null)
    {
      paramString = this.OooOOo;
      localObject = XHttp.getCommonHeaders();
      paramString.put((HttpHeaders)localObject);
    }
  }
  
  public Disposable OooO(CallBack paramCallBack)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCallBack;
    return (Disposable)m54207b69.F54207b69_09(1387, arrayOfObject);
  }
  
  public BaseRequest OooO00o(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (BaseRequest)m54207b69.F54207b69_09(1388, arrayOfObject);
  }
  
  public BaseRequest OooO0O0(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (BaseRequest)m54207b69.F54207b69_09(1389, arrayOfObject);
  }
  
  public BaseRequest OooO0OO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (BaseRequest)m54207b69.F54207b69_09(1390, arrayOfObject);
  }
  
  public BaseRequest OooO0Oo(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (BaseRequest)m54207b69.F54207b69_09(1391, arrayOfObject);
  }
  
  public BaseRequest OooO0o(long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    return (BaseRequest)m54207b69.F54207b69_09(1392, arrayOfObject);
  }
  
  public BaseRequest OooO0o0(CacheMode paramCacheMode)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCacheMode;
    return (BaseRequest)m54207b69.F54207b69_09(1393, arrayOfObject);
  }
  
  public Observable OooO0oO(CallClazzProxy paramCallClazzProxy)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCallClazzProxy;
    return (Observable)m54207b69.F54207b69_09(1394, arrayOfObject);
  }
  
  public Observable OooO0oo(Type paramType)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramType;
    return (Observable)m54207b69.F54207b69_09(1395, arrayOfObject);
  }
  
  public Disposable OooOO0(CallBackProxy paramCallBackProxy)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCallBackProxy;
    return (Disposable)m54207b69.F54207b69_09(1396, arrayOfObject);
  }
  
  public final OkHttpClient.Builder OooOO0O()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (OkHttpClient.Builder)m54207b69.F54207b69_09(1397, arrayOfObject);
  }
  
  public abstract Observable OooOO0o();
  
  public final RxCache.Builder OooOOO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (RxCache.Builder)m54207b69.F54207b69_09(1398, arrayOfObject);
  }
  
  public final Retrofit.Builder OooOOO0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Retrofit.Builder)m54207b69.F54207b69_09(1399, arrayOfObject);
  }
  
  public BaseRequest OooOOOO(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString1;
    arrayOfObject[2] = paramString2;
    return (BaseRequest)m54207b69.F54207b69_09(1400, arrayOfObject);
  }
  
  public BaseRequest OooOOOo(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (BaseRequest)m54207b69.F54207b69_09(1401, arrayOfObject);
  }
  
  public BaseRequest OooOOo(String paramString, Object paramObject)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    arrayOfObject[2] = paramObject;
    return (BaseRequest)m54207b69.F54207b69_09(1402, arrayOfObject);
  }
  
  public BaseRequest OooOOo0(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (BaseRequest)m54207b69.F54207b69_09(1403, arrayOfObject);
  }
  
  public BaseRequest OooOOoo(Map paramMap)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMap;
    return (BaseRequest)m54207b69.F54207b69_09(1404, arrayOfObject);
  }
  
  public BaseRequest OooOo(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (BaseRequest)m54207b69.F54207b69_09(1405, arrayOfObject);
  }
  
  public BaseRequest OooOo0(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (BaseRequest)m54207b69.F54207b69_09(1406, arrayOfObject);
  }
  
  public BaseRequest OooOo00(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (BaseRequest)m54207b69.F54207b69_09(1407, arrayOfObject);
  }
  
  public BaseRequest OooOo0O(long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    return (BaseRequest)m54207b69.F54207b69_09(1408, arrayOfObject);
  }
  
  public Observable OooOo0o(Observable paramObservable, CallBackProxy paramCallBackProxy)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramObservable;
    arrayOfObject[2] = paramCallBackProxy;
    return (Observable)m54207b69.F54207b69_09(1409, arrayOfObject);
  }
  
  public String getBaseUrl()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1410, arrayOfObject);
  }
  
  public HttpParams getParams()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (HttpParams)m54207b69.F54207b69_09(1411, arrayOfObject);
  }
  
  public String getUrl()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1412, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.request.BaseRequest
 * JD-Core Version:    0.7.0.1
 */