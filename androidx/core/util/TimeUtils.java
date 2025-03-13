package androidx.core.util;

import java.io.PrintWriter;

public final class TimeUtils
{
  public static final Object OooO00o;
  public static char[] OooO0O0 = new char[24];
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO00o = localObject;
  }
  
  public static int OooO00o(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    int i = 99;
    int j = 3;
    if ((paramInt1 <= i) && ((!paramBoolean) || (paramInt3 < j)))
    {
      i = 9;
      j = 2;
      if ((paramInt1 <= i) && ((!paramBoolean) || (paramInt3 < j)))
      {
        if ((!paramBoolean) && (paramInt1 <= 0)) {
          return 0;
        }
        return paramInt2 + 1;
      }
      return paramInt2 + j;
    }
    return paramInt2 + j;
  }
  
  public static void OooO0O0(long paramLong1, long paramLong2, PrintWriter paramPrintWriter)
  {
    long l = 0L;
    boolean bool = paramLong1 < l;
    if (!bool)
    {
      paramPrintWriter.print("--");
      return;
    }
    OooO0Oo(paramLong1 - paramLong2, paramPrintWriter, 0);
  }
  
  public static void OooO0OO(long paramLong, PrintWriter paramPrintWriter)
  {
    OooO0Oo(paramLong, paramPrintWriter, 0);
  }
  
  public static void OooO0Oo(long paramLong, PrintWriter paramPrintWriter, int paramInt)
  {
    synchronized (OooO00o)
    {
      int i = OooO0o(paramLong, paramInt);
      String str = new java/lang/String;
      char[] arrayOfChar = OooO0O0;
      str.<init>(arrayOfChar, 0, i);
      paramPrintWriter.print(str);
      return;
    }
  }
  
  public static int OooO0o(long paramLong, int paramInt)
  {
    long l1 = paramLong;
    int i = paramInt;
    char[] arrayOfChar = OooO0O0;
    int j = arrayOfChar.length;
    if (j < paramInt)
    {
      arrayOfChar = new char[paramInt];
      OooO0O0 = arrayOfChar;
    }
    arrayOfChar = OooO0O0;
    long l2 = 0L;
    boolean bool1 = l1 < l2;
    int m = 32;
    int n = 1;
    int i1 = 0;
    if (!bool1)
    {
      i2 = i + -1;
      while (i2 > 0) {
        arrayOfChar[0] = m;
      }
      arrayOfChar[0] = '0';
      return n;
    }
    int k;
    if (bool1)
    {
      k = 43;
    }
    else
    {
      l1 = -l1;
      k = 45;
    }
    long l3 = 1000L;
    long l4 = l1 % l3;
    int i3 = (int)l4;
    l1 /= l3;
    double d = Math.floor(l1);
    int i2 = (int)d;
    int i4 = 86400;
    if (i2 > i4)
    {
      int i8 = i2 / i4;
      int i5;
      i4 *= i8;
      i2 -= i5;
    }
    else
    {
      c = '\000';
    }
    int i6 = 3600;
    int i7;
    if (i2 > i6)
    {
      i7 = i2 / 3600;
      int i9 = i7 * 3600;
      i2 -= i9;
    }
    else
    {
      i7 = 0;
    }
    int i10 = 60;
    int i12;
    int i16;
    if (i2 > i10)
    {
      i11 = i2 / 60;
      i12 = i11 * 60;
      i16 = i2 - i12;
      i2 = i11;
    }
    else
    {
      i16 = i2;
      i2 = 0;
    }
    int i17 = 3;
    int i18 = 2;
    if (i != 0)
    {
      i11 = OooO00o(c, n, false, 0);
      boolean bool2;
      if (i11 > 0) {
        i12 = n;
      } else {
        bool2 = false;
      }
      int i13 = OooO00o(i7, n, bool2, i18);
      i11 += i13;
      if (i11 > 0) {
        i13 = n;
      } else {
        i13 = 0;
      }
      int i14 = OooO00o(i2, n, i13, i18);
      i11 += i14;
      if (i11 > 0) {
        i14 = n;
      } else {
        i14 = 0;
      }
      i15 = OooO00o(i16, n, i14, i18);
      i11 += i15;
      if (i11 > 0) {
        i15 = i17;
      } else {
        i15 = 0;
      }
      i15 = OooO00o(i3, i18, n, i15) + n;
      i11 += i15;
      i15 = 0;
      while (i11 < i)
      {
        arrayOfChar[i15] = m;
        i15 += 1;
        i11 += 1;
      }
    }
    int i15 = 0;
    arrayOfChar[i15] = k;
    int i19 = i15 + 1;
    if (i != 0) {
      i = n;
    } else {
      i = 0;
    }
    i15 = 0;
    m = c;
    char c = 'd';
    int i11 = i19;
    i1 = i19;
    i19 = 0;
    i11 = OooO0oO(arrayOfChar, m, c, i11, false, 0);
    c = 'h';
    if (i11 != i1) {
      i15 = n;
    } else {
      i15 = 0;
    }
    if (i != 0) {
      i19 = i18;
    } else {
      i19 = 0;
    }
    m = i7;
    i11 = OooO0oO(arrayOfChar, i7, c, i11, i15, i19);
    c = 'm';
    if (i11 != i1) {
      i15 = n;
    } else {
      bool3 = false;
    }
    if (i != 0) {
      i19 = i18;
    } else {
      i19 = 0;
    }
    m = i2;
    i11 = OooO0oO(arrayOfChar, i2, c, i11, bool3, i19);
    c = 's';
    if (i11 != i1) {
      bool3 = n;
    } else {
      bool3 = false;
    }
    if (i != 0) {
      i19 = i18;
    } else {
      i19 = 0;
    }
    m = i16;
    i11 = OooO0oO(arrayOfChar, i16, c, i11, bool3, i19);
    c = 'm';
    boolean bool3 = true;
    if ((i != 0) && (i11 != i1)) {
      i19 = i17;
    } else {
      i19 = 0;
    }
    m = i3;
    i2 = OooO0oO(arrayOfChar, i3, c, i11, bool3, i19);
    arrayOfChar[i2] = 's';
    return i2 + n;
  }
  
  public static void OooO0o0(long paramLong, StringBuilder paramStringBuilder)
  {
    synchronized (OooO00o)
    {
      int i = OooO0o(paramLong, 0);
      char[] arrayOfChar = OooO0O0;
      paramStringBuilder.append(arrayOfChar, 0, i);
      return;
    }
  }
  
  public static int OooO0oO(char[] paramArrayOfChar, int paramInt1, char paramChar, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    if ((paramBoolean) || (paramInt1 > 0))
    {
      if (paramBoolean)
      {
        i = 3;
        if (paramInt3 >= i) {}
      }
      else
      {
        i = 99;
        if (paramInt1 <= i) {
          break label73;
        }
      }
      int i = paramInt1 / 100;
      int j = (char)(i + 48);
      paramArrayOfChar[paramInt2] = j;
      j = paramInt2 + 1;
      i *= 100;
      paramInt1 -= i;
      break label76;
      label73:
      j = paramInt2;
      label76:
      if (paramBoolean)
      {
        paramBoolean = true;
        if (paramInt3 >= paramBoolean) {}
      }
      else
      {
        paramBoolean = true;
        if ((paramInt1 <= paramBoolean) && (paramInt2 == j)) {
          break label140;
        }
      }
      paramInt2 = paramInt1 / 10;
      paramBoolean = (char)(paramInt2 + 48);
      paramArrayOfChar[j] = paramBoolean;
      j += 1;
      paramInt2 *= 10;
      paramInt1 -= paramInt2;
      label140:
      paramInt1 = (char)(paramInt1 + 48);
      paramArrayOfChar[j] = paramInt1;
      j += 1;
      paramArrayOfChar[j] = paramChar;
      paramInt2 = j + 1;
    }
    return paramInt2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.util.TimeUtils
 * JD-Core Version:    0.7.0.1
 */