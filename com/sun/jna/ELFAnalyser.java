package com.sun.jna;

import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m54207b69;

class ELFAnalyser
{
  public static final byte[] OooO;
  public final String OooO00o;
  public boolean OooO0O0 = false;
  public boolean OooO0OO = false;
  public boolean OooO0Oo = false;
  public boolean OooO0o = false;
  public boolean OooO0o0 = false;
  public boolean OooO0oO = false;
  public boolean OooO0oo = false;
  
  static
  {
    byte[] arrayOfByte = new byte[4];
    byte[] tmp6_4 = arrayOfByte;
    tmp6_4[0] = 127;
    arrayOfByte[1] = 69;
    tmp6_4[2] = 76;
    arrayOfByte[3] = 70;
    OooO = arrayOfByte;
  }
  
  public ELFAnalyser(String paramString)
  {
    this.OooO00o = paramString;
  }
  
  public static ELFAnalyser OooO00o(String paramString)
  {
    ELFAnalyser localELFAnalyser = new com/sun/jna/ELFAnalyser;
    localELFAnalyser.<init>(paramString);
    localELFAnalyser.OooO0oo();
    return localELFAnalyser;
  }
  
  public static Map OooO0O0(ByteBuffer paramByteBuffer)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    for (;;)
    {
      int i = paramByteBuffer.position();
      int j = paramByteBuffer.limit();
      if (i >= j) {
        break;
      }
      i = paramByteBuffer.position();
      Object localObject = OooO0oO(paramByteBuffer);
      j = ((BigInteger)localObject).intValue();
      int k = paramByteBuffer.getInt();
      int m = 1;
      if (j == m)
      {
        localObject = Integer.valueOf(j);
        Map localMap = OooO0o0(paramByteBuffer);
        localHashMap.put(localObject, localMap);
      }
      i += k;
      paramByteBuffer.position(i);
    }
    return localHashMap;
  }
  
  public static Map OooO0OO(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get();
    int j = 65;
    if (i != j) {
      return Collections.EMPTY_MAP;
    }
    for (;;)
    {
      i = paramByteBuffer.position();
      j = paramByteBuffer.limit();
      if (i >= j) {
        break;
      }
      i = paramByteBuffer.position();
      j = paramByteBuffer.getInt();
      if (j <= 0) {
        break;
      }
      String str1 = OooO0o(paramByteBuffer, null);
      String str2 = m54207b69.F54207b69_11(")&4744494753");
      boolean bool = str2.equals(str1);
      if (bool) {
        return OooO0O0(paramByteBuffer);
      }
      i += j;
      paramByteBuffer.position(i);
    }
    return Collections.EMPTY_MAP;
  }
  
  public static String OooO0o(ByteBuffer paramByteBuffer, Integer paramInteger)
  {
    if (paramInteger != null)
    {
      i = paramInteger.intValue();
      paramByteBuffer.position(i);
    }
    int i = paramByteBuffer.position();
    int k;
    do
    {
      j = paramByteBuffer.get();
      if (j == 0) {
        break;
      }
      j = paramByteBuffer.position();
      k = paramByteBuffer.limit();
    } while (j <= k);
    int j = paramByteBuffer.position() - i + -1;
    byte[] arrayOfByte = new byte[j];
    paramByteBuffer.position(i);
    paramByteBuffer.get(arrayOfByte);
    i = paramByteBuffer.position() + 1;
    paramByteBuffer.position(i);
    try
    {
      paramByteBuffer = new java/lang/String;
      paramInteger = "GG0615061112";
      paramInteger = m54207b69.F54207b69_11(paramInteger);
      paramByteBuffer.<init>(arrayOfByte, paramInteger);
      return paramByteBuffer;
    }
    catch (UnsupportedEncodingException paramByteBuffer)
    {
      paramInteger = new java/lang/RuntimeException;
      paramInteger.<init>(paramByteBuffer);
      throw paramInteger;
    }
  }
  
  public static Map OooO0o0(ByteBuffer paramByteBuffer)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    for (;;)
    {
      int i = paramByteBuffer.position();
      int j = paramByteBuffer.limit();
      if (i >= j) {
        break;
      }
      i = OooO0oO(paramByteBuffer).intValue();
      ELFAnalyser.ArmAeabiAttributesTag localArmAeabiAttributesTag = ELFAnalyser.ArmAeabiAttributesTag.getByValue(i);
      Object localObject = ELFAnalyser.1.OooO00o;
      ELFAnalyser.ArmAeabiAttributesTag.ParameterType localParameterType = localArmAeabiAttributesTag.getParameterType();
      int k = localParameterType.ordinal();
      j = localObject[k];
      k = 1;
      if (j != k)
      {
        k = 2;
        if (j != k)
        {
          k = 3;
          if (j != k) {
            continue;
          }
          localObject = OooO0oO(paramByteBuffer);
        }
        else
        {
          j = 0;
          localObject = OooO0o(paramByteBuffer, null);
        }
      }
      else
      {
        j = paramByteBuffer.getInt();
        localObject = Integer.valueOf(j);
      }
      localHashMap.put(localArmAeabiAttributesTag, localObject);
    }
    return localHashMap;
  }
  
  public static BigInteger OooO0oO(ByteBuffer paramByteBuffer)
  {
    BigInteger localBigInteger1 = BigInteger.ZERO;
    int i = 0;
    for (;;)
    {
      int j = paramByteBuffer.get();
      int k = j & 0x7F;
      long l = k;
      BigInteger localBigInteger2 = BigInteger.valueOf(l).shiftLeft(i);
      localBigInteger1 = localBigInteger1.or(localBigInteger2);
      j &= 0x80;
      if (j == 0) {
        return localBigInteger1;
      }
      i += 7;
    }
  }
  
  public final void OooO0Oo(ByteBuffer paramByteBuffer, RandomAccessFile paramRandomAccessFile)
  {
    Object localObject1 = new com/sun/jna/ELFAnalyser$ELFSectionHeaders;
    boolean bool1 = this.OooO0OO;
    boolean bool2 = this.OooO0Oo;
    ((ELFAnalyser.ELFSectionHeaders)localObject1).<init>(bool1, bool2, paramByteBuffer, paramRandomAccessFile);
    paramByteBuffer = ((ELFAnalyser.ELFSectionHeaders)localObject1).getEntries().iterator();
    int i;
    int j;
    do
    {
      do
      {
        boolean bool3 = paramByteBuffer.hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = (ELFAnalyser.ELFSectionHeaderEntry)paramByteBuffer.next();
        localObject2 = ((ELFAnalyser.ELFSectionHeaderEntry)localObject1).getName();
        localObject3 = m54207b69.F54207b69_11("3J640C1A0A68304445402C324A4A3C47");
        bool1 = ((String)localObject3).equals(localObject2);
      } while (!bool1);
      i = ((ELFAnalyser.ELFSectionHeaderEntry)localObject1).getSize();
      Object localObject2 = ByteBuffer.allocate(i);
      bool2 = this.OooO0Oo;
      if (bool2) {
        localObject3 = ByteOrder.BIG_ENDIAN;
      } else {
        localObject3 = ByteOrder.LITTLE_ENDIAN;
      }
      ((ByteBuffer)localObject2).order((ByteOrder)localObject3);
      localObject3 = paramRandomAccessFile.getChannel();
      j = ((ELFAnalyser.ELFSectionHeaderEntry)localObject1).getOffset();
      long l = j;
      ((FileChannel)localObject3).read((ByteBuffer)localObject2, l);
      ((ByteBuffer)localObject2).rewind();
      localObject1 = OooO0OO((ByteBuffer)localObject2);
      i = 1;
      localObject3 = Integer.valueOf(i);
      localObject1 = (Map)((Map)localObject1).get(localObject3);
    } while (localObject1 == null);
    Object localObject3 = ELFAnalyser.ArmAeabiAttributesTag.Oooo00o;
    localObject1 = ((Map)localObject1).get(localObject3);
    bool2 = localObject1 instanceof Integer;
    if (bool2)
    {
      localObject3 = localObject1;
      localObject3 = (Integer)localObject1;
      Integer localInteger = Integer.valueOf(i);
      bool2 = ((Integer)localObject3).equals(localInteger);
      if (!bool2) {}
    }
    for (;;)
    {
      this.OooO0oO = i;
      break;
      bool2 = localObject1 instanceof BigInteger;
      if (!bool2) {
        break;
      }
      localObject1 = (BigInteger)localObject1;
      j = ((BigInteger)localObject1).intValue();
      if (j != i) {
        break;
      }
    }
  }
  
  /* Error */
  public final void OooO0oo()
  {
    // Byte code:
    //   0: new 226	java/io/RandomAccessFile
    //   3: astore_1
    //   4: aload_0
    //   5: getfield 39	com/sun/jna/ELFAnalyser:OooO00o	Ljava/lang/String;
    //   8: astore_2
    //   9: ldc 255
    //   11: astore_3
    //   12: aload_1
    //   13: aload_2
    //   14: aload_3
    //   15: invokespecial 258	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   18: aload_1
    //   19: invokevirtual 262	java/io/RandomAccessFile:length	()J
    //   22: lstore 4
    //   24: iconst_4
    //   25: i2l
    //   26: lstore 6
    //   28: lload 4
    //   30: lload 6
    //   32: lcmp
    //   33: istore 8
    //   35: lconst_0
    //   36: lstore 9
    //   38: iconst_1
    //   39: istore 11
    //   41: iload 8
    //   43: ifle +47 -> 90
    //   46: iconst_4
    //   47: istore 8
    //   49: iload 8
    //   51: newarray byte
    //   53: astore_2
    //   54: aload_1
    //   55: lload 9
    //   57: invokevirtual 268	java/io/RandomAccessFile:seek	(J)V
    //   60: aload_1
    //   61: aload_2
    //   62: invokevirtual 271	java/io/RandomAccessFile:read	([B)I
    //   65: pop
    //   66: getstatic 19	com/sun/jna/ELFAnalyser:OooO	[B
    //   69: astore 12
    //   71: aload_2
    //   72: aload 12
    //   74: invokestatic 276	java/util/Arrays:equals	([B[B)Z
    //   77: istore 8
    //   79: iload 8
    //   81: ifeq +9 -> 90
    //   84: aload_0
    //   85: iload 11
    //   87: putfield 25	com/sun/jna/ELFAnalyser:OooO0O0	Z
    //   90: aload_0
    //   91: getfield 25	com/sun/jna/ELFAnalyser:OooO0O0	Z
    //   94: istore 8
    //   96: iload 8
    //   98: ifne +8 -> 106
    //   101: aload_1
    //   102: invokevirtual 279	java/io/RandomAccessFile:close	()V
    //   105: return
    //   106: aload_1
    //   107: lload 6
    //   109: invokevirtual 268	java/io/RandomAccessFile:seek	(J)V
    //   112: aload_1
    //   113: invokevirtual 282	java/io/RandomAccessFile:readByte	()B
    //   116: istore 8
    //   118: aload_1
    //   119: invokevirtual 282	java/io/RandomAccessFile:readByte	()B
    //   122: istore 13
    //   124: iconst_2
    //   125: istore 14
    //   127: aconst_null
    //   128: astore 12
    //   130: iload 8
    //   132: iload 14
    //   134: if_icmpne +10 -> 144
    //   137: iload 11
    //   139: istore 8
    //   141: goto +8 -> 149
    //   144: iconst_0
    //   145: istore 8
    //   147: aconst_null
    //   148: astore_2
    //   149: aload_0
    //   150: iload 8
    //   152: putfield 27	com/sun/jna/ELFAnalyser:OooO0OO	Z
    //   155: iload 13
    //   157: iload 14
    //   159: if_icmpne +10 -> 169
    //   162: iload 11
    //   164: istore 8
    //   166: goto +8 -> 174
    //   169: iconst_0
    //   170: istore 8
    //   172: aconst_null
    //   173: astore_2
    //   174: aload_0
    //   175: iload 8
    //   177: putfield 29	com/sun/jna/ELFAnalyser:OooO0Oo	Z
    //   180: aload_1
    //   181: lload 9
    //   183: invokevirtual 268	java/io/RandomAccessFile:seek	(J)V
    //   186: aload_0
    //   187: getfield 27	com/sun/jna/ELFAnalyser:OooO0OO	Z
    //   190: istore 8
    //   192: iload 8
    //   194: ifeq +10 -> 204
    //   197: bipush 64
    //   199: istore 8
    //   201: goto +7 -> 208
    //   204: bipush 52
    //   206: istore 8
    //   208: iload 8
    //   210: invokestatic 211	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   213: astore_2
    //   214: aload_1
    //   215: invokevirtual 230	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   218: astore 15
    //   220: aload 15
    //   222: aload_2
    //   223: lload 9
    //   225: invokevirtual 239	java/nio/channels/FileChannel:read	(Ljava/nio/ByteBuffer;J)I
    //   228: pop
    //   229: aload_0
    //   230: getfield 29	com/sun/jna/ELFAnalyser:OooO0Oo	Z
    //   233: istore 13
    //   235: iload 13
    //   237: ifeq +11 -> 248
    //   240: getstatic 217	java/nio/ByteOrder:BIG_ENDIAN	Ljava/nio/ByteOrder;
    //   243: astore 15
    //   245: goto +8 -> 253
    //   248: getstatic 220	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   251: astore 15
    //   253: aload_2
    //   254: aload 15
    //   256: invokevirtual 224	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   259: pop
    //   260: bipush 18
    //   262: istore 13
    //   264: aload_2
    //   265: iload 13
    //   267: invokevirtual 288	java/nio/ByteBuffer:get	(I)B
    //   270: istore 13
    //   272: bipush 40
    //   274: istore 14
    //   276: iload 13
    //   278: iload 14
    //   280: if_icmpne +10 -> 290
    //   283: iload 11
    //   285: istore 13
    //   287: goto +9 -> 296
    //   290: iconst_0
    //   291: istore 13
    //   293: aconst_null
    //   294: astore 15
    //   296: aload_0
    //   297: iload 13
    //   299: putfield 37	com/sun/jna/ELFAnalyser:OooO0oo	Z
    //   302: iload 13
    //   304: ifeq +108 -> 412
    //   307: aload_0
    //   308: getfield 27	com/sun/jna/ELFAnalyser:OooO0OO	Z
    //   311: istore 13
    //   313: iload 13
    //   315: ifeq +10 -> 325
    //   318: bipush 48
    //   320: istore 13
    //   322: goto +7 -> 329
    //   325: bipush 36
    //   327: istore 13
    //   329: aload_2
    //   330: iload 13
    //   332: invokevirtual 294	java/nio/ByteBuffer:getInt	(I)I
    //   335: istore 13
    //   337: iload 13
    //   339: sipush 1024
    //   342: iand
    //   343: istore 14
    //   345: sipush 1024
    //   348: istore 16
    //   350: iload 14
    //   352: iload 16
    //   354: if_icmpne +10 -> 364
    //   357: iload 11
    //   359: istore 14
    //   361: goto +6 -> 367
    //   364: iconst_0
    //   365: istore 14
    //   367: aload_0
    //   368: iload 14
    //   370: putfield 31	com/sun/jna/ELFAnalyser:OooO0o0	Z
    //   373: sipush 512
    //   376: istore 14
    //   378: iload 13
    //   380: iload 14
    //   382: iand
    //   383: istore 13
    //   385: iload 13
    //   387: iload 14
    //   389: if_icmpne +6 -> 395
    //   392: goto +8 -> 400
    //   395: iconst_0
    //   396: istore 11
    //   398: aconst_null
    //   399: astore_3
    //   400: aload_0
    //   401: iload 11
    //   403: putfield 33	com/sun/jna/ELFAnalyser:OooO0o	Z
    //   406: aload_0
    //   407: aload_2
    //   408: aload_1
    //   409: invokevirtual 299	com/sun/jna/ELFAnalyser:OooO0Oo	(Ljava/nio/ByteBuffer;Ljava/io/RandomAccessFile;)V
    //   412: aload_1
    //   413: invokevirtual 279	java/io/RandomAccessFile:close	()V
    //   416: return
    //   417: astore_2
    //   418: aload_1
    //   419: invokevirtual 279	java/io/RandomAccessFile:close	()V
    //   422: aload_2
    //   423: athrow
    //   424: pop
    //   425: goto -320 -> 105
    //   428: pop
    //   429: goto -13 -> 416
    //   432: pop
    //   433: goto -11 -> 422
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	436	0	this	ELFAnalyser
    //   3	416	1	localRandomAccessFile	RandomAccessFile
    //   8	400	2	localObject1	Object
    //   417	6	2	localObject2	Object
    //   11	389	3	str	String
    //   22	7	4	l1	long
    //   26	82	6	l2	long
    //   33	9	8	bool1	boolean
    //   47	3	8	i	int
    //   77	20	8	bool2	boolean
    //   116	60	8	j	int
    //   190	3	8	bool3	boolean
    //   199	10	8	k	int
    //   36	188	9	l3	long
    //   39	363	11	m	int
    //   69	60	12	arrayOfByte	byte[]
    //   122	38	13	n	int
    //   233	3	13	bool4	boolean
    //   262	41	13	i1	int
    //   311	3	13	bool5	boolean
    //   320	70	13	i2	int
    //   125	265	14	i3	int
    //   218	77	15	localObject3	Object
    //   348	7	16	i4	int
    //   424	1	24	localIOException1	java.io.IOException
    //   428	1	25	localIOException2	java.io.IOException
    //   432	1	26	localIOException3	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   18	22	417	finally
    //   49	53	417	finally
    //   55	60	417	finally
    //   61	66	417	finally
    //   66	69	417	finally
    //   72	77	417	finally
    //   85	90	417	finally
    //   90	94	417	finally
    //   107	112	417	finally
    //   112	116	417	finally
    //   118	122	417	finally
    //   150	155	417	finally
    //   175	180	417	finally
    //   181	186	417	finally
    //   186	190	417	finally
    //   208	213	417	finally
    //   214	218	417	finally
    //   223	229	417	finally
    //   229	233	417	finally
    //   240	243	417	finally
    //   248	251	417	finally
    //   254	260	417	finally
    //   265	270	417	finally
    //   297	302	417	finally
    //   307	311	417	finally
    //   330	335	417	finally
    //   368	373	417	finally
    //   401	406	417	finally
    //   408	412	417	finally
    //   101	105	424	java/io/IOException
    //   412	416	428	java/io/IOException
    //   418	422	432	java/io/IOException
  }
  
  public String getFilename()
  {
    return this.OooO00o;
  }
  
  public boolean is64Bit()
  {
    return this.OooO0OO;
  }
  
  public boolean isArm()
  {
    return this.OooO0oo;
  }
  
  public boolean isArmEabiAapcsVfp()
  {
    return this.OooO0oO;
  }
  
  public boolean isArmHardFloat()
  {
    boolean bool = isArmEabiAapcsVfp();
    if (!bool)
    {
      bool = isArmHardFloatFlag();
      if (!bool) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public boolean isArmHardFloatFlag()
  {
    return this.OooO0o0;
  }
  
  public boolean isArmSoftFloatFlag()
  {
    return this.OooO0o;
  }
  
  public boolean isBigEndian()
  {
    return this.OooO0Oo;
  }
  
  public boolean isELF()
  {
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.ELFAnalyser
 * JD-Core Version:    0.7.0.1
 */