package com.qinggan.provider;

import android.net.Uri;
import java.util.HashMap;
import m54207b69;

class QGSettings$NameValueCache
{
  public static final String[] OooO0o0;
  public final Uri OooO00o;
  public final HashMap OooO0O0;
  public long OooO0OO;
  public final String OooO0Oo;
  
  static
  {
    String str = m54207b69.F54207b69_11("M046525E4859");
    OooO0o0 = new String[] { str };
  }
  
  public QGSettings$NameValueCache(String paramString, Uri paramUri)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO0O0 = localHashMap;
    this.OooO0OO = 0L;
    this.OooO0Oo = paramString;
    this.OooO00o = paramUri;
  }
  
  /* Error */
  public String OooO00o(android.content.ContentResolver paramContentResolver, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +409 -> 410
    //   4: aload_0
    //   5: getfield 39	com/qinggan/provider/QGSettings$NameValueCache:OooO0Oo	Ljava/lang/String;
    //   8: astore_3
    //   9: lconst_0
    //   10: lstore 4
    //   12: aload_3
    //   13: lload 4
    //   15: invokestatic 46	com/qinggan/os/SystemProperties:OooO0o0	(Ljava/lang/String;J)J
    //   18: lstore 6
    //   20: aload_0
    //   21: monitorenter
    //   22: aload_0
    //   23: getfield 37	com/qinggan/provider/QGSettings$NameValueCache:OooO0OO	J
    //   26: lstore 8
    //   28: lload 8
    //   30: lload 6
    //   32: lcmp
    //   33: istore 10
    //   35: iload 10
    //   37: ifeq +20 -> 57
    //   40: aload_0
    //   41: getfield 35	com/qinggan/provider/QGSettings$NameValueCache:OooO0O0	Ljava/util/HashMap;
    //   44: astore 11
    //   46: aload 11
    //   48: invokevirtual 49	java/util/HashMap:clear	()V
    //   51: aload_0
    //   52: lload 6
    //   54: putfield 37	com/qinggan/provider/QGSettings$NameValueCache:OooO0OO	J
    //   57: aload_0
    //   58: getfield 35	com/qinggan/provider/QGSettings$NameValueCache:OooO0O0	Ljava/util/HashMap;
    //   61: astore_3
    //   62: aload_3
    //   63: aload_2
    //   64: invokevirtual 53	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   67: istore 12
    //   69: iload 12
    //   71: ifeq +23 -> 94
    //   74: aload_0
    //   75: getfield 35	com/qinggan/provider/QGSettings$NameValueCache:OooO0O0	Ljava/util/HashMap;
    //   78: astore_1
    //   79: aload_1
    //   80: aload_2
    //   81: invokevirtual 57	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   84: astore_1
    //   85: aload_1
    //   86: checkcast 24	java/lang/String
    //   89: astore_1
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_1
    //   93: areturn
    //   94: aload_0
    //   95: monitorexit
    //   96: iconst_0
    //   97: istore 12
    //   99: aconst_null
    //   100: astore_3
    //   101: aload_0
    //   102: getfield 41	com/qinggan/provider/QGSettings$NameValueCache:OooO00o	Landroid/net/Uri;
    //   105: astore 11
    //   107: getstatic 26	com/qinggan/provider/QGSettings$NameValueCache:OooO0o0	[Ljava/lang/String;
    //   110: astore 13
    //   112: ldc 59
    //   114: astore 14
    //   116: aload 14
    //   118: invokestatic 22	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   121: astore 14
    //   123: iconst_1
    //   124: anewarray 24	java/lang/String
    //   127: dup
    //   128: iconst_0
    //   129: aload_2
    //   130: aastore
    //   131: astore 15
    //   133: aload_1
    //   134: astore 16
    //   136: aload_1
    //   137: aload 11
    //   139: aload 13
    //   141: aload 14
    //   143: aload 15
    //   145: aconst_null
    //   146: aconst_null
    //   147: invokevirtual 65	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   150: astore_1
    //   151: aload_1
    //   152: ifnonnull +84 -> 236
    //   155: new 67	java/lang/StringBuilder
    //   158: astore 16
    //   160: aload 16
    //   162: invokespecial 68	java/lang/StringBuilder:<init>	()V
    //   165: ldc 70
    //   167: astore 11
    //   169: aload 11
    //   171: invokestatic 22	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   174: astore 11
    //   176: aload 16
    //   178: aload 11
    //   180: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: pop
    //   184: aload 16
    //   186: aload_2
    //   187: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: pop
    //   191: ldc 76
    //   193: astore 11
    //   195: aload 11
    //   197: invokestatic 22	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   200: astore 11
    //   202: aload 16
    //   204: aload 11
    //   206: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: pop
    //   210: aload_0
    //   211: getfield 41	com/qinggan/provider/QGSettings$NameValueCache:OooO00o	Landroid/net/Uri;
    //   214: astore 11
    //   216: aload 16
    //   218: aload 11
    //   220: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: aload_1
    //   225: ifnull +9 -> 234
    //   228: aload_1
    //   229: invokeinterface 84 1 0
    //   234: aconst_null
    //   235: areturn
    //   236: aload_1
    //   237: invokeinterface 88 1 0
    //   242: istore 17
    //   244: iload 17
    //   246: ifeq +21 -> 267
    //   249: iconst_0
    //   250: istore 17
    //   252: aconst_null
    //   253: astore 16
    //   255: aload_1
    //   256: iconst_0
    //   257: invokeinterface 92 2 0
    //   262: astore 16
    //   264: goto +9 -> 273
    //   267: iconst_0
    //   268: istore 17
    //   270: aconst_null
    //   271: astore 16
    //   273: aload_0
    //   274: monitorenter
    //   275: aload_0
    //   276: getfield 35	com/qinggan/provider/QGSettings$NameValueCache:OooO0O0	Ljava/util/HashMap;
    //   279: astore 11
    //   281: aload 11
    //   283: aload_2
    //   284: aload 16
    //   286: invokevirtual 96	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   289: pop
    //   290: aload_0
    //   291: monitorexit
    //   292: aload_1
    //   293: invokeinterface 84 1 0
    //   298: aload 16
    //   300: areturn
    //   301: astore 16
    //   303: aload_0
    //   304: monitorexit
    //   305: aload 16
    //   307: athrow
    //   308: astore_2
    //   309: goto +84 -> 393
    //   312: pop
    //   313: aconst_null
    //   314: astore_1
    //   315: new 67	java/lang/StringBuilder
    //   318: astore 16
    //   320: aload 16
    //   322: invokespecial 68	java/lang/StringBuilder:<init>	()V
    //   325: ldc 70
    //   327: astore 11
    //   329: aload 11
    //   331: invokestatic 22	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   334: astore 11
    //   336: aload 16
    //   338: aload 11
    //   340: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: pop
    //   344: aload 16
    //   346: aload_2
    //   347: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: pop
    //   351: ldc 76
    //   353: astore_2
    //   354: aload_2
    //   355: invokestatic 22	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   358: astore_2
    //   359: aload 16
    //   361: aload_2
    //   362: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: pop
    //   366: aload_0
    //   367: getfield 41	com/qinggan/provider/QGSettings$NameValueCache:OooO00o	Landroid/net/Uri;
    //   370: astore_2
    //   371: aload 16
    //   373: aload_2
    //   374: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   377: pop
    //   378: aload_1
    //   379: ifnull +9 -> 388
    //   382: aload_1
    //   383: invokeinterface 84 1 0
    //   388: aconst_null
    //   389: areturn
    //   390: astore_2
    //   391: aload_1
    //   392: astore_3
    //   393: aload_3
    //   394: ifnull +9 -> 403
    //   397: aload_3
    //   398: invokeinterface 84 1 0
    //   403: aload_2
    //   404: athrow
    //   405: astore_1
    //   406: aload_0
    //   407: monitorexit
    //   408: aload_1
    //   409: athrow
    //   410: new 98	java/lang/RuntimeException
    //   413: astore_1
    //   414: ldc 100
    //   416: invokestatic 22	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   419: astore_2
    //   420: aload_1
    //   421: aload_2
    //   422: invokespecial 103	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   425: aload_1
    //   426: athrow
    //   427: pop
    //   428: goto -113 -> 315
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	431	0	this	NameValueCache
    //   0	431	1	paramContentResolver	android.content.ContentResolver
    //   0	431	2	paramString	String
    //   8	390	3	localObject1	Object
    //   10	4	4	l1	long
    //   18	35	6	l2	long
    //   26	3	8	l3	long
    //   33	3	10	bool1	boolean
    //   44	295	11	localObject2	Object
    //   67	31	12	bool2	boolean
    //   110	30	13	arrayOfString1	String[]
    //   114	28	14	str	String
    //   131	13	15	arrayOfString2	String[]
    //   134	165	16	localObject3	Object
    //   301	5	16	localObject4	Object
    //   318	54	16	localStringBuilder	java.lang.StringBuilder
    //   242	27	17	bool3	boolean
    //   312	1	17	localException1	java.lang.Exception
    //   427	1	18	localException2	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   275	279	301	finally
    //   284	290	301	finally
    //   290	292	301	finally
    //   303	305	301	finally
    //   101	105	308	finally
    //   107	110	308	finally
    //   116	121	308	finally
    //   123	131	308	finally
    //   146	150	308	finally
    //   101	105	312	java/lang/Exception
    //   107	110	312	java/lang/Exception
    //   116	121	312	java/lang/Exception
    //   123	131	312	java/lang/Exception
    //   146	150	312	java/lang/Exception
    //   155	158	390	finally
    //   160	165	390	finally
    //   169	174	390	finally
    //   178	184	390	finally
    //   186	191	390	finally
    //   195	200	390	finally
    //   204	210	390	finally
    //   210	214	390	finally
    //   218	224	390	finally
    //   236	242	390	finally
    //   256	262	390	finally
    //   273	275	390	finally
    //   305	308	390	finally
    //   315	318	390	finally
    //   320	325	390	finally
    //   329	334	390	finally
    //   338	344	390	finally
    //   346	351	390	finally
    //   354	358	390	finally
    //   361	366	390	finally
    //   366	370	390	finally
    //   373	378	390	finally
    //   22	26	405	finally
    //   40	44	405	finally
    //   46	51	405	finally
    //   52	57	405	finally
    //   57	61	405	finally
    //   63	67	405	finally
    //   74	78	405	finally
    //   80	84	405	finally
    //   85	89	405	finally
    //   90	92	405	finally
    //   94	96	405	finally
    //   406	408	405	finally
    //   155	158	427	java/lang/Exception
    //   160	165	427	java/lang/Exception
    //   169	174	427	java/lang/Exception
    //   178	184	427	java/lang/Exception
    //   186	191	427	java/lang/Exception
    //   195	200	427	java/lang/Exception
    //   204	210	427	java/lang/Exception
    //   210	214	427	java/lang/Exception
    //   218	224	427	java/lang/Exception
    //   236	242	427	java/lang/Exception
    //   256	262	427	java/lang/Exception
    //   273	275	427	java/lang/Exception
    //   305	308	427	java/lang/Exception
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.provider.QGSettings.NameValueCache
 * JD-Core Version:    0.7.0.1
 */