package com.lzf.easyfloat.permission.rom;

import android.os.Build;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m54207b69;

public final class RomUtils
{
  public static final RomUtils OooO00o;
  
  static
  {
    RomUtils localRomUtils = new com/lzf/easyfloat/permission/rom/RomUtils;
    localRomUtils.<init>();
    OooO00o = localRomUtils;
  }
  
  /* Error */
  public static final String OooO0o0(String paramString)
  {
    // Byte code:
    //   0: ldc 15
    //   2: invokestatic 21	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   5: astore_1
    //   6: aload_0
    //   7: aload_1
    //   8: invokestatic 27	kotlin/jvm/internal/Intrinsics:OooO0o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   11: aconst_null
    //   12: astore_1
    //   13: invokestatic 33	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   16: astore_2
    //   17: ldc 35
    //   19: astore_3
    //   20: aload_3
    //   21: invokestatic 21	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   24: astore_3
    //   25: aload_3
    //   26: aload_0
    //   27: invokestatic 39	kotlin/jvm/internal/Intrinsics:OooOOOO	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   30: astore_3
    //   31: aload_2
    //   32: aload_3
    //   33: invokevirtual 43	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   36: astore_2
    //   37: new 45	java/io/BufferedReader
    //   40: astore_3
    //   41: new 47	java/io/InputStreamReader
    //   44: astore 4
    //   46: aload_2
    //   47: invokevirtual 53	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   50: astore_2
    //   51: aload 4
    //   53: aload_2
    //   54: invokespecial 56	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   57: sipush 1024
    //   60: istore 5
    //   62: aload_3
    //   63: aload 4
    //   65: iload 5
    //   67: invokespecial 60	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   70: aload_3
    //   71: invokevirtual 64	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   74: astore_2
    //   75: ldc 66
    //   77: astore 4
    //   79: aload 4
    //   81: invokestatic 21	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   84: astore 4
    //   86: aload_2
    //   87: aload 4
    //   89: invokestatic 69	kotlin/jvm/internal/Intrinsics:OooO0o0	(Ljava/lang/Object;Ljava/lang/String;)V
    //   92: aload_3
    //   93: invokevirtual 72	java/io/BufferedReader:close	()V
    //   96: aload_3
    //   97: invokevirtual 72	java/io/BufferedReader:close	()V
    //   100: aload_2
    //   101: areturn
    //   102: astore_0
    //   103: goto +33 -> 136
    //   106: pop
    //   107: aconst_null
    //   108: astore_3
    //   109: ldc 74
    //   111: astore_2
    //   112: aload_2
    //   113: invokestatic 21	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   116: astore_2
    //   117: aload_2
    //   118: aload_0
    //   119: invokestatic 39	kotlin/jvm/internal/Intrinsics:OooOOOO	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   122: pop
    //   123: aload_3
    //   124: ifnull +7 -> 131
    //   127: aload_3
    //   128: invokevirtual 72	java/io/BufferedReader:close	()V
    //   131: aconst_null
    //   132: areturn
    //   133: astore_0
    //   134: aload_3
    //   135: astore_1
    //   136: aload_1
    //   137: ifnull +7 -> 144
    //   140: aload_1
    //   141: invokevirtual 72	java/io/BufferedReader:close	()V
    //   144: aload_0
    //   145: athrow
    //   146: pop
    //   147: goto -47 -> 100
    //   150: pop
    //   151: goto -42 -> 109
    //   154: pop
    //   155: goto -24 -> 131
    //   158: pop
    //   159: goto -15 -> 144
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	162	0	paramString	String
    //   5	136	1	localObject1	Object
    //   16	102	2	localObject2	Object
    //   19	116	3	localObject3	Object
    //   44	44	4	localObject4	Object
    //   60	6	5	i	int
    //   106	1	6	localException1	Exception
    //   146	1	7	localIOException1	java.io.IOException
    //   150	1	8	localException2	Exception
    //   154	1	9	localIOException2	java.io.IOException
    //   158	1	10	localIOException3	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   13	16	102	finally
    //   20	24	102	finally
    //   26	30	102	finally
    //   32	36	102	finally
    //   37	40	102	finally
    //   41	44	102	finally
    //   46	50	102	finally
    //   53	57	102	finally
    //   65	70	102	finally
    //   13	16	106	java/lang/Exception
    //   20	24	106	java/lang/Exception
    //   26	30	106	java/lang/Exception
    //   32	36	106	java/lang/Exception
    //   37	40	106	java/lang/Exception
    //   41	44	106	java/lang/Exception
    //   46	50	106	java/lang/Exception
    //   53	57	106	java/lang/Exception
    //   65	70	106	java/lang/Exception
    //   70	74	133	finally
    //   79	84	133	finally
    //   87	92	133	finally
    //   92	96	133	finally
    //   112	116	133	finally
    //   118	123	133	finally
    //   96	100	146	java/io/IOException
    //   70	74	150	java/lang/Exception
    //   79	84	150	java/lang/Exception
    //   87	92	150	java/lang/Exception
    //   92	96	150	java/lang/Exception
    //   127	131	154	java/io/IOException
    //   140	144	158	java/io/IOException
  }
  
  public static final double getEmuiVersion()
  {
    Object localObject1 = "ma130F5106180D130C57200E1E1E151C1E5F151E271C";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = OooO0o0((String)localObject1);
      Intrinsics.OooO0OO(localObject1);
      String str = "_";
      int i = 6;
      Object localObject2 = localObject1;
      int j = StringsKt.OooOooo((CharSequence)localObject1, str, 0, false, i, null) + 1;
      if (localObject1 != null)
      {
        localObject1 = ((String)localObject1).substring(j);
        localObject2 = "%C6B382D2D346828376B322C402E7A3D313D357F234B4640443C83874B523E4E56514B4F478F555D495960345853536999";
        localObject2 = m54207b69.F54207b69_11((String)localObject2);
        Intrinsics.OooO0o0(localObject1, (String)localObject2);
        return Double.parseDouble((String)localObject1);
      }
      localObject1 = new java/lang/NullPointerException;
      localObject2 = "}55B415B5C195B5A6263634B20635D236564575328556F2B72727432765C767734616D677339847A6A7C44837F877F499571788E8E86";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      ((NullPointerException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    catch (Exception localException)
    {
      localException;
    }
    return 4.0D;
  }
  
  public final boolean OooO00o()
  {
    String str1 = Build.MANUFACTURER;
    String str2 = m54207b69.F54207b69_11("rb2F242E3A2828273D3F39313B");
    Intrinsics.OooO0o0(str1, str2);
    String str3 = m54207b69.F54207b69_11("eF0E1409140714");
    return StringsKt.OooOo0O(str1, str3, false, 2, null);
  }
  
  public final boolean OooO0O0()
  {
    String str1 = OooO0o0(m54207b69.F54207b69_11("W;4955175C52575D661D685C5357646851256371"));
    boolean bool1 = TextUtils.isEmpty(str1);
    boolean bool2 = false;
    if (!bool1)
    {
      Intrinsics.OooO0OO(str1);
      String str2 = m54207b69.F54207b69_11("EG212C402D26");
      int i = 2;
      boolean bool3 = StringsKt.OooOo0O(str1, str2, false, i, null);
      if (!bool3)
      {
        str1 = str1.toLowerCase();
        String str3 = m54207b69.F54207b69_11("1T7C213E402B793B2E7C473F2D418746444A448C1A343B53514B96943B57355942514739584B56A2A4");
        Intrinsics.OooO0o0(str1, str3);
        boolean bool4 = StringsKt.OooOo0O(str1, str2, false, i, null);
        if (!bool4) {}
      }
      else
      {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final boolean OooO0OO()
  {
    return TextUtils.isEmpty(OooO0o0(m54207b69.F54207b69_11("[b100E4E120F1C11531F14561F131D1F1A1D1D5E1F17241D"))) ^ true;
  }
  
  public final boolean OooO0Oo()
  {
    String str1 = Build.MANUFACTURER;
    String str2 = m54207b69.F54207b69_11("rb2F242E3A2828273D3F39313B");
    Intrinsics.OooO0o0(str1, str2);
    String str3 = m54207b69.F54207b69_11("n5637D657D");
    boolean bool1 = false;
    int i = 2;
    boolean bool2 = StringsKt.OooOo0O(str1, str3, false, i, null);
    if (!bool2)
    {
      Intrinsics.OooO0o0(str1, str2);
      str2 = m54207b69.F54207b69_11("_X2E32303A");
      boolean bool3 = StringsKt.OooOo0O(str1, str2, false, i, null);
      if (!bool3) {}
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.permission.rom.RomUtils
 * JD-Core Version:    0.7.0.1
 */