package androidx.core.text;

class BidiFormatter$DirectionalityEstimator
{
  public static final byte[] OooO0o;
  public final CharSequence OooO00o;
  public final boolean OooO0O0;
  public final int OooO0OO;
  public int OooO0Oo;
  public char OooO0o0;
  
  static
  {
    int i = 1792;
    OooO0o = new byte[i];
    int j = 0;
    while (j < i)
    {
      byte[] arrayOfByte = OooO0o;
      int k = Character.getDirectionality(j);
      arrayOfByte[j] = k;
      j += 1;
    }
  }
  
  public BidiFormatter$DirectionalityEstimator(CharSequence paramCharSequence, boolean paramBoolean)
  {
    this.OooO00o = paramCharSequence;
    this.OooO0O0 = paramBoolean;
    int i = paramCharSequence.length();
    this.OooO0OO = i;
  }
  
  public static byte OooO0OO(char paramChar)
  {
    char c = '܀';
    if (paramChar < c)
    {
      byte[] arrayOfByte = OooO0o;
      paramChar = arrayOfByte[paramChar];
    }
    else
    {
      paramChar = Character.getDirectionality(paramChar);
    }
    return paramChar;
  }
  
  public byte OooO00o()
  {
    CharSequence localCharSequence = this.OooO00o;
    int i = this.OooO0Oo + -1;
    char c = localCharSequence.charAt(i);
    this.OooO0o0 = c;
    boolean bool2 = Character.isLowSurrogate(c);
    int m;
    if (bool2)
    {
      localCharSequence = this.OooO00o;
      i = this.OooO0Oo;
      k = Character.codePointBefore(localCharSequence, i);
      i = this.OooO0Oo;
      m = Character.charCount(k);
      i -= m;
      this.OooO0Oo = i;
      return Character.getDirectionality(k);
    }
    int k = this.OooO0Oo + -1;
    this.OooO0Oo = k;
    k = OooO0OO(this.OooO0o0);
    boolean bool1 = this.OooO0O0;
    if (bool1)
    {
      int j = this.OooO0o0;
      m = 62;
      if (j == m)
      {
        k = OooO0o();
      }
      else
      {
        m = 59;
        if (j == m) {
          k = OooO0Oo();
        }
      }
    }
    return k;
  }
  
  public byte OooO0O0()
  {
    CharSequence localCharSequence = this.OooO00o;
    int i = this.OooO0Oo;
    char c = localCharSequence.charAt(i);
    this.OooO0o0 = c;
    boolean bool2 = Character.isHighSurrogate(c);
    int m;
    if (bool2)
    {
      localCharSequence = this.OooO00o;
      i = this.OooO0Oo;
      k = Character.codePointAt(localCharSequence, i);
      i = this.OooO0Oo;
      m = Character.charCount(k);
      i += m;
      this.OooO0Oo = i;
      return Character.getDirectionality(k);
    }
    int k = this.OooO0Oo + 1;
    this.OooO0Oo = k;
    k = OooO0OO(this.OooO0o0);
    boolean bool1 = this.OooO0O0;
    if (bool1)
    {
      int j = this.OooO0o0;
      m = 60;
      if (j == m)
      {
        k = OooO0oO();
      }
      else
      {
        m = 38;
        if (j == m) {
          k = OooO0o0();
        }
      }
    }
    return k;
  }
  
  public final byte OooO0Oo()
  {
    int i = this.OooO0Oo;
    int j;
    int k;
    do
    {
      j = this.OooO0Oo;
      k = 59;
      if (j <= 0) {
        break;
      }
      CharSequence localCharSequence = this.OooO00o;
      j += -1;
      this.OooO0Oo = j;
      j = localCharSequence.charAt(j);
      this.OooO0o0 = j;
      int m = 38;
      if (j == m) {
        return 12;
      }
    } while (j != k);
    this.OooO0Oo = i;
    this.OooO0o0 = k;
    return 13;
  }
  
  public final byte OooO0o()
  {
    int i = this.OooO0Oo;
    int j;
    int k;
    CharSequence localCharSequence;
    do
    {
      j = this.OooO0Oo;
      k = 62;
      if (j <= 0) {
        break label129;
      }
      localCharSequence = this.OooO00o;
      j += -1;
      this.OooO0Oo = j;
      j = localCharSequence.charAt(j);
      this.OooO0o0 = j;
      int m = 60;
      if (j == m) {
        return 12;
      }
      if (j == k) {
        break label129;
      }
      k = 34;
      if (j == k) {
        break;
      }
      k = 39;
    } while (j != k);
    for (;;)
    {
      k = this.OooO0Oo;
      if (k <= 0) {
        break;
      }
      localCharSequence = this.OooO00o;
      k += -1;
      this.OooO0Oo = k;
      k = localCharSequence.charAt(k);
      this.OooO0o0 = k;
      if (k == j) {
        break;
      }
    }
    label129:
    this.OooO0Oo = i;
    this.OooO0o0 = k;
    return 13;
  }
  
  public final byte OooO0o0()
  {
    int i;
    int j;
    do
    {
      i = this.OooO0Oo;
      j = this.OooO0OO;
      if (i >= j) {
        break;
      }
      CharSequence localCharSequence = this.OooO00o;
      int k = i + 1;
      this.OooO0Oo = k;
      i = localCharSequence.charAt(i);
      this.OooO0o0 = i;
      j = 59;
    } while (i != j);
    return 12;
  }
  
  public final byte OooO0oO()
  {
    int i = this.OooO0Oo;
    int j;
    int k;
    int m;
    do
    {
      j = this.OooO0Oo;
      k = this.OooO0OO;
      if (j >= k) {
        break label134;
      }
      CharSequence localCharSequence1 = this.OooO00o;
      m = j + 1;
      this.OooO0Oo = m;
      j = localCharSequence1.charAt(j);
      this.OooO0o0 = j;
      k = 62;
      if (j == k) {
        return 12;
      }
      k = 34;
      if (j == k) {
        break;
      }
      k = 39;
    } while (j != k);
    for (;;)
    {
      k = this.OooO0Oo;
      m = this.OooO0OO;
      if (k >= m) {
        break;
      }
      CharSequence localCharSequence2 = this.OooO00o;
      int n = k + 1;
      this.OooO0Oo = n;
      k = localCharSequence2.charAt(k);
      this.OooO0o0 = k;
      if (k == j) {
        break;
      }
    }
    label134:
    this.OooO0Oo = i;
    this.OooO0o0 = '<';
    return 13;
  }
  
  public int getEntryDir()
  {
    this.OooO0Oo = 0;
    int i = 0;
    int j = 0;
    int k = 0;
    int i1;
    int i2;
    for (;;)
    {
      int m = this.OooO0Oo;
      int n = this.OooO0OO;
      i1 = -1;
      i2 = 1;
      if ((m >= n) || (i != 0)) {
        break;
      }
      m = OooO0O0();
      if (m != 0)
      {
        if (m != i2)
        {
          n = 2;
          if (m != n)
          {
            n = 9;
            if (m == n) {
              continue;
            }
            switch (m)
            {
            default: 
              break;
            case 18: 
              k += -1;
              j = 0;
              break;
            case 16: 
            case 17: 
              k += 1;
              j = i2;
              break;
            case 14: 
            case 15: 
              k += 1;
              j = i1;
              break;
            }
          }
        }
        if (k == 0) {
          return i2;
        }
      }
      else if (k == 0)
      {
        return i1;
      }
      i = k;
    }
    if (i == 0) {
      return 0;
    }
    if (j != 0) {
      return j;
    }
    for (;;)
    {
      j = this.OooO0Oo;
      if (j <= 0) {
        break;
      }
      j = OooO00o();
      switch (j)
      {
      default: 
        break;
      case 18: 
        k += 1;
        break;
      case 16: 
      case 17: 
        if (i == k) {
          return i2;
        }
      case 14: 
      case 15: 
        if (i == k) {
          return i1;
        }
        k += -1;
      }
    }
    return 0;
  }
  
  public int getExitDir()
  {
    int i = this.OooO0OO;
    this.OooO0Oo = i;
    i = 0;
    int j = 0;
    for (;;)
    {
      int k = j;
      label159:
      do
      {
        int n;
        do
        {
          int i1;
          for (;;)
          {
            int m = this.OooO0Oo;
            if (m <= 0) {
              break label173;
            }
            m = OooO00o();
            n = -1;
            if (m == 0) {
              break label159;
            }
            i1 = 1;
            if (m == i1) {
              break;
            }
            int i2 = 2;
            if (m == i2) {
              break;
            }
            i2 = 9;
            if (m != i2) {
              switch (m)
              {
              default: 
                if (k != 0) {}
                break;
              case 18: 
                j += 1;
                break;
              case 16: 
              case 17: 
                if (k == j) {
                  return i1;
                }
              case 14: 
              case 15: 
                if (k == j) {
                  return n;
                }
                j += -1;
              }
            }
          }
          if (j == 0) {
            return i1;
          }
        } while (k != 0);
        break;
        if (j == 0) {
          return n;
        }
      } while (k != 0);
    }
    label173:
    return 0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.text.BidiFormatter.DirectionalityEstimator
 * JD-Core Version:    0.7.0.1
 */