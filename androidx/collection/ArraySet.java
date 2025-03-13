package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class ArraySet
  implements Collection, Set
{
  public static final int[] o00Ooo0o = new int[0];
  public static Object[] o00OooO;
  public static final Object[] o00OooO0 = new Object[0];
  public static int o00OooOO;
  public static Object[] o00OooOo;
  public static int o0O00o0;
  public int[] o00OoOoo;
  public int o00Ooo0;
  public Object[] o00Ooo00;
  public MapCollections o00Ooo0O;
  
  public ArraySet()
  {
    this(0);
  }
  
  public ArraySet(int paramInt)
  {
    if (paramInt == 0)
    {
      Object localObject = o00Ooo0o;
      this.o00OoOoo = ((int[])localObject);
      localObject = o00OooO0;
      this.o00Ooo00 = ((Object[])localObject);
    }
    else
    {
      OooO00o(paramInt);
    }
    this.o00Ooo0 = 0;
  }
  
  public static void OooO0OO(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    int i = paramArrayOfInt.length;
    int j = 8;
    int k = 2;
    int m = 10;
    int n = 1;
    Object[] arrayOfObject;
    int i1;
    if (i == j) {
      synchronized (ArraySet.class)
      {
        j = o0O00o0;
        if (j < m)
        {
          arrayOfObject = o00OooOo;
          paramArrayOfObject[0] = arrayOfObject;
          paramArrayOfObject[n] = paramArrayOfInt;
          paramInt -= n;
          while (paramInt >= k)
          {
            paramArrayOfObject[paramInt] = null;
            paramInt += -1;
          }
          o00OooOo = paramArrayOfObject;
          i1 = o0O00o0 + n;
          o0O00o0 = i1;
        }
      }
    }
    i = paramArrayOfInt.length;
    j = 4;
    if (i == j) {
      synchronized (ArraySet.class)
      {
        j = o00OooOO;
        if (j < m)
        {
          arrayOfObject = o00OooO;
          paramArrayOfObject[0] = arrayOfObject;
          paramArrayOfObject[n] = paramArrayOfInt;
          paramInt -= n;
          while (paramInt >= k)
          {
            paramArrayOfObject[paramInt] = null;
            paramInt += -1;
          }
          o00OooO = paramArrayOfObject;
          i1 = o00OooOO + n;
          o00OooOO = i1;
        }
      }
    }
  }
  
  private MapCollections getCollection()
  {
    Object localObject = this.o00Ooo0O;
    if (localObject == null)
    {
      localObject = new androidx/collection/ArraySet$1;
      ((ArraySet.1)localObject).<init>(this);
      this.o00Ooo0O = ((MapCollections)localObject);
    }
    return this.o00Ooo0O;
  }
  
  public final void OooO00o(int paramInt)
  {
    int i = 8;
    int j = 1;
    Object[] arrayOfObject1;
    if (paramInt == i) {
      synchronized (ArraySet.class)
      {
        arrayOfObject1 = o00OooOo;
        if (arrayOfObject1 != null)
        {
          this.o00Ooo00 = arrayOfObject1;
          Object localObject2 = arrayOfObject1[0];
          localObject2 = (Object[])localObject2;
          o00OooOo = (Object[])localObject2;
          localObject2 = arrayOfObject1[j];
          localObject2 = (int[])localObject2;
          this.o00OoOoo = ((int[])localObject2);
          arrayOfObject1[j] = null;
          arrayOfObject1[0] = null;
          paramInt = o0O00o0 - j;
          o0O00o0 = paramInt;
          return;
        }
      }
    }
    i = 4;
    if (paramInt == i) {
      synchronized (ArraySet.class)
      {
        arrayOfObject1 = o00OooO;
        if (arrayOfObject1 != null)
        {
          this.o00Ooo00 = arrayOfObject1;
          Object localObject4 = arrayOfObject1[0];
          localObject4 = (Object[])localObject4;
          o00OooO = (Object[])localObject4;
          localObject4 = arrayOfObject1[j];
          localObject4 = (int[])localObject4;
          this.o00OoOoo = ((int[])localObject4);
          arrayOfObject1[j] = null;
          arrayOfObject1[0] = null;
          paramInt = o00OooOO - j;
          o00OooOO = paramInt;
          return;
        }
      }
    }
    ??? = new int[paramInt];
    this.o00OoOoo = ((int[])???);
    Object[] arrayOfObject2 = new Object[paramInt];
    this.o00Ooo00 = arrayOfObject2;
  }
  
  public void OooO0O0(int paramInt)
  {
    int[] arrayOfInt1 = this.o00OoOoo;
    int i = arrayOfInt1.length;
    if (i < paramInt)
    {
      Object[] arrayOfObject1 = this.o00Ooo00;
      OooO00o(paramInt);
      paramInt = this.o00Ooo0;
      if (paramInt > 0)
      {
        int[] arrayOfInt2 = this.o00OoOoo;
        System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, paramInt);
        Object[] arrayOfObject2 = this.o00Ooo00;
        int j = this.o00Ooo0;
        System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, j);
      }
      paramInt = this.o00Ooo0;
      OooO0OO(arrayOfInt1, arrayOfObject1, paramInt);
    }
  }
  
  public final int OooO0Oo(Object paramObject, int paramInt)
  {
    int i = this.o00Ooo0;
    if (i == 0) {
      return -1;
    }
    int[] arrayOfInt = this.o00OoOoo;
    int j = ContainerHelpers.OooO00o(arrayOfInt, i, paramInt);
    if (j < 0) {
      return j;
    }
    Object localObject1 = this.o00Ooo00[j];
    boolean bool2 = paramObject.equals(localObject1);
    if (bool2) {
      return j;
    }
    int k = j + 1;
    while (k < i)
    {
      Object localObject2 = this.o00OoOoo;
      int m = localObject2[k];
      if (m != paramInt) {
        break;
      }
      localObject2 = this.o00Ooo00[k];
      boolean bool3 = paramObject.equals(localObject2);
      if (bool3) {
        return k;
      }
      k += 1;
    }
    j += -1;
    while (j >= 0)
    {
      Object localObject3 = this.o00OoOoo;
      i = localObject3[j];
      if (i != paramInt) {
        break;
      }
      localObject3 = this.o00Ooo00[j];
      boolean bool1 = paramObject.equals(localObject3);
      if (bool1) {
        return j;
      }
      j += -1;
    }
    return k ^ 0xFFFFFFFF;
  }
  
  public Object OooO0o(int paramInt)
  {
    Object[] arrayOfObject = this.o00Ooo00;
    Object localObject1 = arrayOfObject[paramInt];
    int i = this.o00Ooo0;
    int j = 0;
    int k = 1;
    Object localObject2;
    if (i <= k)
    {
      OooO0OO(this.o00OoOoo, arrayOfObject, i);
      localObject2 = o00Ooo0o;
      this.o00OoOoo = ((int[])localObject2);
      localObject2 = o00OooO0;
      this.o00Ooo00 = ((Object[])localObject2);
      this.o00Ooo0 = 0;
    }
    else
    {
      int[] arrayOfInt1 = this.o00OoOoo;
      int m = arrayOfInt1.length;
      int n = 8;
      if (m > n)
      {
        m = arrayOfInt1.length / 3;
        if (i < m)
        {
          if (i > n)
          {
            m = i >> 1;
            n = i + m;
          }
          OooO00o(n);
          i = this.o00Ooo0 - k;
          this.o00Ooo0 = i;
          if (paramInt > 0)
          {
            localObject3 = this.o00OoOoo;
            System.arraycopy(arrayOfInt1, 0, localObject3, 0, paramInt);
            localObject3 = this.o00Ooo00;
            System.arraycopy(arrayOfObject, 0, localObject3, 0, paramInt);
          }
          i = this.o00Ooo0;
          if (paramInt >= i) {
            return localObject1;
          }
          j = paramInt + 1;
          int[] arrayOfInt2 = this.o00OoOoo;
          i -= paramInt;
          System.arraycopy(arrayOfInt1, j, arrayOfInt2, paramInt, i);
          localObject3 = this.o00Ooo00;
          k = this.o00Ooo0 - paramInt;
          System.arraycopy(arrayOfObject, j, localObject3, paramInt, k);
          return localObject1;
        }
      }
      i -= k;
      this.o00Ooo0 = i;
      if (paramInt < i)
      {
        i1 = paramInt + 1;
        i -= paramInt;
        System.arraycopy(arrayOfInt1, i1, arrayOfInt1, paramInt, i);
        localObject3 = this.o00Ooo00;
        j = this.o00Ooo0 - paramInt;
        System.arraycopy(localObject3, i1, localObject3, paramInt, j);
      }
      localObject2 = this.o00Ooo00;
      int i1 = this.o00Ooo0;
      i = 0;
      Object localObject3 = null;
      localObject2[i1] = null;
    }
    return localObject1;
  }
  
  public final int OooO0o0()
  {
    int i = this.o00Ooo0;
    if (i == 0) {
      return -1;
    }
    int[] arrayOfInt = this.o00OoOoo;
    int j = 0;
    Object localObject1 = null;
    int k = ContainerHelpers.OooO00o(arrayOfInt, i, 0);
    if (k < 0) {
      return k;
    }
    localObject1 = this.o00Ooo00[k];
    if (localObject1 == null) {
      return k;
    }
    j = k + 1;
    while (j < i)
    {
      Object localObject2 = this.o00OoOoo;
      int m = localObject2[j];
      if (m != 0) {
        break;
      }
      localObject2 = this.o00Ooo00[j];
      if (localObject2 == null) {
        return j;
      }
      j += 1;
    }
    k += -1;
    while (k >= 0)
    {
      Object localObject3 = this.o00OoOoo;
      i = localObject3[k];
      if (i != 0) {
        break;
      }
      localObject3 = this.o00Ooo00[k];
      if (localObject3 == null) {
        return k;
      }
      k += -1;
    }
    return j ^ 0xFFFFFFFF;
  }
  
  public Object OooO0oO(int paramInt)
  {
    return this.o00Ooo00[paramInt];
  }
  
  public boolean add(Object paramObject)
  {
    int i = 0;
    Object[] arrayOfObject = null;
    int j;
    int k;
    if (paramObject == null)
    {
      j = OooO0o0();
      k = 0;
    }
    else
    {
      j = paramObject.hashCode();
      int m = OooO0Oo(paramObject, j);
      k = j;
      j = m;
    }
    if (j >= 0) {
      return false;
    }
    j ^= 0xFFFFFFFF;
    int n = this.o00Ooo0;
    int[] arrayOfInt = this.o00OoOoo;
    int i1 = arrayOfInt.length;
    Object localObject1;
    if (n >= i1)
    {
      i1 = 8;
      if (n >= i1)
      {
        i1 = (n >> 1) + n;
      }
      else
      {
        i2 = 4;
        if (n < i2) {
          i1 = i2;
        }
      }
      localObject1 = this.o00Ooo00;
      OooO00o(i1);
      Object localObject2 = this.o00OoOoo;
      int i2 = localObject2.length;
      if (i2 > 0)
      {
        i2 = arrayOfInt.length;
        System.arraycopy(arrayOfInt, 0, localObject2, 0, i2);
        localObject2 = this.o00Ooo00;
        i2 = localObject1.length;
        System.arraycopy(localObject1, 0, localObject2, 0, i2);
      }
      i = this.o00Ooo0;
      OooO0OO(arrayOfInt, (Object[])localObject1, i);
    }
    i = this.o00Ooo0;
    if (j < i)
    {
      localObject1 = this.o00OoOoo;
      int i3 = j + 1;
      i -= j;
      System.arraycopy(localObject1, j, localObject1, i3, i);
      arrayOfObject = this.o00Ooo00;
      n = this.o00Ooo0 - j;
      System.arraycopy(arrayOfObject, j, arrayOfObject, i3, n);
    }
    this.o00OoOoo[j] = k;
    this.o00Ooo00[j] = paramObject;
    int i4 = this.o00Ooo0;
    i = 1;
    int i5;
    i4 += i;
    this.o00Ooo0 = i5;
    return i;
  }
  
  public boolean addAll(Collection paramCollection)
  {
    int i = this.o00Ooo0;
    int j = paramCollection.size();
    i += j;
    OooO0O0(i);
    paramCollection = paramCollection.iterator();
    i = 0;
    for (;;)
    {
      int k = paramCollection.hasNext();
      if (k == 0) {
        break;
      }
      Object localObject = paramCollection.next();
      k = add(localObject);
      i |= k;
    }
    return i;
  }
  
  public void clear()
  {
    int i = this.o00Ooo0;
    if (i != 0)
    {
      int[] arrayOfInt = this.o00OoOoo;
      Object[] arrayOfObject = this.o00Ooo00;
      OooO0OO(arrayOfInt, arrayOfObject, i);
      Object localObject = o00Ooo0o;
      this.o00OoOoo = ((int[])localObject);
      localObject = o00OooO0;
      this.o00Ooo00 = ((Object[])localObject);
      i = 0;
      localObject = null;
      this.o00Ooo0 = 0;
    }
  }
  
  public boolean contains(Object paramObject)
  {
    int i = indexOf(paramObject);
    if (i >= 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramObject = null;
    }
    return i;
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    paramCollection = paramCollection.iterator();
    boolean bool;
    do
    {
      bool = paramCollection.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = paramCollection.next();
      bool = contains(localObject);
    } while (bool);
    return false;
    return true;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof Set;
    if (bool2)
    {
      paramObject = (Set)paramObject;
      int i = size();
      int j = paramObject.size();
      if (i != j) {
        return false;
      }
      i = 0;
      try
      {
        for (;;)
        {
          j = this.o00Ooo0;
          if (i >= j) {
            break;
          }
          Object localObject = OooO0oO(i);
          boolean bool3 = paramObject.contains(localObject);
          if (!bool3) {
            return false;
          }
          i += 1;
        }
        return bool1;
      }
      catch (NullPointerException|ClassCastException localNullPointerException) {}
    }
    return false;
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = this.o00OoOoo;
    int i = this.o00Ooo0;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      int m = arrayOfInt[j];
      k += m;
      j += 1;
    }
    return k;
  }
  
  public int indexOf(Object paramObject)
  {
    int i;
    if (paramObject == null)
    {
      i = OooO0o0();
    }
    else
    {
      int j = paramObject.hashCode();
      i = OooO0Oo(paramObject, j);
    }
    return i;
  }
  
  public boolean isEmpty()
  {
    int i = this.o00Ooo0;
    if (i <= 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public Iterator iterator()
  {
    return getCollection().getKeySet().iterator();
  }
  
  public boolean remove(Object paramObject)
  {
    int i = indexOf(paramObject);
    if (i >= 0)
    {
      OooO0o(i);
      return true;
    }
    return false;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    paramCollection = paramCollection.iterator();
    boolean bool1 = false;
    for (;;)
    {
      boolean bool2 = paramCollection.hasNext();
      if (!bool2) {
        break;
      }
      Object localObject = paramCollection.next();
      bool2 = remove(localObject);
      bool1 |= bool2;
    }
    return bool1;
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    int i = this.o00Ooo0;
    int j = 1;
    i -= j;
    boolean bool1 = false;
    while (i >= 0)
    {
      Object localObject = this.o00Ooo00[i];
      boolean bool2 = paramCollection.contains(localObject);
      if (!bool2)
      {
        OooO0o(i);
        bool1 = j;
      }
      i += -1;
    }
    return bool1;
  }
  
  public int size()
  {
    return this.o00Ooo0;
  }
  
  public Object[] toArray()
  {
    int i = this.o00Ooo0;
    Object[] arrayOfObject = new Object[i];
    System.arraycopy(this.o00Ooo00, 0, arrayOfObject, 0, i);
    return arrayOfObject;
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    int i = paramArrayOfObject.length;
    int j = this.o00Ooo0;
    if (i < j)
    {
      paramArrayOfObject = paramArrayOfObject.getClass().getComponentType();
      i = this.o00Ooo0;
      paramArrayOfObject = (Object[])Array.newInstance(paramArrayOfObject, i);
    }
    Object[] arrayOfObject = this.o00Ooo00;
    j = this.o00Ooo0;
    System.arraycopy(arrayOfObject, 0, paramArrayOfObject, 0, j);
    i = paramArrayOfObject.length;
    j = this.o00Ooo0;
    if (i > j)
    {
      i = 0;
      arrayOfObject = null;
      paramArrayOfObject[j] = null;
    }
    return paramArrayOfObject;
  }
  
  public String toString()
  {
    boolean bool = isEmpty();
    if (bool) {
      return "{}";
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = this.o00Ooo0 * 14;
    localStringBuilder.<init>(i);
    localStringBuilder.append('{');
    i = 0;
    for (;;)
    {
      int j = this.o00Ooo0;
      if (i >= j) {
        break;
      }
      if (i > 0)
      {
        localObject = ", ";
        localStringBuilder.append((String)localObject);
      }
      Object localObject = OooO0oO(i);
      if (localObject != this)
      {
        localStringBuilder.append(localObject);
      }
      else
      {
        localObject = "(this Set)";
        localStringBuilder.append((String)localObject);
      }
      i += 1;
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.ArraySet
 * JD-Core Version:    0.7.0.1
 */