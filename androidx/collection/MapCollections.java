package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class MapCollections
{
  public MapCollections.EntrySet OooO00o;
  public MapCollections.KeySet OooO0O0;
  public MapCollections.ValuesCollection OooO0OO;
  
  public static boolean OooOO0(Map paramMap, Collection paramCollection)
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
      bool = paramMap.containsKey(localObject);
    } while (bool);
    return false;
    return true;
  }
  
  public static boolean OooOO0O(Set paramSet, Object paramObject)
  {
    boolean bool1 = true;
    if (paramSet == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof Set;
    if (bool2)
    {
      paramObject = (Set)paramObject;
      try
      {
        int i = paramSet.size();
        int j = paramObject.size();
        if (i == j)
        {
          boolean bool3 = paramSet.containsAll(paramObject);
          if (bool3) {}
        }
        else
        {
          bool1 = false;
        }
        return bool1;
      }
      catch (NullPointerException|ClassCastException localNullPointerException) {}
    }
    return false;
  }
  
  public static boolean OooOO0o(Map paramMap, Collection paramCollection)
  {
    int i = paramMap.size();
    paramCollection = paramCollection.iterator();
    for (;;)
    {
      boolean bool = paramCollection.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = paramCollection.next();
      paramMap.remove(localObject);
    }
    int j = paramMap.size();
    if (i != j)
    {
      j = 1;
    }
    else
    {
      j = 0;
      paramMap = null;
    }
    return j;
  }
  
  public static boolean OooOOO0(Map paramMap, Collection paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramMap.keySet().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = localIterator.next();
      bool = paramCollection.contains(localObject);
      if (!bool) {
        localIterator.remove();
      }
    }
    int j = paramMap.size();
    if (i != j)
    {
      j = 1;
    }
    else
    {
      j = 0;
      paramMap = null;
    }
    return j;
  }
  
  public abstract Object OooO(int paramInt, Object paramObject);
  
  public abstract void OooO00o();
  
  public abstract Object OooO0O0(int paramInt1, int paramInt2);
  
  public abstract Map OooO0OO();
  
  public abstract int OooO0Oo();
  
  public abstract int OooO0o(Object paramObject);
  
  public abstract int OooO0o0(Object paramObject);
  
  public abstract void OooO0oO(Object paramObject1, Object paramObject2);
  
  public abstract void OooO0oo(int paramInt);
  
  public Object[] OooOOO(int paramInt)
  {
    int i = OooO0Oo();
    Object[] arrayOfObject = new Object[i];
    int j = 0;
    while (j < i)
    {
      Object localObject = OooO0O0(j, paramInt);
      arrayOfObject[j] = localObject;
      j += 1;
    }
    return arrayOfObject;
  }
  
  public Object[] OooOOOO(Object[] paramArrayOfObject, int paramInt)
  {
    int i = OooO0Oo();
    int j = paramArrayOfObject.length;
    if (j < i) {
      paramArrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
    }
    j = 0;
    while (j < i)
    {
      Object localObject = OooO0O0(j, paramInt);
      paramArrayOfObject[j] = localObject;
      j += 1;
    }
    paramInt = paramArrayOfObject.length;
    if (paramInt > i)
    {
      paramInt = 0;
      paramArrayOfObject[i] = null;
    }
    return paramArrayOfObject;
  }
  
  public Set getEntrySet()
  {
    MapCollections.EntrySet localEntrySet = this.OooO00o;
    if (localEntrySet == null)
    {
      localEntrySet = new androidx/collection/MapCollections$EntrySet;
      localEntrySet.<init>(this);
      this.OooO00o = localEntrySet;
    }
    return this.OooO00o;
  }
  
  public Set getKeySet()
  {
    MapCollections.KeySet localKeySet = this.OooO0O0;
    if (localKeySet == null)
    {
      localKeySet = new androidx/collection/MapCollections$KeySet;
      localKeySet.<init>(this);
      this.OooO0O0 = localKeySet;
    }
    return this.OooO0O0;
  }
  
  public Collection getValues()
  {
    MapCollections.ValuesCollection localValuesCollection = this.OooO0OO;
    if (localValuesCollection == null)
    {
      localValuesCollection = new androidx/collection/MapCollections$ValuesCollection;
      localValuesCollection.<init>(this);
      this.OooO0OO = localValuesCollection;
    }
    return this.OooO0OO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.MapCollections
 * JD-Core Version:    0.7.0.1
 */