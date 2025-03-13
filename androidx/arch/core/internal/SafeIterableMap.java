package androidx.arch.core.internal;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class SafeIterableMap
  implements Iterable
{
  public SafeIterableMap.Entry o00OoOoo;
  public final WeakHashMap o00Ooo0;
  public SafeIterableMap.Entry o00Ooo00;
  public int o00Ooo0O;
  
  public SafeIterableMap()
  {
    WeakHashMap localWeakHashMap = new java/util/WeakHashMap;
    localWeakHashMap.<init>();
    this.o00Ooo0 = localWeakHashMap;
    this.o00Ooo0O = 0;
  }
  
  public Map.Entry OooO00o()
  {
    return this.o00OoOoo;
  }
  
  public SafeIterableMap.Entry OooO0O0(Object paramObject)
  {
    for (SafeIterableMap.Entry localEntry = this.o00OoOoo; localEntry != null; localEntry = localEntry.o00Ooo0)
    {
      Object localObject = localEntry.o00OoOoo;
      boolean bool = localObject.equals(paramObject);
      if (bool) {
        break;
      }
    }
    return localEntry;
  }
  
  public SafeIterableMap.IteratorWithAdditions OooO0OO()
  {
    SafeIterableMap.IteratorWithAdditions localIteratorWithAdditions = new androidx/arch/core/internal/SafeIterableMap$IteratorWithAdditions;
    localIteratorWithAdditions.<init>(this);
    WeakHashMap localWeakHashMap = this.o00Ooo0;
    Boolean localBoolean = Boolean.FALSE;
    localWeakHashMap.put(localIteratorWithAdditions, localBoolean);
    return localIteratorWithAdditions;
  }
  
  public Map.Entry OooO0Oo()
  {
    return this.o00Ooo00;
  }
  
  public Object OooO0o(Object paramObject1, Object paramObject2)
  {
    SafeIterableMap.Entry localEntry = OooO0O0(paramObject1);
    if (localEntry != null) {
      return localEntry.o00Ooo00;
    }
    OooO0o0(paramObject1, paramObject2);
    return null;
  }
  
  public SafeIterableMap.Entry OooO0o0(Object paramObject1, Object paramObject2)
  {
    SafeIterableMap.Entry localEntry = new androidx/arch/core/internal/SafeIterableMap$Entry;
    localEntry.<init>(paramObject1, paramObject2);
    int i = this.o00Ooo0O + 1;
    this.o00Ooo0O = i;
    paramObject1 = this.o00Ooo00;
    if (paramObject1 == null) {
      this.o00OoOoo = localEntry;
    }
    for (;;)
    {
      this.o00Ooo00 = localEntry;
      return localEntry;
      paramObject1.o00Ooo0 = localEntry;
      localEntry.o00Ooo0O = paramObject1;
    }
  }
  
  public Object OooO0oO(Object paramObject)
  {
    paramObject = OooO0O0(paramObject);
    if (paramObject == null) {
      return null;
    }
    int i = this.o00Ooo0O + -1;
    this.o00Ooo0O = i;
    Object localObject1 = this.o00Ooo0;
    boolean bool1 = ((WeakHashMap)localObject1).isEmpty();
    if (!bool1)
    {
      localObject1 = this.o00Ooo0.keySet().iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (SafeIterableMap.SupportRemove)((Iterator)localObject1).next();
        ((SafeIterableMap.SupportRemove)localObject2).OooO00o(paramObject);
      }
    }
    localObject1 = paramObject.o00Ooo0O;
    Object localObject2 = paramObject.o00Ooo0;
    if (localObject1 != null) {
      ((SafeIterableMap.Entry)localObject1).o00Ooo0 = ((SafeIterableMap.Entry)localObject2);
    } else {
      this.o00OoOoo = ((SafeIterableMap.Entry)localObject2);
    }
    localObject2 = paramObject.o00Ooo0;
    if (localObject2 != null) {
      ((SafeIterableMap.Entry)localObject2).o00Ooo0O = ((SafeIterableMap.Entry)localObject1);
    } else {
      this.o00Ooo00 = ((SafeIterableMap.Entry)localObject1);
    }
    paramObject.o00Ooo0 = null;
    paramObject.o00Ooo0O = null;
    return paramObject.o00Ooo00;
  }
  
  public Iterator descendingIterator()
  {
    SafeIterableMap.DescendingIterator localDescendingIterator = new androidx/arch/core/internal/SafeIterableMap$DescendingIterator;
    Object localObject1 = this.o00Ooo00;
    Object localObject2 = this.o00OoOoo;
    localDescendingIterator.<init>((SafeIterableMap.Entry)localObject1, (SafeIterableMap.Entry)localObject2);
    localObject1 = this.o00Ooo0;
    localObject2 = Boolean.FALSE;
    ((WeakHashMap)localObject1).put(localDescendingIterator, localObject2);
    return localDescendingIterator;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof SafeIterableMap;
    if (!bool2) {
      return false;
    }
    paramObject = (SafeIterableMap)paramObject;
    int i = size();
    int j = paramObject.size();
    if (i != j) {
      return false;
    }
    Iterator localIterator = iterator();
    paramObject = paramObject.iterator();
    boolean bool4;
    do
    {
      Map.Entry localEntry;
      Object localObject;
      do
      {
        bool4 = localIterator.hasNext();
        if (!bool4) {
          break label135;
        }
        bool4 = paramObject.hasNext();
        if (!bool4) {
          break label135;
        }
        localEntry = (Map.Entry)localIterator.next();
        localObject = paramObject.next();
        if ((localEntry == null) && (localObject != null)) {
          break;
        }
      } while (localEntry == null);
      bool4 = localEntry.equals(localObject);
    } while (bool4);
    return false;
    label135:
    boolean bool3 = localIterator.hasNext();
    if (!bool3)
    {
      boolean bool5 = paramObject.hasNext();
      if (!bool5) {}
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public int hashCode()
  {
    Iterator localIterator = iterator();
    int i = 0;
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int j = localEntry.hashCode();
      i += j;
    }
    return i;
  }
  
  public Iterator iterator()
  {
    SafeIterableMap.AscendingIterator localAscendingIterator = new androidx/arch/core/internal/SafeIterableMap$AscendingIterator;
    Object localObject1 = this.o00OoOoo;
    Object localObject2 = this.o00Ooo00;
    localAscendingIterator.<init>((SafeIterableMap.Entry)localObject1, (SafeIterableMap.Entry)localObject2);
    localObject1 = this.o00Ooo0;
    localObject2 = Boolean.FALSE;
    ((WeakHashMap)localObject1).put(localAscendingIterator, localObject2);
    return localAscendingIterator;
  }
  
  public int size()
  {
    return this.o00Ooo0O;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[");
    Iterator localIterator = iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str = ((Map.Entry)localIterator.next()).toString();
      localStringBuilder.append(str);
      bool = localIterator.hasNext();
      if (bool)
      {
        str = ", ";
        localStringBuilder.append(str);
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.arch.core.internal.SafeIterableMap
 * JD-Core Version:    0.7.0.1
 */