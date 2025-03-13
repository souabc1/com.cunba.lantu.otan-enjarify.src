package com.google.zxing.qrcode.decoder;

final class DataBlock
{
  private final byte[] codewords;
  private final int numDataCodewords;
  
  private DataBlock(int paramInt, byte[] paramArrayOfByte)
  {
    this.numDataCodewords = paramInt;
    this.codewords = paramArrayOfByte;
  }
  
  public static DataBlock[] getDataBlocks(byte[] paramArrayOfByte, Version paramVersion, ErrorCorrectionLevel paramErrorCorrectionLevel)
  {
    int i = paramArrayOfByte.length;
    int j = paramVersion.getTotalCodewords();
    if (i == j)
    {
      paramVersion = paramVersion.getECBlocksForLevel(paramErrorCorrectionLevel);
      paramErrorCorrectionLevel = paramVersion.getECBlocks();
      i = paramErrorCorrectionLevel.length;
      j = 0;
      int k = 0;
      byte[] arrayOfByte1 = null;
      int m = 0;
      while (k < i)
      {
        arrayOfByte2 = paramErrorCorrectionLevel[k];
        n = arrayOfByte2.getCount();
        m += n;
        k += 1;
      }
      DataBlock[] arrayOfDataBlock = new DataBlock[m];
      k = paramErrorCorrectionLevel.length;
      int n = 0;
      byte[] arrayOfByte2 = null;
      int i1 = 0;
      byte[] arrayOfByte3;
      int i2;
      byte[] arrayOfByte4;
      int i3;
      while (n < k)
      {
        arrayOfByte3 = paramErrorCorrectionLevel[n];
        i2 = 0;
        arrayOfByte4 = null;
        for (;;)
        {
          i3 = arrayOfByte3.getCount();
          if (i2 >= i3) {
            break;
          }
          i3 = arrayOfByte3.getDataCodewords();
          int i4 = paramVersion.getECCodewordsPerBlock() + i3;
          int i5 = i1 + 1;
          DataBlock localDataBlock = new com/google/zxing/qrcode/decoder/DataBlock;
          byte[] arrayOfByte5 = new byte[i4];
          localDataBlock.<init>(i3, arrayOfByte5);
          arrayOfDataBlock[i1] = localDataBlock;
          i2 += 1;
          i1 = i5;
        }
        n += 1;
      }
      paramErrorCorrectionLevel = arrayOfDataBlock[0].codewords;
      int i6 = paramErrorCorrectionLevel.length;
      m += -1;
      while (m >= 0)
      {
        arrayOfByte1 = arrayOfDataBlock[m].codewords;
        k = arrayOfByte1.length;
        if (k == i6) {
          break;
        }
        m += -1;
      }
      m += 1;
      int i7 = paramVersion.getECCodewordsPerBlock();
      i6 -= i7;
      i7 = 0;
      paramVersion = null;
      k = 0;
      arrayOfByte1 = null;
      while (i7 < i6)
      {
        n = 0;
        arrayOfByte2 = null;
        while (n < i1)
        {
          arrayOfByte3 = arrayOfDataBlock[n].codewords;
          i2 = k + 1;
          k = paramArrayOfByte[k];
          arrayOfByte3[i7] = k;
          n += 1;
          k = i2;
        }
        i7 += 1;
      }
      i7 = m;
      int i8;
      while (i7 < i1)
      {
        arrayOfByte2 = arrayOfDataBlock[i7].codewords;
        i8 = k + 1;
        k = paramArrayOfByte[k];
        arrayOfByte2[i6] = k;
        i7 += 1;
        k = i8;
      }
      paramVersion = arrayOfDataBlock[0].codewords;
      i7 = paramVersion.length;
      while (i6 < i7)
      {
        n = 0;
        arrayOfByte2 = null;
        while (n < i1)
        {
          if (n < m) {
            i8 = i6;
          } else {
            i8 = i6 + 1;
          }
          arrayOfByte4 = arrayOfDataBlock[n].codewords;
          i3 = k + 1;
          k = paramArrayOfByte[k];
          arrayOfByte4[i8] = k;
          n += 1;
          k = i3;
        }
        i6 += 1;
      }
      return arrayOfDataBlock;
    }
    paramArrayOfByte = new java/lang/IllegalArgumentException;
    paramArrayOfByte.<init>();
    throw paramArrayOfByte;
  }
  
  public byte[] getCodewords()
  {
    return this.codewords;
  }
  
  public int getNumDataCodewords()
  {
    return this.numDataCodewords;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.DataBlock
 * JD-Core Version:    0.7.0.1
 */