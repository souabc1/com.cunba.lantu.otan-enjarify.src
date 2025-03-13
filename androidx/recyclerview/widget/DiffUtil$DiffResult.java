package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DiffUtil$DiffResult
{
  public final List OooO00o;
  public final int[] OooO0O0;
  public final int[] OooO0OO;
  public final DiffUtil.Callback OooO0Oo;
  public final int OooO0o;
  public final int OooO0o0;
  public final boolean OooO0oO;
  
  public DiffUtil$DiffResult(DiffUtil.Callback paramCallback, List paramList, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean)
  {
    this.OooO00o = paramList;
    this.OooO0O0 = paramArrayOfInt1;
    this.OooO0OO = paramArrayOfInt2;
    Arrays.fill(paramArrayOfInt1, 0);
    Arrays.fill(paramArrayOfInt2, 0);
    this.OooO0Oo = paramCallback;
    int i = paramCallback.getOldListSize();
    this.OooO0o0 = i;
    int j = paramCallback.getNewListSize();
    this.OooO0o = j;
    this.OooO0oO = paramBoolean;
    OooO00o();
    OooO0o0();
  }
  
  public static DiffUtil.PostponedUpdate OooO0oO(Collection paramCollection, int paramInt, boolean paramBoolean)
  {
    paramCollection = paramCollection.iterator();
    boolean bool2;
    do
    {
      int i;
      do
      {
        bool1 = paramCollection.hasNext();
        if (!bool1) {
          break;
        }
        localPostponedUpdate1 = (DiffUtil.PostponedUpdate)paramCollection.next();
        i = localPostponedUpdate1.OooO00o;
      } while (i != paramInt);
      bool2 = localPostponedUpdate1.OooO0OO;
    } while (bool2 != paramBoolean);
    paramCollection.remove();
    break label69;
    boolean bool1 = false;
    DiffUtil.PostponedUpdate localPostponedUpdate1 = null;
    for (;;)
    {
      label69:
      paramInt = paramCollection.hasNext();
      if (paramInt == 0) {
        break;
      }
      DiffUtil.PostponedUpdate localPostponedUpdate2 = (DiffUtil.PostponedUpdate)paramCollection.next();
      int j = localPostponedUpdate2.OooO0O0;
      if (paramBoolean) {
        j += -1;
      } else {
        j += 1;
      }
      localPostponedUpdate2.OooO0O0 = j;
    }
    return localPostponedUpdate1;
  }
  
  public final void OooO00o()
  {
    Object localObject = this.OooO00o;
    boolean bool = ((List)localObject).isEmpty();
    if (bool)
    {
      bool = false;
      localObject = null;
    }
    else
    {
      localObject = (DiffUtil.Diagonal)this.OooO00o.get(0);
    }
    if (localObject != null)
    {
      int j = ((DiffUtil.Diagonal)localObject).OooO00o;
      if (j == 0)
      {
        int i = ((DiffUtil.Diagonal)localObject).OooO0O0;
        if (i == 0) {
          break label86;
        }
      }
    }
    localObject = this.OooO00o;
    DiffUtil.Diagonal localDiagonal = new androidx/recyclerview/widget/DiffUtil$Diagonal;
    localDiagonal.<init>(0, 0, 0);
    ((List)localObject).add(0, localDiagonal);
    label86:
    localObject = this.OooO00o;
    localDiagonal = new androidx/recyclerview/widget/DiffUtil$Diagonal;
    int k = this.OooO0o0;
    int m = this.OooO0o;
    localDiagonal.<init>(k, m, 0);
    ((List)localObject).add(localDiagonal);
  }
  
  public void OooO0O0(ListUpdateCallback paramListUpdateCallback)
  {
    boolean bool = paramListUpdateCallback instanceof BatchingListUpdateCallback;
    if (bool)
    {
      paramListUpdateCallback = (BatchingListUpdateCallback)paramListUpdateCallback;
    }
    else
    {
      BatchingListUpdateCallback localBatchingListUpdateCallback = new androidx/recyclerview/widget/BatchingListUpdateCallback;
      localBatchingListUpdateCallback.<init>(paramListUpdateCallback);
      paramListUpdateCallback = localBatchingListUpdateCallback;
    }
    int i = this.OooO0o0;
    ArrayDeque localArrayDeque = new java/util/ArrayDeque;
    localArrayDeque.<init>();
    int j = this.OooO0o0;
    int k = this.OooO0o;
    List localList = this.OooO00o;
    int m = localList.size();
    int n = 1;
    m -= n;
    while (m >= 0)
    {
      DiffUtil.Diagonal localDiagonal = (DiffUtil.Diagonal)this.OooO00o.get(m);
      int i1 = localDiagonal.OooO00o();
      int i2 = localDiagonal.OooO0O0();
      int i3;
      int i4;
      int i5;
      for (;;)
      {
        i3 = 0;
        DiffUtil.PostponedUpdate localPostponedUpdate1 = null;
        if (j <= i1) {
          break;
        }
        j += -1;
        Object localObject1 = this.OooO0O0;
        i4 = localObject1[j];
        i5 = i4 & 0xC;
        if (i5 != 0)
        {
          i5 = i4 >> 4;
          localPostponedUpdate1 = OooO0oO(localArrayDeque, i5, false);
          if (localPostponedUpdate1 != null)
          {
            i3 = localPostponedUpdate1.OooO0O0;
            i3 = i - i3 - n;
            paramListUpdateCallback.OooO00o(j, i3);
            i4 &= 0x4;
            if (i4 != 0)
            {
              localObject1 = this.OooO0Oo.OooO0OO(j, i5);
              paramListUpdateCallback.OooO0Oo(i3, n, localObject1);
            }
          }
          else
          {
            localPostponedUpdate1 = new androidx/recyclerview/widget/DiffUtil$PostponedUpdate;
            i4 = i - j - n;
            localPostponedUpdate1.<init>(j, i4, n);
            localArrayDeque.add(localPostponedUpdate1);
          }
        }
        else
        {
          paramListUpdateCallback.OooO0OO(j, n);
          i += -1;
        }
      }
      Object localObject2;
      while (k > i2)
      {
        k += -1;
        localObject2 = this.OooO0OO;
        i1 = localObject2[k];
        i4 = i1 & 0xC;
        if (i4 != 0)
        {
          i4 = i1 >> 4;
          DiffUtil.PostponedUpdate localPostponedUpdate2 = OooO0oO(localArrayDeque, i4, n);
          if (localPostponedUpdate2 == null)
          {
            localObject2 = new androidx/recyclerview/widget/DiffUtil$PostponedUpdate;
            i4 = i - j;
            ((DiffUtil.PostponedUpdate)localObject2).<init>(k, i4, false);
            localArrayDeque.add(localObject2);
          }
          else
          {
            i5 = localPostponedUpdate2.OooO0O0;
            i5 = i - i5 - n;
            paramListUpdateCallback.OooO00o(i5, j);
            i1 &= 0x4;
            if (i1 != 0)
            {
              localObject2 = this.OooO0Oo.OooO0OO(i4, k);
              paramListUpdateCallback.OooO0Oo(j, n, localObject2);
            }
          }
        }
        else
        {
          paramListUpdateCallback.OooO0O0(j, n);
          i += 1;
        }
      }
      j = localDiagonal.OooO00o;
      k = localDiagonal.OooO0O0;
      for (;;)
      {
        i1 = localDiagonal.OooO0OO;
        if (i3 >= i1) {
          break;
        }
        localObject2 = this.OooO0O0;
        i1 = localObject2[j] & 0xF;
        i2 = 2;
        if (i1 == i2)
        {
          localObject2 = this.OooO0Oo.OooO0OO(j, k);
          paramListUpdateCallback.OooO0Oo(j, n, localObject2);
        }
        j += 1;
        k += 1;
        i3 += 1;
      }
      j = localDiagonal.OooO00o;
      k = localDiagonal.OooO0O0;
      m += -1;
    }
    paramListUpdateCallback.OooO0o0();
  }
  
  public void OooO0OO(RecyclerView.Adapter paramAdapter)
  {
    AdapterListUpdateCallback localAdapterListUpdateCallback = new androidx/recyclerview/widget/AdapterListUpdateCallback;
    localAdapterListUpdateCallback.<init>(paramAdapter);
    OooO0O0(localAdapterListUpdateCallback);
  }
  
  public final void OooO0Oo(int paramInt)
  {
    Object localObject1 = this.OooO00o;
    int i = ((List)localObject1).size();
    int k = 0;
    int m = 0;
    while (k < i)
    {
      Object localObject2 = (DiffUtil.Diagonal)this.OooO00o.get(k);
      for (;;)
      {
        int n = ((DiffUtil.Diagonal)localObject2).OooO0O0;
        if (m >= n) {
          break;
        }
        Object localObject3 = this.OooO0OO;
        n = localObject3[m];
        if (n == 0)
        {
          localObject3 = this.OooO0Oo;
          boolean bool2 = ((DiffUtil.Callback)localObject3).OooO0O0(paramInt, m);
          if (bool2)
          {
            localObject1 = this.OooO0Oo;
            boolean bool1 = ((DiffUtil.Callback)localObject1).OooO00o(paramInt, m);
            k = 4;
            int j;
            if (bool1) {
              j = 8;
            } else {
              j = k;
            }
            localObject2 = this.OooO0O0;
            int i1 = m << 4 | j;
            localObject2[paramInt] = i1;
            localObject2 = this.OooO0OO;
            paramInt = paramInt << k | j;
            localObject2[m] = paramInt;
            return;
          }
        }
        m += 1;
      }
      m = ((DiffUtil.Diagonal)localObject2).OooO0O0();
      k += 1;
    }
  }
  
  public final void OooO0o()
  {
    Iterator localIterator = this.OooO00o.iterator();
    DiffUtil.Diagonal localDiagonal;
    for (int i = 0;; i = localDiagonal.OooO00o())
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localDiagonal = (DiffUtil.Diagonal)localIterator.next();
      for (;;)
      {
        int j = localDiagonal.OooO00o;
        if (i >= j) {
          break;
        }
        int[] arrayOfInt = this.OooO0O0;
        j = arrayOfInt[i];
        if (j == 0) {
          OooO0Oo(i);
        }
        i += 1;
      }
    }
  }
  
  public final void OooO0o0()
  {
    Iterator localIterator = this.OooO00o.iterator();
    boolean bool1 = localIterator.hasNext();
    if (bool1)
    {
      DiffUtil.Diagonal localDiagonal = (DiffUtil.Diagonal)localIterator.next();
      int i = 0;
      for (;;)
      {
        int j = localDiagonal.OooO0OO;
        if (i >= j) {
          break;
        }
        j = localDiagonal.OooO00o + i;
        int k = localDiagonal.OooO0O0 + i;
        DiffUtil.Callback localCallback = this.OooO0Oo;
        boolean bool2 = localCallback.OooO00o(j, k);
        int m;
        if (bool2) {
          bool2 = true;
        } else {
          m = 2;
        }
        int[] arrayOfInt = this.OooO0O0;
        int n = k << 4 | m;
        arrayOfInt[j] = n;
        arrayOfInt = this.OooO0OO;
        j = j << 4 | m;
        arrayOfInt[k] = j;
        i += 1;
      }
    }
    boolean bool3 = this.OooO0oO;
    if (bool3) {
      OooO0o();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.DiffUtil.DiffResult
 * JD-Core Version:    0.7.0.1
 */