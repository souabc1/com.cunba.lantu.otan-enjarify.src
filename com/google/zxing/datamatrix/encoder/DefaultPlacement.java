package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

public class DefaultPlacement
{
  private final byte[] bits;
  private final CharSequence codewords;
  private final int numcols;
  private final int numrows;
  
  public DefaultPlacement(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    this.codewords = paramCharSequence;
    this.numcols = paramInt1;
    this.numrows = paramInt2;
    paramCharSequence = new byte[paramInt1 * paramInt2];
    this.bits = paramCharSequence;
    Arrays.fill(paramCharSequence, (byte)-1);
  }
  
  private void corner1(int paramInt)
  {
    int i = this.numrows;
    int j = 1;
    i -= j;
    module(i, 0, paramInt, j);
    i = this.numrows - j;
    int k = 2;
    module(i, j, paramInt, k);
    i = this.numrows - j;
    int m = 3;
    module(i, k, paramInt, m);
    i = this.numcols - k;
    module(0, i, paramInt, 4);
    i = this.numcols - j;
    module(0, i, paramInt, 5);
    i = this.numcols - j;
    module(j, i, paramInt, 6);
    i = this.numcols - j;
    module(k, i, paramInt, 7);
    i = this.numcols - j;
    module(m, i, paramInt, 8);
  }
  
  private void corner2(int paramInt)
  {
    int i = this.numrows;
    int j = 3;
    i -= j;
    int k = 1;
    module(i, 0, paramInt, k);
    i = this.numrows;
    int m = 2;
    i -= m;
    module(i, 0, paramInt, m);
    i = this.numrows - k;
    module(i, 0, paramInt, j);
    i = this.numcols;
    int n = 4;
    i -= n;
    module(0, i, paramInt, n);
    i = this.numcols - j;
    module(0, i, paramInt, 5);
    i = this.numcols - m;
    module(0, i, paramInt, 6);
    i = this.numcols - k;
    module(0, i, paramInt, 7);
    i = this.numcols - k;
    module(k, i, paramInt, 8);
  }
  
  private void corner3(int paramInt)
  {
    int i = this.numrows;
    int j = 3;
    i -= j;
    int k = 1;
    module(i, 0, paramInt, k);
    i = this.numrows;
    int m = 2;
    i -= m;
    module(i, 0, paramInt, m);
    i = this.numrows - k;
    module(i, 0, paramInt, j);
    i = this.numcols - m;
    module(0, i, paramInt, 4);
    i = this.numcols - k;
    module(0, i, paramInt, 5);
    i = this.numcols - k;
    module(k, i, paramInt, 6);
    i = this.numcols - k;
    module(m, i, paramInt, 7);
    i = this.numcols - k;
    module(j, i, paramInt, 8);
  }
  
  private void corner4(int paramInt)
  {
    int i = this.numrows;
    int j = 1;
    i -= j;
    module(i, 0, paramInt, j);
    i = this.numrows - j;
    int k = this.numcols - j;
    int m = 2;
    module(i, k, paramInt, m);
    i = this.numcols;
    k = 3;
    i -= k;
    module(0, i, paramInt, k);
    i = this.numcols - m;
    module(0, i, paramInt, 4);
    i = this.numcols - j;
    module(0, i, paramInt, 5);
    i = this.numcols - k;
    module(j, i, paramInt, 6);
    i = this.numcols - m;
    module(j, i, paramInt, 7);
    i = this.numcols - j;
    module(j, i, paramInt, 8);
  }
  
  private void module(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt1 < 0)
    {
      i = this.numrows;
      paramInt1 += i;
      i = (i + 4) % 8;
      i = 4 - i;
      paramInt2 += i;
    }
    if (paramInt2 < 0)
    {
      i = this.numcols;
      paramInt2 += i;
      i = (i + 4) % 8;
      i = 4 - i;
      paramInt1 += i;
    }
    CharSequence localCharSequence = this.codewords;
    paramInt3 = localCharSequence.charAt(paramInt3);
    paramInt4 = 8 - paramInt4;
    int i = 1;
    paramInt4 = i << paramInt4;
    paramInt3 &= paramInt4;
    if (paramInt3 == 0)
    {
      i = 0;
      localCharSequence = null;
    }
    setBit(paramInt2, paramInt1, i);
  }
  
  private boolean noBit(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = this.bits;
    int i = this.numcols;
    paramInt2 = paramInt2 * i + paramInt1;
    paramInt1 = arrayOfByte[paramInt2];
    if (paramInt1 < 0) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    return paramInt1;
  }
  
  private void setBit(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    byte[] arrayOfByte = this.bits;
    int i = this.numcols;
    paramInt2 = paramInt2 * i + paramInt1;
    paramInt1 = (byte)paramBoolean;
    arrayOfByte[paramInt2] = paramInt1;
  }
  
  private void utah(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 + -2;
    int j = paramInt2 + -2;
    module(i, j, paramInt3, 1);
    int k = paramInt2 + -1;
    module(i, k, paramInt3, 2);
    i = paramInt1 + -1;
    module(i, j, paramInt3, 3);
    module(i, k, paramInt3, 4);
    module(i, paramInt2, paramInt3, 5);
    module(paramInt1, j, paramInt3, 6);
    module(paramInt1, k, paramInt3, 7);
    module(paramInt1, paramInt2, paramInt3, 8);
  }
  
  public final boolean getBit(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = this.bits;
    int i = this.numcols;
    paramInt2 = paramInt2 * i + paramInt1;
    paramInt1 = arrayOfByte[paramInt2];
    paramInt2 = 1;
    if (paramInt1 != paramInt2) {
      paramInt2 = 0;
    }
    return paramInt2;
  }
  
  public final byte[] getBits()
  {
    return this.bits;
  }
  
  public final int getNumcols()
  {
    return this.numcols;
  }
  
  public final int getNumrows()
  {
    return this.numrows;
  }
  
  public final void place()
  {
    int i = 0;
    int j = 4;
    int m = 0;
    int n = j;
    int i6;
    int i4;
    int i7;
    do
    {
      do
      {
        int i1 = this.numrows;
        if ((n == i1) && (i == 0))
        {
          i1 = m + 1;
          corner1(m);
          m = i1;
        }
        i1 = this.numrows;
        i6 = 2;
        i1 -= i6;
        if ((n == i1) && (i == 0))
        {
          i1 = this.numcols % j;
          if (i1 != 0)
          {
            i1 = m + 1;
            corner2(m);
            m = i1;
          }
        }
        i1 = this.numrows - i6;
        if ((n == i1) && (i == 0))
        {
          i1 = this.numcols % 8;
          if (i1 == j)
          {
            i1 = m + 1;
            corner3(m);
            m = i1;
          }
        }
        i1 = this.numrows + j;
        if ((n == i1) && (i == i6))
        {
          i1 = this.numcols % 8;
          if (i1 == 0)
          {
            i1 = m + 1;
            corner4(m);
            m = i1;
          }
        }
        int i2;
        do
        {
          i1 = this.numrows;
          if ((n < i1) && (i >= 0))
          {
            boolean bool2 = noBit(i, n);
            if (bool2)
            {
              i2 = m + 1;
              utah(n, i, m);
              m = i2;
            }
          }
          n += -2;
          i += 2;
          if (n < 0) {
            break;
          }
          i2 = this.numcols;
        } while (i < i2);
        n += 1;
        i += 3;
        do
        {
          if (n >= 0)
          {
            int i3 = this.numcols;
            if (i < i3)
            {
              boolean bool3 = noBit(i, n);
              if (bool3)
              {
                i4 = m + 1;
                utah(n, i, m);
                m = i4;
              }
            }
          }
          n += 2;
          i += -2;
          i4 = this.numrows;
        } while ((n < i4) && (i >= 0));
        n += 3;
        i += 1;
      } while (n < i4);
      i7 = this.numcols;
    } while (i < i7);
    i = 1;
    int i8;
    i7 -= i;
    int i5;
    i4 -= i;
    boolean bool1 = noBit(i8, i5);
    if (bool1)
    {
      int k = this.numcols - i;
      m = this.numrows - i;
      setBit(k, m, i);
      k = this.numcols - i6;
      m = this.numrows - i6;
      setBit(k, m, i);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.datamatrix.encoder.DefaultPlacement
 * JD-Core Version:    0.7.0.1
 */