package androidx.collection;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class SimpleArrayMap
{
  public static Object[] o00Ooo0O;
  public static int o00Ooo0o;
  public static int o00OooO;
  public static Object[] o00OooO0;
  public int[] o00OoOoo;
  public int o00Ooo0;
  public Object[] o00Ooo00;
  
  public SimpleArrayMap()
  {
    Object localObject = ContainerHelpers.OooO00o;
    this.o00OoOoo = ((int[])localObject);
    localObject = ContainerHelpers.OooO0OO;
    this.o00Ooo00 = ((Object[])localObject);
    this.o00Ooo0 = 0;
  }
  
  public SimpleArrayMap(int paramInt)
  {
    if (paramInt == 0)
    {
      Object localObject = ContainerHelpers.OooO00o;
      this.o00OoOoo = ((int[])localObject);
      localObject = ContainerHelpers.OooO0OO;
      this.o00Ooo00 = ((Object[])localObject);
    }
    else
    {
      OooO00o(paramInt);
    }
    this.o00Ooo0 = 0;
  }
  
  public SimpleArrayMap(SimpleArrayMap paramSimpleArrayMap)
  {
    this();
    if (paramSimpleArrayMap != null) {
      OooOO0(paramSimpleArrayMap);
    }
  }
  
  private void OooO00o(int paramInt)
  {
    int i = 8;
    int j = 1;
    Object[] arrayOfObject1;
    if (paramInt == i) {
      synchronized (SimpleArrayMap.class)
      {
        arrayOfObject1 = o00OooO0;
        if (arrayOfObject1 != null)
        {
          this.o00Ooo00 = arrayOfObject1;
          Object localObject2 = arrayOfObject1[0];
          localObject2 = (Object[])localObject2;
          o00OooO0 = (Object[])localObject2;
          localObject2 = arrayOfObject1[j];
          localObject2 = (int[])localObject2;
          this.o00OoOoo = ((int[])localObject2);
          arrayOfObject1[j] = null;
          arrayOfObject1[0] = null;
          paramInt = o00OooO - j;
          o00OooO = paramInt;
          return;
        }
      }
    }
    i = 4;
    if (paramInt == i) {
      synchronized (SimpleArrayMap.class)
      {
        arrayOfObject1 = o00Ooo0O;
        if (arrayOfObject1 != null)
        {
          this.o00Ooo00 = arrayOfObject1;
          Object localObject4 = arrayOfObject1[0];
          localObject4 = (Object[])localObject4;
          o00Ooo0O = (Object[])localObject4;
          localObject4 = arrayOfObject1[j];
          localObject4 = (int[])localObject4;
          this.o00OoOoo = ((int[])localObject4);
          arrayOfObject1[j] = null;
          arrayOfObject1[0] = null;
          paramInt = o00Ooo0o - j;
          o00Ooo0o = paramInt;
          return;
        }
      }
    }
    ??? = new int[paramInt];
    this.o00OoOoo = ((int[])???);
    Object[] arrayOfObject2 = new Object[paramInt << j];
    this.o00Ooo00 = arrayOfObject2;
  }
  
  public static int OooO0O0(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    try
    {
      return ContainerHelpers.OooO00o(paramArrayOfInt, paramInt1, paramInt2);
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      paramArrayOfInt = new java/util/ConcurrentModificationException;
      paramArrayOfInt.<init>();
      throw paramArrayOfInt;
    }
  }
  
  public static void OooO0Oo(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    int i = paramArrayOfInt.length;
    int j = 8;
    int k = 2;
    int m = 10;
    int n = 1;
    Object[] arrayOfObject;
    int i1;
    if (i == j) {
      synchronized (SimpleArrayMap.class)
      {
        j = o00OooO;
        if (j < m)
        {
          arrayOfObject = o00OooO0;
          paramArrayOfObject[0] = arrayOfObject;
          paramArrayOfObject[n] = paramArrayOfInt;
          i1 = (paramInt << 1) - n;
          while (i1 >= k)
          {
            paramArrayOfObject[i1] = null;
            i1 += -1;
          }
          o00OooO0 = paramArrayOfObject;
          i1 = o00OooO + n;
          o00OooO = i1;
        }
      }
    }
    i = paramArrayOfInt.length;
    j = 4;
    if (i == j) {
      synchronized (SimpleArrayMap.class)
      {
        j = o00Ooo0o;
        if (j < m)
        {
          arrayOfObject = o00Ooo0O;
          paramArrayOfObject[0] = arrayOfObject;
          paramArrayOfObject[n] = paramArrayOfInt;
          i1 = (paramInt << 1) - n;
          while (i1 >= k)
          {
            paramArrayOfObject[i1] = null;
            i1 += -1;
          }
          o00Ooo0O = paramArrayOfObject;
          i1 = o00Ooo0o + n;
          o00Ooo0o = i1;
        }
      }
    }
  }
  
  public Object OooO(int paramInt)
  {
    Object[] arrayOfObject = this.o00Ooo00;
    paramInt <<= 1;
    return arrayOfObject[paramInt];
  }
  
  public void OooO0OO(int paramInt)
  {
    int i = this.o00Ooo0;
    int[] arrayOfInt = this.o00OoOoo;
    int j = arrayOfInt.length;
    if (j < paramInt)
    {
      Object[] arrayOfObject = this.o00Ooo00;
      OooO00o(paramInt);
      paramInt = this.o00Ooo0;
      if (paramInt > 0)
      {
        localObject = this.o00OoOoo;
        System.arraycopy(arrayOfInt, 0, localObject, 0, i);
        localObject = this.o00Ooo00;
        int k = i << 1;
        System.arraycopy(arrayOfObject, 0, localObject, 0, k);
      }
      OooO0Oo(arrayOfInt, arrayOfObject, i);
    }
    paramInt = this.o00Ooo0;
    if (paramInt == i) {
      return;
    }
    Object localObject = new java/util/ConcurrentModificationException;
    ((ConcurrentModificationException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public int OooO0o(Object paramObject)
  {
    int i;
    if (paramObject == null)
    {
      i = OooO0oO();
    }
    else
    {
      int j = paramObject.hashCode();
      i = OooO0o0(paramObject, j);
    }
    return i;
  }
  
  public int OooO0o0(Object paramObject, int paramInt)
  {
    int i = this.o00Ooo0;
    if (i == 0) {
      return -1;
    }
    int[] arrayOfInt = this.o00OoOoo;
    int j = OooO0O0(arrayOfInt, i, paramInt);
    if (j < 0) {
      return j;
    }
    Object localObject1 = this.o00Ooo00;
    int k = j << 1;
    localObject1 = localObject1[k];
    boolean bool3 = paramObject.equals(localObject1);
    if (bool3) {
      return j;
    }
    int n = j + 1;
    while (n < i)
    {
      Object localObject2 = this.o00OoOoo;
      k = localObject2[n];
      if (k != paramInt) {
        break;
      }
      localObject2 = this.o00Ooo00;
      int i1 = n << 1;
      localObject2 = localObject2[i1];
      boolean bool2 = paramObject.equals(localObject2);
      if (bool2) {
        return n;
      }
      n += 1;
    }
    j += -1;
    while (j >= 0)
    {
      Object localObject3 = this.o00OoOoo;
      i = localObject3[j];
      if (i != paramInt) {
        break;
      }
      localObject3 = this.o00Ooo00;
      int m = j << 1;
      localObject3 = localObject3[m];
      boolean bool1 = paramObject.equals(localObject3);
      if (bool1) {
        return j;
      }
      j += -1;
    }
    return n ^ 0xFFFFFFFF;
  }
  
  public int OooO0oO()
  {
    int i = this.o00Ooo0;
    if (i == 0) {
      return -1;
    }
    int[] arrayOfInt = this.o00OoOoo;
    int j = 0;
    Object localObject1 = null;
    int k = OooO0O0(arrayOfInt, i, 0);
    if (k < 0) {
      return k;
    }
    localObject1 = this.o00Ooo00;
    int m = k << 1;
    localObject1 = localObject1[m];
    if (localObject1 == null) {
      return k;
    }
    j = k + 1;
    while (j < i)
    {
      Object localObject2 = this.o00OoOoo;
      m = localObject2[j];
      if (m != 0) {
        break;
      }
      localObject2 = this.o00Ooo00;
      int n = j << 1;
      localObject2 = localObject2[n];
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
      localObject3 = this.o00Ooo00;
      m = k << 1;
      localObject3 = localObject3[m];
      if (localObject3 == null) {
        return k;
      }
      k += -1;
    }
    return j ^ 0xFFFFFFFF;
  }
  
  int OooO0oo(Object paramObject)
  {
    int i = this.o00Ooo0 * 2;
    Object[] arrayOfObject = this.o00Ooo00;
    int j = 1;
    if (paramObject == null)
    {
      int k = j;
      while (k < i)
      {
        Object localObject1 = arrayOfObject[k];
        if (localObject1 == null) {
          return k >> j;
        }
        k += 2;
      }
    }
    int m = j;
    while (m < i)
    {
      Object localObject2 = arrayOfObject[m];
      boolean bool = paramObject.equals(localObject2);
      if (bool) {
        return m >> 1;
      }
      m += 2;
    }
    return -1;
  }
  
  public void OooOO0(SimpleArrayMap paramSimpleArrayMap)
  {
    int i = paramSimpleArrayMap.o00Ooo0;
    int j = this.o00Ooo0 + i;
    OooO0OO(j);
    j = this.o00Ooo0;
    int k = 0;
    Object localObject1;
    Object localObject2;
    if (j == 0)
    {
      if (i > 0)
      {
        localObject1 = paramSimpleArrayMap.o00OoOoo;
        localObject2 = this.o00OoOoo;
        System.arraycopy(localObject1, 0, localObject2, 0, i);
        paramSimpleArrayMap = paramSimpleArrayMap.o00Ooo00;
        localObject1 = this.o00Ooo00;
        int m = i << 1;
        System.arraycopy(paramSimpleArrayMap, 0, localObject1, 0, m);
        this.o00Ooo0 = i;
      }
    }
    else {
      while (k < i)
      {
        localObject1 = paramSimpleArrayMap.OooO(k);
        localObject2 = paramSimpleArrayMap.OooOOO0(k);
        put(localObject1, localObject2);
        k += 1;
      }
    }
  }
  
  public Object OooOO0O(int paramInt)
  {
    Object[] arrayOfObject1 = this.o00Ooo00;
    int i = paramInt << 1;
    int j = i + 1;
    Object localObject1 = arrayOfObject1[j];
    int k = this.o00Ooo0;
    int m = 0;
    Object[] arrayOfObject2 = null;
    int n = 1;
    if (k <= n)
    {
      OooO0Oo(this.o00OoOoo, arrayOfObject1, k);
      localObject2 = ContainerHelpers.OooO00o;
      this.o00OoOoo = ((int[])localObject2);
      localObject2 = ContainerHelpers.OooO0OO;
      this.o00Ooo00 = ((Object[])localObject2);
    }
    else
    {
      int i1 = k + -1;
      int[] arrayOfInt = this.o00OoOoo;
      int i2 = arrayOfInt.length;
      int i3 = 8;
      if (i2 > i3)
      {
        i2 = arrayOfInt.length / 3;
        if (k < i2)
        {
          if (k > i3)
          {
            i2 = k >> 1;
            i3 = k + i2;
          }
          OooO00o(i3);
          i2 = this.o00Ooo0;
          if (k == i2)
          {
            if (paramInt > 0)
            {
              localObject3 = this.o00OoOoo;
              System.arraycopy(arrayOfInt, 0, localObject3, 0, paramInt);
              localObject3 = this.o00Ooo00;
              System.arraycopy(arrayOfObject1, 0, localObject3, 0, i);
            }
            if (paramInt >= i1) {
              break label365;
            }
            m = paramInt + 1;
            Object localObject3 = this.o00OoOoo;
            i3 = i1 - paramInt;
            System.arraycopy(arrayOfInt, m, localObject3, paramInt, i3);
            paramInt = m << 1;
            arrayOfObject2 = this.o00Ooo00;
            n = i3 << 1;
            System.arraycopy(arrayOfObject1, paramInt, arrayOfObject2, i, n);
            break label365;
          }
          localObject2 = new java/util/ConcurrentModificationException;
          ((ConcurrentModificationException)localObject2).<init>();
          throw ((Throwable)localObject2);
        }
      }
      if (paramInt < i1)
      {
        i4 = paramInt + 1;
        m = i1 - paramInt;
        System.arraycopy(arrayOfInt, i4, arrayOfInt, paramInt, m);
        localObject2 = this.o00Ooo00;
        i4 <<= n;
        m <<= n;
        System.arraycopy(localObject2, i4, localObject2, i, m);
      }
      localObject2 = this.o00Ooo00;
      int i4 = i1 << 1;
      i = 0;
      localObject2[i4] = null;
      i4 += n;
      localObject2[i4] = null;
      label365:
      m = i1;
    }
    paramInt = this.o00Ooo0;
    if (k == paramInt)
    {
      this.o00Ooo0 = m;
      return localObject1;
    }
    Object localObject2 = new java/util/ConcurrentModificationException;
    ((ConcurrentModificationException)localObject2).<init>();
    throw ((Throwable)localObject2);
  }
  
  public Object OooOO0o(int paramInt, Object paramObject)
  {
    paramInt = (paramInt << 1) + 1;
    Object[] arrayOfObject = this.o00Ooo00;
    Object localObject = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramObject;
    return localObject;
  }
  
  public Object OooOOO0(int paramInt)
  {
    Object[] arrayOfObject = this.o00Ooo00;
    paramInt = (paramInt << 1) + 1;
    return arrayOfObject[paramInt];
  }
  
  public void clear()
  {
    int i = this.o00Ooo0;
    if (i > 0)
    {
      int[] arrayOfInt = this.o00OoOoo;
      Object[] arrayOfObject = this.o00Ooo00;
      Object localObject = ContainerHelpers.OooO00o;
      this.o00OoOoo = ((int[])localObject);
      localObject = ContainerHelpers.OooO0OO;
      this.o00Ooo00 = ((Object[])localObject);
      localObject = null;
      this.o00Ooo0 = 0;
      OooO0Oo(arrayOfInt, arrayOfObject, i);
    }
    i = this.o00Ooo0;
    if (i <= 0) {
      return;
    }
    ConcurrentModificationException localConcurrentModificationException = new java/util/ConcurrentModificationException;
    localConcurrentModificationException.<init>();
    throw localConcurrentModificationException;
  }
  
  public boolean containsKey(Object paramObject)
  {
    int i = OooO0o(paramObject);
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
  
  public boolean containsValue(Object paramObject)
  {
    int i = OooO0oo(paramObject);
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
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof SimpleArrayMap;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (bool2)
    {
      paramObject = (SimpleArrayMap)paramObject;
      int i = size();
      int k = paramObject.size();
      if (i != k) {
        return false;
      }
      i = 0;
      try
      {
        for (;;)
        {
          k = this.o00Ooo0;
          if (i >= k) {
            break;
          }
          localObject1 = OooO(i);
          localObject2 = OooOOO0(i);
          localObject3 = paramObject.get(localObject1);
          boolean bool4;
          if (localObject2 == null)
          {
            if (localObject3 == null)
            {
              bool4 = paramObject.containsKey(localObject1);
              if (bool4) {}
            }
            else
            {
              return false;
            }
          }
          else
          {
            bool4 = localObject2.equals(localObject3);
            if (!bool4) {
              return false;
            }
          }
          i += 1;
        }
        return bool1;
      }
      catch (NullPointerException|ClassCastException localNullPointerException1)
      {
        return false;
      }
    }
    boolean bool3 = paramObject instanceof Map;
    if (bool3)
    {
      paramObject = (Map)paramObject;
      int j = size();
      int m = paramObject.size();
      if (j != m) {
        return false;
      }
      j = 0;
      try
      {
        for (;;)
        {
          m = this.o00Ooo0;
          if (j >= m) {
            break;
          }
          localObject1 = OooO(j);
          localObject2 = OooOOO0(j);
          localObject3 = paramObject.get(localObject1);
          boolean bool5;
          if (localObject2 == null)
          {
            if (localObject3 == null)
            {
              bool5 = paramObject.containsKey(localObject1);
              if (bool5) {}
            }
            else
            {
              return false;
            }
          }
          else
          {
            bool5 = localObject2.equals(localObject3);
            if (!bool5) {
              return false;
            }
          }
          j += 1;
        }
        return bool1;
      }
      catch (NullPointerException|ClassCastException localNullPointerException2) {}
    }
    return false;
  }
  
  public Object get(Object paramObject)
  {
    return getOrDefault(paramObject, null);
  }
  
  public Object getOrDefault(Object paramObject1, Object paramObject2)
  {
    int i = OooO0o(paramObject1);
    if (i >= 0)
    {
      paramObject2 = this.o00Ooo00;
      i = (i << 1) + 1;
      paramObject2 = paramObject2[i];
    }
    return paramObject2;
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = this.o00OoOoo;
    Object[] arrayOfObject = this.o00Ooo00;
    int i = this.o00Ooo0;
    int j = 1;
    int k = 0;
    int m = 0;
    while (k < i)
    {
      Object localObject = arrayOfObject[j];
      int n = arrayOfInt[k];
      int i1;
      if (localObject == null)
      {
        i1 = 0;
        localObject = null;
      }
      else
      {
        i1 = localObject.hashCode();
      }
      i1 ^= n;
      m += i1;
      k += 1;
      j += 2;
    }
    return m;
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
  
  public Object put(Object paramObject1, Object paramObject2)
  {
    int i = this.o00Ooo0;
    int j = 0;
    Object localObject1 = null;
    int k;
    int m;
    if (paramObject1 == null)
    {
      k = OooO0oO();
      m = 0;
    }
    else
    {
      k = paramObject1.hashCode();
      int n = OooO0o0(paramObject1, k);
      m = k;
      k = n;
    }
    Object localObject2;
    if (k >= 0)
    {
      int i1 = (k << 1) + 1;
      localObject2 = this.o00Ooo00;
      localObject1 = localObject2[i1];
      localObject2[i1] = paramObject2;
      return localObject1;
    }
    k ^= 0xFFFFFFFF;
    int[] arrayOfInt = this.o00OoOoo;
    int i2 = arrayOfInt.length;
    int i3;
    if (i >= i2)
    {
      i2 = 8;
      if (i >= i2)
      {
        i2 = (i >> 1) + i;
      }
      else
      {
        i3 = 4;
        if (i < i3) {
          i2 = i3;
        }
      }
      Object[] arrayOfObject = this.o00Ooo00;
      OooO00o(i2);
      i2 = this.o00Ooo0;
      if (i == i2)
      {
        Object localObject3 = this.o00OoOoo;
        int i4 = localObject3.length;
        if (i4 > 0)
        {
          i4 = arrayOfInt.length;
          System.arraycopy(arrayOfInt, 0, localObject3, 0, i4);
          localObject3 = this.o00Ooo00;
          i4 = arrayOfObject.length;
          System.arraycopy(arrayOfObject, 0, localObject3, 0, i4);
        }
        OooO0Oo(arrayOfInt, arrayOfObject, i);
      }
      else
      {
        paramObject1 = new java/util/ConcurrentModificationException;
        paramObject1.<init>();
        throw paramObject1;
      }
    }
    int i5;
    if (k < i)
    {
      localObject1 = this.o00OoOoo;
      i5 = k + 1;
      i2 = i - k;
      System.arraycopy(localObject1, k, localObject1, i5, i2);
      localObject1 = this.o00Ooo00;
      i2 = k << 1;
      i5 <<= 1;
      i3 = this.o00Ooo0 - k << 1;
      System.arraycopy(localObject1, i2, localObject1, i5, i3);
    }
    j = this.o00Ooo0;
    if (i == j)
    {
      localObject2 = this.o00OoOoo;
      i5 = localObject2.length;
      if (k < i5)
      {
        localObject2[k] = m;
        localObject2 = this.o00Ooo00;
        k <<= 1;
        localObject2[k] = paramObject1;
        k += 1;
        localObject2[k] = paramObject2;
        j += 1;
        this.o00Ooo0 = j;
        return null;
      }
    }
    paramObject1 = new java/util/ConcurrentModificationException;
    paramObject1.<init>();
    throw paramObject1;
  }
  
  public Object putIfAbsent(Object paramObject1, Object paramObject2)
  {
    Object localObject = get(paramObject1);
    if (localObject == null) {
      localObject = put(paramObject1, paramObject2);
    }
    return localObject;
  }
  
  public Object remove(Object paramObject)
  {
    int i = OooO0o(paramObject);
    if (i >= 0) {
      return OooOO0O(i);
    }
    return null;
  }
  
  public boolean remove(Object paramObject1, Object paramObject2)
  {
    int i = OooO0o(paramObject1);
    if (i >= 0)
    {
      Object localObject = OooOOO0(i);
      if (paramObject2 != localObject)
      {
        if (paramObject2 != null)
        {
          boolean bool = paramObject2.equals(localObject);
          if (!bool) {}
        }
      }
      else
      {
        OooOO0O(i);
        return true;
      }
    }
    return false;
  }
  
  public Object replace(Object paramObject1, Object paramObject2)
  {
    int i = OooO0o(paramObject1);
    if (i >= 0) {
      return OooOO0o(i, paramObject2);
    }
    return null;
  }
  
  public boolean replace(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    int i = OooO0o(paramObject1);
    if (i >= 0)
    {
      Object localObject = OooOOO0(i);
      if (localObject != paramObject2)
      {
        if (paramObject2 != null)
        {
          boolean bool = paramObject2.equals(localObject);
          if (!bool) {}
        }
      }
      else
      {
        OooOO0o(i, paramObject3);
        return true;
      }
    }
    return false;
  }
  
  public int size()
  {
    return this.o00Ooo0;
  }
  
  public String toString()
  {
    boolean bool = isEmpty();
    if (bool) {
      return "{}";
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = this.o00Ooo0 * 28;
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
      Object localObject = OooO(i);
      String str = "(this Map)";
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append(str);
      }
      j = 61;
      localStringBuilder.append(j);
      localObject = OooOOO0(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append(str);
      }
      i += 1;
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.SimpleArrayMap
 * JD-Core Version:    0.7.0.1
 */