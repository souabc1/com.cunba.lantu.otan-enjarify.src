package androidx.core.util;

public class Pair
{
  public final Object OooO00o;
  public final Object OooO0O0;
  
  public Pair(Object paramObject1, Object paramObject2)
  {
    this.OooO00o = paramObject1;
    this.OooO0O0 = paramObject2;
  }
  
  public static Pair OooO00o(Object paramObject1, Object paramObject2)
  {
    Pair localPair = new androidx/core/util/Pair;
    localPair.<init>(paramObject1, paramObject2);
    return localPair;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Pair;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (Pair)paramObject;
    Object localObject1 = paramObject.OooO00o;
    Object localObject2 = this.OooO00o;
    bool1 = ObjectsCompat.OooO00o(localObject1, localObject2);
    if (bool1)
    {
      paramObject = paramObject.OooO0O0;
      localObject1 = this.OooO0O0;
      boolean bool3 = ObjectsCompat.OooO00o(paramObject, localObject1);
      if (bool3) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public int hashCode()
  {
    Object localObject1 = this.OooO00o;
    int i = 0;
    int j;
    if (localObject1 == null)
    {
      j = 0;
      localObject1 = null;
    }
    else
    {
      j = localObject1.hashCode();
    }
    Object localObject2 = this.OooO0O0;
    if (localObject2 != null) {
      i = localObject2.hashCode();
    }
    return j ^ i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Pair{");
    Object localObject = this.OooO00o;
    localStringBuilder.append(localObject);
    localStringBuilder.append(" ");
    localObject = this.OooO0O0;
    localStringBuilder.append(localObject);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.util.Pair
 * JD-Core Version:    0.7.0.1
 */