package androidx.collection;

public class LongSparseArray
  implements Cloneable
{
  public static final Object o00Ooo0o;
  public boolean o00OoOoo;
  public Object[] o00Ooo0;
  public long[] o00Ooo00;
  public int o00Ooo0O;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    o00Ooo0o = localObject;
  }
  
  public LongSparseArray()
  {
    this(10);
  }
  
  public LongSparseArray(int paramInt)
  {
    long[] arrayOfLong = null;
    this.o00OoOoo = false;
    Object localObject;
    if (paramInt == 0)
    {
      localObject = ContainerHelpers.OooO0O0;
      this.o00Ooo00 = ((long[])localObject);
      localObject = ContainerHelpers.OooO0OO;
      this.o00Ooo0 = ((Object[])localObject);
    }
    else
    {
      paramInt = ContainerHelpers.OooO0o(paramInt);
      arrayOfLong = new long[paramInt];
      this.o00Ooo00 = arrayOfLong;
      localObject = new Object[paramInt];
      this.o00Ooo0 = ((Object[])localObject);
    }
  }
  
  public Object OooO(long paramLong, Object paramObject)
  {
    long[] arrayOfLong = this.o00Ooo00;
    int i = this.o00Ooo0O;
    int j = ContainerHelpers.OooO0O0(arrayOfLong, i, paramLong);
    if (j >= 0)
    {
      Object localObject1 = this.o00Ooo0[j];
      Object localObject2 = o00Ooo0o;
      if (localObject1 != localObject2) {
        return localObject1;
      }
    }
    return paramObject;
  }
  
  public void OooO00o(long paramLong, Object paramObject)
  {
    int i = this.o00Ooo0O;
    if (i != 0)
    {
      localObject1 = this.o00Ooo00;
      int j = i + -1;
      long l = localObject1[j];
      bool = paramLong < l;
      if (!bool)
      {
        OooOO0o(paramLong, paramObject);
        return;
      }
    }
    boolean bool = this.o00OoOoo;
    if (bool)
    {
      localObject1 = this.o00Ooo00;
      k = localObject1.length;
      if (i >= k) {
        OooO0o();
      }
    }
    i = this.o00Ooo0O;
    Object localObject1 = this.o00Ooo00;
    int k = localObject1.length;
    if (i >= k)
    {
      k = ContainerHelpers.OooO0o(i + 1);
      long[] arrayOfLong = new long[k];
      localObject1 = new Object[k];
      Object localObject2 = this.o00Ooo00;
      int m = localObject2.length;
      System.arraycopy(localObject2, 0, arrayOfLong, 0, m);
      localObject2 = this.o00Ooo0;
      m = localObject2.length;
      System.arraycopy(localObject2, 0, localObject1, 0, m);
      this.o00Ooo00 = arrayOfLong;
      this.o00Ooo0 = ((Object[])localObject1);
    }
    this.o00Ooo00[i] = paramLong;
    this.o00Ooo0[i] = paramObject;
    i += 1;
    this.o00Ooo0O = i;
  }
  
  public void OooO0O0()
  {
    int i = this.o00Ooo0O;
    Object[] arrayOfObject = this.o00Ooo0;
    int j = 0;
    while (j < i)
    {
      arrayOfObject[j] = null;
      j += 1;
    }
    this.o00Ooo0O = 0;
    this.o00OoOoo = false;
  }
  
  public LongSparseArray OooO0OO()
  {
    try
    {
      Object localObject1 = super.clone();
      localObject1 = (LongSparseArray)localObject1;
      localObject2 = this.o00Ooo00;
      localObject2 = ((long[])localObject2).clone();
      localObject2 = (long[])localObject2;
      ((LongSparseArray)localObject1).o00Ooo00 = ((long[])localObject2);
      localObject2 = this.o00Ooo0;
      localObject2 = ((Object[])localObject2).clone();
      localObject2 = (Object[])localObject2;
      ((LongSparseArray)localObject1).o00Ooo0 = ((Object[])localObject2);
      return localObject1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      Object localObject2 = new java/lang/AssertionError;
      ((AssertionError)localObject2).<init>(localCloneNotSupportedException);
      throw ((Throwable)localObject2);
    }
  }
  
  public boolean OooO0Oo(long paramLong)
  {
    int i = OooOO0(paramLong);
    if (i >= 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public final void OooO0o()
  {
    int i = this.o00Ooo0O;
    long[] arrayOfLong = this.o00Ooo00;
    Object[] arrayOfObject = this.o00Ooo0;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Object localObject1 = arrayOfObject[j];
      Object localObject2 = o00Ooo0o;
      if (localObject1 != localObject2)
      {
        if (j != k)
        {
          long l = arrayOfLong[j];
          arrayOfLong[k] = l;
          arrayOfObject[k] = localObject1;
          localObject1 = null;
          arrayOfObject[j] = null;
        }
        k += 1;
      }
      j += 1;
    }
    this.o00OoOoo = false;
    this.o00Ooo0O = k;
  }
  
  public Object OooO0oo(long paramLong)
  {
    return OooO(paramLong, null);
  }
  
  public int OooOO0(long paramLong)
  {
    boolean bool = this.o00OoOoo;
    if (bool) {
      OooO0o();
    }
    long[] arrayOfLong = this.o00Ooo00;
    int i = this.o00Ooo0O;
    return ContainerHelpers.OooO0O0(arrayOfLong, i, paramLong);
  }
  
  public long OooOO0O(int paramInt)
  {
    boolean bool = this.o00OoOoo;
    if (bool) {
      OooO0o();
    }
    return this.o00Ooo00[paramInt];
  }
  
  public void OooOO0o(long paramLong, Object paramObject)
  {
    long[] arrayOfLong = this.o00Ooo00;
    int i = this.o00Ooo0O;
    int j = ContainerHelpers.OooO0O0(arrayOfLong, i, paramLong);
    Object[] arrayOfObject;
    if (j >= 0)
    {
      arrayOfObject = this.o00Ooo0;
      arrayOfObject[j] = paramObject;
    }
    else
    {
      j ^= 0xFFFFFFFF;
      i = this.o00Ooo0O;
      Object localObject2;
      if (j < i)
      {
        localObject1 = this.o00Ooo0;
        localObject2 = localObject1[j];
        Object localObject3 = o00Ooo0o;
        if (localObject2 == localObject3)
        {
          this.o00Ooo00[j] = paramLong;
          localObject1[j] = paramObject;
          return;
        }
      }
      boolean bool = this.o00OoOoo;
      if (bool)
      {
        localObject1 = this.o00Ooo00;
        k = localObject1.length;
        if (i >= k)
        {
          OooO0o();
          arrayOfLong = this.o00Ooo00;
          i = this.o00Ooo0O;
          j = ContainerHelpers.OooO0O0(arrayOfLong, i, paramLong) ^ 0xFFFFFFFF;
        }
      }
      i = this.o00Ooo0O;
      Object localObject1 = this.o00Ooo00;
      int k = localObject1.length;
      if (i >= k)
      {
        i = ContainerHelpers.OooO0o(i + 1);
        localObject1 = new long[i];
        localObject4 = new Object[i];
        localObject2 = this.o00Ooo00;
        int m = localObject2.length;
        System.arraycopy(localObject2, 0, localObject1, 0, m);
        localObject2 = this.o00Ooo0;
        m = localObject2.length;
        System.arraycopy(localObject2, 0, localObject4, 0, m);
        this.o00Ooo00 = ((long[])localObject1);
        this.o00Ooo0 = ((Object[])localObject4);
      }
      i = this.o00Ooo0O;
      k = i - j;
      if (k != 0)
      {
        localObject1 = this.o00Ooo00;
        int n = j + 1;
        i -= j;
        System.arraycopy(localObject1, j, localObject1, n, i);
        localObject4 = this.o00Ooo0;
        k = this.o00Ooo0O - j;
        System.arraycopy(localObject4, j, localObject4, n, k);
      }
      Object localObject4 = this.o00Ooo00;
      localObject4[j] = paramLong;
      arrayOfObject = this.o00Ooo0;
      arrayOfObject[j] = paramObject;
      int i1 = this.o00Ooo0O + 1;
      this.o00Ooo0O = i1;
    }
  }
  
  public void OooOOO(int paramInt)
  {
    Object[] arrayOfObject = this.o00Ooo0;
    Object localObject1 = arrayOfObject[paramInt];
    Object localObject2 = o00Ooo0o;
    if (localObject1 != localObject2)
    {
      arrayOfObject[paramInt] = localObject2;
      paramInt = 1;
      this.o00OoOoo = paramInt;
    }
  }
  
  public void OooOOO0(long paramLong)
  {
    long[] arrayOfLong = this.o00Ooo00;
    int i = this.o00Ooo0O;
    int j = ContainerHelpers.OooO0O0(arrayOfLong, i, paramLong);
    if (j >= 0)
    {
      Object[] arrayOfObject = this.o00Ooo0;
      arrayOfLong = arrayOfObject[j];
      Object localObject = o00Ooo0o;
      if (arrayOfLong != localObject)
      {
        arrayOfObject[j] = localObject;
        j = 1;
        this.o00OoOoo = j;
      }
    }
  }
  
  public int OooOOOO()
  {
    boolean bool = this.o00OoOoo;
    if (bool) {
      OooO0o();
    }
    return this.o00Ooo0O;
  }
  
  public Object OooOOOo(int paramInt)
  {
    boolean bool = this.o00OoOoo;
    if (bool) {
      OooO0o();
    }
    return this.o00Ooo0[paramInt];
  }
  
  public boolean isEmpty()
  {
    int i = OooOOOO();
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void setValueAt(int paramInt, Object paramObject)
  {
    boolean bool = this.o00OoOoo;
    if (bool) {
      OooO0o();
    }
    this.o00Ooo0[paramInt] = paramObject;
  }
  
  public String toString()
  {
    int i = OooOOOO();
    if (i <= 0) {
      return "{}";
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int j = this.o00Ooo0O * 28;
    localStringBuilder.<init>(j);
    localStringBuilder.append('{');
    j = 0;
    for (;;)
    {
      int k = this.o00Ooo0O;
      if (j >= k) {
        break;
      }
      if (j > 0)
      {
        localObject = ", ";
        localStringBuilder.append((String)localObject);
      }
      long l = OooOO0O(j);
      localStringBuilder.append(l);
      k = 61;
      localStringBuilder.append(k);
      Object localObject = OooOOOo(j);
      if (localObject != this)
      {
        localStringBuilder.append(localObject);
      }
      else
      {
        localObject = "(this Map)";
        localStringBuilder.append((String)localObject);
      }
      j += 1;
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.LongSparseArray
 * JD-Core Version:    0.7.0.1
 */