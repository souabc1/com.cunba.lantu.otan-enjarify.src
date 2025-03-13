package androidx.emoji2.text.flatbuffer;

public class FlexBuffers
{
  public static final ReadBuf OooO00o;
  
  static
  {
    ArrayReadWriteBuf localArrayReadWriteBuf = new androidx/emoji2/text/flatbuffer/ArrayReadWriteBuf;
    int i = 1;
    byte[] arrayOfByte = new byte[i];
    arrayOfByte[0] = 0;
    localArrayReadWriteBuf.<init>(arrayOfByte, i);
    OooO00o = localArrayReadWriteBuf;
  }
  
  public static int OooO(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    return (int)OooOO0(paramReadBuf, paramInt1, paramInt2);
  }
  
  public static int OooO0oO(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    long l1 = paramInt1;
    long l2 = OooOO0O(paramReadBuf, paramInt1, paramInt2);
    return (int)(l1 - l2);
  }
  
  public static double OooO0oo(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    int i = 4;
    if (paramInt2 != i)
    {
      i = 8;
      if (paramInt2 != i) {
        return -1.0D;
      }
      return paramReadBuf.getDouble(paramInt1);
    }
    return paramReadBuf.getFloat(paramInt1);
  }
  
  public static long OooOO0(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    int i = 1;
    int j;
    if (paramInt2 != i)
    {
      i = 2;
      if (paramInt2 != i)
      {
        i = 4;
        if (paramInt2 != i)
        {
          i = 8;
          if (paramInt2 != i) {
            return -1;
          }
          return paramReadBuf.getLong(paramInt1);
        }
        j = paramReadBuf.getInt(paramInt1);
      }
    }
    for (;;)
    {
      return j;
      j = paramReadBuf.getShort(paramInt1);
      continue;
      j = paramReadBuf.get(paramInt1);
    }
  }
  
  public static long OooOO0O(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    int i = 1;
    if (paramInt2 != i)
    {
      i = 2;
      if (paramInt2 != i)
      {
        i = 4;
        if (paramInt2 != i)
        {
          i = 8;
          if (paramInt2 != i) {
            return -1;
          }
          return paramReadBuf.getLong(paramInt1);
        }
        return FlexBuffers.Unsigned.OooO0O0(paramReadBuf.getInt(paramInt1));
      }
      return FlexBuffers.Unsigned.OooO0OO(paramReadBuf.getShort(paramInt1));
    }
    return FlexBuffers.Unsigned.OooO00o(paramReadBuf.get(paramInt1));
  }
  
  public static int OooOO0o(int paramInt)
  {
    return paramInt + -11 + 1;
  }
  
  public static boolean isTypeInline(int paramInt)
  {
    int i = 3;
    if (paramInt > i)
    {
      i = 26;
      if (paramInt != i) {
        return 0;
      }
    }
    paramInt = 1;
    return paramInt;
  }
  
  public static boolean isTypedVector(int paramInt)
  {
    int i = 11;
    if (paramInt >= i)
    {
      i = 15;
      if (paramInt <= i) {}
    }
    else
    {
      i = 36;
      if (paramInt != i) {
        break label29;
      }
    }
    return 1;
    label29:
    paramInt = 0;
    return paramInt;
  }
  
  public static boolean isTypedVectorElementType(int paramInt)
  {
    int i = 1;
    int j;
    if (paramInt >= i)
    {
      j = 4;
      if (paramInt <= j) {}
    }
    else
    {
      j = 26;
      if (paramInt != j) {
        i = 0;
      }
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers
 * JD-Core Version:    0.7.0.1
 */