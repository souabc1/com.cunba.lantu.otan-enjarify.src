package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StaggeredGridLayoutManager$LazySpanLookup
{
  public int[] OooO00o;
  public List OooO0O0;
  
  public void OooO(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt1 = this.OooO00o;
    if (arrayOfInt1 != null)
    {
      int i = arrayOfInt1.length;
      if (paramInt1 < i)
      {
        i = paramInt1 + paramInt2;
        OooO0OO(i);
        int[] arrayOfInt2 = this.OooO00o;
        int j = arrayOfInt2.length - paramInt1 - paramInt2;
        System.arraycopy(arrayOfInt2, i, arrayOfInt2, paramInt1, j);
        arrayOfInt1 = this.OooO00o;
        int k = arrayOfInt1.length - paramInt2;
        j = arrayOfInt1.length;
        int m = -1;
        Arrays.fill(arrayOfInt1, k, j, m);
        OooOO0O(paramInt1, paramInt2);
      }
    }
  }
  
  public void OooO00o(StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem paramFullSpanItem)
  {
    Object localObject = this.OooO0O0;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.OooO0O0 = ((List)localObject);
    }
    localObject = this.OooO0O0;
    int i = ((List)localObject).size();
    int j = 0;
    while (j < i)
    {
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.OooO0O0.get(j);
      int k = localFullSpanItem.o00OoOoo;
      int m = paramFullSpanItem.o00OoOoo;
      if (k == m)
      {
        List localList = this.OooO0O0;
        localList.remove(j);
      }
      int n = localFullSpanItem.o00OoOoo;
      k = paramFullSpanItem.o00OoOoo;
      if (n >= k)
      {
        this.OooO0O0.add(j, paramFullSpanItem);
        return;
      }
      j += 1;
    }
    this.OooO0O0.add(paramFullSpanItem);
  }
  
  public void OooO0O0()
  {
    int[] arrayOfInt = this.OooO00o;
    if (arrayOfInt != null)
    {
      int i = -1;
      Arrays.fill(arrayOfInt, i);
    }
    this.OooO0O0 = null;
  }
  
  public void OooO0OO(int paramInt)
  {
    int[] arrayOfInt1 = this.OooO00o;
    int i = -1;
    int j;
    int[] arrayOfInt2;
    if (arrayOfInt1 == null)
    {
      j = 10;
      paramInt = Math.max(paramInt, j) + 1;
      arrayOfInt2 = new int[paramInt];
      this.OooO00o = arrayOfInt2;
      Arrays.fill(arrayOfInt2, i);
    }
    else
    {
      int k = arrayOfInt1.length;
      if (paramInt >= k)
      {
        paramInt = OooOO0o(paramInt);
        arrayOfInt2 = new int[paramInt];
        this.OooO00o = arrayOfInt2;
        k = arrayOfInt1.length;
        System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, k);
        arrayOfInt2 = this.OooO00o;
        j = arrayOfInt1.length;
        k = arrayOfInt2.length;
        Arrays.fill(arrayOfInt2, j, k, i);
      }
    }
  }
  
  public int OooO0Oo(int paramInt)
  {
    List localList = this.OooO0O0;
    if (localList != null)
    {
      int i = localList.size() + -1;
      while (i >= 0)
      {
        Object localObject = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.OooO0O0.get(i);
        int j = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).o00OoOoo;
        if (j >= paramInt)
        {
          localObject = this.OooO0O0;
          ((List)localObject).remove(i);
        }
        i += -1;
      }
    }
    return OooO0o(paramInt);
  }
  
  public int OooO0o(int paramInt)
  {
    int[] arrayOfInt = this.OooO00o;
    int i = -1;
    if (arrayOfInt == null) {
      return i;
    }
    int j = arrayOfInt.length;
    if (paramInt >= j) {
      return i;
    }
    j = OooO0oO(paramInt);
    if (j == i)
    {
      arrayOfInt = this.OooO00o;
      k = arrayOfInt.length;
      Arrays.fill(arrayOfInt, paramInt, k, i);
      return this.OooO00o.length;
    }
    j += 1;
    int k = this.OooO00o.length;
    j = Math.min(j, k);
    Arrays.fill(this.OooO00o, paramInt, j, i);
    return j;
  }
  
  public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem OooO0o0(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    List localList = this.OooO0O0;
    if (localList == null) {
      return null;
    }
    int i = localList.size();
    int j = 0;
    while (j < i)
    {
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.OooO0O0.get(j);
      int k = localFullSpanItem.o00OoOoo;
      if (k >= paramInt2) {
        return null;
      }
      if (k >= paramInt1)
      {
        if (paramInt3 != 0)
        {
          k = localFullSpanItem.o00Ooo00;
          if (k != paramInt3)
          {
            if (!paramBoolean) {
              break label106;
            }
            boolean bool = localFullSpanItem.o00Ooo0O;
            if (!bool) {
              break label106;
            }
          }
        }
        return localFullSpanItem;
      }
      label106:
      j += 1;
    }
    return null;
  }
  
  public final int OooO0oO(int paramInt)
  {
    Object localObject = this.OooO0O0;
    int i = -1;
    if (localObject == null) {
      return i;
    }
    localObject = getFullSpanItem(paramInt);
    if (localObject != null)
    {
      localList = this.OooO0O0;
      localList.remove(localObject);
    }
    localObject = this.OooO0O0;
    int j = ((List)localObject).size();
    int k = 0;
    List localList = null;
    while (k < j)
    {
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem1 = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.OooO0O0.get(k);
      int m = localFullSpanItem1.o00OoOoo;
      if (m >= paramInt) {
        break label108;
      }
      k += 1;
    }
    k = i;
    label108:
    if (k != i)
    {
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem2 = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.OooO0O0.get(k);
      this.OooO0O0.remove(k);
      return localFullSpanItem2.o00OoOoo;
    }
    return i;
  }
  
  public void OooO0oo(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt1 = this.OooO00o;
    if (arrayOfInt1 != null)
    {
      int i = arrayOfInt1.length;
      if (paramInt1 < i)
      {
        i = paramInt1 + paramInt2;
        OooO0OO(i);
        int[] arrayOfInt2 = this.OooO00o;
        int j = arrayOfInt2.length - paramInt1 - paramInt2;
        System.arraycopy(arrayOfInt2, paramInt1, arrayOfInt2, i, j);
        arrayOfInt2 = this.OooO00o;
        j = -1;
        Arrays.fill(arrayOfInt2, paramInt1, i, j);
        OooOO0(paramInt1, paramInt2);
      }
    }
  }
  
  public final void OooOO0(int paramInt1, int paramInt2)
  {
    List localList = this.OooO0O0;
    if (localList == null) {
      return;
    }
    int i = localList.size() + -1;
    while (i >= 0)
    {
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.OooO0O0.get(i);
      int j = localFullSpanItem.o00OoOoo;
      if (j >= paramInt1)
      {
        j += paramInt2;
        localFullSpanItem.o00OoOoo = j;
      }
      i += -1;
    }
  }
  
  public final void OooOO0O(int paramInt1, int paramInt2)
  {
    List localList = this.OooO0O0;
    if (localList == null) {
      return;
    }
    int i = paramInt1 + paramInt2;
    int j = localList.size() + -1;
    while (j >= 0)
    {
      Object localObject = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.OooO0O0.get(j);
      int k = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).o00OoOoo;
      if (k >= paramInt1) {
        if (k < i)
        {
          localObject = this.OooO0O0;
          ((List)localObject).remove(j);
        }
        else
        {
          k -= paramInt2;
          ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).o00OoOoo = k;
        }
      }
      j += -1;
    }
  }
  
  public int OooOO0o(int paramInt)
  {
    int[] arrayOfInt = this.OooO00o;
    int i = arrayOfInt.length;
    while (i <= paramInt) {
      i *= 2;
    }
    return i;
  }
  
  public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem getFullSpanItem(int paramInt)
  {
    List localList = this.OooO0O0;
    if (localList == null) {
      return null;
    }
    int i = localList.size() + -1;
    while (i >= 0)
    {
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.OooO0O0.get(i);
      int j = localFullSpanItem.o00OoOoo;
      if (j == paramInt) {
        return localFullSpanItem;
      }
      i += -1;
    }
    return null;
  }
  
  public int getSpan(int paramInt)
  {
    int[] arrayOfInt = this.OooO00o;
    if (arrayOfInt != null)
    {
      int i = arrayOfInt.length;
      if (paramInt < i) {
        return arrayOfInt[paramInt];
      }
    }
    return -1;
  }
  
  public void setSpan(int paramInt, StaggeredGridLayoutManager.Span paramSpan)
  {
    OooO0OO(paramInt);
    int[] arrayOfInt = this.OooO00o;
    int i = paramSpan.OooO0o0;
    arrayOfInt[paramInt] = i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup
 * JD-Core Version:    0.7.0.1
 */