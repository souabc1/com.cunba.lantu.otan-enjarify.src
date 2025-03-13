package com.google.zxing.pdf417.decoder;

class DetectionResultColumn
{
  private static final int MAX_NEARBY_DISTANCE = 5;
  private final BoundingBox boundingBox;
  private final Codeword[] codewords;
  
  public DetectionResultColumn(BoundingBox paramBoundingBox)
  {
    BoundingBox localBoundingBox = new com/google/zxing/pdf417/decoder/BoundingBox;
    localBoundingBox.<init>(paramBoundingBox);
    this.boundingBox = localBoundingBox;
    int i = paramBoundingBox.getMaxY();
    int j = paramBoundingBox.getMinY();
    paramBoundingBox = new Codeword[i - j + 1];
    this.codewords = paramBoundingBox;
  }
  
  public final BoundingBox getBoundingBox()
  {
    return this.boundingBox;
  }
  
  public final Codeword getCodeword(int paramInt)
  {
    Codeword[] arrayOfCodeword = this.codewords;
    paramInt = imageRowToCodewordIndex(paramInt);
    return arrayOfCodeword[paramInt];
  }
  
  public final Codeword getCodewordNearby(int paramInt)
  {
    Codeword localCodeword1 = getCodeword(paramInt);
    if (localCodeword1 != null) {
      return localCodeword1;
    }
    int i = 1;
    for (;;)
    {
      int j = 5;
      if (i >= j) {
        break;
      }
      j = imageRowToCodewordIndex(paramInt) - i;
      Codeword localCodeword2;
      if (j >= 0)
      {
        arrayOfCodeword = this.codewords;
        localCodeword2 = arrayOfCodeword[j];
        if (localCodeword2 != null) {
          return localCodeword2;
        }
      }
      j = imageRowToCodewordIndex(paramInt) + i;
      Codeword[] arrayOfCodeword = this.codewords;
      int k = arrayOfCodeword.length;
      if (j < k)
      {
        localCodeword2 = arrayOfCodeword[j];
        if (localCodeword2 != null) {
          return localCodeword2;
        }
      }
      i += 1;
    }
    return null;
  }
  
  public final Codeword[] getCodewords()
  {
    return this.codewords;
  }
  
  public final int imageRowToCodewordIndex(int paramInt)
  {
    int i = this.boundingBox.getMinY();
    return paramInt - i;
  }
  
  public final void setCodeword(int paramInt, Codeword paramCodeword)
  {
    Codeword[] arrayOfCodeword = this.codewords;
    paramInt = imageRowToCodewordIndex(paramInt);
    arrayOfCodeword[paramInt] = paramCodeword;
  }
  
  /* Error */
  public java.lang.String toString()
  {
    // Byte code:
    //   0: new 46	java/util/Formatter
    //   3: astore_1
    //   4: aload_1
    //   5: invokespecial 47	java/util/Formatter:<init>	()V
    //   8: aload_0
    //   9: getfield 34	com/google/zxing/pdf417/decoder/DetectionResultColumn:codewords	[Lcom/google/zxing/pdf417/decoder/Codeword;
    //   12: astore_2
    //   13: aload_2
    //   14: arraylength
    //   15: istore_3
    //   16: iconst_0
    //   17: istore 4
    //   19: iconst_0
    //   20: istore 5
    //   22: aconst_null
    //   23: astore 6
    //   25: iload 4
    //   27: iload_3
    //   28: if_icmpge +177 -> 205
    //   31: aload_2
    //   32: iload 4
    //   34: aaload
    //   35: astore 7
    //   37: iconst_1
    //   38: istore 8
    //   40: aload 7
    //   42: ifnonnull +56 -> 98
    //   45: ldc 49
    //   47: astore 7
    //   49: aload 7
    //   51: invokestatic 55	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   54: astore 7
    //   56: iload 8
    //   58: anewarray 4	java/lang/Object
    //   61: astore 9
    //   63: iload 5
    //   65: iconst_1
    //   66: iadd
    //   67: istore 10
    //   69: iload 5
    //   71: invokestatic 61	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   74: astore 6
    //   76: aload 9
    //   78: iconst_0
    //   79: aload 6
    //   81: aastore
    //   82: aload_1
    //   83: aload 7
    //   85: aload 9
    //   87: invokevirtual 65	java/util/Formatter:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
    //   90: pop
    //   91: iload 10
    //   93: istore 5
    //   95: goto +101 -> 196
    //   98: ldc 67
    //   100: astore 11
    //   102: aload 11
    //   104: invokestatic 55	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   107: astore 11
    //   109: iconst_3
    //   110: istore 12
    //   112: iload 12
    //   114: anewarray 4	java/lang/Object
    //   117: astore 13
    //   119: iload 5
    //   121: iconst_1
    //   122: iadd
    //   123: istore 14
    //   125: iload 5
    //   127: invokestatic 61	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   130: astore 6
    //   132: aload 13
    //   134: iconst_0
    //   135: aload 6
    //   137: aastore
    //   138: aload 7
    //   140: invokevirtual 71	com/google/zxing/pdf417/decoder/Codeword:getRowNumber	()I
    //   143: istore 5
    //   145: iload 5
    //   147: invokestatic 61	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   150: astore 6
    //   152: aload 13
    //   154: iload 8
    //   156: aload 6
    //   158: aastore
    //   159: aload 7
    //   161: invokevirtual 74	com/google/zxing/pdf417/decoder/Codeword:getValue	()I
    //   164: istore 5
    //   166: iload 5
    //   168: invokestatic 61	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   171: astore 6
    //   173: iconst_2
    //   174: istore 15
    //   176: aload 13
    //   178: iload 15
    //   180: aload 6
    //   182: aastore
    //   183: aload_1
    //   184: aload 11
    //   186: aload 13
    //   188: invokevirtual 65	java/util/Formatter:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
    //   191: pop
    //   192: iload 14
    //   194: istore 5
    //   196: iload 4
    //   198: iconst_1
    //   199: iadd
    //   200: istore 4
    //   202: goto -177 -> 25
    //   205: aload_1
    //   206: invokevirtual 79	java/util/Formatter:toString	()Ljava/lang/String;
    //   209: astore_2
    //   210: aload_1
    //   211: invokevirtual 82	java/util/Formatter:close	()V
    //   214: aload_2
    //   215: areturn
    //   216: astore_2
    //   217: aload_2
    //   218: athrow
    //   219: astore 16
    //   221: aload_1
    //   222: invokevirtual 82	java/util/Formatter:close	()V
    //   225: goto +9 -> 234
    //   228: astore_1
    //   229: aload_2
    //   230: aload_1
    //   231: invokevirtual 88	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   234: aload 16
    //   236: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	237	0	this	DetectionResultColumn
    //   3	219	1	localFormatter	java.util.Formatter
    //   228	3	1	localThrowable	java.lang.Throwable
    //   12	203	2	localObject1	Object
    //   216	14	2	localObject2	Object
    //   15	14	3	i	int
    //   17	184	4	j	int
    //   20	175	5	k	int
    //   23	158	6	localInteger	java.lang.Integer
    //   35	125	7	str1	java.lang.String
    //   38	117	8	m	int
    //   61	25	9	arrayOfObject1	Object[]
    //   67	25	10	n	int
    //   100	85	11	str2	java.lang.String
    //   110	3	12	i1	int
    //   117	70	13	arrayOfObject2	Object[]
    //   123	70	14	i2	int
    //   174	5	15	i3	int
    //   219	16	16	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   8	12	216	finally
    //   13	15	216	finally
    //   32	35	216	finally
    //   49	54	216	finally
    //   56	61	216	finally
    //   69	74	216	finally
    //   79	82	216	finally
    //   85	91	216	finally
    //   102	107	216	finally
    //   112	117	216	finally
    //   125	130	216	finally
    //   135	138	216	finally
    //   138	143	216	finally
    //   145	150	216	finally
    //   156	159	216	finally
    //   159	164	216	finally
    //   166	171	216	finally
    //   180	183	216	finally
    //   186	192	216	finally
    //   205	209	216	finally
    //   217	219	219	finally
    //   221	225	228	finally
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.DetectionResultColumn
 * JD-Core Version:    0.7.0.1
 */