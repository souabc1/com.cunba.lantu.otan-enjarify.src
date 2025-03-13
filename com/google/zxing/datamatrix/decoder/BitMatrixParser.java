package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import m54207b69;

final class BitMatrixParser
{
  private final BitMatrix mappingBitMatrix;
  private final BitMatrix readMappingMatrix;
  private final Version version;
  
  public BitMatrixParser(BitMatrix paramBitMatrix)
  {
    int i = paramBitMatrix.getHeight();
    int j = 8;
    if (i >= j)
    {
      j = 144;
      if (i <= j)
      {
        i &= 0x1;
        if (i == 0)
        {
          Object localObject = readVersion(paramBitMatrix);
          this.version = ((Version)localObject);
          paramBitMatrix = extractDataRegion(paramBitMatrix);
          this.mappingBitMatrix = paramBitMatrix;
          localObject = new com/google/zxing/common/BitMatrix;
          j = paramBitMatrix.getWidth();
          int k = paramBitMatrix.getHeight();
          ((BitMatrix)localObject).<init>(j, k);
          this.readMappingMatrix = ((BitMatrix)localObject);
          return;
        }
      }
    }
    throw FormatException.getFormatInstance();
  }
  
  private BitMatrix extractDataRegion(BitMatrix paramBitMatrix)
  {
    Object localObject1 = this.version;
    int i = ((Version)localObject1).getSymbolSizeRows();
    Object localObject2 = this.version;
    int j = ((Version)localObject2).getSymbolSizeColumns();
    int k = paramBitMatrix.getHeight();
    if (k == i)
    {
      Version localVersion1 = this.version;
      k = localVersion1.getDataRegionSizeRows();
      Version localVersion2 = this.version;
      int m = localVersion2.getDataRegionSizeColumns();
      i /= k;
      j /= m;
      int n = i * k;
      int i1 = j * m;
      BitMatrix localBitMatrix = new com/google/zxing/common/BitMatrix;
      localBitMatrix.<init>(i1, n);
      i1 = 0;
      while (i1 < i)
      {
        int i2 = i1 * k;
        int i3 = 0;
        while (i3 < j)
        {
          int i4 = i3 * m;
          int i5 = 0;
          while (i5 < k)
          {
            int i6 = (k + 2) * i1 + 1 + i5;
            int i7 = i2 + i5;
            int i8 = 0;
            while (i8 < m)
            {
              int i9 = (m + 2) * i3 + 1 + i8;
              boolean bool = paramBitMatrix.get(i9, i6);
              if (bool)
              {
                int i10 = i4 + i8;
                localBitMatrix.set(i10, i7);
              }
              i8 += 1;
            }
            i5 += 1;
          }
          i3 += 1;
        }
        i1 += 1;
      }
      return localBitMatrix;
    }
    localObject1 = new java/lang/IllegalArgumentException;
    localObject2 = m54207b69.F54207b69_11("1)6D41464F4B5F464D4F12505A15584E6C74596F6E54661F5B7473772460657B69612A7F64702E857383836A717336886F837D");
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private int readCorner1(int paramInt1, int paramInt2)
  {
    int i = paramInt1 + -1;
    boolean bool2 = false;
    boolean bool3 = readModule(i, 0, paramInt1, paramInt2);
    int i1 = 1;
    bool3 <<= i1;
    boolean bool5 = readModule(i, i1, paramInt1, paramInt2);
    if (bool5) {
      m |= 0x1;
    }
    m <<= i1;
    int i2 = 2;
    boolean bool1 = readModule(i, i2, paramInt1, paramInt2);
    if (bool1) {
      m |= 0x1;
    }
    int j = m << 1;
    int m = paramInt2 + -2;
    boolean bool4 = readModule(0, m, paramInt1, paramInt2);
    if (bool4) {
      j |= 0x1;
    }
    j <<= i1;
    int n = paramInt2 + -1;
    bool2 = readModule(0, n, paramInt1, paramInt2);
    if (bool2) {
      j |= 0x1;
    }
    j <<= i1;
    bool2 = readModule(i1, n, paramInt1, paramInt2);
    if (bool2) {
      j |= 0x1;
    }
    j <<= i1;
    bool2 = readModule(i2, n, paramInt1, paramInt2);
    if (bool2) {
      j |= 0x1;
    }
    j <<= i1;
    int k = 3;
    paramInt1 = readModule(k, n, paramInt1, paramInt2);
    if (paramInt1 != 0) {
      j |= 0x1;
    }
    return j;
  }
  
  private int readCorner2(int paramInt1, int paramInt2)
  {
    int i = paramInt1 + -3;
    boolean bool2 = false;
    boolean bool1 = readModule(i, 0, paramInt1, paramInt2);
    int k = 1;
    int j;
    bool1 <<= k;
    int m = paramInt1 + -2;
    boolean bool3 = readModule(m, 0, paramInt1, paramInt2);
    if (bool3) {
      j |= 0x1;
    }
    j <<= k;
    int n = paramInt1 + -1;
    boolean bool4 = readModule(n, 0, paramInt1, paramInt2);
    if (bool4) {
      j |= 0x1;
    }
    j <<= k;
    int i1 = paramInt2 + -4;
    boolean bool5 = readModule(0, i1, paramInt1, paramInt2);
    if (bool5) {
      j |= 0x1;
    }
    j <<= k;
    int i2 = paramInt2 + -3;
    boolean bool6 = readModule(0, i2, paramInt1, paramInt2);
    if (bool6) {
      j |= 0x1;
    }
    j <<= k;
    int i3 = paramInt2 + -2;
    boolean bool7 = readModule(0, i3, paramInt1, paramInt2);
    if (bool7) {
      j |= 0x1;
    }
    j <<= k;
    int i4 = paramInt2 + -1;
    bool2 = readModule(0, i4, paramInt1, paramInt2);
    if (bool2) {
      j |= 0x1;
    }
    j <<= k;
    paramInt1 = readModule(k, i4, paramInt1, paramInt2);
    if (paramInt1 != 0) {
      j |= 0x1;
    }
    return j;
  }
  
  private int readCorner3(int paramInt1, int paramInt2)
  {
    int i = paramInt1 + -1;
    boolean bool2 = false;
    boolean bool3 = readModule(i, 0, paramInt1, paramInt2);
    int m = 1;
    bool3 <<= m;
    int n = paramInt2 + -1;
    boolean bool1 = readModule(i, n, paramInt1, paramInt2);
    if (bool1) {
      k |= 0x1;
    }
    int j = k << 1;
    int k = paramInt2 + -3;
    boolean bool4 = readModule(0, k, paramInt1, paramInt2);
    if (bool4) {
      j |= 0x1;
    }
    j <<= m;
    int i1 = paramInt2 + -2;
    boolean bool5 = readModule(0, i1, paramInt1, paramInt2);
    if (bool5) {
      j |= 0x1;
    }
    j <<= m;
    bool2 = readModule(0, n, paramInt1, paramInt2);
    if (bool2) {
      j |= 0x1;
    }
    j <<= m;
    bool2 = readModule(m, k, paramInt1, paramInt2);
    if (bool2) {
      j |= 0x1;
    }
    j <<= m;
    bool2 = readModule(m, i1, paramInt1, paramInt2);
    if (bool2) {
      j |= 0x1;
    }
    j <<= m;
    paramInt1 = readModule(m, n, paramInt1, paramInt2);
    if (paramInt1 != 0) {
      j |= 0x1;
    }
    return j;
  }
  
  private int readCorner4(int paramInt1, int paramInt2)
  {
    int i = paramInt1 + -3;
    boolean bool2 = false;
    boolean bool1 = readModule(i, 0, paramInt1, paramInt2);
    int m = 1;
    int j;
    bool1 <<= m;
    int n = paramInt1 + -2;
    boolean bool3 = readModule(n, 0, paramInt1, paramInt2);
    if (bool3) {
      j |= 0x1;
    }
    j <<= m;
    int i1 = paramInt1 + -1;
    boolean bool4 = readModule(i1, 0, paramInt1, paramInt2);
    if (bool4) {
      j |= 0x1;
    }
    j <<= m;
    int i2 = paramInt2 + -2;
    boolean bool5 = readModule(0, i2, paramInt1, paramInt2);
    if (bool5) {
      j |= 0x1;
    }
    j <<= m;
    int i3 = paramInt2 + -1;
    bool2 = readModule(0, i3, paramInt1, paramInt2);
    if (bool2) {
      j |= 0x1;
    }
    j <<= m;
    bool2 = readModule(m, i3, paramInt1, paramInt2);
    if (bool2) {
      j |= 0x1;
    }
    j <<= m;
    bool2 = readModule(2, i3, paramInt1, paramInt2);
    if (bool2) {
      j |= 0x1;
    }
    j <<= m;
    int k = 3;
    paramInt1 = readModule(k, i3, paramInt1, paramInt2);
    if (paramInt1 != 0) {
      j |= 0x1;
    }
    return j;
  }
  
  private boolean readModule(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt1 < 0)
    {
      paramInt1 += paramInt3;
      int i = paramInt3 + 4 & 0x7;
      i = 4 - i;
      paramInt2 += i;
    }
    if (paramInt2 < 0)
    {
      paramInt2 += paramInt4;
      paramInt4 = paramInt4 + 4 & 0x7;
      paramInt4 = 4 - paramInt4;
      paramInt1 += paramInt4;
    }
    if (paramInt1 >= paramInt3) {
      paramInt1 -= paramInt3;
    }
    this.readMappingMatrix.set(paramInt2, paramInt1);
    return this.mappingBitMatrix.get(paramInt2, paramInt1);
  }
  
  private int readUtah(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt1 + -2;
    int k = paramInt2 + -2;
    int m = readModule(i, k, paramInt3, paramInt4) << true;
    int n = paramInt2 + -1;
    boolean bool1 = readModule(i, n, paramInt3, paramInt4);
    if (bool1) {
      m |= 0x1;
    }
    int j = m << 1;
    m = paramInt1 + -1;
    boolean bool4 = readModule(m, k, paramInt3, paramInt4);
    if (bool4) {
      j |= 0x1;
    }
    j <<= 1;
    bool4 = readModule(m, n, paramInt3, paramInt4);
    if (bool4) {
      j |= 0x1;
    }
    j <<= 1;
    boolean bool3 = readModule(m, paramInt2, paramInt3, paramInt4);
    if (bool3) {
      j |= 0x1;
    }
    j <<= 1;
    boolean bool2 = readModule(paramInt1, k, paramInt3, paramInt4);
    if (bool2) {
      j |= 0x1;
    }
    j <<= 1;
    bool2 = readModule(paramInt1, n, paramInt3, paramInt4);
    if (bool2) {
      j |= 0x1;
    }
    j <<= 1;
    paramInt1 = readModule(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != 0) {
      j |= 0x1;
    }
    return j;
  }
  
  private static Version readVersion(BitMatrix paramBitMatrix)
  {
    int i = paramBitMatrix.getHeight();
    int j = paramBitMatrix.getWidth();
    return Version.getVersionForDimensions(i, j);
  }
  
  public Version getVersion()
  {
    return this.version;
  }
  
  public byte[] readCodewords()
  {
    int i = this.version.getTotalCodewords();
    byte[] arrayOfByte = new byte[i];
    Object localObject = this.mappingBitMatrix;
    int j = ((BitMatrix)localObject).getHeight();
    BitMatrix localBitMatrix1 = this.mappingBitMatrix;
    int k = localBitMatrix1.getWidth();
    int m = 0;
    int n = 4;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = n;
    do
    {
      int i7 = 1;
      int i10;
      if ((i6 == j) && (m == 0) && (i1 == 0))
      {
        i1 = i2 + 1;
        i10 = (byte)readCorner1(j, k);
        arrayOfByte[i2] = i10;
        i6 += -2;
        m += 2;
        i2 = i1;
        i1 = i7;
      }
      else
      {
        i10 = j + -2;
        if ((i6 == i10) && (m == 0))
        {
          i11 = k & 0x3;
          if ((i11 != 0) && (i3 == 0))
          {
            i3 = i2 + 1;
            i10 = (byte)readCorner2(j, k);
            arrayOfByte[i2] = i10;
            i6 += -2;
            m += 2;
            i2 = i3;
            i3 = i7;
            continue;
          }
        }
        int i11 = j + 4;
        if (i6 == i11)
        {
          i11 = 2;
          if (m == i11)
          {
            i11 = k & 0x7;
            if ((i11 == 0) && (i4 == 0))
            {
              i4 = i2 + 1;
              i10 = (byte)readCorner3(j, k);
              arrayOfByte[i2] = i10;
              i6 += -2;
              m += 2;
              i2 = i4;
              i4 = i7;
              continue;
            }
          }
        }
        if ((i6 == i10) && (m == 0))
        {
          i10 = k & 0x7;
          if ((i10 == n) && (i5 == 0))
          {
            i5 = i2 + 1;
            i10 = (byte)readCorner4(j, k);
            arrayOfByte[i2] = i10;
            i6 += -2;
            m += 2;
            i2 = i5;
            i5 = i7;
            continue;
          }
        }
        BitMatrix localBitMatrix2;
        do
        {
          if ((i6 < j) && (m >= 0))
          {
            localBitMatrix2 = this.readMappingMatrix;
            i7 = localBitMatrix2.get(m, i6);
            if (i7 == 0)
            {
              int i8 = i2 + 1;
              i10 = (byte)readUtah(i6, m, j, k);
              arrayOfByte[i2] = i10;
              i2 = i8;
            }
          }
          i6 += -2;
          m += 2;
        } while ((i6 >= 0) && (m < k));
        i6 += 1;
        m += 3;
        do
        {
          if ((i6 >= 0) && (m < k))
          {
            localBitMatrix2 = this.readMappingMatrix;
            boolean bool = localBitMatrix2.get(m, i6);
            if (!bool)
            {
              int i9 = i2 + 1;
              i10 = (byte)readUtah(i6, m, j, k);
              arrayOfByte[i2] = i10;
              i2 = i9;
            }
          }
          i6 += 2;
          m += -2;
        } while ((i6 < j) && (m >= 0));
        i6 += 3;
        m += 1;
      }
    } while ((i6 < j) || (m < k));
    localObject = this.version;
    j = ((Version)localObject).getTotalCodewords();
    if (i2 == j) {
      return arrayOfByte;
    }
    throw FormatException.getFormatInstance();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.datamatrix.decoder.BitMatrixParser
 * JD-Core Version:    0.7.0.1
 */