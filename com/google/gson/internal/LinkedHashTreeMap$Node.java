package com.google.gson.internal;

import java.util.Map.Entry;

final class LinkedHashTreeMap$Node
  implements Map.Entry
{
  final int hash;
  int height;
  final Object key;
  Node left;
  Node next;
  Node parent;
  Node prev;
  Node right;
  Object value;
  
  public LinkedHashTreeMap$Node()
  {
    this.key = null;
    this.hash = -1;
    this.prev = this;
    this.next = this;
  }
  
  public LinkedHashTreeMap$Node(Node paramNode1, Object paramObject, int paramInt, Node paramNode2, Node paramNode3)
  {
    this.parent = paramNode1;
    this.key = paramObject;
    this.hash = paramInt;
    this.height = 1;
    this.next = paramNode2;
    this.prev = paramNode3;
    paramNode3.next = this;
    paramNode2.prev = this;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    if (bool1)
    {
      paramObject = (Map.Entry)paramObject;
      Object localObject1 = this.key;
      if (localObject1 == null)
      {
        localObject1 = paramObject.getKey();
        if (localObject1 != null) {
          return bool2;
        }
      }
      else
      {
        Object localObject2 = paramObject.getKey();
        bool1 = localObject1.equals(localObject2);
        if (!bool1) {
          return bool2;
        }
      }
      localObject1 = this.value;
      paramObject = paramObject.getValue();
      if (localObject1 == null)
      {
        if (paramObject != null) {
          return bool2;
        }
      }
      else
      {
        boolean bool3 = localObject1.equals(paramObject);
        if (!bool3) {
          return bool2;
        }
      }
      bool2 = true;
    }
    return bool2;
  }
  
  public Node first()
  {
    Object localObject1 = this.left;
    Object localObject2 = this;
    while (localObject1 != null)
    {
      Node localNode = ((Node)localObject1).left;
      localObject2 = localObject1;
      localObject1 = localNode;
    }
    return localObject2;
  }
  
  public Object getKey()
  {
    return this.key;
  }
  
  public Object getValue()
  {
    return this.value;
  }
  
  public int hashCode()
  {
    Object localObject1 = this.key;
    int i = 0;
    int j;
    if (localObject1 == null)
    {
      j = 0;
      localObject1 = null;
    }
    else
    {
      j = localObject1.hashCode();
    }
    Object localObject2 = this.value;
    if (localObject2 != null) {
      i = localObject2.hashCode();
    }
    return j ^ i;
  }
  
  public Node last()
  {
    Object localObject1 = this.right;
    Object localObject2 = this;
    while (localObject1 != null)
    {
      Node localNode = ((Node)localObject1).right;
      localObject2 = localObject1;
      localObject1 = localNode;
    }
    return localObject2;
  }
  
  public Object setValue(Object paramObject)
  {
    Object localObject = this.value;
    this.value = paramObject;
    return localObject;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = this.key;
    localStringBuilder.append(localObject);
    localStringBuilder.append("=");
    localObject = this.value;
    localStringBuilder.append(localObject);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.LinkedHashTreeMap.Node
 * JD-Core Version:    0.7.0.1
 */