package androidx.collection;

class ContainerHelpers
{
  public static final int[] OooO00o = new int[0];
  public static final long[] OooO0O0 = new long[0];
  public static final Object[] OooO0OO = new Object[0];
  
  public static int OooO00o(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    paramInt1 += -1;
    int i = 0;
    while (i <= paramInt1)
    {
      int j = i + paramInt1 >>> 1;
      int k = paramArrayOfInt[j];
      if (k < paramInt2)
      {
        j += 1;
        i = j;
      }
      else if (k > paramInt2)
      {
        j += -1;
        paramInt1 = j;
      }
      else
      {
        return j;
      }
    }
    return i ^ 0xFFFFFFFF;
  }
  
  public static int OooO0O0(long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    paramInt += -1;
    int i = 0;
    while (i <= paramInt)
    {
      int j = i + paramInt >>> 1;
      long l = paramArrayOfLong[j];
      boolean bool = l < paramLong;
      if (bool)
      {
        j += 1;
        i = j;
      }
      else if (bool)
      {
        j += -1;
        paramInt = j;
      }
      else
      {
        return j;
      }
    }
    return i ^ 0xFFFFFFFF;
  }
  
  public static boolean OooO0OO(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != paramObject2) {
      if (paramObject1 != null)
      {
        bool = paramObject1.equals(paramObject2);
        if (bool) {}
      }
      else
      {
        bool = false;
        paramObject1 = null;
        return bool;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public static int OooO0Oo(int paramInt)
  {
    int i = 4;
    for (;;)
    {
      int j = 32;
      if (i >= j) {
        break;
      }
      j = (1 << i) + -12;
      if (paramInt <= j) {
        return j;
      }
      i += 1;
    }
    return paramInt;
  }
  
  public static int OooO0o(int paramInt)
  {
    return OooO0Oo(paramInt * 8) / 8;
  }
  
  public static int OooO0o0(int paramInt)
  {
    return OooO0Oo(paramInt * 4) / 4;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.ContainerHelpers
 * JD-Core Version:    0.7.0.1
 */