package com.just.agentweb.download;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler.Callback;
import android.text.TextUtils;
import android.webkit.WebView;
import com.just.agentweb.R.string;
import com.just.agentweb.action.Action;
import com.just.agentweb.action.ActionActivity;
import com.just.agentweb.action.ActionActivity.PermissionListener;
import com.just.agentweb.action.PermissionInterceptor;
import com.just.agentweb.core.web.AgentWebPermissions;
import com.just.agentweb.core.web.controller.AbsAgentWebUIController;
import com.just.agentweb.utils.AgentWebUtils;
import com.just.agentweb.utils.LogUtils;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m54207b69;

public class DefaultDownloadImpl
  implements android.webkit.DownloadListener
{
  public static volatile AtomicInteger OooOOOo;
  public static final String OooOOo0 = DefaultDownloadImpl.class.getSimpleName();
  public WeakReference OooO;
  public Context OooO00o;
  public DownloadListener OooO0O0;
  public WeakReference OooO0OO = null;
  public PermissionInterceptor OooO0Oo = null;
  public String OooO0o;
  public String OooO0o0;
  public long OooO0oO;
  public String OooO0oo;
  public DefaultDownloadImpl.ExtraServiceImpl OooOO0;
  public String OooOO0O;
  public DefaultDownloadImpl.ExtraServiceImpl OooOO0o = null;
  public Pattern OooOOO;
  public volatile DownloadingListener OooOOO0;
  public DownloadListenerAdapter OooOOOO;
  
  static
  {
    AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
    localAtomicInteger.<init>(1);
    OooOOOo = localAtomicInteger;
  }
  
  public DefaultDownloadImpl(DefaultDownloadImpl.ExtraServiceImpl paramExtraServiceImpl)
  {
    Object localObject = Pattern.compile(m54207b69.F54207b69_11("gv585D12221E181E1E231C556964696D"));
    this.OooOOO = ((Pattern)localObject);
    localObject = new com/just/agentweb/download/DefaultDownloadImpl$3;
    ((DefaultDownloadImpl.3)localObject).<init>(this);
    this.OooOOOO = ((DownloadListenerAdapter)localObject);
    boolean bool = DefaultDownloadImpl.ExtraServiceImpl.OooOO0o(paramExtraServiceImpl);
    if (!bool)
    {
      OooO0oo(paramExtraServiceImpl);
      this.OooOO0 = paramExtraServiceImpl;
    }
    else
    {
      this.OooOO0o = paramExtraServiceImpl;
    }
  }
  
  public static DefaultDownloadImpl OooOO0(Activity paramActivity, WebView paramWebView, DownloadListener paramDownloadListener, DownloadingListener paramDownloadingListener, PermissionInterceptor paramPermissionInterceptor)
  {
    DefaultDownloadImpl.ExtraServiceImpl localExtraServiceImpl = new com/just/agentweb/download/DefaultDownloadImpl$ExtraServiceImpl;
    localExtraServiceImpl.<init>();
    return localExtraServiceImpl.OooOo00(paramActivity).OooOoo(paramWebView).OooOo0o(paramDownloadListener).OooOoO(paramPermissionInterceptor).OooOo(paramDownloadingListener).OooOOoo();
  }
  
  private ActionActivity.PermissionListener getPermissionListener()
  {
    DefaultDownloadImpl.1 local1 = new com/just/agentweb/download/DefaultDownloadImpl$1;
    local1.<init>(this);
    return local1;
  }
  
  public final List OooO()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = (Context)this.OooO0OO.get();
    String[] arrayOfString = AgentWebPermissions.OooO0OO;
    boolean bool = AgentWebUtils.OooOo0((Context)localObject, arrayOfString);
    if (!bool)
    {
      localObject = Arrays.asList(arrayOfString);
      localArrayList.addAll((Collection)localObject);
    }
    return localArrayList;
  }
  
  public final void OooO0oo(DefaultDownloadImpl.ExtraServiceImpl paramExtraServiceImpl)
  {
    Object localObject = new java/lang/ref/WeakReference;
    Activity localActivity = DefaultDownloadImpl.ExtraServiceImpl.OooOOO0(paramExtraServiceImpl);
    ((WeakReference)localObject).<init>(localActivity);
    this.OooO0OO = ((WeakReference)localObject);
    localObject = DefaultDownloadImpl.ExtraServiceImpl.OooOOO0(paramExtraServiceImpl).getApplicationContext();
    this.OooO00o = ((Context)localObject);
    localObject = DefaultDownloadImpl.ExtraServiceImpl.OooOOO(paramExtraServiceImpl);
    this.OooO0O0 = ((DownloadListener)localObject);
    localObject = DefaultDownloadImpl.ExtraServiceImpl.OooOOOO(paramExtraServiceImpl);
    this.OooOOO0 = ((DownloadingListener)localObject);
    localObject = DefaultDownloadImpl.ExtraServiceImpl.OooOOOo(paramExtraServiceImpl);
    this.OooO0Oo = ((PermissionInterceptor)localObject);
    localObject = new java/lang/ref/WeakReference;
    paramExtraServiceImpl = AgentWebUtils.OooOO0(DefaultDownloadImpl.ExtraServiceImpl.OooOOo0(paramExtraServiceImpl));
    ((WeakReference)localObject).<init>(paramExtraServiceImpl);
    this.OooO = ((WeakReference)localObject);
  }
  
  public final Handler.Callback OooOO0O(File paramFile)
  {
    DefaultDownloadImpl.2 local2 = new com/just/agentweb/download/DefaultDownloadImpl$2;
    local2.<init>(this, paramFile);
    return local2;
  }
  
  public final void OooOO0o(File paramFile)
  {
    this.OooOO0o.OooO0oo(true);
    OooOOOo(paramFile);
  }
  
  public final String OooOOO(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    String str = "";
    if (bool) {
      return str;
    }
    Pattern localPattern = this.OooOOO;
    paramString = paramString.toLowerCase();
    paramString = localPattern.matcher(paramString);
    bool = paramString.find();
    if (bool) {
      return paramString.group(1);
    }
    return str;
  }
  
  public final File OooOOO0(String paramString1, String paramString2)
  {
    Object localObject1 = "\"";
    String str1 = "";
    Object localObject2;
    try
    {
      paramString1 = OooOOO(paramString1);
      try
      {
        boolean bool1 = TextUtils.isEmpty(paramString1);
        int k = 1;
        if (bool1)
        {
          bool1 = TextUtils.isEmpty(paramString2);
          if (!bool1)
          {
            localObject2 = Uri.parse(paramString2);
            String str2 = ((Uri)localObject2).getPath();
            localObject2 = ((Uri)localObject2).getPath();
            int m = 47;
            int i = ((String)localObject2).lastIndexOf(m) + k;
            paramString1 = str2.substring(i);
          }
        }
        boolean bool2 = TextUtils.isEmpty(paramString1);
        if (!bool2)
        {
          int j = paramString1.length();
          int n = 64;
          if (j > n)
          {
            j = paramString1.length() - n;
            n = paramString1.length();
            paramString1 = paramString1.substring(j, n);
          }
        }
        boolean bool3 = TextUtils.isEmpty(paramString1);
        if (bool3) {
          paramString1 = AgentWebUtils.OooOoO(paramString2);
        }
        boolean bool4 = paramString1.contains((CharSequence)localObject1);
        if (bool4) {
          paramString1 = paramString1.replace((CharSequence)localObject1, str1);
        }
        str1 = paramString1;
        paramString1 = new java/io/File;
        paramString2 = Environment.DIRECTORY_DOWNLOADS;
        paramString2 = Environment.getExternalStoragePublicDirectory(paramString2);
        localObject1 = "Ei0A1D090E0C4B0E151410272918185219181B131F";
        localObject1 = m54207b69.F54207b69_11((String)localObject1);
        paramString1.<init>(paramString2, (String)localObject1);
        paramString1.mkdirs();
        paramString1 = paramString1.getAbsolutePath();
        com.just.agentweb.core.web.AgentWebConfig.OooO0O0 = paramString1;
        paramString1 = this.OooO00o;
        paramString2 = this.OooOO0o;
        bool4 = paramString2.isOpenBreakPointDownload();
        if (bool4) {
          k = 0;
        }
        return AgentWebUtils.OooO0o(paramString1, str1, k);
      }
      finally
      {
        str1 = paramString1;
      }
      bool5 = LogUtils.isDebug();
    }
    finally {}
    boolean bool5;
    if (bool5)
    {
      paramString1 = OooOOo0;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("/$424E4A446E4A4F4826");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(str1);
      localObject1 = ((StringBuilder)localObject1).toString();
      LogUtils.OooO0OO(paramString1, (String)localObject1);
      paramString2.printStackTrace();
    }
    return null;
  }
  
  public final void OooOOOO(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, DefaultDownloadImpl.ExtraServiceImpl paramExtraServiceImpl)
  {
    try
    {
      Object localObject = this.OooO0OO;
      localObject = ((Reference)localObject).get();
      if (localObject != null)
      {
        localObject = this.OooO0OO;
        localObject = ((Reference)localObject).get();
        localObject = (Activity)localObject;
        boolean bool1 = ((Activity)localObject).isFinishing();
        if (!bool1)
        {
          localObject = this.OooO0Oo;
          if (localObject != null)
          {
            String[] arrayOfString = AgentWebPermissions.OooO0OO;
            String str = "6%414B544E4D4F4A48";
            str = m54207b69.F54207b69_11(str);
            bool1 = ((PermissionInterceptor)localObject).OooO00o(paramString1, arrayOfString, str);
            if (bool1) {
              return;
            }
          }
          if (paramExtraServiceImpl == null) {
            try
            {
              paramExtraServiceImpl = this.OooOO0;
              paramExtraServiceImpl = paramExtraServiceImpl.OooOOo();
            }
            catch (CloneNotSupportedException paramString1)
            {
              bool2 = LogUtils.isDebug();
              if (bool2) {
                paramString1.printStackTrace();
              }
              paramString1 = OooOOo0;
              paramString2 = "%{5B1919171923611B211A28231B682B292228201C327070717274";
              paramString2 = m54207b69.F54207b69_11(paramString2);
              LogUtils.OooO0OO(paramString1, paramString2);
              return;
            }
          }
          this.OooO0o0 = paramString1;
          paramString1 = paramExtraServiceImpl.OooOoOO(paramString1);
          this.OooO0oo = paramString4;
          paramString1 = paramString1.OooOoO0(paramString4);
          this.OooO0o = paramString3;
          paramString1 = paramString1.OooOo0(paramString3);
          this.OooO0oO = paramLong;
          paramString1 = paramString1.OooOo0O(paramLong);
          this.OooOO0O = paramString2;
          paramString1.OooOoo0(paramString2);
          this.OooOO0o = paramExtraServiceImpl;
          paramString1 = OooO();
          boolean bool2 = paramString1.isEmpty();
          if (bool2)
          {
            OooOOo0();
          }
          else
          {
            bool2 = false;
            paramString2 = null;
            paramString2 = new String[0];
            paramString1 = paramString1.toArray(paramString2);
            paramString1 = (String[])paramString1;
            paramString1 = Action.OooO00o(paramString1);
            paramString2 = getPermissionListener();
            ActionActivity.setPermissionListener(paramString2);
            paramString2 = this.OooO0OO;
            paramString2 = paramString2.get();
            paramString2 = (Activity)paramString2;
            ActionActivity.OooO0oO(paramString2, paramString1);
          }
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void OooOOOo(File paramFile)
  {
    try
    {
      Object localObject1 = DefaultDownloadImpl.ExecuteTasksMap.getInstance();
      Object localObject2 = this.OooO0o0;
      Object localObject3 = paramFile.getAbsolutePath();
      ((DefaultDownloadImpl.ExecuteTasksMap)localObject1).OooO00o((String)localObject2, (String)localObject3);
      localObject1 = this.OooO;
      localObject1 = ((Reference)localObject1).get();
      if (localObject1 != null)
      {
        localObject1 = this.OooO;
        localObject1 = ((Reference)localObject1).get();
        localObject1 = (AbsAgentWebUIController)localObject1;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = this.OooO0OO;
        localObject3 = ((Reference)localObject3).get();
        localObject3 = (Activity)localObject3;
        int i = R.string.agentweb_coming_soon_download;
        localObject3 = ((Context)localObject3).getString(i);
        ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = ":";
        ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = paramFile.getName();
        ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).toString();
        localObject3 = OooOOo0;
        localObject4 = "}*565B515B504A5E4E764E674F5252595D";
        localObject4 = m54207b69.F54207b69_11((String)localObject4);
        localObject3 = ((String)localObject3).concat((String)localObject4);
        ((AbsAgentWebUIController)localObject1).OooOO0o((String)localObject2, (String)localObject3);
      }
      DownloadTask localDownloadTask = new com/just/agentweb/download/DownloadTask;
      localObject1 = OooOOOo;
      int j = ((AtomicInteger)localObject1).incrementAndGet();
      localObject3 = this.OooOOOO;
      Object localObject4 = this.OooO00o;
      DefaultDownloadImpl.ExtraServiceImpl localExtraServiceImpl = this.OooOO0o;
      localObject1 = localDownloadTask;
      localDownloadTask.<init>(j, (DownloadListenerAdapter)localObject3, (Context)localObject4, paramFile, localExtraServiceImpl);
      paramFile = new com/just/agentweb/download/Downloader;
      paramFile.<init>();
      paramFile.OooOOO0(localDownloadTask);
      paramFile = null;
      this.OooO0o0 = null;
      this.OooO0o = null;
      long l = -1;
      this.OooO0oO = l;
      this.OooO0oo = null;
      this.OooOO0O = null;
    }
    finally
    {
      boolean bool = LogUtils.isDebug();
      if (bool) {
        paramFile.printStackTrace();
      }
    }
  }
  
  public final void OooOOo(File paramFile)
  {
    Object localObject = (Activity)this.OooO0OO.get();
    if (localObject != null)
    {
      boolean bool = ((Activity)localObject).isFinishing();
      if (!bool)
      {
        localObject = (AbsAgentWebUIController)this.OooO.get();
        if (localObject != null)
        {
          String str = this.OooO0o0;
          paramFile = OooOO0O(paramFile);
          ((AbsAgentWebUIController)localObject).OooO0Oo(str, paramFile);
        }
      }
    }
  }
  
  public final void OooOOo0()
  {
    Object localObject1 = this.OooO0O0;
    String str1;
    String str2;
    if (localObject1 != null)
    {
      localObject2 = this.OooO0o0;
      localObject5 = this.OooOO0O;
      str1 = this.OooO0o;
      str2 = this.OooO0oo;
      long l1 = this.OooO0oO;
      DefaultDownloadImpl.ExtraServiceImpl localExtraServiceImpl = this.OooOO0o;
      boolean bool1 = ((DownloadListener)localObject1).OooO00o((String)localObject2, (String)localObject5, str1, str2, l1, localExtraServiceImpl);
      if (bool1) {
        return;
      }
    }
    localObject1 = this.OooO0o;
    Object localObject2 = this.OooO0o0;
    localObject1 = OooOOO0((String)localObject1, (String)localObject2);
    if (localObject1 == null)
    {
      LogUtils.OooO00o(OooOOo0, "新建文件失败");
      return;
    }
    boolean bool2 = ((File)localObject1).exists();
    int k;
    if (bool2)
    {
      long l2 = ((File)localObject1).length();
      long l3 = this.OooO0oO;
      bool2 = l2 < l3;
      if (!bool2)
      {
        l2 = 0L;
        bool2 = l3 < l2;
        if (bool2)
        {
          localObject2 = this.OooO0O0;
          if (localObject2 != null)
          {
            localObject5 = ((File)localObject1).getAbsolutePath();
            str1 = this.OooO0o0;
            str2 = null;
            bool2 = ((DownloadListener)localObject2).OooO0Oo((String)localObject5, str1, null);
            if (bool2) {
              return;
            }
          }
          localObject2 = AgentWebUtils.OooOO0o(this.OooO00o, (File)localObject1);
          if (localObject2 != null)
          {
            try
            {
              localObject5 = this.OooO00o;
              boolean bool3 = localObject5 instanceof Activity;
              if (!bool3)
              {
                int j = 268435456;
                ((Intent)localObject2).addFlags(j);
              }
              localObject5 = this.OooO00o;
              ((Context)localObject5).startActivity((Intent)localObject2);
            }
            finally
            {
              k = LogUtils.isDebug();
              if (k == 0) {
                break label262;
              }
            }
            localObject3.printStackTrace();
            break label262;
          }
          return;
        }
      }
    }
    label262:
    Object localObject4 = DefaultDownloadImpl.ExecuteTasksMap.getInstance();
    Object localObject5 = this.OooO0o0;
    bool2 = ((DefaultDownloadImpl.ExecuteTasksMap)localObject4).OooO0O0((String)localObject5);
    if (!bool2)
    {
      localObject4 = DefaultDownloadImpl.ExecuteTasksMap.getInstance();
      localObject5 = ((File)localObject1).getAbsolutePath();
      bool2 = ((DefaultDownloadImpl.ExecuteTasksMap)localObject4).OooO0O0((String)localObject5);
      if (!bool2)
      {
        localObject4 = this.OooOO0o;
        bool2 = ((AgentWebDownloader.Extra)localObject4).isForceDownload();
        if (!bool2)
        {
          localObject4 = this.OooO00o;
          int i = AgentWebUtils.OooO0O0((Context)localObject4);
          k = 1;
          if (i > k)
          {
            OooOOo((File)localObject1);
            return;
          }
        }
        OooOOOo((File)localObject1);
        return;
      }
    }
    localObject1 = this.OooO.get();
    if (localObject1 != null)
    {
      localObject1 = (AbsAgentWebUIController)this.OooO.get();
      localObject4 = (Activity)this.OooO0OO.get();
      int m = R.string.agentweb_download_task_has_been_exist;
      localObject4 = ((Context)localObject4).getString(m);
      localObject5 = OooOOo0;
      str1 = m54207b69.F54207b69_11("6P2C21243818442D4544483B3F");
      localObject5 = ((String)localObject5).concat(str1);
      ((AbsAgentWebUIController)localObject1).OooOO0o((String)localObject4, (String)localObject5);
    }
  }
  
  public void OooOOoo()
  {
    Object localObject = this.OooOOO0;
    if (localObject != null) {
      this.OooOOO0 = null;
    }
    localObject = this.OooOO0o;
    if (localObject != null)
    {
      ((DefaultDownloadImpl.ExtraServiceImpl)localObject).OooOoo(null);
      this.OooOO0o.OooOo(null);
      localObject = this.OooOO0o;
      ((DefaultDownloadImpl.ExtraServiceImpl)localObject).OooOo0o(null);
    }
    localObject = this.OooOO0;
    if (localObject != null)
    {
      ((DefaultDownloadImpl.ExtraServiceImpl)localObject).OooOoo(null);
      this.OooOO0.OooOo(null);
      localObject = this.OooOO0;
      ((DefaultDownloadImpl.ExtraServiceImpl)localObject).OooOo0o(null);
    }
  }
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    OooOOOO(paramString1, paramString2, paramString3, paramString4, paramLong, null);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.download.DefaultDownloadImpl
 * JD-Core Version:    0.7.0.1
 */