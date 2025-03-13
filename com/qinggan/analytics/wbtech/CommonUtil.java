package com.qinggan.analytics.wbtech;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import m54207b69;
import org.json.JSONArray;
import org.json.JSONObject;

class CommonUtil
{
  public static String OooO00o = "CommonUtil";
  
  public static String OooO(File paramFile)
  {
    try
    {
      return OooOOOo(paramFile);
    }
    catch (IOException paramFile)
    {
      CobubLog.OooO0O0(OooO00o, paramFile);
    }
    return null;
  }
  
  public static boolean OooO00o(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    paramContext = paramContext.getPackageName();
    int i = localPackageManager.checkPermission(paramString, paramContext);
    if (i == 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramContext = null;
    }
    return i;
  }
  
  public static String OooO0O0(Context paramContext)
  {
    AppInfo.OooO00o(paramContext);
    String str1 = AppInfo.getAppKey();
    if (str1 != null)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append(str1);
      str1 = DeviceInfo.getDeviceTime();
      ((StringBuilder)localObject).append(str1);
      str1 = OooOOOO(((StringBuilder)localObject).toString());
      localObject = new com/qinggan/analytics/wbtech/SharedPrefUtil;
      ((SharedPrefUtil)localObject).<init>(paramContext);
      String str2 = m54207b69.F54207b69_11("_2415843445F626274635F");
      ((SharedPrefUtil)localObject).OooO0o(str2, str1);
      OooOo00(paramContext);
      return str1;
    }
    return "";
  }
  
  public static String OooO0OO(Context paramContext)
  {
    String str1 = "";
    if (paramContext == null) {
      return str1;
    }
    boolean bool1 = paramContext instanceof Activity;
    if (bool1)
    {
      try
      {
        paramContext = (Activity)paramContext;
        paramContext = paramContext.getComponentName();
        str1 = paramContext.getShortClassName();
      }
      catch (Exception paramContext)
      {
        localObject = m54207b69.F54207b69_11("Wk080B074E09092552141729561117141D");
        paramContext = paramContext.toString();
        CobubLog.OooO0OO((String)localObject, paramContext);
      }
      return str1;
    }
    bool1 = paramContext instanceof Service;
    if (bool1) {
      return paramContext.getClass().getCanonicalName();
    }
    Object localObject = m54207b69.F54207b69_11(":'4645555155535965");
    localObject = (ActivityManager)paramContext.getSystemService((String)localObject);
    String str2 = m54207b69.F54207b69_11("WL2D232A41272A2E694432482C314C4D343333741E1D2D292F2538213A");
    boolean bool2 = OooO00o(paramContext, str2);
    if (bool2) {
      return OooO00o.OooO00o((ActivityManager.RunningTaskInfo)((ActivityManager)localObject).getRunningTasks(1).get(0)).getShortClassName();
    }
    CobubLog.OooO0OO(m54207b69.F54207b69_11("?&4A4A57550A5B495B53585F605B5656"), str2);
    return str1;
  }
  
  public static String OooO0Oo(Context paramContext)
  {
    String str = "";
    try
    {
      localObject2 = paramContext.getPackageManager();
      paramContext = paramContext.getPackageName();
      paramContext = ((PackageManager)localObject2).getPackageInfo(paramContext, 0);
      paramContext = paramContext.versionName;
      if (paramContext != null) {
        try
        {
          int i = paramContext.length();
          if (i > 0) {
            return paramContext;
          }
        }
        catch (Exception localException1)
        {
          break label56;
        }
      }
      return localException1;
    }
    catch (Exception paramContext)
    {
      Exception localException2 = localException1;
      Object localObject1 = paramContext;
      paramContext = localException2;
      label56:
      Object localObject2 = OooO00o;
      localObject1 = localObject1.toString();
      CobubLog.OooO0OO((String)localObject2, (String)localObject1);
    }
    return paramContext;
  }
  
  public static UmsAgent.SendPolicy OooO0o(Context paramContext)
  {
    return UmsConstants.OooO0o0;
  }
  
  public static String OooO0o0(long paramLong)
  {
    try
    {
      Date localDate = new java/util/Date;
      localDate.<init>(paramLong);
      SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
      String str = "XY2021222378191A7B4546831C1D704243733B3C";
      str = m54207b69.F54207b69_11(str);
      Locale localLocale = Locale.US;
      localSimpleDateFormat.<init>(str, localLocale);
      return localSimpleDateFormat.format(localDate);
    }
    catch (Exception localException) {}
    return "";
  }
  
  /* Error */
  public static String OooO0oO(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: astore_1
    //   3: aload_1
    //   4: monitorenter
    //   5: aload_0
    //   6: invokevirtual 37	android/content/Context:getPackageName	()Ljava/lang/String;
    //   9: astore_1
    //   10: ldc 200
    //   12: astore_2
    //   13: ldc 91
    //   15: astore_3
    //   16: aload_1
    //   17: aload_2
    //   18: aload_3
    //   19: invokevirtual 204	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   22: astore_1
    //   23: invokestatic 210	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   26: astore_2
    //   27: aload_2
    //   28: invokevirtual 215	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   31: astore_2
    //   32: getstatic 220	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   35: astore_3
    //   36: aload_3
    //   37: invokestatic 226	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   40: istore 4
    //   42: new 212	java/io/File
    //   45: astore 5
    //   47: new 54	java/lang/StringBuilder
    //   50: astore 6
    //   52: aload 6
    //   54: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   57: aload 6
    //   59: aload_2
    //   60: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: getstatic 229	java/io/File:separator	Ljava/lang/String;
    //   67: astore_2
    //   68: aload 6
    //   70: aload_2
    //   71: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload 6
    //   77: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: astore_2
    //   81: new 54	java/lang/StringBuilder
    //   84: astore 6
    //   86: aload 6
    //   88: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   91: ldc 200
    //   93: astore 7
    //   95: aload 6
    //   97: aload 7
    //   99: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload 6
    //   105: aload_1
    //   106: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: aload 6
    //   112: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: astore 6
    //   117: aload 5
    //   119: aload_2
    //   120: aload 6
    //   122: invokespecial 231	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   125: new 212	java/io/File
    //   128: astore_2
    //   129: aload_0
    //   130: invokevirtual 234	android/content/Context:getFilesDir	()Ljava/io/File;
    //   133: astore 6
    //   135: aload_2
    //   136: aload 6
    //   138: aload_1
    //   139: invokespecial 237	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   142: bipush 19
    //   144: istore 8
    //   146: iload 4
    //   148: iload 8
    //   150: if_icmplt +31 -> 181
    //   153: iconst_0
    //   154: istore 4
    //   156: aconst_null
    //   157: astore_3
    //   158: aload_0
    //   159: aconst_null
    //   160: invokevirtual 242	android/content/Context:getExternalFilesDir	(Ljava/lang/String;)Ljava/io/File;
    //   163: astore_0
    //   164: aload_0
    //   165: invokevirtual 215	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   168: astore_0
    //   169: new 212	java/io/File
    //   172: astore 5
    //   174: aload 5
    //   176: aload_0
    //   177: aload_1
    //   178: invokespecial 231	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   181: invokestatic 245	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   184: astore_0
    //   185: ldc 247
    //   187: astore_3
    //   188: aload_3
    //   189: invokestatic 82	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   192: astore_3
    //   193: aload_0
    //   194: aload_3
    //   195: invokevirtual 251	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   198: istore 9
    //   200: iload 9
    //   202: ifeq +67 -> 269
    //   205: aload 5
    //   207: invokevirtual 255	java/io/File:exists	()Z
    //   210: istore 9
    //   212: iload 9
    //   214: ifne +33 -> 247
    //   217: aload_2
    //   218: aload_1
    //   219: invokestatic 259	com/qinggan/analytics/wbtech/CommonUtil:OooO0oo	(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    //   222: astore_0
    //   223: aload 5
    //   225: aload_0
    //   226: invokestatic 262	com/qinggan/analytics/wbtech/CommonUtil:OooOo0	(Ljava/io/File;Ljava/lang/String;)V
    //   229: goto +13 -> 242
    //   232: astore_1
    //   233: getstatic 19	com/qinggan/analytics/wbtech/CommonUtil:OooO00o	Ljava/lang/String;
    //   236: astore_2
    //   237: aload_2
    //   238: aload_1
    //   239: invokestatic 25	com/qinggan/analytics/wbtech/CobubLog:OooO0O0	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   242: ldc 2
    //   244: monitorexit
    //   245: aload_0
    //   246: areturn
    //   247: aload 5
    //   249: invokestatic 265	com/qinggan/analytics/wbtech/CommonUtil:OooO	(Ljava/io/File;)Ljava/lang/String;
    //   252: astore_0
    //   253: aload_2
    //   254: aload_0
    //   255: invokestatic 262	com/qinggan/analytics/wbtech/CommonUtil:OooOo0	(Ljava/io/File;Ljava/lang/String;)V
    //   258: goto -16 -> 242
    //   261: astore_1
    //   262: aload_1
    //   263: invokevirtual 270	java/lang/Throwable:printStackTrace	()V
    //   266: goto -24 -> 242
    //   269: aload_2
    //   270: aload_1
    //   271: invokestatic 259	com/qinggan/analytics/wbtech/CommonUtil:OooO0oo	(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    //   274: astore_0
    //   275: goto -33 -> 242
    //   278: astore_0
    //   279: ldc 2
    //   281: monitorexit
    //   282: aload_0
    //   283: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	284	0	paramContext	Context
    //   2	217	1	localObject1	Object
    //   232	7	1	localException	Exception
    //   261	10	1	localIOException	IOException
    //   12	258	2	localObject2	Object
    //   15	180	3	str1	String
    //   40	115	4	i	int
    //   45	203	5	localFile	File
    //   50	87	6	localObject3	Object
    //   93	5	7	str2	String
    //   144	7	8	j	int
    //   198	15	9	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   225	229	232	java/lang/Exception
    //   254	258	261	java/io/IOException
    //   5	9	278	finally
    //   18	22	278	finally
    //   23	26	278	finally
    //   27	31	278	finally
    //   32	35	278	finally
    //   36	40	278	finally
    //   42	45	278	finally
    //   47	50	278	finally
    //   52	57	278	finally
    //   59	64	278	finally
    //   64	67	278	finally
    //   70	75	278	finally
    //   75	80	278	finally
    //   81	84	278	finally
    //   86	91	278	finally
    //   97	103	278	finally
    //   105	110	278	finally
    //   110	115	278	finally
    //   120	125	278	finally
    //   125	128	278	finally
    //   129	133	278	finally
    //   138	142	278	finally
    //   159	163	278	finally
    //   164	168	278	finally
    //   169	172	278	finally
    //   177	181	278	finally
    //   181	184	278	finally
    //   188	192	278	finally
    //   194	198	278	finally
    //   205	210	278	finally
    //   218	222	278	finally
    //   225	229	278	finally
    //   233	236	278	finally
    //   238	242	278	finally
    //   247	252	278	finally
    //   254	258	278	finally
    //   262	266	278	finally
    //   270	274	278	finally
  }
  
  public static String OooO0oo(File paramFile, String paramString)
  {
    try
    {
      boolean bool = paramFile.exists();
      if (!bool)
      {
        paramString = getUUID();
        OooOo0(paramFile, paramString);
        return paramString;
      }
      return OooOOOo(paramFile);
    }
    catch (IOException paramFile)
    {
      CobubLog.OooO0O0(OooO00o, paramFile);
    }
    return "";
  }
  
  public static String OooOO0(Context paramContext)
  {
    SharedPrefUtil localSharedPrefUtil = new com/qinggan/analytics/wbtech/SharedPrefUtil;
    localSharedPrefUtil.<init>(paramContext);
    paramContext = m54207b69.F54207b69_11("_2415843445F626274635F");
    return localSharedPrefUtil.OooO0OO(paramContext, "");
  }
  
  public static String OooOO0O(Context paramContext)
  {
    String str1 = "";
    try
    {
      SharedPrefUtil localSharedPrefUtil = new com/qinggan/analytics/wbtech/SharedPrefUtil;
      localSharedPrefUtil.<init>(paramContext);
      String str2 = "Y8515D5F59505664586553";
      paramContext = m54207b69.F54207b69_11(str2);
      return localSharedPrefUtil.OooO0OO(paramContext, str1);
    }
    catch (Exception paramContext)
    {
      CobubLog.OooO0O0(OooO00o, paramContext);
    }
    return str1;
  }
  
  public static boolean OooOO0o(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("eK2A26313C2827356C433743312E45463134367715193424301D2739");
    boolean bool1 = OooO00o(paramContext, str);
    if (bool1)
    {
      str = m54207b69.F54207b69_11("Jc000D0F100A051D111D132125");
      paramContext = (ConnectivityManager)paramContext.getSystemService(str);
      if (paramContext == null) {
        return false;
      }
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext != null)
      {
        boolean bool2 = paramContext.isAvailable();
        if (bool2)
        {
          paramContext = OooO00o;
          str = m54207b69.F54207b69_11("@A0F25373932383068303B6B2B432D363C30343F3783");
          CobubLog.OooO0Oo(paramContext, str);
          return true;
        }
      }
      paramContext = OooO00o;
      str = m54207b69.F54207b69_11("NZ14403030392D37813B32843F413B884A3C4C45494F4D4C568C");
      CobubLog.OooO0Oo(paramContext, str);
      return false;
    }
    paramContext = OooO00o;
    str = m54207b69.F54207b69_11("|(49474E5D4B46520D605664504D686950575718747A9183917E869623746A7864617C7D646B6B2E826870876F7835787C387A7E7F81813E787E958143A5838A9987828EA88D8B879595A4A6519C929255");
    CobubLog.OooO0OO(paramContext, str);
    return false;
  }
  
  public static boolean OooOOO(Context paramContext)
  {
    boolean bool1 = true;
    try
    {
      long l1 = System.currentTimeMillis();
      SharedPrefUtil localSharedPrefUtil = new com/qinggan/analytics/wbtech/SharedPrefUtil;
      localSharedPrefUtil.<init>(paramContext);
      String str1 = "Sz09200B0C171A1A2C1124162A311B21262F";
      paramContext = m54207b69.F54207b69_11(str1);
      long l2 = 0L;
      long l3 = localSharedPrefUtil.OooO00o(paramContext, l2);
      paramContext = OooO00o;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "*754434748565E494A66635C15";
      str2 = m54207b69.F54207b69_11(str2);
      ((StringBuilder)localObject).append(str2);
      ((StringBuilder)localObject).append(l1);
      localObject = ((StringBuilder)localObject).toString();
      CobubLog.OooO0Oo(paramContext, (String)localObject);
      paramContext = OooO00o;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      str2 = "iT2732292A414040122F3E2C3C172D4B48417A";
      str2 = m54207b69.F54207b69_11(str2);
      ((StringBuilder)localObject).append(str2);
      ((StringBuilder)localObject).append(l3);
      localObject = ((StringBuilder)localObject).toString();
      CobubLog.OooO0Oo(paramContext, (String)localObject);
      l1 -= l3;
      l3 = UmsConstants.OooO0OO;
      boolean bool2 = l1 < l3;
      if (bool2)
      {
        paramContext = OooO00o;
        str3 = "Fy0B1D0F0F0F1C5F141315266026182A271D2D6B2A30236F213423242B323475";
        str3 = m54207b69.F54207b69_11(str3);
        CobubLog.OooO0Oo(paramContext, str3);
        return bool1;
      }
      paramContext = OooO00o;
      String str3 = "c@322636383633662D29353D307A0E426F443937734736433C784C3F4E4F464D4D8E";
      str3 = m54207b69.F54207b69_11(str3);
      CobubLog.OooO0Oo(paramContext, str3);
      return false;
    }
    catch (Exception paramContext)
    {
      CobubLog.OooO0O0(OooO00o, paramContext);
    }
    return bool1;
  }
  
  public static boolean OooOOO0(Context paramContext)
  {
    String str1 = m54207b69.F54207b69_11("eK2A26313C2827356C433743312E45463134367715193424301D2739");
    int i = OooO00o(paramContext, str1);
    String str2 = null;
    if (i != 0)
    {
      str1 = m54207b69.F54207b69_11("Jc000D0F100A051D111D132125");
      paramContext = (ConnectivityManager)paramContext.getSystemService(str1);
      if (paramContext == null) {
        return false;
      }
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext != null)
      {
        i = paramContext.isAvailable();
        if (i != 0)
        {
          int j = paramContext.getType();
          i = 1;
          if (j == i)
          {
            paramContext = OooO00o;
            str2 = m54207b69.F54207b69_11("R%6447534F57450B72485A5C55635B13606C665218606B1B69645C66");
            CobubLog.OooO0Oo(paramContext, str2);
            return i;
          }
        }
      }
      paramContext = OooO00o;
      str1 = m54207b69.F54207b69_11("8l2D101A081E0E52291121250E2A145A27252D1B5F193462191B316636212723");
      CobubLog.OooO0Oo(paramContext, str1);
      return false;
    }
    paramContext = OooO00o;
    str1 = m54207b69.F54207b69_11("|(49474E5D4B46520D605664504D686950575718747A9183917E869623746A7864617C7D646B6B2E826870876F7835787C387A7E7F81813E787E958143A5838A9987828EA88D8B879595A4A6519C929255");
    CobubLog.OooO0OO(paramContext, str1);
    return false;
  }
  
  public static String OooOOOO(String paramString)
  {
    Object localObject = "MD5";
    try
    {
      localObject = MessageDigest.getInstance((String)localObject);
      paramString = paramString.getBytes();
      ((MessageDigest)localObject).update(paramString);
      paramString = ((MessageDigest)localObject).digest();
      localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      int i = 0;
      for (;;)
      {
        int j = paramString.length;
        if (i >= j) {
          break;
        }
        j = paramString[i] & 0xFF;
        int k = 16;
        if (j < k)
        {
          String str1 = "0";
          ((StringBuffer)localObject).append(str1);
        }
        String str2 = Integer.toHexString(j);
        ((StringBuffer)localObject).append(str2);
        i += 1;
      }
      return ((StringBuffer)localObject).toString();
    }
    catch (Exception paramString)
    {
      CobubLog.OooO0O0(OooO00o, paramString);
    }
    return "";
  }
  
  public static String OooOOOo(File paramFile)
  {
    Object localObject = new java/io/RandomAccessFile;
    ((RandomAccessFile)localObject).<init>(paramFile, "r");
    paramFile = new byte[(int)((RandomAccessFile)localObject).length()];
    ((RandomAccessFile)localObject).readFully(paramFile);
    ((RandomAccessFile)localObject).close();
    localObject = new java/lang/String;
    ((String)localObject).<init>(paramFile);
    return localObject;
  }
  
  public static void OooOOo(String paramString, JSONObject paramJSONObject, Context paramContext)
  {
    JSONArray localJSONArray = new org/json/JSONArray;
    localJSONArray.<init>();
    try
    {
      localJSONArray.put(0, paramJSONObject);
      paramJSONObject = new org/json/JSONObject;
      paramJSONObject.<init>();
      paramJSONObject.put(paramString, localJSONArray);
      paramString = new java/lang/StringBuilder;
      paramString.<init>();
      paramContext = paramContext.getCacheDir();
      paramString.append(paramContext);
      paramContext = "5V79363B3727397E3C3F3E483E";
      paramContext = m54207b69.F54207b69_11(paramContext);
      paramString.append(paramContext);
      paramString = paramString.toString();
      SaveInfo.OooO00o(paramJSONObject, paramString);
    }
    catch (Exception paramString)
    {
      paramJSONObject = OooO00o;
      CobubLog.OooO0O0(paramJSONObject, paramString);
    }
  }
  
  public static void OooOOo0(String paramString, JSONObject paramJSONObject, Context paramContext)
  {
    JSONArray localJSONArray = new org/json/JSONArray;
    localJSONArray.<init>();
    try
    {
      localJSONArray.put(0, paramJSONObject);
      paramJSONObject = new org/json/JSONObject;
      paramJSONObject.<init>();
      paramJSONObject.put(paramString, localJSONArray);
      paramString = new java/lang/StringBuilder;
      paramString.<init>();
      paramContext = paramContext.getCacheDir();
      paramString.append(paramContext);
      paramContext = "5V79363B3727397E3C3F3E483E";
      paramContext = m54207b69.F54207b69_11(paramContext);
      paramString.append(paramContext);
      paramString = paramString.toString();
      paramContext = new com/qinggan/analytics/wbtech/SaveInfo;
      paramContext.<init>(paramJSONObject, paramString);
      paramContext.run();
    }
    catch (Exception paramString)
    {
      paramJSONObject = OooO00o;
      CobubLog.OooO0O0(paramJSONObject, paramString);
    }
  }
  
  public static void OooOOoo(Context paramContext, String paramString1, String paramString2)
  {
    SharedPrefUtil localSharedPrefUtil = new com/qinggan/analytics/wbtech/SharedPrefUtil;
    localSharedPrefUtil.<init>(paramContext);
    paramContext = m54207b69.F54207b69_11("]K083F3B3C322A4522323538");
    localSharedPrefUtil.OooO0o(paramContext, paramString1);
    paramContext = m54207b69.F54207b69_11("s-6E5961624C485F85605887575655");
    localSharedPrefUtil.OooO0o(paramContext, paramString2);
  }
  
  public static void OooOo0(File paramFile, String paramString)
  {
    paramFile.createNewFile();
    FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
    localFileOutputStream.<init>(paramFile);
    paramFile = paramString.getBytes();
    localFileOutputStream.write(paramFile);
    localFileOutputStream.close();
  }
  
  public static void OooOo00(Context paramContext)
  {
    SharedPrefUtil localSharedPrefUtil = new com/qinggan/analytics/wbtech/SharedPrefUtil;
    localSharedPrefUtil.<init>(paramContext);
    paramContext = m54207b69.F54207b69_11("Sz09200B0C171A1A2C1124162A311B21262F");
    long l = System.currentTimeMillis();
    localSharedPrefUtil.OooO0Oo(paramContext, l);
  }
  
  private static String getUUID()
  {
    return UUID.randomUUID().toString().replace("-", "");
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.CommonUtil
 * JD-Core Version:    0.7.0.1
 */