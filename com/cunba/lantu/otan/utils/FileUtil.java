package com.cunba.lantu.otan.utils;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import m54207b69;

public class FileUtil
{
  public static void OooO(Context paramContext, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(803, arrayOfObject);
  }
  
  public static File OooO0O0()
  {
    Object[] arrayOfObject = new Object[0];
    return (File)m54207b69.F54207b69_09(805, arrayOfObject);
  }
  
  public static String OooO0OO(InputStream paramInputStream)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramInputStream;
    return (String)m54207b69.F54207b69_09(806, arrayOfObject);
  }
  
  public static void OooO0Oo(String paramString1, String paramString2, FileUtil.FileDownloadCallback paramFileDownloadCallback)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = paramFileDownloadCallback;
    m54207b69.F54207b69_00(807, arrayOfObject);
  }
  
  public static String OooO0o(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return (String)m54207b69.F54207b69_09(808, arrayOfObject);
  }
  
  public static boolean OooO0o0()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(809, arrayOfObject);
  }
  
  public static void OooO0oO(Context paramContext, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(810, arrayOfObject);
  }
  
  public static void OooOO0(File paramFile1, File paramFile2, String paramString)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramFile1;
    arrayOfObject[1] = paramFile2;
    arrayOfObject[2] = paramString;
    m54207b69.F54207b69_00(812, arrayOfObject);
  }
  
  /* Error */
  public static void OooOO0O(String paramString)
  {
    // Byte code:
    //   0: new 41	java/text/SimpleDateFormat
    //   3: astore_1
    //   4: ldc 43
    //   6: invokestatic 47	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   9: astore_2
    //   10: aload_1
    //   11: aload_2
    //   12: invokespecial 50	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   15: new 52	java/util/Date
    //   18: astore_2
    //   19: aload_2
    //   20: invokespecial 53	java/util/Date:<init>	()V
    //   23: aload_1
    //   24: aload_2
    //   25: invokevirtual 59	java/text/DateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   28: astore_1
    //   29: new 61	java/lang/StringBuilder
    //   32: astore_2
    //   33: aload_2
    //   34: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   37: aload_2
    //   38: aload_1
    //   39: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: pop
    //   43: aload_2
    //   44: ldc 68
    //   46: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: pop
    //   50: aload_2
    //   51: aload_0
    //   52: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload_2
    //   57: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: astore_0
    //   61: aconst_null
    //   62: astore_1
    //   63: new 29	java/io/File
    //   66: astore_2
    //   67: ldc 74
    //   69: astore_3
    //   70: aload_3
    //   71: invokestatic 47	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   74: astore_3
    //   75: aload_2
    //   76: aload_3
    //   77: invokespecial 75	java/io/File:<init>	(Ljava/lang/String;)V
    //   80: aload_2
    //   81: invokevirtual 79	java/io/File:exists	()Z
    //   84: istore 4
    //   86: iload 4
    //   88: ifne +8 -> 96
    //   91: aload_2
    //   92: invokevirtual 82	java/io/File:createNewFile	()Z
    //   95: pop
    //   96: new 84	java/io/BufferedWriter
    //   99: astore_3
    //   100: new 86	java/io/FileWriter
    //   103: astore 5
    //   105: iconst_1
    //   106: istore 6
    //   108: aload 5
    //   110: aload_2
    //   111: iload 6
    //   113: invokespecial 89	java/io/FileWriter:<init>	(Ljava/io/File;Z)V
    //   116: aload_3
    //   117: aload 5
    //   119: invokespecial 92	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   122: aload_3
    //   123: aload_0
    //   124: invokevirtual 97	java/io/Writer:append	(Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   127: pop
    //   128: aload_3
    //   129: invokevirtual 100	java/io/BufferedWriter:close	()V
    //   132: goto +35 -> 167
    //   135: astore_0
    //   136: aload_3
    //   137: astore_1
    //   138: goto +10 -> 148
    //   141: pop
    //   142: aload_3
    //   143: astore_1
    //   144: goto +15 -> 159
    //   147: astore_0
    //   148: aload_1
    //   149: ifnull +7 -> 156
    //   152: aload_1
    //   153: invokevirtual 100	java/io/BufferedWriter:close	()V
    //   156: aload_0
    //   157: athrow
    //   158: pop
    //   159: aload_1
    //   160: ifnull +7 -> 167
    //   163: aload_1
    //   164: invokevirtual 100	java/io/BufferedWriter:close	()V
    //   167: return
    //   168: pop
    //   169: goto -13 -> 156
    //   172: pop
    //   173: goto -6 -> 167
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	paramString	String
    //   3	161	1	localObject1	Object
    //   9	102	2	localObject2	Object
    //   69	74	3	localObject3	Object
    //   84	3	4	bool1	boolean
    //   103	15	5	localFileWriter	java.io.FileWriter
    //   106	6	6	bool2	boolean
    //   141	1	7	localIOException1	java.io.IOException
    //   158	1	8	localIOException2	java.io.IOException
    //   168	1	9	localIOException3	java.io.IOException
    //   172	1	10	localIOException4	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   123	128	135	finally
    //   123	128	141	java/io/IOException
    //   63	66	147	finally
    //   70	74	147	finally
    //   76	80	147	finally
    //   80	84	147	finally
    //   91	96	147	finally
    //   96	99	147	finally
    //   100	103	147	finally
    //   111	116	147	finally
    //   117	122	147	finally
    //   63	66	158	java/io/IOException
    //   70	74	158	java/io/IOException
    //   76	80	158	java/io/IOException
    //   80	84	158	java/io/IOException
    //   91	96	158	java/io/IOException
    //   96	99	158	java/io/IOException
    //   100	103	158	java/io/IOException
    //   111	116	158	java/io/IOException
    //   117	122	158	java/io/IOException
    //   152	156	168	java/io/IOException
    //   128	132	172	java/io/IOException
    //   163	167	172	java/io/IOException
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.utils.FileUtil
 * JD-Core Version:    0.7.0.1
 */