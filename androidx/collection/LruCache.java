package androidx.collection;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;

public class LruCache
{
  public final LinkedHashMap OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public int OooO0oO;
  public int OooO0oo;
  
  public LruCache(int paramInt)
  {
    if (paramInt > 0)
    {
      this.OooO0OO = paramInt;
      localObject = new java/util/LinkedHashMap;
      ((LinkedHashMap)localObject).<init>(0, 0.75F, true);
      this.OooO00o = ((LinkedHashMap)localObject);
      return;
    }
    Object localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("maxSize <= 0");
    throw ((Throwable)localObject);
  }
  
  public Object OooO00o(Object paramObject)
  {
    return null;
  }
  
  public void OooO0O0(boolean paramBoolean, Object paramObject1, Object paramObject2, Object paramObject3) {}
  
  public final Object OooO0OO(Object paramObject)
  {
    if (paramObject != null) {
      try
      {
        Object localObject1 = this.OooO00o;
        localObject1 = ((LinkedHashMap)localObject1).get(paramObject);
        int i;
        if (localObject1 != null)
        {
          i = this.OooO0oO + 1;
          this.OooO0oO = i;
          return localObject1;
        }
        int j = this.OooO0oo + 1;
        this.OooO0oo = j;
        localObject1 = OooO00o(paramObject);
        if (localObject1 == null) {
          return null;
        }
        try
        {
          int k = this.OooO0o0 + 1;
          this.OooO0o0 = k;
          Object localObject2 = this.OooO00o;
          localObject2 = ((AbstractMap)localObject2).put(paramObject, localObject1);
          if (localObject2 != null)
          {
            LinkedHashMap localLinkedHashMap = this.OooO00o;
            localLinkedHashMap.put(paramObject, localObject2);
          }
          else
          {
            int m = this.OooO0O0;
            int n = OooO0o0(paramObject, localObject1);
            m += n;
            this.OooO0O0 = m;
          }
          if (localObject2 != null)
          {
            OooO0O0(false, paramObject, localObject1, localObject2);
            return localObject2;
          }
          i = this.OooO0OO;
          OooO0oO(i);
          return localObject1;
        }
        finally {}
        paramObject = new java/lang/NullPointerException;
      }
      finally {}
    }
    paramObject.<init>("key == null");
    throw paramObject;
  }
  
  public final Object OooO0Oo(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 != null) && (paramObject2 != null)) {
      try
      {
        int i = this.OooO0Oo + 1;
        this.OooO0Oo = i;
        i = this.OooO0O0;
        int j = OooO0o0(paramObject1, paramObject2);
        i += j;
        this.OooO0O0 = i;
        Object localObject = this.OooO00o;
        localObject = ((AbstractMap)localObject).put(paramObject1, paramObject2);
        if (localObject != null)
        {
          j = this.OooO0O0;
          int k = OooO0o0(paramObject1, localObject);
          j -= k;
          this.OooO0O0 = j;
        }
        if (localObject != null)
        {
          j = 0;
          OooO0O0(false, paramObject1, localObject, paramObject2);
        }
        int m = this.OooO0OO;
        OooO0oO(m);
        return localObject;
      }
      finally {}
    }
    paramObject1 = new java/lang/NullPointerException;
    paramObject1.<init>("key == null || value == null");
    throw paramObject1;
  }
  
  public int OooO0o(Object paramObject1, Object paramObject2)
  {
    return 1;
  }
  
  public final int OooO0o0(Object paramObject1, Object paramObject2)
  {
    int i = OooO0o(paramObject1, paramObject2);
    if (i >= 0) {
      return i;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Negative size: ");
    localStringBuilder.append(paramObject1);
    localStringBuilder.append("=");
    localStringBuilder.append(paramObject2);
    paramObject1 = localStringBuilder.toString();
    localIllegalStateException.<init>(paramObject1);
    throw localIllegalStateException;
  }
  
  public void OooO0oO(int paramInt)
  {
    for (;;)
    {
      try
      {
        int i = this.OooO0O0;
        if (i >= 0)
        {
          localObject1 = this.OooO00o;
          boolean bool1 = ((AbstractMap)localObject1).isEmpty();
          int j;
          if (bool1)
          {
            j = this.OooO0O0;
            if (j != 0) {}
          }
          else
          {
            j = this.OooO0O0;
            if (j > paramInt)
            {
              localObject1 = this.OooO00o;
              boolean bool2 = ((AbstractMap)localObject1).isEmpty();
              if (!bool2)
              {
                localObject1 = this.OooO00o;
                localObject1 = ((LinkedHashMap)localObject1).entrySet();
                localObject1 = ((Set)localObject1).iterator();
                localObject1 = ((Iterator)localObject1).next();
                localObject1 = (Map.Entry)localObject1;
                localObject2 = ((Map.Entry)localObject1).getKey();
                localObject1 = ((Map.Entry)localObject1).getValue();
                LinkedHashMap localLinkedHashMap = this.OooO00o;
                localLinkedHashMap.remove(localObject2);
                int k = this.OooO0O0;
                int m = OooO0o0(localObject2, localObject1);
                k -= m;
                this.OooO0O0 = k;
                k = this.OooO0o;
                m = 1;
                k += m;
                this.OooO0o = k;
                k = 0;
                localLinkedHashMap = null;
                OooO0O0(m, localObject2, localObject1, null);
                continue;
              }
            }
            return;
          }
        }
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        Object localObject2 = getClass();
        localObject2 = ((Class)localObject2).getName();
        ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = ".sizeOf() is reporting inconsistent results!";
        ((StringBuilder)localObject1).append((String)localObject2);
        localObject1 = ((StringBuilder)localObject1).toString();
        localIllegalStateException.<init>((String)localObject1);
        throw localIllegalStateException;
      }
      finally {}
    }
  }
  
  public final String toString()
  {
    try
    {
      int i = this.OooO0oO;
      int j = this.OooO0oo + i;
      int k = 0;
      Integer localInteger1 = null;
      if (j != 0)
      {
        i *= 100;
        i /= j;
      }
      else
      {
        i = 0;
        localObject1 = null;
      }
      Locale localLocale = Locale.US;
      String str = "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]";
      int m = 4;
      Object[] arrayOfObject = new Object[m];
      int n = this.OooO0OO;
      Integer localInteger2 = Integer.valueOf(n);
      arrayOfObject[0] = localInteger2;
      k = this.OooO0oO;
      localInteger1 = Integer.valueOf(k);
      n = 1;
      arrayOfObject[n] = localInteger1;
      k = this.OooO0oo;
      localInteger1 = Integer.valueOf(k);
      n = 2;
      arrayOfObject[n] = localInteger1;
      Object localObject1 = Integer.valueOf(i);
      k = 3;
      arrayOfObject[k] = localObject1;
      localObject1 = String.format(localLocale, str, arrayOfObject);
      return localObject1;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.collection.LruCache
 * JD-Core Version:    0.7.0.1
 */