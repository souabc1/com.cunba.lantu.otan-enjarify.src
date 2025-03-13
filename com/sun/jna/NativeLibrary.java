package com.sun.jna;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import m54207b69;

public class NativeLibrary
{
  public static final Level OooO;
  public static final Logger OooO0oo;
  public static final Map OooOO0;
  public static final Map OooOO0O;
  public static final LinkedHashSet OooOO0o;
  public static Method OooOOO0;
  public long OooO00o;
  public final String OooO0O0;
  public final String OooO0OO;
  public final Map OooO0Oo;
  public String OooO0o;
  public final int OooO0o0;
  public final Map OooO0oO;
  
  static
  {
    Object localObject1 = Throwable.class;
    Object localObject3 = NativeLibrary.class;
    Object localObject4 = Logger.getLogger(((Class)localObject3).getName());
    OooO0oo = (Logger)localObject4;
    boolean bool1 = Native.OooO0Oo;
    if (bool1) {
      localObject4 = Level.INFO;
    } else {
      localObject4 = Level.FINE;
    }
    OooO = (Level)localObject4;
    localObject4 = new java/util/HashMap;
    ((HashMap)localObject4).<init>();
    OooOO0 = (Map)localObject4;
    localObject4 = new java/util/HashMap;
    ((HashMap)localObject4).<init>();
    OooOO0O = Collections.synchronizedMap((Map)localObject4);
    localObject4 = new java/util/LinkedHashSet;
    ((LinkedHashSet)localObject4).<init>();
    OooOO0o = (LinkedHashSet)localObject4;
    int i = Native.OooOO0o;
    int j;
    Object localObject5;
    if (i != 0)
    {
      localObject4 = null;
      OooOOO0 = null;
      i = 1;
      j = 0;
      localObject5 = "f_3E3C3D0F2E3435344235364547";
    }
    try
    {
      try
      {
        localObject5 = m54207b69.F54207b69_11((String)localObject5);
        localObject6 = new Class[i];
        localObject6[0] = localObject1;
        localObject1 = ((Class)localObject1).getMethod((String)localObject5, (Class[])localObject6);
        OooOOO0 = (Method)localObject1;
      }
      catch (SecurityException localSecurityException)
      {
        localObject3 = Logger.getLogger(((Class)localObject3).getName());
        localObject5 = Level.SEVERE;
        localObject6 = m54207b69.F54207b69_11("Ei2F09020810124F240E520A120C2A0E171511251F5D631E242553363435382A393A2D2F716D293244292F37");
        ((Logger)localObject3).log((Level)localObject5, (String)localObject6, localSecurityException);
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Object localObject6;
      label167:
      Object localObject2;
      boolean bool3;
      boolean bool4;
      int k;
      Object localObject7;
      Object localObject8;
      String str1;
      boolean bool5;
      String str2;
      String str3;
      String str4;
      String str5;
      String str6;
      String str7;
      String str8;
      int n;
      boolean bool2;
      break label167;
    }
    localObject2 = Native.OooOo0(m54207b69.F54207b69_11("0%4F4C4E44505B5B4B594F57"));
    if (localObject2 != null)
    {
      localObject3 = OooOO0o;
      ((AbstractCollection)localObject3).add(localObject2);
    }
    localObject2 = m54207b69.F54207b69_11("]E2F2C266E392E2A382B33413377363A364735494F7F4A3A4845");
    localObject3 = System.getProperty((String)localObject2);
    if (localObject3 == null)
    {
      bool3 = Platform.isWindows();
      if (!bool3)
      {
        bool3 = Platform.isLinux();
        localObject5 = "";
        if (!bool3)
        {
          bool3 = Platform.isSolaris();
          if (!bool3)
          {
            bool3 = Platform.isFreeBSD();
            if (!bool3)
            {
              bool3 = Platform.iskFreeBSD();
              if (!bool3)
              {
                localObject3 = localObject5;
                break label324;
              }
            }
          }
        }
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        bool4 = Platform.isSolaris();
        if (bool4) {
          localObject6 = "/";
        } else {
          localObject6 = localObject5;
        }
        ((StringBuilder)localObject3).append((String)localObject6);
        k = Native.OooOO0o * 8;
        ((StringBuilder)localObject3).append(k);
        localObject3 = ((StringBuilder)localObject3).toString();
        label324:
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        localObject7 = m54207b69.F54207b69_11("O\\732A313177353B45");
        ((StringBuilder)localObject6).append((String)localObject7);
        ((StringBuilder)localObject6).append((String)localObject3);
        localObject6 = ((StringBuilder)localObject6).toString();
        localObject8 = new java/lang/StringBuilder;
        ((StringBuilder)localObject8).<init>();
        str1 = m54207b69.F54207b69_11("\\p5F1D1B15");
        ((StringBuilder)localObject8).append(str1);
        ((StringBuilder)localObject8).append((String)localObject3);
        localObject8 = ((StringBuilder)localObject8).toString();
        String[] tmp406_403 = new String[4];
        String[] tmp407_406 = tmp406_403;
        String[] tmp407_406 = tmp406_403;
        tmp407_406[0] = localObject6;
        tmp407_406[1] = localObject8;
        tmp407_406[2] = localObject7;
        String[] tmp420_407 = tmp407_406;
        tmp420_407[3] = str1;
        localObject6 = tmp420_407;
        bool5 = Platform.isLinux();
        if (!bool5)
        {
          bool5 = Platform.iskFreeBSD();
          if (!bool5)
          {
            bool5 = Platform.isGNU();
            if (!bool5) {
              break label655;
            }
          }
        }
        localObject6 = getMultiArchPath();
        localObject8 = new java/lang/StringBuilder;
        ((StringBuilder)localObject8).<init>();
        str2 = m54207b69.F54207b69_11("el431A212147050B154B");
        ((StringBuilder)localObject8).append(str2);
        ((StringBuilder)localObject8).append((String)localObject6);
        str3 = ((StringBuilder)localObject8).toString();
        localObject8 = new java/lang/StringBuilder;
        ((StringBuilder)localObject8).<init>();
        str2 = m54207b69.F54207b69_11("C.0143494F05");
        ((StringBuilder)localObject8).append(str2);
        ((StringBuilder)localObject8).append((String)localObject6);
        str4 = ((StringBuilder)localObject8).toString();
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        ((StringBuilder)localObject6).append((String)localObject7);
        ((StringBuilder)localObject6).append((String)localObject3);
        str5 = ((StringBuilder)localObject6).toString();
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        ((StringBuilder)localObject6).append(str1);
        ((StringBuilder)localObject6).append((String)localObject3);
        str6 = ((StringBuilder)localObject6).toString();
        str7 = m54207b69.F54207b69_11("O\\732A313177353B45");
        str8 = m54207b69.F54207b69_11("\\p5F1D1B15");
        String[] tmp625_622 = new String[6];
        String[] tmp626_625 = tmp625_622;
        String[] tmp626_625 = tmp625_622;
        tmp626_625[0] = str3;
        tmp626_625[1] = str4;
        String[] tmp635_626 = tmp626_625;
        String[] tmp635_626 = tmp626_625;
        tmp635_626[2] = str5;
        tmp635_626[3] = str6;
        tmp635_626[4] = str7;
        String[] tmp648_635 = tmp635_626;
        tmp648_635[5] = str8;
        localObject6 = tmp648_635;
        label655:
        bool3 = Platform.isLinux();
        if (bool3)
        {
          localObject3 = getLinuxLdPaths();
          n = localObject6.length - i;
          while (n >= 0)
          {
            localObject4 = localObject6[n];
            i = ((ArrayList)localObject3).indexOf(localObject4);
            int m = -1;
            if (i != m) {
              ((ArrayList)localObject3).remove(i);
            }
            localObject4 = localObject6[n];
            ((ArrayList)localObject3).add(0, localObject4);
            n += -1;
          }
          localObject4 = new String[0];
          localObject3 = ((ArrayList)localObject3).toArray((Object[])localObject4);
          localObject6 = localObject3;
          localObject6 = (String[])localObject3;
        }
        localObject3 = localObject5;
        localObject4 = localObject5;
        for (;;)
        {
          n = localObject6.length;
          if (j >= n) {
            break;
          }
          localObject7 = new java/io/File;
          localObject8 = localObject6[j];
          ((File)localObject7).<init>((String)localObject8);
          boolean bool6 = ((File)localObject7).exists();
          if (bool6)
          {
            boolean bool7 = ((File)localObject7).isDirectory();
            if (bool7)
            {
              localObject7 = new java/lang/StringBuilder;
              ((StringBuilder)localObject7).<init>();
              ((StringBuilder)localObject7).append((String)localObject3);
              ((StringBuilder)localObject7).append((String)localObject4);
              localObject3 = localObject6[j];
              ((StringBuilder)localObject7).append((String)localObject3);
              localObject3 = ((StringBuilder)localObject7).toString();
              localObject4 = File.pathSeparator;
            }
          }
          j += 1;
        }
        bool2 = ((String)localObject5).equals(localObject3);
        if (!bool2) {
          System.setProperty((String)localObject2, (String)localObject3);
        }
      }
    }
    localObject3 = OooOO0o;
    localObject2 = OooOOO((String)localObject2);
    ((AbstractCollection)localObject3).addAll((Collection)localObject2);
    return;
    localObject2 = new java/lang/Error;
    localObject3 = m54207b69.F54207b69_11("U/614F5D495D4F154A4E56675969631D50506C2159555B715D665C60706668");
    ((Error)localObject2).<init>((String)localObject3);
    throw ((Throwable)localObject2);
  }
  
  public NativeLibrary(String paramString1, String paramString2, long paramLong, Map paramMap)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO0Oo = localHashMap;
    paramString1 = OooOO0o(paramString1);
    this.OooO0O0 = paramString1;
    this.OooO0OO = paramString2;
    this.OooO00o = paramLong;
    paramString2 = m54207b69.F54207b69_11("uZ393C38393739437E413E3E374B413C424545");
    paramString2 = paramMap.get(paramString2);
    boolean bool1 = paramString2 instanceof Number;
    int i;
    if (bool1)
    {
      paramString2 = (Number)paramString2;
      i = paramString2.intValue();
    }
    else
    {
      i = 0;
      paramString2 = null;
    }
    this.OooO0o0 = i;
    this.OooO0oO = paramMap;
    String str1 = m54207b69.F54207b69_11("fv050306221C16611A201E231D2B251F");
    str1 = (String)paramMap.get(str1);
    this.OooO0o = str1;
    if (str1 == null)
    {
      str1 = Native.getDefaultStringEncoding();
      this.OooO0o = str1;
    }
    bool1 = Platform.isWindows();
    if (bool1)
    {
      str1 = m54207b69.F54207b69_11(">w1C13071C16204A4C");
      paramString1 = paramString1.toLowerCase();
      boolean bool2 = str1.equals(paramString1);
      if (bool2) {
        try
        {
          paramString1 = new com/sun/jna/NativeLibrary$1;
          String str2 = "ZH0F2E3E072D40421442433145";
          str2 = m54207b69.F54207b69_11(str2);
          int j = 63;
          String str3 = this.OooO0o;
          paramString1.<init>(this, this, str2, j, str3);
          str1 = "ZH0F2E3E072D40421442433145";
          str1 = m54207b69.F54207b69_11(str1);
          String str4 = this.OooO0o;
          paramString2 = OooO0o(str1, i, str4);
          localHashMap.put(paramString2, paramString1);
        }
        finally {}
      }
    }
  }
  
  public static void OooO0O0(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    String str = m54207b69.F54207b69_11("q.685049454F4F14614917575A4E4F1C5E5A5B8F6E72737262757665657F687865616B");
    Method localMethod = OooOOO0;
    if (localMethod == null) {
      return;
    }
    try
    {
      paramThrowable2 = new Object[] { paramThrowable2 };
      localMethod.invoke(paramThrowable1, paramThrowable2);
      return;
    }
    catch (InvocationTargetException paramThrowable1)
    {
      paramThrowable2 = new java/lang/RuntimeException;
      paramThrowable2.<init>(str, paramThrowable1);
      throw paramThrowable2;
    }
    catch (IllegalArgumentException paramThrowable1)
    {
      paramThrowable2 = new java/lang/RuntimeException;
      paramThrowable2.<init>(str, paramThrowable1);
      throw paramThrowable2;
    }
    catch (IllegalAccessException paramThrowable1)
    {
      paramThrowable2 = new java/lang/RuntimeException;
      paramThrowable2.<init>(str, paramThrowable1);
      throw paramThrowable2;
    }
  }
  
  public static void OooO0Oo()
  {
    synchronized (OooOO0)
    {
      Object localObject2 = new java/util/LinkedHashSet;
      Collection localCollection = ((Map)???).values();
      ((LinkedHashSet)localObject2).<init>(localCollection);
      ??? = ((Set)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)???).hasNext();
        if (!bool) {
          break;
        }
        localObject2 = (NativeLibrary)((Reference)((Iterator)???).next()).get();
        if (localObject2 != null) {
          ((NativeLibrary)localObject2).OooO0OO();
        }
      }
      return;
    }
  }
  
  public static String OooO0o(String paramString1, int paramInt, String paramString2)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(paramString1);
    paramString1 = "|";
    localStringBuilder.append(paramString1);
    localStringBuilder.append(paramInt);
    localStringBuilder.append(paramString1);
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  public static String OooO0o0(String paramString, Collection paramCollection)
  {
    Object localObject1 = new java/io/File;
    ((File)localObject1).<init>(paramString);
    boolean bool1 = ((File)localObject1).isAbsolute();
    if (bool1) {
      return paramString;
    }
    paramString = OooOOo0(paramString);
    paramCollection = paramCollection.iterator();
    File localFile;
    do
    {
      boolean bool2;
      do
      {
        boolean bool3;
        do
        {
          bool1 = paramCollection.hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = (String)paramCollection.next();
          localObject2 = new java/io/File;
          ((File)localObject2).<init>((String)localObject1, paramString);
          bool2 = ((File)localObject2).exists();
          if (bool2) {
            return ((File)localObject2).getAbsolutePath();
          }
          bool3 = Platform.isMac();
        } while (!bool3);
        localObject2 = m54207b69.F54207b69_11("1+0550544A464E");
        bool2 = paramString.endsWith((String)localObject2);
      } while (!bool2);
      localFile = new java/io/File;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      int i = paramString.lastIndexOf((String)localObject2);
      Object localObject2 = paramString.substring(0, i);
      localStringBuilder.append((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("j.0045424A464C52");
      localStringBuilder.append((String)localObject2);
      localObject2 = localStringBuilder.toString();
      localFile.<init>((String)localObject1, (String)localObject2);
      bool1 = localFile.exists();
    } while (!bool1);
    paramString = localFile.getAbsolutePath();
    return paramString;
  }
  
  public static final NativeLibrary OooOO0(String paramString)
  {
    Map localMap = Collections.emptyMap();
    return OooOO0O(paramString, localMap);
  }
  
  public static final NativeLibrary OooOO0O(String paramString, Map arg1)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(???);
    ??? = m54207b69.F54207b69_11("uZ393C38393739437E413E3E374B413C424545");
    ??? = localHashMap.get(???);
    if (??? == null)
    {
      ??? = m54207b69.F54207b69_11("uZ393C38393739437E413E3E374B413C424545");
      localObject1 = Integer.valueOf(0);
      localHashMap.put(???, localObject1);
    }
    boolean bool = Platform.isLinux();
    Object localObject1 = null;
    if (!bool)
    {
      bool = Platform.isFreeBSD();
      if (!bool)
      {
        bool = Platform.isAIX();
        if (!bool) {
          break label97;
        }
      }
    }
    ??? = Platform.OooO0o;
    bool = ???.equals(paramString);
    if (bool) {
      paramString = null;
    }
    synchronized (OooOO0)
    {
      label97:
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(localHashMap);
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject2 = ???.get(localObject2);
      localObject2 = (Reference)localObject2;
      if (localObject2 != null)
      {
        localObject2 = ((Reference)localObject2).get();
        localObject2 = (NativeLibrary)localObject2;
      }
      else
      {
        localObject2 = null;
      }
      if (localObject2 == null)
      {
        if (paramString == null)
        {
          paramString = new com/sun/jna/NativeLibrary;
          localObject2 = "sC7F34332F242B363785";
          localObject2 = m54207b69.F54207b69_11((String)localObject2);
          localObject3 = null;
          int i = OooOo00(localHashMap);
          long l = Native.open(null, i);
          localObject1 = paramString;
          paramString.<init>((String)localObject2, null, l, localHashMap);
        }
        else
        {
          paramString = OooOOOo(paramString, localHashMap);
        }
        localObject2 = paramString;
        paramString = new java/lang/ref/WeakReference;
        paramString.<init>(localObject2);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        Object localObject3 = ((NativeLibrary)localObject2).getName();
        ((StringBuilder)localObject1).append((String)localObject3);
        ((StringBuilder)localObject1).append(localHashMap);
        localObject1 = ((StringBuilder)localObject1).toString();
        ???.put(localObject1, paramString);
        localObject1 = ((NativeLibrary)localObject2).getFile();
        if (localObject1 != null)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          String str = ((File)localObject1).getAbsolutePath();
          ((StringBuilder)localObject3).append(str);
          ((StringBuilder)localObject3).append(localHashMap);
          localObject3 = ((StringBuilder)localObject3).toString();
          ???.put(localObject3, paramString);
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject1 = ((File)localObject1).getName();
          ((StringBuilder)localObject3).append((String)localObject1);
          ((StringBuilder)localObject3).append(localHashMap);
          localObject1 = ((StringBuilder)localObject3).toString();
          ???.put(localObject1, paramString);
        }
      }
      return localObject2;
    }
  }
  
  public static List OooOOO(String paramString)
  {
    String str1 = "";
    paramString = System.getProperty(paramString, str1);
    boolean bool1 = str1.equals(paramString);
    if (bool1) {
      return Collections.emptyList();
    }
    StringTokenizer localStringTokenizer = new java/util/StringTokenizer;
    String str2 = File.pathSeparator;
    localStringTokenizer.<init>(paramString, str2);
    paramString = new java/util/ArrayList;
    paramString.<init>();
    for (;;)
    {
      boolean bool2 = localStringTokenizer.hasMoreTokens();
      if (!bool2) {
        break;
      }
      str2 = localStringTokenizer.nextToken();
      boolean bool3 = str1.equals(str2);
      if (!bool3) {
        paramString.add(str2);
      }
    }
    return paramString;
  }
  
  public static boolean OooOOOO(String paramString)
  {
    String str = "lib";
    boolean bool1 = paramString.startsWith(str);
    if (bool1)
    {
      str = m54207b69.F54207b69_11("k=134F5416");
      int i = paramString.lastIndexOf(str);
      int j = -1;
      if (i != j)
      {
        i += 4;
        j = paramString.length();
        if (i < j)
        {
          for (;;)
          {
            j = paramString.length();
            if (i >= j) {
              break;
            }
            j = paramString.charAt(i);
            boolean bool2 = Character.isDigit(j);
            if (!bool2)
            {
              int k = 46;
              if (j != k) {
                return false;
              }
            }
            i += 1;
          }
          return true;
        }
      }
    }
    return false;
  }
  
  /* Error */
  public static NativeLibrary OooOOOo(String paramString, Map paramMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: astore_2
    //   2: getstatic 41	com/sun/jna/NativeLibrary:OooO0oo	Ljava/util/logging/Logger;
    //   5: astore_3
    //   6: getstatic 56	com/sun/jna/NativeLibrary:OooO	Ljava/util/logging/Level;
    //   9: astore 4
    //   11: new 143	java/lang/StringBuilder
    //   14: astore 5
    //   16: aload 5
    //   18: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   21: ldc_w 467
    //   24: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   27: astore 6
    //   29: aload 5
    //   31: aload 6
    //   33: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload 5
    //   39: aload_0
    //   40: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload 5
    //   46: ldc_w 469
    //   49: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload 5
    //   55: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: astore 5
    //   60: aload_3
    //   61: aload 4
    //   63: aload 5
    //   65: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   68: new 178	java/util/ArrayList
    //   71: astore 5
    //   73: aload 5
    //   75: invokespecial 435	java/util/ArrayList:<init>	()V
    //   78: new 197	java/io/File
    //   81: astore 6
    //   83: aload 6
    //   85: aload_0
    //   86: invokespecial 200	java/io/File:<init>	(Ljava/lang/String;)V
    //   89: aload 6
    //   91: invokevirtual 345	java/io/File:isAbsolute	()Z
    //   94: istore 7
    //   96: new 74	java/util/LinkedHashSet
    //   99: astore 8
    //   101: aload 8
    //   103: invokespecial 75	java/util/LinkedHashSet:<init>	()V
    //   106: aload_1
    //   107: invokestatic 404	com/sun/jna/NativeLibrary:OooOo00	(Ljava/util/Map;)I
    //   110: istore 9
    //   112: getstatic 72	com/sun/jna/NativeLibrary:OooOO0O	Ljava/util/Map;
    //   115: aload_0
    //   116: invokeinterface 252 2 0
    //   121: checkcast 443	java/util/List
    //   124: astore 10
    //   126: aload 10
    //   128: ifnull +26 -> 154
    //   131: aload 10
    //   133: monitorenter
    //   134: aload 8
    //   136: aload 10
    //   138: invokevirtual 224	java/util/AbstractCollection:addAll	(Ljava/util/Collection;)Z
    //   141: pop
    //   142: aload 10
    //   144: monitorexit
    //   145: goto +9 -> 154
    //   148: astore_3
    //   149: aload 10
    //   151: monitorexit
    //   152: aload_3
    //   153: athrow
    //   154: aload_0
    //   155: invokestatic 108	com/sun/jna/Native:OooOo0	(Ljava/lang/String;)Ljava/lang/String;
    //   158: astore 10
    //   160: aload 10
    //   162: ifnull +60 -> 222
    //   165: new 143	java/lang/StringBuilder
    //   168: astore 11
    //   170: aload 11
    //   172: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   175: ldc_w 474
    //   178: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   181: astore 12
    //   183: aload 11
    //   185: aload 12
    //   187: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: pop
    //   191: aload 11
    //   193: aload 10
    //   195: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: aload 11
    //   201: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   204: astore 11
    //   206: aload_3
    //   207: aload 4
    //   209: aload 11
    //   211: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   214: aload 8
    //   216: aload 10
    //   218: invokevirtual 114	java/util/AbstractCollection:add	(Ljava/lang/Object;)Z
    //   221: pop
    //   222: new 143	java/lang/StringBuilder
    //   225: astore 10
    //   227: aload 10
    //   229: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   232: ldc_w 476
    //   235: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   238: astore 11
    //   240: aload 10
    //   242: aload 11
    //   244: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: ldc_w 478
    //   251: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   254: invokestatic 121	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   257: astore 11
    //   259: aload 10
    //   261: aload 11
    //   263: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: aload 10
    //   269: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   272: astore 10
    //   274: aload_3
    //   275: aload 4
    //   277: aload 10
    //   279: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   282: ldc_w 478
    //   285: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   288: invokestatic 220	com/sun/jna/NativeLibrary:OooOOO	(Ljava/lang/String;)Ljava/util/List;
    //   291: astore 10
    //   293: aload 8
    //   295: aload 10
    //   297: invokevirtual 224	java/util/AbstractCollection:addAll	(Ljava/util/Collection;)Z
    //   300: pop
    //   301: aload_2
    //   302: aload 8
    //   304: invokestatic 481	com/sun/jna/NativeLibrary:OooO0o0	(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;
    //   307: astore 10
    //   309: lconst_0
    //   310: lstore 13
    //   312: new 143	java/lang/StringBuilder
    //   315: astore 15
    //   317: aload 15
    //   319: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   322: ldc_w 483
    //   325: astore 16
    //   327: aload 16
    //   329: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   332: astore 16
    //   334: aload 15
    //   336: aload 16
    //   338: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: pop
    //   342: aload 15
    //   344: aload 10
    //   346: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: pop
    //   350: aload 15
    //   352: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   355: astore 15
    //   357: aload_3
    //   358: aload 4
    //   360: aload 15
    //   362: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   365: aload 10
    //   367: iload 9
    //   369: invokestatic 408	com/sun/jna/Native:open	(Ljava/lang/String;I)J
    //   372: lstore 17
    //   374: lload 17
    //   376: lstore 19
    //   378: goto +146 -> 524
    //   381: astore_3
    //   382: getstatic 41	com/sun/jna/NativeLibrary:OooO0oo	Ljava/util/logging/Logger;
    //   385: astore 4
    //   387: getstatic 56	com/sun/jna/NativeLibrary:OooO	Ljava/util/logging/Level;
    //   390: astore 15
    //   392: new 143	java/lang/StringBuilder
    //   395: astore 16
    //   397: aload 16
    //   399: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   402: ldc_w 485
    //   405: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   408: astore 21
    //   410: aload 16
    //   412: aload 21
    //   414: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   417: pop
    //   418: aload_3
    //   419: invokevirtual 488	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   422: astore 21
    //   424: aload 16
    //   426: aload 21
    //   428: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   431: pop
    //   432: aload 16
    //   434: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   437: astore 16
    //   439: aload 4
    //   441: aload 15
    //   443: aload 16
    //   445: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   448: new 143	java/lang/StringBuilder
    //   451: astore 16
    //   453: aload 16
    //   455: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   458: ldc_w 490
    //   461: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   464: astore 21
    //   466: aload 16
    //   468: aload 21
    //   470: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: pop
    //   474: getstatic 77	com/sun/jna/NativeLibrary:OooOO0o	Ljava/util/LinkedHashSet;
    //   477: astore 21
    //   479: aload 16
    //   481: aload 21
    //   483: invokevirtual 398	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   486: pop
    //   487: aload 16
    //   489: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   492: astore 16
    //   494: aload 4
    //   496: aload 15
    //   498: aload 16
    //   500: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   503: aload 5
    //   505: aload_3
    //   506: invokeinterface 444 2 0
    //   511: pop
    //   512: aload 8
    //   514: aload 21
    //   516: invokevirtual 224	java/util/AbstractCollection:addAll	(Ljava/util/Collection;)Z
    //   519: pop
    //   520: lload 13
    //   522: lstore 19
    //   524: lload 19
    //   526: lload 13
    //   528: lcmp
    //   529: istore 22
    //   531: iload 22
    //   533: ifne +1323 -> 1856
    //   536: aload_2
    //   537: aload 8
    //   539: invokestatic 481	com/sun/jna/NativeLibrary:OooO0o0	(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;
    //   542: astore 10
    //   544: getstatic 41	com/sun/jna/NativeLibrary:OooO0oo	Ljava/util/logging/Logger;
    //   547: astore_3
    //   548: getstatic 56	com/sun/jna/NativeLibrary:OooO	Ljava/util/logging/Level;
    //   551: astore 4
    //   553: new 143	java/lang/StringBuilder
    //   556: astore 21
    //   558: aload 21
    //   560: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   563: ldc_w 483
    //   566: astore 23
    //   568: aload 23
    //   570: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   573: astore 23
    //   575: aload 21
    //   577: aload 23
    //   579: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   582: pop
    //   583: aload 21
    //   585: aload 10
    //   587: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   590: pop
    //   591: aload 21
    //   593: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   596: astore 21
    //   598: aload_3
    //   599: aload 4
    //   601: aload 21
    //   603: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   606: aload 10
    //   608: iload 9
    //   610: invokestatic 408	com/sun/jna/Native:open	(Ljava/lang/String;I)J
    //   613: lstore 19
    //   615: lload 19
    //   617: lload 13
    //   619: lcmp
    //   620: istore 22
    //   622: iload 22
    //   624: ifeq +6 -> 630
    //   627: goto +1229 -> 1856
    //   630: new 492	java/lang/UnsatisfiedLinkError
    //   633: astore_3
    //   634: new 143	java/lang/StringBuilder
    //   637: astore 4
    //   639: aload 4
    //   641: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   644: ldc_w 494
    //   647: astore 21
    //   649: aload 21
    //   651: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   654: astore 21
    //   656: aload 4
    //   658: aload 21
    //   660: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   663: pop
    //   664: aload 4
    //   666: aload_2
    //   667: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   670: pop
    //   671: ldc_w 469
    //   674: astore 21
    //   676: aload 4
    //   678: aload 21
    //   680: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   683: pop
    //   684: aload 4
    //   686: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   689: astore 4
    //   691: aload_3
    //   692: aload 4
    //   694: invokespecial 495	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   697: aload_3
    //   698: athrow
    //   699: astore_3
    //   700: getstatic 41	com/sun/jna/NativeLibrary:OooO0oo	Ljava/util/logging/Logger;
    //   703: astore 4
    //   705: getstatic 56	com/sun/jna/NativeLibrary:OooO	Ljava/util/logging/Level;
    //   708: astore 21
    //   710: new 143	java/lang/StringBuilder
    //   713: astore 23
    //   715: aload 23
    //   717: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   720: ldc_w 485
    //   723: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   726: astore 24
    //   728: aload 23
    //   730: aload 24
    //   732: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   735: pop
    //   736: aload_3
    //   737: invokevirtual 488	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   740: astore 24
    //   742: aload 23
    //   744: aload 24
    //   746: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   749: pop
    //   750: aload 23
    //   752: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   755: astore 23
    //   757: aload 4
    //   759: aload 21
    //   761: aload 23
    //   763: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   766: aload 5
    //   768: aload_3
    //   769: invokeinterface 444 2 0
    //   774: pop
    //   775: invokestatic 498	com/sun/jna/Platform:isAndroid	()Z
    //   778: istore 22
    //   780: iload 22
    //   782: ifeq +144 -> 926
    //   785: new 143	java/lang/StringBuilder
    //   788: astore_3
    //   789: aload_3
    //   790: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   793: ldc_w 500
    //   796: astore 6
    //   798: aload 6
    //   800: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   803: astore 6
    //   805: aload_3
    //   806: aload 6
    //   808: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   811: pop
    //   812: aload_3
    //   813: aload_2
    //   814: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   817: pop
    //   818: aload_3
    //   819: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   822: astore_3
    //   823: aload 4
    //   825: aload 21
    //   827: aload_3
    //   828: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   831: aload_0
    //   832: invokestatic 503	java/lang/System:loadLibrary	(Ljava/lang/String;)V
    //   835: aload 10
    //   837: iload 9
    //   839: invokestatic 408	com/sun/jna/Native:open	(Ljava/lang/String;I)J
    //   842: lstore 19
    //   844: goto +648 -> 1492
    //   847: astore_3
    //   848: getstatic 41	com/sun/jna/NativeLibrary:OooO0oo	Ljava/util/logging/Logger;
    //   851: astore 4
    //   853: getstatic 56	com/sun/jna/NativeLibrary:OooO	Ljava/util/logging/Level;
    //   856: astore 6
    //   858: new 143	java/lang/StringBuilder
    //   861: astore 8
    //   863: aload 8
    //   865: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   868: ldc_w 485
    //   871: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   874: astore 21
    //   876: aload 8
    //   878: aload 21
    //   880: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   883: pop
    //   884: aload_3
    //   885: invokevirtual 488	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   888: astore 21
    //   890: aload 8
    //   892: aload 21
    //   894: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   897: pop
    //   898: aload 8
    //   900: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   903: astore 8
    //   905: aload 4
    //   907: aload 6
    //   909: aload 8
    //   911: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   914: aload 5
    //   916: aload_3
    //   917: invokeinterface 444 2 0
    //   922: pop
    //   923: goto +569 -> 1492
    //   926: invokestatic 130	com/sun/jna/Platform:isLinux	()Z
    //   929: istore 22
    //   931: iload 22
    //   933: ifne +452 -> 1385
    //   936: invokestatic 138	com/sun/jna/Platform:isFreeBSD	()Z
    //   939: istore 22
    //   941: iload 22
    //   943: ifeq +6 -> 949
    //   946: goto +439 -> 1385
    //   949: invokestatic 360	com/sun/jna/Platform:isMac	()Z
    //   952: istore 22
    //   954: iload 22
    //   956: ifeq +220 -> 1176
    //   959: ldc_w 362
    //   962: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   965: astore_3
    //   966: aload_2
    //   967: aload_3
    //   968: invokevirtual 365	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   971: istore 22
    //   973: iload 22
    //   975: ifne +201 -> 1176
    //   978: aload_0
    //   979: invokestatic 507	com/sun/jna/NativeLibrary:OooOOo	(Ljava/lang/String;)[Ljava/lang/String;
    //   982: astore 4
    //   984: aload 4
    //   986: arraylength
    //   987: istore 7
    //   989: iconst_0
    //   990: istore 22
    //   992: aconst_null
    //   993: astore_3
    //   994: iconst_0
    //   995: istore 25
    //   997: aconst_null
    //   998: astore 8
    //   1000: iload 25
    //   1002: iload 7
    //   1004: if_icmpge +488 -> 1492
    //   1007: aload 4
    //   1009: iload 25
    //   1011: aaload
    //   1012: astore_3
    //   1013: getstatic 41	com/sun/jna/NativeLibrary:OooO0oo	Ljava/util/logging/Logger;
    //   1016: astore 21
    //   1018: getstatic 56	com/sun/jna/NativeLibrary:OooO	Ljava/util/logging/Level;
    //   1021: astore 23
    //   1023: new 143	java/lang/StringBuilder
    //   1026: astore 24
    //   1028: aload 24
    //   1030: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   1033: ldc_w 483
    //   1036: astore 26
    //   1038: aload 26
    //   1040: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   1043: astore 26
    //   1045: aload 24
    //   1047: aload 26
    //   1049: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1052: pop
    //   1053: aload 24
    //   1055: aload_3
    //   1056: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1059: pop
    //   1060: aload 24
    //   1062: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1065: astore 24
    //   1067: aload 21
    //   1069: aload 23
    //   1071: aload 24
    //   1073: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   1076: aload_3
    //   1077: iload 9
    //   1079: invokestatic 408	com/sun/jna/Native:open	(Ljava/lang/String;I)J
    //   1082: lstore 17
    //   1084: lload 17
    //   1086: lstore 19
    //   1088: goto +404 -> 1492
    //   1091: astore_3
    //   1092: getstatic 41	com/sun/jna/NativeLibrary:OooO0oo	Ljava/util/logging/Logger;
    //   1095: astore 21
    //   1097: getstatic 56	com/sun/jna/NativeLibrary:OooO	Ljava/util/logging/Level;
    //   1100: astore 23
    //   1102: new 143	java/lang/StringBuilder
    //   1105: astore 24
    //   1107: aload 24
    //   1109: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   1112: ldc_w 485
    //   1115: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   1118: astore 26
    //   1120: aload 24
    //   1122: aload 26
    //   1124: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1127: pop
    //   1128: aload_3
    //   1129: invokevirtual 488	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1132: astore 26
    //   1134: aload 24
    //   1136: aload 26
    //   1138: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1141: pop
    //   1142: aload 24
    //   1144: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1147: astore 24
    //   1149: aload 21
    //   1151: aload 23
    //   1153: aload 24
    //   1155: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   1158: aload 5
    //   1160: aload_3
    //   1161: invokeinterface 444 2 0
    //   1166: pop
    //   1167: iload 25
    //   1169: iconst_1
    //   1170: iadd
    //   1171: istore 25
    //   1173: goto -173 -> 1000
    //   1176: invokestatic 127	com/sun/jna/Platform:isWindows	()Z
    //   1179: istore 22
    //   1181: iload 22
    //   1183: ifeq +309 -> 1492
    //   1186: iload 7
    //   1188: ifne +304 -> 1492
    //   1191: ldc_w 509
    //   1194: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   1197: astore_3
    //   1198: aload 4
    //   1200: aload 21
    //   1202: aload_3
    //   1203: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   1206: new 143	java/lang/StringBuilder
    //   1209: astore_3
    //   1210: aload_3
    //   1211: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   1214: ldc_w 446
    //   1217: astore 6
    //   1219: aload_3
    //   1220: aload 6
    //   1222: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1225: pop
    //   1226: aload_3
    //   1227: aload_2
    //   1228: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1231: pop
    //   1232: aload_3
    //   1233: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1236: astore_3
    //   1237: aload_3
    //   1238: aload 8
    //   1240: invokestatic 481	com/sun/jna/NativeLibrary:OooO0o0	(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;
    //   1243: astore 10
    //   1245: aload 10
    //   1247: ifnull +245 -> 1492
    //   1250: new 143	java/lang/StringBuilder
    //   1253: astore_3
    //   1254: aload_3
    //   1255: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   1258: ldc_w 483
    //   1261: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   1264: astore 6
    //   1266: aload_3
    //   1267: aload 6
    //   1269: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1272: pop
    //   1273: aload_3
    //   1274: aload 10
    //   1276: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1279: pop
    //   1280: aload_3
    //   1281: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1284: astore_3
    //   1285: aload 4
    //   1287: aload 21
    //   1289: aload_3
    //   1290: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   1293: aload 10
    //   1295: iload 9
    //   1297: invokestatic 408	com/sun/jna/Native:open	(Ljava/lang/String;I)J
    //   1300: lstore 19
    //   1302: goto +190 -> 1492
    //   1305: astore 4
    //   1307: getstatic 41	com/sun/jna/NativeLibrary:OooO0oo	Ljava/util/logging/Logger;
    //   1310: astore_3
    //   1311: getstatic 56	com/sun/jna/NativeLibrary:OooO	Ljava/util/logging/Level;
    //   1314: astore 6
    //   1316: new 143	java/lang/StringBuilder
    //   1319: astore 8
    //   1321: aload 8
    //   1323: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   1326: ldc_w 485
    //   1329: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   1332: astore 21
    //   1334: aload 8
    //   1336: aload 21
    //   1338: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1341: pop
    //   1342: aload 4
    //   1344: invokevirtual 488	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1347: astore 21
    //   1349: aload 8
    //   1351: aload 21
    //   1353: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1356: pop
    //   1357: aload 8
    //   1359: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1362: astore 8
    //   1364: aload_3
    //   1365: aload 6
    //   1367: aload 8
    //   1369: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   1372: aload 5
    //   1374: aload 4
    //   1376: invokeinterface 444 2 0
    //   1381: pop
    //   1382: goto +110 -> 1492
    //   1385: ldc_w 511
    //   1388: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   1391: astore_3
    //   1392: aload 4
    //   1394: aload 21
    //   1396: aload_3
    //   1397: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   1400: aload_2
    //   1401: aload 8
    //   1403: invokestatic 514	com/sun/jna/NativeLibrary:OooOOoo	(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;
    //   1406: astore 10
    //   1408: aload 10
    //   1410: ifnull +82 -> 1492
    //   1413: new 143	java/lang/StringBuilder
    //   1416: astore_3
    //   1417: aload_3
    //   1418: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   1421: ldc_w 483
    //   1424: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   1427: astore 6
    //   1429: aload_3
    //   1430: aload 6
    //   1432: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1435: pop
    //   1436: aload_3
    //   1437: aload 10
    //   1439: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1442: pop
    //   1443: aload_3
    //   1444: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1447: astore_3
    //   1448: aload 4
    //   1450: aload 21
    //   1452: aload_3
    //   1453: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   1456: aload 10
    //   1458: iload 9
    //   1460: invokestatic 408	com/sun/jna/Native:open	(Ljava/lang/String;I)J
    //   1463: lstore 19
    //   1465: goto +27 -> 1492
    //   1468: astore 4
    //   1470: getstatic 41	com/sun/jna/NativeLibrary:OooO0oo	Ljava/util/logging/Logger;
    //   1473: astore_3
    //   1474: getstatic 56	com/sun/jna/NativeLibrary:OooO	Ljava/util/logging/Level;
    //   1477: astore 6
    //   1479: new 143	java/lang/StringBuilder
    //   1482: astore 8
    //   1484: aload 8
    //   1486: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   1489: goto -163 -> 1326
    //   1492: lload 19
    //   1494: lload 13
    //   1496: lcmp
    //   1497: istore 22
    //   1499: iload 22
    //   1501: ifne +184 -> 1685
    //   1504: ldc_w 516
    //   1507: astore_3
    //   1508: aload_3
    //   1509: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   1512: astore_3
    //   1513: aload_1
    //   1514: astore 21
    //   1516: aload_1
    //   1517: aload_3
    //   1518: invokeinterface 252 2 0
    //   1523: astore_3
    //   1524: aload_3
    //   1525: checkcast 518	java/lang/ClassLoader
    //   1528: astore_3
    //   1529: aload_2
    //   1530: aload_3
    //   1531: invokestatic 521	com/sun/jna/Native:OooO0o0	(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/io/File;
    //   1534: astore 4
    //   1536: aload 4
    //   1538: invokevirtual 357	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1541: astore_3
    //   1542: aload_3
    //   1543: iload 9
    //   1545: invokestatic 408	com/sun/jna/Native:open	(Ljava/lang/String;I)J
    //   1548: lstore 19
    //   1550: aload 4
    //   1552: invokevirtual 357	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1555: astore 10
    //   1557: aload 4
    //   1559: invokestatic 525	com/sun/jna/Native:OooOoO0	(Ljava/io/File;)Z
    //   1562: istore 22
    //   1564: iload 22
    //   1566: ifeq +122 -> 1688
    //   1569: aload 4
    //   1571: invokestatic 527	com/sun/jna/Native:OooO0OO	(Ljava/io/File;)Z
    //   1574: pop
    //   1575: goto +113 -> 1688
    //   1578: astore_3
    //   1579: aload 4
    //   1581: invokestatic 525	com/sun/jna/Native:OooOoO0	(Ljava/io/File;)Z
    //   1584: istore 7
    //   1586: iload 7
    //   1588: ifeq +9 -> 1597
    //   1591: aload 4
    //   1593: invokestatic 527	com/sun/jna/Native:OooO0OO	(Ljava/io/File;)Z
    //   1596: pop
    //   1597: aload_3
    //   1598: athrow
    //   1599: astore_3
    //   1600: goto +7 -> 1607
    //   1603: astore_3
    //   1604: aload_1
    //   1605: astore 21
    //   1607: getstatic 41	com/sun/jna/NativeLibrary:OooO0oo	Ljava/util/logging/Logger;
    //   1610: astore 4
    //   1612: getstatic 56	com/sun/jna/NativeLibrary:OooO	Ljava/util/logging/Level;
    //   1615: astore 6
    //   1617: new 143	java/lang/StringBuilder
    //   1620: astore 8
    //   1622: aload 8
    //   1624: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   1627: ldc_w 485
    //   1630: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   1633: astore 27
    //   1635: aload 8
    //   1637: aload 27
    //   1639: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1642: pop
    //   1643: aload_3
    //   1644: invokevirtual 488	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1647: astore 27
    //   1649: aload 8
    //   1651: aload 27
    //   1653: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1656: pop
    //   1657: aload 8
    //   1659: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1662: astore 8
    //   1664: aload 4
    //   1666: aload 6
    //   1668: aload 8
    //   1670: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   1673: aload 5
    //   1675: aload_3
    //   1676: invokeinterface 444 2 0
    //   1681: pop
    //   1682: goto +6 -> 1688
    //   1685: aload_1
    //   1686: astore 21
    //   1688: lload 19
    //   1690: lload 13
    //   1692: lcmp
    //   1693: istore 22
    //   1695: iload 22
    //   1697: ifne +162 -> 1859
    //   1700: new 143	java/lang/StringBuilder
    //   1703: astore_3
    //   1704: aload_3
    //   1705: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   1708: ldc_w 529
    //   1711: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   1714: astore 4
    //   1716: aload_3
    //   1717: aload 4
    //   1719: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1722: pop
    //   1723: aload_3
    //   1724: aload_2
    //   1725: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1728: pop
    //   1729: aload_3
    //   1730: ldc_w 531
    //   1733: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1736: pop
    //   1737: aload 5
    //   1739: invokeinterface 532 1 0
    //   1744: astore 4
    //   1746: aload 4
    //   1748: invokeinterface 330 1 0
    //   1753: istore 28
    //   1755: iload 28
    //   1757: ifeq +40 -> 1797
    //   1760: aload 4
    //   1762: invokeinterface 334 1 0
    //   1767: checkcast 27	java/lang/Throwable
    //   1770: astore_2
    //   1771: ldc_w 534
    //   1774: astore 6
    //   1776: aload_3
    //   1777: aload 6
    //   1779: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1782: pop
    //   1783: aload_2
    //   1784: invokevirtual 488	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1787: astore_2
    //   1788: aload_3
    //   1789: aload_2
    //   1790: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1793: pop
    //   1794: goto -48 -> 1746
    //   1797: new 492	java/lang/UnsatisfiedLinkError
    //   1800: astore 4
    //   1802: aload_3
    //   1803: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1806: astore_3
    //   1807: aload 4
    //   1809: aload_3
    //   1810: invokespecial 495	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   1813: aload 5
    //   1815: invokeinterface 532 1 0
    //   1820: astore_3
    //   1821: aload_3
    //   1822: invokeinterface 330 1 0
    //   1827: istore 28
    //   1829: iload 28
    //   1831: ifeq +22 -> 1853
    //   1834: aload_3
    //   1835: invokeinterface 334 1 0
    //   1840: checkcast 27	java/lang/Throwable
    //   1843: astore_2
    //   1844: aload 4
    //   1846: aload_2
    //   1847: invokestatic 537	com/sun/jna/NativeLibrary:OooO0O0	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   1850: goto -29 -> 1821
    //   1853: aload 4
    //   1855: athrow
    //   1856: aload_1
    //   1857: astore 21
    //   1859: aload 10
    //   1861: astore 5
    //   1863: getstatic 41	com/sun/jna/NativeLibrary:OooO0oo	Ljava/util/logging/Logger;
    //   1866: astore_3
    //   1867: getstatic 56	com/sun/jna/NativeLibrary:OooO	Ljava/util/logging/Level;
    //   1870: astore 4
    //   1872: new 143	java/lang/StringBuilder
    //   1875: astore 27
    //   1877: aload 27
    //   1879: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   1882: ldc_w 539
    //   1885: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   1888: astore 10
    //   1890: aload 27
    //   1892: aload 10
    //   1894: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1897: pop
    //   1898: aload 27
    //   1900: aload_2
    //   1901: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1904: pop
    //   1905: ldc_w 541
    //   1908: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   1911: astore 10
    //   1913: aload 27
    //   1915: aload 10
    //   1917: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1920: pop
    //   1921: aload 27
    //   1923: aload 5
    //   1925: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1928: pop
    //   1929: aload 27
    //   1931: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1934: astore 27
    //   1936: aload_3
    //   1937: aload 4
    //   1939: aload 27
    //   1941: invokevirtual 472	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   1944: new 2	com/sun/jna/NativeLibrary
    //   1947: astore_3
    //   1948: aload_3
    //   1949: astore 4
    //   1951: aload_0
    //   1952: astore_2
    //   1953: aload_1
    //   1954: astore 27
    //   1956: aload_3
    //   1957: aload_0
    //   1958: aload 5
    //   1960: lload 19
    //   1962: aload_1
    //   1963: invokespecial 411	com/sun/jna/NativeLibrary:<init>	(Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V
    //   1966: aload_3
    //   1967: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1968	0	paramString	String
    //   0	1968	1	paramMap	Map
    //   1	1952	2	localObject1	Object
    //   5	56	3	localLogger	Logger
    //   148	210	3	localObject2	Object
    //   381	125	3	localUnsatisfiedLinkError1	UnsatisfiedLinkError
    //   547	151	3	localObject3	Object
    //   699	70	3	localUnsatisfiedLinkError2	UnsatisfiedLinkError
    //   788	40	3	localObject4	Object
    //   847	70	3	localUnsatisfiedLinkError3	UnsatisfiedLinkError
    //   965	112	3	str1	String
    //   1091	70	3	localUnsatisfiedLinkError4	UnsatisfiedLinkError
    //   1197	346	3	localObject5	Object
    //   1578	20	3	localObject6	Object
    //   1599	1	3	localIOException1	java.io.IOException
    //   1603	73	3	localIOException2	java.io.IOException
    //   1703	264	3	localObject7	Object
    //   9	1277	4	localObject8	Object
    //   1305	144	4	localUnsatisfiedLinkError5	UnsatisfiedLinkError
    //   1468	1	4	localUnsatisfiedLinkError6	UnsatisfiedLinkError
    //   1534	416	4	localObject9	Object
    //   14	1945	5	localObject10	Object
    //   27	1751	6	localObject11	Object
    //   94	1	7	bool1	boolean
    //   987	200	7	i	int
    //   1584	3	7	bool2	boolean
    //   99	1570	8	localObject12	Object
    //   110	1434	9	j	int
    //   124	1792	10	localObject13	Object
    //   168	94	11	localObject14	Object
    //   181	5	12	str2	String
    //   310	1381	13	l1	long
    //   315	182	15	localObject15	Object
    //   325	174	16	localObject16	Object
    //   372	713	17	l2	long
    //   376	1585	19	l3	long
    //   408	1450	21	localObject17	Object
    //   529	1167	22	bool3	boolean
    //   566	586	23	localObject18	Object
    //   726	428	24	localObject19	Object
    //   995	177	25	k	int
    //   1036	101	26	str3	String
    //   1633	322	27	localObject20	Object
    //   1753	77	28	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   136	142	148	finally
    //   142	145	148	finally
    //   149	152	148	finally
    //   312	315	381	java/lang/UnsatisfiedLinkError
    //   317	322	381	java/lang/UnsatisfiedLinkError
    //   327	332	381	java/lang/UnsatisfiedLinkError
    //   336	342	381	java/lang/UnsatisfiedLinkError
    //   344	350	381	java/lang/UnsatisfiedLinkError
    //   350	355	381	java/lang/UnsatisfiedLinkError
    //   360	365	381	java/lang/UnsatisfiedLinkError
    //   367	372	381	java/lang/UnsatisfiedLinkError
    //   537	542	699	java/lang/UnsatisfiedLinkError
    //   544	547	699	java/lang/UnsatisfiedLinkError
    //   548	551	699	java/lang/UnsatisfiedLinkError
    //   553	556	699	java/lang/UnsatisfiedLinkError
    //   558	563	699	java/lang/UnsatisfiedLinkError
    //   568	573	699	java/lang/UnsatisfiedLinkError
    //   577	583	699	java/lang/UnsatisfiedLinkError
    //   585	591	699	java/lang/UnsatisfiedLinkError
    //   591	596	699	java/lang/UnsatisfiedLinkError
    //   601	606	699	java/lang/UnsatisfiedLinkError
    //   608	613	699	java/lang/UnsatisfiedLinkError
    //   630	633	699	java/lang/UnsatisfiedLinkError
    //   634	637	699	java/lang/UnsatisfiedLinkError
    //   639	644	699	java/lang/UnsatisfiedLinkError
    //   649	654	699	java/lang/UnsatisfiedLinkError
    //   658	664	699	java/lang/UnsatisfiedLinkError
    //   666	671	699	java/lang/UnsatisfiedLinkError
    //   678	684	699	java/lang/UnsatisfiedLinkError
    //   684	689	699	java/lang/UnsatisfiedLinkError
    //   692	697	699	java/lang/UnsatisfiedLinkError
    //   697	699	699	java/lang/UnsatisfiedLinkError
    //   785	788	847	java/lang/UnsatisfiedLinkError
    //   789	793	847	java/lang/UnsatisfiedLinkError
    //   798	803	847	java/lang/UnsatisfiedLinkError
    //   806	812	847	java/lang/UnsatisfiedLinkError
    //   813	818	847	java/lang/UnsatisfiedLinkError
    //   818	822	847	java/lang/UnsatisfiedLinkError
    //   827	831	847	java/lang/UnsatisfiedLinkError
    //   831	835	847	java/lang/UnsatisfiedLinkError
    //   837	842	847	java/lang/UnsatisfiedLinkError
    //   1013	1016	1091	java/lang/UnsatisfiedLinkError
    //   1018	1021	1091	java/lang/UnsatisfiedLinkError
    //   1023	1026	1091	java/lang/UnsatisfiedLinkError
    //   1028	1033	1091	java/lang/UnsatisfiedLinkError
    //   1038	1043	1091	java/lang/UnsatisfiedLinkError
    //   1047	1053	1091	java/lang/UnsatisfiedLinkError
    //   1055	1060	1091	java/lang/UnsatisfiedLinkError
    //   1060	1065	1091	java/lang/UnsatisfiedLinkError
    //   1071	1076	1091	java/lang/UnsatisfiedLinkError
    //   1077	1082	1091	java/lang/UnsatisfiedLinkError
    //   1295	1300	1305	java/lang/UnsatisfiedLinkError
    //   1458	1463	1468	java/lang/UnsatisfiedLinkError
    //   1536	1541	1578	finally
    //   1543	1548	1578	finally
    //   1550	1555	1578	finally
    //   1517	1523	1599	java/io/IOException
    //   1524	1528	1599	java/io/IOException
    //   1530	1534	1599	java/io/IOException
    //   1557	1562	1599	java/io/IOException
    //   1569	1575	1599	java/io/IOException
    //   1579	1584	1599	java/io/IOException
    //   1591	1597	1599	java/io/IOException
    //   1597	1599	1599	java/io/IOException
    //   1508	1512	1603	java/io/IOException
  }
  
  public static String[] OooOOo(String paramString)
  {
    LinkedHashSet localLinkedHashSet = new java/util/LinkedHashSet;
    localLinkedHashSet.<init>();
    Object localObject1 = new java/io/File;
    ((File)localObject1).<init>(paramString);
    int i = ((File)localObject1).isAbsolute();
    String str1 = m54207b69.F54207b69_11("9(064F5C4C4952654E624C");
    Object localObject2;
    Object localObject3;
    StringBuilder localStringBuilder;
    if (i != 0)
    {
      boolean bool1 = paramString.contains(str1);
      if (bool1)
      {
        bool1 = ((File)localObject1).exists();
        if (bool1)
        {
          paramString = ((File)localObject1).getAbsolutePath();
          return new String[] { paramString };
        }
        paramString = ((File)localObject1).getAbsolutePath();
      }
      else
      {
        paramString = new java/io/File;
        localObject2 = new java/io/File;
        localObject3 = ((File)localObject1).getParentFile();
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str2 = ((File)localObject1).getName();
        localStringBuilder.append(str2);
        localStringBuilder.append(str1);
        str1 = localStringBuilder.toString();
        ((File)localObject2).<init>((File)localObject3, str1);
        localObject1 = ((File)localObject1).getName();
        paramString.<init>((File)localObject2, (String)localObject1);
        boolean bool2 = paramString.exists();
        paramString = paramString.getAbsolutePath();
        if (bool2) {
          return new String[] { paramString };
        }
      }
      localLinkedHashSet.add(paramString);
    }
    else
    {
      localObject1 = System.getProperty(m54207b69.F54207b69_11("|)5C5B4E5E0B464C4B54"));
      localObject2 = "";
      localObject3 = m54207b69.F54207b69_11("iW78053027273740");
      String[] tmp217_214 = new String[3];
      String[] tmp218_217 = tmp217_214;
      String[] tmp218_217 = tmp217_214;
      tmp218_217[0] = localObject1;
      tmp218_217[1] = localObject2;
      tmp218_217[2] = localObject3;
      localObject1 = tmp218_217;
      i = paramString.contains(str1);
      if (i == 0)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append(paramString);
        str1 = m54207b69.F54207b69_11("we4B0419070C0518111F1754");
        ((StringBuilder)localObject2).append(str1);
        ((StringBuilder)localObject2).append(paramString);
        paramString = ((StringBuilder)localObject2).toString();
      }
      i = 0;
      localObject2 = null;
      for (;;)
      {
        int k = 3;
        if (i >= k) {
          break;
        }
        str1 = localObject1[i];
        localObject3 = new java/io/File;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append(str1);
        str1 = m54207b69.F54207b69_11("9_701438403143332D782237493E47363F3D453E83");
        localStringBuilder.append(str1);
        localStringBuilder.append(paramString);
        str1 = localStringBuilder.toString();
        ((File)localObject3).<init>(str1);
        boolean bool3 = ((File)localObject3).exists();
        if (bool3)
        {
          paramString = ((File)localObject3).getAbsolutePath();
          return new String[] { paramString };
        }
        str1 = ((File)localObject3).getAbsolutePath();
        localLinkedHashSet.add(str1);
        int j;
        i += 1;
      }
    }
    paramString = new String[0];
    return (String[])localLinkedHashSet.toArray(paramString);
  }
  
  public static String OooOOo0(String paramString)
  {
    boolean bool = Platform.isMac();
    String str1 = "lib";
    Object localObject;
    if (bool)
    {
      bool = paramString.startsWith(str1);
      str1 = m54207b69.F54207b69_11("1+0550544A464E");
      String str2 = m54207b69.F54207b69_11("j.0045424A464C52");
      if (bool)
      {
        bool = paramString.endsWith(str1);
        if (!bool)
        {
          bool = paramString.endsWith(str2);
          if (!bool) {}
        }
        else
        {
          return paramString;
        }
      }
      paramString = System.mapLibraryName(paramString);
      bool = paramString.endsWith(str2);
      if (bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        int i = paramString.lastIndexOf(str2);
        paramString = paramString.substring(0, i);
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(str1);
        paramString = ((StringBuilder)localObject).toString();
      }
      return paramString;
    }
    bool = Platform.isLinux();
    if (!bool)
    {
      bool = Platform.isFreeBSD();
      if (!bool)
      {
        bool = Platform.isAIX();
        if (bool)
        {
          bool = paramString.startsWith(str1);
          if (!bool) {
            break label254;
          }
          return paramString;
        }
        bool = Platform.isWindows();
        if (!bool) {
          break label254;
        }
        localObject = m54207b69.F54207b69_11("]I672E3D42");
        bool = paramString.endsWith((String)localObject);
        if (!bool)
        {
          localObject = m54207b69.F54207b69_11("G(064D4647");
          bool = paramString.endsWith((String)localObject);
          if (!bool)
          {
            localObject = m54207b69.F54207b69_11("(j44060B15");
            bool = paramString.endsWith((String)localObject);
            if (!bool) {
              break label254;
            }
          }
        }
        return paramString;
      }
    }
    bool = OooOOOO(paramString);
    if (!bool)
    {
      localObject = ".so";
      bool = paramString.endsWith((String)localObject);
      if (!bool) {
        label254:
        paramString = System.mapLibraryName(paramString);
      }
    }
    return paramString;
  }
  
  public static String OooOOoo(String paramString, Collection paramCollection)
  {
    Object localObject1 = new java/io/File;
    ((File)localObject1).<init>(paramString);
    boolean bool1 = ((File)localObject1).isAbsolute();
    if (bool1)
    {
      paramCollection = ((File)localObject1).getParent();
      paramCollection = Arrays.asList(new String[] { paramCollection });
    }
    localObject1 = new com/sun/jna/NativeLibrary$2;
    ((NativeLibrary.2)localObject1).<init>(paramString);
    paramString = new java/util/LinkedList;
    paramString.<init>();
    paramCollection = paramCollection.iterator();
    Object localObject3;
    for (;;)
    {
      bool1 = paramCollection.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (String)paramCollection.next();
      localObject3 = new java/io/File;
      ((File)localObject3).<init>((String)localObject2);
      localObject2 = ((File)localObject3).listFiles((FilenameFilter)localObject1);
      if (localObject2 != null)
      {
        int i = localObject2.length;
        if (i > 0)
        {
          localObject2 = Arrays.asList((Object[])localObject2);
          paramString.addAll((Collection)localObject2);
        }
      }
    }
    paramString = paramString.iterator();
    double d1 = -1.0D;
    paramCollection = null;
    for (;;)
    {
      boolean bool2 = paramString.hasNext();
      if (!bool2) {
        break;
      }
      localObject3 = ((File)paramString.next()).getAbsolutePath();
      String str = m54207b69.F54207b69_11("k=134F5416");
      int j = ((String)localObject3).lastIndexOf(str) + 4;
      str = ((String)localObject3).substring(j);
      double d2 = OooOo0(str);
      boolean bool3 = d2 < d1;
      if (bool3)
      {
        paramCollection = (Collection)localObject3;
        d1 = d2;
      }
    }
    return paramCollection;
  }
  
  public static double OooOo0(String paramString)
  {
    String str1 = ".";
    int i = paramString.indexOf(str1);
    double d1 = 0.0D;
    double d2 = 1.0D;
    double d3 = d1;
    while (paramString != null)
    {
      int j = -1;
      String str2;
      if (i != j)
      {
        j = 0;
        str2 = paramString.substring(0, i);
        i += 1;
        paramString = paramString.substring(i);
        i = paramString.indexOf(str1);
        String str3 = str2;
        str2 = paramString;
        paramString = str3;
      }
      else
      {
        j = 0;
        str2 = null;
      }
      try
      {
        int k = Integer.parseInt(paramString);
        double d4 = k / d2;
        d3 += d4;
        d4 = 100.0D;
        d2 *= d4;
        paramString = str2;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        return d1;
      }
    }
    return d3;
  }
  
  public static int OooOo00(Map paramMap)
  {
    String str = m54207b69.F54207b69_11("$x17091F1959231A202714");
    paramMap = paramMap.get(str);
    boolean bool = paramMap instanceof Number;
    if (bool) {
      return ((Number)paramMap).intValue();
    }
    return -1;
  }
  
  /* Error */
  private static ArrayList getLinuxLdPaths()
  {
    // Byte code:
    //   0: new 178	java/util/ArrayList
    //   3: astore_0
    //   4: aload_0
    //   5: invokespecial 435	java/util/ArrayList:<init>	()V
    //   8: aconst_null
    //   9: astore_1
    //   10: invokestatic 632	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   13: astore_2
    //   14: ldc_w 634
    //   17: astore_3
    //   18: aload_3
    //   19: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   22: astore_3
    //   23: aload_2
    //   24: aload_3
    //   25: invokevirtual 638	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   28: astore_2
    //   29: new 640	java/io/BufferedReader
    //   32: astore_3
    //   33: new 642	java/io/InputStreamReader
    //   36: astore 4
    //   38: aload_2
    //   39: invokevirtual 648	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   42: astore 5
    //   44: aload 4
    //   46: aload 5
    //   48: invokespecial 651	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   51: aload_3
    //   52: aload 4
    //   54: invokespecial 654	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   57: aload_3
    //   58: invokevirtual 657	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   61: astore_1
    //   62: aload_1
    //   63: ifnull +95 -> 158
    //   66: ldc_w 659
    //   69: astore 4
    //   71: aload 4
    //   73: invokestatic 90	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   76: astore 4
    //   78: aload_1
    //   79: aload 4
    //   81: invokevirtual 611	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   84: istore 6
    //   86: bipush 47
    //   88: istore 7
    //   90: aload_1
    //   91: iload 7
    //   93: invokevirtual 663	java/lang/String:lastIndexOf	(I)I
    //   96: istore 7
    //   98: iconst_m1
    //   99: istore 8
    //   101: iload 6
    //   103: iload 8
    //   105: if_icmpeq -48 -> 57
    //   108: iload 7
    //   110: iload 8
    //   112: if_icmpeq -55 -> 57
    //   115: iload 6
    //   117: iload 7
    //   119: if_icmpge -62 -> 57
    //   122: iload 6
    //   124: iconst_4
    //   125: iadd
    //   126: istore 6
    //   128: aload_1
    //   129: iload 6
    //   131: iload 7
    //   133: invokevirtual 373	java/lang/String:substring	(II)Ljava/lang/String;
    //   136: astore_1
    //   137: aload_0
    //   138: aload_1
    //   139: invokevirtual 665	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   142: istore 6
    //   144: iload 6
    //   146: ifne -89 -> 57
    //   149: aload_0
    //   150: aload_1
    //   151: invokevirtual 666	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   154: pop
    //   155: goto -98 -> 57
    //   158: aload_3
    //   159: invokevirtual 669	java/io/BufferedReader:close	()V
    //   162: aload_2
    //   163: invokevirtual 672	java/lang/Process:waitFor	()I
    //   166: pop
    //   167: goto +60 -> 227
    //   170: astore_0
    //   171: aload_3
    //   172: astore_1
    //   173: goto +16 -> 189
    //   176: pop
    //   177: aload_3
    //   178: astore_1
    //   179: goto +32 -> 211
    //   182: astore_0
    //   183: goto +6 -> 189
    //   186: astore_0
    //   187: aconst_null
    //   188: astore_2
    //   189: aload_1
    //   190: ifnull +7 -> 197
    //   193: aload_1
    //   194: invokevirtual 669	java/io/BufferedReader:close	()V
    //   197: aload_2
    //   198: ifnull +8 -> 206
    //   201: aload_2
    //   202: invokevirtual 672	java/lang/Process:waitFor	()I
    //   205: pop
    //   206: aload_0
    //   207: athrow
    //   208: pop
    //   209: aconst_null
    //   210: astore_2
    //   211: aload_1
    //   212: ifnull +7 -> 219
    //   215: aload_1
    //   216: invokevirtual 669	java/io/BufferedReader:close	()V
    //   219: aload_2
    //   220: ifnull +7 -> 227
    //   223: goto -61 -> 162
    //   226: pop
    //   227: aload_0
    //   228: areturn
    //   229: pop
    //   230: goto -68 -> 162
    //   233: pop
    //   234: goto -37 -> 197
    //   237: pop
    //   238: goto -32 -> 206
    //   241: pop
    //   242: goto -31 -> 211
    //   245: pop
    //   246: goto -27 -> 219
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	147	0	localArrayList1	ArrayList
    //   170	1	0	localObject1	Object
    //   182	1	0	localObject2	Object
    //   186	42	0	localArrayList2	ArrayList
    //   9	207	1	localObject3	Object
    //   13	207	2	localObject4	Object
    //   17	161	3	localObject5	Object
    //   36	44	4	localObject6	Object
    //   42	5	5	localInputStream	java.io.InputStream
    //   84	46	6	i	int
    //   142	3	6	bool	boolean
    //   88	44	7	j	int
    //   99	14	8	k	int
    //   176	1	13	localException1	java.lang.Exception
    //   208	1	14	localException2	java.lang.Exception
    //   226	1	15	localInterruptedException1	java.lang.InterruptedException
    //   229	1	16	localIOException1	java.io.IOException
    //   233	1	17	localIOException2	java.io.IOException
    //   237	1	18	localInterruptedException2	java.lang.InterruptedException
    //   241	1	19	localException3	java.lang.Exception
    //   245	1	20	localIOException3	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   57	61	170	finally
    //   71	76	170	finally
    //   79	84	170	finally
    //   91	96	170	finally
    //   131	136	170	finally
    //   138	142	170	finally
    //   150	155	170	finally
    //   57	61	176	java/lang/Exception
    //   71	76	176	java/lang/Exception
    //   79	84	176	java/lang/Exception
    //   91	96	176	java/lang/Exception
    //   131	136	176	java/lang/Exception
    //   138	142	176	java/lang/Exception
    //   150	155	176	java/lang/Exception
    //   29	32	182	finally
    //   33	36	182	finally
    //   38	42	182	finally
    //   46	51	182	finally
    //   52	57	182	finally
    //   10	13	186	finally
    //   18	22	186	finally
    //   24	28	186	finally
    //   10	13	208	java/lang/Exception
    //   18	22	208	java/lang/Exception
    //   24	28	208	java/lang/Exception
    //   162	167	226	java/lang/InterruptedException
    //   158	162	229	java/io/IOException
    //   193	197	233	java/io/IOException
    //   201	206	237	java/lang/InterruptedException
    //   29	32	241	java/lang/Exception
    //   33	36	241	java/lang/Exception
    //   38	42	241	java/lang/Exception
    //   46	51	241	java/lang/Exception
    //   52	57	241	java/lang/Exception
    //   215	219	245	java/io/IOException
  }
  
  private static String getMultiArchPath()
  {
    String str1 = Platform.OooOO0;
    boolean bool1 = Platform.iskFreeBSD();
    String str2;
    if (bool1)
    {
      str2 = m54207b69.F54207b69_11("@(0544505D5152506254");
    }
    else
    {
      bool1 = Platform.isGNU();
      if (bool1) {
        str2 = "";
      } else {
        str2 = m54207b69.F54207b69_11("CE682A2E2E3442");
      }
    }
    boolean bool2 = Platform.isIntel();
    String str3 = m54207b69.F54207b69_11("$419545C44");
    boolean bool3;
    if (bool2)
    {
      bool3 = Platform.is64Bit();
      if (bool3) {
        str1 = m54207b69.F54207b69_11("1i115261396362");
      } else {
        str1 = m54207b69.F54207b69_11("%n075E585B");
      }
    }
    else
    {
      bool2 = Platform.isPPC();
      if (bool2)
      {
        bool3 = Platform.is64Bit();
        if (bool3) {
          str1 = m54207b69.F54207b69_11("YS233D26392528366C6F");
        } else {
          str1 = m54207b69.F54207b69_11("Hm1D031C0B232214");
        }
      }
      else
      {
        bool2 = Platform.isARM();
        if (bool2)
        {
          str1 = "arm";
          str3 = m54207b69.F54207b69_11(":*074E466253504E4A");
        }
        else
        {
          localObject = m54207b69.F54207b69_11("j<51564E520E0D5F57");
          bool2 = str1.equals(localObject);
          if (bool2) {
            str3 = m54207b69.F54207b69_11("Bg4A010B150A0A14585B");
          }
        }
      }
    }
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(str3);
    return ((StringBuilder)localObject).toString();
  }
  
  public static final NativeLibrary getProcess()
  {
    NativeLibrary localNativeLibrary1 = NativeLibrary.class;
    NativeLibrary localNativeLibrary2 = null;
    try
    {
      localNativeLibrary2 = OooOO0(null);
      return localNativeLibrary2;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public Function OooO(String paramString, Method paramMethod)
  {
    Object localObject = this.OooO0oO;
    String str = m54207b69.F54207b69_11("dc05170F031B0F121456170C1E1F131F");
    localObject = (FunctionMapper)((Map)localObject).get(str);
    if (localObject != null) {
      paramString = ((FunctionMapper)localObject).OooO00o(this, paramMethod);
    }
    localObject = m54207b69.F54207b69_11("W45E5B571D484B615965615B5126515460626E5E");
    str = m54207b69.F54207b69_11(")511126E82691617");
    localObject = System.getProperty((String)localObject, str);
    int i = paramString.startsWith((String)localObject);
    if (i != 0)
    {
      k = ((String)localObject).length();
      paramString = paramString.substring(k);
    }
    int k = this.OooO0o0;
    paramMethod = paramMethod.getExceptionTypes();
    i = 0;
    str = null;
    for (;;)
    {
      int m = paramMethod.length;
      if (i >= m) {
        break;
      }
      LastErrorException localLastErrorException = LastErrorException.class;
      Class localClass = paramMethod[i];
      boolean bool = localLastErrorException.isAssignableFrom(localClass);
      if (bool) {
        k |= 0x40;
      }
      int j;
      i += 1;
    }
    return OooO0oO(paramString, k);
  }
  
  public void OooO0OO()
  {
    Object localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    synchronized (OooOO0)
    {
      Object localObject4 = ???.entrySet();
      localObject4 = ((Set)localObject4).iterator();
      Object localObject5;
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject4).hasNext();
        if (!bool1) {
          break;
        }
        localObject5 = ((Iterator)localObject4).next();
        localObject5 = (Map.Entry)localObject5;
        Object localObject6 = ((Map.Entry)localObject5).getValue();
        localObject6 = (Reference)localObject6;
        localObject6 = ((Reference)localObject6).get();
        if (localObject6 == this)
        {
          localObject5 = ((Map.Entry)localObject5).getKey();
          ((Set)localObject1).add(localObject5);
        }
      }
      localObject1 = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = ((Iterator)localObject1).next();
        localObject4 = (String)localObject4;
        localObject5 = OooOO0;
        ((Map)localObject5).remove(localObject4);
      }
      try
      {
        long l1 = this.OooO00o;
        long l2 = 0L;
        boolean bool3 = l1 < l2;
        if (bool3)
        {
          Native.close(l1);
          this.OooO00o = l2;
        }
        return;
      }
      finally {}
    }
  }
  
  public Function OooO0oO(String paramString, int paramInt)
  {
    String str = this.OooO0o;
    return OooO0oo(paramString, paramInt, str);
  }
  
  public Function OooO0oo(String paramString1, int paramInt, String paramString2)
  {
    if (paramString1 != null) {
      synchronized (this.OooO0Oo)
      {
        String str1 = OooO0o(paramString1, paramInt, paramString2);
        Object localObject = this.OooO0Oo;
        localObject = ((Map)localObject).get(str1);
        localObject = (Function)localObject;
        if (localObject == null)
        {
          localObject = new com/sun/jna/Function;
          ((Function)localObject).<init>(this, paramString1, paramInt, paramString2);
          paramString1 = this.OooO0Oo;
          paramString1.put(str1, localObject);
        }
        return localObject;
      }
    }
    paramString1 = new java/lang/NullPointerException;
    String str2 = m54207b69.F54207b69_11("6v30041A1806241F1F5E2121261F6329261F672A2C166B2A2A6E311D3536");
    paramString1.<init>(str2);
  }
  
  public final String OooOO0o(String paramString)
  {
    String str1 = "---";
    String str2 = OooOOo0(str1);
    int i = str2.indexOf(str1);
    if (i > 0)
    {
      String str3 = str2.substring(0, i);
      boolean bool = paramString.startsWith(str3);
      if (bool) {
        paramString = paramString.substring(i);
      }
    }
    i += 3;
    str1 = str2.substring(i);
    i = paramString.indexOf(str1);
    int j = -1;
    if (i != j) {
      paramString = paramString.substring(0, i);
    }
    return paramString;
  }
  
  public long OooOOO0(String paramString)
  {
    long l1 = this.OooO00o;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool) {
      return Native.findSymbol(l1, paramString);
    }
    paramString = new java/lang/UnsatisfiedLinkError;
    String str = m54207b69.F54207b69_11("-B0E2C223327354169322C3B6D2C34353B72483E4141383C3E3E");
    paramString.<init>(str);
    throw paramString;
  }
  
  public void finalize()
  {
    OooO0OO();
  }
  
  public File getFile()
  {
    Object localObject = this.OooO0OO;
    if (localObject == null) {
      return null;
    }
    localObject = new java/io/File;
    String str = this.OooO0OO;
    ((File)localObject).<init>(str);
    return localObject;
  }
  
  public String getName()
  {
    return this.OooO0O0;
  }
  
  public Map getOptions()
  {
    return this.OooO0oO;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("157B55435F47551B806460515F53592318");
    localStringBuilder.append(str);
    str = this.OooO0OO;
    localStringBuilder.append(str);
    localStringBuilder.append("@");
    long l = this.OooO00o;
    localStringBuilder.append(l);
    localStringBuilder.append(">");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.NativeLibrary
 * JD-Core Version:    0.7.0.1
 */