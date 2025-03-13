package com.google.android.material.color;

final class ColorResourcesLoaderCreator
{
  private static final String TAG = "ColorResourcesLoaderCreator";
  
  /* Error */
  public static android.content.res.loader.ResourcesLoader create(android.content.Context paramContext, java.util.Map paramMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokestatic 19	com/google/android/material/color/ColorResourcesTableCreator:create	(Landroid/content/Context;Ljava/util/Map;)[B
    //   5: astore_0
    //   6: new 21	java/lang/StringBuilder
    //   9: astore_1
    //   10: aload_1
    //   11: invokespecial 22	java/lang/StringBuilder:<init>	()V
    //   14: ldc 24
    //   16: astore_2
    //   17: aload_2
    //   18: invokestatic 30	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   21: astore_2
    //   22: aload_1
    //   23: aload_2
    //   24: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: aload_0
    //   29: arraylength
    //   30: istore_3
    //   31: aload_1
    //   32: iload_3
    //   33: invokevirtual 37	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload_0
    //   38: arraylength
    //   39: istore 4
    //   41: iload 4
    //   43: ifne +5 -> 48
    //   46: aconst_null
    //   47: areturn
    //   48: ldc 39
    //   50: astore_1
    //   51: aload_1
    //   52: invokestatic 30	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   55: astore_1
    //   56: iconst_0
    //   57: istore_3
    //   58: aconst_null
    //   59: astore_2
    //   60: aload_1
    //   61: iconst_0
    //   62: invokestatic 45	com/google/android/material/color/OooO00o:OooO00o	(Ljava/lang/String;I)Ljava/io/FileDescriptor;
    //   65: astore_1
    //   66: new 47	java/io/FileOutputStream
    //   69: astore_2
    //   70: aload_2
    //   71: aload_1
    //   72: invokespecial 50	java/io/FileOutputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   75: aload_2
    //   76: aload_0
    //   77: invokevirtual 56	java/io/OutputStream:write	([B)V
    //   80: aload_1
    //   81: invokestatic 62	android/os/ParcelFileDescriptor:dup	(Ljava/io/FileDescriptor;)Landroid/os/ParcelFileDescriptor;
    //   84: astore_0
    //   85: invokestatic 66	com/google/android/material/color/OooO:OooO00o	()V
    //   88: invokestatic 71	com/google/android/material/color/OooO0o:OooO00o	()Landroid/content/res/loader/ResourcesLoader;
    //   91: astore 5
    //   93: aload_0
    //   94: aconst_null
    //   95: invokestatic 76	com/google/android/material/color/OooO0O0:OooO00o	(Landroid/os/ParcelFileDescriptor;Landroid/content/res/loader/AssetsProvider;)Landroid/content/res/loader/ResourcesProvider;
    //   98: astore 6
    //   100: aload 5
    //   102: aload 6
    //   104: invokestatic 81	com/google/android/material/color/OooO0OO:OooO00o	(Landroid/content/res/loader/ResourcesLoader;Landroid/content/res/loader/ResourcesProvider;)V
    //   107: aload_0
    //   108: ifnull +7 -> 115
    //   111: aload_0
    //   112: invokevirtual 84	android/os/ParcelFileDescriptor:close	()V
    //   115: aload_2
    //   116: invokevirtual 85	java/io/OutputStream:close	()V
    //   119: aload_1
    //   120: ifnull +7 -> 127
    //   123: aload_1
    //   124: invokestatic 89	android/system/Os:close	(Ljava/io/FileDescriptor;)V
    //   127: aload 5
    //   129: areturn
    //   130: astore 5
    //   132: aload_0
    //   133: ifnull +17 -> 150
    //   136: aload_0
    //   137: invokevirtual 84	android/os/ParcelFileDescriptor:close	()V
    //   140: goto +10 -> 150
    //   143: astore_0
    //   144: aload 5
    //   146: aload_0
    //   147: invokevirtual 95	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   150: aload 5
    //   152: athrow
    //   153: astore_0
    //   154: aload_2
    //   155: invokevirtual 85	java/io/OutputStream:close	()V
    //   158: goto +9 -> 167
    //   161: astore_2
    //   162: aload_0
    //   163: aload_2
    //   164: invokevirtual 95	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   167: aload_0
    //   168: athrow
    //   169: astore_0
    //   170: goto +9 -> 179
    //   173: astore_0
    //   174: iconst_0
    //   175: istore 4
    //   177: aconst_null
    //   178: astore_1
    //   179: aload_1
    //   180: ifnull +7 -> 187
    //   183: aload_1
    //   184: invokestatic 89	android/system/Os:close	(Ljava/io/FileDescriptor;)V
    //   187: aload_0
    //   188: athrow
    //   189: aconst_null
    //   190: areturn
    //   191: pop
    //   192: goto -3 -> 189
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	195	0	paramContext	android.content.Context
    //   0	195	1	paramMap	java.util.Map
    //   16	139	2	localObject1	Object
    //   161	3	2	localThrowable	java.lang.Throwable
    //   30	28	3	i	int
    //   39	137	4	j	int
    //   91	37	5	localResourcesLoader	android.content.res.loader.ResourcesLoader
    //   130	21	5	localObject2	Object
    //   98	5	6	localResourcesProvider	android.content.res.loader.ResourcesProvider
    //   191	1	9	localException	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   85	88	130	finally
    //   88	91	130	finally
    //   94	98	130	finally
    //   102	107	130	finally
    //   136	140	143	finally
    //   76	80	153	finally
    //   80	84	153	finally
    //   111	115	153	finally
    //   146	150	153	finally
    //   150	153	153	finally
    //   154	158	161	finally
    //   66	69	169	finally
    //   71	75	169	finally
    //   115	119	169	finally
    //   163	167	169	finally
    //   167	169	169	finally
    //   51	55	173	finally
    //   61	65	173	finally
    //   1	5	191	java/lang/Exception
    //   6	9	191	java/lang/Exception
    //   10	14	191	java/lang/Exception
    //   17	21	191	java/lang/Exception
    //   23	28	191	java/lang/Exception
    //   28	30	191	java/lang/Exception
    //   32	37	191	java/lang/Exception
    //   37	39	191	java/lang/Exception
    //   123	127	191	java/lang/Exception
    //   183	187	191	java/lang/Exception
    //   187	189	191	java/lang/Exception
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.ColorResourcesLoaderCreator
 * JD-Core Version:    0.7.0.1
 */