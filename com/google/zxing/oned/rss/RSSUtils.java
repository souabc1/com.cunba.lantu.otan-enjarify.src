package com.google.zxing.oned.rss;

public final class RSSUtils
{
  private static int combins(int paramInt1, int paramInt2)
  {
    int i = paramInt1 - paramInt2;
    if (i > paramInt2)
    {
      int j = i;
      i = paramInt2;
      paramInt2 = j;
    }
    int k = 1;
    int m = k;
    while (paramInt1 > paramInt2)
    {
      k *= paramInt1;
      if (m <= i)
      {
        k /= m;
        m += 1;
      }
      paramInt1 += -1;
    }
    while (m <= i)
    {
      k /= m;
      m += 1;
    }
    return k;
  }
  
  public static int getRSSvalue(int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    int[] arrayOfInt = paramArrayOfInt;
    int i = paramInt;
    int j = paramArrayOfInt.length;
    int k = 0;
    int m = 0;
    while (k < j)
    {
      n = arrayOfInt[k];
      m += n;
      k += 1;
    }
    j = arrayOfInt.length;
    k = 0;
    int n = 0;
    int i1 = 0;
    for (;;)
    {
      int i2 = j + -1;
      if (k >= i2) {
        break;
      }
      int i3 = 1;
      int i4 = i3 << k;
      i1 |= i4;
      int i5 = i3;
      for (;;)
      {
        int i6 = arrayOfInt[k];
        if (i5 >= i6) {
          break;
        }
        i6 = m - i5;
        int i7 = i6 + -1;
        int i8 = j - k;
        int i9 = i8 + -2;
        i7 = combins(i7, i9);
        if ((paramBoolean) && (i1 == 0))
        {
          i10 = i8 + -1;
          i3 = i6 - i10;
          if (i3 >= i10)
          {
            i10 = combins(i6 - i8, i9);
            i7 -= i10;
          }
        }
        int i10 = i8 + -1;
        i3 = 1;
        if (i10 > i3)
        {
          i10 = i6 - i9;
          i9 = 0;
          while (i10 > i)
          {
            int i11 = i6 - i10;
            i12 = i11 + -1;
            i3 = i8 + -3;
            i12 = combins(i12, i3);
            i9 += i12;
            i10 += -1;
            arrayOfInt = paramArrayOfInt;
            i3 = 1;
          }
          i12 = i2 - k;
          i9 *= i12;
          i7 -= i9;
        }
        else if (i6 > i)
        {
          i7 += -1;
        }
        n += i7;
        i5 += 1;
        int i12 = i4 ^ 0xFFFFFFFF;
        i1 &= i12;
        i3 = 1;
        arrayOfInt = paramArrayOfInt;
      }
      m -= i5;
      k += 1;
      arrayOfInt = paramArrayOfInt;
    }
    return n;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.rss.RSSUtils
 * JD-Core Version:    0.7.0.1
 */