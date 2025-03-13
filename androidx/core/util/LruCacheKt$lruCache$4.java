package androidx.core.util;

import android.util.LruCache;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

public final class LruCacheKt$lruCache$4
  extends LruCache
{
  public Object create(Object paramObject)
  {
    Intrinsics.OooO0o(paramObject, "key");
    return this.OooO0O0.invoke(paramObject);
  }
  
  public void entryRemoved(boolean paramBoolean, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    Intrinsics.OooO0o(paramObject1, "key");
    Intrinsics.OooO0o(paramObject2, "oldValue");
    Function4 localFunction4 = this.OooO0OO;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    localFunction4.OooO0oO(localBoolean, paramObject1, paramObject2, paramObject3);
  }
  
  public int sizeOf(Object paramObject1, Object paramObject2)
  {
    Intrinsics.OooO0o(paramObject1, "key");
    Intrinsics.OooO0o(paramObject2, "value");
    return ((Number)this.OooO00o.OooOO0O(paramObject1, paramObject2)).intValue();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.util.LruCacheKt.lruCache.4
 * JD-Core Version:    0.7.0.1
 */