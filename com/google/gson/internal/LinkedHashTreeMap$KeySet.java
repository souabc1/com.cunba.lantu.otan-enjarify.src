package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;

final class LinkedHashTreeMap$KeySet
  extends AbstractSet
{
  public LinkedHashTreeMap$KeySet(LinkedHashTreeMap paramLinkedHashTreeMap) {}
  
  public void clear()
  {
    this.this$0.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    return this.this$0.containsKey(paramObject);
  }
  
  public Iterator iterator()
  {
    LinkedHashTreeMap.KeySet.1 local1 = new com/google/gson/internal/LinkedHashTreeMap$KeySet$1;
    local1.<init>(this);
    return local1;
  }
  
  public boolean remove(Object paramObject)
  {
    LinkedHashTreeMap localLinkedHashTreeMap = this.this$0;
    paramObject = localLinkedHashTreeMap.removeInternalByKey(paramObject);
    boolean bool;
    if (paramObject != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramObject = null;
    }
    return bool;
  }
  
  public int size()
  {
    return this.this$0.size;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.LinkedHashTreeMap.KeySet
 * JD-Core Version:    0.7.0.1
 */