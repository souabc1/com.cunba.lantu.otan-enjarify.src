package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

final class BitMatrixParser
{
  private final BitMatrix bitMatrix;
  private boolean mirror;
  private FormatInformation parsedFormatInfo;
  private Version parsedVersion;
  
  public BitMatrixParser(BitMatrix paramBitMatrix)
  {
    int i = paramBitMatrix.getHeight();
    int j = 21;
    if (i >= j)
    {
      i &= 0x3;
      j = 1;
      if (i == j)
      {
        this.bitMatrix = paramBitMatrix;
        return;
      }
    }
    throw FormatException.getFormatInstance();
  }
  
  private int copyBit(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = this.mirror;
    BitMatrix localBitMatrix;
    if (bool)
    {
      localBitMatrix = this.bitMatrix;
      paramInt1 = localBitMatrix.get(paramInt2, paramInt1);
    }
    else
    {
      localBitMatrix = this.bitMatrix;
      paramInt1 = localBitMatrix.get(paramInt1, paramInt2);
    }
    if (paramInt1 != 0) {
      paramInt1 = paramInt3 << 1 | 0x1;
    } else {
      paramInt1 = paramInt3 << 1;
    }
    return paramInt1;
  }
  
  public void mirror()
  {
    int j;
    for (int i = 0;; i = j)
    {
      BitMatrix localBitMatrix1 = this.bitMatrix;
      j = localBitMatrix1.getWidth();
      if (i >= j) {
        break;
      }
      j = i + 1;
      int k = j;
      for (;;)
      {
        BitMatrix localBitMatrix2 = this.bitMatrix;
        int m = localBitMatrix2.getHeight();
        if (k >= m) {
          break;
        }
        localBitMatrix2 = this.bitMatrix;
        boolean bool1 = localBitMatrix2.get(i, k);
        BitMatrix localBitMatrix3 = this.bitMatrix;
        boolean bool2 = localBitMatrix3.get(k, i);
        if (bool1 != bool2)
        {
          this.bitMatrix.flip(k, i);
          localBitMatrix2 = this.bitMatrix;
          localBitMatrix2.flip(i, k);
        }
        k += 1;
      }
    }
  }
  
  public byte[] readCodewords()
  {
    BitMatrixParser localBitMatrixParser = this;
    Object localObject1 = readFormatInformation();
    Version localVersion = readVersion();
    Object localObject2 = DataMask.values();
    int i = ((FormatInformation)localObject1).getDataMask();
    localObject1 = localObject2[i];
    localObject2 = this.bitMatrix;
    int j = ((BitMatrix)localObject2).getHeight();
    Object localObject3 = this.bitMatrix;
    ((DataMask)localObject1).unmaskBitMatrix((BitMatrix)localObject3, j);
    localObject1 = localVersion.buildFunctionPattern();
    int k = localVersion.getTotalCodewords();
    localObject3 = new byte[k];
    int m = j + -1;
    int n = 1;
    int i1 = m;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    while (i1 > 0)
    {
      int i5 = 6;
      if (i1 == i5) {
        i1 += -1;
      }
      i5 = 0;
      while (i5 < j)
      {
        int i6;
        if (n != 0) {
          i6 = m - i5;
        } else {
          i6 = i5;
        }
        int i7 = 0;
        for (;;)
        {
          int i8 = 2;
          if (i7 >= i8) {
            break;
          }
          i8 = i1 - i7;
          boolean bool = ((BitMatrix)localObject1).get(i8, i6);
          if (!bool)
          {
            i3 += 1;
            i4 <<= 1;
            BitMatrix localBitMatrix = localBitMatrixParser.bitMatrix;
            int i9 = localBitMatrix.get(i8, i6);
            if (i9 != 0)
            {
              i9 = i4 | 0x1;
              i4 = i9;
            }
            int i10 = 8;
            if (i3 == i10)
            {
              i10 = i2 + 1;
              i3 = (byte)i4;
              localObject3[i2] = i3;
              i2 = i10;
              i3 = 0;
              i4 = 0;
            }
          }
          i7 += 1;
        }
        i5 += 1;
      }
      n ^= 0x1;
      i1 += -2;
    }
    i = localVersion.getTotalCodewords();
    if (i2 == i) {
      return localObject3;
    }
    throw FormatException.getFormatInstance();
  }
  
  public FormatInformation readFormatInformation()
  {
    FormatInformation localFormatInformation = this.parsedFormatInfo;
    if (localFormatInformation != null) {
      return localFormatInformation;
    }
    int i = 0;
    localFormatInformation = null;
    int j = 0;
    int k = 0;
    BitMatrix localBitMatrix = null;
    int n;
    for (;;)
    {
      m = 6;
      n = 8;
      if (j >= m) {
        break;
      }
      k = copyBit(j, n, k);
      j += 1;
    }
    j = 7;
    k = copyBit(j, n, k);
    k = copyBit(n, n, k);
    j = copyBit(n, j, k);
    k = 5;
    while (k >= 0)
    {
      j = copyBit(n, k, j);
      k += -1;
    }
    localBitMatrix = this.bitMatrix;
    k = localBitMatrix.getHeight();
    int m = k + -7;
    int i1 = k + -1;
    while (i1 >= m)
    {
      i = copyBit(n, i1, i);
      i1 += -1;
    }
    m = k + -8;
    while (m < k)
    {
      i = copyBit(m, n, i);
      m += 1;
    }
    localFormatInformation = FormatInformation.decodeFormatInformation(j, i);
    this.parsedFormatInfo = localFormatInformation;
    if (localFormatInformation != null) {
      return localFormatInformation;
    }
    throw FormatException.getFormatInstance();
  }
  
  public Version readVersion()
  {
    Object localObject = this.parsedVersion;
    if (localObject != null) {
      return localObject;
    }
    localObject = this.bitMatrix;
    int i = ((BitMatrix)localObject).getHeight();
    int j = (i + -17) / 4;
    int k = 6;
    if (j <= k) {
      return Version.getVersionForNumber(j);
    }
    j = i + -11;
    k = 5;
    int m = 0;
    int n = k;
    int i1 = 0;
    while (n >= 0)
    {
      int i2 = i + -9;
      while (i2 >= j)
      {
        i1 = copyBit(i2, n, i1);
        i2 += -1;
      }
      n += -1;
    }
    Version localVersion1 = Version.decodeVersionInformation(i1);
    if (localVersion1 != null)
    {
      i1 = localVersion1.getDimensionForVersion();
      if (i1 == i)
      {
        this.parsedVersion = localVersion1;
        return localVersion1;
      }
    }
    while (k >= 0)
    {
      n = i + -9;
      while (n >= j)
      {
        m = copyBit(k, n, m);
        n += -1;
      }
      k += -1;
    }
    Version localVersion2 = Version.decodeVersionInformation(m);
    if (localVersion2 != null)
    {
      k = localVersion2.getDimensionForVersion();
      if (k == i)
      {
        this.parsedVersion = localVersion2;
        return localVersion2;
      }
    }
    throw FormatException.getFormatInstance();
  }
  
  public void remask()
  {
    Object localObject = this.parsedFormatInfo;
    if (localObject == null) {
      return;
    }
    localObject = DataMask.values();
    int i = this.parsedFormatInfo.getDataMask();
    localObject = localObject[i];
    i = this.bitMatrix.getHeight();
    BitMatrix localBitMatrix = this.bitMatrix;
    ((DataMask)localObject).unmaskBitMatrix(localBitMatrix, i);
  }
  
  public void setMirror(boolean paramBoolean)
  {
    this.parsedVersion = null;
    this.parsedFormatInfo = null;
    this.mirror = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.BitMatrixParser
 * JD-Core Version:    0.7.0.1
 */