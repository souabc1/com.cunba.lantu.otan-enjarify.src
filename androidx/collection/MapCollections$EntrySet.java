package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class MapCollections$EntrySet
  implements Set
{
  public MapCollections$EntrySet(MapCollections paramMapCollections) {}
  
  public boolean OooO00o(Map.Entry paramEntry)
  {
    paramEntry = new java/lang/UnsupportedOperationException;
    paramEntry.<init>();
    throw paramEntry;
  }
  
  public boolean addAll(Collection paramCollection)
  {
    MapCollections localMapCollections1 = this.o00OoOoo;
    int i = localMapCollections1.OooO0Oo();
    paramCollection = paramCollection.iterator();
    for (;;)
    {
      boolean bool = paramCollection.hasNext();
      if (!bool) {
        break;
      }
      Object localObject1 = (Map.Entry)paramCollection.next();
      MapCollections localMapCollections2 = this.o00OoOoo;
      Object localObject2 = ((Map.Entry)localObject1).getKey();
      localObject1 = ((Map.Entry)localObject1).getValue();
      localMapCollections2.OooO0oO(localObject2, localObject1);
    }
    paramCollection = this.o00OoOoo;
    int j = paramCollection.OooO0Oo();
    if (i != j)
    {
      j = 1;
    }
    else
    {
      j = 0;
      paramCollection = null;
    }
    return j;
  }
  
  public void clear()
  {
    this.o00OoOoo.OooO00o();
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool = paramObject instanceof Map.Entry;
    if (!bool) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    Object localObject1 = this.o00OoOoo;
    Object localObject2 = paramObject.getKey();
    int i = ((MapCollections)localObject1).OooO0o0(localObject2);
    if (i < 0) {
      return false;
    }
    localObject1 = this.o00OoOoo.OooO0O0(i, 1);
    paramObject = paramObject.getValue();
    return ContainerHelpers.OooO0OO(localObject1, paramObject);
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
  
  public boolean equals(Object paramObject)
  {
    return MapCollections.OooOO0O(this, paramObject);
  }
  
  public int hashCode()
  {
    MapCollections localMapCollections = this.o00OoOoo;
    int i = localMapCollections.OooO0Oo();
    int j = 1;
    i -= j;
    int k = 0;
    while (i >= 0)
    {
      Object localObject1 = this.o00OoOoo.OooO0O0(i, 0);
      Object localObject2 = this.o00OoOoo.OooO0O0(i, j);
      int m;
      if (localObject1 == null)
      {
        m = 0;
        localObject1 = null;
      }
      else
      {
        m = localObject1.hashCode();
      }
      int n;
      if (localObject2 == null)
      {
        n = 0;
        localObject2 = null;
      }
      else
      {
        n = localObject2.hashCode();
      }
      m ^= n;
      k += m;
      i += -1;
    }
    return k;
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
    MapCollections.MapIterator localMapIterator = new androidx/collection/MapCollections$MapIterator;
    MapCollections localMapCollections = this.o00OoOoo;
    localMapIterator.<init>(localMapCollections);
    return localMapIterator;
  }
  
  public boolean remove(Object paramObject)
  {
    paramObject = new java/lang/UnsupportedOperationException;
    paramObject.<init>();
    throw paramObject;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    paramCollection = new java/lang/UnsupportedOperationException;
    paramCollection.<init>();
    throw paramCollection;
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    paramCollection = new java/lang/UnsupportedOperationException;
    paramCollection.<init>();
    throw paramCollection;
  }
  
  public int size()
  {
    return this.o00OoOoo.OooO0Oo();
  }
  
  public Object[] toArray()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    paramArrayOfObject = new java/lang/UnsupportedOperationException;
    paramArrayOfObject.<init>();
    throw paramArrayOfObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.MapCollections.EntrySet
 * JD-Core Version:    0.7.0.1
 */