package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class ProfileTranscoder
{
  public static final byte[] OooO00o;
  public static final byte[] OooO0O0;
  
  static
  {
    int i = 4;
    byte[] arrayOfByte1 = new byte[i];
    byte[] tmp7_6 = arrayOfByte1;
    byte[] tmp8_7 = tmp7_6;
    byte[] tmp8_7 = tmp7_6;
    tmp8_7[0] = 112;
    tmp8_7[1] = 114;
    tmp8_7[2] = 111;
    tmp8_7[3] = 0;
    OooO00o = arrayOfByte1;
    byte[] arrayOfByte2 = new byte[i];
    byte[] tmp33_32 = arrayOfByte2;
    byte[] tmp34_33 = tmp33_32;
    byte[] tmp34_33 = tmp33_32;
    tmp34_33[0] = 112;
    tmp34_33[1] = 114;
    tmp34_33[2] = 109;
    tmp34_33[3] = 0;
    OooO0O0 = arrayOfByte2;
  }
  
  public static DexProfileData OooO(DexProfileData[] paramArrayOfDexProfileData, String paramString)
  {
    int i = paramArrayOfDexProfileData.length;
    if (i <= 0) {
      return null;
    }
    paramString = OooO0oo(paramString);
    i = 0;
    for (;;)
    {
      int j = paramArrayOfDexProfileData.length;
      if (i >= j) {
        break;
      }
      String str = paramArrayOfDexProfileData[i].OooO0O0;
      boolean bool = str.equals(paramString);
      if (bool) {
        return paramArrayOfDexProfileData[i];
      }
      i += 1;
    }
    return null;
  }
  
  public static int OooO00o(DexProfileData paramDexProfileData)
  {
    paramDexProfileData = paramDexProfileData.OooO.entrySet().iterator();
    int i = 0;
    for (;;)
    {
      boolean bool = paramDexProfileData.hasNext();
      if (!bool) {
        break;
      }
      Integer localInteger = (Integer)((Map.Entry)paramDexProfileData.next()).getValue();
      int j = localInteger.intValue();
      i |= j;
    }
    return i;
  }
  
  public static byte[] OooO0O0(DexProfileData[] paramArrayOfDexProfileData, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfDexProfileData.length;
    int j = 0;
    int k = 0;
    Object localObject1 = null;
    int n = 0;
    Object localObject2;
    String str1;
    while (k < i)
    {
      localDexProfileData = paramArrayOfDexProfileData[k];
      localObject2 = localDexProfileData.OooO00o;
      str1 = localDexProfileData.OooO0O0;
      localObject2 = OooOO0((String)localObject2, str1, paramArrayOfByte);
      int i1 = Encoding.OooOO0O((String)localObject2) + 16;
      int i2 = localDexProfileData.OooO0o0 * 2;
      i1 += i2;
      i2 = localDexProfileData.OooO0o;
      i1 += i2;
      i3 = getMethodBitmapStorageSize(localDexProfileData.OooO0oO);
      i1 += i3;
      n += i1;
      k += 1;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>(n);
    localObject1 = ProfileVersion.OooO0OO;
    boolean bool = Arrays.equals(paramArrayOfByte, (byte[])localObject1);
    if (bool)
    {
      m = paramArrayOfDexProfileData.length;
      while (j < m)
      {
        localDexProfileData = paramArrayOfDexProfileData[j];
        localObject2 = localDexProfileData.OooO00o;
        str1 = localDexProfileData.OooO0O0;
        localObject2 = OooOO0((String)localObject2, str1, paramArrayOfByte);
        Oooo000(localByteArrayOutputStream, localDexProfileData, (String)localObject2);
        OooOooo(localByteArrayOutputStream, localDexProfileData);
        j += 1;
      }
    }
    int m = paramArrayOfDexProfileData.length;
    int i3 = 0;
    DexProfileData localDexProfileData = null;
    while (i3 < m)
    {
      localObject2 = paramArrayOfDexProfileData[i3];
      str1 = ((DexProfileData)localObject2).OooO00o;
      String str2 = ((DexProfileData)localObject2).OooO0O0;
      str1 = OooOO0(str1, str2, paramArrayOfByte);
      Oooo000(localByteArrayOutputStream, (DexProfileData)localObject2, str1);
      i3 += 1;
    }
    int i4 = paramArrayOfDexProfileData.length;
    while (j < i4)
    {
      localObject1 = paramArrayOfDexProfileData[j];
      OooOooo(localByteArrayOutputStream, (DexProfileData)localObject1);
      j += 1;
    }
    int i5 = localByteArrayOutputStream.size();
    if (i5 == n) {
      return localByteArrayOutputStream.toByteArray();
    }
    paramArrayOfDexProfileData = new java/lang/StringBuilder;
    paramArrayOfDexProfileData.<init>();
    paramArrayOfDexProfileData.append("The bytes saved do not match expectation. actual=");
    i4 = localByteArrayOutputStream.size();
    paramArrayOfDexProfileData.append(i4);
    paramArrayOfDexProfileData.append(" expected=");
    paramArrayOfDexProfileData.append(n);
    throw Encoding.OooO0OO(paramArrayOfDexProfileData.toString());
  }
  
  /* Error */
  public static WritableFileSection OooO0OO(DexProfileData[] paramArrayOfDexProfileData)
  {
    // Byte code:
    //   0: new 96	java/io/ByteArrayOutputStream
    //   3: astore_1
    //   4: aload_1
    //   5: invokespecial 146	java/io/ByteArrayOutputStream:<init>	()V
    //   8: iconst_0
    //   9: istore_2
    //   10: aconst_null
    //   11: astore_3
    //   12: iconst_0
    //   13: istore 4
    //   15: aconst_null
    //   16: astore 5
    //   18: aload_0
    //   19: arraylength
    //   20: istore 6
    //   22: iload_2
    //   23: iload 6
    //   25: if_icmpge +67 -> 92
    //   28: aload_0
    //   29: iload_2
    //   30: aaload
    //   31: astore 7
    //   33: iload 4
    //   35: iconst_2
    //   36: iadd
    //   37: istore 4
    //   39: aload_1
    //   40: iload_2
    //   41: invokestatic 150	androidx/profileinstaller/Encoding:OooOOOo	(Ljava/io/OutputStream;I)V
    //   44: iload 4
    //   46: iconst_2
    //   47: iadd
    //   48: istore 4
    //   50: aload 7
    //   52: getfield 84	androidx/profileinstaller/DexProfileData:OooO0o0	I
    //   55: istore 8
    //   57: aload_1
    //   58: iload 8
    //   60: invokestatic 150	androidx/profileinstaller/Encoding:OooOOOo	(Ljava/io/OutputStream;I)V
    //   63: aload 7
    //   65: getfield 84	androidx/profileinstaller/DexProfileData:OooO0o0	I
    //   68: iconst_2
    //   69: imul
    //   70: istore 8
    //   72: iload 4
    //   74: iload 8
    //   76: iadd
    //   77: istore 4
    //   79: aload_1
    //   80: aload 7
    //   82: invokestatic 153	androidx/profileinstaller/ProfileTranscoder:OooOoo0	(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;)V
    //   85: iload_2
    //   86: iconst_1
    //   87: iadd
    //   88: istore_2
    //   89: goto -71 -> 18
    //   92: aload_1
    //   93: invokevirtual 124	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   96: astore_0
    //   97: aload_0
    //   98: arraylength
    //   99: istore_2
    //   100: iload 4
    //   102: iload_2
    //   103: if_icmpne +32 -> 135
    //   106: new 155	androidx/profileinstaller/WritableFileSection
    //   109: astore_3
    //   110: getstatic 161	androidx/profileinstaller/FileSectionType:o00Ooo0O	Landroidx/profileinstaller/FileSectionType;
    //   113: astore 7
    //   115: iconst_1
    //   116: istore 8
    //   118: aload_3
    //   119: aload 7
    //   121: iload 4
    //   123: aload_0
    //   124: iload 8
    //   126: invokespecial 165	androidx/profileinstaller/WritableFileSection:<init>	(Landroidx/profileinstaller/FileSectionType;I[BZ)V
    //   129: aload_1
    //   130: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   133: aload_3
    //   134: areturn
    //   135: new 126	java/lang/StringBuilder
    //   138: astore_3
    //   139: aload_3
    //   140: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   143: ldc 170
    //   145: astore 7
    //   147: aload_3
    //   148: aload 7
    //   150: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: aload_3
    //   155: iload 4
    //   157: invokevirtual 136	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   160: pop
    //   161: ldc 172
    //   163: astore 5
    //   165: aload_3
    //   166: aload 5
    //   168: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: pop
    //   172: aload_0
    //   173: arraylength
    //   174: istore 9
    //   176: aload_3
    //   177: iload 9
    //   179: invokevirtual 136	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   182: pop
    //   183: aload_3
    //   184: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: astore_0
    //   188: aload_0
    //   189: invokestatic 145	androidx/profileinstaller/Encoding:OooO0OO	(Ljava/lang/String;)Ljava/lang/RuntimeException;
    //   192: astore_0
    //   193: aload_0
    //   194: athrow
    //   195: astore_0
    //   196: aload_1
    //   197: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   200: goto +9 -> 209
    //   203: astore_1
    //   204: aload_0
    //   205: aload_1
    //   206: invokevirtual 178	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   209: aload_0
    //   210: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	211	0	paramArrayOfDexProfileData	DexProfileData[]
    //   3	194	1	localByteArrayOutputStream	ByteArrayOutputStream
    //   203	3	1	localThrowable	java.lang.Throwable
    //   9	95	2	i	int
    //   11	173	3	localObject1	Object
    //   13	143	4	j	int
    //   16	151	5	str	String
    //   20	6	6	k	int
    //   31	118	7	localObject2	Object
    //   55	70	8	m	int
    //   174	4	9	n	int
    // Exception table:
    //   from	to	target	type
    //   18	20	195	finally
    //   29	31	195	finally
    //   40	44	195	finally
    //   50	55	195	finally
    //   58	63	195	finally
    //   63	68	195	finally
    //   80	85	195	finally
    //   92	96	195	finally
    //   97	99	195	finally
    //   106	109	195	finally
    //   110	113	195	finally
    //   124	129	195	finally
    //   135	138	195	finally
    //   139	143	195	finally
    //   148	154	195	finally
    //   155	161	195	finally
    //   166	172	195	finally
    //   172	174	195	finally
    //   177	183	195	finally
    //   183	187	195	finally
    //   188	192	195	finally
    //   193	195	195	finally
    //   196	200	203	finally
  }
  
  /* Error */
  public static WritableFileSection OooO0Oo(DexProfileData[] paramArrayOfDexProfileData)
  {
    // Byte code:
    //   0: new 96	java/io/ByteArrayOutputStream
    //   3: astore_1
    //   4: aload_1
    //   5: invokespecial 146	java/io/ByteArrayOutputStream:<init>	()V
    //   8: iconst_0
    //   9: istore_2
    //   10: aconst_null
    //   11: astore_3
    //   12: iconst_0
    //   13: istore 4
    //   15: aconst_null
    //   16: astore 5
    //   18: aload_0
    //   19: arraylength
    //   20: istore 6
    //   22: iload_2
    //   23: iload 6
    //   25: if_icmpge +108 -> 133
    //   28: aload_0
    //   29: iload_2
    //   30: aaload
    //   31: astore 7
    //   33: aload 7
    //   35: invokestatic 181	androidx/profileinstaller/ProfileTranscoder:OooO00o	(Landroidx/profileinstaller/DexProfileData;)I
    //   38: istore 8
    //   40: aload 7
    //   42: invokestatic 184	androidx/profileinstaller/ProfileTranscoder:OooO0o0	(Landroidx/profileinstaller/DexProfileData;)[B
    //   45: astore 9
    //   47: aload 7
    //   49: invokestatic 186	androidx/profileinstaller/ProfileTranscoder:OooO0o	(Landroidx/profileinstaller/DexProfileData;)[B
    //   52: astore 7
    //   54: iload 4
    //   56: iconst_2
    //   57: iadd
    //   58: istore 4
    //   60: aload_1
    //   61: iload_2
    //   62: invokestatic 150	androidx/profileinstaller/Encoding:OooOOOo	(Ljava/io/OutputStream;I)V
    //   65: aload 9
    //   67: arraylength
    //   68: iconst_2
    //   69: iadd
    //   70: istore 10
    //   72: aload 7
    //   74: arraylength
    //   75: istore 11
    //   77: iload 10
    //   79: iload 11
    //   81: iadd
    //   82: istore 10
    //   84: iload 4
    //   86: iconst_4
    //   87: iadd
    //   88: istore 4
    //   90: iload 10
    //   92: i2l
    //   93: lstore 12
    //   95: aload_1
    //   96: lload 12
    //   98: invokestatic 190	androidx/profileinstaller/Encoding:OooOOo0	(Ljava/io/OutputStream;J)V
    //   101: aload_1
    //   102: iload 8
    //   104: invokestatic 150	androidx/profileinstaller/Encoding:OooOOOo	(Ljava/io/OutputStream;I)V
    //   107: aload_1
    //   108: aload 9
    //   110: invokevirtual 196	java/io/OutputStream:write	([B)V
    //   113: aload_1
    //   114: aload 7
    //   116: invokevirtual 196	java/io/OutputStream:write	([B)V
    //   119: iload 4
    //   121: iload 10
    //   123: iadd
    //   124: istore 4
    //   126: iload_2
    //   127: iconst_1
    //   128: iadd
    //   129: istore_2
    //   130: goto -112 -> 18
    //   133: aload_1
    //   134: invokevirtual 124	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   137: astore_0
    //   138: aload_0
    //   139: arraylength
    //   140: istore_2
    //   141: iload 4
    //   143: iload_2
    //   144: if_icmpne +32 -> 176
    //   147: new 155	androidx/profileinstaller/WritableFileSection
    //   150: astore_3
    //   151: getstatic 199	androidx/profileinstaller/FileSectionType:o00Ooo0o	Landroidx/profileinstaller/FileSectionType;
    //   154: astore 7
    //   156: iconst_1
    //   157: istore 8
    //   159: aload_3
    //   160: aload 7
    //   162: iload 4
    //   164: aload_0
    //   165: iload 8
    //   167: invokespecial 165	androidx/profileinstaller/WritableFileSection:<init>	(Landroidx/profileinstaller/FileSectionType;I[BZ)V
    //   170: aload_1
    //   171: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   174: aload_3
    //   175: areturn
    //   176: new 126	java/lang/StringBuilder
    //   179: astore_3
    //   180: aload_3
    //   181: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   184: ldc 170
    //   186: astore 7
    //   188: aload_3
    //   189: aload 7
    //   191: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: aload_3
    //   196: iload 4
    //   198: invokevirtual 136	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   201: pop
    //   202: ldc 172
    //   204: astore 5
    //   206: aload_3
    //   207: aload 5
    //   209: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: pop
    //   213: aload_0
    //   214: arraylength
    //   215: istore 14
    //   217: aload_3
    //   218: iload 14
    //   220: invokevirtual 136	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: aload_3
    //   225: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   228: astore_0
    //   229: aload_0
    //   230: invokestatic 145	androidx/profileinstaller/Encoding:OooO0OO	(Ljava/lang/String;)Ljava/lang/RuntimeException;
    //   233: astore_0
    //   234: aload_0
    //   235: athrow
    //   236: astore_0
    //   237: aload_1
    //   238: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   241: goto +9 -> 250
    //   244: astore_1
    //   245: aload_0
    //   246: aload_1
    //   247: invokevirtual 178	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   250: aload_0
    //   251: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	252	0	paramArrayOfDexProfileData	DexProfileData[]
    //   3	235	1	localByteArrayOutputStream	ByteArrayOutputStream
    //   244	3	1	localThrowable	java.lang.Throwable
    //   9	136	2	i	int
    //   11	214	3	localObject1	Object
    //   13	184	4	j	int
    //   16	192	5	str	String
    //   20	6	6	k	int
    //   31	159	7	localObject2	Object
    //   38	128	8	m	int
    //   45	64	9	arrayOfByte	byte[]
    //   70	54	10	n	int
    //   75	7	11	i1	int
    //   93	4	12	l	long
    //   215	4	14	i2	int
    // Exception table:
    //   from	to	target	type
    //   18	20	236	finally
    //   29	31	236	finally
    //   33	38	236	finally
    //   40	45	236	finally
    //   47	52	236	finally
    //   61	65	236	finally
    //   65	68	236	finally
    //   72	75	236	finally
    //   96	101	236	finally
    //   102	107	236	finally
    //   108	113	236	finally
    //   114	119	236	finally
    //   133	137	236	finally
    //   138	140	236	finally
    //   147	150	236	finally
    //   151	154	236	finally
    //   165	170	236	finally
    //   176	179	236	finally
    //   180	184	236	finally
    //   189	195	236	finally
    //   196	202	236	finally
    //   207	213	236	finally
    //   213	215	236	finally
    //   218	224	236	finally
    //   224	228	236	finally
    //   229	233	236	finally
    //   234	236	236	finally
    //   237	241	244	finally
  }
  
  /* Error */
  public static byte[] OooO0o(DexProfileData paramDexProfileData)
  {
    // Byte code:
    //   0: new 96	java/io/ByteArrayOutputStream
    //   3: astore_1
    //   4: aload_1
    //   5: invokespecial 146	java/io/ByteArrayOutputStream:<init>	()V
    //   8: aload_1
    //   9: aload_0
    //   10: invokestatic 202	androidx/profileinstaller/ProfileTranscoder:Oooo00o	(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;)V
    //   13: aload_1
    //   14: invokevirtual 124	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   17: astore_0
    //   18: aload_1
    //   19: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   22: aload_0
    //   23: areturn
    //   24: astore_0
    //   25: aload_1
    //   26: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   29: goto +9 -> 38
    //   32: astore_1
    //   33: aload_0
    //   34: aload_1
    //   35: invokevirtual 178	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   38: aload_0
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	paramDexProfileData	DexProfileData
    //   3	23	1	localByteArrayOutputStream	ByteArrayOutputStream
    //   32	3	1	localThrowable	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   9	13	24	finally
    //   13	17	24	finally
    //   25	29	32	finally
  }
  
  /* Error */
  public static byte[] OooO0o0(DexProfileData paramDexProfileData)
  {
    // Byte code:
    //   0: new 96	java/io/ByteArrayOutputStream
    //   3: astore_1
    //   4: aload_1
    //   5: invokespecial 146	java/io/ByteArrayOutputStream:<init>	()V
    //   8: aload_1
    //   9: aload_0
    //   10: invokestatic 205	androidx/profileinstaller/ProfileTranscoder:Oooo00O	(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;)V
    //   13: aload_1
    //   14: invokevirtual 124	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   17: astore_0
    //   18: aload_1
    //   19: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   22: aload_0
    //   23: areturn
    //   24: astore_0
    //   25: aload_1
    //   26: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   29: goto +9 -> 38
    //   32: astore_1
    //   33: aload_0
    //   34: aload_1
    //   35: invokevirtual 178	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   38: aload_0
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	paramDexProfileData	DexProfileData
    //   3	23	1	localByteArrayOutputStream	ByteArrayOutputStream
    //   32	3	1	localThrowable	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   9	13	24	finally
    //   13	17	24	finally
    //   25	29	32	finally
  }
  
  public static String OooO0oO(String paramString1, String paramString2)
  {
    String str1 = "!";
    boolean bool1 = str1.equals(paramString2);
    String str2 = ":";
    if (bool1) {
      return paramString1.replace(str2, str1);
    }
    boolean bool2 = str2.equals(paramString2);
    if (bool2) {
      paramString1 = paramString1.replace(str1, str2);
    }
    return paramString1;
  }
  
  public static String OooO0oo(String paramString)
  {
    String str = "!";
    int i = paramString.indexOf(str);
    if (i < 0)
    {
      str = ":";
      i = paramString.indexOf(str);
    }
    if (i > 0)
    {
      i += 1;
      paramString = paramString.substring(i);
    }
    return paramString;
  }
  
  public static String OooOO0(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    Object localObject = ProfileVersion.OooO00o(paramArrayOfByte);
    int i = paramString1.length();
    if (i <= 0) {
      return OooO0oO(paramString2, (String)localObject);
    }
    String str = "classes.dex";
    boolean bool1 = paramString2.equals(str);
    if (bool1) {
      return paramString1;
    }
    str = "!";
    bool1 = paramString2.contains(str);
    if (!bool1)
    {
      str = ":";
      bool1 = paramString2.contains(str);
      if (!bool1)
      {
        localObject = ".apk";
        boolean bool2 = paramString2.endsWith((String)localObject);
        if (bool2) {
          return paramString2;
        }
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append(paramString1);
        paramString1 = ProfileVersion.OooO00o(paramArrayOfByte);
        ((StringBuilder)localObject).append(paramString1);
        ((StringBuilder)localObject).append(paramString2);
        return ((StringBuilder)localObject).toString();
      }
    }
    return OooO0oO(paramString2, (String)localObject);
  }
  
  public static int OooOO0O(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    if (paramInt1 != i)
    {
      i = 2;
      if (paramInt1 != i)
      {
        i = 4;
        if (paramInt1 == i) {
          return paramInt2 + paramInt3;
        }
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Unexpected flag: ");
        localStringBuilder.append(paramInt1);
        throw Encoding.OooO0OO(localStringBuilder.toString());
      }
      return paramInt2;
    }
    throw Encoding.OooO0OO("HOT methods are not stored in the bitmap");
  }
  
  public static int[] OooOO0o(InputStream paramInputStream, int paramInt)
  {
    int[] arrayOfInt = new int[paramInt];
    int i = 0;
    int j = 0;
    while (i < paramInt)
    {
      int k = Encoding.OooO0oo(paramInputStream);
      j += k;
      arrayOfInt[i] = j;
      i += 1;
    }
    return arrayOfInt;
  }
  
  public static byte[] OooOOO(InputStream paramInputStream, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    byte[] arrayOfByte = Encoding.OooO0Oo(paramInputStream, i);
    boolean bool = Arrays.equals(paramArrayOfByte, arrayOfByte);
    if (bool)
    {
      int j = ProfileVersion.OooO0O0.length;
      return Encoding.OooO0Oo(paramInputStream, j);
    }
    throw Encoding.OooO0OO("Invalid magic");
  }
  
  public static int OooOOO0(BitSet paramBitSet, int paramInt1, int paramInt2)
  {
    int i = 2;
    int j = OooOO0O(i, paramInt1, paramInt2);
    boolean bool1 = paramBitSet.get(j);
    if (!bool1) {
      i = 0;
    }
    int k = 4;
    paramInt1 = OooOO0O(k, paramInt1, paramInt2);
    boolean bool2 = paramBitSet.get(paramInt1);
    if (bool2) {
      i |= 0x4;
    }
    return i;
  }
  
  public static void OooOOOO(InputStream paramInputStream, DexProfileData paramDexProfileData)
  {
    int i = paramInputStream.available();
    int j = paramDexProfileData.OooO0o;
    i -= j;
    j = 0;
    for (;;)
    {
      int k = paramInputStream.available();
      if (k <= i) {
        break;
      }
      k = Encoding.OooO0oo(paramInputStream);
      j += k;
      TreeMap localTreeMap = paramDexProfileData.OooO;
      Integer localInteger1 = Integer.valueOf(j);
      int m = 1;
      Integer localInteger2 = Integer.valueOf(m);
      localTreeMap.put(localInteger1, localInteger2);
      k = Encoding.OooO0oo(paramInputStream);
      while (k > 0)
      {
        OooOoO(paramInputStream);
        k += -1;
      }
    }
    int n = paramInputStream.available();
    if (n == i) {
      return;
    }
    throw Encoding.OooO0OO("Read too much data during profile line parse");
  }
  
  public static DexProfileData[] OooOOOo(InputStream paramInputStream, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, DexProfileData[] paramArrayOfDexProfileData)
  {
    byte[] arrayOfByte = ProfileVersion.OooO0o;
    boolean bool1 = Arrays.equals(paramArrayOfByte1, arrayOfByte);
    if (bool1)
    {
      arrayOfByte = ProfileVersion.OooO00o;
      boolean bool2 = Arrays.equals(arrayOfByte, paramArrayOfByte2);
      if (!bool2) {
        return OooOOo0(paramInputStream, paramArrayOfByte1, paramArrayOfDexProfileData);
      }
      throw Encoding.OooO0OO("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
    }
    arrayOfByte = ProfileVersion.OooO0oO;
    boolean bool3 = Arrays.equals(paramArrayOfByte1, arrayOfByte);
    if (bool3) {
      return OooOOoo(paramInputStream, paramArrayOfByte2, paramArrayOfDexProfileData);
    }
    throw Encoding.OooO0OO("Unsupported meta version");
  }
  
  public static DexProfileData[] OooOOo(InputStream paramInputStream, int paramInt, DexProfileData[] paramArrayOfDexProfileData)
  {
    int i = paramInputStream.available();
    int j = 0;
    if (i == 0) {
      return new DexProfileData[0];
    }
    i = paramArrayOfDexProfileData.length;
    if (paramInt == i)
    {
      String[] arrayOfString = new String[paramInt];
      int[] arrayOfInt = new int[paramInt];
      int k = 0;
      DexProfileData localDexProfileData = null;
      Object localObject;
      while (k < paramInt)
      {
        int m = Encoding.OooO0oo(paramInputStream);
        int i1 = Encoding.OooO0oo(paramInputStream);
        arrayOfInt[k] = i1;
        localObject = Encoding.OooO0o(paramInputStream, m);
        arrayOfString[k] = localObject;
        k += 1;
      }
      while (j < paramInt)
      {
        localDexProfileData = paramArrayOfDexProfileData[j];
        localObject = localDexProfileData.OooO0O0;
        String str = arrayOfString[j];
        boolean bool = ((String)localObject).equals(str);
        if (bool)
        {
          int n = arrayOfInt[j];
          localDexProfileData.OooO0o0 = n;
          localObject = OooOO0o(paramInputStream, n);
          localDexProfileData.OooO0oo = ((int[])localObject);
          j += 1;
        }
        else
        {
          throw Encoding.OooO0OO("Order of dexfiles in metadata did not match baseline");
        }
      }
      return paramArrayOfDexProfileData;
    }
    throw Encoding.OooO0OO("Mismatched number of dex files found in metadata");
  }
  
  /* Error */
  public static DexProfileData[] OooOOo0(InputStream paramInputStream, byte[] paramArrayOfByte, DexProfileData[] paramArrayOfDexProfileData)
  {
    // Byte code:
    //   0: getstatic 286	androidx/profileinstaller/ProfileVersion:OooO0o	[B
    //   3: astore_3
    //   4: aload_1
    //   5: aload_3
    //   6: invokestatic 109	java/util/Arrays:equals	([B[B)Z
    //   9: istore 4
    //   11: iload 4
    //   13: ifeq +97 -> 110
    //   16: aload_0
    //   17: invokestatic 315	androidx/profileinstaller/Encoding:OooOO0	(Ljava/io/InputStream;)I
    //   20: istore 4
    //   22: aload_0
    //   23: invokestatic 318	androidx/profileinstaller/Encoding:OooO	(Ljava/io/InputStream;)J
    //   26: lstore 5
    //   28: aload_0
    //   29: invokestatic 318	androidx/profileinstaller/Encoding:OooO	(Ljava/io/InputStream;)J
    //   32: lstore 7
    //   34: lload 7
    //   36: l2i
    //   37: istore 9
    //   39: lload 5
    //   41: l2i
    //   42: istore 10
    //   44: aload_0
    //   45: iload 9
    //   47: iload 10
    //   49: invokestatic 321	androidx/profileinstaller/Encoding:OooO0o0	(Ljava/io/InputStream;II)[B
    //   52: astore_3
    //   53: aload_0
    //   54: invokevirtual 324	java/io/InputStream:read	()I
    //   57: istore 11
    //   59: iload 11
    //   61: ifgt +42 -> 103
    //   64: new 326	java/io/ByteArrayInputStream
    //   67: astore_0
    //   68: aload_0
    //   69: aload_3
    //   70: invokespecial 328	java/io/ByteArrayInputStream:<init>	([B)V
    //   73: aload_0
    //   74: iload 4
    //   76: aload_2
    //   77: invokestatic 332	androidx/profileinstaller/ProfileTranscoder:OooOOo	(Ljava/io/InputStream;I[Landroidx/profileinstaller/DexProfileData;)[Landroidx/profileinstaller/DexProfileData;
    //   80: astore_1
    //   81: aload_0
    //   82: invokevirtual 333	java/io/InputStream:close	()V
    //   85: aload_1
    //   86: areturn
    //   87: astore_1
    //   88: aload_0
    //   89: invokevirtual 333	java/io/InputStream:close	()V
    //   92: goto +9 -> 101
    //   95: astore_0
    //   96: aload_1
    //   97: aload_0
    //   98: invokevirtual 178	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   101: aload_1
    //   102: athrow
    //   103: ldc_w 335
    //   106: invokestatic 145	androidx/profileinstaller/Encoding:OooO0OO	(Ljava/lang/String;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: ldc_w 299
    //   113: invokestatic 145	androidx/profileinstaller/Encoding:OooO0OO	(Ljava/lang/String;)Ljava/lang/RuntimeException;
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	paramInputStream	InputStream
    //   0	117	1	paramArrayOfByte	byte[]
    //   0	117	2	paramArrayOfDexProfileData	DexProfileData[]
    //   3	67	3	arrayOfByte	byte[]
    //   9	3	4	bool	boolean
    //   20	55	4	i	int
    //   26	14	5	l1	long
    //   32	3	7	l2	long
    //   37	9	9	j	int
    //   42	6	10	k	int
    //   57	3	11	m	int
    // Exception table:
    //   from	to	target	type
    //   76	80	87	finally
    //   88	92	95	finally
  }
  
  /* Error */
  public static DexProfileData[] OooOOoo(InputStream paramInputStream, byte[] paramArrayOfByte, DexProfileData[] paramArrayOfDexProfileData)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 249	androidx/profileinstaller/Encoding:OooO0oo	(Ljava/io/InputStream;)I
    //   4: istore_3
    //   5: aload_0
    //   6: invokestatic 318	androidx/profileinstaller/Encoding:OooO	(Ljava/io/InputStream;)J
    //   9: lstore 4
    //   11: aload_0
    //   12: invokestatic 318	androidx/profileinstaller/Encoding:OooO	(Ljava/io/InputStream;)J
    //   15: lstore 6
    //   17: lload 6
    //   19: l2i
    //   20: istore 8
    //   22: lload 4
    //   24: l2i
    //   25: istore 9
    //   27: aload_0
    //   28: iload 8
    //   30: iload 9
    //   32: invokestatic 321	androidx/profileinstaller/Encoding:OooO0o0	(Ljava/io/InputStream;II)[B
    //   35: astore 10
    //   37: aload_0
    //   38: invokevirtual 324	java/io/InputStream:read	()I
    //   41: istore 11
    //   43: iload 11
    //   45: ifgt +43 -> 88
    //   48: new 326	java/io/ByteArrayInputStream
    //   51: astore_0
    //   52: aload_0
    //   53: aload 10
    //   55: invokespecial 328	java/io/ByteArrayInputStream:<init>	([B)V
    //   58: aload_0
    //   59: aload_1
    //   60: iload_3
    //   61: aload_2
    //   62: invokestatic 339	androidx/profileinstaller/ProfileTranscoder:OooOo00	(Ljava/io/InputStream;[BI[Landroidx/profileinstaller/DexProfileData;)[Landroidx/profileinstaller/DexProfileData;
    //   65: astore_1
    //   66: aload_0
    //   67: invokevirtual 333	java/io/InputStream:close	()V
    //   70: aload_1
    //   71: areturn
    //   72: astore_1
    //   73: aload_0
    //   74: invokevirtual 333	java/io/InputStream:close	()V
    //   77: goto +9 -> 86
    //   80: astore_0
    //   81: aload_1
    //   82: aload_0
    //   83: invokevirtual 178	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   86: aload_1
    //   87: athrow
    //   88: ldc_w 335
    //   91: invokestatic 145	androidx/profileinstaller/Encoding:OooO0OO	(Ljava/lang/String;)Ljava/lang/RuntimeException;
    //   94: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	paramInputStream	InputStream
    //   0	95	1	paramArrayOfByte	byte[]
    //   0	95	2	paramArrayOfDexProfileData	DexProfileData[]
    //   4	57	3	i	int
    //   9	14	4	l1	long
    //   15	3	6	l2	long
    //   20	9	8	j	int
    //   25	6	9	k	int
    //   35	19	10	arrayOfByte	byte[]
    //   41	3	11	m	int
    // Exception table:
    //   from	to	target	type
    //   61	65	72	finally
    //   73	77	80	finally
  }
  
  public static int OooOo(int paramInt)
  {
    return paramInt + 8 + -1 & 0xFFFFFFF8;
  }
  
  public static void OooOo0(InputStream paramInputStream, DexProfileData paramDexProfileData)
  {
    int i = Encoding.OooO00o(paramDexProfileData.OooO0oO * 2);
    paramInputStream = BitSet.valueOf(Encoding.OooO0Oo(paramInputStream, i));
    i = 0;
    int j = 0;
    for (;;)
    {
      int k = paramDexProfileData.OooO0oO;
      if (j >= k) {
        break;
      }
      k = OooOOO0(paramInputStream, j, k);
      if (k != 0)
      {
        Object localObject1 = paramDexProfileData.OooO;
        Object localObject2 = Integer.valueOf(j);
        localObject1 = (Integer)((TreeMap)localObject1).get(localObject2);
        if (localObject1 == null) {
          localObject1 = Integer.valueOf(0);
        }
        localObject2 = paramDexProfileData.OooO;
        Integer localInteger1 = Integer.valueOf(j);
        int m = ((Integer)localObject1).intValue();
        k |= m;
        Integer localInteger2 = Integer.valueOf(k);
        ((TreeMap)localObject2).put(localInteger1, localInteger2);
      }
      j += 1;
    }
  }
  
  public static DexProfileData[] OooOo00(InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt, DexProfileData[] paramArrayOfDexProfileData)
  {
    int i = paramInputStream.available();
    int j = 0;
    if (i == 0) {
      return new DexProfileData[0];
    }
    i = paramArrayOfDexProfileData.length;
    if (paramInt == i)
    {
      while (j < paramInt)
      {
        Encoding.OooO0oo(paramInputStream);
        i = Encoding.OooO0oo(paramInputStream);
        Object localObject = Encoding.OooO0o(paramInputStream, i);
        long l = Encoding.OooO(paramInputStream);
        int k = Encoding.OooO0oo(paramInputStream);
        DexProfileData localDexProfileData = OooO(paramArrayOfDexProfileData, (String)localObject);
        if (localDexProfileData != null)
        {
          localDexProfileData.OooO0Oo = l;
          localObject = OooOO0o(paramInputStream, k);
          byte[] arrayOfByte = ProfileVersion.OooO0o0;
          boolean bool = Arrays.equals(paramArrayOfByte, arrayOfByte);
          if (bool)
          {
            localDexProfileData.OooO0o0 = k;
            localDexProfileData.OooO0oo = ((int[])localObject);
          }
          j += 1;
        }
        else
        {
          paramInputStream = new java/lang/StringBuilder;
          paramInputStream.<init>();
          paramInputStream.append("Missing profile key: ");
          paramInputStream.append((String)localObject);
          throw Encoding.OooO0OO(paramInputStream.toString());
        }
      }
      return paramArrayOfDexProfileData;
    }
    throw Encoding.OooO0OO("Mismatched number of dex files found in metadata");
  }
  
  /* Error */
  public static DexProfileData[] OooOo0O(InputStream paramInputStream, byte[] paramArrayOfByte, String paramString)
  {
    // Byte code:
    //   0: getstatic 254	androidx/profileinstaller/ProfileVersion:OooO0O0	[B
    //   3: astore_3
    //   4: aload_1
    //   5: aload_3
    //   6: invokestatic 109	java/util/Arrays:equals	([B[B)Z
    //   9: istore 4
    //   11: iload 4
    //   13: ifeq +97 -> 110
    //   16: aload_0
    //   17: invokestatic 315	androidx/profileinstaller/Encoding:OooOO0	(Ljava/io/InputStream;)I
    //   20: istore 4
    //   22: aload_0
    //   23: invokestatic 318	androidx/profileinstaller/Encoding:OooO	(Ljava/io/InputStream;)J
    //   26: lstore 5
    //   28: aload_0
    //   29: invokestatic 318	androidx/profileinstaller/Encoding:OooO	(Ljava/io/InputStream;)J
    //   32: lstore 7
    //   34: lload 7
    //   36: l2i
    //   37: istore 9
    //   39: lload 5
    //   41: l2i
    //   42: istore 10
    //   44: aload_0
    //   45: iload 9
    //   47: iload 10
    //   49: invokestatic 321	androidx/profileinstaller/Encoding:OooO0o0	(Ljava/io/InputStream;II)[B
    //   52: astore_3
    //   53: aload_0
    //   54: invokevirtual 324	java/io/InputStream:read	()I
    //   57: istore 11
    //   59: iload 11
    //   61: ifgt +42 -> 103
    //   64: new 326	java/io/ByteArrayInputStream
    //   67: astore_0
    //   68: aload_0
    //   69: aload_3
    //   70: invokespecial 328	java/io/ByteArrayInputStream:<init>	([B)V
    //   73: aload_0
    //   74: aload_2
    //   75: iload 4
    //   77: invokestatic 365	androidx/profileinstaller/ProfileTranscoder:OooOo0o	(Ljava/io/InputStream;Ljava/lang/String;I)[Landroidx/profileinstaller/DexProfileData;
    //   80: astore_1
    //   81: aload_0
    //   82: invokevirtual 333	java/io/InputStream:close	()V
    //   85: aload_1
    //   86: areturn
    //   87: astore_1
    //   88: aload_0
    //   89: invokevirtual 333	java/io/InputStream:close	()V
    //   92: goto +9 -> 101
    //   95: astore_0
    //   96: aload_1
    //   97: aload_0
    //   98: invokevirtual 178	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   101: aload_1
    //   102: athrow
    //   103: ldc_w 335
    //   106: invokestatic 145	androidx/profileinstaller/Encoding:OooO0OO	(Ljava/lang/String;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: ldc_w 367
    //   113: invokestatic 145	androidx/profileinstaller/Encoding:OooO0OO	(Ljava/lang/String;)Ljava/lang/RuntimeException;
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	paramInputStream	InputStream
    //   0	117	1	paramArrayOfByte	byte[]
    //   0	117	2	paramString	String
    //   3	67	3	arrayOfByte	byte[]
    //   9	3	4	bool	boolean
    //   20	56	4	i	int
    //   26	14	5	l1	long
    //   32	3	7	l2	long
    //   37	9	9	j	int
    //   42	6	10	k	int
    //   57	3	11	m	int
    // Exception table:
    //   from	to	target	type
    //   75	80	87	finally
    //   88	92	95	finally
  }
  
  public static DexProfileData[] OooOo0o(InputStream paramInputStream, String paramString, int paramInt)
  {
    InputStream localInputStream = paramInputStream;
    int i = paramInt;
    int j = paramInputStream.available();
    int k = 0;
    if (j == 0) {
      return new DexProfileData[0];
    }
    DexProfileData[] arrayOfDexProfileData = new DexProfileData[paramInt];
    int m = 0;
    DexProfileData localDexProfileData1 = null;
    int n;
    while (m < i)
    {
      n = Encoding.OooO0oo(paramInputStream);
      int i1 = Encoding.OooO0oo(paramInputStream);
      long l1 = Encoding.OooO(paramInputStream);
      long l2 = Encoding.OooO(paramInputStream);
      long l3 = Encoding.OooO(paramInputStream);
      DexProfileData localDexProfileData2 = new androidx/profileinstaller/DexProfileData;
      String str = Encoding.OooO0o(localInputStream, n);
      long l4 = 0L;
      n = (int)l1;
      int i2 = (int)l3;
      int[] arrayOfInt1 = new int[i1];
      TreeMap localTreeMap = new java/util/TreeMap;
      localTreeMap.<init>();
      l3 = l4;
      localDexProfileData2.<init>(paramString, str, l2, l4, i1, n, i2, arrayOfInt1, localTreeMap);
      arrayOfDexProfileData[m] = localDexProfileData2;
      m += 1;
    }
    while (k < i)
    {
      localDexProfileData1 = arrayOfDexProfileData[k];
      OooOOOO(localInputStream, localDexProfileData1);
      n = localDexProfileData1.OooO0o0;
      int[] arrayOfInt2 = OooOO0o(localInputStream, n);
      localDexProfileData1.OooO0oo = arrayOfInt2;
      OooOo0(localInputStream, localDexProfileData1);
      k += 1;
    }
    return arrayOfDexProfileData;
  }
  
  public static void OooOoO(InputStream paramInputStream)
  {
    Encoding.OooO0oo(paramInputStream);
    int i = Encoding.OooOO0(paramInputStream);
    int j = 6;
    if (i == j) {
      return;
    }
    j = 7;
    if (i == j) {
      return;
    }
    while (i > 0)
    {
      Encoding.OooOO0(paramInputStream);
      j = Encoding.OooOO0(paramInputStream);
      while (j > 0)
      {
        Encoding.OooO0oo(paramInputStream);
        j += -1;
      }
      i += -1;
    }
  }
  
  public static void OooOoO0(byte[] paramArrayOfByte, int paramInt1, int paramInt2, DexProfileData paramDexProfileData)
  {
    int i = paramDexProfileData.OooO0oO;
    paramInt1 = OooOO0O(paramInt1, paramInt2, i);
    paramInt2 = paramInt1 / 8;
    i = paramArrayOfByte[paramInt2];
    paramInt1 %= 8;
    paramInt1 = (byte)(1 << paramInt1 | i);
    paramArrayOfByte[paramInt2] = paramInt1;
  }
  
  public static boolean OooOoOO(OutputStream paramOutputStream, byte[] paramArrayOfByte, DexProfileData[] paramArrayOfDexProfileData)
  {
    byte[] arrayOfByte = ProfileVersion.OooO00o;
    boolean bool1 = Arrays.equals(paramArrayOfByte, arrayOfByte);
    boolean bool2 = true;
    if (bool1)
    {
      Oooo0o(paramOutputStream, paramArrayOfDexProfileData);
      return bool2;
    }
    arrayOfByte = ProfileVersion.OooO0O0;
    bool1 = Arrays.equals(paramArrayOfByte, arrayOfByte);
    if (bool1)
    {
      Oooo0o0(paramOutputStream, paramArrayOfDexProfileData);
      return bool2;
    }
    arrayOfByte = ProfileVersion.OooO0Oo;
    bool1 = Arrays.equals(paramArrayOfByte, arrayOfByte);
    if (bool1)
    {
      Oooo0O0(paramOutputStream, paramArrayOfDexProfileData);
      return bool2;
    }
    arrayOfByte = ProfileVersion.OooO0OO;
    bool1 = Arrays.equals(paramArrayOfByte, arrayOfByte);
    if (bool1)
    {
      Oooo0OO(paramOutputStream, paramArrayOfDexProfileData);
      return bool2;
    }
    arrayOfByte = ProfileVersion.OooO0o0;
    boolean bool3 = Arrays.equals(paramArrayOfByte, arrayOfByte);
    if (bool3)
    {
      Oooo0(paramOutputStream, paramArrayOfDexProfileData);
      return bool2;
    }
    return false;
  }
  
  /* Error */
  public static WritableFileSection OooOoo(DexProfileData[] paramArrayOfDexProfileData)
  {
    // Byte code:
    //   0: new 96	java/io/ByteArrayOutputStream
    //   3: astore_1
    //   4: aload_1
    //   5: invokespecial 146	java/io/ByteArrayOutputStream:<init>	()V
    //   8: aload_0
    //   9: arraylength
    //   10: istore_2
    //   11: aload_1
    //   12: iload_2
    //   13: invokestatic 150	androidx/profileinstaller/Encoding:OooOOOo	(Ljava/io/OutputStream;I)V
    //   16: iconst_0
    //   17: istore_2
    //   18: aconst_null
    //   19: astore_3
    //   20: iconst_2
    //   21: istore 4
    //   23: iconst_0
    //   24: istore 5
    //   26: aconst_null
    //   27: astore 6
    //   29: iload 4
    //   31: istore 7
    //   33: aload_0
    //   34: arraylength
    //   35: istore 8
    //   37: iload 5
    //   39: iload 8
    //   41: if_icmpge +149 -> 190
    //   44: aload_0
    //   45: iload 5
    //   47: aaload
    //   48: astore 9
    //   50: iload 7
    //   52: iconst_4
    //   53: iadd
    //   54: istore 7
    //   56: aload 9
    //   58: getfield 400	androidx/profileinstaller/DexProfileData:OooO0OO	J
    //   61: lstore 10
    //   63: aload_1
    //   64: lload 10
    //   66: invokestatic 190	androidx/profileinstaller/Encoding:OooOOo0	(Ljava/io/OutputStream;J)V
    //   69: iload 7
    //   71: iconst_4
    //   72: iadd
    //   73: istore 7
    //   75: aload 9
    //   77: getfield 357	androidx/profileinstaller/DexProfileData:OooO0Oo	J
    //   80: lstore 10
    //   82: aload_1
    //   83: lload 10
    //   85: invokestatic 190	androidx/profileinstaller/Encoding:OooOOo0	(Ljava/io/OutputStream;J)V
    //   88: iload 7
    //   90: iconst_4
    //   91: iadd
    //   92: istore 7
    //   94: aload 9
    //   96: getfield 90	androidx/profileinstaller/DexProfileData:OooO0oO	I
    //   99: istore 12
    //   101: iload 12
    //   103: i2l
    //   104: lstore 10
    //   106: aload_1
    //   107: lload 10
    //   109: invokestatic 190	androidx/profileinstaller/Encoding:OooOOo0	(Ljava/io/OutputStream;J)V
    //   112: aload 9
    //   114: getfield 70	androidx/profileinstaller/DexProfileData:OooO00o	Ljava/lang/String;
    //   117: astore 13
    //   119: aload 9
    //   121: getfield 25	androidx/profileinstaller/DexProfileData:OooO0O0	Ljava/lang/String;
    //   124: astore 9
    //   126: getstatic 287	androidx/profileinstaller/ProfileVersion:OooO00o	[B
    //   129: astore 14
    //   131: aload 13
    //   133: aload 9
    //   135: aload 14
    //   137: invokestatic 74	androidx/profileinstaller/ProfileTranscoder:OooOO0	(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;
    //   140: astore 9
    //   142: iload 7
    //   144: iload 4
    //   146: iadd
    //   147: istore 7
    //   149: aload 9
    //   151: invokestatic 80	androidx/profileinstaller/Encoding:OooOO0O	(Ljava/lang/String;)I
    //   154: istore 12
    //   156: aload_1
    //   157: iload 12
    //   159: invokestatic 150	androidx/profileinstaller/Encoding:OooOOOo	(Ljava/io/OutputStream;I)V
    //   162: iload 12
    //   164: iconst_1
    //   165: imul
    //   166: istore 12
    //   168: iload 7
    //   170: iload 12
    //   172: iadd
    //   173: istore 7
    //   175: aload_1
    //   176: aload 9
    //   178: invokestatic 404	androidx/profileinstaller/Encoding:OooOOO	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   181: iload 5
    //   183: iconst_1
    //   184: iadd
    //   185: istore 5
    //   187: goto -154 -> 33
    //   190: aload_1
    //   191: invokevirtual 124	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   194: astore_0
    //   195: aload_0
    //   196: arraylength
    //   197: istore 4
    //   199: iload 7
    //   201: iload 4
    //   203: if_icmpne +31 -> 234
    //   206: new 155	androidx/profileinstaller/WritableFileSection
    //   209: astore 15
    //   211: getstatic 407	androidx/profileinstaller/FileSectionType:o00Ooo00	Landroidx/profileinstaller/FileSectionType;
    //   214: astore 6
    //   216: aload 15
    //   218: aload 6
    //   220: iload 7
    //   222: aload_0
    //   223: iconst_0
    //   224: invokespecial 165	androidx/profileinstaller/WritableFileSection:<init>	(Landroidx/profileinstaller/FileSectionType;I[BZ)V
    //   227: aload_1
    //   228: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   231: aload 15
    //   233: areturn
    //   234: new 126	java/lang/StringBuilder
    //   237: astore_3
    //   238: aload_3
    //   239: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   242: ldc 170
    //   244: astore 15
    //   246: aload_3
    //   247: aload 15
    //   249: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: pop
    //   253: aload_3
    //   254: iload 7
    //   256: invokevirtual 136	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   259: pop
    //   260: ldc 172
    //   262: astore 15
    //   264: aload_3
    //   265: aload 15
    //   267: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: pop
    //   271: aload_0
    //   272: arraylength
    //   273: istore 16
    //   275: aload_3
    //   276: iload 16
    //   278: invokevirtual 136	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   281: pop
    //   282: aload_3
    //   283: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   286: astore_0
    //   287: aload_0
    //   288: invokestatic 145	androidx/profileinstaller/Encoding:OooO0OO	(Ljava/lang/String;)Ljava/lang/RuntimeException;
    //   291: astore_0
    //   292: aload_0
    //   293: athrow
    //   294: astore_0
    //   295: aload_1
    //   296: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   299: goto +9 -> 308
    //   302: astore_1
    //   303: aload_0
    //   304: aload_1
    //   305: invokevirtual 178	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   308: aload_0
    //   309: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	310	0	paramArrayOfDexProfileData	DexProfileData[]
    //   3	293	1	localByteArrayOutputStream	ByteArrayOutputStream
    //   302	3	1	localThrowable	java.lang.Throwable
    //   10	8	2	i	int
    //   19	264	3	localStringBuilder	StringBuilder
    //   21	183	4	j	int
    //   24	162	5	k	int
    //   27	192	6	localFileSectionType	FileSectionType
    //   31	224	7	m	int
    //   35	7	8	n	int
    //   48	129	9	localObject1	Object
    //   61	47	10	l	long
    //   99	74	12	i1	int
    //   117	15	13	str	String
    //   129	7	14	arrayOfByte	byte[]
    //   209	57	15	localObject2	Object
    //   273	4	16	i2	int
    // Exception table:
    //   from	to	target	type
    //   8	10	294	finally
    //   12	16	294	finally
    //   33	35	294	finally
    //   45	48	294	finally
    //   56	61	294	finally
    //   64	69	294	finally
    //   75	80	294	finally
    //   83	88	294	finally
    //   94	99	294	finally
    //   107	112	294	finally
    //   112	117	294	finally
    //   119	124	294	finally
    //   126	129	294	finally
    //   135	140	294	finally
    //   149	154	294	finally
    //   157	162	294	finally
    //   176	181	294	finally
    //   190	194	294	finally
    //   195	197	294	finally
    //   206	209	294	finally
    //   211	214	294	finally
    //   223	227	294	finally
    //   234	237	294	finally
    //   238	242	294	finally
    //   247	253	294	finally
    //   254	260	294	finally
    //   265	271	294	finally
    //   271	273	294	finally
    //   276	282	294	finally
    //   282	286	294	finally
    //   287	291	294	finally
    //   292	294	294	finally
    //   295	299	302	finally
  }
  
  public static void OooOoo0(OutputStream paramOutputStream, DexProfileData paramDexProfileData)
  {
    paramDexProfileData = paramDexProfileData.OooO0oo;
    int i = paramDexProfileData.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      int m = paramDexProfileData[j];
      Integer localInteger = Integer.valueOf(m);
      int n = localInteger.intValue() - k;
      Encoding.OooOOOo(paramOutputStream, n);
      k = localInteger.intValue();
      j += 1;
    }
  }
  
  public static void OooOooO(OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = OooO00o;
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.write(paramArrayOfByte);
  }
  
  public static void OooOooo(OutputStream paramOutputStream, DexProfileData paramDexProfileData)
  {
    Oooo00o(paramOutputStream, paramDexProfileData);
    OooOoo0(paramOutputStream, paramDexProfileData);
    Oooo00O(paramOutputStream, paramDexProfileData);
  }
  
  public static void Oooo0(OutputStream paramOutputStream, DexProfileData[] paramArrayOfDexProfileData)
  {
    int i = paramArrayOfDexProfileData.length;
    Encoding.OooOOOo(paramOutputStream, i);
    i = paramArrayOfDexProfileData.length;
    int j = 0;
    while (j < i)
    {
      Object localObject1 = paramArrayOfDexProfileData[j];
      Object localObject2 = ((DexProfileData)localObject1).OooO00o;
      Object localObject3 = ((DexProfileData)localObject1).OooO0O0;
      byte[] arrayOfByte = ProfileVersion.OooO0o0;
      localObject2 = OooOO0((String)localObject2, (String)localObject3, arrayOfByte);
      int k = Encoding.OooOO0O((String)localObject2);
      Encoding.OooOOOo(paramOutputStream, k);
      k = ((DexProfileData)localObject1).OooO.size();
      Encoding.OooOOOo(paramOutputStream, k);
      localObject3 = ((DexProfileData)localObject1).OooO0oo;
      k = localObject3.length;
      Encoding.OooOOOo(paramOutputStream, k);
      long l = ((DexProfileData)localObject1).OooO0OO;
      Encoding.OooOOo0(paramOutputStream, l);
      Encoding.OooOOO(paramOutputStream, (String)localObject2);
      localObject2 = ((DexProfileData)localObject1).OooO.keySet().iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject3 = (Integer)((Iterator)localObject2).next();
        m = ((Integer)localObject3).intValue();
        Encoding.OooOOOo(paramOutputStream, m);
      }
      localObject1 = ((DexProfileData)localObject1).OooO0oo;
      int n = localObject1.length;
      int m = 0;
      localObject3 = null;
      while (m < n)
      {
        int i1 = localObject1[m];
        Encoding.OooOOOo(paramOutputStream, i1);
        m += 1;
      }
      j += 1;
    }
  }
  
  public static void Oooo000(OutputStream paramOutputStream, DexProfileData paramDexProfileData, String paramString)
  {
    int i = Encoding.OooOO0O(paramString);
    Encoding.OooOOOo(paramOutputStream, i);
    i = paramDexProfileData.OooO0o0;
    Encoding.OooOOOo(paramOutputStream, i);
    long l = paramDexProfileData.OooO0o;
    Encoding.OooOOo0(paramOutputStream, l);
    l = paramDexProfileData.OooO0OO;
    Encoding.OooOOo0(paramOutputStream, l);
    l = paramDexProfileData.OooO0oO;
    Encoding.OooOOo0(paramOutputStream, l);
    Encoding.OooOOO(paramOutputStream, paramString);
  }
  
  public static void Oooo00O(OutputStream paramOutputStream, DexProfileData paramDexProfileData)
  {
    int i = getMethodBitmapStorageSize(paramDexProfileData.OooO0oO);
    byte[] arrayOfByte = new byte[i];
    Iterator localIterator = paramDexProfileData.OooO.entrySet().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (Map.Entry)localIterator.next();
      Integer localInteger = (Integer)((Map.Entry)localObject).getKey();
      int k = localInteger.intValue();
      localObject = (Integer)((Map.Entry)localObject).getValue();
      int j = ((Integer)localObject).intValue();
      int m = j & 0x2;
      if (m != 0)
      {
        m = 2;
        OooOoO0(arrayOfByte, m, k, paramDexProfileData);
      }
      j &= 0x4;
      if (j != 0)
      {
        j = 4;
        OooOoO0(arrayOfByte, j, k, paramDexProfileData);
      }
    }
    paramOutputStream.write(arrayOfByte);
  }
  
  public static void Oooo00o(OutputStream paramOutputStream, DexProfileData paramDexProfileData)
  {
    paramDexProfileData = paramDexProfileData.OooO.entrySet().iterator();
    int i = 0;
    for (;;)
    {
      boolean bool = paramDexProfileData.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (Map.Entry)paramDexProfileData.next();
      Integer localInteger = (Integer)((Map.Entry)localObject).getKey();
      int k = localInteger.intValue();
      localObject = (Integer)((Map.Entry)localObject).getValue();
      int j = ((Integer)localObject).intValue() & 0x1;
      if (j != 0)
      {
        i = k - i;
        Encoding.OooOOOo(paramOutputStream, i);
        Encoding.OooOOOo(paramOutputStream, 0);
        i = k;
      }
    }
  }
  
  public static void Oooo0O0(OutputStream paramOutputStream, DexProfileData[] paramArrayOfDexProfileData)
  {
    int i = paramArrayOfDexProfileData.length;
    Encoding.OooOOo(paramOutputStream, i);
    i = paramArrayOfDexProfileData.length;
    int j = 0;
    while (j < i)
    {
      Object localObject1 = paramArrayOfDexProfileData[j];
      int k = ((DexProfileData)localObject1).OooO.size() * 4;
      Object localObject2 = ((DexProfileData)localObject1).OooO00o;
      Object localObject3 = ((DexProfileData)localObject1).OooO0O0;
      byte[] arrayOfByte = ProfileVersion.OooO0Oo;
      localObject2 = OooOO0((String)localObject2, (String)localObject3, arrayOfByte);
      int m = Encoding.OooOO0O((String)localObject2);
      Encoding.OooOOOo(paramOutputStream, m);
      localObject3 = ((DexProfileData)localObject1).OooO0oo;
      m = localObject3.length;
      Encoding.OooOOOo(paramOutputStream, m);
      long l = k;
      Encoding.OooOOo0(paramOutputStream, l);
      l = ((DexProfileData)localObject1).OooO0OO;
      Encoding.OooOOo0(paramOutputStream, l);
      Encoding.OooOOO(paramOutputStream, (String)localObject2);
      Iterator localIterator = ((DexProfileData)localObject1).OooO.keySet().iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject2 = (Integer)localIterator.next();
        n = ((Integer)localObject2).intValue();
        Encoding.OooOOOo(paramOutputStream, n);
        Encoding.OooOOOo(paramOutputStream, 0);
      }
      localObject1 = ((DexProfileData)localObject1).OooO0oo;
      k = localObject1.length;
      int n = 0;
      localObject2 = null;
      while (n < k)
      {
        m = localObject1[n];
        Encoding.OooOOOo(paramOutputStream, m);
        n += 1;
      }
      j += 1;
    }
  }
  
  public static void Oooo0OO(OutputStream paramOutputStream, DexProfileData[] paramArrayOfDexProfileData)
  {
    byte[] arrayOfByte = ProfileVersion.OooO0OO;
    arrayOfByte = OooO0O0(paramArrayOfDexProfileData, arrayOfByte);
    int i = paramArrayOfDexProfileData.length;
    Encoding.OooOOo(paramOutputStream, i);
    Encoding.OooOOO0(paramOutputStream, arrayOfByte);
  }
  
  public static void Oooo0o(OutputStream paramOutputStream, DexProfileData[] paramArrayOfDexProfileData)
  {
    Oooo0oO(paramOutputStream, paramArrayOfDexProfileData);
  }
  
  public static void Oooo0o0(OutputStream paramOutputStream, DexProfileData[] paramArrayOfDexProfileData)
  {
    byte[] arrayOfByte = ProfileVersion.OooO0O0;
    arrayOfByte = OooO0O0(paramArrayOfDexProfileData, arrayOfByte);
    int i = paramArrayOfDexProfileData.length;
    Encoding.OooOOo(paramOutputStream, i);
    Encoding.OooOOO0(paramOutputStream, arrayOfByte);
  }
  
  public static void Oooo0oO(OutputStream paramOutputStream, DexProfileData[] paramArrayOfDexProfileData)
  {
    Object localObject1 = new java/util/ArrayList;
    int i = 3;
    ((ArrayList)localObject1).<init>(i);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(i);
    WritableFileSection localWritableFileSection = OooOoo(paramArrayOfDexProfileData);
    ((List)localObject1).add(localWritableFileSection);
    localWritableFileSection = OooO0OO(paramArrayOfDexProfileData);
    ((List)localObject1).add(localWritableFileSection);
    paramArrayOfDexProfileData = OooO0Oo(paramArrayOfDexProfileData);
    ((List)localObject1).add(paramArrayOfDexProfileData);
    long l1 = ProfileVersion.OooO00o.length;
    long l2 = OooO00o.length;
    l1 = l1 + l2 + 4;
    l2 = ((List)localObject1).size() * 16;
    l1 += l2;
    l2 = ((List)localObject1).size();
    Encoding.OooOOo0(paramOutputStream, l2);
    int j = 0;
    paramArrayOfDexProfileData = null;
    i = 0;
    localWritableFileSection = null;
    for (;;)
    {
      int k = ((List)localObject1).size();
      if (i >= k) {
        break;
      }
      Object localObject2 = (WritableFileSection)((List)localObject1).get(i);
      Object localObject3 = ((WritableFileSection)localObject2).OooO00o;
      long l3 = ((FileSectionType)localObject3).getValue();
      Encoding.OooOOo0(paramOutputStream, l3);
      Encoding.OooOOo0(paramOutputStream, l1);
      boolean bool = ((WritableFileSection)localObject2).OooO0Oo;
      int m;
      if (bool)
      {
        localObject2 = ((WritableFileSection)localObject2).OooO0OO;
        m = localObject2.length;
        l3 = m;
        localObject2 = Encoding.OooO0O0((byte[])localObject2);
        localArrayList.add(localObject2);
        int n = localObject2.length;
        long l4 = n;
        Encoding.OooOOo0(paramOutputStream, l4);
        Encoding.OooOOo0(paramOutputStream, l3);
        k = localObject2.length;
      }
      else
      {
        localObject3 = ((WritableFileSection)localObject2).OooO0OO;
        localArrayList.add(localObject3);
        localObject3 = ((WritableFileSection)localObject2).OooO0OO;
        m = localObject3.length;
        l3 = m;
        Encoding.OooOOo0(paramOutputStream, l3);
        l3 = 0L;
        Encoding.OooOOo0(paramOutputStream, l3);
        localObject2 = ((WritableFileSection)localObject2).OooO0OO;
        k = localObject2.length;
      }
      l2 = k;
      l1 += l2;
      i += 1;
    }
    for (;;)
    {
      int i1 = localArrayList.size();
      if (j >= i1) {
        break;
      }
      localObject1 = (byte[])localArrayList.get(j);
      paramOutputStream.write((byte[])localObject1);
      j += 1;
    }
  }
  
  private static int getMethodBitmapStorageSize(int paramInt)
  {
    return OooOo(paramInt * 2) / 8;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.profileinstaller.ProfileTranscoder
 * JD-Core Version:    0.7.0.1
 */