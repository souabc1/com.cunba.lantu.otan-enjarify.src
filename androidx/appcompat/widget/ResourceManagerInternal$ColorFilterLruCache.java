package androidx.appcompat.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import androidx.collection.LruCache;

class ResourceManagerInternal$ColorFilterLruCache
  extends LruCache
{
  public ResourceManagerInternal$ColorFilterLruCache(int paramInt)
  {
    super(paramInt);
  }
  
  public static int OooO0oo(int paramInt, PorterDuff.Mode paramMode)
  {
    int i = 31;
    paramInt = (paramInt + i) * i;
    int j = paramMode.hashCode();
    return paramInt + j;
  }
  
  public PorterDuffColorFilter OooO(int paramInt, PorterDuff.Mode paramMode)
  {
    Integer localInteger = Integer.valueOf(OooO0oo(paramInt, paramMode));
    return (PorterDuffColorFilter)OooO0OO(localInteger);
  }
  
  public PorterDuffColorFilter OooOO0(int paramInt, PorterDuff.Mode paramMode, PorterDuffColorFilter paramPorterDuffColorFilter)
  {
    Integer localInteger = Integer.valueOf(OooO0oo(paramInt, paramMode));
    return (PorterDuffColorFilter)OooO0Oo(localInteger, paramPorterDuffColorFilter);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ResourceManagerInternal.ColorFilterLruCache
 * JD-Core Version:    0.7.0.1
 */