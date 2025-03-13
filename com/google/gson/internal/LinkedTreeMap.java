package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import m54207b69;

public final class LinkedTreeMap
  extends AbstractMap
  implements Serializable
{
  private static final Comparator NATURAL_ORDER;
  Comparator comparator;
  private LinkedTreeMap.EntrySet entrySet;
  final LinkedTreeMap.Node header;
  private LinkedTreeMap.KeySet keySet;
  int modCount = 0;
  LinkedTreeMap.Node root;
  int size = 0;
  
  static
  {
    LinkedTreeMap.1 local1 = new com/google/gson/internal/LinkedTreeMap$1;
    local1.<init>();
    NATURAL_ORDER = local1;
  }
  
  public LinkedTreeMap()
  {
    this(localComparator);
  }
  
  public LinkedTreeMap(Comparator paramComparator)
  {
    LinkedTreeMap.Node localNode = new com/google/gson/internal/LinkedTreeMap$Node;
    localNode.<init>();
    this.header = localNode;
    if (paramComparator == null) {
      paramComparator = NATURAL_ORDER;
    }
    this.comparator = paramComparator;
  }
  
  private boolean equal(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != paramObject2) {
      if (paramObject1 != null)
      {
        bool = paramObject1.equals(paramObject2);
        if (bool) {}
      }
      else
      {
        bool = false;
        paramObject1 = null;
        return bool;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  private void rebalance(LinkedTreeMap.Node paramNode, boolean paramBoolean)
  {
    while (paramNode != null)
    {
      LinkedTreeMap.Node localNode1 = paramNode.left;
      LinkedTreeMap.Node localNode2 = paramNode.right;
      int i = 0;
      int j;
      LinkedTreeMap.Node localNode3;
      if (localNode1 != null)
      {
        j = localNode1.height;
      }
      else
      {
        j = 0;
        localNode3 = null;
      }
      int k;
      if (localNode2 != null) {
        k = localNode2.height;
      } else {
        k = 0;
      }
      int m = j - k;
      int n = -2;
      int i1;
      if (m == n)
      {
        localNode1 = localNode2.left;
        localNode3 = localNode2.right;
        if (localNode3 != null)
        {
          j = localNode3.height;
        }
        else
        {
          j = 0;
          localNode3 = null;
        }
        if (localNode1 != null) {
          i = localNode1.height;
        }
        i -= j;
        i1 = -1;
        if ((i != i1) && ((i != 0) || (paramBoolean))) {
          rotateRight(localNode2);
        }
        rotateLeft(paramNode);
        if (paramBoolean) {
          break;
        }
      }
      else
      {
        int i2 = 2;
        n = 1;
        if (m == i2)
        {
          localNode2 = localNode1.left;
          localNode3 = localNode1.right;
          if (localNode3 != null)
          {
            j = localNode3.height;
          }
          else
          {
            j = 0;
            localNode3 = null;
          }
          if (localNode2 != null) {
            i = localNode2.height;
          }
          i -= j;
          if ((i != n) && ((i != 0) || (paramBoolean))) {
            rotateLeft(localNode1);
          }
          rotateRight(paramNode);
          if (paramBoolean) {
            break;
          }
        }
        else if (m == 0)
        {
          j += 1;
          paramNode.height = j;
          if (paramBoolean) {
            break;
          }
        }
        else
        {
          i1 = Math.max(j, k) + n;
          paramNode.height = i1;
          if (!paramBoolean) {
            break;
          }
        }
      }
      paramNode = paramNode.parent;
    }
  }
  
  private void replaceInParent(LinkedTreeMap.Node paramNode1, LinkedTreeMap.Node paramNode2)
  {
    LinkedTreeMap.Node localNode1 = paramNode1.parent;
    LinkedTreeMap.Node localNode2 = null;
    paramNode1.parent = null;
    if (paramNode2 != null) {
      paramNode2.parent = localNode1;
    }
    if (localNode1 != null)
    {
      localNode2 = localNode1.left;
      if (localNode2 == paramNode1) {
        localNode1.left = paramNode2;
      } else {
        localNode1.right = paramNode2;
      }
    }
    else
    {
      this.root = paramNode2;
    }
  }
  
  private void rotateLeft(LinkedTreeMap.Node paramNode)
  {
    LinkedTreeMap.Node localNode1 = paramNode.left;
    LinkedTreeMap.Node localNode2 = paramNode.right;
    LinkedTreeMap.Node localNode3 = localNode2.left;
    LinkedTreeMap.Node localNode4 = localNode2.right;
    paramNode.right = localNode3;
    if (localNode3 != null) {
      localNode3.parent = paramNode;
    }
    replaceInParent(paramNode, localNode2);
    localNode2.left = paramNode;
    paramNode.parent = localNode2;
    int i = 0;
    if (localNode1 != null)
    {
      j = localNode1.height;
    }
    else
    {
      j = 0;
      localNode1 = null;
    }
    int k;
    if (localNode3 != null)
    {
      k = localNode3.height;
    }
    else
    {
      k = 0;
      localNode3 = null;
    }
    int j = Math.max(j, k) + 1;
    paramNode.height = j;
    if (localNode4 != null) {
      i = localNode4.height;
    }
    int m = Math.max(j, i) + 1;
    localNode2.height = m;
  }
  
  private void rotateRight(LinkedTreeMap.Node paramNode)
  {
    LinkedTreeMap.Node localNode1 = paramNode.left;
    LinkedTreeMap.Node localNode2 = paramNode.right;
    LinkedTreeMap.Node localNode3 = localNode1.left;
    LinkedTreeMap.Node localNode4 = localNode1.right;
    paramNode.left = localNode4;
    if (localNode4 != null) {
      localNode4.parent = paramNode;
    }
    replaceInParent(paramNode, localNode1);
    localNode1.right = paramNode;
    paramNode.parent = localNode1;
    int i = 0;
    if (localNode2 != null)
    {
      j = localNode2.height;
    }
    else
    {
      j = 0;
      localNode2 = null;
    }
    int k;
    if (localNode4 != null)
    {
      k = localNode4.height;
    }
    else
    {
      k = 0;
      localNode4 = null;
    }
    int j = Math.max(j, k) + 1;
    paramNode.height = j;
    if (localNode3 != null) {
      i = localNode3.height;
    }
    int m = Math.max(j, i) + 1;
    localNode1.height = m;
  }
  
  private Object writeReplace()
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>(this);
    return localLinkedHashMap;
  }
  
  public void clear()
  {
    this.root = null;
    this.size = 0;
    int i = this.modCount + 1;
    this.modCount = i;
    LinkedTreeMap.Node localNode = this.header;
    localNode.prev = localNode;
    localNode.next = localNode;
  }
  
  public boolean containsKey(Object paramObject)
  {
    paramObject = findByObject(paramObject);
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
  
  public Set entrySet()
  {
    LinkedTreeMap.EntrySet localEntrySet = this.entrySet;
    if (localEntrySet == null)
    {
      localEntrySet = new com/google/gson/internal/LinkedTreeMap$EntrySet;
      localEntrySet.<init>(this);
      this.entrySet = localEntrySet;
    }
    return localEntrySet;
  }
  
  public LinkedTreeMap.Node find(Object paramObject, boolean paramBoolean)
  {
    Object localObject1 = this.comparator;
    Object localObject2 = this.root;
    int i = 0;
    Object localObject3;
    if (localObject2 != null)
    {
      localObject3 = NATURAL_ORDER;
      if (localObject1 == localObject3)
      {
        localObject3 = paramObject;
        localObject3 = (Comparable)paramObject;
      }
      else
      {
        localObject3 = null;
      }
      for (;;)
      {
        localObject4 = ((LinkedTreeMap.Node)localObject2).key;
        if (localObject3 != null) {
          j = ((Comparable)localObject3).compareTo(localObject4);
        } else {
          j = ((Comparator)localObject1).compare(paramObject, localObject4);
        }
        if (j == 0) {
          return localObject2;
        }
        LinkedTreeMap.Node localNode;
        if (j < 0) {
          localNode = ((LinkedTreeMap.Node)localObject2).left;
        } else {
          localNode = ((LinkedTreeMap.Node)localObject2).right;
        }
        if (localNode == null) {
          break;
        }
        localObject2 = localNode;
      }
    }
    int j = 0;
    Object localObject4 = null;
    if (!paramBoolean) {
      return null;
    }
    Object localObject5 = this.header;
    i = 1;
    if (localObject2 == null)
    {
      localObject3 = NATURAL_ORDER;
      if (localObject1 == localObject3)
      {
        boolean bool = paramObject instanceof Comparable;
        if (!bool)
        {
          localObject5 = new java/lang/ClassCastException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          paramObject = paramObject.getClass().getName();
          ((StringBuilder)localObject1).append(paramObject);
          paramObject = m54207b69.F54207b69_11("Oq5119045423230B583A27260C1C101E222D25");
          ((StringBuilder)localObject1).append(paramObject);
          paramObject = ((StringBuilder)localObject1).toString();
          ((ClassCastException)localObject5).<init>(paramObject);
          throw ((Throwable)localObject5);
        }
      }
      localObject1 = new com/google/gson/internal/LinkedTreeMap$Node;
      localObject3 = ((LinkedTreeMap.Node)localObject5).prev;
      ((LinkedTreeMap.Node)localObject1).<init>((LinkedTreeMap.Node)localObject2, paramObject, (LinkedTreeMap.Node)localObject5, (LinkedTreeMap.Node)localObject3);
      this.root = ((LinkedTreeMap.Node)localObject1);
    }
    else
    {
      localObject1 = new com/google/gson/internal/LinkedTreeMap$Node;
      localObject3 = ((LinkedTreeMap.Node)localObject5).prev;
      ((LinkedTreeMap.Node)localObject1).<init>((LinkedTreeMap.Node)localObject2, paramObject, (LinkedTreeMap.Node)localObject5, (LinkedTreeMap.Node)localObject3);
      if (j < 0) {
        ((LinkedTreeMap.Node)localObject2).left = ((LinkedTreeMap.Node)localObject1);
      } else {
        ((LinkedTreeMap.Node)localObject2).right = ((LinkedTreeMap.Node)localObject1);
      }
      rebalance((LinkedTreeMap.Node)localObject2, i);
    }
    int k = this.size + i;
    this.size = k;
    k = this.modCount + i;
    this.modCount = k;
    return localObject1;
  }
  
  public LinkedTreeMap.Node findByEntry(Map.Entry paramEntry)
  {
    Object localObject1 = paramEntry.getKey();
    localObject1 = findByObject(localObject1);
    if (localObject1 != null)
    {
      Object localObject2 = ((LinkedTreeMap.Node)localObject1).value;
      paramEntry = paramEntry.getValue();
      bool = equal(localObject2, paramEntry);
      if (bool)
      {
        bool = true;
        break label53;
      }
    }
    boolean bool = false;
    paramEntry = null;
    label53:
    if (!bool) {
      localObject1 = null;
    }
    return localObject1;
  }
  
  public LinkedTreeMap.Node findByObject(Object paramObject)
  {
    LinkedTreeMap.Node localNode = null;
    if (paramObject != null) {}
    try
    {
      localNode = find(paramObject, false);
    }
    catch (ClassCastException localClassCastException)
    {
      label13:
      break label13;
    }
    return localNode;
  }
  
  public Object get(Object paramObject)
  {
    paramObject = findByObject(paramObject);
    if (paramObject != null) {
      paramObject = paramObject.value;
    } else {
      paramObject = null;
    }
    return paramObject;
  }
  
  public Set keySet()
  {
    LinkedTreeMap.KeySet localKeySet = this.keySet;
    if (localKeySet == null)
    {
      localKeySet = new com/google/gson/internal/LinkedTreeMap$KeySet;
      localKeySet.<init>(this);
      this.keySet = localKeySet;
    }
    return localKeySet;
  }
  
  public Object put(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null)
    {
      paramObject1 = find(paramObject1, true);
      Object localObject = paramObject1.value;
      paramObject1.value = paramObject2;
      return localObject;
    }
    paramObject1 = new java/lang/NullPointerException;
    paramObject2 = m54207b69.F54207b69_11(">-464956101415134A604A4B");
    paramObject1.<init>(paramObject2);
    throw paramObject1;
  }
  
  public Object remove(Object paramObject)
  {
    paramObject = removeInternalByKey(paramObject);
    if (paramObject != null) {
      paramObject = paramObject.value;
    } else {
      paramObject = null;
    }
    return paramObject;
  }
  
  public void removeInternal(LinkedTreeMap.Node paramNode, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      localNode1 = paramNode.prev;
      localNode2 = paramNode.next;
      localNode1.next = localNode2;
      localNode2 = paramNode.next;
      localNode2.prev = localNode1;
    }
    LinkedTreeMap.Node localNode1 = paramNode.left;
    LinkedTreeMap.Node localNode2 = paramNode.right;
    LinkedTreeMap.Node localNode3 = paramNode.parent;
    int i = 0;
    if ((localNode1 != null) && (localNode2 != null))
    {
      int j = localNode1.height;
      int k = localNode2.height;
      if (j > k) {
        localNode1 = localNode1.last();
      } else {
        localNode1 = localNode2.first();
      }
      removeInternal(localNode1, false);
      localNode2 = paramNode.left;
      if (localNode2 != null)
      {
        j = localNode2.height;
        localNode1.left = localNode2;
        localNode2.parent = localNode1;
        paramNode.left = null;
      }
      else
      {
        j = 0;
        localNode3 = null;
      }
      localNode2 = paramNode.right;
      if (localNode2 != null)
      {
        i = localNode2.height;
        localNode1.right = localNode2;
        localNode2.parent = localNode1;
        paramNode.right = null;
      }
      int m = Math.max(j, i) + 1;
      localNode1.height = m;
      replaceInParent(paramNode, localNode1);
      return;
    }
    if (localNode1 != null)
    {
      replaceInParent(paramNode, localNode1);
      paramNode.left = null;
    }
    else if (localNode2 != null)
    {
      replaceInParent(paramNode, localNode2);
      paramNode.right = null;
    }
    else
    {
      replaceInParent(paramNode, null);
    }
    rebalance(localNode3, false);
    int n = this.size + -1;
    this.size = n;
    n = this.modCount + 1;
    this.modCount = n;
  }
  
  public LinkedTreeMap.Node removeInternalByKey(Object paramObject)
  {
    paramObject = findByObject(paramObject);
    if (paramObject != null)
    {
      boolean bool = true;
      removeInternal(paramObject, bool);
    }
    return paramObject;
  }
  
  public int size()
  {
    return this.size;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.LinkedTreeMap
 * JD-Core Version:    0.7.0.1
 */