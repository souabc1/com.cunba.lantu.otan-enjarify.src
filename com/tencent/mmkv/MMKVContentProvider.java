package com.tencent.mmkv;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import m54207b69;

public class MMKVContentProvider
  extends ContentProvider
{
  public static Uri o00OoOoo;
  
  public static Uri OooO00o(Context paramContext)
  {
    Object localObject = o00OoOoo;
    if (localObject != null) {
      return localObject;
    }
    localObject = null;
    if (paramContext == null) {
      return null;
    }
    paramContext = OooO0Oo(paramContext);
    if (paramContext == null) {
      return null;
    }
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11(".B212E2E392B313C7F7576");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramContext);
    paramContext = Uri.parse(((StringBuilder)localObject).toString());
    o00OoOoo = paramContext;
    return paramContext;
  }
  
  public static String OooO0O0(Context paramContext, int paramInt)
  {
    Object localObject = m54207b69.F54207b69_11(":'4645555155535965");
    paramContext = (ActivityManager)paramContext.getSystemService((String)localObject);
    if (paramContext != null)
    {
      paramContext = paramContext.getRunningAppProcesses().iterator();
      int i;
      do
      {
        boolean bool = paramContext.hasNext();
        if (!bool) {
          break;
        }
        localObject = (ActivityManager.RunningAppProcessInfo)paramContext.next();
        i = ((ActivityManager.RunningAppProcessInfo)localObject).pid;
      } while (i != paramInt);
      return ((ActivityManager.RunningAppProcessInfo)localObject).processName;
    }
    return "";
  }
  
  public static String OooO0Oo(Context paramContext)
  {
    try
    {
      ComponentName localComponentName = new android/content/ComponentName;
      Object localObject = MMKVContentProvider.class;
      localObject = ((Class)localObject).getName();
      localComponentName.<init>(paramContext, (String)localObject);
      paramContext = paramContext.getPackageManager();
      if (paramContext != null)
      {
        localObject = null;
        paramContext = paramContext.getProviderInfo(localComponentName, 0);
        if (paramContext != null) {
          return paramContext.authority;
        }
      }
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
  
  public final Bundle OooO0OO(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    MMKV localMMKV = MMKV.OooOooO(getContext(), paramString1, paramInt1, paramInt2, paramString2);
    ParcelableMMKV localParcelableMMKV = new com/tencent/mmkv/ParcelableMMKV;
    localParcelableMMKV.<init>(localMMKV);
    paramString2 = new java/lang/StringBuilder;
    paramString2.<init>();
    paramString2.append(paramString1);
    paramString1 = m54207b69.F54207b69_11("g:1A5D601D0B1F");
    paramString2.append(paramString1);
    int i = localMMKV.ashmemFD();
    paramString2.append(i);
    paramString1 = m54207b69.F54207b69_11("bY757A363F313D7F4645826E84");
    paramString2.append(paramString1);
    i = localMMKV.ashmemMetaFD();
    paramString2.append(i);
    paramString1 = new android/os/Bundle;
    paramString1.<init>();
    paramString1.putParcelable("KEY", localParcelableMMKV);
    return paramString1;
  }
  
  public Bundle call(String paramString1, String paramString2, Bundle paramBundle)
  {
    String str1 = m54207b69.F54207b69_11("^-4041485E6F64484774674F4B544D7278");
    boolean bool = paramString1.equals(str1);
    str1 = null;
    if ((bool) && (paramBundle != null))
    {
      paramString1 = m54207b69.F54207b69_11("&Z112005080D180626");
      int i = paramBundle.getInt(paramString1);
      String str2 = m54207b69.F54207b69_11("007B766B7281847A7C");
      int j = paramBundle.getInt(str2);
      String str3 = m54207b69.F54207b69_11("Wh232E333A2F3F373F44");
      paramBundle = paramBundle.getString(str3);
      try
      {
        return OooO0OO(paramString2, i, j, paramBundle);
      }
      catch (Exception paramString1)
      {
        paramString1.getMessage();
      }
    }
    return null;
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    paramUri = new java/lang/UnsupportedOperationException;
    paramString = m54207b69.F54207b69_11("V47A5C4217615E4A5F59625B654C216B69248A8B9276");
    paramUri.<init>(paramString);
    throw paramUri;
  }
  
  public String getType(Uri paramUri)
  {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    paramUri = new java/lang/UnsupportedOperationException;
    paramContentValues = m54207b69.F54207b69_11("V47A5C4217615E4A5F59625B654C216B69248A8B9276");
    paramUri.<init>(paramContentValues);
    throw paramUri;
  }
  
  public boolean onCreate()
  {
    Object localObject1 = getContext();
    Object localObject2 = null;
    if (localObject1 == null) {
      return false;
    }
    localObject1 = OooO0Oo((Context)localObject1);
    if (localObject1 == null) {
      return false;
    }
    localObject2 = o00OoOoo;
    if (localObject2 == null)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = m54207b69.F54207b69_11(".B212E2E392B313C7F7576");
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = Uri.parse(((StringBuilder)localObject2).toString());
      o00OoOoo = (Uri)localObject1;
    }
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    paramUri = new java/lang/UnsupportedOperationException;
    paramArrayOfString1 = m54207b69.F54207b69_11("V47A5C4217615E4A5F59625B654C216B69248A8B9276");
    paramUri.<init>(paramArrayOfString1);
    throw paramUri;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    paramUri = new java/lang/UnsupportedOperationException;
    paramContentValues = m54207b69.F54207b69_11("V47A5C4217615E4A5F59625B654C216B69248A8B9276");
    paramUri.<init>(paramContentValues);
    throw paramUri;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.tencent.mmkv.MMKVContentProvider
 * JD-Core Version:    0.7.0.1
 */