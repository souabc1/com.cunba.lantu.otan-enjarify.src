package com.just.agentweb.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.StatFs;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.core.app.AppOpsManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.os.EnvironmentCompat;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.just.agentweb.R.id;
import com.just.agentweb.action.PermissionInterceptor;
import com.just.agentweb.core.web.AgentWebConfig;
import com.just.agentweb.core.web.controller.AbsAgentWebUIController;
import com.just.agentweb.widget.WebParentLayout;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m54207b69;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AgentWebUtils
{
  public static final String OooO00o = "AgentWebUtils";
  public static Handler OooO0O0;
  public static WeakReference OooO0OO;
  public static Toast OooO0Oo;
  
  private AgentWebUtils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("[Q24723433437B2B78404842307D4942");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static String OooO(Context paramContext)
  {
    Object localObject1 = AgentWebConfig.OooO0O0;
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool1) {
      return AgentWebConfig.OooO0O0;
    }
    paramContext = OooOOO(paramContext);
    localObject1 = new java/io/File;
    Object localObject2 = m54207b69.F54207b69_11("D051585761484C5B59255C5B5E6462");
    ((File)localObject1).<init>(paramContext, (String)localObject2);
    try
    {
      boolean bool2 = ((File)localObject1).exists();
      if (!bool2) {
        ((File)localObject1).mkdirs();
      }
    }
    finally
    {
      paramContext = OooO00o;
      localObject2 = m54207b69.F54207b69_11("Bj0919110E221450150B21541A1E161D292E141717");
      LogUtils.OooO0OO(paramContext, (String)localObject2);
    }
    paramContext = OooO00o;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = m54207b69.F54207b69_11("b34353495E0D");
    ((StringBuilder)localObject2).append(str);
    str = ((File)localObject1).getAbsolutePath();
    ((StringBuilder)localObject2).append(str);
    str = m54207b69.F54207b69_11("nn4E4F20121E0B5A");
    ((StringBuilder)localObject2).append(str);
    str = ((File)localObject1).getPath();
    ((StringBuilder)localObject2).append(str);
    localObject2 = ((StringBuilder)localObject2).toString();
    LogUtils.OooO0OO(paramContext, (String)localObject2);
    paramContext = ((File)localObject1).getAbsolutePath();
    AgentWebConfig.OooO0O0 = paramContext;
    return paramContext;
  }
  
  public static boolean OooO00o(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("Jc000D0F100A051D111D132125");
    paramContext = (ConnectivityManager)paramContext.getSystemService(str);
    boolean bool1 = false;
    str = null;
    if (paramContext == null) {
      return false;
    }
    paramContext = paramContext.getActiveNetworkInfo();
    if (paramContext != null)
    {
      boolean bool2 = paramContext.isConnected();
      if (bool2) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public static int OooO0O0(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("Jc000D0F100A051D111D132125");
    paramContext = ((ConnectivityManager)paramContext.getSystemService(str)).getActiveNetworkInfo();
    str = null;
    if (paramContext == null) {
      return 0;
    }
    int i = paramContext.getType();
    if (i != 0)
    {
      j = 1;
      if (i != j)
      {
        int k = 6;
        if (i != k)
        {
          k = 9;
          if (i != k) {
            return 0;
          }
        }
      }
      return j;
    }
    int j = paramContext.getSubtype();
    switch (j)
    {
    default: 
      switch (j)
      {
      default: 
        return 0;
      case 13: 
      case 14: 
      case 15: 
        return 2;
      }
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      return 3;
    }
    return 4;
  }
  
  public static boolean OooO0OO(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("Jc000D0F100A051D111D132125");
    paramContext = (ConnectivityManager)paramContext.getSystemService(str);
    boolean bool = false;
    str = null;
    if (paramContext == null) {
      return false;
    }
    paramContext = paramContext.getActiveNetworkInfo();
    if (paramContext != null)
    {
      int i = paramContext.isConnected();
      if (i != 0)
      {
        int j = paramContext.getType();
        i = 1;
        if (j == i) {
          bool = i;
        }
      }
    }
    return bool;
  }
  
  public static final void OooO0Oo(WebView paramWebView)
  {
    if (paramWebView == null) {
      return;
    }
    Object localObject = Looper.myLooper();
    Looper localLooper = Looper.getMainLooper();
    if (localObject != localLooper) {
      return;
    }
    localObject = m54207b69.F54207b69_11("{p11132108084F1823192725");
    paramWebView.loadUrl((String)localObject);
    paramWebView.stopLoading();
    localObject = paramWebView.getHandler();
    localLooper = null;
    if (localObject != null)
    {
      localObject = paramWebView.getHandler();
      ((Handler)localObject).removeCallbacksAndMessages(null);
    }
    paramWebView.removeAllViews();
    localObject = (ViewGroup)paramWebView.getParent();
    if (localObject != null) {
      ((ViewGroup)localObject).removeView(paramWebView);
    }
    paramWebView.setWebChromeClient(null);
    paramWebView.setWebViewClient(null);
    paramWebView.setTag(null);
    paramWebView.clearHistory();
    paramWebView.destroy();
  }
  
  public static File OooO0o(Context paramContext, String paramString, boolean paramBoolean)
  {
    paramContext = OooO(paramContext);
    boolean bool1 = TextUtils.isEmpty(paramContext);
    if (bool1) {
      return null;
    }
    File localFile = new java/io/File;
    localFile.<init>(paramContext, paramString);
    boolean bool2 = localFile.exists();
    if (bool2)
    {
      if (paramBoolean) {
        localFile.delete();
      }
    }
    else {
      localFile.createNewFile();
    }
    return localFile;
  }
  
  public static void OooO0o0(Closeable paramCloseable)
  {
    if (paramCloseable != null) {
      try
      {
        paramCloseable.close();
      }
      catch (Exception paramCloseable)
      {
        paramCloseable.printStackTrace();
      }
    }
  }
  
  public static File OooO0oO(Context paramContext)
  {
    try
    {
      Object localObject1 = new java/text/SimpleDateFormat;
      Object localObject2 = "We1C1D1E1F2C2D0708353612132223";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      Locale localLocale = Locale.getDefault();
      ((SimpleDateFormat)localObject1).<init>((String)localObject2, localLocale);
      localObject2 = new java/util/Date;
      ((Date)localObject2).<init>();
      localObject1 = ((DateFormat)localObject1).format((Date)localObject2);
      localObject2 = "Rh092039501F4B081F17";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject1 = new Object[] { localObject1 };
      localObject1 = String.format((String)localObject2, (Object[])localObject1);
      boolean bool = true;
      paramContext = OooO0o(paramContext, (String)localObject1, bool);
    }
    finally
    {
      paramContext = null;
    }
    return paramContext;
  }
  
  public static int OooO0oo(Context paramContext, float paramFloat)
  {
    float f = paramContext.getResources().getDisplayMetrics().density;
    return (int)(paramFloat * f + 0.5F);
  }
  
  public static AbsAgentWebUIController OooOO0(WebView paramWebView)
  {
    return OooOOoo(paramWebView).OooO0o0();
  }
  
  /* Error */
  public static String OooOO0O(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokevirtual 268	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   6: astore_2
    //   7: aload_2
    //   8: invokevirtual 272	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   11: astore_2
    //   12: aload_0
    //   13: invokevirtual 275	android/content/Context:getPackageName	()Ljava/lang/String;
    //   16: astore_0
    //   17: aload_2
    //   18: aload_0
    //   19: iconst_0
    //   20: invokevirtual 281	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   23: astore_1
    //   24: goto +6 -> 30
    //   27: pop
    //   28: aconst_null
    //   29: astore_2
    //   30: aload_2
    //   31: aload_1
    //   32: invokevirtual 285	android/content/pm/PackageManager:getApplicationLabel	(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    //   35: checkcast 229	java/lang/String
    //   38: areturn
    //   39: pop
    //   40: goto -10 -> 30
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	paramContext	Context
    //   1	31	1	localApplicationInfo	android.content.pm.ApplicationInfo
    //   6	25	2	localObject	Object
    //   27	1	3	localNameNotFoundException1	android.content.pm.PackageManager.NameNotFoundException
    //   39	1	4	localNameNotFoundException2	android.content.pm.PackageManager.NameNotFoundException
    // Exception table:
    //   from	to	target	type
    //   2	6	27	android/content/pm/PackageManager$NameNotFoundException
    //   7	11	27	android/content/pm/PackageManager$NameNotFoundException
    //   12	16	39	android/content/pm/PackageManager$NameNotFoundException
    //   19	23	39	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public static Intent OooOO0o(Context paramContext, File paramFile)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    String str = m54207b69.F54207b69_11("(958585F4E5A55631E58605767635A25676A5E62696B2C85879487");
    localIntent = localIntent.setAction(str);
    str = OooOOOo(paramFile);
    OooOoo0(paramContext, localIntent, str, paramFile, false);
    return localIntent;
  }
  
  public static String OooOOO(Context paramContext)
  {
    paramContext = paramContext.getExternalCacheDir();
    String str1 = m54207b69.F54207b69_11("DZ37363137324444");
    String str2 = EnvironmentCompat.OooO00o(paramContext);
    boolean bool = str1.equals(str2);
    if (bool) {
      return paramContext.getAbsolutePath();
    }
    return null;
  }
  
  public static List OooOOO0(Activity paramActivity, String[] paramArrayOfString)
  {
    if (paramArrayOfString != null)
    {
      int i = paramArrayOfString.length;
      if (i != 0)
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int j = 0;
        for (;;)
        {
          int k = paramArrayOfString.length;
          if (j >= k) {
            break;
          }
          Object localObject = paramArrayOfString[j];
          localObject = new String[] { localObject };
          boolean bool = OooOo0(paramActivity, (String[])localObject);
          if (!bool)
          {
            localObject = paramArrayOfString[j];
            localArrayList.add(localObject);
          }
          j += 1;
        }
        return localArrayList;
      }
    }
    return null;
  }
  
  public static Intent OooOOOO(Context paramContext, File paramFile)
  {
    Intent localIntent = new android/content/Intent;
    String str = m54207b69.F54207b69_11("NR333D382341403C83474040463F894140364C4F4F9030352A2D30272C2F1F24262038");
    localIntent.<init>(str);
    paramContext = OooOOo0(paramContext, paramFile);
    paramFile = m54207b69.F54207b69_11("el0D030A21070A0E490D0B22140E25501E1D291B1E17332B5940424448553D56");
    localIntent.addCategory(paramFile);
    paramFile = m54207b69.F54207b69_11(".c0C1719161A1C");
    localIntent.putExtra(paramFile, paramContext);
    return localIntent;
  }
  
  public static String OooOOOo(File paramFile)
  {
    paramFile = paramFile.getName();
    int i = paramFile.lastIndexOf(".") + 1;
    int j = paramFile.length();
    paramFile = paramFile.substring(i, j).toLowerCase();
    String str1 = "pdf";
    boolean bool1 = paramFile.equals(str1);
    String str2;
    if (bool1)
    {
      str2 = "(\\3D2D2E333944432F3D3C3C7E384548";
      paramFile = m54207b69.F54207b69_11(str2);
    }
    else
    {
      str1 = "m4a";
      bool1 = paramFile.equals(str1);
      if (!bool1)
      {
        str1 = "mp3";
        bool1 = paramFile.equals(str1);
        if (!bool1)
        {
          str1 = "mid";
          bool1 = paramFile.equals(str1);
          if (!bool1)
          {
            str1 = "xmf";
            bool1 = paramFile.equals(str1);
            if (!bool1)
            {
              str1 = "ogg";
              bool1 = paramFile.equals(str1);
              if (!bool1)
              {
                str1 = "wav";
                bool1 = paramFile.equals(str1);
                if (!bool1)
                {
                  str1 = "3gp";
                  bool1 = paramFile.equals(str1);
                  if (!bool1)
                  {
                    str1 = "mp4";
                    bool1 = paramFile.equals(str1);
                    if (!bool1)
                    {
                      str1 = "jpg";
                      bool1 = paramFile.equals(str1);
                      if (!bool1)
                      {
                        str1 = "gif";
                        bool1 = paramFile.equals(str1);
                        if (!bool1)
                        {
                          str1 = "png";
                          bool1 = paramFile.equals(str1);
                          if (!bool1)
                          {
                            str1 = m54207b69.F54207b69_11("CH22392F32");
                            bool1 = paramFile.equals(str1);
                            if (!bool1)
                            {
                              str1 = "bmp";
                              bool1 = paramFile.equals(str1);
                              if (!bool1)
                              {
                                str1 = "apk";
                                bool1 = paramFile.equals(str1);
                                if (bool1)
                                {
                                  str2 = "8u1406071C201B1A08242325650F281F6A242C231A2E3127721D2D3039302F2E7734283840402836";
                                  return m54207b69.F54207b69_11(str2);
                                }
                                str1 = m54207b69.F54207b69_11("3H38393E33");
                                bool1 = paramFile.equals(str1);
                                if (!bool1)
                                {
                                  str1 = "ppt";
                                  bool1 = paramFile.equals(str1);
                                  if (!bool1)
                                  {
                                    str1 = m54207b69.F54207b69_11("_1555F544C");
                                    bool1 = paramFile.equals(str1);
                                    if (!bool1)
                                    {
                                      str1 = "doc";
                                      bool1 = paramFile.equals(str1);
                                      if (!bool1)
                                      {
                                        str1 = m54207b69.F54207b69_11("C@382D353B");
                                        bool1 = paramFile.equals(str1);
                                        if (!bool1)
                                        {
                                          str1 = "xls";
                                          boolean bool2 = paramFile.equals(str1);
                                          if (!bool2) {
                                            return "*/*";
                                          }
                                        }
                                        str2 = "GS322425423E35382E42454787314A458C4E3190493F454C56";
                                        return m54207b69.F54207b69_11(str2);
                                      }
                                    }
                                    str2 = "J(49595A4745504F63495050126A535A15556C17725B6F62";
                                    return m54207b69.F54207b69_11(str2);
                                  }
                                }
                                str2 = "O@2131322F2D28273B3138387A423B327D3D447F43434C3B494848434950";
                                return m54207b69.F54207b69_11(str2);
                              }
                            }
                          }
                        }
                      }
                      str2 = "wb0B1005080B524E";
                      return m54207b69.F54207b69_11(str2);
                    }
                  }
                  str2 = "C:4C546062591A16";
                  return m54207b69.F54207b69_11(str2);
                }
              }
            }
          }
        }
      }
      str2 = "~n0F1C0C0A05464A";
      paramFile = m54207b69.F54207b69_11(str2);
    }
    return paramFile;
  }
  
  public static Uri OooOOo(Context paramContext, File paramFile)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = paramContext.getPackageName();
    ((StringBuilder)localObject).append(str);
    str = m54207b69.F54207b69_11("@41A7655545E4569585E7B67635D71546A526E62645A");
    ((StringBuilder)localObject).append(str);
    localObject = ((StringBuilder)localObject).toString();
    return FileProvider.getUriForFile(paramContext, (String)localObject, paramFile);
  }
  
  public static Uri OooOOo0(Context paramContext, File paramFile)
  {
    return OooOOo(paramContext, paramFile);
  }
  
  public static WebParentLayout OooOOoo(WebView paramWebView)
  {
    Object localObject1 = paramWebView.getParent();
    boolean bool = localObject1 instanceof ViewGroup;
    String str1 = m54207b69.F54207b69_11("yT243933382B367A3E443A414A80303F454737434834503C8A3F8D51414D523E50945A53436060569B4B5E519F625EA26665696A6464A9A1");
    if (bool)
    {
      paramWebView = paramWebView.getParent();
      for (paramWebView = (ViewGroup)paramWebView;; paramWebView = null)
      {
        if (paramWebView == null) {
          break label144;
        }
        localObject1 = OooO00o;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = m54207b69.F54207b69_11("K-7B454A5D6E64485F6520");
        ((StringBuilder)localObject2).append(str2);
        ((StringBuilder)localObject2).append(paramWebView);
        localObject2 = ((StringBuilder)localObject2).toString();
        LogUtils.OooO0OO((String)localObject1, (String)localObject2);
        int i = paramWebView.getId();
        int j = R.id.web_parent_layout_id;
        if (i == j)
        {
          paramWebView = (WebParentLayout)paramWebView;
          str1 = m54207b69.F54207b69_11("T<5A544B555C21716066756759655F567F6D56655C5C");
          LogUtils.OooO0OO((String)localObject1, str1);
          return paramWebView;
        }
        paramWebView = paramWebView.getParent();
        bool = paramWebView instanceof ViewGroup;
        if (bool) {
          break;
        }
      }
      label144:
      paramWebView = new java/lang/IllegalStateException;
      paramWebView.<init>(str1);
      throw paramWebView;
    }
    paramWebView = new java/lang/IllegalStateException;
    paramWebView.<init>(str1);
    throw paramWebView;
  }
  
  public static boolean OooOo(String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    Object localObject = "[";
    try
    {
      bool1 = paramString.startsWith((String)localObject);
      if (bool1)
      {
        localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>(paramString);
      }
      else
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
      }
      bool2 = true;
    }
    catch (JSONException localJSONException)
    {
      label50:
      break label50;
    }
    return bool2;
  }
  
  public static boolean OooOo0(Context paramContext, String... paramVarArgs)
  {
    paramVarArgs = Arrays.asList(paramVarArgs);
    return OooOo00(paramContext, paramVarArgs);
  }
  
  public static boolean OooOo00(Context paramContext, List paramList)
  {
    paramList = paramList.iterator();
    int i;
    do
    {
      String str1;
      boolean bool2;
      do
      {
        boolean bool1 = paramList.hasNext();
        if (!bool1) {
          break;
        }
        str1 = (String)paramList.next();
        int j = ContextCompat.OooO00o(paramContext, str1);
        int k = -1;
        if (j == k) {
          return false;
        }
        str1 = AppOpsManagerCompat.OooO0Oo(str1);
        bool2 = TextUtils.isEmpty(str1);
      } while (bool2);
      String str2 = paramContext.getPackageName();
      i = AppOpsManagerCompat.OooO0O0(paramContext, str1, str2);
    } while (i == 0);
    return false;
    return true;
  }
  
  public static boolean OooOo0O(Collection paramCollection)
  {
    if (paramCollection != null)
    {
      bool = paramCollection.isEmpty();
      if (!bool)
      {
        bool = false;
        paramCollection = null;
        return bool;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public static Method OooOo0o(Object paramObject, String paramString, Class... paramVarArgs)
  {
    if (paramObject == null) {
      return null;
    }
    try
    {
      paramObject = paramObject.getClass();
      paramObject = paramObject.getDeclaredMethod(paramString, paramVarArgs);
      bool = true;
      paramObject.setAccessible(bool);
      return paramObject;
    }
    finally
    {
      boolean bool = LogUtils.isDebug();
      if (bool) {
        paramObject.printStackTrace();
      }
    }
    return null;
  }
  
  public static String OooOoO(String paramString)
  {
    Object localObject = "MD5";
    try
    {
      localObject = MessageDigest.getInstance((String)localObject);
      paramString = paramString.getBytes();
      ((MessageDigest)localObject).update(paramString);
      paramString = new java/math/BigInteger;
      localObject = ((MessageDigest)localObject).digest();
      int i = 1;
      paramString.<init>(i, (byte[])localObject);
      int j = 16;
      return paramString.toString(j);
    }
    catch (Exception paramString)
    {
      boolean bool = LogUtils.isDebug();
      if (bool) {
        paramString.printStackTrace();
      }
    }
    return "";
  }
  
  public static boolean OooOoO0(Object paramObject, String paramString1, String paramString2, Class... paramVarArgs)
  {
    String str1 = OooO00o;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str2 = m54207b69.F54207b69_11("U010115F58485D655B865A676016");
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(paramString1);
    str2 = m54207b69.F54207b69_11("Rh48494A081121060E145B");
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(paramString2);
    localObject = ((StringBuilder)localObject).toString();
    LogUtils.OooO0OO(str1, (String)localObject);
    boolean bool1 = false;
    str1 = null;
    if (paramObject == null) {
      return false;
    }
    try
    {
      paramObject = paramObject.getClass();
      paramObject = paramObject.getMethod(paramString1, paramVarArgs);
      paramObject = paramObject.toGenericString();
      boolean bool2 = paramObject.contains(paramString2);
      bool1 = bool2 ^ true;
    }
    catch (Exception paramObject)
    {
      boolean bool3 = LogUtils.isDebug();
      if (bool3) {
        paramObject.printStackTrace();
      }
    }
    paramObject = OooO00o;
    paramString1 = new java/lang/StringBuilder;
    paramString1.<init>();
    paramString2 = m54207b69.F54207b69_11("Ff0F162B1307191A160B0B350E1E1B17116C");
    paramString1.append(paramString2);
    paramString1.append(bool1);
    paramString1 = paramString1.toString();
    LogUtils.OooO0OO(paramObject, paramString1);
    return bool1;
  }
  
  public static void OooOoOO(Runnable paramRunnable)
  {
    Handler localHandler = OooO0O0;
    if (localHandler == null)
    {
      localHandler = new android/os/Handler;
      Looper localLooper = Looper.getMainLooper();
      localHandler.<init>(localLooper);
      OooO0O0 = localHandler;
    }
    OooO0O0.post(paramRunnable);
  }
  
  public static void OooOoo(View paramView, CharSequence paramCharSequence1, int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence2, int paramInt4, View.OnClickListener paramOnClickListener)
  {
    SpannableString localSpannableString = new android/text/SpannableString;
    localSpannableString.<init>(paramCharSequence1);
    paramCharSequence1 = new android/text/style/ForegroundColorSpan;
    paramCharSequence1.<init>(paramInt2);
    paramInt2 = localSpannableString.length();
    int i = 33;
    localSpannableString.setSpan(paramCharSequence1, 0, paramInt2, i);
    paramCharSequence1 = new java/lang/ref/WeakReference;
    paramView = Snackbar.make(paramView, localSpannableString, paramInt1);
    paramCharSequence1.<init>(paramView);
    OooO0OO = paramCharSequence1;
    paramView = (Snackbar)paramCharSequence1.get();
    paramCharSequence1 = paramView.getView();
    paramCharSequence1.setBackgroundColor(paramInt3);
    if (paramCharSequence2 != null)
    {
      int j = paramCharSequence2.length();
      if ((j > 0) && (paramOnClickListener != null))
      {
        paramView.setActionTextColor(paramInt4);
        paramView.setAction(paramCharSequence2, paramOnClickListener);
      }
    }
    paramView.show();
  }
  
  public static void OooOoo0(Context paramContext, Intent paramIntent, String paramString, File paramFile, boolean paramBoolean)
  {
    paramContext = OooOOo0(paramContext, paramFile);
    paramIntent.setDataAndType(paramContext, paramString);
    int i = 1;
    paramIntent.addFlags(i);
    if (paramBoolean)
    {
      i = 2;
      paramIntent.addFlags(i);
    }
  }
  
  public static boolean OooOooO(Activity paramActivity, WebView paramWebView, ValueCallback paramValueCallback1, WebChromeClient.FileChooserParams paramFileChooserParams, PermissionInterceptor paramPermissionInterceptor, ValueCallback paramValueCallback2, String paramString, Handler.Callback paramCallback)
  {
    boolean bool1 = true;
    Object localObject1 = "N.4D42450348606361085853564C67675A5C115A5A5660635D595A7766781D8666626C8F696566837284";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = Class.forName((String)localObject1);
      Object localObject2 = "*i070D202E20050B141424";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      int i = 2;
      Object localObject3 = new Class[i];
      Object localObject4 = Activity.class;
      localObject3[0] = localObject4;
      localObject4 = WebView.class;
      localObject3[bool1] = localObject4;
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, (Class[])localObject3);
      paramActivity = new Object[] { paramActivity, paramWebView };
      paramActivity = ((Method)localObject1).invoke(null, paramActivity);
      paramWebView = paramActivity.getClass();
      localObject1 = ValueCallback.class;
      if (paramValueCallback1 != null)
      {
        localObject2 = "/R2138280A24400A3A4630411C3F4B4C3F43424B34";
        localObject2 = m54207b69.F54207b69_11((String)localObject2);
        localObject3 = new Class[bool1];
        localObject3[0] = localObject1;
        localObject2 = paramWebView.getDeclaredMethod((String)localObject2, (Class[])localObject3);
        ((AccessibleObject)localObject2).setAccessible(bool1);
        localObject3 = new Object[] { paramValueCallback1 };
        ((Method)localObject2).invoke(paramActivity, (Object[])localObject3);
      }
      if (paramFileChooserParams != null)
      {
        localObject2 = "JJ3930400F272B35102A2E2F443B45283A483C394C";
        localObject2 = m54207b69.F54207b69_11((String)localObject2);
        localObject3 = new Class[bool1];
        localObject4 = WebChromeClient.FileChooserParams.class;
        localObject3[0] = localObject4;
        localObject2 = paramWebView.getDeclaredMethod((String)localObject2, (Class[])localObject3);
        ((AccessibleObject)localObject2).setAccessible(bool1);
        paramFileChooserParams = new Object[] { paramFileChooserParams };
        ((Method)localObject2).invoke(paramActivity, paramFileChooserParams);
      }
      if (paramValueCallback2 != null)
      {
        paramFileChooserParams = "Gk180F21411D0743110F271833161415181A1912";
        paramFileChooserParams = m54207b69.F54207b69_11(paramFileChooserParams);
        localObject2 = new Class[bool1];
        localObject2[0] = localObject1;
        paramFileChooserParams = paramWebView.getDeclaredMethod(paramFileChooserParams, (Class[])localObject2);
        paramFileChooserParams.setAccessible(bool1);
        localObject1 = new Object[] { paramValueCallback2 };
        paramFileChooserParams.invoke(paramActivity, (Object[])localObject1);
      }
      boolean bool2 = TextUtils.isEmpty(paramString);
      if (!bool2)
      {
        paramFileChooserParams = ":24158487655565D494E6F554D63";
        paramFileChooserParams = m54207b69.F54207b69_11(paramFileChooserParams);
        localObject1 = new Class[bool1];
        localObject2 = String.class;
        localObject1[0] = localObject2;
        paramFileChooserParams = paramWebView.getDeclaredMethod(paramFileChooserParams, (Class[])localObject1);
        paramFileChooserParams.setAccessible(bool1);
        paramString = new Object[] { paramString };
        paramFileChooserParams.invoke(paramActivity, paramString);
      }
      if (paramCallback != null)
      {
        paramFileChooserParams = ":M3E293B0A42132B332B2C322C1A392F303F3D4039";
        paramFileChooserParams = m54207b69.F54207b69_11(paramFileChooserParams);
        paramString = new Class[bool1];
        localObject1 = Handler.Callback.class;
        paramString[0] = localObject1;
        paramFileChooserParams = paramWebView.getDeclaredMethod(paramFileChooserParams, paramString);
        paramFileChooserParams.setAccessible(bool1);
        paramString = new Object[] { paramCallback };
        paramFileChooserParams.invoke(paramActivity, paramString);
      }
      paramFileChooserParams = "w`13061633091713101B1C131A1A361C231523151824292529";
      paramFileChooserParams = m54207b69.F54207b69_11(paramFileChooserParams);
      paramString = new Class[bool1];
      paramCallback = PermissionInterceptor.class;
      paramString[0] = paramCallback;
      paramFileChooserParams = paramWebView.getDeclaredMethod(paramFileChooserParams, paramString);
      paramFileChooserParams.setAccessible(bool1);
      paramPermissionInterceptor = new Object[] { paramPermissionInterceptor };
      paramFileChooserParams.invoke(paramActivity, paramPermissionInterceptor);
      paramFileChooserParams = "+k091F040A13";
      paramFileChooserParams = m54207b69.F54207b69_11(paramFileChooserParams);
      paramPermissionInterceptor = new Class[0];
      paramWebView = paramWebView.getDeclaredMethod(paramFileChooserParams, paramPermissionInterceptor);
      paramWebView.setAccessible(bool1);
      paramFileChooserParams = new Object[0];
      paramActivity = paramWebView.invoke(paramActivity, paramFileChooserParams);
      paramWebView = paramActivity.getClass();
      paramFileChooserParams = "T+445C504871474D55704C4E4F645B67";
      paramFileChooserParams = m54207b69.F54207b69_11(paramFileChooserParams);
      paramPermissionInterceptor = new Class[0];
      paramWebView = paramWebView.getDeclaredMethod(paramFileChooserParams, paramPermissionInterceptor);
      paramWebView.setAccessible(bool1);
      paramFileChooserParams = new Object[0];
      paramWebView.invoke(paramActivity, paramFileChooserParams);
    }
    finally
    {
      boolean bool3 = LogUtils.isDebug();
      if (bool3) {
        paramActivity.printStackTrace();
      }
      boolean bool4 = paramActivity instanceof ClassNotFoundException;
      if (bool4)
      {
        paramActivity = OooO00o;
        paramWebView = m54207b69.F54207b69_11("'B122F2926352C682832302B346E423836463B3943763643464A444842813E4B4E8C4959545A91494C4F556060534DA6535B5F59545E6263685F69B275A877AA79A5A3686A766C726D6F756B86AE827180B27478797B7BC2");
        LogUtils.OooO00o(paramActivity, paramWebView);
      }
      if (paramValueCallback1 != null)
      {
        paramActivity = OooO00o;
        paramWebView = m54207b69.F54207b69_11("|r1D1D221A151C210B1F2D1D29132460262F13181E");
        LogUtils.OooO0OO(paramActivity, paramWebView);
        return false;
      }
      if (paramValueCallback2 != null) {
        paramValueCallback2.onReceiveValue(null);
      }
    }
    return bool1;
  }
  
  public static void OooOooo(Context paramContext, String paramString)
  {
    Toast localToast = OooO0Oo;
    if (localToast == null)
    {
      paramContext = paramContext.getApplicationContext();
      localToast = null;
      paramContext = Toast.makeText(paramContext, paramString, 0);
      OooO0Oo = paramContext;
    }
    else
    {
      localToast.setText(paramString);
    }
    OooO0Oo.show();
  }
  
  public static long getAvailableStorage()
  {
    try
    {
      StatFs localStatFs = new android/os/StatFs;
      Object localObject = Environment.getExternalStorageDirectory();
      localObject = ((File)localObject).toString();
      localStatFs.<init>((String)localObject);
      long l1 = localStatFs.getAvailableBlocksLong();
      long l2 = localStatFs.getBlockSizeLong();
      return l1 * l2;
    }
    catch (RuntimeException localRuntimeException) {}
    return 0L;
  }
  
  public static boolean isUIThread()
  {
    Looper localLooper1 = Looper.myLooper();
    Looper localLooper2 = Looper.getMainLooper();
    boolean bool;
    if (localLooper1 == localLooper2)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localLooper1 = null;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.utils.AgentWebUtils
 * JD-Core Version:    0.7.0.1
 */