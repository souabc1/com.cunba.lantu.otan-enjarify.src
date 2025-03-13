package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class LinkedHashTreeMap$LinkedTreeMapIterator
  implements Iterator
{
  int expectedModCount;
  LinkedHashTreeMap.Node lastReturned;
  LinkedHashTreeMap.Node next;
  
  public LinkedHashTreeMap$LinkedTreeMapIterator(LinkedHashTreeMap paramLinkedHashTreeMap)
  {
    LinkedHashTreeMap.Node localNode = paramLinkedHashTreeMap.header.next;
    this.next = localNode;
    this.lastReturned = null;
    int i = paramLinkedHashTreeMap.modCount;
    this.expectedModCount = i;
  }
  
  public final boolean hasNext()
  {
    LinkedHashTreeMap.Node localNode1 = this.next;
    LinkedHashTreeMap.Node localNode2 = this.this$0.header;
    boolean bool;
    if (localNode1 != localNode2)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localNode1 = null;
    }
    return bool;
  }
  
  public final LinkedHashTreeMap.Node nextNode()
  {
    Object localObject1 = this.next;
    Object localObject2 = this.this$0;
    LinkedHashTreeMap.Node localNode = ((LinkedHashTreeMap)localObject2).header;
    if (localObject1 != localNode)
    {
      int i = ((LinkedHashTreeMap)localObject2).modCount;
      int j = this.expectedModCount;
      if (i == j)
      {
        localObject2 = ((LinkedHashTreeMap.Node)localObject1).next;
        this.next = ((LinkedHashTreeMap.Node)localObject2);
        this.lastReturned = ((LinkedHashTreeMap.Node)localObject1);
        return localObject1;
      }
      localObject1 = new java/util/ConcurrentModificationException;
      ((ConcurrentModificationException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    localObject1 = new java/util/NoSuchElementException;
    ((NoSuchElementException)localObject1).<init>();
    throw ((Throwable)localObject1);
  }
  
  public final void remove()
  {
    Object localObject = this.lastReturned;
    if (localObject != null)
    {
      this.this$0.removeInternal((LinkedHashTreeMap.Node)localObject, true);
      this.lastReturned = null;
      int i = this.this$0.modCount;
      this.expectedModCount = i;
      return;
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.LinkedHashTreeMap.LinkedTreeMapIterator
 * JD-Core Version:    0.7.0.1
 */