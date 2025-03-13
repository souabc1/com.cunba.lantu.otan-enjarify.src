package com.xuexiang.xupdate;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.xuexiang.xupdate.entity.DownloadEntity;
import com.xuexiang.xupdate.entity.UpdateEntity;
import com.xuexiang.xupdate.entity.UpdateError;
import com.xuexiang.xupdate.listener.OnInstallListener;
import com.xuexiang.xupdate.listener.OnUpdateFailureListener;
import com.xuexiang.xupdate.proxy.IUpdateChecker;
import com.xuexiang.xupdate.proxy.IUpdateDownloader;
import com.xuexiang.xupdate.proxy.IUpdateHttpService;
import com.xuexiang.xupdate.proxy.IUpdateParser;
import com.xuexiang.xupdate.proxy.IUpdatePrompter;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m54207b69;

public final class _XUpdate
{
  public static final Map OooO00o;
  public static final Map OooO0O0;
  public static final Map OooO0OO;
  public static final LruCache OooO0Oo;
  public static final Handler OooO0o0;
  
  static
  {
    Object localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    OooO00o = (Map)localObject;
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    OooO0O0 = (Map)localObject;
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    OooO0OO = (Map)localObject;
    localObject = new android/util/LruCache;
    ((LruCache)localObject).<init>(4);
    OooO0Oo = (LruCache)localObject;
    localObject = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    ((Handler)localObject).<init>(localLooper);
    OooO0o0 = (Handler)localObject;
  }
  
  public static boolean OooO(Context paramContext, File paramFile, DownloadEntity paramDownloadEntity)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramFile;
    arrayOfObject[2] = paramDownloadEntity;
    return m54207b69.F54207b69_01(6599, arrayOfObject);
  }
  
  public static boolean OooO0OO(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return m54207b69.F54207b69_01(6602, arrayOfObject);
  }
  
  public static Drawable OooO0Oo(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return (Drawable)m54207b69.F54207b69_09(6603, arrayOfObject);
  }
  
  public static boolean OooO0o(String paramString, File paramFile)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = paramFile;
    return m54207b69.F54207b69_01(6604, arrayOfObject);
  }
  
  public static boolean OooO0o0(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return m54207b69.F54207b69_01(6605, arrayOfObject);
  }
  
  public static boolean OooO0oO(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return m54207b69.F54207b69_01(6606, arrayOfObject);
  }
  
  public static void OooO0oo()
  {
    Object[] arrayOfObject = new Object[0];
    m54207b69.F54207b69_00(6607, arrayOfObject);
  }
  
  public static void OooOO0(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    m54207b69.F54207b69_00(6608, arrayOfObject);
  }
  
  public static void OooOO0O(int paramInt, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(6609, arrayOfObject);
  }
  
  public static void OooOO0o(UpdateError paramUpdateError)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramUpdateError;
    m54207b69.F54207b69_00(6610, arrayOfObject);
  }
  
  public static void OooOOO(String paramString, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(6611, arrayOfObject);
  }
  
  public static void OooOOO0(String paramString, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(6612, arrayOfObject);
  }
  
  public static void OooOOOO(Context paramContext, UpdateEntity paramUpdateEntity)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramUpdateEntity;
    m54207b69.F54207b69_00(6613, arrayOfObject);
  }
  
  public static void OooOOOo(Context paramContext, File paramFile, DownloadEntity paramDownloadEntity)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramFile;
    arrayOfObject[2] = paramDownloadEntity;
    m54207b69.F54207b69_00(6614, arrayOfObject);
  }
  
  public static String getApkCacheDir()
  {
    Object[] arrayOfObject = new Object[0];
    return (String)m54207b69.F54207b69_09(6615, arrayOfObject);
  }
  
  public static IUpdateChecker getIUpdateChecker()
  {
    Object[] arrayOfObject = new Object[0];
    return (IUpdateChecker)m54207b69.F54207b69_09(6616, arrayOfObject);
  }
  
  public static IUpdateDownloader getIUpdateDownLoader()
  {
    Object[] arrayOfObject = new Object[0];
    return (IUpdateDownloader)m54207b69.F54207b69_09(6617, arrayOfObject);
  }
  
  public static IUpdateHttpService getIUpdateHttpService()
  {
    Object[] arrayOfObject = new Object[0];
    return (IUpdateHttpService)m54207b69.F54207b69_09(6618, arrayOfObject);
  }
  
  public static IUpdateParser getIUpdateParser()
  {
    Object[] arrayOfObject = new Object[0];
    return (IUpdateParser)m54207b69.F54207b69_09(6619, arrayOfObject);
  }
  
  public static IUpdatePrompter getIUpdatePrompter()
  {
    Object[] arrayOfObject = new Object[0];
    return (IUpdatePrompter)m54207b69.F54207b69_09(6620, arrayOfObject);
  }
  
  public static OnInstallListener getOnInstallListener()
  {
    Object[] arrayOfObject = new Object[0];
    return (OnInstallListener)m54207b69.F54207b69_09(6621, arrayOfObject);
  }
  
  public static OnUpdateFailureListener getOnUpdateFailureListener()
  {
    Object[] arrayOfObject = new Object[0];
    return (OnUpdateFailureListener)m54207b69.F54207b69_09(6622, arrayOfObject);
  }
  
  public static Map getParams()
  {
    Object[] arrayOfObject = new Object[0];
    return (Map)m54207b69.F54207b69_09(6623, arrayOfObject);
  }
  
  public static boolean isAutoMode()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(6624, arrayOfObject);
  }
  
  public static boolean isGet()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(6625, arrayOfObject);
  }
  
  public static boolean isWifiOnly()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(6626, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xupdate._XUpdate
 * JD-Core Version:    0.7.0.1
 */