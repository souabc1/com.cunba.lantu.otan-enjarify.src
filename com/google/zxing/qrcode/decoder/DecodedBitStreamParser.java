package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.StringUtils;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import m54207b69;

final class DecodedBitStreamParser
{
  private static final char[] ALPHANUMERIC_CHARS = m54207b69.F54207b69_11(";\\6C6E70726C6E70726C6E27292B2527292B2527292B2527292B2527292B2527292B252729A09D9F9D9F9A9C9E92").toCharArray();
  private static final int GB2312_SUBSET = 1;
  
  /* Error */
  public static com.google.zxing.common.DecoderResult decode(byte[] paramArrayOfByte, Version paramVersion, ErrorCorrectionLevel paramErrorCorrectionLevel, Map paramMap)
  {
    // Byte code:
    //   0: aload_1
    //   1: astore 4
    //   3: new 32	com/google/zxing/common/BitSource
    //   6: astore 5
    //   8: aload 5
    //   10: aload_0
    //   11: invokespecial 35	com/google/zxing/common/BitSource:<init>	([B)V
    //   14: new 37	java/lang/StringBuilder
    //   17: astore 6
    //   19: aload 6
    //   21: bipush 50
    //   23: invokespecial 41	java/lang/StringBuilder:<init>	(I)V
    //   26: new 43	java/util/ArrayList
    //   29: astore 7
    //   31: iconst_1
    //   32: istore 8
    //   34: aload 7
    //   36: iload 8
    //   38: invokespecial 45	java/util/ArrayList:<init>	(I)V
    //   41: iconst_0
    //   42: istore 9
    //   44: aconst_null
    //   45: astore 10
    //   47: aconst_null
    //   48: astore 11
    //   50: iconst_m1
    //   51: istore 12
    //   53: iconst_0
    //   54: istore 13
    //   56: iconst_0
    //   57: istore 14
    //   59: iconst_0
    //   60: istore 15
    //   62: iload 12
    //   64: istore 16
    //   66: iload 12
    //   68: istore 17
    //   70: aconst_null
    //   71: astore 18
    //   73: aload 5
    //   75: invokevirtual 49	com/google/zxing/common/BitSource:available	()I
    //   78: istore 9
    //   80: iconst_4
    //   81: istore 19
    //   83: ldc 50
    //   85: fstore 20
    //   87: iload 9
    //   89: iload 19
    //   91: if_icmpge +15 -> 106
    //   94: getstatic 56	com/google/zxing/qrcode/decoder/Mode:TERMINATOR	Lcom/google/zxing/qrcode/decoder/Mode;
    //   97: astore 10
    //   99: aload 10
    //   101: astore 21
    //   103: goto +22 -> 125
    //   106: aload 5
    //   108: iload 19
    //   110: invokevirtual 60	com/google/zxing/common/BitSource:readBits	(I)I
    //   113: istore 9
    //   115: iload 9
    //   117: invokestatic 64	com/google/zxing/qrcode/decoder/Mode:forBits	(I)Lcom/google/zxing/qrcode/decoder/Mode;
    //   120: astore 10
    //   122: goto -23 -> 99
    //   125: getstatic 70	com/google/zxing/qrcode/decoder/DecodedBitStreamParser$1:$SwitchMap$com$google$zxing$qrcode$decoder$Mode	[I
    //   128: astore 10
    //   130: aload 21
    //   132: invokevirtual 75	java/lang/Enum:ordinal	()I
    //   135: istore 12
    //   137: aload 10
    //   139: iload 12
    //   141: iaload
    //   142: istore 12
    //   144: iconst_2
    //   145: istore 22
    //   147: ldc 76
    //   149: fstore 23
    //   151: iconst_3
    //   152: istore 24
    //   154: ldc 77
    //   156: fstore 25
    //   158: iload 12
    //   160: tableswitch	default:+40 -> 200, 5:+117->277, 6:+226->386, 7:+203->363, 8:+144->304, 9:+98->258, 10:+52->212
    //   201: iload 25
    //   203: iconst_1
    //   204: invokevirtual 81	com/google/zxing/qrcode/decoder/Mode:getCharacterCountBits	(Lcom/google/zxing/qrcode/decoder/Version;)I
    //   207: istore 12
    //   209: goto +204 -> 413
    //   212: aload 5
    //   214: iload 19
    //   216: invokevirtual 60	com/google/zxing/common/BitSource:readBits	(I)I
    //   219: istore 9
    //   221: aload 21
    //   223: aload 4
    //   225: invokevirtual 81	com/google/zxing/qrcode/decoder/Mode:getCharacterCountBits	(Lcom/google/zxing/qrcode/decoder/Version;)I
    //   228: istore 12
    //   230: aload 5
    //   232: iload 12
    //   234: invokevirtual 60	com/google/zxing/common/BitSource:readBits	(I)I
    //   237: istore 12
    //   239: iload 9
    //   241: iload 8
    //   243: if_icmpne +34 -> 277
    //   246: aload 5
    //   248: aload 6
    //   250: iload 12
    //   252: invokestatic 85	com/google/zxing/qrcode/decoder/DecodedBitStreamParser:decodeHanziSegment	(Lcom/google/zxing/common/BitSource;Ljava/lang/StringBuilder;I)V
    //   255: goto +22 -> 277
    //   258: aload 5
    //   260: invokestatic 89	com/google/zxing/qrcode/decoder/DecodedBitStreamParser:parseECIValue	(Lcom/google/zxing/common/BitSource;)I
    //   263: istore 9
    //   265: iload 9
    //   267: invokestatic 95	com/google/zxing/common/CharacterSetECI:getCharacterSetECIByValue	(I)Lcom/google/zxing/common/CharacterSetECI;
    //   270: astore 18
    //   272: aload 18
    //   274: ifnull +22 -> 296
    //   277: iload 24
    //   279: istore 26
    //   281: iload 22
    //   283: istore 27
    //   285: aload 21
    //   287: astore 28
    //   289: iload 19
    //   291: istore 29
    //   293: goto +307 -> 600
    //   296: invokestatic 101	com/google/zxing/FormatException:getFormatInstance	()Lcom/google/zxing/FormatException;
    //   299: astore 4
    //   301: aload 4
    //   303: athrow
    //   304: aload 5
    //   306: invokevirtual 49	com/google/zxing/common/BitSource:available	()I
    //   309: istore 9
    //   311: bipush 16
    //   313: istore 12
    //   315: iload 9
    //   317: iload 12
    //   319: if_icmplt +36 -> 355
    //   322: bipush 8
    //   324: istore 9
    //   326: aload 5
    //   328: iload 9
    //   330: invokevirtual 60	com/google/zxing/common/BitSource:readBits	(I)I
    //   333: istore 12
    //   335: aload 5
    //   337: iload 9
    //   339: invokevirtual 60	com/google/zxing/common/BitSource:readBits	(I)I
    //   342: istore 9
    //   344: iload 9
    //   346: istore 17
    //   348: iload 12
    //   350: istore 16
    //   352: goto -75 -> 277
    //   355: invokestatic 101	com/google/zxing/FormatException:getFormatInstance	()Lcom/google/zxing/FormatException;
    //   358: astore 4
    //   360: aload 4
    //   362: athrow
    //   363: iload 24
    //   365: istore 26
    //   367: iload 22
    //   369: istore 27
    //   371: iload 19
    //   373: istore 29
    //   375: iload 8
    //   377: istore 13
    //   379: iload 8
    //   381: istore 15
    //   383: goto +23 -> 406
    //   386: iload 24
    //   388: istore 26
    //   390: iload 22
    //   392: istore 27
    //   394: iload 19
    //   396: istore 29
    //   398: iload 8
    //   400: istore 13
    //   402: iload 8
    //   404: istore 14
    //   406: aload 21
    //   408: astore 28
    //   410: goto +190 -> 600
    //   413: aload 5
    //   415: iload 12
    //   417: invokevirtual 60	com/google/zxing/common/BitSource:readBits	(I)I
    //   420: istore 12
    //   422: aload 21
    //   424: invokevirtual 75	java/lang/Enum:ordinal	()I
    //   427: istore 27
    //   429: aload 10
    //   431: iload 27
    //   433: iaload
    //   434: istore 9
    //   436: iload 9
    //   438: iload 8
    //   440: if_icmpeq +131 -> 571
    //   443: iload 9
    //   445: iload 22
    //   447: if_icmpeq +90 -> 537
    //   450: iload 9
    //   452: iload 24
    //   454: if_icmpeq +30 -> 484
    //   457: iload 9
    //   459: iload 19
    //   461: if_icmpne +15 -> 476
    //   464: aload 5
    //   466: aload 6
    //   468: iload 12
    //   470: invokestatic 106	com/google/zxing/qrcode/decoder/DecodedBitStreamParser:decodeKanjiSegment	(Lcom/google/zxing/common/BitSource;Ljava/lang/StringBuilder;I)V
    //   473: goto -196 -> 277
    //   476: invokestatic 101	com/google/zxing/FormatException:getFormatInstance	()Lcom/google/zxing/FormatException;
    //   479: astore 4
    //   481: aload 4
    //   483: athrow
    //   484: aload 5
    //   486: astore 10
    //   488: iload 12
    //   490: istore 27
    //   492: aload 6
    //   494: astore 30
    //   496: iload 24
    //   498: istore 26
    //   500: iload 12
    //   502: istore 24
    //   504: iload 22
    //   506: istore 27
    //   508: aload 21
    //   510: astore 28
    //   512: aload 7
    //   514: astore 21
    //   516: iload 19
    //   518: istore 29
    //   520: aload 5
    //   522: aload 6
    //   524: iload 12
    //   526: aload 18
    //   528: aload 7
    //   530: aload_3
    //   531: invokestatic 110	com/google/zxing/qrcode/decoder/DecodedBitStreamParser:decodeByteSegment	(Lcom/google/zxing/common/BitSource;Ljava/lang/StringBuilder;ILcom/google/zxing/common/CharacterSetECI;Ljava/util/Collection;Ljava/util/Map;)V
    //   534: goto +66 -> 600
    //   537: iload 12
    //   539: istore 9
    //   541: iload 24
    //   543: istore 26
    //   545: iload 22
    //   547: istore 27
    //   549: aload 21
    //   551: astore 28
    //   553: iload 19
    //   555: istore 29
    //   557: aload 5
    //   559: aload 6
    //   561: iload 12
    //   563: iload 13
    //   565: invokestatic 114	com/google/zxing/qrcode/decoder/DecodedBitStreamParser:decodeAlphanumericSegment	(Lcom/google/zxing/common/BitSource;Ljava/lang/StringBuilder;IZ)V
    //   568: goto +32 -> 600
    //   571: iload 12
    //   573: istore 9
    //   575: iload 24
    //   577: istore 26
    //   579: iload 22
    //   581: istore 27
    //   583: aload 21
    //   585: astore 28
    //   587: iload 19
    //   589: istore 29
    //   591: aload 5
    //   593: aload 6
    //   595: iload 12
    //   597: invokestatic 117	com/google/zxing/qrcode/decoder/DecodedBitStreamParser:decodeNumericSegment	(Lcom/google/zxing/common/BitSource;Ljava/lang/StringBuilder;I)V
    //   600: getstatic 56	com/google/zxing/qrcode/decoder/Mode:TERMINATOR	Lcom/google/zxing/qrcode/decoder/Mode;
    //   603: astore 10
    //   605: aload 28
    //   607: aload 10
    //   609: if_acmpne +162 -> 771
    //   612: aload 18
    //   614: ifnull +34 -> 648
    //   617: iload 14
    //   619: ifeq +10 -> 629
    //   622: iload 29
    //   624: istore 15
    //   626: goto +52 -> 678
    //   629: iload 15
    //   631: ifeq +10 -> 641
    //   634: bipush 6
    //   636: istore 31
    //   638: goto +30 -> 668
    //   641: iload 27
    //   643: istore 15
    //   645: goto +33 -> 678
    //   648: iload 14
    //   650: ifeq +10 -> 660
    //   653: iload 26
    //   655: istore 15
    //   657: goto +21 -> 678
    //   660: iload 15
    //   662: ifeq +13 -> 675
    //   665: iconst_5
    //   666: istore 31
    //   668: iload 31
    //   670: istore 15
    //   672: goto +6 -> 678
    //   675: iconst_1
    //   676: istore 15
    //   678: new 121	com/google/zxing/common/DecoderResult
    //   681: astore 4
    //   683: aload 6
    //   685: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   688: astore 10
    //   690: aload 7
    //   692: invokeinterface 131 1 0
    //   697: istore 12
    //   699: iload 12
    //   701: ifeq +12 -> 713
    //   704: iconst_0
    //   705: istore 8
    //   707: aconst_null
    //   708: astore 28
    //   710: goto +7 -> 717
    //   713: aload 7
    //   715: astore 28
    //   717: aload_2
    //   718: ifnonnull +6 -> 724
    //   721: goto +13 -> 734
    //   724: aload_2
    //   725: invokevirtual 132	java/lang/Object:toString	()Ljava/lang/String;
    //   728: astore 30
    //   730: aload 30
    //   732: astore 11
    //   734: aload 4
    //   736: astore 6
    //   738: aload 10
    //   740: astore 7
    //   742: iload 16
    //   744: istore 13
    //   746: iload 17
    //   748: istore 14
    //   750: aload 4
    //   752: aload_0
    //   753: aload 10
    //   755: aload 28
    //   757: aload 11
    //   759: iload 16
    //   761: iload 17
    //   763: iload 15
    //   765: invokespecial 135	com/google/zxing/common/DecoderResult:<init>	([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;III)V
    //   768: aload 4
    //   770: areturn
    //   771: iconst_1
    //   772: istore 8
    //   774: goto -701 -> 73
    //   777: pop
    //   778: invokestatic 101	com/google/zxing/FormatException:getFormatInstance	()Lcom/google/zxing/FormatException;
    //   781: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	782	0	paramArrayOfByte	byte[]
    //   0	782	1	paramVersion	Version
    //   0	782	2	paramErrorCorrectionLevel	ErrorCorrectionLevel
    //   0	782	3	paramMap	Map
    //   1	768	4	localObject1	Object
    //   6	586	5	localBitSource	BitSource
    //   17	720	6	localObject2	Object
    //   29	712	7	localObject3	Object
    //   32	741	8	i	int
    //   42	532	9	j	int
    //   45	709	10	localObject4	Object
    //   48	710	11	localObject5	Object
    //   51	545	12	k	int
    //   697	3	12	bool1	boolean
    //   54	691	13	bool2	boolean
    //   57	692	14	m	int
    //   60	704	15	n	int
    //   64	696	16	i1	int
    //   68	694	17	i2	int
    //   71	542	18	localCharacterSetECI	CharacterSetECI
    //   81	507	19	i3	int
    //   85	1	20	f1	float
    //   101	483	21	localObject6	Object
    //   145	435	22	i4	int
    //   149	1	23	f2	float
    //   152	424	24	i5	int
    //   156	1	25	f3	float
    //   279	375	26	i6	int
    //   283	359	27	i7	int
    //   287	469	28	localObject7	Object
    //   291	332	29	i8	int
    //   494	237	30	localObject8	Object
    //   636	33	31	i9	int
    //   777	1	33	localIllegalArgumentException	java.lang.IllegalArgumentException
    // Exception table:
    //   from	to	target	type
    //   73	78	777	java/lang/IllegalArgumentException
    //   94	97	777	java/lang/IllegalArgumentException
    //   108	113	777	java/lang/IllegalArgumentException
    //   115	120	777	java/lang/IllegalArgumentException
    //   125	128	777	java/lang/IllegalArgumentException
    //   130	135	777	java/lang/IllegalArgumentException
    //   139	142	777	java/lang/IllegalArgumentException
    //   202	207	777	java/lang/IllegalArgumentException
    //   214	219	777	java/lang/IllegalArgumentException
    //   223	228	777	java/lang/IllegalArgumentException
    //   232	237	777	java/lang/IllegalArgumentException
    //   250	255	777	java/lang/IllegalArgumentException
    //   258	263	777	java/lang/IllegalArgumentException
    //   265	270	777	java/lang/IllegalArgumentException
    //   296	299	777	java/lang/IllegalArgumentException
    //   301	304	777	java/lang/IllegalArgumentException
    //   304	309	777	java/lang/IllegalArgumentException
    //   328	333	777	java/lang/IllegalArgumentException
    //   337	342	777	java/lang/IllegalArgumentException
    //   355	358	777	java/lang/IllegalArgumentException
    //   360	363	777	java/lang/IllegalArgumentException
    //   415	420	777	java/lang/IllegalArgumentException
    //   422	427	777	java/lang/IllegalArgumentException
    //   431	434	777	java/lang/IllegalArgumentException
    //   468	473	777	java/lang/IllegalArgumentException
    //   476	479	777	java/lang/IllegalArgumentException
    //   481	484	777	java/lang/IllegalArgumentException
    //   530	534	777	java/lang/IllegalArgumentException
    //   563	568	777	java/lang/IllegalArgumentException
    //   595	600	777	java/lang/IllegalArgumentException
    //   600	603	777	java/lang/IllegalArgumentException
  }
  
  private static void decodeAlphanumericSegment(BitSource paramBitSource, StringBuilder paramStringBuilder, int paramInt, boolean paramBoolean)
  {
    int i = paramStringBuilder.length();
    int j;
    int k;
    for (;;)
    {
      j = 1;
      if (paramInt <= j) {
        break label86;
      }
      j = paramBitSource.available();
      k = 11;
      if (j < k) {
        break;
      }
      j = paramBitSource.readBits(k);
      k = toAlphaNumericChar(j / 45);
      paramStringBuilder.append(k);
      j = toAlphaNumericChar(j % 45);
      paramStringBuilder.append(j);
      paramInt += -2;
    }
    throw FormatException.getFormatInstance();
    label86:
    if (paramInt == j)
    {
      paramInt = paramBitSource.available();
      k = 6;
      if (paramInt >= k)
      {
        char c = toAlphaNumericChar(paramBitSource.readBits(k));
        paramStringBuilder.append(c);
      }
      else
      {
        throw FormatException.getFormatInstance();
      }
    }
    if (paramBoolean) {
      for (;;)
      {
        int m = paramStringBuilder.length();
        if (i >= m) {
          break;
        }
        m = paramStringBuilder.charAt(i);
        paramInt = 37;
        if (m == paramInt)
        {
          m = paramStringBuilder.length() - j;
          if (i < m)
          {
            m = i + 1;
            paramBoolean = paramStringBuilder.charAt(m);
            if (paramBoolean == paramInt)
            {
              paramStringBuilder.deleteCharAt(m);
              break label222;
            }
          }
          m = 29;
          paramStringBuilder.setCharAt(i, m);
        }
        label222:
        i += 1;
      }
    }
  }
  
  private static void decodeByteSegment(BitSource paramBitSource, StringBuilder paramStringBuilder, int paramInt, CharacterSetECI paramCharacterSetECI, Collection paramCollection, Map paramMap)
  {
    int i = paramInt * 8;
    int j = paramBitSource.available();
    if (i <= j)
    {
      byte[] arrayOfByte = new byte[paramInt];
      j = 0;
      while (j < paramInt)
      {
        int k = (byte)paramBitSource.readBits(8);
        arrayOfByte[j] = k;
        j += 1;
      }
      if (paramCharacterSetECI == null) {
        paramBitSource = StringUtils.guessCharset(arrayOfByte, paramMap);
      } else {
        paramBitSource = paramCharacterSetECI.getCharset();
      }
      String str = new java/lang/String;
      str.<init>(arrayOfByte, paramBitSource);
      paramStringBuilder.append(str);
      paramCollection.add(arrayOfByte);
      return;
    }
    throw FormatException.getFormatInstance();
  }
  
  private static void decodeHanziSegment(BitSource paramBitSource, StringBuilder paramStringBuilder, int paramInt)
  {
    Object localObject = StringUtils.GB2312_CHARSET;
    if (localObject != null)
    {
      int i = paramInt * 13;
      int j = paramBitSource.available();
      if (i <= j)
      {
        i = paramInt * 2;
        localObject = new byte[i];
        j = 0;
        while (paramInt > 0)
        {
          int k = paramBitSource.readBits(13);
          int m = k / 96 << 8;
          k = k % 96 | m;
          m = 2560;
          if (k < m) {
            m = 41377;
          } else {
            m = 42657;
          }
          k += m;
          m = (byte)(k >> 8 & 0xFF);
          localObject[j] = m;
          m = j + 1;
          k = (byte)(k & 0xFF);
          localObject[m] = k;
          j += 2;
          paramInt += -1;
        }
        paramBitSource = new java/lang/String;
        Charset localCharset = StringUtils.GB2312_CHARSET;
        paramBitSource.<init>((byte[])localObject, localCharset);
        paramStringBuilder.append(paramBitSource);
        return;
      }
      throw FormatException.getFormatInstance();
    }
    throw FormatException.getFormatInstance();
  }
  
  private static void decodeKanjiSegment(BitSource paramBitSource, StringBuilder paramStringBuilder, int paramInt)
  {
    int i = paramInt * 13;
    int j = paramBitSource.available();
    if (i <= j)
    {
      i = paramInt * 2;
      byte[] arrayOfByte = new byte[i];
      j = 0;
      while (paramInt > 0)
      {
        int k = paramBitSource.readBits(13);
        int m = k / 192 << 8;
        k = k % 192 | m;
        m = 7936;
        if (k < m) {
          m = 33088;
        } else {
          m = 49472;
        }
        k += m;
        m = (byte)(k >> 8);
        arrayOfByte[j] = m;
        m = j + 1;
        k = (byte)k;
        arrayOfByte[m] = k;
        j += 2;
        paramInt += -1;
      }
      paramBitSource = new java/lang/String;
      Charset localCharset = StringUtils.SHIFT_JIS_CHARSET;
      paramBitSource.<init>(arrayOfByte, localCharset);
      paramStringBuilder.append(paramBitSource);
      return;
    }
    throw FormatException.getFormatInstance();
  }
  
  private static void decodeNumericSegment(BitSource paramBitSource, StringBuilder paramStringBuilder, int paramInt)
  {
    int j;
    for (;;)
    {
      i = 3;
      j = 10;
      if (paramInt < i) {
        break label109;
      }
      i = paramBitSource.available();
      if (i < j) {
        break label105;
      }
      i = paramBitSource.readBits(j);
      int k = 1000;
      if (i >= k) {
        break;
      }
      k = toAlphaNumericChar(i / 100);
      paramStringBuilder.append(k);
      k = i / 10 % j;
      j = toAlphaNumericChar(k);
      paramStringBuilder.append(j);
      i = toAlphaNumericChar(i % 10);
      paramStringBuilder.append(i);
      paramInt += -3;
    }
    throw FormatException.getFormatInstance();
    label105:
    throw FormatException.getFormatInstance();
    label109:
    int i = 2;
    int m;
    if (paramInt == i)
    {
      paramInt = paramBitSource.available();
      i = 7;
      if (paramInt >= i)
      {
        m = paramBitSource.readBits(i);
        paramInt = 100;
        if (m < paramInt)
        {
          paramInt = toAlphaNumericChar(m / 10);
          paramStringBuilder.append(paramInt);
          m %= j;
        }
      }
    }
    do
    {
      m = toAlphaNumericChar(m);
      paramStringBuilder.append(m);
      return;
      throw FormatException.getFormatInstance();
      throw FormatException.getFormatInstance();
      i = 1;
      if (paramInt != i) {
        return;
      }
      paramInt = paramBitSource.available();
      i = 4;
      if (paramInt < i) {
        break;
      }
      m = paramBitSource.readBits(i);
    } while (m < j);
    throw FormatException.getFormatInstance();
    throw FormatException.getFormatInstance();
  }
  
  private static int parseECIValue(BitSource paramBitSource)
  {
    int i = 8;
    int j = paramBitSource.readBits(i);
    int k = j & 0x80;
    if (k == 0) {
      return j & 0x7F;
    }
    k = j & 0xC0;
    int m = 128;
    int n;
    if (k == m)
    {
      n = paramBitSource.readBits(i);
      i = (j & 0x3F) << 8;
      return n | i;
    }
    i = j & 0xE0;
    k = 192;
    if (i == k)
    {
      n = paramBitSource.readBits(16);
      i = (j & 0x1F) << 16;
      return n | i;
    }
    throw FormatException.getFormatInstance();
  }
  
  private static char toAlphaNumericChar(int paramInt)
  {
    char[] arrayOfChar = ALPHANUMERIC_CHARS;
    int i = arrayOfChar.length;
    if (paramInt < i) {
      return arrayOfChar[paramInt];
    }
    throw FormatException.getFormatInstance();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.DecodedBitStreamParser
 * JD-Core Version:    0.7.0.1
 */