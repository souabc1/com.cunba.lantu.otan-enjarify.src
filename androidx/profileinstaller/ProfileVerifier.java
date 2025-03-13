package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;

public final class ProfileVerifier
{
  public static final ResolvableFuture OooO00o = ;
  public static final Object OooO0O0;
  public static ProfileVerifier.CompilationStatus OooO0OO = null;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0O0 = localObject;
  }
  
  public static long OooO00o(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getApplicationContext().getPackageManager();
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j) {}
    for (paramContext = ProfileVerifier.Api33Impl.OooO00o(localPackageManager, paramContext);; paramContext = localPackageManager.getPackageInfo(paramContext, 0))
    {
      return paramContext.lastUpdateTime;
      paramContext = paramContext.getPackageName();
      i = 0;
    }
  }
  
  public static ProfileVerifier.CompilationStatus OooO0O0(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    ProfileVerifier.CompilationStatus localCompilationStatus = new androidx/profileinstaller/ProfileVerifier$CompilationStatus;
    localCompilationStatus.<init>(paramInt, paramBoolean1, paramBoolean2);
    OooO0OO = localCompilationStatus;
    OooO00o.OooOOOO(localCompilationStatus);
    return OooO0OO;
  }
  
  /* Error */
  public static ProfileVerifier.CompilationStatus OooO0OO(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: iload_1
    //   1: ifne +13 -> 14
    //   4: getstatic 26	androidx/profileinstaller/ProfileVerifier:OooO0OO	Landroidx/profileinstaller/ProfileVerifier$CompilationStatus;
    //   7: astore_2
    //   8: aload_2
    //   9: ifnull +5 -> 14
    //   12: aload_2
    //   13: areturn
    //   14: getstatic 24	androidx/profileinstaller/ProfileVerifier:OooO0O0	Ljava/lang/Object;
    //   17: astore_3
    //   18: aload_3
    //   19: monitorenter
    //   20: iload_1
    //   21: ifne +15 -> 36
    //   24: getstatic 26	androidx/profileinstaller/ProfileVerifier:OooO0OO	Landroidx/profileinstaller/ProfileVerifier$CompilationStatus;
    //   27: astore_2
    //   28: aload_2
    //   29: ifnull +7 -> 36
    //   32: aload_3
    //   33: monitorexit
    //   34: aload_2
    //   35: areturn
    //   36: getstatic 42	android/os/Build$VERSION:SDK_INT	I
    //   39: istore 4
    //   41: bipush 30
    //   43: istore 5
    //   45: iconst_0
    //   46: istore 6
    //   48: iload 4
    //   50: iload 5
    //   52: if_icmpne +19 -> 71
    //   55: ldc 75
    //   57: istore 4
    //   59: iload 4
    //   61: iconst_0
    //   62: iconst_0
    //   63: invokestatic 79	androidx/profileinstaller/ProfileVerifier:OooO0O0	(IZZ)Landroidx/profileinstaller/ProfileVerifier$CompilationStatus;
    //   66: astore_2
    //   67: aload_3
    //   68: monitorexit
    //   69: aload_2
    //   70: areturn
    //   71: new 81	java/io/File
    //   74: astore_2
    //   75: new 81	java/io/File
    //   78: astore 7
    //   80: ldc 83
    //   82: astore 8
    //   84: aload_0
    //   85: invokevirtual 58	android/content/Context:getPackageName	()Ljava/lang/String;
    //   88: astore 9
    //   90: aload 7
    //   92: aload 8
    //   94: aload 9
    //   96: invokespecial 86	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   99: ldc 88
    //   101: astore 8
    //   103: aload_2
    //   104: aload 7
    //   106: aload 8
    //   108: invokespecial 91	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   111: aload_2
    //   112: invokevirtual 95	java/io/File:length	()J
    //   115: lstore 10
    //   117: aload_2
    //   118: invokevirtual 99	java/io/File:exists	()Z
    //   121: istore 4
    //   123: lconst_0
    //   124: lstore 12
    //   126: iconst_1
    //   127: istore 5
    //   129: iload 4
    //   131: ifeq +22 -> 153
    //   134: lload 10
    //   136: lload 12
    //   138: lcmp
    //   139: istore 4
    //   141: iload 4
    //   143: ifle +10 -> 153
    //   146: iload 5
    //   148: istore 4
    //   150: goto +8 -> 158
    //   153: iconst_0
    //   154: istore 4
    //   156: aconst_null
    //   157: astore_2
    //   158: new 81	java/io/File
    //   161: astore 14
    //   163: new 81	java/io/File
    //   166: astore 15
    //   168: ldc 102
    //   170: astore 16
    //   172: aload_0
    //   173: invokevirtual 58	android/content/Context:getPackageName	()Ljava/lang/String;
    //   176: astore 17
    //   178: aload 15
    //   180: aload 16
    //   182: aload 17
    //   184: invokespecial 86	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   187: ldc 88
    //   189: astore 16
    //   191: aload 14
    //   193: aload 15
    //   195: aload 16
    //   197: invokespecial 91	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   200: aload 14
    //   202: invokevirtual 95	java/io/File:length	()J
    //   205: lstore 18
    //   207: aload 14
    //   209: invokevirtual 99	java/io/File:exists	()Z
    //   212: istore 20
    //   214: iload 20
    //   216: ifeq +22 -> 238
    //   219: lload 18
    //   221: lload 12
    //   223: lcmp
    //   224: istore 21
    //   226: iload 21
    //   228: ifle +10 -> 238
    //   231: iload 5
    //   233: istore 21
    //   235: goto +6 -> 241
    //   238: iconst_0
    //   239: istore 21
    //   241: aload_0
    //   242: invokestatic 105	androidx/profileinstaller/ProfileVerifier:OooO00o	(Landroid/content/Context;)J
    //   245: lstore 22
    //   247: new 81	java/io/File
    //   250: astore 24
    //   252: aload_0
    //   253: invokevirtual 109	android/content/Context:getFilesDir	()Ljava/io/File;
    //   256: astore 14
    //   258: ldc 111
    //   260: astore 15
    //   262: aload 24
    //   264: aload 14
    //   266: aload 15
    //   268: invokespecial 91	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   271: aload 24
    //   273: invokevirtual 99	java/io/File:exists	()Z
    //   276: istore 20
    //   278: iload 20
    //   280: ifeq +32 -> 312
    //   283: aload 24
    //   285: invokestatic 116	androidx/profileinstaller/ProfileVerifier$Cache:OooO00o	(Ljava/io/File;)Landroidx/profileinstaller/ProfileVerifier$Cache;
    //   288: astore 14
    //   290: goto +28 -> 318
    //   293: pop
    //   294: ldc 117
    //   296: istore 5
    //   298: iload 5
    //   300: iload 4
    //   302: iload 21
    //   304: invokestatic 79	androidx/profileinstaller/ProfileVerifier:OooO0O0	(IZZ)Landroidx/profileinstaller/ProfileVerifier$CompilationStatus;
    //   307: astore_2
    //   308: aload_3
    //   309: monitorexit
    //   310: aload_2
    //   311: areturn
    //   312: iconst_0
    //   313: istore 20
    //   315: aconst_null
    //   316: astore 14
    //   318: iconst_2
    //   319: istore 25
    //   321: aload 14
    //   323: ifnull +46 -> 369
    //   326: aload 14
    //   328: getfield 121	androidx/profileinstaller/ProfileVerifier$Cache:OooO0OO	J
    //   331: lstore 26
    //   333: lload 26
    //   335: lload 22
    //   337: lcmp
    //   338: istore 28
    //   340: iload 28
    //   342: ifne +27 -> 369
    //   345: aload 14
    //   347: getfield 123	androidx/profileinstaller/ProfileVerifier$Cache:OooO0O0	I
    //   350: istore 28
    //   352: iload 28
    //   354: iload 25
    //   356: if_icmpne +6 -> 362
    //   359: goto +10 -> 369
    //   362: iload 28
    //   364: istore 6
    //   366: goto +24 -> 390
    //   369: iload 4
    //   371: ifeq +10 -> 381
    //   374: iload 5
    //   376: istore 6
    //   378: goto +12 -> 390
    //   381: iload 21
    //   383: ifeq +7 -> 390
    //   386: iload 25
    //   388: istore 6
    //   390: iload_1
    //   391: ifeq +19 -> 410
    //   394: iload 21
    //   396: ifeq +14 -> 410
    //   399: iload 6
    //   401: iload 5
    //   403: if_icmpeq +7 -> 410
    //   406: iload 25
    //   408: istore 6
    //   410: aload 14
    //   412: ifnull +46 -> 458
    //   415: aload 14
    //   417: getfield 123	androidx/profileinstaller/ProfileVerifier$Cache:OooO0O0	I
    //   420: istore 28
    //   422: iload 28
    //   424: iload 25
    //   426: if_icmpne +32 -> 458
    //   429: iload 6
    //   431: iload 5
    //   433: if_icmpne +25 -> 458
    //   436: aload 14
    //   438: getfield 126	androidx/profileinstaller/ProfileVerifier$Cache:OooO0Oo	J
    //   441: lstore 29
    //   443: lload 10
    //   445: lload 29
    //   447: lcmp
    //   448: istore 5
    //   450: iload 5
    //   452: ifge +6 -> 458
    //   455: iconst_3
    //   456: istore 6
    //   458: new 113	androidx/profileinstaller/ProfileVerifier$Cache
    //   461: astore 7
    //   463: iconst_1
    //   464: istore 31
    //   466: aload 7
    //   468: astore 17
    //   470: aload 7
    //   472: iload 31
    //   474: iload 6
    //   476: lload 22
    //   478: lload 18
    //   480: invokespecial 130	androidx/profileinstaller/ProfileVerifier$Cache:<init>	(IIJJ)V
    //   483: aload 14
    //   485: ifnull +17 -> 502
    //   488: aload 14
    //   490: aload 7
    //   492: invokevirtual 133	androidx/profileinstaller/ProfileVerifier$Cache:equals	(Ljava/lang/Object;)Z
    //   495: istore 32
    //   497: iload 32
    //   499: ifne +18 -> 517
    //   502: aload 7
    //   504: aload 24
    //   506: invokevirtual 136	androidx/profileinstaller/ProfileVerifier$Cache:OooO0O0	(Ljava/io/File;)V
    //   509: goto +8 -> 517
    //   512: pop
    //   513: ldc 137
    //   515: istore 6
    //   517: iload 6
    //   519: iload 4
    //   521: iload 21
    //   523: invokestatic 79	androidx/profileinstaller/ProfileVerifier:OooO0O0	(IZZ)Landroidx/profileinstaller/ProfileVerifier$CompilationStatus;
    //   526: astore_2
    //   527: aload_3
    //   528: monitorexit
    //   529: aload_2
    //   530: areturn
    //   531: pop
    //   532: ldc 139
    //   534: istore 5
    //   536: iload 5
    //   538: iload 4
    //   540: iload 21
    //   542: invokestatic 79	androidx/profileinstaller/ProfileVerifier:OooO0O0	(IZZ)Landroidx/profileinstaller/ProfileVerifier$CompilationStatus;
    //   545: astore_2
    //   546: aload_3
    //   547: monitorexit
    //   548: aload_2
    //   549: areturn
    //   550: astore_2
    //   551: aload_3
    //   552: monitorexit
    //   553: aload_2
    //   554: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	555	0	paramContext	Context
    //   0	555	1	paramBoolean	boolean
    //   7	542	2	localObject1	Object
    //   550	4	2	localObject2	Object
    //   17	535	3	localObject3	Object
    //   39	21	4	i	int
    //   121	418	4	bool1	boolean
    //   43	391	5	j	int
    //   448	3	5	bool2	boolean
    //   534	3	5	k	int
    //   46	472	6	m	int
    //   78	425	7	localObject4	Object
    //   82	25	8	str1	java.lang.String
    //   88	7	9	str2	java.lang.String
    //   115	329	10	l1	long
    //   124	98	12	l2	long
    //   161	328	14	localObject5	Object
    //   166	101	15	localObject6	Object
    //   170	26	16	str3	java.lang.String
    //   176	293	17	localObject7	Object
    //   205	274	18	l3	long
    //   212	102	20	bool3	boolean
    //   224	317	21	bool4	boolean
    //   245	232	22	l4	long
    //   250	255	24	localFile	java.io.File
    //   319	108	25	n	int
    //   331	3	26	l5	long
    //   338	3	28	bool5	boolean
    //   350	77	28	i1	int
    //   441	5	29	l6	long
    //   464	9	31	i2	int
    //   293	1	32	localIOException1	java.io.IOException
    //   495	3	32	bool6	boolean
    //   512	1	33	localIOException2	java.io.IOException
    //   531	1	34	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    // Exception table:
    //   from	to	target	type
    //   283	288	293	java/io/IOException
    //   504	509	512	java/io/IOException
    //   241	245	531	android/content/pm/PackageManager$NameNotFoundException
    //   24	27	550	finally
    //   32	34	550	finally
    //   36	39	550	finally
    //   62	66	550	finally
    //   67	69	550	finally
    //   71	74	550	finally
    //   75	78	550	finally
    //   84	88	550	finally
    //   94	99	550	finally
    //   106	111	550	finally
    //   111	115	550	finally
    //   117	121	550	finally
    //   158	161	550	finally
    //   163	166	550	finally
    //   172	176	550	finally
    //   182	187	550	finally
    //   195	200	550	finally
    //   200	205	550	finally
    //   207	212	550	finally
    //   241	245	550	finally
    //   247	250	550	finally
    //   252	256	550	finally
    //   266	271	550	finally
    //   271	276	550	finally
    //   283	288	550	finally
    //   302	307	550	finally
    //   308	310	550	finally
    //   326	331	550	finally
    //   345	350	550	finally
    //   415	420	550	finally
    //   436	441	550	finally
    //   458	461	550	finally
    //   478	483	550	finally
    //   490	495	550	finally
    //   504	509	550	finally
    //   521	526	550	finally
    //   527	529	550	finally
    //   540	545	550	finally
    //   546	548	550	finally
    //   551	553	550	finally
  }
  
  public static ListenableFuture getCompilationStatusAsync()
  {
    return OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.profileinstaller.ProfileVerifier
 * JD-Core Version:    0.7.0.1
 */