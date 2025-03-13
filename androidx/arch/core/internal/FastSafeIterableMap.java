package androidx.arch.core.internal;

import java.util.HashMap;
import java.util.Map.Entry;

public class FastSafeIterableMap
  extends SafeIterableMap
{
  public final HashMap o00Ooo0o;
  
  public FastSafeIterableMap()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.o00Ooo0o = localHashMap;
  }
  
  public SafeIterableMap.Entry OooO0O0(Object paramObject)
  {
    return (SafeIterableMap.Entry)this.o00Ooo0o.get(paramObject);
  }
  
  public Object OooO0o(Object paramObject1, Object paramObject2)
  {
    Object localObject = OooO0O0(paramObject1);
    if (localObject != null) {
      return ((SafeIterableMap.Entry)localObject).o00Ooo00;
    }
    localObject = this.o00Ooo0o;
    paramObject2 = OooO0o0(paramObject1, paramObject2);
    ((HashMap)localObject).put(paramObject1, paramObject2);
    return null;
  }
  
  public Object OooO0oO(Object paramObject)
  {
    Object localObject = super.OooO0oO(paramObject);
    this.o00Ooo0o.remove(paramObject);
    return localObject;
  }
  
  public Map.Entry OooO0oo(Object paramObject)
  {
    boolean bool = contains(paramObject);
    if (bool) {
      return ((SafeIterableMap.Entry)this.o00Ooo0o.get(paramObject)).o00Ooo0O;
    }
    return null;
  }
  
  public boolean contains(Object paramObject)
  {
    return this.o00Ooo0o.containsKey(paramObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.arch.core.internal.FastSafeIterableMap
 * JD-Core Version:    0.7.0.1
 */