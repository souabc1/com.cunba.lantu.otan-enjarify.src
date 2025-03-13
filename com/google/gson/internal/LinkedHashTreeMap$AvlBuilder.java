package com.google.gson.internal;

final class LinkedHashTreeMap$AvlBuilder
{
  private int leavesSkipped;
  private int leavesToSkip;
  private int size;
  private LinkedHashTreeMap.Node stack;
  
  public void add(LinkedHashTreeMap.Node paramNode)
  {
    paramNode.right = null;
    paramNode.parent = null;
    paramNode.left = null;
    int i = 1;
    paramNode.height = i;
    int j = this.leavesToSkip;
    int k;
    int m;
    if (j > 0)
    {
      k = this.size;
      m = k & 0x1;
      if (m == 0)
      {
        k += i;
        this.size = k;
        j -= i;
        this.leavesToSkip = j;
        j = this.leavesSkipped + i;
        this.leavesSkipped = j;
      }
    }
    LinkedHashTreeMap.Node localNode1 = this.stack;
    paramNode.parent = localNode1;
    this.stack = paramNode;
    int n = this.size + i;
    this.size = n;
    j = this.leavesToSkip;
    if (j > 0)
    {
      k = n & 0x1;
      if (k == 0)
      {
        n += i;
        this.size = n;
        j -= i;
        this.leavesToSkip = j;
        n = this.leavesSkipped + i;
        this.leavesSkipped = n;
      }
    }
    n = 4;
    for (;;)
    {
      j = this.size;
      k = n + -1;
      j &= k;
      if (j != k) {
        break;
      }
      j = this.leavesSkipped;
      LinkedHashTreeMap.Node localNode2;
      LinkedHashTreeMap.Node localNode3;
      int i1;
      if (j == 0)
      {
        localNode1 = this.stack;
        localNode2 = localNode1.parent;
        localNode3 = localNode2.parent;
        LinkedHashTreeMap.Node localNode4 = localNode3.parent;
        localNode2.parent = localNode4;
        this.stack = localNode2;
        localNode2.left = localNode3;
        localNode2.right = localNode1;
        i1 = localNode1.height + i;
        localNode2.height = i1;
        localNode3.parent = localNode2;
        localNode1.parent = localNode2;
      }
      else
      {
        k = 0;
        localNode2 = null;
        if (j == i)
        {
          localNode1 = this.stack;
          localNode3 = localNode1.parent;
          this.stack = localNode3;
          localNode3.right = localNode1;
          i1 = localNode1.height + i;
          localNode3.height = i1;
          localNode1.parent = localNode3;
        }
        do
        {
          this.leavesSkipped = 0;
          break;
          m = 2;
        } while (j == m);
      }
      n *= 2;
    }
  }
  
  public void reset(int paramInt)
  {
    int i = Integer.highestOneBit(paramInt) * 2 + -1 - paramInt;
    this.leavesToSkip = i;
    this.size = 0;
    this.leavesSkipped = 0;
    this.stack = null;
  }
  
  public LinkedHashTreeMap.Node root()
  {
    Object localObject = this.stack;
    LinkedHashTreeMap.Node localNode = ((LinkedHashTreeMap.Node)localObject).parent;
    if (localNode == null) {
      return localObject;
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.LinkedHashTreeMap.AvlBuilder
 * JD-Core Version:    0.7.0.1
 */