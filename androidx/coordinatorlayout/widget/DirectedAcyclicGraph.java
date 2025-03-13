package androidx.coordinatorlayout.widget;

import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class DirectedAcyclicGraph
{
  public final Pools.Pool OooO00o;
  public final SimpleArrayMap OooO0O0;
  public final ArrayList OooO0OO;
  public final HashSet OooO0Oo;
  
  public DirectedAcyclicGraph()
  {
    Object localObject = new androidx/core/util/Pools$SimplePool;
    ((Pools.SimplePool)localObject).<init>(10);
    this.OooO00o = ((Pools.Pool)localObject);
    localObject = new androidx/collection/SimpleArrayMap;
    ((SimpleArrayMap)localObject).<init>();
    this.OooO0O0 = ((SimpleArrayMap)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO0OO = ((ArrayList)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.OooO0Oo = ((HashSet)localObject);
  }
  
  private ArrayList getEmptyList()
  {
    ArrayList localArrayList = (ArrayList)this.OooO00o.OooO0O0();
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
    }
    return localArrayList;
  }
  
  public final void OooO(ArrayList paramArrayList)
  {
    paramArrayList.clear();
    this.OooO00o.OooO00o(paramArrayList);
  }
  
  public void OooO00o(Object paramObject1, Object paramObject2)
  {
    Object localObject = this.OooO0O0;
    boolean bool = ((SimpleArrayMap)localObject).containsKey(paramObject1);
    if (bool)
    {
      localObject = this.OooO0O0;
      bool = ((SimpleArrayMap)localObject).containsKey(paramObject2);
      if (bool)
      {
        localObject = (ArrayList)this.OooO0O0.get(paramObject1);
        if (localObject == null)
        {
          localObject = getEmptyList();
          SimpleArrayMap localSimpleArrayMap = this.OooO0O0;
          localSimpleArrayMap.put(paramObject1, localObject);
        }
        ((ArrayList)localObject).add(paramObject2);
        return;
      }
    }
    paramObject1 = new java/lang/IllegalArgumentException;
    paramObject1.<init>("All nodes must be present in the graph before being added as an edge");
    throw paramObject1;
  }
  
  public void OooO0O0(Object paramObject)
  {
    SimpleArrayMap localSimpleArrayMap = this.OooO0O0;
    boolean bool = localSimpleArrayMap.containsKey(paramObject);
    if (!bool)
    {
      localSimpleArrayMap = this.OooO0O0;
      localSimpleArrayMap.put(paramObject, null);
    }
  }
  
  public void OooO0OO()
  {
    SimpleArrayMap localSimpleArrayMap = this.OooO0O0;
    int i = localSimpleArrayMap.size();
    int j = 0;
    while (j < i)
    {
      ArrayList localArrayList = (ArrayList)this.OooO0O0.OooOOO0(j);
      if (localArrayList != null) {
        OooO(localArrayList);
      }
      j += 1;
    }
    this.OooO0O0.clear();
  }
  
  public boolean OooO0Oo(Object paramObject)
  {
    return this.OooO0O0.containsKey(paramObject);
  }
  
  public List OooO0o(Object paramObject)
  {
    return (List)this.OooO0O0.get(paramObject);
  }
  
  public final void OooO0o0(Object paramObject, ArrayList paramArrayList, HashSet paramHashSet)
  {
    boolean bool = paramArrayList.contains(paramObject);
    if (bool) {
      return;
    }
    bool = paramHashSet.contains(paramObject);
    if (!bool)
    {
      paramHashSet.add(paramObject);
      ArrayList localArrayList = (ArrayList)this.OooO0O0.get(paramObject);
      if (localArrayList != null)
      {
        int i = localArrayList.size();
        int j = 0;
        while (j < i)
        {
          Object localObject = localArrayList.get(j);
          OooO0o0(localObject, paramArrayList, paramHashSet);
          j += 1;
        }
      }
      paramHashSet.remove(paramObject);
      paramArrayList.add(paramObject);
      return;
    }
    paramObject = new java/lang/RuntimeException;
    paramObject.<init>("This graph contains cyclic dependencies");
    throw paramObject;
  }
  
  public List OooO0oO(Object paramObject)
  {
    SimpleArrayMap localSimpleArrayMap = this.OooO0O0;
    int i = localSimpleArrayMap.size();
    ArrayList localArrayList = null;
    int j = 0;
    while (j < i)
    {
      Object localObject = (ArrayList)this.OooO0O0.OooOOO0(j);
      if (localObject != null)
      {
        boolean bool = ((ArrayList)localObject).contains(paramObject);
        if (bool)
        {
          if (localArrayList == null)
          {
            localArrayList = new java/util/ArrayList;
            localArrayList.<init>();
          }
          localObject = this.OooO0O0.OooO(j);
          localArrayList.add(localObject);
        }
      }
      j += 1;
    }
    return localArrayList;
  }
  
  public boolean OooO0oo(Object paramObject)
  {
    SimpleArrayMap localSimpleArrayMap = this.OooO0O0;
    int i = localSimpleArrayMap.size();
    int j = 0;
    while (j < i)
    {
      ArrayList localArrayList = (ArrayList)this.OooO0O0.OooOOO0(j);
      if (localArrayList != null)
      {
        boolean bool = localArrayList.contains(paramObject);
        if (bool) {
          return true;
        }
      }
      j += 1;
    }
    return false;
  }
  
  public ArrayList getSortedList()
  {
    this.OooO0OO.clear();
    this.OooO0Oo.clear();
    SimpleArrayMap localSimpleArrayMap = this.OooO0O0;
    int i = localSimpleArrayMap.size();
    int j = 0;
    while (j < i)
    {
      Object localObject = this.OooO0O0.OooO(j);
      ArrayList localArrayList = this.OooO0OO;
      HashSet localHashSet = this.OooO0Oo;
      OooO0o0(localObject, localArrayList, localHashSet);
      j += 1;
    }
    return this.OooO0OO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.coordinatorlayout.widget.DirectedAcyclicGraph
 * JD-Core Version:    0.7.0.1
 */