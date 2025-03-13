package androidx.core.util;

public class Pools$SimplePool
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
    boolean bool = OooO0OO(paramObject);
    if (!bool)
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
    paramObject = new java/lang/IllegalStateException;
    paramObject.<init>("Already in the pool!");
    throw paramObject;
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
  
  public final boolean OooO0OO(Object paramObject)
  {
    int i = 0;
    for (;;)
    {
      int j = this.OooO0O0;
      if (i >= j) {
        break;
      }
      Object localObject = this.OooO00o[i];
      if (localObject == paramObject) {
        return true;
      }
      i += 1;
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.util.Pools.SimplePool
 * JD-Core Version:    0.7.0.1
 */