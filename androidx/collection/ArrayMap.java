package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayMap
  extends SimpleArrayMap
  implements Map
{
  public MapCollections o00OooOO;
  
  public ArrayMap() {}
  
  public ArrayMap(int paramInt)
  {
    super(paramInt);
  }
  
  public ArrayMap(SimpleArrayMap paramSimpleArrayMap)
  {
    super(paramSimpleArrayMap);
  }
  
  private MapCollections getCollection()
  {
    Object localObject = this.o00OooOO;
    if (localObject == null)
    {
      localObject = new androidx/collection/ArrayMap$1;
      ((ArrayMap.1)localObject).<init>(this);
      this.o00OooOO = ((MapCollections)localObject);
    }
    return this.o00OooOO;
  }
  
  public boolean OooOOO(Collection paramCollection)
  {
    return MapCollections.OooOOO0(this, paramCollection);
  }
  
  public Set entrySet()
  {
    return getCollection().getEntrySet();
  }
  
  public Set keySet()
  {
    return getCollection().getKeySet();
  }
  
  public void putAll(Map paramMap)
  {
    int i = this.o00Ooo0;
    int j = paramMap.size();
    i += j;
    OooO0OO(i);
    paramMap = paramMap.entrySet().iterator();
    for (;;)
    {
      boolean bool = paramMap.hasNext();
      if (!bool) {
        break;
      }
      Object localObject1 = (Map.Entry)paramMap.next();
      Object localObject2 = ((Map.Entry)localObject1).getKey();
      localObject1 = ((Map.Entry)localObject1).getValue();
      put(localObject2, localObject1);
    }
  }
  
  public Collection values()
  {
    return getCollection().getValues();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.ArrayMap
 * JD-Core Version:    0.7.0.1
 */