package androidx.core.graphics;

import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TypefaceCompatApi21Impl
  extends TypefaceCompatBaseImpl
{
  public static Class OooO0O0;
  public static Constructor OooO0OO;
  public static Method OooO0Oo;
  public static boolean OooO0o = false;
  public static Method OooO0o0;
  
  public static boolean OooOO0O(Object paramObject, String paramString, int paramInt, boolean paramBoolean)
  {
    
    try
    {
      Method localMethod = OooO0Oo;
      int i = 3;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString;
      paramString = Integer.valueOf(paramInt);
      paramInt = 1;
      arrayOfObject[paramInt] = paramString;
      paramString = Boolean.valueOf(paramBoolean);
      paramInt = 2;
      arrayOfObject[paramInt] = paramString;
      paramObject = localMethod.invoke(paramObject, arrayOfObject);
      paramObject = (Boolean)paramObject;
      return paramObject.booleanValue();
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    paramString = new java/lang/RuntimeException;
    paramString.<init>(paramObject);
    throw paramString;
  }
  
  public static Typeface OooOO0o(Object paramObject)
  {
    
    try
    {
      localObject = OooO0O0;
      int i = 1;
      localObject = Array.newInstance((Class)localObject, i);
      i = 0;
      Array.set(localObject, 0, paramObject);
      paramObject = OooO0o0;
      localObject = new Object[] { localObject };
      i = 0;
      paramObject = paramObject.invoke(null, (Object[])localObject);
      return (Typeface)paramObject;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    Object localObject = new java/lang/RuntimeException;
    ((RuntimeException)localObject).<init>(paramObject);
    throw ((Throwable)localObject);
  }
  
  public static void OooOOO()
  {
    int i = OooO0o;
    if (i != 0) {
      return;
    }
    i = 1;
    OooO0o = i;
    Object localObject1 = "android.graphics.FontFamily";
    Object localObject2;
    Object localObject3;
    Object localObject6;
    try
    {
      localObject1 = Class.forName((String)localObject1);
      localObject2 = new Class[0];
      localObject2 = ((Class)localObject1).getConstructor((Class[])localObject2);
      localObject3 = "addFontWeightStyle";
      int k = 3;
      Object localObject4 = new Class[k];
      Object localObject5 = String.class;
      localObject4[0] = localObject5;
      localObject5 = Integer.TYPE;
      localObject4[i] = localObject5;
      localObject5 = Boolean.TYPE;
      int m = 2;
      localObject4[m] = localObject5;
      localObject3 = ((Class)localObject1).getMethod((String)localObject3, (Class[])localObject4);
      localObject4 = Array.newInstance((Class)localObject1, i);
      localObject5 = Typeface.class;
      String str = "createFromFamiliesWithDefault";
      localObject6 = new Class[i];
      localObject4 = localObject4.getClass();
      localObject6[0] = localObject4;
      localObject6 = ((Class)localObject5).getMethod(str, (Class[])localObject6);
    }
    catch (ClassNotFoundException|NoSuchMethodException localClassNotFoundException)
    {
      localObject1 = null;
      int j = 0;
      localObject6 = null;
      localObject2 = null;
      localObject3 = null;
    }
    OooO0OO = (Constructor)localObject2;
    OooO0O0 = (Class)localObject1;
    OooO0Oo = (Method)localObject3;
    OooO0o0 = (Method)localObject6;
  }
  
  public static Object OooOOOO()
  {
    
    try
    {
      Constructor localConstructor = OooO0OO;
      localObject = null;
      localObject = new Object[0];
      return localConstructor.newInstance((Object[])localObject);
    }
    catch (InvocationTargetException localInvocationTargetException) {}catch (InstantiationException localInstantiationException) {}catch (IllegalAccessException localIllegalAccessException) {}
    Object localObject = new java/lang/RuntimeException;
    ((RuntimeException)localObject).<init>(localIllegalAccessException);
    throw ((Throwable)localObject);
  }
  
  /* Error */
  public Typeface OooO0O0(android.content.Context paramContext, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry paramFontFamilyFilesResourceEntry, android.content.res.Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 124	androidx/core/graphics/TypefaceCompatApi21Impl:OooOOOO	()Ljava/lang/Object;
    //   3: astore 5
    //   5: aload_2
    //   6: invokevirtual 130	androidx/core/content/res/FontResourcesParserCompat$FontFamilyFilesResourceEntry:getEntries	()[Landroidx/core/content/res/FontResourcesParserCompat$FontFileResourceEntry;
    //   9: astore_2
    //   10: aload_2
    //   11: arraylength
    //   12: istore 6
    //   14: iconst_0
    //   15: istore 7
    //   17: iload 7
    //   19: iload 6
    //   21: if_icmpge +126 -> 147
    //   24: aload_2
    //   25: iload 7
    //   27: aaload
    //   28: astore 8
    //   30: aload_1
    //   31: invokestatic 135	androidx/core/graphics/TypefaceCompatUtil:OooO0o0	(Landroid/content/Context;)Ljava/io/File;
    //   34: astore 9
    //   36: aload 9
    //   38: ifnonnull +5 -> 43
    //   41: aconst_null
    //   42: areturn
    //   43: aload 8
    //   45: invokevirtual 141	androidx/core/content/res/FontResourcesParserCompat$FontFileResourceEntry:getResourceId	()I
    //   48: istore 10
    //   50: aload 9
    //   52: aload_3
    //   53: iload 10
    //   55: invokestatic 144	androidx/core/graphics/TypefaceCompatUtil:OooO0OO	(Ljava/io/File;Landroid/content/res/Resources;I)Z
    //   58: istore 10
    //   60: iload 10
    //   62: ifne +11 -> 73
    //   65: aload 9
    //   67: invokevirtual 149	java/io/File:delete	()Z
    //   70: pop
    //   71: aconst_null
    //   72: areturn
    //   73: aload 9
    //   75: invokevirtual 153	java/io/File:getPath	()Ljava/lang/String;
    //   78: astore 11
    //   80: aload 8
    //   82: invokevirtual 156	androidx/core/content/res/FontResourcesParserCompat$FontFileResourceEntry:getWeight	()I
    //   85: istore 12
    //   87: aload 8
    //   89: invokevirtual 159	androidx/core/content/res/FontResourcesParserCompat$FontFileResourceEntry:isItalic	()Z
    //   92: istore 13
    //   94: aload 5
    //   96: aload 11
    //   98: iload 12
    //   100: iload 13
    //   102: invokestatic 163	androidx/core/graphics/TypefaceCompatApi21Impl:OooOO0O	(Ljava/lang/Object;Ljava/lang/String;IZ)Z
    //   105: istore 13
    //   107: aload 9
    //   109: invokevirtual 149	java/io/File:delete	()Z
    //   112: pop
    //   113: iload 13
    //   115: ifne +5 -> 120
    //   118: aconst_null
    //   119: areturn
    //   120: iload 7
    //   122: iconst_1
    //   123: iadd
    //   124: istore 7
    //   126: goto -109 -> 17
    //   129: astore_1
    //   130: aload 9
    //   132: invokevirtual 149	java/io/File:delete	()Z
    //   135: pop
    //   136: aload_1
    //   137: athrow
    //   138: pop
    //   139: aload 9
    //   141: invokevirtual 149	java/io/File:delete	()Z
    //   144: pop
    //   145: aconst_null
    //   146: areturn
    //   147: aload 5
    //   149: invokestatic 167	androidx/core/graphics/TypefaceCompatApi21Impl:OooOO0o	(Ljava/lang/Object;)Landroid/graphics/Typeface;
    //   152: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	153	0	this	TypefaceCompatApi21Impl
    //   0	153	1	paramContext	android.content.Context
    //   0	153	2	paramFontFamilyFilesResourceEntry	androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry
    //   0	153	3	paramResources	android.content.res.Resources
    //   0	153	4	paramInt	int
    //   3	145	5	localObject1	Object
    //   12	10	6	i	int
    //   15	110	7	j	int
    //   28	60	8	localObject2	Object
    //   34	106	9	localFile	File
    //   48	6	10	k	int
    //   58	3	10	bool1	boolean
    //   78	19	11	str	String
    //   85	14	12	m	int
    //   92	22	13	bool2	boolean
    //   138	1	15	localRuntimeException	RuntimeException
    // Exception table:
    //   from	to	target	type
    //   43	48	129	finally
    //   53	58	129	finally
    //   73	78	129	finally
    //   80	85	129	finally
    //   87	92	129	finally
    //   100	105	129	finally
    //   43	48	138	java/lang/RuntimeException
    //   53	58	138	java/lang/RuntimeException
    //   73	78	138	java/lang/RuntimeException
    //   80	85	138	java/lang/RuntimeException
    //   87	92	138	java/lang/RuntimeException
    //   100	105	138	java/lang/RuntimeException
  }
  
  /* Error */
  public Typeface OooO0OO(android.content.Context paramContext, android.os.CancellationSignal paramCancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: istore 5
    //   4: iconst_1
    //   5: istore 6
    //   7: iload 5
    //   9: iload 6
    //   11: if_icmpge +5 -> 16
    //   14: aconst_null
    //   15: areturn
    //   16: aload_0
    //   17: aload_3
    //   18: iload 4
    //   20: invokevirtual 171	androidx/core/graphics/TypefaceCompatBaseImpl:OooO	([Landroidx/core/provider/FontsContractCompat$FontInfo;I)Landroidx/core/provider/FontsContractCompat$FontInfo;
    //   23: astore_3
    //   24: aload_1
    //   25: invokevirtual 177	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   28: astore 7
    //   30: aload_3
    //   31: invokevirtual 183	androidx/core/provider/FontsContractCompat$FontInfo:getUri	()Landroid/net/Uri;
    //   34: astore_3
    //   35: ldc 185
    //   37: astore 8
    //   39: aload 7
    //   41: aload_3
    //   42: aload 8
    //   44: aload_2
    //   45: invokevirtual 191	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   48: astore_2
    //   49: aload_2
    //   50: ifnonnull +13 -> 63
    //   53: aload_2
    //   54: ifnull +7 -> 61
    //   57: aload_2
    //   58: invokevirtual 196	android/os/ParcelFileDescriptor:close	()V
    //   61: aconst_null
    //   62: areturn
    //   63: aload_0
    //   64: aload_2
    //   65: invokevirtual 200	androidx/core/graphics/TypefaceCompatApi21Impl:OooOOO0	(Landroid/os/ParcelFileDescriptor;)Ljava/io/File;
    //   68: astore_3
    //   69: aload_3
    //   70: ifnull +28 -> 98
    //   73: aload_3
    //   74: invokevirtual 203	java/io/File:canRead	()Z
    //   77: istore 4
    //   79: iload 4
    //   81: ifne +6 -> 87
    //   84: goto +14 -> 98
    //   87: aload_3
    //   88: invokestatic 207	android/graphics/Typeface:createFromFile	(Ljava/io/File;)Landroid/graphics/Typeface;
    //   91: astore_1
    //   92: aload_2
    //   93: invokevirtual 196	android/os/ParcelFileDescriptor:close	()V
    //   96: aload_1
    //   97: areturn
    //   98: new 209	java/io/FileInputStream
    //   101: astore_3
    //   102: aload_2
    //   103: invokevirtual 213	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   106: astore 7
    //   108: aload_3
    //   109: aload 7
    //   111: invokespecial 216	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   114: aload_0
    //   115: aload_1
    //   116: aload_3
    //   117: invokespecial 219	androidx/core/graphics/TypefaceCompatBaseImpl:OooO0Oo	(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   120: astore_1
    //   121: aload_3
    //   122: invokevirtual 220	java/io/FileInputStream:close	()V
    //   125: aload_2
    //   126: invokevirtual 196	android/os/ParcelFileDescriptor:close	()V
    //   129: aload_1
    //   130: areturn
    //   131: astore_1
    //   132: aload_3
    //   133: invokevirtual 220	java/io/FileInputStream:close	()V
    //   136: goto +9 -> 145
    //   139: astore_3
    //   140: aload_1
    //   141: aload_3
    //   142: invokevirtual 225	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   145: aload_1
    //   146: athrow
    //   147: astore_1
    //   148: aload_2
    //   149: invokevirtual 196	android/os/ParcelFileDescriptor:close	()V
    //   152: goto +9 -> 161
    //   155: astore_2
    //   156: aload_1
    //   157: aload_2
    //   158: invokevirtual 225	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   161: aload_1
    //   162: athrow
    //   163: aconst_null
    //   164: areturn
    //   165: pop
    //   166: goto -3 -> 163
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	this	TypefaceCompatApi21Impl
    //   0	169	1	paramContext	android.content.Context
    //   0	169	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	169	3	paramArrayOfFontInfo	androidx.core.provider.FontsContractCompat.FontInfo[]
    //   0	169	4	paramInt	int
    //   2	10	5	i	int
    //   5	7	6	j	int
    //   28	82	7	localObject	Object
    //   37	6	8	str	String
    //   165	1	9	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   116	120	131	finally
    //   132	136	139	finally
    //   64	68	147	finally
    //   73	77	147	finally
    //   87	91	147	finally
    //   98	101	147	finally
    //   102	106	147	finally
    //   109	114	147	finally
    //   121	125	147	finally
    //   141	145	147	finally
    //   145	147	147	finally
    //   148	152	155	finally
    //   30	34	165	java/io/IOException
    //   44	48	165	java/io/IOException
    //   57	61	165	java/io/IOException
    //   92	96	165	java/io/IOException
    //   125	129	165	java/io/IOException
    //   157	161	165	java/io/IOException
    //   161	163	165	java/io/IOException
  }
  
  public final File OooOOO0(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "/proc/self/fd/";
      ((StringBuilder)localObject).append(str);
      int i = paramParcelFileDescriptor.getFd();
      ((StringBuilder)localObject).append(i);
      paramParcelFileDescriptor = ((StringBuilder)localObject).toString();
      paramParcelFileDescriptor = Os.readlink(paramParcelFileDescriptor);
      localObject = Os.stat(paramParcelFileDescriptor);
      int j = ((StructStat)localObject).st_mode;
      boolean bool = OsConstants.S_ISREG(j);
      if (bool)
      {
        localObject = new java/io/File;
        ((File)localObject).<init>(paramParcelFileDescriptor);
        return localObject;
      }
    }
    catch (ErrnoException localErrnoException) {}
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.TypefaceCompatApi21Impl
 * JD-Core Version:    0.7.0.1
 */