package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class MapCollections$KeySet
  implements Set
{
  public MapCollections$KeySet(MapCollections paramMapCollections) {}
  
  public boolean add(Object paramObject)
  {
    paramObject = new java/lang/UnsupportedOperationException;
    paramObject.<init>();
    throw paramObject;
  }
  
  public boolean addAll(Collection paramCollection)
  {
    paramCollection = new java/lang/UnsupportedOperationException;
    paramCollection.<init>();
    throw paramCollection;
  }
  
  public void clear()
  {
    this.o00OoOoo.OooO00o();
  }
  
  public boolean contains(Object paramObject)
  {
    MapCollections localMapCollections = this.o00OoOoo;
    int i = localMapCollections.OooO0o0(paramObject);
    if (i >= 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramObject = null;
    }
    return i;
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    return MapCollections.OooOO0(this.o00OoOoo.OooO0OO(), paramCollection);
  }
  
  public boolean equals(Object paramObject)
  {
    return MapCollections.OooOO0O(this, paramObject);
  }
  
  public int hashCode()
  {
    MapCollections localMapCollections = this.o00OoOoo;
    int i = localMapCollections.OooO0Oo() + -1;
    int j = 0;
    while (i >= 0)
    {
      Object localObject = this.o00OoOoo.OooO0O0(i, 0);
      int k;
      if (localObject == null)
      {
        k = 0;
        localObject = null;
      }
      else
      {
        k = localObject.hashCode();
      }
      j += k;
      i += -1;
    }
    return j;
  }
  
  public boolean isEmpty()
  {
    MapCollections localMapCollections = this.o00OoOoo;
    int i = localMapCollections.OooO0Oo();
    if (i == 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localMapCollections = null;
    }
    return i;
  }
  
  public Iterator iterator()
  {
    MapCollections.ArrayIterator localArrayIterator = new androidx/collection/MapCollections$ArrayIterator;
    MapCollections localMapCollections = this.o00OoOoo;
    localArrayIterator.<init>(localMapCollections, 0);
    return localArrayIterator;
  }
  
  public boolean remove(Object paramObject)
  {
    MapCollections localMapCollections = this.o00OoOoo;
    int i = localMapCollections.OooO0o0(paramObject);
    if (i >= 0)
    {
      this.o00OoOoo.OooO0oo(i);
      return true;
    }
    return false;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    return MapCollections.OooOO0o(this.o00OoOoo.OooO0OO(), paramCollection);
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    return MapCollections.OooOOO0(this.o00OoOoo.OooO0OO(), paramCollection);
  }
  
  public int size()
  {
    return this.o00OoOoo.OooO0Oo();
  }
  
  public Object[] toArray()
  {
    return this.o00OoOoo.OooOOO(0);
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    return this.o00OoOoo.OooOOOO(paramArrayOfObject, 0);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.MapCollections.KeySet
 * JD-Core Version:    0.7.0.1
 */