package androidx.collection;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

public final class LruCacheKt$lruCache$4
  extends LruCache
{
  public Object OooO00o(Object paramObject)
  {
    Intrinsics.OooO0oO(paramObject, "key");
    return this.OooOO0.invoke(paramObject);
  }
  
  public void OooO0O0(boolean paramBoolean, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    Intrinsics.OooO0oO(paramObject1, "key");
    Intrinsics.OooO0oO(paramObject2, "oldValue");
    Function4 localFunction4 = this.OooOO0O;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    localFunction4.OooO0oO(localBoolean, paramObject1, paramObject2, paramObject3);
  }
  
  public int OooO0o(Object paramObject1, Object paramObject2)
  {
    Intrinsics.OooO0oO(paramObject1, "key");
    Intrinsics.OooO0oO(paramObject2, "value");
    return ((Number)this.OooO.OooOO0O(paramObject1, paramObject2)).intValue();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.LruCacheKt.lruCache.4
 * JD-Core Version:    0.7.0.1
 */