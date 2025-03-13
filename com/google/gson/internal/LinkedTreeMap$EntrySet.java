package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class LinkedTreeMap$EntrySet
  extends AbstractSet
{
  public LinkedTreeMap$EntrySet(LinkedTreeMap paramLinkedTreeMap) {}
  
  public void clear()
  {
    this.this$0.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    if (bool1)
    {
      LinkedTreeMap localLinkedTreeMap = this.this$0;
      paramObject = (Map.Entry)paramObject;
      paramObject = localLinkedTreeMap.findByEntry(paramObject);
      if (paramObject != null)
      {
        bool2 = true;
        break label40;
      }
    }
    boolean bool2 = false;
    paramObject = null;
    label40:
    return bool2;
  }
  
  public Iterator iterator()
  {
    LinkedTreeMap.EntrySet.1 local1 = new com/google/gson/internal/LinkedTreeMap$EntrySet$1;
    local1.<init>(this);
    return local1;
  }
  
  public boolean remove(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    LinkedTreeMap localLinkedTreeMap = this.this$0;
    paramObject = (Map.Entry)paramObject;
    paramObject = localLinkedTreeMap.findByEntry(paramObject);
    if (paramObject == null) {
      return false;
    }
    localLinkedTreeMap = this.this$0;
    bool2 = true;
    localLinkedTreeMap.removeInternal(paramObject, bool2);
    return bool2;
  }
  
  public int size()
  {
    return this.this$0.size;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.LinkedTreeMap.EntrySet
 * JD-Core Version:    0.7.0.1
 */