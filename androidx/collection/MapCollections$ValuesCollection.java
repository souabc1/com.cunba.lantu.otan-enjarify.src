package androidx.collection;

import java.util.Collection;
import java.util.Iterator;

final class MapCollections$ValuesCollection
  implements Collection
{
  public MapCollections$ValuesCollection(MapCollections paramMapCollections) {}
  
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
    int i = localMapCollections.OooO0o(paramObject);
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
    paramCollection = paramCollection.iterator();
    boolean bool;
    do
    {
      bool = paramCollection.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = paramCollection.next();
      bool = contains(localObject);
    } while (bool);
    return false;
    return true;
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
    localArrayIterator.<init>(localMapCollections, 1);
    return localArrayIterator;
  }
  
  public boolean remove(Object paramObject)
  {
    MapCollections localMapCollections = this.o00OoOoo;
    int i = localMapCollections.OooO0o(paramObject);
    if (i >= 0)
    {
      this.o00OoOoo.OooO0oo(i);
      return true;
    }
    return false;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    MapCollections localMapCollections1 = this.o00OoOoo;
    int i = localMapCollections1.OooO0Oo();
    int j = 0;
    boolean bool1 = false;
    MapCollections localMapCollections2 = null;
    while (j < i)
    {
      Object localObject = this.o00OoOoo;
      int k = 1;
      localObject = ((MapCollections)localObject).OooO0O0(j, k);
      boolean bool2 = paramCollection.contains(localObject);
      if (bool2)
      {
        localMapCollections2 = this.o00OoOoo;
        localMapCollections2.OooO0oo(j);
        j += -1;
        i += -1;
        bool1 = k;
      }
      j += k;
    }
    return bool1;
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    MapCollections localMapCollections1 = this.o00OoOoo;
    int i = localMapCollections1.OooO0Oo();
    int j = 0;
    boolean bool1 = false;
    MapCollections localMapCollections2 = null;
    while (j < i)
    {
      Object localObject = this.o00OoOoo;
      int k = 1;
      localObject = ((MapCollections)localObject).OooO0O0(j, k);
      boolean bool2 = paramCollection.contains(localObject);
      if (!bool2)
      {
        localMapCollections2 = this.o00OoOoo;
        localMapCollections2.OooO0oo(j);
        j += -1;
        i += -1;
        bool1 = k;
      }
      j += k;
    }
    return bool1;
  }
  
  public int size()
  {
    return this.o00OoOoo.OooO0Oo();
  }
  
  public Object[] toArray()
  {
    return this.o00OoOoo.OooOOO(1);
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    return this.o00OoOoo.OooOOOO(paramArrayOfObject, 1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.MapCollections.ValuesCollection
 * JD-Core Version:    0.7.0.1
 */