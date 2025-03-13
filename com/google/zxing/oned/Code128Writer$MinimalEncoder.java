package com.google.zxing.oned;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import m54207b69;

final class Code128Writer$MinimalEncoder
{
  static final String A = "";
  static final String B = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ÿ";
  private static final int CODE_SHIFT = 98;
  private int[][] memoizedCost;
  private Code128Writer.MinimalEncoder.Latch[][] minPath;
  
  private static void addPattern(Collection paramCollection, int paramInt1, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt2)
  {
    int[] arrayOfInt = Code128Reader.CODE_PATTERNS[paramInt1];
    paramCollection.add(arrayOfInt);
    paramCollection = null;
    if (paramInt2 != 0)
    {
      paramInt2 = paramArrayOfInt2[0] + 1;
      paramArrayOfInt2[0] = paramInt2;
    }
    paramInt2 = paramArrayOfInt1[0];
    int i = paramArrayOfInt2[0];
    paramInt1 *= i;
    paramInt2 += paramInt1;
    paramArrayOfInt1[0] = paramInt2;
  }
  
  private boolean canEncode(CharSequence paramCharSequence, Code128Writer.MinimalEncoder.Charset paramCharset, int paramInt)
  {
    int i = paramCharSequence.charAt(paramInt);
    int[] arrayOfInt = Code128Writer.1.$SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset;
    int j = paramCharset.ordinal();
    j = arrayOfInt[j];
    int k = 244;
    int m = 243;
    int n = 242;
    int i1 = 241;
    boolean bool2 = false;
    int i2 = 1;
    int i4;
    if (j != i2)
    {
      int i3 = 2;
      if (j != i3)
      {
        k = 3;
        if (j != k) {
          return false;
        }
        if (i != i1)
        {
          paramInt += i2;
          j = paramCharSequence.length();
          if (paramInt < j)
          {
            boolean bool1 = isDigit(i);
            if (bool1)
            {
              boolean bool3 = isDigit(paramCharSequence.charAt(paramInt));
              if (!bool3) {}
            }
          }
        }
        else
        {
          bool2 = i2;
        }
        return bool2;
      }
      if ((i != i1) && (i != n) && (i != m) && (i != k))
      {
        paramCharSequence = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ÿ";
        i4 = paramCharSequence.indexOf(i);
        if (i4 < 0) {}
      }
      else
      {
        bool2 = i2;
      }
      return bool2;
    }
    if ((i != i1) && (i != n) && (i != m) && (i != k))
    {
      paramCharSequence = "";
      i4 = paramCharSequence.indexOf(i);
      if (i4 < 0) {}
    }
    else
    {
      bool2 = i2;
    }
    return bool2;
  }
  
  private int encode(CharSequence paramCharSequence, Code128Writer.MinimalEncoder.Charset paramCharset, int paramInt)
  {
    Object localObject1 = this.memoizedCost;
    int i = paramCharset.ordinal();
    localObject1 = localObject1[i];
    int j = localObject1[paramInt];
    if (j > 0) {
      return j;
    }
    localObject1 = Code128Writer.MinimalEncoder.Latch.NONE;
    i = paramInt + 1;
    int k = paramCharSequence.length();
    int m = 0;
    int n = 1;
    Code128Writer.MinimalEncoder.Latch localLatch;
    if (i >= k)
    {
      k = n;
    }
    else
    {
      k = 0;
      localLatch = null;
    }
    Object localObject2 = Code128Writer.MinimalEncoder.Charset.A;
    Code128Writer.MinimalEncoder.Charset localCharset1 = Code128Writer.MinimalEncoder.Charset.B;
    localObject2 = new Code128Writer.MinimalEncoder.Charset[] { localObject2, localCharset1 };
    int i1 = -1 >>> 1;
    int i2 = i1;
    int i3;
    int i4;
    for (;;)
    {
      i3 = 2;
      float f = 2.802597E-045F;
      if (m > n) {
        break;
      }
      Object localObject3 = localObject2[m];
      boolean bool2 = canEncode(paramCharSequence, (Code128Writer.MinimalEncoder.Charset)localObject3, paramInt);
      if (bool2)
      {
        localObject3 = Code128Writer.MinimalEncoder.Latch.NONE;
        Object localObject4 = localObject2[m];
        int i5;
        if (paramCharset != localObject4)
        {
          localObject3 = Code128Writer.MinimalEncoder.Latch.valueOf(localObject4.toString());
          i5 = i3;
        }
        else
        {
          i5 = n;
        }
        if (k == 0)
        {
          Code128Writer.MinimalEncoder.Charset localCharset2 = localObject2[m];
          int i6 = encode(paramCharSequence, localCharset2, i);
          i5 += i6;
        }
        if (i5 < i2)
        {
          localObject1 = localObject3;
          i2 = i5;
        }
        i4 = (m + 1) % i3;
        localObject3 = localObject2[i4];
        if (paramCharset == localObject3)
        {
          localObject3 = Code128Writer.MinimalEncoder.Latch.SHIFT;
          if (k == 0)
          {
            i5 = encode(paramCharSequence, paramCharset, i);
            i3 += i5;
          }
          if (i3 < i2)
          {
            i2 = i3;
            localObject1 = localObject3;
          }
        }
      }
      m += 1;
    }
    Object localObject5 = Code128Writer.MinimalEncoder.Charset.C;
    boolean bool1 = canEncode(paramCharSequence, (Code128Writer.MinimalEncoder.Charset)localObject5, paramInt);
    if (bool1)
    {
      localLatch = Code128Writer.MinimalEncoder.Latch.NONE;
      if (paramCharset != localObject5)
      {
        localLatch = Code128Writer.MinimalEncoder.Latch.C;
        m = i3;
      }
      else
      {
        m = n;
      }
      int i7 = paramCharSequence.charAt(paramInt);
      i4 = 241;
      if (i7 != i4) {
        n = i3;
      }
      n += paramInt;
      i7 = paramCharSequence.length();
      if (n < i7)
      {
        i = encode(paramCharSequence, (Code128Writer.MinimalEncoder.Charset)localObject5, n);
        m += i;
      }
      if (m < i2)
      {
        localObject1 = localLatch;
        i2 = m;
      }
    }
    if (i2 != i1)
    {
      paramCharSequence = this.memoizedCost;
      i = paramCharset.ordinal();
      paramCharSequence[i][paramInt] = i2;
      paramCharSequence = this.minPath;
      int i8 = paramCharset.ordinal();
      paramCharSequence[i8][paramInt] = localObject1;
      return i2;
    }
    paramCharset = new java/lang/IllegalArgumentException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject5 = m54207b69.F54207b69_11("fU173533783A423A2E3C3F2B3B33824A4A854D4D383436858C2C1F3037389241535941528B");
    ((StringBuilder)localObject1).append((String)localObject5);
    int i9 = paramCharSequence.charAt(paramInt);
    ((StringBuilder)localObject1).append(i9);
    paramCharSequence = ((StringBuilder)localObject1).toString();
    paramCharset.<init>(paramCharSequence);
    throw paramCharset;
  }
  
  private boolean[] encode(String paramString)
  {
    int i = paramString.length();
    int j = 4;
    Object localObject1 = { j, i };
    localObject1 = (int[][])Array.newInstance(Integer.TYPE, (int[])localObject1);
    this.memoizedCost = ((int[][])localObject1);
    i = paramString.length();
    localObject1 = new int[] { j, i };
    localObject1 = (Code128Writer.MinimalEncoder.Latch[][])Array.newInstance(Code128Writer.MinimalEncoder.Latch.class, (int[])localObject1);
    this.minPath = ((Code128Writer.MinimalEncoder.Latch[][])localObject1);
    localObject1 = Code128Writer.MinimalEncoder.Charset.NONE;
    encode(paramString, (Code128Writer.MinimalEncoder.Charset)localObject1, 0);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int[] arrayOfInt1 = { 0 };
    int k = 1;
    int[] arrayOfInt2 = { k };
    int m = paramString.length();
    int n = 0;
    while (n < m)
    {
      Object localObject2 = this.minPath;
      int i1 = ((Enum)localObject1).ordinal();
      localObject2 = localObject2[i1][n];
      Object localObject3 = Code128Writer.1.$SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch;
      int i2 = ((Enum)localObject2).ordinal();
      i1 = localObject3[i2];
      i2 = 100;
      int i3 = 101;
      float f1 = 1.415311E-043F;
      if (i1 != k)
      {
        i4 = 2;
        f2 = 2.802597E-045F;
        if (i1 != i4)
        {
          i4 = 3;
          f2 = 4.203895E-045F;
          if (i1 != i4)
          {
            if (i1 != j) {
              break label324;
            }
            i1 = 98;
          }
          else
          {
            localObject1 = Code128Writer.MinimalEncoder.Charset.C;
            if (n == 0) {
              i1 = 105;
            } else {
              i1 = 99;
            }
          }
        }
        else
        {
          localObject1 = Code128Writer.MinimalEncoder.Charset.B;
          if (n == 0) {
            i1 = 104;
          } else {
            i1 = i2;
          }
        }
      }
      else
      {
        localObject1 = Code128Writer.MinimalEncoder.Charset.A;
        if (n == 0) {
          i1 = 103;
        } else {
          i1 = i3;
        }
      }
      addPattern(localArrayList, i1, arrayOfInt1, arrayOfInt2, n);
      label324:
      localObject3 = Code128Writer.MinimalEncoder.Charset.C;
      int i4 = 102;
      float f2 = 1.429324E-043F;
      if (localObject1 == localObject3)
      {
        int i5 = paramString.charAt(n);
        i1 = 241;
        if (i5 == i1)
        {
          addPattern(localArrayList, i4, arrayOfInt1, arrayOfInt2, n);
        }
        else
        {
          i5 = n + 2;
          localObject2 = paramString.substring(n, i5);
          i5 = Integer.parseInt((String)localObject2);
          addPattern(localArrayList, i5, arrayOfInt1, arrayOfInt2, n);
          i5 = n + 1;
          if (i5 < m) {
            n = i5;
          }
        }
      }
      else
      {
        i1 = paramString.charAt(n);
        switch (i1)
        {
        default: 
          i1 = paramString.charAt(n);
          i2 = i1 + -32;
          break;
        case 244: 
          localObject3 = Code128Writer.MinimalEncoder.Charset.A;
          if (localObject1 == localObject3)
          {
            localObject3 = Code128Writer.MinimalEncoder.Latch.SHIFT;
            if (localObject2 != localObject3) {}
          }
          else
          {
            localObject3 = Code128Writer.MinimalEncoder.Charset.B;
            if (localObject1 != localObject3) {
              break;
            }
            localObject3 = Code128Writer.MinimalEncoder.Latch.SHIFT;
            if (localObject2 != localObject3) {
              break;
            }
          }
          i2 = i3;
          break;
        case 243: 
          i2 = 96;
          break;
        case 242: 
          i2 = 97;
          break;
        case 241: 
          i2 = i4;
        }
        localObject3 = Code128Writer.MinimalEncoder.Charset.A;
        if (localObject1 == localObject3)
        {
          localObject3 = Code128Writer.MinimalEncoder.Latch.SHIFT;
          if (localObject2 != localObject3) {}
        }
        else
        {
          localObject3 = Code128Writer.MinimalEncoder.Charset.B;
          if (localObject1 != localObject3) {
            break label627;
          }
          localObject3 = Code128Writer.MinimalEncoder.Latch.SHIFT;
          if (localObject2 != localObject3) {
            break label627;
          }
        }
        if (i2 < 0) {
          i2 += 96;
        }
        label627:
        addPattern(localArrayList, i2, arrayOfInt1, arrayOfInt2, n);
      }
      n += k;
    }
    this.memoizedCost = null;
    this.minPath = null;
    int i6 = arrayOfInt1[0];
    return Code128Writer.produceResult(localArrayList, i6);
  }
  
  private static boolean isDigit(char paramChar)
  {
    char c = '0';
    if (paramChar >= c)
    {
      c = '9';
      if (paramChar <= c) {
        return '\001';
      }
    }
    paramChar = '\000';
    return paramChar;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.Code128Writer.MinimalEncoder
 * JD-Core Version:    0.7.0.1
 */