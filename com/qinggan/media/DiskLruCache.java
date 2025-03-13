package com.qinggan.media;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import m54207b69;

public final class DiskLruCache
  implements Closeable
{
  public static final Charset o00o000 = Charset.forName(m54207b69.F54207b69_11("2i3C3E314755"));
  public final int o00OoOoo;
  public final File o00Ooo0;
  public final Callable o00Ooo00;
  public final ExecutorService o00Ooo0O;
  public final File o00Ooo0o;
  public Writer o00OooO;
  public final File o00OooO0;
  public final LinkedHashMap o00OooOO;
  public final long o00OooOo;
  public int o00OoooO;
  public long o00Ooooo;
  public final int o00o0000;
  public long o0O00o0;
  
  public static void OooOo0O(Closeable paramCloseable)
  {
    if (paramCloseable != null) {
      try
      {
        paramCloseable.close();
      }
      catch (RuntimeException localRuntimeException)
      {
        throw localRuntimeException;
      }
      catch (Exception localException) {}
    }
  }
  
  public static void OooOoo(File paramFile)
  {
    boolean bool1 = paramFile.exists();
    if (bool1)
    {
      boolean bool2 = paramFile.delete();
      if (!bool2)
      {
        paramFile = new java/io/IOException;
        paramFile.<init>();
        throw paramFile;
      }
    }
  }
  
  public static String Oooo00o(InputStream paramInputStream)
  {
    InputStreamReader localInputStreamReader = new java/io/InputStreamReader;
    Charset localCharset = o00o000;
    localInputStreamReader.<init>(paramInputStream, localCharset);
    return Oooo0OO(localInputStreamReader);
  }
  
  public static String Oooo0OO(Reader paramReader)
  {
    try
    {
      Object localObject1 = new java/io/StringWriter;
      ((StringWriter)localObject1).<init>();
      int i = 1024;
      char[] arrayOfChar = new char[i];
      for (;;)
      {
        int j = paramReader.read(arrayOfChar);
        int k = -1;
        if (j == k) {
          break;
        }
        k = 0;
        ((StringWriter)localObject1).write(arrayOfChar, 0, j);
      }
      localObject1 = ((StringWriter)localObject1).toString();
      return localObject1;
    }
    finally
    {
      paramReader.close();
    }
  }
  
  public final void OooOOo()
  {
    Object localObject = this.o00OooO;
    if (localObject != null) {
      return;
    }
    localObject = new java/lang/IllegalStateException;
    String str = m54207b69.F54207b69_11(";$4746494F4509535E0C505256634E4E");
    ((IllegalStateException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public final void OooOo(DiskLruCache.Editor paramEditor, boolean paramBoolean)
  {
    try
    {
      Object localObject1 = DiskLruCache.Editor.OooO0O0(paramEditor);
      Object localObject2 = DiskLruCache.Entry.OooO0oO((DiskLruCache.Entry)localObject1);
      if (localObject2 == paramEditor)
      {
        int i = 0;
        localObject2 = null;
        File localFile;
        Object localObject3;
        Object localObject4;
        if (paramBoolean)
        {
          int j = DiskLruCache.Entry.OooO0o0((DiskLruCache.Entry)localObject1);
          if (j == 0)
          {
            j = 0;
            localFile = null;
            int k;
            for (;;)
            {
              int m = this.o00o0000;
              if (j >= m) {
                break label144;
              }
              localObject3 = ((DiskLruCache.Entry)localObject1).getDirtyFile(j);
              boolean bool2 = ((File)localObject3).exists();
              if (!bool2) {
                break;
              }
              j += 1;
            }
            paramEditor.OooO00o();
            paramEditor = new java/lang/IllegalStateException;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject1 = "$H2D2D233F6C3127332E78467337473B384C3E7A413539437F";
            localObject1 = m54207b69.F54207b69_11((String)localObject1);
            ((StringBuilder)localObject4).append((String)localObject1);
            ((StringBuilder)localObject4).append(k);
            localObject4 = ((StringBuilder)localObject4).toString();
            paramEditor.<init>((String)localObject4);
            throw paramEditor;
          }
        }
        for (;;)
        {
          label144:
          int n = this.o00o0000;
          if (i >= n) {
            break;
          }
          paramEditor = ((DiskLruCache.Entry)localObject1).getDirtyFile(i);
          if (paramBoolean)
          {
            boolean bool1 = paramEditor.exists();
            if (bool1)
            {
              localFile = ((DiskLruCache.Entry)localObject1).getCleanFile(i);
              paramEditor.renameTo(localFile);
              paramEditor = DiskLruCache.Entry.OooO00o((DiskLruCache.Entry)localObject1);
              long l1 = paramEditor[i];
              long l2 = localFile.length();
              paramEditor = DiskLruCache.Entry.OooO00o((DiskLruCache.Entry)localObject1);
              paramEditor[i] = l2;
              long l3 = this.o00Ooooo - l1 + l2;
              this.o00Ooooo = l3;
            }
          }
          else
          {
            OooOoo(paramEditor);
          }
          i += 1;
        }
        int i1 = this.o00OoooO;
        i = 1;
        i1 += i;
        this.o00OoooO = i2;
        int i2 = 0;
        paramEditor = null;
        DiskLruCache.Entry.OooO0oo((DiskLruCache.Entry)localObject1, null);
        boolean bool3 = DiskLruCache.Entry.OooO0o0((DiskLruCache.Entry)localObject1) | paramBoolean;
        char c = '\n';
        if (bool3)
        {
          DiskLruCache.Entry.OooO0o((DiskLruCache.Entry)localObject1, i);
          paramEditor = this.o00OooO;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject3 = "x]1E121A1F1782";
          localObject3 = m54207b69.F54207b69_11((String)localObject3);
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject3 = DiskLruCache.Entry.OooO0O0((DiskLruCache.Entry)localObject1);
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject3 = ((DiskLruCache.Entry)localObject1).getLengths();
          ((StringBuilder)localObject2).append((String)localObject3);
          ((StringBuilder)localObject2).append(c);
          localObject2 = ((StringBuilder)localObject2).toString();
          paramEditor.write((String)localObject2);
          if (paramBoolean)
          {
            l4 = this.o0O00o0;
            long l5 = 1L + l4;
            this.o0O00o0 = l5;
            DiskLruCache.Entry.OooO0Oo((DiskLruCache.Entry)localObject1, l4);
          }
        }
        else
        {
          paramEditor = this.o00OooOO;
          localObject4 = DiskLruCache.Entry.OooO0O0((DiskLruCache.Entry)localObject1);
          paramEditor.remove(localObject4);
          paramEditor = this.o00OooO;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject2 = "u_0D1B14130D1F85";
          localObject2 = m54207b69.F54207b69_11((String)localObject2);
          ((StringBuilder)localObject4).append((String)localObject2);
          localObject1 = DiskLruCache.Entry.OooO0O0((DiskLruCache.Entry)localObject1);
          ((StringBuilder)localObject4).append((String)localObject1);
          ((StringBuilder)localObject4).append(c);
          localObject4 = ((StringBuilder)localObject4).toString();
          paramEditor.write((String)localObject4);
        }
        long l4 = this.o00Ooooo;
        long l6 = this.o00OooOo;
        bool3 = l4 < l6;
        if (!bool3)
        {
          bool3 = Oooo0();
          if (!bool3) {}
        }
        else
        {
          paramEditor = this.o00Ooo0O;
          localObject4 = this.o00Ooo00;
          paramEditor.submit((Callable)localObject4);
        }
        return;
      }
      paramEditor = new java/lang/IllegalStateException;
      paramEditor.<init>();
      throw paramEditor;
    }
    finally {}
  }
  
  public DiskLruCache.Editor OooOooO(String paramString)
  {
    return OooOooo(paramString, -1);
  }
  
  public final DiskLruCache.Editor OooOooo(String paramString, long paramLong)
  {
    try
    {
      OooOOo();
      OoooOOo(paramString);
      Object localObject1 = this.o00OooOO;
      localObject1 = ((LinkedHashMap)localObject1).get(paramString);
      localObject1 = (DiskLruCache.Entry)localObject1;
      long l1 = -1;
      boolean bool1 = paramLong < l1;
      if (bool1) {
        if (localObject1 != null)
        {
          long l2 = DiskLruCache.Entry.OooO0OO((DiskLruCache.Entry)localObject1);
          boolean bool2 = l2 < paramLong;
          if (!bool2) {}
        }
        else
        {
          return null;
        }
      }
      if (localObject1 == null)
      {
        localObject1 = new com/qinggan/media/DiskLruCache$Entry;
        ((DiskLruCache.Entry)localObject1).<init>(this, paramString, null);
        localObject2 = this.o00OooOO;
        ((AbstractMap)localObject2).put(paramString, localObject1);
      }
      else
      {
        localObject2 = DiskLruCache.Entry.OooO0oO((DiskLruCache.Entry)localObject1);
        if (localObject2 != null) {
          return null;
        }
      }
      Object localObject2 = new com/qinggan/media/DiskLruCache$Editor;
      ((DiskLruCache.Editor)localObject2).<init>(this, (DiskLruCache.Entry)localObject1, null);
      DiskLruCache.Entry.OooO0oo((DiskLruCache.Entry)localObject1, (DiskLruCache.Editor)localObject2);
      Writer localWriter = this.o00OooO;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      String str = "pr363C22292F57";
      str = m54207b69.F54207b69_11(str);
      ((StringBuilder)localObject1).append(str);
      ((StringBuilder)localObject1).append(paramString);
      char c = '\n';
      ((StringBuilder)localObject1).append(c);
      paramString = ((StringBuilder)localObject1).toString();
      localWriter.write(paramString);
      paramString = this.o00OooO;
      paramString.flush();
      return localObject2;
    }
    finally {}
  }
  
  public final boolean Oooo0()
  {
    int i = this.o00OoooO;
    int j = 2000;
    if (i >= j)
    {
      LinkedHashMap localLinkedHashMap = this.o00OooOO;
      int k = localLinkedHashMap.size();
      if (i >= k) {
        return 1;
      }
    }
    i = 0;
    return i;
  }
  
  /* Error */
  public DiskLruCache.Snapshot Oooo000(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 245	com/qinggan/media/DiskLruCache:OooOOo	()V
    //   6: aload_0
    //   7: aload_1
    //   8: invokevirtual 248	com/qinggan/media/DiskLruCache:OoooOOo	(Ljava/lang/String;)V
    //   11: aload_0
    //   12: getfield 217	com/qinggan/media/DiskLruCache:o00OooOO	Ljava/util/LinkedHashMap;
    //   15: astore_2
    //   16: aload_2
    //   17: aload_1
    //   18: invokevirtual 253	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   21: astore_2
    //   22: aload_2
    //   23: checkcast 134	com/qinggan/media/DiskLruCache$Entry
    //   26: astore_2
    //   27: iconst_0
    //   28: istore_3
    //   29: aconst_null
    //   30: astore 4
    //   32: aload_2
    //   33: ifnonnull +7 -> 40
    //   36: aload_0
    //   37: monitorexit
    //   38: aconst_null
    //   39: areturn
    //   40: aload_2
    //   41: invokestatic 142	com/qinggan/media/DiskLruCache$Entry:OooO0o0	(Lcom/qinggan/media/DiskLruCache$Entry;)Z
    //   44: istore 5
    //   46: iload 5
    //   48: ifne +7 -> 55
    //   51: aload_0
    //   52: monitorexit
    //   53: aconst_null
    //   54: areturn
    //   55: aload_0
    //   56: getfield 64	com/qinggan/media/DiskLruCache:o00o0000	I
    //   59: istore 5
    //   61: iload 5
    //   63: anewarray 279	java/io/InputStream
    //   66: astore 6
    //   68: iconst_0
    //   69: istore 5
    //   71: aconst_null
    //   72: astore 7
    //   74: aload_0
    //   75: getfield 64	com/qinggan/media/DiskLruCache:o00o0000	I
    //   78: istore 8
    //   80: iload 5
    //   82: iload 8
    //   84: if_icmpge +39 -> 123
    //   87: new 281	java/io/FileInputStream
    //   90: astore 9
    //   92: aload_2
    //   93: iload 5
    //   95: invokevirtual 165	com/qinggan/media/DiskLruCache$Entry:getCleanFile	(I)Ljava/io/File;
    //   98: astore 10
    //   100: aload 9
    //   102: aload 10
    //   104: invokespecial 283	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   107: aload 6
    //   109: iload 5
    //   111: aload 9
    //   113: aastore
    //   114: iload 5
    //   116: iconst_1
    //   117: iadd
    //   118: istore 5
    //   120: goto -46 -> 74
    //   123: aload_0
    //   124: getfield 71	com/qinggan/media/DiskLruCache:o00OoooO	I
    //   127: iconst_1
    //   128: iadd
    //   129: istore_3
    //   130: aload_0
    //   131: iload_3
    //   132: putfield 71	com/qinggan/media/DiskLruCache:o00OoooO	I
    //   135: aload_0
    //   136: getfield 50	com/qinggan/media/DiskLruCache:o00OooO	Ljava/io/Writer;
    //   139: astore 4
    //   141: new 151	java/lang/StringBuilder
    //   144: astore 7
    //   146: aload 7
    //   148: invokespecial 152	java/lang/StringBuilder:<init>	()V
    //   151: ldc_w 285
    //   154: astore 9
    //   156: aload 9
    //   158: invokestatic 36	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   161: astore 9
    //   163: aload 7
    //   165: aload 9
    //   167: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: pop
    //   171: aload 7
    //   173: aload_1
    //   174: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: bipush 10
    //   180: istore 8
    //   182: aload 7
    //   184: iload 8
    //   186: invokevirtual 203	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload 7
    //   192: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   195: astore 7
    //   197: aload 4
    //   199: aload 7
    //   201: invokevirtual 288	java/io/Writer:append	(Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   204: pop
    //   205: aload_0
    //   206: invokevirtual 48	com/qinggan/media/DiskLruCache:Oooo0	()Z
    //   209: istore_3
    //   210: iload_3
    //   211: ifeq +25 -> 236
    //   214: aload_0
    //   215: getfield 229	com/qinggan/media/DiskLruCache:o00Ooo0O	Ljava/util/concurrent/ExecutorService;
    //   218: astore 4
    //   220: aload_0
    //   221: getfield 231	com/qinggan/media/DiskLruCache:o00Ooo00	Ljava/util/concurrent/Callable;
    //   224: astore 7
    //   226: aload 4
    //   228: aload 7
    //   230: invokeinterface 237 2 0
    //   235: pop
    //   236: new 290	com/qinggan/media/DiskLruCache$Snapshot
    //   239: astore 4
    //   241: aload_2
    //   242: invokestatic 257	com/qinggan/media/DiskLruCache$Entry:OooO0OO	(Lcom/qinggan/media/DiskLruCache$Entry;)J
    //   245: lstore 11
    //   247: aload 4
    //   249: astore 9
    //   251: aload_0
    //   252: astore 10
    //   254: aload 4
    //   256: aload_0
    //   257: aload_1
    //   258: lload 11
    //   260: aload 6
    //   262: aconst_null
    //   263: invokespecial 293	com/qinggan/media/DiskLruCache$Snapshot:<init>	(Lcom/qinggan/media/DiskLruCache;Ljava/lang/String;J[Ljava/io/InputStream;Lcom/qinggan/media/DiskLruCache$1;)V
    //   266: aload_0
    //   267: monitorexit
    //   268: aload 4
    //   270: areturn
    //   271: pop
    //   272: aload_0
    //   273: monitorexit
    //   274: aconst_null
    //   275: areturn
    //   276: astore_1
    //   277: aload_0
    //   278: monitorexit
    //   279: aload_1
    //   280: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	281	0	this	DiskLruCache
    //   0	281	1	paramString	String
    //   15	227	2	localObject1	Object
    //   28	104	3	i	int
    //   209	2	3	bool1	boolean
    //   30	239	4	localObject2	Object
    //   44	3	5	bool2	boolean
    //   59	60	5	j	int
    //   66	195	6	arrayOfInputStream	InputStream[]
    //   72	157	7	localObject3	Object
    //   78	107	8	k	int
    //   90	160	9	localObject4	Object
    //   98	155	10	localObject5	Object
    //   245	14	11	l	long
    //   271	1	14	localFileNotFoundException	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   74	78	271	java/io/FileNotFoundException
    //   87	90	271	java/io/FileNotFoundException
    //   93	98	271	java/io/FileNotFoundException
    //   102	107	271	java/io/FileNotFoundException
    //   111	114	271	java/io/FileNotFoundException
    //   2	6	276	finally
    //   7	11	276	finally
    //   11	15	276	finally
    //   17	21	276	finally
    //   22	26	276	finally
    //   40	44	276	finally
    //   55	59	276	finally
    //   61	66	276	finally
    //   74	78	276	finally
    //   87	90	276	finally
    //   93	98	276	finally
    //   102	107	276	finally
    //   111	114	276	finally
    //   123	127	276	finally
    //   131	135	276	finally
    //   135	139	276	finally
    //   141	144	276	finally
    //   146	151	276	finally
    //   156	161	276	finally
    //   165	171	276	finally
    //   173	178	276	finally
    //   184	190	276	finally
    //   190	195	276	finally
    //   199	205	276	finally
    //   205	209	276	finally
    //   214	218	276	finally
    //   220	224	276	finally
    //   228	236	276	finally
    //   236	239	276	finally
    //   241	245	276	finally
    //   262	266	276	finally
  }
  
  public final void Oooo0oo()
  {
    try
    {
      Object localObject1 = this.o00OooO;
      if (localObject1 != null) {
        ((Writer)localObject1).close();
      }
      localObject1 = new java/io/BufferedWriter;
      Object localObject3 = new java/io/FileWriter;
      File localFile = this.o00OooO0;
      ((FileWriter)localObject3).<init>(localFile);
      int i = 8192;
      ((BufferedWriter)localObject1).<init>((Writer)localObject3, i);
      localObject3 = "5T383E383A3F2B37814544841B49344D27363229484B5147";
      localObject3 = m54207b69.F54207b69_11((String)localObject3);
      ((Writer)localObject1).write((String)localObject3);
      localObject3 = "\n";
      ((Writer)localObject1).write((String)localObject3);
      localObject3 = "1";
      ((Writer)localObject1).write((String)localObject3);
      localObject3 = "\n";
      ((Writer)localObject1).write((String)localObject3);
      int j = this.o00OoOoo;
      localObject3 = Integer.toString(j);
      ((Writer)localObject1).write((String)localObject3);
      localObject3 = "\n";
      ((Writer)localObject1).write((String)localObject3);
      j = this.o00o0000;
      localObject3 = Integer.toString(j);
      ((Writer)localObject1).write((String)localObject3);
      localObject3 = "\n";
      ((Writer)localObject1).write((String)localObject3);
      localObject3 = "\n";
      ((Writer)localObject1).write((String)localObject3);
      localObject3 = this.o00OooOO;
      localObject3 = ((LinkedHashMap)localObject3).values();
      localObject3 = ((Collection)localObject3).iterator();
      boolean bool1 = ((Iterator)localObject3).hasNext();
      if (bool1)
      {
        localObject4 = ((Iterator)localObject3).next();
        localObject4 = (DiskLruCache.Entry)localObject4;
        Object localObject5 = DiskLruCache.Entry.OooO0oO((DiskLruCache.Entry)localObject4);
        char c = '\n';
        String str;
        if (localObject5 != null)
        {
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          str = "pr363C22292F57";
          str = m54207b69.F54207b69_11(str);
          ((StringBuilder)localObject5).append(str);
          localObject4 = DiskLruCache.Entry.OooO0O0((DiskLruCache.Entry)localObject4);
          ((StringBuilder)localObject5).append((String)localObject4);
          ((StringBuilder)localObject5).append(c);
        }
        for (localObject4 = ((StringBuilder)localObject5).toString();; localObject4 = ((StringBuilder)localObject5).toString())
        {
          ((Writer)localObject1).write((String)localObject4);
          break;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          str = "x]1E121A1F1782";
          str = m54207b69.F54207b69_11(str);
          ((StringBuilder)localObject5).append(str);
          str = DiskLruCache.Entry.OooO0O0((DiskLruCache.Entry)localObject4);
          ((StringBuilder)localObject5).append(str);
          localObject4 = ((DiskLruCache.Entry)localObject4).getLengths();
          ((StringBuilder)localObject5).append((String)localObject4);
          ((StringBuilder)localObject5).append(c);
        }
      }
      ((Writer)localObject1).close();
      localObject1 = this.o00OooO0;
      localObject3 = this.o00Ooo0o;
      ((File)localObject1).renameTo((File)localObject3);
      localObject1 = new java/io/BufferedWriter;
      localObject3 = new java/io/FileWriter;
      Object localObject4 = this.o00Ooo0o;
      boolean bool2 = true;
      ((FileWriter)localObject3).<init>((File)localObject4, bool2);
      ((BufferedWriter)localObject1).<init>((Writer)localObject3, i);
      this.o00OooO = ((Writer)localObject1);
      return;
    }
    finally {}
  }
  
  public final void OoooO()
  {
    for (;;)
    {
      long l1 = this.o00Ooooo;
      long l2 = this.o00OooOo;
      boolean bool = l1 < l2;
      if (!bool) {
        break;
      }
      String str = (String)((Map.Entry)this.o00OooOO.entrySet().iterator().next()).getKey();
      OoooO0(str);
    }
  }
  
  public boolean OoooO0(String paramString)
  {
    try
    {
      OooOOo();
      OoooOOo(paramString);
      Object localObject1 = this.o00OooOO;
      localObject1 = ((LinkedHashMap)localObject1).get(paramString);
      localObject1 = (DiskLruCache.Entry)localObject1;
      int i = 0;
      String str1 = null;
      if (localObject1 != null)
      {
        Object localObject2 = DiskLruCache.Entry.OooO0oO((DiskLruCache.Entry)localObject1);
        if (localObject2 == null)
        {
          for (;;)
          {
            int j = this.o00o0000;
            if (i >= j) {
              break label184;
            }
            localObject2 = ((DiskLruCache.Entry)localObject1).getCleanFile(i);
            boolean bool1 = ((File)localObject2).delete();
            if (!bool1) {
              break;
            }
            long l1 = this.o00Ooooo;
            long[] arrayOfLong = DiskLruCache.Entry.OooO00o((DiskLruCache.Entry)localObject1);
            long l2 = arrayOfLong[i];
            l1 -= l2;
            this.o00Ooooo = l1;
            localObject2 = DiskLruCache.Entry.OooO00o((DiskLruCache.Entry)localObject1);
            long l3 = 0L;
            localObject2[i] = l3;
            i += 1;
          }
          paramString = new java/io/IOException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          str1 = "la07010A10080A471C164A0F0F1911231351";
          str1 = m54207b69.F54207b69_11(str1);
          ((StringBuilder)localObject1).append(str1);
          ((StringBuilder)localObject1).append(localObject2);
          localObject1 = ((StringBuilder)localObject1).toString();
          paramString.<init>((String)localObject1);
          throw paramString;
          label184:
          int k = this.o00OoooO;
          i = 1;
          int m;
          k += i;
          this.o00OoooO = m;
          localObject1 = this.o00OooO;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str2 = "u_0D1B14130D1F85";
          str2 = m54207b69.F54207b69_11(str2);
          ((StringBuilder)localObject2).append(str2);
          ((StringBuilder)localObject2).append(paramString);
          char c = '\n';
          ((StringBuilder)localObject2).append(c);
          localObject2 = ((StringBuilder)localObject2).toString();
          ((Writer)localObject1).append((CharSequence)localObject2);
          localObject1 = this.o00OooOO;
          ((AbstractMap)localObject1).remove(paramString);
          boolean bool2 = Oooo0();
          if (bool2)
          {
            paramString = this.o00Ooo0O;
            localObject1 = this.o00Ooo00;
            paramString.submit((Callable)localObject1);
          }
          return i;
        }
      }
      return false;
    }
    finally {}
  }
  
  public final void OoooOOo(String paramString)
  {
    Object localObject = " ";
    boolean bool = paramString.contains((CharSequence)localObject);
    if (!bool)
    {
      localObject = "\n";
      bool = paramString.contains((CharSequence)localObject);
      if (!bool)
      {
        localObject = "\r";
        bool = paramString.contains((CharSequence)localObject);
        if (!bool) {
          return;
        }
      }
    }
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("pw1C1310075B1F080B0B6023230F642227291428312D6C1A1E2E2D2C1F733523763933223E423E382B75807F");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("\"");
    paramString = new java/lang/IllegalArgumentException;
    localObject = ((StringBuilder)localObject).toString();
    paramString.<init>((String)localObject);
    throw paramString;
  }
  
  public void close()
  {
    try
    {
      Object localObject1 = this.o00OooO;
      if (localObject1 == null) {
        return;
      }
      localObject1 = new java/util/ArrayList;
      Object localObject3 = this.o00OooOO;
      localObject3 = ((LinkedHashMap)localObject3).values();
      ((ArrayList)localObject1).<init>((Collection)localObject3);
      localObject1 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject1).hasNext();
        if (!bool) {
          break;
        }
        localObject3 = ((Iterator)localObject1).next();
        localObject3 = (DiskLruCache.Entry)localObject3;
        DiskLruCache.Editor localEditor = DiskLruCache.Entry.OooO0oO((DiskLruCache.Entry)localObject3);
        if (localEditor != null)
        {
          localObject3 = DiskLruCache.Entry.OooO0oO((DiskLruCache.Entry)localObject3);
          ((DiskLruCache.Editor)localObject3).OooO00o();
        }
      }
      OoooO();
      localObject1 = this.o00OooO;
      ((Writer)localObject1).close();
      localObject1 = null;
      this.o00OooO = null;
      return;
    }
    finally {}
  }
  
  public void flush()
  {
    try
    {
      OooOOo();
      OoooO();
      Writer localWriter = this.o00OooO;
      localWriter.flush();
      return;
    }
    finally {}
  }
  
  public File getDirectory()
  {
    return this.o00Ooo0;
  }
  
  public boolean isClosed()
  {
    Writer localWriter = this.o00OooO;
    boolean bool;
    if (localWriter == null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localWriter = null;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.media.DiskLruCache
 * JD-Core Version:    0.7.0.1
 */