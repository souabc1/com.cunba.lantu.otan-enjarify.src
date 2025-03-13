package androidx.recyclerview.widget;

import android.util.SparseIntArray;

public abstract class GridLayoutManager$SpanSizeLookup
{
  public final SparseIntArray OooO00o;
  public final SparseIntArray OooO0O0;
  public boolean OooO0OO;
  public boolean OooO0Oo;
  
  public GridLayoutManager$SpanSizeLookup()
  {
    SparseIntArray localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    this.OooO00o = localSparseIntArray;
    localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    this.OooO0O0 = localSparseIntArray;
    this.OooO0OO = false;
    this.OooO0Oo = false;
  }
  
  public static int OooO00o(SparseIntArray paramSparseIntArray, int paramInt)
  {
    int i = paramSparseIntArray.size() + -1;
    int j = 0;
    while (j <= i)
    {
      int k = j + i >>> 1;
      int m = paramSparseIntArray.keyAt(k);
      if (m < paramInt)
      {
        k += 1;
        j = k;
      }
      else
      {
        k += -1;
        i = k;
      }
    }
    j += -1;
    if (j >= 0)
    {
      paramInt = paramSparseIntArray.size();
      if (j < paramInt) {
        return paramSparseIntArray.keyAt(j);
      }
    }
    return -1;
  }
  
  public int OooO0O0(int paramInt1, int paramInt2)
  {
    boolean bool = this.OooO0Oo;
    if (!bool) {
      return OooO0Oo(paramInt1, paramInt2);
    }
    SparseIntArray localSparseIntArray = this.OooO0O0;
    int j = -1;
    int i = localSparseIntArray.get(paramInt1, j);
    if (i != j) {
      return i;
    }
    paramInt2 = OooO0Oo(paramInt1, paramInt2);
    this.OooO0O0.put(paramInt1, paramInt2);
    return paramInt2;
  }
  
  public int OooO0OO(int paramInt1, int paramInt2)
  {
    boolean bool = this.OooO0OO;
    if (!bool) {
      return OooO0o0(paramInt1, paramInt2);
    }
    SparseIntArray localSparseIntArray = this.OooO00o;
    int j = -1;
    int i = localSparseIntArray.get(paramInt1, j);
    if (i != j) {
      return i;
    }
    paramInt2 = OooO0o0(paramInt1, paramInt2);
    this.OooO00o.put(paramInt1, paramInt2);
    return paramInt2;
  }
  
  public int OooO0Oo(int paramInt1, int paramInt2)
  {
    boolean bool = this.OooO0Oo;
    if (bool)
    {
      SparseIntArray localSparseIntArray1 = this.OooO0O0;
      i = OooO00o(localSparseIntArray1, paramInt1);
      j = -1;
      if (i != j)
      {
        localSparseIntArray2 = this.OooO0O0;
        j = localSparseIntArray2.get(i);
        k = i + 1;
        m = OooO0OO(i, paramInt2);
        i = getSpanSize(i);
        m += i;
        if (m != paramInt2) {
          break label100;
        }
        j += 1;
        m = 0;
        break label100;
      }
    }
    int j = 0;
    SparseIntArray localSparseIntArray2 = null;
    int k = 0;
    int m = 0;
    label100:
    int i = getSpanSize(paramInt1);
    while (k < paramInt1)
    {
      int n = getSpanSize(k);
      m += n;
      if (m == paramInt2)
      {
        j += 1;
        m = 0;
      }
      else if (m > paramInt2)
      {
        j += 1;
        m = n;
      }
      k += 1;
    }
    m += i;
    if (m > paramInt2) {
      j += 1;
    }
    return j;
  }
  
  public void OooO0o()
  {
    this.OooO0O0.clear();
  }
  
  public int OooO0o0(int paramInt1, int paramInt2)
  {
    int i = getSpanSize(paramInt1);
    if (i == paramInt2) {
      return 0;
    }
    boolean bool = this.OooO0OO;
    int m;
    if (bool)
    {
      localSparseIntArray1 = this.OooO00o;
      j = OooO00o(localSparseIntArray1, paramInt1);
      if (j >= 0)
      {
        localSparseIntArray2 = this.OooO00o;
        k = localSparseIntArray2.get(j);
        m = getSpanSize(j);
        k += m;
        break label134;
      }
    }
    int j = 0;
    SparseIntArray localSparseIntArray1 = null;
    int k = 0;
    SparseIntArray localSparseIntArray2 = null;
    while (j < paramInt1)
    {
      m = getSpanSize(j);
      k += m;
      if (k == paramInt2)
      {
        k = 0;
        localSparseIntArray2 = null;
      }
      else if (k > paramInt2)
      {
        k = m;
      }
      label134:
      j += 1;
    }
    i += k;
    if (i <= paramInt2) {
      return k;
    }
    return 0;
  }
  
  public void OooO0oO()
  {
    this.OooO00o.clear();
  }
  
  public abstract int getSpanSize(int paramInt);
  
  public boolean isSpanGroupIndexCacheEnabled()
  {
    return this.OooO0Oo;
  }
  
  public boolean isSpanIndexCacheEnabled()
  {
    return this.OooO0OO;
  }
  
  public void setSpanGroupIndexCacheEnabled(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      SparseIntArray localSparseIntArray = this.OooO0O0;
      localSparseIntArray.clear();
    }
    this.OooO0Oo = paramBoolean;
  }
  
  public void setSpanIndexCacheEnabled(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      SparseIntArray localSparseIntArray = this.OooO0O0;
      localSparseIntArray.clear();
    }
    this.OooO0OO = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
 * JD-Core Version:    0.7.0.1
 */