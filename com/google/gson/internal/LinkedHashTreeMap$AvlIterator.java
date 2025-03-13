package com.google.gson.internal;

class LinkedHashTreeMap$AvlIterator
{
  private LinkedHashTreeMap.Node stackTop;
  
  public LinkedHashTreeMap.Node next()
  {
    LinkedHashTreeMap.Node localNode = this.stackTop;
    Object localObject1 = null;
    if (localNode == null) {
      return null;
    }
    Object localObject2 = localNode.parent;
    localNode.parent = null;
    Object localObject3;
    for (localObject1 = localNode.right;; localObject1 = ((LinkedHashTreeMap.Node)localObject2).left)
    {
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
      if (localObject2 == null) {
        break;
      }
      ((LinkedHashTreeMap.Node)localObject2).parent = localObject3;
    }
    this.stackTop = localObject3;
    return localNode;
  }
  
  public void reset(LinkedHashTreeMap.Node paramNode)
  {
    LinkedHashTreeMap.Node localNode1 = null;
    while (paramNode != null)
    {
      paramNode.parent = localNode1;
      LinkedHashTreeMap.Node localNode2 = paramNode.left;
      localNode1 = paramNode;
      paramNode = localNode2;
    }
    this.stackTop = localNode1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.LinkedHashTreeMap.AvlIterator
 * JD-Core Version:    0.7.0.1
 */