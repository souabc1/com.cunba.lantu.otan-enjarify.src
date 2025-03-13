package androidx.collection;

public class SparseArrayCompat
  implements Cloneable
{
  public static final Object o00Ooo0o;
  public boolean o00OoOoo;
  public Object[] o00Ooo0;
  public int[] o00Ooo00;
  public int o00Ooo0O;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    o00Ooo0o = localObject;
  }
  
  public SparseArrayCompat()
  {
    this(10);
  }
  
  public SparseArrayCompat(int paramInt)
  {
    int[] arrayOfInt = null;
    this.o00OoOoo = false;
    Object localObject;
    if (paramInt == 0)
    {
      localObject = ContainerHelpers.OooO00o;
      this.o00Ooo00 = ((int[])localObject);
      localObject = ContainerHelpers.OooO0OO;
      this.o00Ooo0 = ((Object[])localObject);
    }
    else
    {
      paramInt = ContainerHelpers.OooO0o0(paramInt);
      arrayOfInt = new int[paramInt];
      this.o00Ooo00 = arrayOfInt;
      localObject = new Object[paramInt];
      this.o00Ooo0 = ((Object[])localObject);
    }
  }
  
  public int OooO(int paramInt)
  {
    boolean bool = this.o00OoOoo;
    if (bool) {
      OooO0o();
    }
    int[] arrayOfInt = this.o00Ooo00;
    int i = this.o00Ooo0O;
    return ContainerHelpers.OooO00o(arrayOfInt, i, paramInt);
  }
  
  public void OooO00o(int paramInt, Object paramObject)
  {
    int i = this.o00Ooo0O;
    if (i != 0)
    {
      localObject1 = this.o00Ooo00;
      int j = i + -1;
      int k = localObject1[j];
      if (paramInt <= k)
      {
        OooOO0o(paramInt, paramObject);
        return;
      }
    }
    boolean bool = this.o00OoOoo;
    if (bool)
    {
      localObject1 = this.o00Ooo00;
      m = localObject1.length;
      if (i >= m) {
        OooO0o();
      }
    }
    i = this.o00Ooo0O;
    Object localObject1 = this.o00Ooo00;
    int m = localObject1.length;
    if (i >= m)
    {
      m = ContainerHelpers.OooO0o0(i + 1);
      int[] arrayOfInt = new int[m];
      localObject1 = new Object[m];
      Object localObject2 = this.o00Ooo00;
      int n = localObject2.length;
      System.arraycopy(localObject2, 0, arrayOfInt, 0, n);
      localObject2 = this.o00Ooo0;
      n = localObject2.length;
      System.arraycopy(localObject2, 0, localObject1, 0, n);
      this.o00Ooo00 = arrayOfInt;
      this.o00Ooo0 = ((Object[])localObject1);
    }
    this.o00Ooo00[i] = paramInt;
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
  
  public SparseArrayCompat OooO0OO()
  {
    try
    {
      Object localObject1 = super.clone();
      localObject1 = (SparseArrayCompat)localObject1;
      localObject2 = this.o00Ooo00;
      localObject2 = ((int[])localObject2).clone();
      localObject2 = (int[])localObject2;
      ((SparseArrayCompat)localObject1).o00Ooo00 = ((int[])localObject2);
      localObject2 = this.o00Ooo0;
      localObject2 = ((Object[])localObject2).clone();
      localObject2 = (Object[])localObject2;
      ((SparseArrayCompat)localObject1).o00Ooo0 = ((Object[])localObject2);
      return localObject1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      Object localObject2 = new java/lang/AssertionError;
      ((AssertionError)localObject2).<init>(localCloneNotSupportedException);
      throw ((Throwable)localObject2);
    }
  }
  
  public boolean OooO0Oo(Object paramObject)
  {
    int i = OooOO0(paramObject);
    if (i >= 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramObject = null;
    }
    return i;
  }
  
  public final void OooO0o()
  {
    int i = this.o00Ooo0O;
    int[] arrayOfInt = this.o00Ooo00;
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
          int m = arrayOfInt[j];
          arrayOfInt[k] = m;
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
  
  public Object OooO0oo(int paramInt, Object paramObject)
  {
    Object localObject1 = this.o00Ooo00;
    int i = this.o00Ooo0O;
    paramInt = ContainerHelpers.OooO00o((int[])localObject1, i, paramInt);
    if (paramInt >= 0)
    {
      Object localObject2 = this.o00Ooo0[paramInt];
      localObject1 = o00Ooo0o;
      if (localObject2 != localObject1) {
        return localObject2;
      }
    }
    return paramObject;
  }
  
  public int OooOO0(Object paramObject)
  {
    int i = this.o00OoOoo;
    if (i != 0) {
      OooO0o();
    }
    i = 0;
    for (;;)
    {
      int k = this.o00Ooo0O;
      if (i >= k) {
        break;
      }
      Object localObject = this.o00Ooo0[i];
      if (localObject == paramObject) {
        return i;
      }
      int j;
      i += 1;
    }
    return -1;
  }
  
  public int OooOO0O(int paramInt)
  {
    boolean bool = this.o00OoOoo;
    if (bool) {
      OooO0o();
    }
    return this.o00Ooo00[paramInt];
  }
  
  public void OooOO0o(int paramInt, Object paramObject)
  {
    int[] arrayOfInt = this.o00Ooo00;
    int i = this.o00Ooo0O;
    int j = ContainerHelpers.OooO00o(arrayOfInt, i, paramInt);
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
          this.o00Ooo00[j] = paramInt;
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
          arrayOfInt = this.o00Ooo00;
          i = this.o00Ooo0O;
          j = ContainerHelpers.OooO00o(arrayOfInt, i, paramInt) ^ 0xFFFFFFFF;
        }
      }
      i = this.o00Ooo0O;
      Object localObject1 = this.o00Ooo00;
      int k = localObject1.length;
      if (i >= k)
      {
        i = ContainerHelpers.OooO0o0(i + 1);
        localObject1 = new int[i];
        localObject4 = new Object[i];
        localObject2 = this.o00Ooo00;
        int m = localObject2.length;
        System.arraycopy(localObject2, 0, localObject1, 0, m);
        localObject2 = this.o00Ooo0;
        m = localObject2.length;
        System.arraycopy(localObject2, 0, localObject4, 0, m);
        this.o00Ooo00 = ((int[])localObject1);
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
      localObject4[j] = paramInt;
      arrayOfObject = this.o00Ooo0;
      arrayOfObject[j] = paramObject;
      paramInt = this.o00Ooo0O + 1;
      this.o00Ooo0O = paramInt;
    }
  }
  
  public Object OooOOO(int paramInt, Object paramObject)
  {
    paramInt = OooO(paramInt);
    if (paramInt >= 0)
    {
      Object[] arrayOfObject = this.o00Ooo0;
      Object localObject = arrayOfObject[paramInt];
      arrayOfObject[paramInt] = paramObject;
      return localObject;
    }
    return null;
  }
  
  public void OooOOO0(int paramInt)
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
  
  public Object get(int paramInt)
  {
    return OooO0oo(paramInt, null);
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
      k = OooOO0O(j);
      localStringBuilder.append(k);
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
 * Qualified Name:     androidx.collection.SparseArrayCompat
 * JD-Core Version:    0.7.0.1
 */