package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class MapCollections$ArrayIterator
  implements Iterator
{
  public final int o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public boolean o00Ooo0O = false;
  
  public MapCollections$ArrayIterator(MapCollections paramMapCollections, int paramInt)
  {
    this.o00OoOoo = paramInt;
    int i = paramMapCollections.OooO0Oo();
    this.o00Ooo00 = i;
  }
  
  public boolean hasNext()
  {
    int i = this.o00Ooo0;
    int j = this.o00Ooo00;
    if (i < j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public Object next()
  {
    boolean bool = hasNext();
    if (bool)
    {
      localObject = this.o00Ooo0o;
      int i = this.o00Ooo0;
      int j = this.o00OoOoo;
      localObject = ((MapCollections)localObject).OooO0O0(i, j);
      i = this.o00Ooo0;
      j = 1;
      i += j;
      this.o00Ooo0 = i;
      this.o00Ooo0O = j;
      return localObject;
    }
    Object localObject = new java/util/NoSuchElementException;
    ((NoSuchElementException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public void remove()
  {
    boolean bool = this.o00Ooo0O;
    if (bool)
    {
      int i = this.o00Ooo0 + -1;
      this.o00Ooo0 = i;
      int j = this.o00Ooo00 + -1;
      this.o00Ooo00 = j;
      this.o00Ooo0O = false;
      this.o00Ooo0o.OooO0oo(i);
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>();
    throw localIllegalStateException;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.MapCollections.ArrayIterator
 * JD-Core Version:    0.7.0.1
 */