package com.google.zxing.qrcode.decoder;

final class FormatInformation
{
  private static final int[][] FORMAT_INFO_DECODE_LOOKUP;
  private static final int FORMAT_INFO_MASK_QR = 21522;
  private final byte dataMask;
  private final ErrorCorrectionLevel errorCorrectionLevel;
  
  static
  {
    int[][] arrayOfInt = new int[32][];
    int[] arrayOfInt1 = { 21522, 0 };
    arrayOfInt[0] = arrayOfInt1;
    int i = 1;
    arrayOfInt1 = new int[] { 20773, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 2;
    arrayOfInt1 = new int[] { 24188, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 3;
    arrayOfInt1 = new int[] { 23371, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 4;
    arrayOfInt1 = new int[] { 17913, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 5;
    arrayOfInt1 = new int[] { 16590, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 6;
    arrayOfInt1 = new int[] { 20375, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 7;
    arrayOfInt1 = new int[] { 19104, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 8;
    arrayOfInt1 = new int[] { 30660, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 9;
    arrayOfInt1 = new int[] { 29427, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 10;
    arrayOfInt1 = new int[] { 32170, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 11;
    arrayOfInt1 = new int[] { 30877, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 12;
    arrayOfInt1 = new int[] { 26159, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 13;
    arrayOfInt1 = new int[] { 25368, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 14;
    arrayOfInt1 = new int[] { 27713, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 15;
    arrayOfInt1 = new int[] { 26998, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 16;
    arrayOfInt1 = new int[] { 5769, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 17;
    arrayOfInt1 = new int[] { 5054, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 18;
    arrayOfInt1 = new int[] { 7399, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 19;
    arrayOfInt1 = new int[] { 6608, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 20;
    arrayOfInt1 = new int[] { 1890, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 21;
    arrayOfInt1 = new int[] { 597, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 22;
    arrayOfInt1 = new int[] { 3340, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 23;
    arrayOfInt1 = new int[] { 2107, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 24;
    arrayOfInt1 = new int[] { 13663, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 25;
    arrayOfInt1 = new int[] { 12392, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 26;
    arrayOfInt1 = new int[] { 16177, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 27;
    arrayOfInt1 = new int[] { 14854, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 28;
    arrayOfInt1 = new int[] { 9396, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 29;
    arrayOfInt1 = new int[] { 8579, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 30;
    arrayOfInt1 = new int[] { 11994, i };
    arrayOfInt[i] = arrayOfInt1;
    i = 31;
    arrayOfInt1 = new int[] { 11245, i };
    arrayOfInt[i] = arrayOfInt1;
    FORMAT_INFO_DECODE_LOOKUP = arrayOfInt;
  }
  
  private FormatInformation(int paramInt)
  {
    ErrorCorrectionLevel localErrorCorrectionLevel = ErrorCorrectionLevel.forBits(paramInt >> 3 & 0x3);
    this.errorCorrectionLevel = localErrorCorrectionLevel;
    paramInt = (byte)(paramInt & 0x7);
    this.dataMask = paramInt;
  }
  
  public static FormatInformation decodeFormatInformation(int paramInt1, int paramInt2)
  {
    FormatInformation localFormatInformation = doDecodeFormatInformation(paramInt1, paramInt2);
    if (localFormatInformation != null) {
      return localFormatInformation;
    }
    paramInt1 ^= 0x5412;
    paramInt2 ^= 0x5412;
    return doDecodeFormatInformation(paramInt1, paramInt2);
  }
  
  private static FormatInformation doDecodeFormatInformation(int paramInt1, int paramInt2)
  {
    int[][] arrayOfInt = FORMAT_INFO_DECODE_LOOKUP;
    int i = arrayOfInt.length;
    int j = -1 >>> 1;
    int k = 0;
    int m = 0;
    FormatInformation localFormatInformation;
    while (k < i)
    {
      int[] arrayOfInt1 = arrayOfInt[k];
      int n = arrayOfInt1[0];
      int i1 = 1;
      if ((n != paramInt1) && (n != paramInt2))
      {
        int i2 = numBitsDiffering(paramInt1, n);
        if (i2 < j)
        {
          m = arrayOfInt1[i1];
          j = i2;
        }
        if (paramInt1 != paramInt2)
        {
          n = numBitsDiffering(paramInt2, n);
          if (n < j)
          {
            m = arrayOfInt1[i1];
            j = n;
          }
        }
        k += 1;
      }
      else
      {
        localFormatInformation = new com/google/zxing/qrcode/decoder/FormatInformation;
        paramInt2 = arrayOfInt1[i1];
        localFormatInformation.<init>(paramInt2);
        return localFormatInformation;
      }
    }
    paramInt1 = 3;
    if (j <= paramInt1)
    {
      localFormatInformation = new com/google/zxing/qrcode/decoder/FormatInformation;
      localFormatInformation.<init>(m);
      return localFormatInformation;
    }
    return null;
  }
  
  public static int numBitsDiffering(int paramInt1, int paramInt2)
  {
    return Integer.bitCount(paramInt1 ^ paramInt2);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof FormatInformation;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (FormatInformation)paramObject;
    ErrorCorrectionLevel localErrorCorrectionLevel1 = this.errorCorrectionLevel;
    ErrorCorrectionLevel localErrorCorrectionLevel2 = paramObject.errorCorrectionLevel;
    if (localErrorCorrectionLevel1 == localErrorCorrectionLevel2)
    {
      int i = this.dataMask;
      int j = paramObject.dataMask;
      if (i == j) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public byte getDataMask()
  {
    return this.dataMask;
  }
  
  public ErrorCorrectionLevel getErrorCorrectionLevel()
  {
    return this.errorCorrectionLevel;
  }
  
  public int hashCode()
  {
    int i = this.errorCorrectionLevel.ordinal() << 3;
    int j = this.dataMask;
    return i | j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.FormatInformation
 * JD-Core Version:    0.7.0.1
 */