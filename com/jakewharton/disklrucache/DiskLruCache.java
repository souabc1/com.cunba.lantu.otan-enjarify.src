package com.jakewharton.disklrucache;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m54207b69;

public final class DiskLruCache
  implements Closeable
{
  public static final Pattern o00o000O = Pattern.compile(m54207b69.F54207b69_11("z66D581D4F0A20157023745712260D105A"));
  public static final OutputStream o00o000o;
  public final File o00OoOoo;
  public final File o00Ooo0;
  public final File o00Ooo00;
  public final File o00Ooo0O;
  public final int o00Ooo0o;
  public final int o00OooO;
  public long o00OooO0;
  public long o00OooOO;
  public Writer o00OooOo;
  public int o00OoooO;
  public long o00Ooooo;
  public final Callable o00o000;
  public final ThreadPoolExecutor o00o0000;
  public final LinkedHashMap o0O00o0;
  
  static
  {
    DiskLruCache.2 local2 = new com/jakewharton/disklrucache/DiskLruCache$2;
    local2.<init>();
    o00o000o = local2;
  }
  
  public DiskLruCache(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    long l = 0L;
    this.o00OooOO = l;
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>(0, 0.75F, true);
    this.o0O00o0 = localLinkedHashMap;
    this.o00Ooooo = l;
    Object localObject = new java/util/concurrent/ThreadPoolExecutor;
    TimeUnit localTimeUnit = TimeUnit.SECONDS;
    LinkedBlockingQueue localLinkedBlockingQueue = new java/util/concurrent/LinkedBlockingQueue;
    localLinkedBlockingQueue.<init>();
    ((ThreadPoolExecutor)localObject).<init>(0, 1, 60, localTimeUnit, localLinkedBlockingQueue);
    this.o00o0000 = ((ThreadPoolExecutor)localObject);
    localObject = new com/jakewharton/disklrucache/DiskLruCache$1;
    ((DiskLruCache.1)localObject).<init>(this);
    this.o00o000 = ((Callable)localObject);
    this.o00OoOoo = paramFile;
    this.o00Ooo0o = paramInt1;
    localObject = new java/io/File;
    String str = m54207b69.F54207b69_11("&J2026413B28302C");
    ((File)localObject).<init>(paramFile, str);
    this.o00Ooo00 = ((File)localObject);
    localObject = new java/io/File;
    str = m54207b69.F54207b69_11("V05A604745625662254C664A");
    ((File)localObject).<init>(paramFile, str);
    this.o00Ooo0 = ((File)localObject);
    localObject = new java/io/File;
    str = m54207b69.F54207b69_11("9@2A303735322632752A343A");
    ((File)localObject).<init>(paramFile, str);
    this.o00Ooo0O = ((File)localObject);
    this.o00OooO = paramInt2;
    this.o00OooO0 = paramLong;
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
    Charset localCharset = Util.OooO0O0;
    localInputStreamReader.<init>(paramInputStream, localCharset);
    return Util.OooO0OO(localInputStreamReader);
  }
  
  public static DiskLruCache Oooo0OO(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    long l = 0L;
    boolean bool1 = paramLong < l;
    if (bool1)
    {
      if (paramInt2 > 0)
      {
        Object localObject1 = new java/io/File;
        Object localObject2 = m54207b69.F54207b69_11("9@2A303735322632752A343A");
        ((File)localObject1).<init>(paramFile, (String)localObject2);
        boolean bool2 = ((File)localObject1).exists();
        Object localObject3;
        if (bool2)
        {
          localObject2 = new java/io/File;
          localObject3 = m54207b69.F54207b69_11("&J2026413B28302C");
          ((File)localObject2).<init>(paramFile, (String)localObject3);
          boolean bool3 = ((File)localObject2).exists();
          if (bool3)
          {
            ((File)localObject1).delete();
          }
          else
          {
            bool3 = false;
            localObject3 = null;
            OoooOoo((File)localObject1, (File)localObject2, false);
          }
        }
        localObject1 = new com/jakewharton/disklrucache/DiskLruCache;
        Object localObject4 = localObject1;
        Object localObject5 = paramFile;
        int i = paramInt1;
        ((DiskLruCache)localObject1).<init>(paramFile, paramInt1, paramInt2, paramLong);
        localObject2 = ((DiskLruCache)localObject1).o00Ooo00;
        bool2 = ((File)localObject2).exists();
        if (bool2) {
          try
          {
            ((DiskLruCache)localObject1).OoooO0();
            ((DiskLruCache)localObject1).Oooo0oo();
            localObject2 = new java/io/BufferedWriter;
            localObject3 = new java/io/OutputStreamWriter;
            localObject4 = new java/io/FileOutputStream;
            localObject5 = ((DiskLruCache)localObject1).o00Ooo00;
            i = 1;
            ((FileOutputStream)localObject4).<init>((File)localObject5, i);
            localObject5 = Util.OooO00o;
            ((OutputStreamWriter)localObject3).<init>((OutputStream)localObject4, (Charset)localObject5);
            ((BufferedWriter)localObject2).<init>((Writer)localObject3);
            ((DiskLruCache)localObject1).o00OooOo = ((Writer)localObject2);
            return localObject1;
          }
          catch (IOException localIOException)
          {
            localObject3 = System.out;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject5 = m54207b69.F54207b69_11("=6726047607E49497C5F5E685E22");
            ((StringBuilder)localObject4).append((String)localObject5);
            ((StringBuilder)localObject4).append(paramFile);
            localObject5 = m54207b69.F54207b69_11("n+0B435A0E4C495F606664691C17");
            ((StringBuilder)localObject4).append((String)localObject5);
            String str1 = localIOException.getMessage();
            ((StringBuilder)localObject4).append(str1);
            str1 = m54207b69.F54207b69_11("?U797629333C3F2943433B");
            ((StringBuilder)localObject4).append(str1);
            str1 = ((StringBuilder)localObject4).toString();
            ((PrintStream)localObject3).println(str1);
            ((DiskLruCache)localObject1).OooOo();
          }
        }
        paramFile.mkdirs();
        localObject1 = new com/jakewharton/disklrucache/DiskLruCache;
        localObject4 = localObject1;
        localObject5 = paramFile;
        int j = paramInt1;
        ((DiskLruCache)localObject1).<init>(paramFile, paramInt1, paramInt2, paramLong);
        ((DiskLruCache)localObject1).OoooOOo();
        return localObject1;
      }
      paramFile = new java/lang/IllegalArgumentException;
      str2 = m54207b69.F54207b69_11("?;4D5B5951627D5A555D582512122819");
      paramFile.<init>(str2);
      throw paramFile;
    }
    paramFile = new java/lang/IllegalArgumentException;
    String str2 = m54207b69.F54207b69_11("q}101D0731180C1E6449496758");
    paramFile.<init>(str2);
    throw paramFile;
  }
  
  public static void OoooOoo(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    if (paramBoolean) {
      OooOoo(paramFile2);
    }
    boolean bool = paramFile1.renameTo(paramFile2);
    if (bool) {
      return;
    }
    paramFile1 = new java/io/IOException;
    paramFile1.<init>();
    throw paramFile1;
  }
  
  public final void OooOOo()
  {
    Object localObject = this.o00OooOo;
    if (localObject != null) {
      return;
    }
    localObject = new java/lang/IllegalStateException;
    String str = m54207b69.F54207b69_11(";$4746494F4509535E0C505256634E4E");
    ((IllegalStateException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public void OooOo()
  {
    close();
    Util.OooO0O0(this.o00OoOoo);
  }
  
  public final void OooOo0O(DiskLruCache.Editor paramEditor, boolean paramBoolean)
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
              int m = this.o00OooO;
              if (j >= m) {
                break label170;
              }
              localObject3 = DiskLruCache.Editor.OooO0OO(paramEditor);
              int n = localObject3[j];
              if (n == 0) {
                break;
              }
              localObject3 = ((DiskLruCache.Entry)localObject1).getDirtyFile(j);
              boolean bool2 = ((File)localObject3).exists();
              if (!bool2)
              {
                paramEditor.OooO00o();
                return;
              }
              j += 1;
            }
            paramEditor.OooO00o();
            paramEditor = new java/lang/IllegalStateException;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject1 = "?p3E16091F0D5519091D1A0E20205D232D14131B63282E2A356F1D6A2E1E322F2335712834402A3B773E482C7B454B42443881";
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
          label170:
          int i1 = this.o00OooO;
          if (i >= i1) {
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
              long l3 = this.o00OooOO - l1 + l2;
              this.o00OooOO = l3;
            }
          }
          else
          {
            OooOoo(paramEditor);
          }
          i += 1;
        }
        int i2 = this.o00OoooO;
        i = 1;
        i2 += i;
        this.o00OoooO = i3;
        int i3 = 0;
        paramEditor = null;
        DiskLruCache.Entry.OooO0oo((DiskLruCache.Entry)localObject1, null);
        boolean bool3 = DiskLruCache.Entry.OooO0o0((DiskLruCache.Entry)localObject1) | paramBoolean;
        char c = '\n';
        if (bool3)
        {
          DiskLruCache.Entry.OooO0o((DiskLruCache.Entry)localObject1, i);
          paramEditor = this.o00OooOo;
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
            l4 = this.o00Ooooo;
            long l5 = 1L + l4;
            this.o00Ooooo = l5;
            DiskLruCache.Entry.OooO0Oo((DiskLruCache.Entry)localObject1, l4);
          }
        }
        else
        {
          paramEditor = this.o0O00o0;
          localObject4 = DiskLruCache.Entry.OooO0O0((DiskLruCache.Entry)localObject1);
          paramEditor.remove(localObject4);
          paramEditor = this.o00OooOo;
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
        paramEditor = this.o00OooOo;
        paramEditor.flush();
        long l4 = this.o00OooOO;
        long l6 = this.o00OooO0;
        bool3 = l4 < l6;
        if (!bool3)
        {
          bool3 = Oooo0();
          if (!bool3) {}
        }
        else
        {
          paramEditor = this.o00o0000;
          localObject4 = this.o00o000;
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
      Ooooo0o(paramString);
      Object localObject1 = this.o0O00o0;
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
        localObject1 = new com/jakewharton/disklrucache/DiskLruCache$Entry;
        ((DiskLruCache.Entry)localObject1).<init>(this, paramString, null);
        localObject2 = this.o0O00o0;
        ((AbstractMap)localObject2).put(paramString, localObject1);
      }
      else
      {
        localObject2 = DiskLruCache.Entry.OooO0oO((DiskLruCache.Entry)localObject1);
        if (localObject2 != null) {
          return null;
        }
      }
      Object localObject2 = new com/jakewharton/disklrucache/DiskLruCache$Editor;
      ((DiskLruCache.Editor)localObject2).<init>(this, (DiskLruCache.Entry)localObject1, null);
      DiskLruCache.Entry.OooO0oo((DiskLruCache.Entry)localObject1, (DiskLruCache.Editor)localObject2);
      Writer localWriter = this.o00OooOo;
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
      paramString = this.o00OooOo;
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
      LinkedHashMap localLinkedHashMap = this.o0O00o0;
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
    //   3: invokevirtual 361	com/jakewharton/disklrucache/DiskLruCache:OooOOo	()V
    //   6: aload_0
    //   7: aload_1
    //   8: invokevirtual 364	com/jakewharton/disklrucache/DiskLruCache:Ooooo0o	(Ljava/lang/String;)V
    //   11: aload_0
    //   12: getfield 68	com/jakewharton/disklrucache/DiskLruCache:o0O00o0	Ljava/util/LinkedHashMap;
    //   15: astore_2
    //   16: aload_2
    //   17: aload_1
    //   18: invokevirtual 367	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   21: astore_2
    //   22: aload_2
    //   23: checkcast 273	com/jakewharton/disklrucache/DiskLruCache$Entry
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
    //   41: invokestatic 281	com/jakewharton/disklrucache/DiskLruCache$Entry:OooO0o0	(Lcom/jakewharton/disklrucache/DiskLruCache$Entry;)Z
    //   44: istore 5
    //   46: iload 5
    //   48: ifne +7 -> 55
    //   51: aload_0
    //   52: monitorexit
    //   53: aconst_null
    //   54: areturn
    //   55: aload_0
    //   56: getfield 118	com/jakewharton/disklrucache/DiskLruCache:o00OooO	I
    //   59: istore 5
    //   61: iload 5
    //   63: anewarray 389	java/io/InputStream
    //   66: astore 6
    //   68: iconst_0
    //   69: istore 5
    //   71: aconst_null
    //   72: astore 7
    //   74: iconst_0
    //   75: istore 8
    //   77: aconst_null
    //   78: astore 9
    //   80: aload_0
    //   81: getfield 118	com/jakewharton/disklrucache/DiskLruCache:o00OooO	I
    //   84: istore 10
    //   86: iload 8
    //   88: iload 10
    //   90: if_icmpge +39 -> 129
    //   93: new 391	java/io/FileInputStream
    //   96: astore 11
    //   98: aload_2
    //   99: iload 8
    //   101: invokevirtual 298	com/jakewharton/disklrucache/DiskLruCache$Entry:getCleanFile	(I)Ljava/io/File;
    //   104: astore 12
    //   106: aload 11
    //   108: aload 12
    //   110: invokespecial 393	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   113: aload 6
    //   115: iload 8
    //   117: aload 11
    //   119: aastore
    //   120: iload 8
    //   122: iconst_1
    //   123: iadd
    //   124: istore 8
    //   126: goto -46 -> 80
    //   129: aload_0
    //   130: getfield 142	com/jakewharton/disklrucache/DiskLruCache:o00OoooO	I
    //   133: iconst_1
    //   134: iadd
    //   135: istore_3
    //   136: aload_0
    //   137: iload_3
    //   138: putfield 142	com/jakewharton/disklrucache/DiskLruCache:o00OoooO	I
    //   141: aload_0
    //   142: getfield 126	com/jakewharton/disklrucache/DiskLruCache:o00OooOo	Ljava/io/Writer;
    //   145: astore 4
    //   147: new 205	java/lang/StringBuilder
    //   150: astore 7
    //   152: aload 7
    //   154: invokespecial 206	java/lang/StringBuilder:<init>	()V
    //   157: ldc_w 395
    //   160: astore 9
    //   162: aload 9
    //   164: invokestatic 39	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   167: astore 9
    //   169: aload 7
    //   171: aload 9
    //   173: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: pop
    //   177: aload 7
    //   179: aload_1
    //   180: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: pop
    //   184: bipush 10
    //   186: istore 8
    //   188: aload 7
    //   190: iload 8
    //   192: invokevirtual 325	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   195: pop
    //   196: aload 7
    //   198: invokevirtual 228	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   201: astore 7
    //   203: aload 4
    //   205: aload 7
    //   207: invokevirtual 398	java/io/Writer:append	(Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   210: pop
    //   211: aload_0
    //   212: invokevirtual 124	com/jakewharton/disklrucache/DiskLruCache:Oooo0	()Z
    //   215: istore_3
    //   216: iload_3
    //   217: ifeq +23 -> 240
    //   220: aload_0
    //   221: getfield 88	com/jakewharton/disklrucache/DiskLruCache:o00o0000	Ljava/util/concurrent/ThreadPoolExecutor;
    //   224: astore 4
    //   226: aload_0
    //   227: getfield 95	com/jakewharton/disklrucache/DiskLruCache:o00o000	Ljava/util/concurrent/Callable;
    //   230: astore 7
    //   232: aload 4
    //   234: aload 7
    //   236: invokevirtual 353	java/util/concurrent/AbstractExecutorService:submit	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   239: pop
    //   240: new 400	com/jakewharton/disklrucache/DiskLruCache$Snapshot
    //   243: astore 4
    //   245: aload_2
    //   246: invokestatic 370	com/jakewharton/disklrucache/DiskLruCache$Entry:OooO0OO	(Lcom/jakewharton/disklrucache/DiskLruCache$Entry;)J
    //   249: lstore 13
    //   251: aload_2
    //   252: invokestatic 301	com/jakewharton/disklrucache/DiskLruCache$Entry:OooO00o	(Lcom/jakewharton/disklrucache/DiskLruCache$Entry;)[J
    //   255: astore 15
    //   257: aload 4
    //   259: astore 9
    //   261: aload_0
    //   262: astore 11
    //   264: aload_1
    //   265: astore 12
    //   267: aload 4
    //   269: aload_0
    //   270: aload_1
    //   271: lload 13
    //   273: aload 6
    //   275: aload 15
    //   277: aconst_null
    //   278: invokespecial 403	com/jakewharton/disklrucache/DiskLruCache$Snapshot:<init>	(Lcom/jakewharton/disklrucache/DiskLruCache;Ljava/lang/String;J[Ljava/io/InputStream;[JLcom/jakewharton/disklrucache/DiskLruCache$1;)V
    //   281: aload_0
    //   282: monitorexit
    //   283: aload 4
    //   285: areturn
    //   286: pop
    //   287: aload_0
    //   288: getfield 118	com/jakewharton/disklrucache/DiskLruCache:o00OooO	I
    //   291: istore 16
    //   293: iload 5
    //   295: iload 16
    //   297: if_icmpge +26 -> 323
    //   300: aload 6
    //   302: iload 5
    //   304: aaload
    //   305: astore_1
    //   306: aload_1
    //   307: ifnull +16 -> 323
    //   310: aload_1
    //   311: invokestatic 406	com/jakewharton/disklrucache/Util:OooO00o	(Ljava/io/Closeable;)V
    //   314: iload 5
    //   316: iconst_1
    //   317: iadd
    //   318: istore 5
    //   320: goto -33 -> 287
    //   323: aload_0
    //   324: monitorexit
    //   325: aconst_null
    //   326: areturn
    //   327: astore_1
    //   328: aload_0
    //   329: monitorexit
    //   330: aload_1
    //   331: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	332	0	this	DiskLruCache
    //   0	332	1	paramString	String
    //   15	237	2	localObject1	Object
    //   28	110	3	i	int
    //   215	2	3	bool1	boolean
    //   30	254	4	localObject2	Object
    //   44	3	5	bool2	boolean
    //   59	260	5	j	int
    //   66	235	6	arrayOfInputStream	InputStream[]
    //   72	163	7	localObject3	Object
    //   75	116	8	k	int
    //   78	182	9	localObject4	Object
    //   84	7	10	m	int
    //   96	167	11	localObject5	Object
    //   104	162	12	localObject6	Object
    //   249	23	13	l	long
    //   255	21	15	arrayOfLong	long[]
    //   291	7	16	n	int
    //   286	1	18	localFileNotFoundException	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   80	84	286	java/io/FileNotFoundException
    //   93	96	286	java/io/FileNotFoundException
    //   99	104	286	java/io/FileNotFoundException
    //   108	113	286	java/io/FileNotFoundException
    //   117	120	286	java/io/FileNotFoundException
    //   2	6	327	finally
    //   7	11	327	finally
    //   11	15	327	finally
    //   17	21	327	finally
    //   22	26	327	finally
    //   40	44	327	finally
    //   55	59	327	finally
    //   61	66	327	finally
    //   80	84	327	finally
    //   93	96	327	finally
    //   99	104	327	finally
    //   108	113	327	finally
    //   117	120	327	finally
    //   129	133	327	finally
    //   137	141	327	finally
    //   141	145	327	finally
    //   147	150	327	finally
    //   152	157	327	finally
    //   162	167	327	finally
    //   171	177	327	finally
    //   179	184	327	finally
    //   190	196	327	finally
    //   196	201	327	finally
    //   205	211	327	finally
    //   211	215	327	finally
    //   220	224	327	finally
    //   226	230	327	finally
    //   234	240	327	finally
    //   240	243	327	finally
    //   245	249	327	finally
    //   251	255	327	finally
    //   277	281	327	finally
    //   287	291	327	finally
    //   302	305	327	finally
    //   310	314	327	finally
  }
  
  public final void Oooo0oo()
  {
    OooOoo(this.o00Ooo0);
    Iterator localIterator = this.o0O00o0.values().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      DiskLruCache.Entry localEntry = (DiskLruCache.Entry)localIterator.next();
      Object localObject = DiskLruCache.Entry.OooO0oO(localEntry);
      int i = 0;
      if (localObject == null) {
        for (;;)
        {
          j = this.o00OooO;
          if (i >= j) {
            break;
          }
          long l1 = this.o00OooOO;
          localObject = DiskLruCache.Entry.OooO00o(localEntry);
          long l2 = localObject[i];
          l1 += l2;
          this.o00OooOO = l1;
          i += 1;
        }
      }
      int j = 0;
      localObject = null;
      DiskLruCache.Entry.OooO0oo(localEntry, null);
      for (;;)
      {
        j = this.o00OooO;
        if (i >= j) {
          break;
        }
        OooOoo(localEntry.getCleanFile(i));
        localObject = localEntry.getDirtyFile(i);
        OooOoo((File)localObject);
        i += 1;
      }
      localIterator.remove();
    }
  }
  
  public final void OoooO(String paramString)
  {
    int i = 32;
    int j = paramString.indexOf(i);
    String str1 = m54207b69.F54207b69_11("vs061E180E071B160E1E205D2428130F2C223065322E322C606B");
    int k = -1;
    if (j != k)
    {
      int m = j + 1;
      i = paramString.indexOf(i, m);
      String str2;
      if (i == k)
      {
        str2 = paramString.substring(m);
        int n = 6;
        if (j == n)
        {
          localObject1 = m54207b69.F54207b69_11(">d36222B2E3626");
          boolean bool3 = paramString.startsWith((String)localObject1);
          if (bool3) {
            this.o0O00o0.remove(str2);
          }
        }
      }
      else
      {
        str2 = paramString.substring(m, i);
      }
      Object localObject1 = (DiskLruCache.Entry)this.o0O00o0.get(str2);
      Object localObject2;
      if (localObject1 == null)
      {
        localObject1 = new com/jakewharton/disklrucache/DiskLruCache$Entry;
        ((DiskLruCache.Entry)localObject1).<init>(this, str2, null);
        localObject2 = this.o0O00o0;
        ((AbstractMap)localObject2).put(str2, localObject1);
      }
      m = 5;
      if ((i != k) && (j == m))
      {
        localObject2 = m54207b69.F54207b69_11("G@030D070412");
        boolean bool4 = paramString.startsWith((String)localObject2);
        if (bool4)
        {
          j = 1;
          i += j;
          paramString = paramString.substring(i);
          localObject3 = " ";
          paramString = paramString.split((String)localObject3);
          DiskLruCache.Entry.OooO0o((DiskLruCache.Entry)localObject1, j);
          DiskLruCache.Entry.OooO0oo((DiskLruCache.Entry)localObject1, null);
          DiskLruCache.Entry.OooO((DiskLruCache.Entry)localObject1, paramString);
          break label323;
        }
      }
      if ((i == k) && (j == m))
      {
        str2 = m54207b69.F54207b69_11("F:7E746A7167");
        boolean bool2 = paramString.startsWith(str2);
        if (bool2)
        {
          paramString = new com/jakewharton/disklrucache/DiskLruCache$Editor;
          paramString.<init>(this, (DiskLruCache.Entry)localObject1, null);
          DiskLruCache.Entry.OooO0oo((DiskLruCache.Entry)localObject1, paramString);
          break label323;
        }
      }
      if (i == k)
      {
        i = 4;
        if (j == i)
        {
          localObject3 = m54207b69.F54207b69_11("Z<6E7A7F7B");
          boolean bool1 = paramString.startsWith((String)localObject3);
          if (bool1) {
            label323:
            return;
          }
        }
      }
      localObject3 = new java/io/IOException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(str1);
      localStringBuilder.append(paramString);
      paramString = localStringBuilder.toString();
      ((IOException)localObject3).<init>(paramString);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new java/io/IOException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(str1);
    localStringBuilder.append(paramString);
    paramString = localStringBuilder.toString();
    ((IOException)localObject3).<init>(paramString);
    throw ((Throwable)localObject3);
  }
  
  public final void OoooO0()
  {
    String str1 = ", ";
    StrictLineReader localStrictLineReader = new com/jakewharton/disklrucache/StrictLineReader;
    Object localObject2 = new java/io/FileInputStream;
    Object localObject3 = this.o00Ooo00;
    ((FileInputStream)localObject2).<init>((File)localObject3);
    localObject3 = Util.OooO00o;
    localStrictLineReader.<init>((InputStream)localObject2, (Charset)localObject3);
    try
    {
      localObject2 = localStrictLineReader.OooO0Oo();
      localObject3 = localStrictLineReader.OooO0Oo();
      Object localObject4 = localStrictLineReader.OooO0Oo();
      String str2 = localStrictLineReader.OooO0Oo();
      String str3 = localStrictLineReader.OooO0Oo();
      Object localObject5 = "5T383E383A3F2B37814544841B49344D27363229484B5147";
      localObject5 = m54207b69.F54207b69_11((String)localObject5);
      boolean bool1 = ((String)localObject5).equals(localObject2);
      if (bool1)
      {
        localObject5 = "1";
        bool1 = ((String)localObject5).equals(localObject3);
        if (bool1)
        {
          int i = this.o00Ooo0o;
          localObject5 = Integer.toString(i);
          boolean bool2 = ((String)localObject5).equals(localObject4);
          if (bool2)
          {
            int j = this.o00OooO;
            localObject4 = Integer.toString(j);
            boolean bool3 = ((String)localObject4).equals(str2);
            if (bool3)
            {
              localObject4 = "";
              bool3 = ((String)localObject4).equals(str3);
              if (bool3)
              {
                int k = 0;
                str1 = null;
                try
                {
                  for (;;)
                  {
                    localObject2 = localStrictLineReader.OooO0Oo();
                    OoooO((String)localObject2);
                    k += 1;
                  }
                  int m;
                  localObject4 = new java/io/IOException;
                }
                catch (EOFException localEOFException)
                {
                  localObject2 = this.o0O00o0;
                  m = ((AbstractMap)localObject2).size();
                  k -= m;
                  this.o00OoooO = k;
                  return;
                }
              }
            }
          }
        }
      }
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      String str4 = "DN3B212D39423033413333782F2D484A2F3F3380393F444042548D8830";
      str4 = m54207b69.F54207b69_11(str4);
      ((StringBuilder)localObject5).append(str4);
      ((StringBuilder)localObject5).append((String)localObject2);
      ((StringBuilder)localObject5).append(str1);
      ((StringBuilder)localObject5).append((String)localObject3);
      ((StringBuilder)localObject5).append(str1);
      ((StringBuilder)localObject5).append(str2);
      ((StringBuilder)localObject5).append(str1);
      ((StringBuilder)localObject5).append(str3);
      str1 = "]";
      ((StringBuilder)localObject5).append(str1);
      str1 = ((StringBuilder)localObject5).toString();
      ((IOException)localObject4).<init>(str1);
      throw ((Throwable)localObject4);
    }
    finally
    {
      Util.OooO00o(localStrictLineReader);
    }
  }
  
  /* Error */
  public final void OoooOOo()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 126	com/jakewharton/disklrucache/DiskLruCache:o00OooOo	Ljava/io/Writer;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +7 -> 15
    //   11: aload_1
    //   12: invokevirtual 505	java/io/Writer:close	()V
    //   15: new 181	java/io/BufferedWriter
    //   18: astore_1
    //   19: new 183	java/io/OutputStreamWriter
    //   22: astore_2
    //   23: new 185	java/io/FileOutputStream
    //   26: astore_3
    //   27: aload_0
    //   28: getfield 112	com/jakewharton/disklrucache/DiskLruCache:o00Ooo0	Ljava/io/File;
    //   31: astore 4
    //   33: aload_3
    //   34: aload 4
    //   36: invokespecial 506	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   39: getstatic 191	com/jakewharton/disklrucache/Util:OooO00o	Ljava/nio/charset/Charset;
    //   42: astore 4
    //   44: aload_2
    //   45: aload_3
    //   46: aload 4
    //   48: invokespecial 194	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   51: aload_1
    //   52: aload_2
    //   53: invokespecial 197	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   56: ldc_w 483
    //   59: astore_2
    //   60: aload_2
    //   61: invokestatic 39	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   64: astore_2
    //   65: aload_1
    //   66: aload_2
    //   67: invokevirtual 330	java/io/Writer:write	(Ljava/lang/String;)V
    //   70: ldc_w 508
    //   73: astore_2
    //   74: aload_1
    //   75: aload_2
    //   76: invokevirtual 330	java/io/Writer:write	(Ljava/lang/String;)V
    //   79: ldc_w 489
    //   82: astore_2
    //   83: aload_1
    //   84: aload_2
    //   85: invokevirtual 330	java/io/Writer:write	(Ljava/lang/String;)V
    //   88: ldc_w 508
    //   91: astore_2
    //   92: aload_1
    //   93: aload_2
    //   94: invokevirtual 330	java/io/Writer:write	(Ljava/lang/String;)V
    //   97: aload_0
    //   98: getfield 99	com/jakewharton/disklrucache/DiskLruCache:o00Ooo0o	I
    //   101: istore 5
    //   103: iload 5
    //   105: invokestatic 493	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   108: astore_2
    //   109: aload_1
    //   110: aload_2
    //   111: invokevirtual 330	java/io/Writer:write	(Ljava/lang/String;)V
    //   114: ldc_w 508
    //   117: astore_2
    //   118: aload_1
    //   119: aload_2
    //   120: invokevirtual 330	java/io/Writer:write	(Ljava/lang/String;)V
    //   123: aload_0
    //   124: getfield 118	com/jakewharton/disklrucache/DiskLruCache:o00OooO	I
    //   127: istore 5
    //   129: iload 5
    //   131: invokestatic 493	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   134: astore_2
    //   135: aload_1
    //   136: aload_2
    //   137: invokevirtual 330	java/io/Writer:write	(Ljava/lang/String;)V
    //   140: ldc_w 508
    //   143: astore_2
    //   144: aload_1
    //   145: aload_2
    //   146: invokevirtual 330	java/io/Writer:write	(Ljava/lang/String;)V
    //   149: ldc_w 508
    //   152: astore_2
    //   153: aload_1
    //   154: aload_2
    //   155: invokevirtual 330	java/io/Writer:write	(Ljava/lang/String;)V
    //   158: aload_0
    //   159: getfield 68	com/jakewharton/disklrucache/DiskLruCache:o0O00o0	Ljava/util/LinkedHashMap;
    //   162: astore_2
    //   163: aload_2
    //   164: invokevirtual 412	java/util/LinkedHashMap:values	()Ljava/util/Collection;
    //   167: astore_2
    //   168: aload_2
    //   169: invokeinterface 418 1 0
    //   174: astore_2
    //   175: aload_2
    //   176: invokeinterface 423 1 0
    //   181: istore 6
    //   183: iload 6
    //   185: ifeq +167 -> 352
    //   188: aload_2
    //   189: invokeinterface 427 1 0
    //   194: astore_3
    //   195: aload_3
    //   196: checkcast 273	com/jakewharton/disklrucache/DiskLruCache$Entry
    //   199: astore_3
    //   200: aload_3
    //   201: invokestatic 277	com/jakewharton/disklrucache/DiskLruCache$Entry:OooO0oO	(Lcom/jakewharton/disklrucache/DiskLruCache$Entry;)Lcom/jakewharton/disklrucache/DiskLruCache$Editor;
    //   204: astore 4
    //   206: bipush 10
    //   208: istore 7
    //   210: aload 4
    //   212: ifnull +67 -> 279
    //   215: new 205	java/lang/StringBuilder
    //   218: astore 4
    //   220: aload 4
    //   222: invokespecial 206	java/lang/StringBuilder:<init>	()V
    //   225: ldc_w 382
    //   228: astore 8
    //   230: aload 8
    //   232: invokestatic 39	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   235: astore 8
    //   237: aload 4
    //   239: aload 8
    //   241: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: pop
    //   245: aload_3
    //   246: invokestatic 319	com/jakewharton/disklrucache/DiskLruCache$Entry:OooO0O0	(Lcom/jakewharton/disklrucache/DiskLruCache$Entry;)Ljava/lang/String;
    //   249: astore_3
    //   250: aload 4
    //   252: aload_3
    //   253: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: pop
    //   257: aload 4
    //   259: iload 7
    //   261: invokevirtual 325	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   264: pop
    //   265: aload 4
    //   267: invokevirtual 228	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   270: astore_3
    //   271: aload_1
    //   272: aload_3
    //   273: invokevirtual 330	java/io/Writer:write	(Ljava/lang/String;)V
    //   276: goto -101 -> 175
    //   279: new 205	java/lang/StringBuilder
    //   282: astore 4
    //   284: aload 4
    //   286: invokespecial 206	java/lang/StringBuilder:<init>	()V
    //   289: ldc_w 316
    //   292: astore 8
    //   294: aload 8
    //   296: invokestatic 39	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   299: astore 8
    //   301: aload 4
    //   303: aload 8
    //   305: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: pop
    //   309: aload_3
    //   310: invokestatic 319	com/jakewharton/disklrucache/DiskLruCache$Entry:OooO0O0	(Lcom/jakewharton/disklrucache/DiskLruCache$Entry;)Ljava/lang/String;
    //   313: astore 8
    //   315: aload 4
    //   317: aload 8
    //   319: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: pop
    //   323: aload_3
    //   324: invokevirtual 322	com/jakewharton/disklrucache/DiskLruCache$Entry:getLengths	()Ljava/lang/String;
    //   327: astore_3
    //   328: aload 4
    //   330: aload_3
    //   331: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: pop
    //   335: aload 4
    //   337: iload 7
    //   339: invokevirtual 325	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   342: pop
    //   343: aload 4
    //   345: invokevirtual 228	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   348: astore_3
    //   349: goto -78 -> 271
    //   352: aload_1
    //   353: invokevirtual 505	java/io/Writer:close	()V
    //   356: aload_0
    //   357: getfield 108	com/jakewharton/disklrucache/DiskLruCache:o00Ooo00	Ljava/io/File;
    //   360: astore_1
    //   361: aload_1
    //   362: invokevirtual 145	java/io/File:exists	()Z
    //   365: istore 9
    //   367: iconst_1
    //   368: istore 5
    //   370: iload 9
    //   372: ifeq +20 -> 392
    //   375: aload_0
    //   376: getfield 108	com/jakewharton/disklrucache/DiskLruCache:o00Ooo00	Ljava/io/File;
    //   379: astore_1
    //   380: aload_0
    //   381: getfield 116	com/jakewharton/disklrucache/DiskLruCache:o00Ooo0O	Ljava/io/File;
    //   384: astore_3
    //   385: aload_1
    //   386: aload_3
    //   387: iload 5
    //   389: invokestatic 170	com/jakewharton/disklrucache/DiskLruCache:OoooOoo	(Ljava/io/File;Ljava/io/File;Z)V
    //   392: aload_0
    //   393: getfield 112	com/jakewharton/disklrucache/DiskLruCache:o00Ooo0	Ljava/io/File;
    //   396: astore_1
    //   397: aload_0
    //   398: getfield 108	com/jakewharton/disklrucache/DiskLruCache:o00Ooo00	Ljava/io/File;
    //   401: astore_3
    //   402: aconst_null
    //   403: astore 4
    //   405: aload_1
    //   406: aload_3
    //   407: iconst_0
    //   408: invokestatic 170	com/jakewharton/disklrucache/DiskLruCache:OoooOoo	(Ljava/io/File;Ljava/io/File;Z)V
    //   411: aload_0
    //   412: getfield 116	com/jakewharton/disklrucache/DiskLruCache:o00Ooo0O	Ljava/io/File;
    //   415: astore_1
    //   416: aload_1
    //   417: invokevirtual 148	java/io/File:delete	()Z
    //   420: pop
    //   421: new 181	java/io/BufferedWriter
    //   424: astore_1
    //   425: new 183	java/io/OutputStreamWriter
    //   428: astore_3
    //   429: new 185	java/io/FileOutputStream
    //   432: astore 4
    //   434: aload_0
    //   435: getfield 108	com/jakewharton/disklrucache/DiskLruCache:o00Ooo00	Ljava/io/File;
    //   438: astore 10
    //   440: aload 4
    //   442: aload 10
    //   444: iload 5
    //   446: invokespecial 188	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   449: getstatic 191	com/jakewharton/disklrucache/Util:OooO00o	Ljava/nio/charset/Charset;
    //   452: astore_2
    //   453: aload_3
    //   454: aload 4
    //   456: aload_2
    //   457: invokespecial 194	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   460: aload_1
    //   461: aload_3
    //   462: invokespecial 197	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   465: aload_0
    //   466: aload_1
    //   467: putfield 126	com/jakewharton/disklrucache/DiskLruCache:o00OooOo	Ljava/io/Writer;
    //   470: aload_0
    //   471: monitorexit
    //   472: return
    //   473: astore_2
    //   474: aload_1
    //   475: invokevirtual 505	java/io/Writer:close	()V
    //   478: aload_2
    //   479: athrow
    //   480: astore_1
    //   481: aload_0
    //   482: monitorexit
    //   483: aload_1
    //   484: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	485	0	this	DiskLruCache
    //   6	469	1	localObject1	Object
    //   480	4	1	localObject2	Object
    //   22	435	2	localObject3	Object
    //   473	6	2	localObject4	Object
    //   26	436	3	localObject5	Object
    //   31	424	4	localObject6	Object
    //   101	344	5	i	int
    //   181	3	6	bool1	boolean
    //   208	130	7	c	char
    //   228	90	8	str	String
    //   365	6	9	bool2	boolean
    //   438	5	10	localFile	File
    // Exception table:
    //   from	to	target	type
    //   60	64	473	finally
    //   66	70	473	finally
    //   75	79	473	finally
    //   84	88	473	finally
    //   93	97	473	finally
    //   97	101	473	finally
    //   103	108	473	finally
    //   110	114	473	finally
    //   119	123	473	finally
    //   123	127	473	finally
    //   129	134	473	finally
    //   136	140	473	finally
    //   145	149	473	finally
    //   154	158	473	finally
    //   158	162	473	finally
    //   163	167	473	finally
    //   168	174	473	finally
    //   175	181	473	finally
    //   188	194	473	finally
    //   195	199	473	finally
    //   200	204	473	finally
    //   215	218	473	finally
    //   220	225	473	finally
    //   230	235	473	finally
    //   239	245	473	finally
    //   245	249	473	finally
    //   252	257	473	finally
    //   259	265	473	finally
    //   265	270	473	finally
    //   272	276	473	finally
    //   279	282	473	finally
    //   284	289	473	finally
    //   294	299	473	finally
    //   303	309	473	finally
    //   309	313	473	finally
    //   317	323	473	finally
    //   323	327	473	finally
    //   330	335	473	finally
    //   337	343	473	finally
    //   343	348	473	finally
    //   2	6	480	finally
    //   11	15	480	finally
    //   15	18	480	finally
    //   19	22	480	finally
    //   23	26	480	finally
    //   27	31	480	finally
    //   34	39	480	finally
    //   39	42	480	finally
    //   46	51	480	finally
    //   52	56	480	finally
    //   352	356	480	finally
    //   356	360	480	finally
    //   361	365	480	finally
    //   375	379	480	finally
    //   380	384	480	finally
    //   387	392	480	finally
    //   392	396	480	finally
    //   397	401	480	finally
    //   407	411	480	finally
    //   411	415	480	finally
    //   416	421	480	finally
    //   421	424	480	finally
    //   425	428	480	finally
    //   429	432	480	finally
    //   434	438	480	finally
    //   444	449	480	finally
    //   449	452	480	finally
    //   456	460	480	finally
    //   461	465	480	finally
    //   466	470	480	finally
    //   474	478	480	finally
    //   478	480	480	finally
  }
  
  public boolean OoooOoO(String paramString)
  {
    try
    {
      OooOOo();
      Ooooo0o(paramString);
      Object localObject1 = this.o0O00o0;
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
            int j = this.o00OooO;
            if (i >= j) {
              break;
            }
            localObject2 = ((DiskLruCache.Entry)localObject1).getCleanFile(i);
            boolean bool1 = ((File)localObject2).exists();
            if (bool1)
            {
              bool1 = ((File)localObject2).delete();
              if (!bool1)
              {
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
              }
            }
            long l1 = this.o00OooOO;
            long[] arrayOfLong = DiskLruCache.Entry.OooO00o((DiskLruCache.Entry)localObject1);
            long l2 = arrayOfLong[i];
            l1 -= l2;
            this.o00OooOO = l1;
            localObject2 = DiskLruCache.Entry.OooO00o((DiskLruCache.Entry)localObject1);
            long l3 = 0L;
            localObject2[i] = l3;
            i += 1;
          }
          int k = this.o00OoooO;
          i = 1;
          int m;
          k += i;
          this.o00OoooO = m;
          localObject1 = this.o00OooOo;
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
          localObject1 = this.o0O00o0;
          ((AbstractMap)localObject1).remove(paramString);
          boolean bool2 = Oooo0();
          if (bool2)
          {
            paramString = this.o00o0000;
            localObject1 = this.o00o000;
            paramString.submit((Callable)localObject1);
          }
          return i;
        }
      }
      return false;
    }
    finally {}
  }
  
  public final void Ooooo00()
  {
    for (;;)
    {
      long l1 = this.o00OooOO;
      long l2 = this.o00OooO0;
      boolean bool = l1 < l2;
      if (!bool) {
        break;
      }
      String str = (String)((Map.Entry)this.o0O00o0.entrySet().iterator().next()).getKey();
      OoooOoO(str);
    }
  }
  
  public final void Ooooo0o(String paramString)
  {
    Object localObject = o00o000O.matcher(paramString);
    boolean bool = ((Matcher)localObject).matches();
    if (bool) {
      return;
    }
    localObject = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("yY323D222D7D39323135823E4339473F883B4D504F358E184F8C3C838F7C23922342899792914989A0A3");
    localStringBuilder.append(str);
    localStringBuilder.append(paramString);
    localStringBuilder.append("\"");
    paramString = localStringBuilder.toString();
    ((IllegalArgumentException)localObject).<init>(paramString);
    throw ((Throwable)localObject);
  }
  
  public void close()
  {
    try
    {
      Object localObject1 = this.o00OooOo;
      if (localObject1 == null) {
        return;
      }
      localObject1 = new java/util/ArrayList;
      Object localObject3 = this.o0O00o0;
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
      Ooooo00();
      localObject1 = this.o00OooOo;
      ((Writer)localObject1).close();
      localObject1 = null;
      this.o00OooOo = null;
      return;
    }
    finally {}
  }
  
  public File getDirectory()
  {
    return this.o00OoOoo;
  }
  
  public long getMaxSize()
  {
    try
    {
      long l = this.o00OooO0;
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public boolean isClosed()
  {
    try
    {
      Writer localWriter = this.o00OooOo;
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
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void setMaxSize(long paramLong)
  {
    try
    {
      this.o00OooO0 = paramLong;
      ThreadPoolExecutor localThreadPoolExecutor = this.o00o0000;
      Callable localCallable = this.o00o000;
      localThreadPoolExecutor.submit(localCallable);
      return;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.jakewharton.disklrucache.DiskLruCache
 * JD-Core Version:    0.7.0.1
 */