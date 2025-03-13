package androidx.constraintlayout.core;

class Pools$SimplePool
  implements Pools.Pool
{
  public final Object[] OooO00o;
  public int OooO0O0;
  
  public Pools$SimplePool(int paramInt)
  {
    if (paramInt > 0)
    {
      localObject = new Object[paramInt];
      this.OooO00o = ((Object[])localObject);
      return;
    }
    Object localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("The max pool size must be > 0");
    throw ((Throwable)localObject);
  }
  
  public boolean OooO00o(Object paramObject)
  {
    int i = this.OooO0O0;
    Object[] arrayOfObject = this.OooO00o;
    int j = arrayOfObject.length;
    if (i < j)
    {
      arrayOfObject[i] = paramObject;
      int k = 1;
      i += k;
      this.OooO0O0 = i;
      return k;
    }
    return false;
  }
  
  public Object OooO0O0()
  {
    int i = this.OooO0O0;
    if (i > 0)
    {
      int j = i + -1;
      Object[] arrayOfObject = this.OooO00o;
      Object localObject = arrayOfObject[j];
      arrayOfObject[j] = null;
      i += -1;
      this.OooO0O0 = i;
      return localObject;
    }
    return null;
  }
  
  public void OooO0OO(Object[] paramArrayOfObject, int paramInt)
  {
    int i = paramArrayOfObject.length;
    if (paramInt > i) {
      paramInt = paramArrayOfObject.length;
    }
    i = 0;
    while (i < paramInt)
    {
      Object localObject = paramArrayOfObject[i];
      int j = this.OooO0O0;
      Object[] arrayOfObject = this.OooO00o;
      int k = arrayOfObject.length;
      if (j < k)
      {
        arrayOfObject[j] = localObject;
        j += 1;
        this.OooO0O0 = j;
      }
      i += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.Pools.SimplePool
 * JD-Core Version:    0.7.0.1
 */