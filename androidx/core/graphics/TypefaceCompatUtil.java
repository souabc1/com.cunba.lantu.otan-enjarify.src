package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Process;
import androidx.core.provider.FontsContractCompat.FontInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TypefaceCompatUtil
{
  public static void OooO00o(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      label10:
      return;
    }
    catch (IOException localIOException)
    {
      break label10;
    }
  }
  
  public static ByteBuffer OooO0O0(Context paramContext, Resources paramResources, int paramInt)
  {
    paramContext = OooO0o0(paramContext);
    if (paramContext == null) {
      return null;
    }
    try
    {
      boolean bool = OooO0OO(paramContext, paramResources, paramInt);
      if (!bool) {
        return null;
      }
      paramResources = OooO0oO(paramContext);
      return paramResources;
    }
    finally
    {
      paramContext.delete();
    }
  }
  
  /* Error */
  public static boolean OooO0OO(File paramFile, Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: iload_2
    //   2: invokevirtual 39	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   5: astore_1
    //   6: aload_0
    //   7: aload_1
    //   8: invokestatic 43	androidx/core/graphics/TypefaceCompatUtil:OooO0Oo	(Ljava/io/File;Ljava/io/InputStream;)Z
    //   11: istore_3
    //   12: aload_1
    //   13: invokestatic 47	androidx/core/graphics/TypefaceCompatUtil:OooO00o	(Ljava/io/Closeable;)V
    //   16: iload_3
    //   17: ireturn
    //   18: astore_0
    //   19: goto +6 -> 25
    //   22: astore_0
    //   23: aconst_null
    //   24: astore_1
    //   25: aload_1
    //   26: invokestatic 47	androidx/core/graphics/TypefaceCompatUtil:OooO00o	(Ljava/io/Closeable;)V
    //   29: aload_0
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	paramFile	File
    //   0	31	1	paramResources	Resources
    //   0	31	2	paramInt	int
    //   11	6	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   7	11	18	finally
    //   1	5	22	finally
  }
  
  /* Error */
  public static boolean OooO0Oo(File paramFile, java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: invokestatic 53	android/os/StrictMode:allowThreadDiskWrites	()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: new 55	java/io/FileOutputStream
    //   12: astore 5
    //   14: aload 5
    //   16: aload_0
    //   17: iconst_0
    //   18: invokespecial 58	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   21: sipush 1024
    //   24: istore 6
    //   26: iload 6
    //   28: newarray byte
    //   30: astore_0
    //   31: aload_1
    //   32: aload_0
    //   33: invokevirtual 65	java/io/InputStream:read	([B)I
    //   36: istore_3
    //   37: iconst_m1
    //   38: istore 7
    //   40: iload_3
    //   41: iload 7
    //   43: if_icmpeq +14 -> 57
    //   46: aload 5
    //   48: aload_0
    //   49: iconst_0
    //   50: iload_3
    //   51: invokevirtual 69	java/io/FileOutputStream:write	([BII)V
    //   54: goto -23 -> 31
    //   57: aload 5
    //   59: invokestatic 47	androidx/core/graphics/TypefaceCompatUtil:OooO00o	(Ljava/io/Closeable;)V
    //   62: aload_2
    //   63: invokestatic 73	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   66: iconst_1
    //   67: ireturn
    //   68: astore_0
    //   69: aload 5
    //   71: astore 4
    //   73: goto +57 -> 130
    //   76: astore_0
    //   77: aload 5
    //   79: astore 4
    //   81: goto +8 -> 89
    //   84: astore_0
    //   85: goto +45 -> 130
    //   88: astore_0
    //   89: new 76	java/lang/StringBuilder
    //   92: astore_1
    //   93: aload_1
    //   94: invokespecial 77	java/lang/StringBuilder:<init>	()V
    //   97: ldc 79
    //   99: astore 5
    //   101: aload_1
    //   102: aload 5
    //   104: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload_0
    //   109: invokevirtual 89	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   112: astore_0
    //   113: aload_1
    //   114: aload_0
    //   115: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: pop
    //   119: aload 4
    //   121: invokestatic 47	androidx/core/graphics/TypefaceCompatUtil:OooO00o	(Ljava/io/Closeable;)V
    //   124: aload_2
    //   125: invokestatic 73	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   128: iconst_0
    //   129: ireturn
    //   130: aload 4
    //   132: invokestatic 47	androidx/core/graphics/TypefaceCompatUtil:OooO00o	(Ljava/io/Closeable;)V
    //   135: aload_2
    //   136: invokestatic 73	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   139: aload_0
    //   140: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	paramFile	File
    //   0	141	1	paramInputStream	java.io.InputStream
    //   3	133	2	localThreadPolicy	android.os.StrictMode.ThreadPolicy
    //   5	46	3	i	int
    //   7	124	4	localObject1	Object
    //   12	91	5	localObject2	Object
    //   24	3	6	j	int
    //   38	6	7	k	int
    // Exception table:
    //   from	to	target	type
    //   26	30	68	finally
    //   32	36	68	finally
    //   50	54	68	finally
    //   26	30	76	java/io/IOException
    //   32	36	76	java/io/IOException
    //   50	54	76	java/io/IOException
    //   9	12	84	finally
    //   17	21	84	finally
    //   89	92	84	finally
    //   93	97	84	finally
    //   102	108	84	finally
    //   108	112	84	finally
    //   114	119	84	finally
    //   9	12	88	java/io/IOException
    //   17	21	88	java/io/IOException
  }
  
  /* Error */
  public static ByteBuffer OooO0o(Context paramContext, CancellationSignal paramCancellationSignal, Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 95	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_0
    //   5: ldc 97
    //   7: astore_3
    //   8: aload_0
    //   9: aload_2
    //   10: aload_3
    //   11: aload_1
    //   12: invokestatic 102	androidx/core/graphics/TypefaceCompatUtil$Api19Impl:OooO00o	(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   15: astore_0
    //   16: aload_0
    //   17: ifnonnull +13 -> 30
    //   20: aload_0
    //   21: ifnull +7 -> 28
    //   24: aload_0
    //   25: invokevirtual 105	android/os/ParcelFileDescriptor:close	()V
    //   28: aconst_null
    //   29: areturn
    //   30: new 107	java/io/FileInputStream
    //   33: astore_1
    //   34: aload_0
    //   35: invokevirtual 111	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   38: astore_2
    //   39: aload_1
    //   40: aload_2
    //   41: invokespecial 114	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   44: aload_1
    //   45: invokevirtual 118	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   48: astore_3
    //   49: aload_3
    //   50: invokevirtual 124	java/nio/channels/FileChannel:size	()J
    //   53: lstore 4
    //   55: getstatic 130	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   58: astore 6
    //   60: lconst_0
    //   61: lstore 7
    //   63: aload_3
    //   64: aload 6
    //   66: lload 7
    //   68: lload 4
    //   70: invokevirtual 134	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   73: astore_2
    //   74: aload_1
    //   75: invokevirtual 135	java/io/FileInputStream:close	()V
    //   78: aload_0
    //   79: invokevirtual 105	android/os/ParcelFileDescriptor:close	()V
    //   82: aload_2
    //   83: areturn
    //   84: astore_2
    //   85: aload_1
    //   86: invokevirtual 135	java/io/FileInputStream:close	()V
    //   89: goto +9 -> 98
    //   92: astore_1
    //   93: aload_2
    //   94: aload_1
    //   95: invokevirtual 139	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   98: aload_2
    //   99: athrow
    //   100: astore_1
    //   101: aload_0
    //   102: invokevirtual 105	android/os/ParcelFileDescriptor:close	()V
    //   105: goto +9 -> 114
    //   108: astore_0
    //   109: aload_1
    //   110: aload_0
    //   111: invokevirtual 139	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   114: aload_1
    //   115: athrow
    //   116: aconst_null
    //   117: areturn
    //   118: pop
    //   119: goto -3 -> 116
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	paramContext	Context
    //   0	122	1	paramCancellationSignal	CancellationSignal
    //   0	122	2	paramUri	Uri
    //   7	57	3	localObject	Object
    //   53	16	4	l1	long
    //   58	7	6	localMapMode	java.nio.channels.FileChannel.MapMode
    //   61	6	7	l2	long
    //   118	1	7	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   44	48	84	finally
    //   49	53	84	finally
    //   55	58	84	finally
    //   68	73	84	finally
    //   85	89	92	finally
    //   30	33	100	finally
    //   34	38	100	finally
    //   40	44	100	finally
    //   74	78	100	finally
    //   94	98	100	finally
    //   98	100	100	finally
    //   101	105	108	finally
    //   11	15	118	java/io/IOException
    //   24	28	118	java/io/IOException
    //   78	82	118	java/io/IOException
    //   110	114	118	java/io/IOException
    //   114	116	118	java/io/IOException
  }
  
  public static File OooO0o0(Context paramContext)
  {
    paramContext = paramContext.getCacheDir();
    if (paramContext == null) {
      return null;
    }
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(".font");
    int i = Process.myPid();
    ((StringBuilder)localObject1).append(i);
    String str = "-";
    ((StringBuilder)localObject1).append(str);
    int j = Process.myTid();
    ((StringBuilder)localObject1).append(j);
    ((StringBuilder)localObject1).append(str);
    localObject1 = ((StringBuilder)localObject1).toString();
    i = 0;
    str = null;
    for (;;)
    {
      j = 100;
      if (i >= j) {
        break;
      }
      File localFile = new java/io/File;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(i);
      localObject2 = ((StringBuilder)localObject2).toString();
      localFile.<init>(paramContext, (String)localObject2);
      try
      {
        boolean bool = localFile.createNewFile();
        if (bool) {
          return localFile;
        }
      }
      catch (IOException localIOException)
      {
        i += 1;
      }
    }
    return null;
  }
  
  /* Error */
  public static ByteBuffer OooO0oO(File paramFile)
  {
    // Byte code:
    //   0: new 107	java/io/FileInputStream
    //   3: astore_1
    //   4: aload_1
    //   5: aload_0
    //   6: invokespecial 172	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   9: aload_1
    //   10: invokevirtual 118	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   13: astore_2
    //   14: aload_2
    //   15: invokevirtual 124	java/nio/channels/FileChannel:size	()J
    //   18: lstore_3
    //   19: getstatic 130	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   22: astore 5
    //   24: lconst_0
    //   25: lstore 6
    //   27: aload_2
    //   28: aload 5
    //   30: lload 6
    //   32: lload_3
    //   33: invokevirtual 134	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   36: astore_0
    //   37: aload_1
    //   38: invokevirtual 135	java/io/FileInputStream:close	()V
    //   41: aload_0
    //   42: areturn
    //   43: astore_0
    //   44: aload_1
    //   45: invokevirtual 135	java/io/FileInputStream:close	()V
    //   48: goto +9 -> 57
    //   51: astore_1
    //   52: aload_0
    //   53: aload_1
    //   54: invokevirtual 139	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   57: aload_0
    //   58: athrow
    //   59: aconst_null
    //   60: areturn
    //   61: pop
    //   62: goto -3 -> 59
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	paramFile	File
    //   3	42	1	localFileInputStream	java.io.FileInputStream
    //   51	3	1	localThrowable	java.lang.Throwable
    //   13	15	2	localFileChannel	java.nio.channels.FileChannel
    //   18	15	3	l1	long
    //   22	7	5	localMapMode	java.nio.channels.FileChannel.MapMode
    //   25	6	6	l2	long
    //   61	1	7	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   9	13	43	finally
    //   14	18	43	finally
    //   19	22	43	finally
    //   32	36	43	finally
    //   44	48	51	finally
    //   0	3	61	java/io/IOException
    //   5	9	61	java/io/IOException
    //   37	41	61	java/io/IOException
    //   53	57	61	java/io/IOException
    //   57	59	61	java/io/IOException
  }
  
  public static Map OooO0oo(Context paramContext, FontsContractCompat.FontInfo[] paramArrayOfFontInfo, CancellationSignal paramCancellationSignal)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    int i = paramArrayOfFontInfo.length;
    int j = 0;
    while (j < i)
    {
      Object localObject = paramArrayOfFontInfo[j];
      int k = ((FontsContractCompat.FontInfo)localObject).getResultCode();
      if (k == 0)
      {
        localObject = ((FontsContractCompat.FontInfo)localObject).getUri();
        boolean bool = localHashMap.containsKey(localObject);
        if (!bool)
        {
          ByteBuffer localByteBuffer = OooO0o(paramContext, paramCancellationSignal, (Uri)localObject);
          localHashMap.put(localObject, localByteBuffer);
        }
      }
      j += 1;
    }
    return Collections.unmodifiableMap(localHashMap);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.TypefaceCompatUtil
 * JD-Core Version:    0.7.0.1
 */