package androidx.collection;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class SparseArrayKt$valueIterator$1
  implements Iterator, KMappedMarker
{
  public int o00OoOoo;
  
  public SparseArrayKt$valueIterator$1(SparseArrayCompat paramSparseArrayCompat) {}
  
  public final int getIndex()
  {
    return this.o00OoOoo;
  }
  
  public boolean hasNext()
  {
    int i = this.o00OoOoo;
    SparseArrayCompat localSparseArrayCompat = this.o00Ooo00;
    int j = localSparseArrayCompat.OooOOOO();
    if (i < j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public Object next()
  {
    SparseArrayCompat localSparseArrayCompat = this.o00Ooo00;
    int i = this.o00OoOoo;
    int j = i + 1;
    this.o00OoOoo = j;
    return localSparseArrayCompat.OooOOOo(i);
  }
  
  public void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Operation is not supported for read-only collection");
    throw localUnsupportedOperationException;
  }
  
  public final void setIndex(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.SparseArrayKt.valueIterator.1
 * JD-Core Version:    0.7.0.1
 */