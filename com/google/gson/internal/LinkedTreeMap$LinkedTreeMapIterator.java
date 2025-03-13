package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class LinkedTreeMap$LinkedTreeMapIterator
  implements Iterator
{
  int expectedModCount;
  LinkedTreeMap.Node lastReturned;
  LinkedTreeMap.Node next;
  
  public LinkedTreeMap$LinkedTreeMapIterator(LinkedTreeMap paramLinkedTreeMap)
  {
    LinkedTreeMap.Node localNode = paramLinkedTreeMap.header.next;
    this.next = localNode;
    this.lastReturned = null;
    int i = paramLinkedTreeMap.modCount;
    this.expectedModCount = i;
  }
  
  public final boolean hasNext()
  {
    LinkedTreeMap.Node localNode1 = this.next;
    LinkedTreeMap.Node localNode2 = this.this$0.header;
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
  
  public final LinkedTreeMap.Node nextNode()
  {
    Object localObject1 = this.next;
    Object localObject2 = this.this$0;
    LinkedTreeMap.Node localNode = ((LinkedTreeMap)localObject2).header;
    if (localObject1 != localNode)
    {
      int i = ((LinkedTreeMap)localObject2).modCount;
      int j = this.expectedModCount;
      if (i == j)
      {
        localObject2 = ((LinkedTreeMap.Node)localObject1).next;
        this.next = ((LinkedTreeMap.Node)localObject2);
        this.lastReturned = ((LinkedTreeMap.Node)localObject1);
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
      this.this$0.removeInternal((LinkedTreeMap.Node)localObject, true);
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
 * Qualified Name:     com.google.gson.internal.LinkedTreeMap.LinkedTreeMapIterator
 * JD-Core Version:    0.7.0.1
 */