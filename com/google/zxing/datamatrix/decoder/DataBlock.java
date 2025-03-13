package com.google.zxing.datamatrix.decoder;

final class DataBlock
{
  private final byte[] codewords;
  private final int numDataCodewords;
  
  private DataBlock(int paramInt, byte[] paramArrayOfByte)
  {
    this.numDataCodewords = paramInt;
    this.codewords = paramArrayOfByte;
  }
  
  public static DataBlock[] getDataBlocks(byte[] paramArrayOfByte, Version paramVersion)
  {
    Object localObject1 = paramVersion.getECBlocks();
    Object localObject2 = ((Version.ECBlocks)localObject1).getECBlocks();
    int i = localObject2.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      localObject3 = localObject2[j];
      m = localObject3.getCount();
      k += m;
      j += 1;
    }
    DataBlock[] arrayOfDataBlock = new DataBlock[k];
    j = localObject2.length;
    k = 0;
    int m = 0;
    Object localObject3 = null;
    int n;
    byte[] arrayOfByte2;
    int i1;
    while (k < j)
    {
      arrayOfByte1 = localObject2[k];
      n = 0;
      arrayOfByte2 = null;
      for (;;)
      {
        i1 = arrayOfByte1.getCount();
        if (n >= i1) {
          break;
        }
        i1 = arrayOfByte1.getDataCodewords();
        int i2 = ((Version.ECBlocks)localObject1).getECCodewords() + i1;
        int i3 = m + 1;
        DataBlock localDataBlock = new com/google/zxing/datamatrix/decoder/DataBlock;
        byte[] arrayOfByte3 = new byte[i2];
        localDataBlock.<init>(i1, arrayOfByte3);
        arrayOfDataBlock[m] = localDataBlock;
        n += 1;
        m = i3;
      }
      k += 1;
    }
    localObject2 = arrayOfDataBlock[0].codewords;
    int i4 = localObject2.length;
    int i5 = ((Version.ECBlocks)localObject1).getECCodewords();
    i4 -= i5;
    i5 = i4 + -1;
    j = 0;
    k = 0;
    while (j < i5)
    {
      i6 = 0;
      arrayOfByte1 = null;
      while (i6 < m)
      {
        arrayOfByte2 = arrayOfDataBlock[i6].codewords;
        i1 = k + 1;
        k = paramArrayOfByte[k];
        arrayOfByte2[j] = k;
        i6 += 1;
        k = i1;
      }
      j += 1;
    }
    int i7 = paramVersion.getVersionNumber();
    j = 24;
    if (i7 == j)
    {
      i7 = 1;
    }
    else
    {
      i7 = 0;
      paramVersion = null;
    }
    if (i7 != 0) {
      j = 8;
    } else {
      j = m;
    }
    int i6 = 0;
    byte[] arrayOfByte1 = null;
    while (i6 < j)
    {
      arrayOfByte2 = arrayOfDataBlock[i6].codewords;
      i1 = k + 1;
      k = paramArrayOfByte[k];
      arrayOfByte2[i5] = k;
      i6 += 1;
      k = i1;
    }
    localObject1 = arrayOfDataBlock[0].codewords;
    i5 = localObject1.length;
    while (i4 < i5)
    {
      j = 0;
      while (j < m)
      {
        if (i7 != 0) {
          i6 = (j + 8) % m;
        } else {
          i6 = j;
        }
        if (i7 != 0)
        {
          n = 7;
          if (i6 > n)
          {
            n = i4 + -1;
            break label467;
          }
        }
        n = i4;
        label467:
        arrayOfByte1 = arrayOfDataBlock[i6].codewords;
        i1 = k + 1;
        k = paramArrayOfByte[k];
        arrayOfByte1[n] = k;
        j += 1;
        k = i1;
      }
      i4 += 1;
    }
    int i8 = paramArrayOfByte.length;
    if (k == i8) {
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
 * Qualified Name:     com.google.zxing.datamatrix.decoder.DataBlock
 * JD-Core Version:    0.7.0.1
 */