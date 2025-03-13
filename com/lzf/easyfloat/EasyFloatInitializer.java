package com.lzf.easyfloat;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.lzf.easyfloat.utils.LifecycleUtils;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class EasyFloatInitializer
  extends ContentProvider
{
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    Intrinsics.OooO0o(paramUri, "uri");
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    Intrinsics.OooO0o(paramUri, "uri");
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    Intrinsics.OooO0o(paramUri, "uri");
    return null;
  }
  
  public boolean onCreate()
  {
    Object localObject1 = LifecycleUtils.OooO00o;
    Object localObject2 = getContext();
    Intrinsics.OooO0OO(localObject2);
    localObject2 = ((Context)localObject2).getApplicationContext();
    if (localObject2 != null)
    {
      localObject2 = (Application)localObject2;
      ((LifecycleUtils)localObject1).setLifecycleCallbacks((Application)localObject2);
      return true;
    }
    localObject1 = new java/lang/NullPointerException;
    localObject2 = m54207b69.F54207b69_11("/G29332D2E6B292C3031313D72312F75333645457A473D7D40404284444E484986535F59458B4B4F4A5D51584E955365669937696A5F635A5D6B676264");
    ((NullPointerException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    Intrinsics.OooO0o(paramUri, "uri");
    return null;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    Intrinsics.OooO0o(paramUri, "uri");
    return 0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.EasyFloatInitializer
 * JD-Core Version:    0.7.0.1
 */