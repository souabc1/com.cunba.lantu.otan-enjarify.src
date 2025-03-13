package androidx.collection;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

final class MapCollections$MapIterator
  implements Iterator, Map.Entry
{
  public int o00OoOoo;
  public boolean o00Ooo0 = false;
  public int o00Ooo00;
  
  public MapCollections$MapIterator(MapCollections paramMapCollections)
  {
    int i = paramMapCollections.OooO0Oo() + -1;
    this.o00OoOoo = i;
    this.o00Ooo00 = -1;
  }
  
  public Map.Entry OooO00o()
  {
    boolean bool = hasNext();
    if (bool)
    {
      int i = this.o00Ooo00;
      int j = 1;
      i += j;
      this.o00Ooo00 = i;
      this.o00Ooo0 = j;
      return this;
    }
    NoSuchElementException localNoSuchElementException = new java/util/NoSuchElementException;
    localNoSuchElementException.<init>();
    throw localNoSuchElementException;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = this.o00Ooo0;
    if (bool1)
    {
      bool1 = paramObject instanceof Map.Entry;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (Map.Entry)paramObject;
      Object localObject1 = paramObject.getKey();
      Object localObject2 = this.o00Ooo0O;
      int i = this.o00Ooo00;
      localObject2 = ((MapCollections)localObject2).OooO0O0(i, 0);
      bool1 = ContainerHelpers.OooO0OO(localObject1, localObject2);
      if (bool1)
      {
        paramObject = paramObject.getValue();
        localObject1 = this.o00Ooo0O;
        int j = this.o00Ooo00;
        i = 1;
        localObject1 = ((MapCollections)localObject1).OooO0O0(j, i);
        boolean bool3 = ContainerHelpers.OooO0OO(paramObject, localObject1);
        if (bool3) {
          bool2 = i;
        }
      }
      return bool2;
    }
    paramObject = new java/lang/IllegalStateException;
    paramObject.<init>("This container does not support retaining Map.Entry objects");
    throw paramObject;
  }
  
  public Object getKey()
  {
    boolean bool = this.o00Ooo0;
    if (bool)
    {
      localObject = this.o00Ooo0O;
      int i = this.o00Ooo00;
      return ((MapCollections)localObject).OooO0O0(i, 0);
    }
    Object localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("This container does not support retaining Map.Entry objects");
    throw ((Throwable)localObject);
  }
  
  public Object getValue()
  {
    boolean bool = this.o00Ooo0;
    if (bool)
    {
      localObject = this.o00Ooo0O;
      int i = this.o00Ooo00;
      return ((MapCollections)localObject).OooO0O0(i, 1);
    }
    Object localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("This container does not support retaining Map.Entry objects");
    throw ((Throwable)localObject);
  }
  
  public boolean hasNext()
  {
    int i = this.o00Ooo00;
    int j = this.o00OoOoo;
    if (i < j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public int hashCode()
  {
    boolean bool = this.o00Ooo0;
    if (bool)
    {
      localObject1 = this.o00Ooo0O;
      int j = this.o00Ooo00;
      int k = 0;
      localObject1 = ((MapCollections)localObject1).OooO0O0(j, 0);
      Object localObject2 = this.o00Ooo0O;
      int m = this.o00Ooo00;
      int n = 1;
      localObject2 = ((MapCollections)localObject2).OooO0O0(m, n);
      int i;
      if (localObject1 == null)
      {
        bool = false;
        localObject1 = null;
      }
      else
      {
        i = localObject1.hashCode();
      }
      if (localObject2 != null) {
        k = localObject2.hashCode();
      }
      return i ^ k;
    }
    Object localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("This container does not support retaining Map.Entry objects");
    throw ((Throwable)localObject1);
  }
  
  public void remove()
  {
    boolean bool = this.o00Ooo0;
    if (bool)
    {
      localObject = this.o00Ooo0O;
      int j = this.o00Ooo00;
      ((MapCollections)localObject).OooO0oo(j);
      int i = this.o00Ooo00 + -1;
      this.o00Ooo00 = i;
      i = this.o00OoOoo + -1;
      this.o00OoOoo = i;
      this.o00Ooo0 = false;
      return;
    }
    Object localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public Object setValue(Object paramObject)
  {
    boolean bool = this.o00Ooo0;
    if (bool)
    {
      MapCollections localMapCollections = this.o00Ooo0O;
      int i = this.o00Ooo00;
      return localMapCollections.OooO(i, paramObject);
    }
    paramObject = new java/lang/IllegalStateException;
    paramObject.<init>("This container does not support retaining Map.Entry objects");
    throw paramObject;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = getKey();
    localStringBuilder.append(localObject);
    localStringBuilder.append("=");
    localObject = getValue();
    localStringBuilder.append(localObject);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.MapCollections.MapIterator
 * JD-Core Version:    0.7.0.1
 */