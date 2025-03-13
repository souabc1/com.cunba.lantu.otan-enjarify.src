package androidx.arch.core.internal;

import java.util.Map.Entry;

class SafeIterableMap$Entry
  implements Map.Entry
{
  public final Object o00OoOoo;
  public Entry o00Ooo0;
  public final Object o00Ooo00;
  public Entry o00Ooo0O;
  
  public SafeIterableMap$Entry(Object paramObject1, Object paramObject2)
  {
    this.o00OoOoo = paramObject1;
    this.o00Ooo00 = paramObject2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof Entry;
    if (!bool2) {
      return false;
    }
    paramObject = (Entry)paramObject;
    Object localObject1 = this.o00OoOoo;
    Object localObject2 = paramObject.o00OoOoo;
    bool2 = localObject1.equals(localObject2);
    if (bool2)
    {
      localObject1 = this.o00Ooo00;
      paramObject = paramObject.o00Ooo00;
      boolean bool3 = localObject1.equals(paramObject);
      if (bool3) {}
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public Object getKey()
  {
    return this.o00OoOoo;
  }
  
  public Object getValue()
  {
    return this.o00Ooo00;
  }
  
  public int hashCode()
  {
    int i = this.o00OoOoo.hashCode();
    int j = this.o00Ooo00.hashCode();
    return i ^ j;
  }
  
  public Object setValue(Object paramObject)
  {
    paramObject = new java/lang/UnsupportedOperationException;
    paramObject.<init>("An entry modification is not supported");
    throw paramObject;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = this.o00OoOoo;
    localStringBuilder.append(localObject);
    localStringBuilder.append("=");
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.arch.core.internal.SafeIterableMap.Entry
 * JD-Core Version:    0.7.0.1
 */