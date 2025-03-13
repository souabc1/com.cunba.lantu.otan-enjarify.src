package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import m54207b69;

public final class LinkedHashTreeMap
  extends AbstractMap
  implements Serializable
{
  private static final Comparator NATURAL_ORDER;
  Comparator comparator;
  private LinkedHashTreeMap.EntrySet entrySet;
  final LinkedHashTreeMap.Node header;
  private LinkedHashTreeMap.KeySet keySet;
  int modCount;
  int size;
  LinkedHashTreeMap.Node[] table;
  int threshold;
  
  static
  {
    LinkedHashTreeMap.1 local1 = new com/google/gson/internal/LinkedHashTreeMap$1;
    local1.<init>();
    NATURAL_ORDER = local1;
  }
  
  public LinkedHashTreeMap()
  {
    this(localComparator);
  }
  
  public LinkedHashTreeMap(Comparator paramComparator)
  {
    int i = 0;
    this.size = 0;
    this.modCount = 0;
    if (paramComparator == null) {
      paramComparator = NATURAL_ORDER;
    }
    this.comparator = paramComparator;
    paramComparator = new com/google/gson/internal/LinkedHashTreeMap$Node;
    paramComparator.<init>();
    this.header = paramComparator;
    paramComparator = new LinkedHashTreeMap.Node[16];
    this.table = paramComparator;
    i = paramComparator.length / 2;
    int j = paramComparator.length / 4;
    i += j;
    this.threshold = i;
  }
  
  private void doubleCapacity()
  {
    LinkedHashTreeMap.Node[] arrayOfNode = doubleCapacity(this.table);
    this.table = arrayOfNode;
    int i = arrayOfNode.length / 2;
    int j = arrayOfNode.length / 4;
    i += j;
    this.threshold = i;
  }
  
  public static LinkedHashTreeMap.Node[] doubleCapacity(LinkedHashTreeMap.Node[] paramArrayOfNode)
  {
    int i = paramArrayOfNode.length;
    int j = i * 2;
    LinkedHashTreeMap.Node[] arrayOfNode = new LinkedHashTreeMap.Node[j];
    LinkedHashTreeMap.AvlIterator localAvlIterator = new com/google/gson/internal/LinkedHashTreeMap$AvlIterator;
    localAvlIterator.<init>();
    LinkedHashTreeMap.AvlBuilder localAvlBuilder1 = new com/google/gson/internal/LinkedHashTreeMap$AvlBuilder;
    localAvlBuilder1.<init>();
    LinkedHashTreeMap.AvlBuilder localAvlBuilder2 = new com/google/gson/internal/LinkedHashTreeMap$AvlBuilder;
    localAvlBuilder2.<init>();
    int k = 0;
    while (k < i)
    {
      LinkedHashTreeMap.Node localNode1 = paramArrayOfNode[k];
      if (localNode1 != null)
      {
        localAvlIterator.reset(localNode1);
        int m = 0;
        LinkedHashTreeMap.Node localNode2 = null;
        int n = 0;
        int i1;
        for (;;)
        {
          LinkedHashTreeMap.Node localNode3 = localAvlIterator.next();
          if (localNode3 == null) {
            break;
          }
          i1 = localNode3.hash & i;
          if (i1 == 0) {
            m += 1;
          } else {
            n += 1;
          }
        }
        localAvlBuilder1.reset(m);
        localAvlBuilder2.reset(n);
        localAvlIterator.reset(localNode1);
        for (;;)
        {
          localNode1 = localAvlIterator.next();
          if (localNode1 == null) {
            break;
          }
          i1 = localNode1.hash & i;
          if (i1 == 0) {
            localAvlBuilder1.add(localNode1);
          } else {
            localAvlBuilder2.add(localNode1);
          }
        }
        localNode1 = null;
        if (m > 0)
        {
          localNode2 = localAvlBuilder1.root();
        }
        else
        {
          m = 0;
          localNode2 = null;
        }
        arrayOfNode[k] = localNode2;
        m = k + i;
        if (n > 0) {
          localNode1 = localAvlBuilder2.root();
        }
        arrayOfNode[m] = localNode1;
      }
      k += 1;
    }
    return arrayOfNode;
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
  
  private void rebalance(LinkedHashTreeMap.Node paramNode, boolean paramBoolean)
  {
    while (paramNode != null)
    {
      LinkedHashTreeMap.Node localNode1 = paramNode.left;
      LinkedHashTreeMap.Node localNode2 = paramNode.right;
      int i = 0;
      int j;
      LinkedHashTreeMap.Node localNode3;
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
  
  private void replaceInParent(LinkedHashTreeMap.Node paramNode1, LinkedHashTreeMap.Node paramNode2)
  {
    Object localObject = paramNode1.parent;
    int i = 0;
    LinkedHashTreeMap.Node localNode = null;
    paramNode1.parent = null;
    if (paramNode2 != null) {
      paramNode2.parent = ((LinkedHashTreeMap.Node)localObject);
    }
    if (localObject != null)
    {
      localNode = ((LinkedHashTreeMap.Node)localObject).left;
      if (localNode == paramNode1) {
        ((LinkedHashTreeMap.Node)localObject).left = paramNode2;
      } else {
        ((LinkedHashTreeMap.Node)localObject).right = paramNode2;
      }
    }
    else
    {
      int j = paramNode1.hash;
      localObject = this.table;
      i = localObject.length + -1;
      j &= i;
      localObject[j] = paramNode2;
    }
  }
  
  private void rotateLeft(LinkedHashTreeMap.Node paramNode)
  {
    LinkedHashTreeMap.Node localNode1 = paramNode.left;
    LinkedHashTreeMap.Node localNode2 = paramNode.right;
    LinkedHashTreeMap.Node localNode3 = localNode2.left;
    LinkedHashTreeMap.Node localNode4 = localNode2.right;
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
  
  private void rotateRight(LinkedHashTreeMap.Node paramNode)
  {
    LinkedHashTreeMap.Node localNode1 = paramNode.left;
    LinkedHashTreeMap.Node localNode2 = paramNode.right;
    LinkedHashTreeMap.Node localNode3 = localNode1.left;
    LinkedHashTreeMap.Node localNode4 = localNode1.right;
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
  
  private static int secondaryHash(int paramInt)
  {
    int i = paramInt >>> 20;
    int j = paramInt >>> 12;
    i ^= j;
    paramInt ^= i;
    i = paramInt >>> 7 ^ paramInt;
    return paramInt >>> 4 ^ i;
  }
  
  private Object writeReplace()
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>(this);
    return localLinkedHashMap;
  }
  
  public void clear()
  {
    Arrays.fill(this.table, null);
    this.size = 0;
    int i = this.modCount + 1;
    this.modCount = i;
    LinkedHashTreeMap.Node localNode1 = this.header;
    LinkedHashTreeMap.Node localNode2;
    for (Object localObject = localNode1.next; localObject != localNode1; localObject = localNode2)
    {
      localNode2 = ((LinkedHashTreeMap.Node)localObject).next;
      ((LinkedHashTreeMap.Node)localObject).prev = null;
      ((LinkedHashTreeMap.Node)localObject).next = null;
    }
    localNode1.prev = localNode1;
    localNode1.next = localNode1;
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
    LinkedHashTreeMap.EntrySet localEntrySet = this.entrySet;
    if (localEntrySet == null)
    {
      localEntrySet = new com/google/gson/internal/LinkedHashTreeMap$EntrySet;
      localEntrySet.<init>(this);
      this.entrySet = localEntrySet;
    }
    return localEntrySet;
  }
  
  public LinkedHashTreeMap.Node find(Object paramObject, boolean paramBoolean)
  {
    Object localObject1 = this.comparator;
    LinkedHashTreeMap.Node[] arrayOfNode = this.table;
    int i = secondaryHash(paramObject.hashCode());
    int j = arrayOfNode.length;
    int k = 1;
    j = j - k & i;
    Object localObject2 = arrayOfNode[j];
    Object localObject3;
    LinkedHashTreeMap.Node localNode;
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
        localObject4 = ((LinkedHashTreeMap.Node)localObject2).key;
        if (localObject3 != null) {
          m = ((Comparable)localObject3).compareTo(localObject4);
        } else {
          m = ((Comparator)localObject1).compare(paramObject, localObject4);
        }
        if (m == 0) {
          return localObject2;
        }
        if (m < 0) {
          localNode = ((LinkedHashTreeMap.Node)localObject2).left;
        } else {
          localNode = ((LinkedHashTreeMap.Node)localObject2).right;
        }
        if (localNode == null) {
          break;
        }
        localObject2 = localNode;
      }
    }
    int m = 0;
    Object localObject4 = null;
    Object localObject5 = localObject2;
    if (!paramBoolean) {
      return null;
    }
    localObject4 = this.header;
    Object localObject6;
    if (localObject2 == null)
    {
      localObject6 = NATURAL_ORDER;
      if (localObject1 == localObject6)
      {
        paramBoolean = paramObject instanceof Comparable;
        if (!paramBoolean)
        {
          localObject6 = new java/lang/ClassCastException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          paramObject = paramObject.getClass().getName();
          ((StringBuilder)localObject1).append(paramObject);
          paramObject = m54207b69.F54207b69_11("Oq5119045423230B583A27260C1C101E222D25");
          ((StringBuilder)localObject1).append(paramObject);
          paramObject = ((StringBuilder)localObject1).toString();
          ((ClassCastException)localObject6).<init>(paramObject);
          throw ((Throwable)localObject6);
        }
      }
      localObject6 = new com/google/gson/internal/LinkedHashTreeMap$Node;
      localNode = ((LinkedHashTreeMap.Node)localObject4).prev;
      localObject2 = localObject6;
      localObject3 = paramObject;
      ((LinkedHashTreeMap.Node)localObject6).<init>(localObject5, paramObject, i, (LinkedHashTreeMap.Node)localObject4, localNode);
      arrayOfNode[j] = localObject6;
    }
    else
    {
      localObject6 = new com/google/gson/internal/LinkedHashTreeMap$Node;
      localNode = ((LinkedHashTreeMap.Node)localObject4).prev;
      localObject2 = localObject6;
      localObject3 = paramObject;
      ((LinkedHashTreeMap.Node)localObject6).<init>(localObject5, paramObject, i, (LinkedHashTreeMap.Node)localObject4, localNode);
      if (m < 0) {
        localObject5.left = ((LinkedHashTreeMap.Node)localObject6);
      } else {
        localObject5.right = ((LinkedHashTreeMap.Node)localObject6);
      }
      rebalance(localObject5, k);
    }
    int n = this.size;
    int i1 = n + 1;
    this.size = i1;
    i1 = this.threshold;
    if (n > i1) {
      doubleCapacity();
    }
    n = this.modCount + k;
    this.modCount = n;
    return localObject6;
  }
  
  public LinkedHashTreeMap.Node findByEntry(Map.Entry paramEntry)
  {
    Object localObject1 = paramEntry.getKey();
    localObject1 = findByObject(localObject1);
    if (localObject1 != null)
    {
      Object localObject2 = ((LinkedHashTreeMap.Node)localObject1).value;
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
  
  public LinkedHashTreeMap.Node findByObject(Object paramObject)
  {
    LinkedHashTreeMap.Node localNode = null;
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
    LinkedHashTreeMap.KeySet localKeySet = this.keySet;
    if (localKeySet == null)
    {
      localKeySet = new com/google/gson/internal/LinkedHashTreeMap$KeySet;
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
  
  public void removeInternal(LinkedHashTreeMap.Node paramNode, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      localNode1 = paramNode.prev;
      localNode2 = paramNode.next;
      localNode1.next = localNode2;
      localNode2 = paramNode.next;
      localNode2.prev = localNode1;
      paramNode.prev = null;
      paramNode.next = null;
    }
    LinkedHashTreeMap.Node localNode1 = paramNode.left;
    LinkedHashTreeMap.Node localNode2 = paramNode.right;
    LinkedHashTreeMap.Node localNode3 = paramNode.parent;
    int j = 0;
    if ((localNode1 != null) && (localNode2 != null))
    {
      int k = localNode1.height;
      int m = localNode2.height;
      if (k > m) {
        localNode1 = localNode1.last();
      } else {
        localNode1 = localNode2.first();
      }
      removeInternal(localNode1, false);
      localNode2 = paramNode.left;
      if (localNode2 != null)
      {
        k = localNode2.height;
        localNode1.left = localNode2;
        localNode2.parent = localNode1;
        paramNode.left = null;
      }
      else
      {
        k = 0;
        localNode3 = null;
      }
      localNode2 = paramNode.right;
      if (localNode2 != null)
      {
        j = localNode2.height;
        localNode1.right = localNode2;
        localNode2.parent = localNode1;
        paramNode.right = null;
      }
      i = Math.max(k, j) + 1;
      localNode1.height = i;
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
  
  public LinkedHashTreeMap.Node removeInternalByKey(Object paramObject)
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
 * Qualified Name:     com.google.gson.internal.LinkedHashTreeMap
 * JD-Core Version:    0.7.0.1
 */