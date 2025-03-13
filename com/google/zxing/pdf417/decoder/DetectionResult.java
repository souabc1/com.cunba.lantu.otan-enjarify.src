package com.google.zxing.pdf417.decoder;

final class DetectionResult
{
  private static final int ADJUST_ROW_NUMBER_SKIP = 2;
  private final int barcodeColumnCount;
  private final BarcodeMetadata barcodeMetadata;
  private BoundingBox boundingBox;
  private final DetectionResultColumn[] detectionResultColumns;
  
  public DetectionResult(BarcodeMetadata paramBarcodeMetadata, BoundingBox paramBoundingBox)
  {
    this.barcodeMetadata = paramBarcodeMetadata;
    int i = paramBarcodeMetadata.getColumnCount();
    this.barcodeColumnCount = i;
    this.boundingBox = paramBoundingBox;
    paramBarcodeMetadata = new DetectionResultColumn[i + 2];
    this.detectionResultColumns = paramBarcodeMetadata;
  }
  
  private void adjustIndicatorColumnRowNumbers(DetectionResultColumn paramDetectionResultColumn)
  {
    if (paramDetectionResultColumn != null)
    {
      paramDetectionResultColumn = (DetectionResultRowIndicatorColumn)paramDetectionResultColumn;
      BarcodeMetadata localBarcodeMetadata = this.barcodeMetadata;
      paramDetectionResultColumn.adjustCompleteIndicatorColumnRowNumbers(localBarcodeMetadata);
    }
  }
  
  private static boolean adjustRowNumber(Codeword paramCodeword1, Codeword paramCodeword2)
  {
    if (paramCodeword2 == null) {
      return false;
    }
    boolean bool = paramCodeword2.hasValidRowNumber();
    if (bool)
    {
      int i = paramCodeword2.getBucket();
      int j = paramCodeword1.getBucket();
      if (i == j)
      {
        int k = paramCodeword2.getRowNumber();
        paramCodeword1.setRowNumber(k);
        return true;
      }
    }
    return false;
  }
  
  private static int adjustRowNumberIfValid(int paramInt1, int paramInt2, Codeword paramCodeword)
  {
    if (paramCodeword == null) {
      return paramInt2;
    }
    boolean bool = paramCodeword.hasValidRowNumber();
    if (!bool)
    {
      bool = paramCodeword.isValidRowNumber(paramInt1);
      if (bool)
      {
        paramCodeword.setRowNumber(paramInt1);
        paramInt2 = 0;
      }
      else
      {
        paramInt2 += 1;
      }
    }
    return paramInt2;
  }
  
  private int adjustRowNumbers()
  {
    int i = adjustRowNumbersByRow();
    if (i == 0) {
      return 0;
    }
    int j = 1;
    int k = j;
    for (;;)
    {
      int m = this.barcodeColumnCount + j;
      if (k >= m) {
        break;
      }
      Codeword[] arrayOfCodeword = this.detectionResultColumns[k].getCodewords();
      int n = 0;
      for (;;)
      {
        int i1 = arrayOfCodeword.length;
        if (n >= i1) {
          break;
        }
        Codeword localCodeword = arrayOfCodeword[n];
        if (localCodeword != null)
        {
          boolean bool = localCodeword.hasValidRowNumber();
          if (!bool) {
            adjustRowNumbers(k, n, arrayOfCodeword);
          }
        }
        n += 1;
      }
      k += 1;
    }
    return i;
  }
  
  private void adjustRowNumbers(int paramInt1, int paramInt2, Codeword[] paramArrayOfCodeword)
  {
    Codeword localCodeword1 = paramArrayOfCodeword[paramInt2];
    Object localObject1 = this.detectionResultColumns;
    int i = paramInt1 + -1;
    localObject1 = localObject1[i].getCodewords();
    DetectionResultColumn[] arrayOfDetectionResultColumn = this.detectionResultColumns;
    int j = 1;
    paramInt1 += j;
    Object localObject2 = arrayOfDetectionResultColumn[paramInt1];
    if (localObject2 != null) {
      localObject2 = ((DetectionResultColumn)localObject2).getCodewords();
    } else {
      localObject2 = localObject1;
    }
    i = 14;
    Codeword[] arrayOfCodeword = new Codeword[i];
    Object localObject3 = localObject1[paramInt2];
    int k = 2;
    arrayOfCodeword[k] = localObject3;
    localObject3 = localObject2[paramInt2];
    int m = 3;
    arrayOfCodeword[m] = localObject3;
    int n = 0;
    localObject3 = null;
    Codeword localCodeword2;
    Object localObject4;
    int i1;
    Object localObject5;
    if (paramInt2 > 0)
    {
      m = paramInt2 + -1;
      localCodeword2 = paramArrayOfCodeword[m];
      arrayOfCodeword[0] = localCodeword2;
      localObject4 = localObject1[m];
      arrayOfCodeword[4] = localObject4;
      i1 = 5;
      localObject5 = localObject2[m];
      arrayOfCodeword[i1] = localObject5;
    }
    if (paramInt2 > j)
    {
      m = paramInt2 + -2;
      localCodeword2 = paramArrayOfCodeword[m];
      int i2 = 8;
      arrayOfCodeword[i2] = localCodeword2;
      localObject4 = localObject1[m];
      arrayOfCodeword[10] = localObject4;
      i1 = 11;
      localObject5 = localObject2[m];
      arrayOfCodeword[i1] = localObject5;
    }
    m = paramArrayOfCodeword.length - j;
    if (paramInt2 < m)
    {
      m = paramInt2 + 1;
      localCodeword2 = paramArrayOfCodeword[m];
      arrayOfCodeword[j] = localCodeword2;
      localCodeword2 = localObject1[m];
      arrayOfCodeword[6] = localCodeword2;
      j = 7;
      localObject5 = localObject2[m];
      arrayOfCodeword[j] = localObject5;
    }
    j = paramArrayOfCodeword.length - k;
    if (paramInt2 < j)
    {
      paramInt2 += k;
      paramArrayOfCodeword = paramArrayOfCodeword[paramInt2];
      j = 9;
      arrayOfCodeword[j] = paramArrayOfCodeword;
      localObject1 = localObject1[paramInt2];
      arrayOfCodeword[12] = localObject1;
      int i3 = 13;
      localObject2 = localObject2[paramInt2];
      arrayOfCodeword[i3] = localObject2;
    }
    while (n < i)
    {
      localObject2 = arrayOfCodeword[n];
      paramInt1 = adjustRowNumber(localCodeword1, (Codeword)localObject2);
      if (paramInt1 != 0) {
        return;
      }
      n += 1;
    }
  }
  
  private int adjustRowNumbersByRow()
  {
    adjustRowNumbersFromBothRI();
    int i = adjustRowNumbersFromLRI();
    int j = adjustRowNumbersFromRRI();
    return i + j;
  }
  
  private void adjustRowNumbersFromBothRI()
  {
    Object localObject1 = this.detectionResultColumns;
    int i = 0;
    Object localObject2 = localObject1[0];
    if (localObject2 != null)
    {
      int j = this.barcodeColumnCount;
      int k = 1;
      j += k;
      localObject1 = localObject1[j];
      if (localObject1 != null)
      {
        localObject1 = ((DetectionResultColumn)localObject2).getCodewords();
        localObject2 = this.detectionResultColumns;
        j = this.barcodeColumnCount + k;
        localObject2 = localObject2[j].getCodewords();
        for (;;)
        {
          j = localObject1.length;
          if (i >= j) {
            break;
          }
          Object localObject3 = localObject1[i];
          if (localObject3 != null)
          {
            Object localObject4 = localObject2[i];
            if (localObject4 != null)
            {
              j = localObject3.getRowNumber();
              localObject4 = localObject2[i];
              int m = ((Codeword)localObject4).getRowNumber();
              if (j == m)
              {
                j = k;
                for (;;)
                {
                  m = this.barcodeColumnCount;
                  if (j > m) {
                    break;
                  }
                  localObject4 = this.detectionResultColumns[j].getCodewords()[i];
                  if (localObject4 != null)
                  {
                    Object localObject5 = localObject1[i];
                    int n = localObject5.getRowNumber();
                    ((Codeword)localObject4).setRowNumber(n);
                    boolean bool = ((Codeword)localObject4).hasValidRowNumber();
                    if (!bool)
                    {
                      localObject4 = this.detectionResultColumns[j].getCodewords();
                      n = 0;
                      localObject5 = null;
                      localObject4[i] = null;
                    }
                  }
                  j += 1;
                }
              }
            }
          }
          i += 1;
        }
      }
    }
  }
  
  private int adjustRowNumbersFromLRI()
  {
    Object localObject1 = this.detectionResultColumns[0];
    if (localObject1 == null) {
      return 0;
    }
    localObject1 = ((DetectionResultColumn)localObject1).getCodewords();
    int i = 0;
    int j = 0;
    for (;;)
    {
      int k = localObject1.length;
      if (i >= k) {
        break;
      }
      Object localObject2 = localObject1[i];
      if (localObject2 != null)
      {
        k = localObject2.getRowNumber();
        int m = 1;
        int n = 0;
        int i1 = m;
        for (;;)
        {
          int i2 = this.barcodeColumnCount + m;
          if (i1 >= i2) {
            break;
          }
          i2 = 2;
          if (n >= i2) {
            break;
          }
          Codeword localCodeword = this.detectionResultColumns[i1].getCodewords()[i];
          if (localCodeword != null)
          {
            n = adjustRowNumberIfValid(k, n, localCodeword);
            boolean bool = localCodeword.hasValidRowNumber();
            if (!bool) {
              j += 1;
            }
          }
          i1 += 1;
        }
      }
      i += 1;
    }
    return j;
  }
  
  private int adjustRowNumbersFromRRI()
  {
    Object localObject1 = this.detectionResultColumns;
    int i = this.barcodeColumnCount;
    int j = i + 1;
    Object localObject2 = localObject1[j];
    if (localObject2 == null) {
      return 0;
    }
    i += 1;
    localObject1 = localObject1[i].getCodewords();
    i = 0;
    j = 0;
    localObject2 = null;
    for (;;)
    {
      int k = localObject1.length;
      if (i >= k) {
        break;
      }
      Object localObject3 = localObject1[i];
      if (localObject3 != null)
      {
        k = localObject3.getRowNumber();
        int m = this.barcodeColumnCount + 1;
        int n = 0;
        while (m > 0)
        {
          int i1 = 2;
          if (n >= i1) {
            break;
          }
          Codeword localCodeword = this.detectionResultColumns[m].getCodewords()[i];
          if (localCodeword != null)
          {
            n = adjustRowNumberIfValid(k, n, localCodeword);
            boolean bool = localCodeword.hasValidRowNumber();
            if (!bool) {
              j += 1;
            }
          }
          m += -1;
        }
      }
      i += 1;
    }
    return j;
  }
  
  public int getBarcodeColumnCount()
  {
    return this.barcodeColumnCount;
  }
  
  public int getBarcodeECLevel()
  {
    return this.barcodeMetadata.getErrorCorrectionLevel();
  }
  
  public int getBarcodeRowCount()
  {
    return this.barcodeMetadata.getRowCount();
  }
  
  public BoundingBox getBoundingBox()
  {
    return this.boundingBox;
  }
  
  public DetectionResultColumn getDetectionResultColumn(int paramInt)
  {
    return this.detectionResultColumns[paramInt];
  }
  
  public DetectionResultColumn[] getDetectionResultColumns()
  {
    Object localObject = this.detectionResultColumns[0];
    adjustIndicatorColumnRowNumbers((DetectionResultColumn)localObject);
    localObject = this.detectionResultColumns;
    int i = this.barcodeColumnCount + 1;
    localObject = localObject[i];
    adjustIndicatorColumnRowNumbers((DetectionResultColumn)localObject);
    for (int j = 928;; j = i)
    {
      i = adjustRowNumbers();
      if ((i <= 0) || (i >= j)) {
        break;
      }
    }
    return this.detectionResultColumns;
  }
  
  public void setBoundingBox(BoundingBox paramBoundingBox)
  {
    this.boundingBox = paramBoundingBox;
  }
  
  public void setDetectionResultColumn(int paramInt, DetectionResultColumn paramDetectionResultColumn)
  {
    this.detectionResultColumns[paramInt] = paramDetectionResultColumn;
  }
  
  /* Error */
  public java.lang.String toString()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	com/google/zxing/pdf417/decoder/DetectionResult:detectionResultColumns	[Lcom/google/zxing/pdf417/decoder/DetectionResultColumn;
    //   4: astore_1
    //   5: aconst_null
    //   6: astore_2
    //   7: aload_1
    //   8: iconst_0
    //   9: aaload
    //   10: astore_3
    //   11: iconst_1
    //   12: istore 4
    //   14: aload_3
    //   15: ifnonnull +17 -> 32
    //   18: aload_0
    //   19: getfield 29	com/google/zxing/pdf417/decoder/DetectionResult:barcodeColumnCount	I
    //   22: iload 4
    //   24: iadd
    //   25: istore 5
    //   27: aload_1
    //   28: iload 5
    //   30: aaload
    //   31: astore_3
    //   32: new 118	java/util/Formatter
    //   35: astore_1
    //   36: aload_1
    //   37: invokespecial 119	java/util/Formatter:<init>	()V
    //   40: iconst_0
    //   41: istore 6
    //   43: aload_3
    //   44: invokevirtual 69	com/google/zxing/pdf417/decoder/DetectionResultColumn:getCodewords	()[Lcom/google/zxing/pdf417/decoder/Codeword;
    //   47: astore 7
    //   49: aload 7
    //   51: arraylength
    //   52: istore 8
    //   54: iload 6
    //   56: iload 8
    //   58: if_icmpge +257 -> 315
    //   61: ldc 121
    //   63: astore 7
    //   65: aload 7
    //   67: invokestatic 127	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   70: astore 7
    //   72: iload 4
    //   74: anewarray 4	java/lang/Object
    //   77: astore 9
    //   79: iload 6
    //   81: invokestatic 133	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   84: astore 10
    //   86: aload 9
    //   88: iconst_0
    //   89: aload 10
    //   91: aastore
    //   92: aload_1
    //   93: aload 7
    //   95: aload 9
    //   97: invokevirtual 137	java/util/Formatter:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
    //   100: pop
    //   101: iconst_0
    //   102: istore 8
    //   104: aconst_null
    //   105: astore 7
    //   107: aload_0
    //   108: getfield 29	com/google/zxing/pdf417/decoder/DetectionResult:barcodeColumnCount	I
    //   111: istore 11
    //   113: iconst_2
    //   114: istore 12
    //   116: iload 11
    //   118: iload 12
    //   120: iadd
    //   121: istore 11
    //   123: iload 8
    //   125: iload 11
    //   127: if_icmpge +160 -> 287
    //   130: aload_0
    //   131: getfield 35	com/google/zxing/pdf417/decoder/DetectionResult:detectionResultColumns	[Lcom/google/zxing/pdf417/decoder/DetectionResultColumn;
    //   134: astore 9
    //   136: aload 9
    //   138: iload 8
    //   140: aaload
    //   141: astore 9
    //   143: ldc 139
    //   145: invokestatic 127	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   148: astore 13
    //   150: aload 9
    //   152: ifnonnull +21 -> 173
    //   155: iconst_0
    //   156: anewarray 4	java/lang/Object
    //   159: astore 9
    //   161: aload_1
    //   162: aload 13
    //   164: aload 9
    //   166: invokevirtual 137	java/util/Formatter:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
    //   169: pop
    //   170: goto +108 -> 278
    //   173: aload 9
    //   175: invokevirtual 69	com/google/zxing/pdf417/decoder/DetectionResultColumn:getCodewords	()[Lcom/google/zxing/pdf417/decoder/Codeword;
    //   178: astore 9
    //   180: aload 9
    //   182: iload 6
    //   184: aaload
    //   185: astore 9
    //   187: aload 9
    //   189: ifnonnull +21 -> 210
    //   192: iconst_0
    //   193: anewarray 4	java/lang/Object
    //   196: astore 9
    //   198: aload_1
    //   199: aload 13
    //   201: aload 9
    //   203: invokevirtual 137	java/util/Formatter:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
    //   206: pop
    //   207: goto +71 -> 278
    //   210: ldc 141
    //   212: astore 13
    //   214: aload 13
    //   216: invokestatic 127	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   219: astore 13
    //   221: iload 12
    //   223: anewarray 4	java/lang/Object
    //   226: astore 10
    //   228: aload 9
    //   230: invokevirtual 53	com/google/zxing/pdf417/decoder/Codeword:getRowNumber	()I
    //   233: istore 14
    //   235: iload 14
    //   237: invokestatic 133	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   240: astore 15
    //   242: aload 10
    //   244: iconst_0
    //   245: aload 15
    //   247: aastore
    //   248: aload 9
    //   250: invokevirtual 144	com/google/zxing/pdf417/decoder/Codeword:getValue	()I
    //   253: istore 11
    //   255: iload 11
    //   257: invokestatic 133	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   260: astore 9
    //   262: aload 10
    //   264: iload 4
    //   266: aload 9
    //   268: aastore
    //   269: aload_1
    //   270: aload 13
    //   272: aload 10
    //   274: invokevirtual 137	java/util/Formatter:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
    //   277: pop
    //   278: iload 8
    //   280: iconst_1
    //   281: iadd
    //   282: istore 8
    //   284: goto -177 -> 107
    //   287: ldc 146
    //   289: astore 7
    //   291: iconst_0
    //   292: anewarray 4	java/lang/Object
    //   295: astore 9
    //   297: aload_1
    //   298: aload 7
    //   300: aload 9
    //   302: invokevirtual 137	java/util/Formatter:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
    //   305: pop
    //   306: iload 6
    //   308: iconst_1
    //   309: iadd
    //   310: istore 6
    //   312: goto -269 -> 43
    //   315: aload_1
    //   316: invokevirtual 150	java/util/Formatter:toString	()Ljava/lang/String;
    //   319: astore_2
    //   320: aload_1
    //   321: invokevirtual 153	java/util/Formatter:close	()V
    //   324: aload_2
    //   325: areturn
    //   326: astore_2
    //   327: aload_2
    //   328: athrow
    //   329: astore_3
    //   330: aload_1
    //   331: invokevirtual 153	java/util/Formatter:close	()V
    //   334: goto +9 -> 343
    //   337: astore_1
    //   338: aload_2
    //   339: aload_1
    //   340: invokevirtual 159	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   343: aload_3
    //   344: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	345	0	this	DetectionResult
    //   4	327	1	localObject1	Object
    //   337	3	1	localThrowable	java.lang.Throwable
    //   6	319	2	str1	java.lang.String
    //   326	13	2	localObject2	Object
    //   10	34	3	localObject3	Object
    //   329	15	3	localObject4	Object
    //   12	253	4	i	int
    //   25	4	5	j	int
    //   41	270	6	k	int
    //   47	252	7	localObject5	Object
    //   52	231	8	m	int
    //   77	224	9	localObject6	Object
    //   84	189	10	localObject7	Object
    //   111	145	11	n	int
    //   114	108	12	i1	int
    //   148	123	13	str2	java.lang.String
    //   233	3	14	i2	int
    //   240	6	15	localInteger	java.lang.Integer
    // Exception table:
    //   from	to	target	type
    //   43	47	326	finally
    //   49	52	326	finally
    //   65	70	326	finally
    //   72	77	326	finally
    //   79	84	326	finally
    //   89	92	326	finally
    //   95	101	326	finally
    //   107	111	326	finally
    //   130	134	326	finally
    //   138	141	326	finally
    //   155	159	326	finally
    //   164	170	326	finally
    //   173	178	326	finally
    //   182	185	326	finally
    //   192	196	326	finally
    //   201	207	326	finally
    //   214	219	326	finally
    //   221	226	326	finally
    //   228	233	326	finally
    //   235	240	326	finally
    //   245	248	326	finally
    //   248	253	326	finally
    //   255	260	326	finally
    //   266	269	326	finally
    //   272	278	326	finally
    //   291	295	326	finally
    //   300	306	326	finally
    //   315	319	326	finally
    //   327	329	329	finally
    //   330	334	337	finally
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.DetectionResult
 * JD-Core Version:    0.7.0.1
 */