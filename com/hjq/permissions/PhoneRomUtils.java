package com.hjq.permissions;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import m54207b69;

final class PhoneRomUtils
{
  public static final String[] OooO;
  public static final String[] OooO00o;
  public static final String[] OooO0O0;
  public static final String[] OooO0OO;
  public static final String[] OooO0Oo;
  public static final String[] OooO0o;
  public static final String[] OooO0o0;
  public static final String[] OooO0oO;
  public static final String[] OooO0oo;
  public static final String[] OooOO0;
  public static final String[] OooOO0O;
  public static final String[] OooOO0o;
  public static final String[] OooOOO0;
  
  static
  {
    String str1 = m54207b69.F54207b69_11("6L243A2F3E2D2A");
    OooO00o = new String[] { str1 };
    str1 = m54207b69.F54207b69_11("_X2E32303A");
    OooO0O0 = new String[] { str1 };
    str1 = m54207b69.F54207b69_11("?k13030C070A07");
    OooO0OO = new String[] { str1 };
    str1 = m54207b69.F54207b69_11("(M223E3F25");
    OooO0Oo = new String[] { str1 };
    str1 = m54207b69.F54207b69_11("kV3A3435383D");
    String str2 = m54207b69.F54207b69_11("q|101A0A0D");
    OooO0o0 = new String[] { str1, str2 };
    str2 = m54207b69.F54207b69_11("0<4D56594C");
    OooO0o = new String[] { "360", str2 };
    OooO0oO = new String[] { "zte" };
    str1 = m54207b69.F54207b69_11("P;5456604E5B534E");
    OooO0oo = new String[] { str1 };
    str1 = m54207b69.F54207b69_11("RB2C38222E27");
    OooO = new String[] { str1 };
    str1 = m54207b69.F54207b69_11("j)5A49465D604C54");
    OooOO0 = new String[] { str1 };
    str1 = m54207b69.F54207b69_11("OI212729293F");
    OooOO0O = new String[] { str1 };
    str1 = m54207b69.F54207b69_11("1)5B47094E60454B540F685666664D545617576B6C5A705C5B");
    str2 = m54207b69.F54207b69_11("DA332F7126382D332C77402E3E3E353C3E7F3F43404847494544883F434E4E4B3F58");
    OooOO0o = new String[] { str1, str2 };
    str1 = m54207b69.F54207b69_11("Op1D0415611724241D212068281D2427226E172715172E3535");
    str2 = m54207b69.F54207b69_11(")c110D4F041A0F150E551E101C1C171A1C5D1F14171E15");
    OooOOO0 = new String[] { str1, str2 };
  }
  
  public static String OooO00o(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (!bool) {
      paramString = OooO0O0(paramString);
    } else {
      paramString = "";
    }
    return paramString;
  }
  
  public static String OooO0O0(String paramString)
  {
    String str = OooO0OO(paramString);
    boolean bool = TextUtils.isEmpty(str);
    if (!bool) {
      return str;
    }
    paramString = OooO0Oo(paramString);
    TextUtils.isEmpty(paramString);
    return paramString;
  }
  
  /* Error */
  public static String OooO0OO(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: invokestatic 110	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   5: astore_2
    //   6: new 112	java/lang/StringBuilder
    //   9: astore_3
    //   10: aload_3
    //   11: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   14: ldc 115
    //   16: astore 4
    //   18: aload 4
    //   20: invokestatic 26	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   23: astore 4
    //   25: aload_3
    //   26: aload 4
    //   28: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: pop
    //   32: aload_3
    //   33: aload_0
    //   34: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: aload_3
    //   39: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   42: astore_0
    //   43: aload_2
    //   44: aload_0
    //   45: invokevirtual 127	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   48: astore_0
    //   49: new 129	java/io/BufferedReader
    //   52: astore_2
    //   53: new 131	java/io/InputStreamReader
    //   56: astore_3
    //   57: aload_0
    //   58: invokevirtual 137	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   61: astore_0
    //   62: aload_3
    //   63: aload_0
    //   64: invokespecial 140	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   67: sipush 1024
    //   70: istore 5
    //   72: aload_2
    //   73: aload_3
    //   74: iload 5
    //   76: invokespecial 144	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   79: aload_2
    //   80: invokevirtual 147	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   83: astore_0
    //   84: aload_0
    //   85: ifnull +17 -> 102
    //   88: aload_2
    //   89: invokevirtual 150	java/io/BufferedReader:close	()V
    //   92: goto +8 -> 100
    //   95: astore_1
    //   96: aload_1
    //   97: invokevirtual 155	java/lang/Throwable:printStackTrace	()V
    //   100: aload_0
    //   101: areturn
    //   102: aload_2
    //   103: invokevirtual 150	java/io/BufferedReader:close	()V
    //   106: goto +40 -> 146
    //   109: astore_0
    //   110: aload_2
    //   111: astore_1
    //   112: goto +37 -> 149
    //   115: astore_0
    //   116: aload_2
    //   117: astore_1
    //   118: goto +8 -> 126
    //   121: astore_0
    //   122: goto +27 -> 149
    //   125: astore_0
    //   126: aload_0
    //   127: invokevirtual 155	java/lang/Throwable:printStackTrace	()V
    //   130: aload_1
    //   131: ifnull +15 -> 146
    //   134: aload_1
    //   135: invokevirtual 150	java/io/BufferedReader:close	()V
    //   138: goto +8 -> 146
    //   141: astore_0
    //   142: aload_0
    //   143: invokevirtual 155	java/lang/Throwable:printStackTrace	()V
    //   146: ldc 100
    //   148: areturn
    //   149: aload_1
    //   150: ifnull +15 -> 165
    //   153: aload_1
    //   154: invokevirtual 150	java/io/BufferedReader:close	()V
    //   157: goto +8 -> 165
    //   160: astore_1
    //   161: aload_1
    //   162: invokevirtual 155	java/lang/Throwable:printStackTrace	()V
    //   165: aload_0
    //   166: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	167	0	paramString	String
    //   1	1	1	localObject1	Object
    //   95	2	1	localIOException1	IOException
    //   111	43	1	localObject2	Object
    //   160	2	1	localIOException2	IOException
    //   5	112	2	localObject3	Object
    //   9	65	3	localObject4	Object
    //   16	11	4	str	String
    //   70	5	5	i	int
    // Exception table:
    //   from	to	target	type
    //   88	92	95	java/io/IOException
    //   79	83	109	finally
    //   79	83	115	java/io/IOException
    //   2	5	121	finally
    //   6	9	121	finally
    //   10	14	121	finally
    //   18	23	121	finally
    //   26	32	121	finally
    //   33	38	121	finally
    //   38	42	121	finally
    //   44	48	121	finally
    //   49	52	121	finally
    //   53	56	121	finally
    //   57	61	121	finally
    //   63	67	121	finally
    //   74	79	121	finally
    //   126	130	121	finally
    //   2	5	125	java/io/IOException
    //   6	9	125	java/io/IOException
    //   10	14	125	java/io/IOException
    //   18	23	125	java/io/IOException
    //   26	32	125	java/io/IOException
    //   33	38	125	java/io/IOException
    //   38	42	125	java/io/IOException
    //   44	48	125	java/io/IOException
    //   49	52	125	java/io/IOException
    //   53	56	125	java/io/IOException
    //   57	61	125	java/io/IOException
    //   63	67	125	java/io/IOException
    //   74	79	125	java/io/IOException
    //   102	106	141	java/io/IOException
    //   134	138	141	java/io/IOException
    //   153	157	160	java/io/IOException
  }
  
  public static String OooO0Oo(String paramString)
  {
    String str1 = "";
    try
    {
      Properties localProperties = new java/util/Properties;
      localProperties.<init>();
      FileInputStream localFileInputStream = new java/io/FileInputStream;
      File localFile1 = new java/io/File;
      File localFile2 = Environment.getRootDirectory();
      String str2 = "e.4C5C49454E0564634967";
      str2 = m54207b69.F54207b69_11(str2);
      localFile1.<init>(localFile2, str2);
      localFileInputStream.<init>(localFile1);
      localProperties.load(localFileInputStream);
      return localProperties.getProperty(paramString, str1);
    }
    catch (IOException paramString) {}catch (FileNotFoundException paramString) {}
    paramString.printStackTrace();
    return str1;
  }
  
  public static boolean OooO0o0(String paramString1, String paramString2, String... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      String str = paramVarArgs[j];
      boolean bool1 = paramString1.contains(str);
      if (!bool1)
      {
        boolean bool2 = paramString2.contains(str);
        if (!bool2)
        {
          j += 1;
          continue;
        }
      }
      return true;
    }
    return false;
  }
  
  private static String getBrand()
  {
    return Build.BRAND.toLowerCase();
  }
  
  private static String getManufacturer()
  {
    return Build.MANUFACTURER.toLowerCase();
  }
  
  public static String getRomVersionName()
  {
    Object localObject1 = getBrand();
    Object localObject2 = getManufacturer();
    String[] arrayOfString = OooO00o;
    boolean bool1 = OooO0o0((String)localObject1, (String)localObject2, arrayOfString);
    String str1 = "";
    if (bool1)
    {
      localObject1 = OooO00o(m54207b69.F54207b69_11("ma130F5106180D130C57200E1E1E151C1E5F151E271C"));
      localObject2 = ((String)localObject1).split("_");
      int i = localObject2.length;
      j = 1;
      if (i > j) {
        return localObject2[j];
      }
      localObject2 = m54207b69.F54207b69_11("Rj2F080721070A0A462B");
      boolean bool3 = ((String)localObject1).contains((CharSequence)localObject2);
      if (bool3)
      {
        localObject2 = m54207b69.F54207b69_11("jS163F3E2A3E41430D22182A84");
        localObject1 = ((String)localObject1).replaceFirst((String)localObject2, str1);
      }
      return localObject1;
    }
    arrayOfString = OooO0O0;
    boolean bool2 = OooO0o0((String)localObject1, (String)localObject2, arrayOfString);
    if (bool2) {
      return OooO00o(m54207b69.F54207b69_11("1&544A0A5353554F0F515E124F5F5C5851185361686A5F5D7620685C"));
    }
    arrayOfString = OooO0OO;
    bool2 = OooO0o0((String)localObject1, (String)localObject2, arrayOfString);
    if (bool2) {
      return OooO00o(m54207b69.F54207b69_11("$.5C42024F5F4C48510861556769544F4F10585260706059625873695D"));
    }
    arrayOfString = OooO0Oo;
    bool2 = OooO0o0((String)localObject1, (String)localObject2, arrayOfString);
    int j = 0;
    int k;
    String str2;
    if (bool2)
    {
      localObject1 = OooOO0o;
      k = localObject1.length;
      while (j < k)
      {
        arrayOfString = localObject1[j];
        str2 = OooO00o(arrayOfString);
        bool2 = TextUtils.isEmpty(arrayOfString);
        if (bool2) {
          j += 1;
        } else {
          return str2;
        }
      }
      return str1;
    }
    arrayOfString = OooO0o0;
    bool2 = OooO0o0((String)localObject1, (String)localObject2, arrayOfString);
    if (bool2) {
      return OooO00o(m54207b69.F54207b69_11("T[2935773A4234337C3147414946354C843D4F3B3B46494B"));
    }
    arrayOfString = OooO0o;
    bool2 = OooO0o0((String)localObject1, (String)localObject2, arrayOfString);
    if (bool2) {
      return OooO00o(m54207b69.F54207b69_11(",j1806460B23080C154C280D271B2527121515"));
    }
    arrayOfString = OooO0oO;
    bool2 = OooO0o0((String)localObject1, (String)localObject2, arrayOfString);
    if (bool2) {
      return OooO00o(m54207b69.F54207b69_11("pC312D6F243A2F352E751734102E423A402C463844443F4244"));
    }
    arrayOfString = OooO0oo;
    bool2 = OooO0o0((String)localObject1, (String)localObject2, arrayOfString);
    if (bool2) {
      return OooO00o(m54207b69.F54207b69_11("6h1A08481D0B0A4C251523250C1313"));
    }
    arrayOfString = OooO;
    bool2 = OooO0o0((String)localObject1, (String)localObject2, arrayOfString);
    if (bool2) {
      return OooO00o(m54207b69.F54207b69_11("'I3B27692E40252B346F44302F732D3B"));
    }
    arrayOfString = OooOO0O;
    boolean bool4 = OooO0o0((String)localObject1, (String)localObject2, arrayOfString);
    if (bool4)
    {
      localObject1 = OooOOO0;
      k = localObject1.length;
      while (j < k)
      {
        arrayOfString = localObject1[j];
        str2 = OooO00o(arrayOfString);
        bool2 = TextUtils.isEmpty(arrayOfString);
        if (bool2) {
          j += 1;
        } else {
          return str2;
        }
      }
      return str1;
    }
    return OooO00o(str1);
  }
  
  public static boolean isColorOs()
  {
    String[] arrayOfString = OooOO0o;
    int i = arrayOfString.length;
    int j = 0;
    while (j < i)
    {
      String str = OooO00o(arrayOfString[j]);
      boolean bool = TextUtils.isEmpty(str);
      if (bool) {
        j += 1;
      } else {
        return true;
      }
    }
    return false;
  }
  
  public static boolean isEmui()
  {
    return TextUtils.isEmpty(OooO00o(m54207b69.F54207b69_11("ma130F5106180D130C57200E1E1E151C1E5F151E271C"))) ^ true;
  }
  
  public static boolean isHarmonyOs()
  {
    boolean bool = AndroidVersion.isAndroid10();
    if (!bool) {
      return false;
    }
    Object localObject1 = "v%464B4A0E51554A594855156168635F4F581C7963605E577775";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = Class.forName((String)localObject1);
      Object localObject2 = "(<5B5A4A76538354645A61";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      Object localObject3 = new Class[0];
      localObject2 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
      localObject3 = new Object[0];
      localObject1 = ((Method)localObject2).invoke(localObject1, (Object[])localObject3);
      localObject2 = "?[133B2B39383A28";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject1 = String.valueOf(localObject1);
      return ((String)localObject2).equalsIgnoreCase((String)localObject1);
    }
    finally
    {
      finally;
    }
    return false;
  }
  
  public static boolean isMagicOs()
  {
    String str1 = getBrand();
    String str2 = getManufacturer();
    String[] arrayOfString = OooOO0O;
    return OooO0o0(str1, str2, arrayOfString);
  }
  
  public static boolean isMiui()
  {
    return TextUtils.isEmpty(OooO00o(m54207b69.F54207b69_11("[b100E4E120F1C11531F14561F131D1F1A1D1D5E1F17241D"))) ^ true;
  }
  
  public static boolean isMiuiOptimization()
  {
    Object localObject1 = String.class;
    boolean bool1 = true;
    Object localObject2 = "@[3A36412C3837457C3C317F132E353D4D461C3B473F533F464A5742";
    try
    {
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject2 = Class.forName((String)localObject2);
      Object localObject3 = "get";
      int i = 2;
      Object localObject4 = new Class[i];
      boolean bool2 = false;
      localObject4[0] = localObject1;
      localObject4[bool1] = localObject1;
      localObject3 = ((Class)localObject2).getMethod((String)localObject3, (Class[])localObject4);
      localObject4 = new Object[i];
      Object localObject5 = "m+594507494663480C506862";
      localObject5 = m54207b69.F54207b69_11((String)localObject5);
      localObject4[0] = localObject5;
      localObject5 = "";
      localObject4[bool1] = localObject5;
      localObject3 = ((Method)localObject3).invoke(localObject2, (Object[])localObject4);
      localObject3 = String.valueOf(localObject3);
      localObject4 = ".^393C2C1F353638424739";
      localObject4 = m54207b69.F54207b69_11((String)localObject4);
      localObject5 = new Class[i];
      localObject5[0] = localObject1;
      localObject1 = Boolean.TYPE;
      localObject5[bool1] = localObject1;
      localObject1 = ((Class)localObject2).getMethod((String)localObject4, (Class[])localObject5);
      Object[] arrayOfObject = new Object[i];
      localObject4 = "Vu05110909200B07620E15106624290E2B3A2B1714302D32262C1A363537";
      localObject4 = m54207b69.F54207b69_11((String)localObject4);
      arrayOfObject[0] = localObject4;
      localObject4 = "1";
      boolean bool3 = ((String)localObject4).equals(localObject3);
      if (!bool3) {
        bool2 = bool1;
      }
      localObject3 = Boolean.valueOf(bool2);
      arrayOfObject[bool1] = localObject3;
      localObject1 = ((Method)localObject1).invoke(localObject2, arrayOfObject);
      localObject1 = String.valueOf(localObject1);
      return Boolean.parseBoolean((String)localObject1);
    }
    catch (IllegalAccessException localIllegalAccessException) {}catch (NoSuchMethodException localNoSuchMethodException) {}catch (InvocationTargetException localInvocationTargetException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    localClassNotFoundException.printStackTrace();
    return bool1;
  }
  
  public static boolean isOneUi()
  {
    String str1 = getBrand();
    String str2 = getManufacturer();
    String[] arrayOfString = OooOO0;
    return OooO0o0(str1, str2, arrayOfString);
  }
  
  public static boolean isOriginOs()
  {
    return TextUtils.isEmpty(OooO00o(m54207b69.F54207b69_11("1&544A0A5353554F0F515E124F5F5C5851185361686A5F5D7620685C"))) ^ true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.PhoneRomUtils
 * JD-Core Version:    0.7.0.1
 */