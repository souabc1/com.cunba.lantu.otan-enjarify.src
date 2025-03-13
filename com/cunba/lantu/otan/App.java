package com.cunba.lantu.otan;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.cunba.lantu.otan.utils.MMKVUtil;
import java.lang.reflect.Method;
import java.util.Locale;
import m54207b69;

public class App
  extends Application
  implements Application.ActivityLifecycleCallbacks
{
  public static Context o00OoOoo;
  
  public static boolean isDebug()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(2, arrayOfObject);
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    paramBundle = String.class;
    Object localObject1 = "@[3A36412C3837457C3C317F132E353D4D461C3B473F533F464A5742";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = Class.forName((String)localObject1);
      localObject2 = "set";
      int i = 2;
      Object localObject3 = new Class[i];
      localObject3[0] = paramBundle;
      int j = 1;
      localObject3[j] = paramBundle;
      paramBundle = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
      localObject2 = new Object[i];
      String str = "o$5442585A515C56114F5A54515117605A5D58531D596C6D646F695F656C";
      str = m54207b69.F54207b69_11(str);
      localObject2[0] = str;
      str = "_U233B3E39340F3A2D2E45302C40482F";
      str = m54207b69.F54207b69_11(str);
      localObject3 = "zh";
      str = MMKVUtil.OooO0o0(str, (String)localObject3);
      localObject2[j] = str;
      paramBundle.invoke(localObject1, (Object[])localObject2);
    }
    catch (Exception localException)
    {
      Object localObject2;
      label116:
      break label116;
    }
    paramBundle = MMKVUtil.getLanguage();
    paramActivity = paramActivity.getResources();
    localObject1 = paramActivity.getConfiguration();
    localObject2 = new java/util/Locale;
    ((Locale)localObject2).<init>(paramBundle);
    ((Configuration)localObject1).setLocale((Locale)localObject2);
    paramBundle = getResources();
    localObject2 = getResources().getDisplayMetrics();
    paramBundle.updateConfiguration((Configuration)localObject1, (DisplayMetrics)localObject2);
    paramBundle = paramActivity.getDisplayMetrics();
    paramActivity.updateConfiguration((Configuration)localObject1, paramBundle);
  }
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramActivity;
    m54207b69.F54207b69_00(4, arrayOfObject);
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramActivity;
    m54207b69.F54207b69_00(5, arrayOfObject);
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramActivity;
    m54207b69.F54207b69_00(6, arrayOfObject);
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramActivity;
    arrayOfObject[2] = paramBundle;
    m54207b69.F54207b69_00(7, arrayOfObject);
  }
  
  public void onActivityStarted(Activity paramActivity)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramActivity;
    m54207b69.F54207b69_00(8, arrayOfObject);
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramActivity;
    m54207b69.F54207b69_00(9, arrayOfObject);
  }
  
  /* Error */
  public void onCreate()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 111	android/app/Application:onCreate	()V
    //   4: aload_0
    //   5: invokevirtual 115	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   8: astore_1
    //   9: ldc 117
    //   11: invokestatic 29	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   14: astore_2
    //   15: bipush 9
    //   17: istore_3
    //   18: iconst_1
    //   19: istore 4
    //   21: aload_1
    //   22: invokevirtual 121	java/lang/Object:getClass	()Ljava/lang/Class;
    //   25: astore 5
    //   27: ldc 123
    //   29: astore 6
    //   31: aload 5
    //   33: aload 6
    //   35: invokevirtual 127	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   38: astore 5
    //   40: aload 5
    //   42: iload 4
    //   44: invokevirtual 133	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   47: aload 5
    //   49: aload_1
    //   50: invokevirtual 139	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   53: astore 5
    //   55: aload 5
    //   57: invokevirtual 121	java/lang/Object:getClass	()Ljava/lang/Class;
    //   60: astore 5
    //   62: aload 5
    //   64: invokevirtual 142	java/lang/Class:getName	()Ljava/lang/String;
    //   67: astore 5
    //   69: aload_2
    //   70: aload 5
    //   72: invokevirtual 146	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   75: istore 7
    //   77: iload 7
    //   79: ifne +18 -> 97
    //   82: invokestatic 152	android/os/Process:myPid	()I
    //   85: istore 8
    //   87: iload 8
    //   89: iload_3
    //   90: invokestatic 156	android/os/Process:sendSignal	(II)V
    //   93: goto -11 -> 82
    //   96: pop
    //   97: aload_0
    //   98: invokevirtual 159	android/content/Context:getPackageName	()Ljava/lang/String;
    //   101: astore_2
    //   102: aconst_null
    //   103: astore 5
    //   105: bipush 64
    //   107: istore 9
    //   109: aload_1
    //   110: aload_2
    //   111: iload 9
    //   113: invokevirtual 166	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   116: astore_1
    //   117: goto +9 -> 126
    //   120: pop
    //   121: iconst_0
    //   122: istore 8
    //   124: aconst_null
    //   125: astore_1
    //   126: aload_1
    //   127: getfield 172	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   130: astore_1
    //   131: iconst_0
    //   132: istore 7
    //   134: aconst_null
    //   135: astore_2
    //   136: aload_1
    //   137: iconst_0
    //   138: aaload
    //   139: invokevirtual 178	android/content/pm/Signature:toByteArray	()[B
    //   142: astore_1
    //   143: new 180	java/io/ByteArrayInputStream
    //   146: astore 6
    //   148: aload 6
    //   150: aload_1
    //   151: invokespecial 183	java/io/ByteArrayInputStream:<init>	([B)V
    //   154: ldc 185
    //   156: astore_1
    //   157: aload_1
    //   158: invokestatic 29	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   161: astore_1
    //   162: aload_1
    //   163: invokestatic 191	java/security/cert/CertificateFactory:getInstance	(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   166: astore_1
    //   167: goto +9 -> 176
    //   170: pop
    //   171: iconst_0
    //   172: istore 8
    //   174: aconst_null
    //   175: astore_1
    //   176: aload_1
    //   177: aload 6
    //   179: invokevirtual 195	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   182: astore_1
    //   183: aload_1
    //   184: checkcast 197	java/security/cert/X509Certificate
    //   187: astore_1
    //   188: aload_1
    //   189: astore 5
    //   191: ldc 199
    //   193: astore_1
    //   194: aload_1
    //   195: invokestatic 29	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   198: astore_1
    //   199: aload_1
    //   200: invokestatic 204	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   203: astore_1
    //   204: aload 5
    //   206: invokevirtual 209	java/security/cert/Certificate:getEncoded	()[B
    //   209: astore 5
    //   211: aload_1
    //   212: aload 5
    //   214: invokevirtual 213	java/security/MessageDigest:digest	([B)[B
    //   217: astore_1
    //   218: new 215	java/lang/StringBuilder
    //   221: astore 5
    //   223: aload_1
    //   224: arraylength
    //   225: istore 9
    //   227: iconst_2
    //   228: istore 10
    //   230: iload 9
    //   232: iload 10
    //   234: imul
    //   235: istore 9
    //   237: aload 5
    //   239: iload 9
    //   241: invokespecial 218	java/lang/StringBuilder:<init>	(I)V
    //   244: iconst_0
    //   245: istore 9
    //   247: aconst_null
    //   248: astore 6
    //   250: aload_1
    //   251: arraylength
    //   252: istore 11
    //   254: iload 9
    //   256: iload 11
    //   258: if_icmpge +142 -> 400
    //   261: aload_1
    //   262: iload 9
    //   264: baload
    //   265: istore 11
    //   267: iload 11
    //   269: invokestatic 224	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   272: astore 12
    //   274: aload 12
    //   276: invokevirtual 227	java/lang/String:length	()I
    //   279: istore 13
    //   281: iload 13
    //   283: iload 4
    //   285: if_icmpne +40 -> 325
    //   288: new 215	java/lang/StringBuilder
    //   291: astore 14
    //   293: aload 14
    //   295: invokespecial 228	java/lang/StringBuilder:<init>	()V
    //   298: ldc 230
    //   300: astore 15
    //   302: aload 14
    //   304: aload 15
    //   306: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: pop
    //   310: aload 14
    //   312: aload 12
    //   314: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: pop
    //   318: aload 14
    //   320: invokevirtual 237	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   323: astore 12
    //   325: iload 13
    //   327: iload 10
    //   329: if_icmple +21 -> 350
    //   332: iload 13
    //   334: bipush 254
    //   336: iadd
    //   337: istore 16
    //   339: aload 12
    //   341: iload 16
    //   343: iload 13
    //   345: invokevirtual 241	java/lang/String:substring	(II)Ljava/lang/String;
    //   348: astore 12
    //   350: aload 12
    //   352: invokevirtual 244	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   355: astore 12
    //   357: aload 5
    //   359: aload 12
    //   361: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: pop
    //   365: aload_1
    //   366: arraylength
    //   367: iload 4
    //   369: isub
    //   370: istore 11
    //   372: iload 9
    //   374: iload 11
    //   376: if_icmpge +15 -> 391
    //   379: bipush 58
    //   381: istore 11
    //   383: aload 5
    //   385: iload 11
    //   387: invokevirtual 248	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   390: pop
    //   391: iload 9
    //   393: iconst_1
    //   394: iadd
    //   395: istore 9
    //   397: goto -147 -> 250
    //   400: aload 5
    //   402: invokevirtual 237	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   405: astore_1
    //   406: ldc 250
    //   408: astore 17
    //   410: aload 17
    //   412: invokestatic 29	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   415: astore 17
    //   417: aload_1
    //   418: aload 17
    //   420: invokevirtual 146	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   423: istore 8
    //   425: iload 8
    //   427: ifne +18 -> 445
    //   430: invokestatic 152	android/os/Process:myPid	()I
    //   433: istore 8
    //   435: iload 8
    //   437: iload_3
    //   438: invokestatic 156	android/os/Process:sendSignal	(II)V
    //   441: goto -11 -> 430
    //   444: pop
    //   445: aload_0
    //   446: invokevirtual 254	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   449: astore_1
    //   450: aload_1
    //   451: putstatic 256	com/cunba/lantu/otan/App:o00OoOoo	Landroid/content/Context;
    //   454: aload_1
    //   455: invokestatic 262	me/weishu/reflection/Reflection:OooO0O0	(Landroid/content/Context;)I
    //   458: pop
    //   459: aload_0
    //   460: invokestatic 266	com/cunba/lantu/otan/utils/MMKVUtil:OooO0o	(Landroid/content/Context;)V
    //   463: new 268	com/cunba/lantu/otan/ui/dialog/LargeBlackToastStyle
    //   466: astore_1
    //   467: aload_1
    //   468: invokespecial 269	com/cunba/lantu/otan/ui/dialog/LargeBlackToastStyle:<init>	()V
    //   471: aload_0
    //   472: aload_1
    //   473: invokestatic 275	com/hjq/toast/Toaster:OooO0OO	(Landroid/app/Application;Lcom/hjq/toast/config/IToastStyle;)V
    //   476: invokestatic 280	com/cunba/lantu/otan/ui/dialog/CustomFontDialogLoader:getInstance	()Lcom/cunba/lantu/otan/ui/dialog/CustomFontDialogLoader;
    //   479: pop
    //   480: iconst_0
    //   481: putstatic 286	com/cunba/lantu/otan/service/HookService:o00Ooo0O	Z
    //   484: ldc_w 287
    //   487: invokestatic 292	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   490: astore_1
    //   491: ldc_w 282
    //   494: astore_2
    //   495: aload_0
    //   496: aload_2
    //   497: aload_1
    //   498: invokestatic 298	com/xdandroid/hellodaemon/DaemonEnv:OooO00o	(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Integer;)V
    //   501: aload_2
    //   502: invokestatic 301	com/xdandroid/hellodaemon/DaemonEnv:OooO0O0	(Ljava/lang/Class;)V
    //   505: new 303	com/cunba/lantu/otan/App$1
    //   508: astore_1
    //   509: aload_1
    //   510: aload_0
    //   511: invokespecial 306	com/cunba/lantu/otan/App$1:<init>	(Lcom/cunba/lantu/otan/App;)V
    //   514: aload_1
    //   515: invokestatic 312	com/xuexiang/xaop/XAOP:setOnPermissionDeniedListener	(Lcom/xuexiang/xaop/util/PermissionUtils$OnPermissionDeniedListener;)V
    //   518: aload_0
    //   519: invokestatic 318	com/cunba/lantu/otan/utils/XBasicLibInit:OooO	(Landroid/app/Application;)V
    //   522: aload_0
    //   523: aload_0
    //   524: invokevirtual 322	android/app/Application:registerActivityLifecycleCallbacks	(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    //   527: return
    //   528: pop
    //   529: goto -447 -> 82
    //   532: pop
    //   533: goto -342 -> 191
    //   536: pop
    //   537: goto -107 -> 430
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	540	0	this	App
    //   8	507	1	localObject1	Object
    //   14	488	2	localObject2	Object
    //   17	421	3	i	int
    //   19	351	4	j	int
    //   25	376	5	localObject3	Object
    //   29	220	6	localObject4	Object
    //   75	58	7	bool1	boolean
    //   85	88	8	k	int
    //   423	3	8	bool2	boolean
    //   433	3	8	m	int
    //   107	289	9	n	int
    //   228	102	10	i1	int
    //   252	134	11	i2	int
    //   272	88	12	str1	String
    //   279	65	13	i3	int
    //   291	28	14	localStringBuilder	java.lang.StringBuilder
    //   300	5	15	str2	String
    //   337	5	16	i4	int
    //   408	11	17	str3	String
    //   96	1	20	localException1	Exception
    //   120	1	21	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   170	1	22	localException2	Exception
    //   444	1	23	localNoSuchAlgorithmException	java.security.NoSuchAlgorithmException
    //   528	1	24	localException3	Exception
    //   532	1	25	localException4	Exception
    //   536	1	26	localException5	Exception
    // Exception table:
    //   from	to	target	type
    //   21	25	96	java/lang/Exception
    //   33	38	96	java/lang/Exception
    //   42	47	96	java/lang/Exception
    //   49	53	96	java/lang/Exception
    //   55	60	96	java/lang/Exception
    //   62	67	96	java/lang/Exception
    //   70	75	96	java/lang/Exception
    //   111	116	120	android/content/pm/PackageManager$NameNotFoundException
    //   157	161	170	java/lang/Exception
    //   162	166	170	java/lang/Exception
    //   194	198	444	java/security/NoSuchAlgorithmException
    //   194	198	444	java/security/cert/CertificateEncodingException
    //   199	203	444	java/security/NoSuchAlgorithmException
    //   199	203	444	java/security/cert/CertificateEncodingException
    //   204	209	444	java/security/NoSuchAlgorithmException
    //   204	209	444	java/security/cert/CertificateEncodingException
    //   212	217	444	java/security/NoSuchAlgorithmException
    //   212	217	444	java/security/cert/CertificateEncodingException
    //   218	221	444	java/security/NoSuchAlgorithmException
    //   218	221	444	java/security/cert/CertificateEncodingException
    //   223	225	444	java/security/NoSuchAlgorithmException
    //   223	225	444	java/security/cert/CertificateEncodingException
    //   239	244	444	java/security/NoSuchAlgorithmException
    //   239	244	444	java/security/cert/CertificateEncodingException
    //   250	252	444	java/security/NoSuchAlgorithmException
    //   250	252	444	java/security/cert/CertificateEncodingException
    //   262	265	444	java/security/NoSuchAlgorithmException
    //   262	265	444	java/security/cert/CertificateEncodingException
    //   267	272	444	java/security/NoSuchAlgorithmException
    //   267	272	444	java/security/cert/CertificateEncodingException
    //   274	279	444	java/security/NoSuchAlgorithmException
    //   274	279	444	java/security/cert/CertificateEncodingException
    //   288	291	444	java/security/NoSuchAlgorithmException
    //   288	291	444	java/security/cert/CertificateEncodingException
    //   293	298	444	java/security/NoSuchAlgorithmException
    //   293	298	444	java/security/cert/CertificateEncodingException
    //   304	310	444	java/security/NoSuchAlgorithmException
    //   304	310	444	java/security/cert/CertificateEncodingException
    //   312	318	444	java/security/NoSuchAlgorithmException
    //   312	318	444	java/security/cert/CertificateEncodingException
    //   318	323	444	java/security/NoSuchAlgorithmException
    //   318	323	444	java/security/cert/CertificateEncodingException
    //   343	348	444	java/security/NoSuchAlgorithmException
    //   343	348	444	java/security/cert/CertificateEncodingException
    //   350	355	444	java/security/NoSuchAlgorithmException
    //   350	355	444	java/security/cert/CertificateEncodingException
    //   359	365	444	java/security/NoSuchAlgorithmException
    //   359	365	444	java/security/cert/CertificateEncodingException
    //   365	367	444	java/security/NoSuchAlgorithmException
    //   365	367	444	java/security/cert/CertificateEncodingException
    //   385	391	444	java/security/NoSuchAlgorithmException
    //   385	391	444	java/security/cert/CertificateEncodingException
    //   400	405	444	java/security/NoSuchAlgorithmException
    //   400	405	444	java/security/cert/CertificateEncodingException
    //   410	415	444	java/security/NoSuchAlgorithmException
    //   410	415	444	java/security/cert/CertificateEncodingException
    //   418	423	444	java/security/NoSuchAlgorithmException
    //   418	423	444	java/security/cert/CertificateEncodingException
    //   82	85	528	java/lang/Exception
    //   89	93	528	java/lang/Exception
    //   177	182	532	java/lang/Exception
    //   183	187	532	java/lang/Exception
    //   430	433	536	java/lang/Exception
    //   437	441	536	java/lang/Exception
  }
  
  public void onTerminate()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(11, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.App
 * JD-Core Version:    0.7.0.1
 */