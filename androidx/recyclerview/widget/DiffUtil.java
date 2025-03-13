package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DiffUtil
{
  public static final Comparator OooO00o;
  
  static
  {
    DiffUtil.1 local1 = new androidx/recyclerview/widget/DiffUtil$1;
    local1.<init>();
    OooO00o = local1;
  }
  
  public static DiffUtil.Snake OooO00o(DiffUtil.Range paramRange, DiffUtil.Callback paramCallback, DiffUtil.CenteredArray paramCenteredArray1, DiffUtil.CenteredArray paramCenteredArray2, int paramInt)
  {
    int i = paramRange.OooO0O0();
    int j = paramRange.OooO00o();
    i = (i - j) % 2;
    j = 1;
    if (i == 0) {
      i = j;
    } else {
      i = 0;
    }
    int k = paramRange.OooO0O0();
    int m = paramRange.OooO00o();
    k -= m;
    m = -paramInt;
    int n = m;
    while (n <= paramInt)
    {
      if (n != m) {
        if (n != paramInt)
        {
          i1 = n + 1;
          i1 = paramCenteredArray2.get(i1);
          i2 = n + -1;
          i2 = paramCenteredArray2.get(i2);
          if (i1 < i2) {}
        }
        else
        {
          i1 = n + -1;
          i1 = paramCenteredArray2.get(i1);
          i2 = i1 + -1;
          break label167;
        }
      }
      int i1 = n + 1;
      i1 = paramCenteredArray2.get(i1);
      int i2 = i1;
      label167:
      int i3 = paramRange.OooO0Oo;
      int i4 = paramRange.OooO0O0 - i2 - n;
      i3 -= i4;
      if ((paramInt != 0) && (i2 == i1)) {
        i4 = i3 + 1;
      } else {
        i4 = i3;
      }
      for (;;)
      {
        int i5 = paramRange.OooO00o;
        if (i2 <= i5) {
          break;
        }
        i5 = paramRange.OooO0OO;
        if (i3 <= i5) {
          break;
        }
        i5 = i2 + -1;
        int i7 = i3 + -1;
        boolean bool = paramCallback.OooO0O0(i5, i7);
        if (!bool) {
          break;
        }
        i2 += -1;
        i3 += -1;
      }
      paramCenteredArray2.set(n, i2);
      if (i != 0)
      {
        int i6 = k - n;
        if ((i6 >= m) && (i6 <= paramInt))
        {
          i6 = paramCenteredArray1.get(i6);
          if (i6 >= i2)
          {
            paramRange = new androidx/recyclerview/widget/DiffUtil$Snake;
            paramRange.<init>();
            paramRange.OooO00o = i2;
            paramRange.OooO0O0 = i3;
            paramRange.OooO0OO = i1;
            paramRange.OooO0Oo = i4;
            paramRange.OooO0o0 = j;
            return paramRange;
          }
        }
      }
      n += 2;
    }
    return null;
  }
  
  public static DiffUtil.DiffResult OooO0O0(DiffUtil.Callback paramCallback)
  {
    return OooO0OO(paramCallback, true);
  }
  
  public static DiffUtil.DiffResult OooO0OO(DiffUtil.Callback paramCallback, boolean paramBoolean)
  {
    int i = paramCallback.getOldListSize();
    int j = paramCallback.getNewListSize();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = new androidx/recyclerview/widget/DiffUtil$Range;
    boolean bool1 = false;
    Object localObject3 = null;
    ((DiffUtil.Range)localObject2).<init>(0, i, 0, j);
    ((List)localObject1).add(localObject2);
    i = (i + j + 1) / 2;
    DiffUtil.CenteredArray localCenteredArray = new androidx/recyclerview/widget/DiffUtil$CenteredArray;
    i = i * 2 + 1;
    localCenteredArray.<init>(i);
    localObject2 = new androidx/recyclerview/widget/DiffUtil$CenteredArray;
    ((DiffUtil.CenteredArray)localObject2).<init>(i);
    Object localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    for (;;)
    {
      bool1 = ((List)localObject1).isEmpty();
      if (bool1) {
        break;
      }
      int k = ((List)localObject1).size() + -1;
      localObject3 = (DiffUtil.Range)((List)localObject1).remove(k);
      localObject5 = OooO0o0((DiffUtil.Range)localObject3, paramCallback, localCenteredArray, (DiffUtil.CenteredArray)localObject2);
      if (localObject5 != null)
      {
        int m = ((DiffUtil.Snake)localObject5).OooO00o();
        Object localObject6;
        if (m > 0)
        {
          localObject6 = ((DiffUtil.Snake)localObject5).OooO0OO();
          localArrayList.add(localObject6);
        }
        boolean bool2 = ((List)localObject4).isEmpty();
        if (bool2)
        {
          localObject6 = new androidx/recyclerview/widget/DiffUtil$Range;
          ((DiffUtil.Range)localObject6).<init>();
        }
        else
        {
          n = ((List)localObject4).size() + -1;
          localObject6 = (DiffUtil.Range)((List)localObject4).remove(n);
        }
        int i1 = ((DiffUtil.Range)localObject3).OooO00o;
        ((DiffUtil.Range)localObject6).OooO00o = i1;
        i1 = ((DiffUtil.Range)localObject3).OooO0OO;
        ((DiffUtil.Range)localObject6).OooO0OO = i1;
        i1 = ((DiffUtil.Snake)localObject5).OooO00o;
        ((DiffUtil.Range)localObject6).OooO0O0 = i1;
        i1 = ((DiffUtil.Snake)localObject5).OooO0O0;
        ((DiffUtil.Range)localObject6).OooO0Oo = i1;
        ((List)localObject1).add(localObject6);
        int n = ((DiffUtil.Range)localObject3).OooO0O0;
        ((DiffUtil.Range)localObject3).OooO0O0 = n;
        n = ((DiffUtil.Range)localObject3).OooO0Oo;
        ((DiffUtil.Range)localObject3).OooO0Oo = n;
        n = ((DiffUtil.Snake)localObject5).OooO0OO;
        ((DiffUtil.Range)localObject3).OooO00o = n;
        int i2 = ((DiffUtil.Snake)localObject5).OooO0Oo;
        ((DiffUtil.Range)localObject3).OooO0OO = i2;
        ((List)localObject1).add(localObject3);
      }
      else
      {
        ((List)localObject4).add(localObject3);
      }
    }
    localObject4 = OooO00o;
    Collections.sort(localArrayList, (Comparator)localObject4);
    localObject4 = new androidx/recyclerview/widget/DiffUtil$DiffResult;
    localObject3 = localCenteredArray.OooO00o();
    Object localObject5 = ((DiffUtil.CenteredArray)localObject2).OooO00o();
    localObject1 = localObject4;
    localObject2 = paramCallback;
    boolean bool3 = paramBoolean;
    ((DiffUtil.DiffResult)localObject4).<init>(paramCallback, localArrayList, (int[])localObject3, (int[])localObject5, paramBoolean);
    return localObject4;
  }
  
  public static DiffUtil.Snake OooO0Oo(DiffUtil.Range paramRange, DiffUtil.Callback paramCallback, DiffUtil.CenteredArray paramCenteredArray1, DiffUtil.CenteredArray paramCenteredArray2, int paramInt)
  {
    int i = paramRange.OooO0O0();
    int j = paramRange.OooO00o();
    i = Math.abs(i - j) % 2;
    j = 0;
    int k = 1;
    if (i != k) {
      k = 0;
    }
    i = paramRange.OooO0O0();
    int m = paramRange.OooO00o();
    i -= m;
    m = -paramInt;
    int n = m;
    while (n <= paramInt)
    {
      if (n != m) {
        if (n != paramInt)
        {
          i1 = n + 1;
          i1 = paramCenteredArray1.get(i1);
          i2 = n + -1;
          i2 = paramCenteredArray1.get(i2);
          if (i1 > i2) {}
        }
        else
        {
          i1 = n + -1;
          i1 = paramCenteredArray1.get(i1);
          i2 = i1 + 1;
          break label171;
        }
      }
      int i1 = n + 1;
      i1 = paramCenteredArray1.get(i1);
      int i2 = i1;
      label171:
      int i3 = paramRange.OooO0OO;
      int i4 = paramRange.OooO00o;
      i4 = i2 - i4;
      i3 = i3 + i4 - n;
      if ((paramInt != 0) && (i2 == i1)) {
        i4 = i3 + -1;
      } else {
        i4 = i3;
      }
      for (;;)
      {
        int i5 = paramRange.OooO0O0;
        if (i2 >= i5) {
          break;
        }
        i5 = paramRange.OooO0Oo;
        if (i3 >= i5) {
          break;
        }
        boolean bool = paramCallback.OooO0O0(i2, i3);
        if (!bool) {
          break;
        }
        i2 += 1;
        i3 += 1;
      }
      paramCenteredArray1.set(n, i2);
      if (k != 0)
      {
        int i6 = i - n;
        int i7 = m + 1;
        if (i6 >= i7)
        {
          i7 = paramInt + -1;
          if (i6 <= i7)
          {
            i6 = paramCenteredArray2.get(i6);
            if (i6 <= i2)
            {
              paramRange = new androidx/recyclerview/widget/DiffUtil$Snake;
              paramRange.<init>();
              paramRange.OooO00o = i1;
              paramRange.OooO0O0 = i4;
              paramRange.OooO0OO = i2;
              paramRange.OooO0Oo = i3;
              paramRange.OooO0o0 = false;
              return paramRange;
            }
          }
        }
      }
      n += 2;
    }
    return null;
  }
  
  public static DiffUtil.Snake OooO0o0(DiffUtil.Range paramRange, DiffUtil.Callback paramCallback, DiffUtil.CenteredArray paramCenteredArray1, DiffUtil.CenteredArray paramCenteredArray2)
  {
    int i = paramRange.OooO0O0();
    int j = 1;
    if (i >= j)
    {
      i = paramRange.OooO00o();
      if (i >= j)
      {
        i = paramRange.OooO0O0();
        int k = paramRange.OooO00o();
        i = (i + k + j) / 2;
        k = paramRange.OooO00o;
        paramCenteredArray1.set(j, k);
        k = paramRange.OooO0O0;
        paramCenteredArray2.set(j, k);
        j = 0;
        while (j < i)
        {
          DiffUtil.Snake localSnake = OooO0Oo(paramRange, paramCallback, paramCenteredArray1, paramCenteredArray2, j);
          if (localSnake != null) {
            return localSnake;
          }
          localSnake = OooO00o(paramRange, paramCallback, paramCenteredArray1, paramCenteredArray2, j);
          if (localSnake != null) {
            return localSnake;
          }
          j += 1;
        }
      }
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.DiffUtil
 * JD-Core Version:    0.7.0.1
 */