package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class LinkedHashTreeMap$EntrySet
  extends AbstractSet
{
  public LinkedHashTreeMap$EntrySet(LinkedHashTreeMap paramLinkedHashTreeMap) {}
  
  public void clear()
  {
    this.this$0.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    if (bool1)
    {
      LinkedHashTreeMap localLinkedHashTreeMap = this.this$0;
      paramObject = (Map.Entry)paramObject;
      paramObject = localLinkedHashTreeMap.findByEntry(paramObject);
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
    LinkedHashTreeMap.EntrySet.1 local1 = new com/google/gson/internal/LinkedHashTreeMap$EntrySet$1;
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
    LinkedHashTreeMap localLinkedHashTreeMap = this.this$0;
    paramObject = (Map.Entry)paramObject;
    paramObject = localLinkedHashTreeMap.findByEntry(paramObject);
    if (paramObject == null) {
      return false;
    }
    localLinkedHashTreeMap = this.this$0;
    bool2 = true;
    localLinkedHashTreeMap.removeInternal(paramObject, bool2);
    return bool2;
  }
  
  public int size()
  {
    return this.this$0.size;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.LinkedHashTreeMap.EntrySet
 * JD-Core Version:    0.7.0.1
 */