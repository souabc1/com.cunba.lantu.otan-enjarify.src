package androidx.core.graphics;

import android.graphics.Rect;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class RegionKt$iterator$1
  implements Iterator, KMappedMarker
{
  public final RegionIterator o00OoOoo;
  public boolean o00Ooo0;
  public final Rect o00Ooo00;
  
  public Rect OooO00o()
  {
    boolean bool1 = this.o00Ooo0;
    if (bool1)
    {
      localObject1 = new android/graphics/Rect;
      Object localObject2 = this.o00Ooo00;
      ((Rect)localObject1).<init>((Rect)localObject2);
      localObject2 = this.o00OoOoo;
      Rect localRect = this.o00Ooo00;
      boolean bool2 = ((RegionIterator)localObject2).next(localRect);
      this.o00Ooo0 = bool2;
      return localObject1;
    }
    Object localObject1 = new java/lang/IndexOutOfBoundsException;
    ((IndexOutOfBoundsException)localObject1).<init>();
    throw ((Throwable)localObject1);
  }
  
  public boolean hasNext()
  {
    return this.o00Ooo0;
  }
  
  public void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Operation is not supported for read-only collection");
    throw localUnsupportedOperationException;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.RegionKt.iterator.1
 * JD-Core Version:    0.7.0.1
 */