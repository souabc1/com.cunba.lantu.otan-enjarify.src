package androidx.recyclerview.widget;

import java.util.List;

class OpReorderer
{
  public final OpReorderer.Callback OooO00o;
  
  public OpReorderer(OpReorderer.Callback paramCallback)
  {
    this.OooO00o = paramCallback;
  }
  
  public final int OooO00o(List paramList)
  {
    int i = paramList.size();
    int j = 1;
    i -= j;
    int k = 0;
    while (i >= 0)
    {
      AdapterHelper.UpdateOp localUpdateOp = (AdapterHelper.UpdateOp)paramList.get(i);
      int m = localUpdateOp.OooO00o;
      int n = 8;
      if (m == n)
      {
        if (k != 0) {
          return i;
        }
      }
      else {
        k = j;
      }
      i += -1;
    }
    return -1;
  }
  
  public void OooO0O0(List paramList)
  {
    for (;;)
    {
      int i = OooO00o(paramList);
      int j = -1;
      if (i == j) {
        break;
      }
      j = i + 1;
      OooO0Oo(paramList, i, j);
    }
  }
  
  public final void OooO0OO(List paramList, int paramInt1, AdapterHelper.UpdateOp paramUpdateOp1, int paramInt2, AdapterHelper.UpdateOp paramUpdateOp2)
  {
    int i = paramUpdateOp1.OooO0Oo;
    int j = paramUpdateOp2.OooO0O0;
    int k;
    if (i < j) {
      k = -1;
    } else {
      k = 0;
    }
    int m = paramUpdateOp1.OooO0O0;
    if (m < j) {
      k += 1;
    }
    if (j <= m)
    {
      j = paramUpdateOp2.OooO0Oo;
      m += j;
      paramUpdateOp1.OooO0O0 = m;
    }
    j = paramUpdateOp2.OooO0O0;
    if (j <= i)
    {
      m = paramUpdateOp2.OooO0Oo;
      i += m;
      paramUpdateOp1.OooO0Oo = i;
    }
    j += k;
    paramUpdateOp2.OooO0O0 = j;
    paramList.set(paramInt1, paramUpdateOp2);
    paramList.set(paramInt2, paramUpdateOp1);
  }
  
  public final void OooO0Oo(List paramList, int paramInt1, int paramInt2)
  {
    Object localObject1 = paramList.get(paramInt1);
    Object localObject2 = localObject1;
    localObject2 = (AdapterHelper.UpdateOp)localObject1;
    localObject1 = paramList.get(paramInt2);
    Object localObject3 = localObject1;
    localObject3 = (AdapterHelper.UpdateOp)localObject1;
    int i = ((AdapterHelper.UpdateOp)localObject3).OooO00o;
    int j = 1;
    if (i != j)
    {
      j = 2;
      if (i != j)
      {
        j = 4;
        if (i == j) {
          OooO0o(paramList, paramInt1, (AdapterHelper.UpdateOp)localObject2, paramInt2, (AdapterHelper.UpdateOp)localObject3);
        }
      }
      else
      {
        OooO0o0(paramList, paramInt1, (AdapterHelper.UpdateOp)localObject2, paramInt2, (AdapterHelper.UpdateOp)localObject3);
      }
    }
    else
    {
      OooO0OO(paramList, paramInt1, (AdapterHelper.UpdateOp)localObject2, paramInt2, (AdapterHelper.UpdateOp)localObject3);
    }
  }
  
  public void OooO0o(List paramList, int paramInt1, AdapterHelper.UpdateOp paramUpdateOp1, int paramInt2, AdapterHelper.UpdateOp paramUpdateOp2)
  {
    int i = paramUpdateOp1.OooO0Oo;
    int j = paramUpdateOp2.OooO0O0;
    int k = 4;
    int m = 1;
    Object localObject1 = null;
    if (i < j)
    {
      j -= m;
      paramUpdateOp2.OooO0O0 = j;
    }
    else
    {
      n = paramUpdateOp2.OooO0Oo;
      j += n;
      if (i < j)
      {
        n -= m;
        paramUpdateOp2.OooO0Oo = n;
        localObject2 = this.OooO00o;
        j = paramUpdateOp1.OooO0O0;
        Object localObject3 = paramUpdateOp2.OooO0OO;
        localObject2 = ((OpReorderer.Callback)localObject2).OooO0O0(k, j, m, localObject3);
        break label126;
      }
    }
    i = 0;
    Object localObject2 = null;
    label126:
    j = paramUpdateOp1.OooO0O0;
    int n = paramUpdateOp2.OooO0O0;
    if (j <= n)
    {
      n += m;
      paramUpdateOp2.OooO0O0 = n;
    }
    else
    {
      int i1 = paramUpdateOp2.OooO0Oo;
      int i2 = n + i1;
      if (j < i2)
      {
        n = n + i1 - j;
        localObject1 = this.OooO00o;
        j += m;
        Object localObject4 = paramUpdateOp2.OooO0OO;
        localObject1 = ((OpReorderer.Callback)localObject1).OooO0O0(k, j, n, localObject4);
        j = paramUpdateOp2.OooO0Oo - n;
        paramUpdateOp2.OooO0Oo = j;
      }
    }
    paramList.set(paramInt2, paramUpdateOp1);
    int i3 = paramUpdateOp2.OooO0Oo;
    if (i3 > 0)
    {
      paramList.set(paramInt1, paramUpdateOp2);
    }
    else
    {
      paramList.remove(paramInt1);
      paramUpdateOp1 = this.OooO00o;
      paramUpdateOp1.OooO00o(paramUpdateOp2);
    }
    if (localObject2 != null) {
      paramList.add(paramInt1, localObject2);
    }
    if (localObject1 != null) {
      paramList.add(paramInt1, localObject1);
    }
  }
  
  public void OooO0o0(List paramList, int paramInt1, AdapterHelper.UpdateOp paramUpdateOp1, int paramInt2, AdapterHelper.UpdateOp paramUpdateOp2)
  {
    int i = paramUpdateOp1.OooO0O0;
    int j = paramUpdateOp1.OooO0Oo;
    int k = 1;
    int m = 0;
    int n = paramUpdateOp2.OooO0O0;
    if (i < j)
    {
      if (n == i)
      {
        n = paramUpdateOp2.OooO0Oo;
        i = j - i;
        if (n == i)
        {
          i = 0;
          m = k;
          break label125;
        }
      }
      i = 0;
    }
    else
    {
      i1 = j + 1;
      if (n == i1)
      {
        n = paramUpdateOp2.OooO0Oo;
        i -= j;
        if (n == i)
        {
          i = k;
          m = k;
          break label125;
        }
      }
      i = k;
    }
    label125:
    n = paramUpdateOp2.OooO0O0;
    int i1 = 2;
    if (j < n)
    {
      n -= k;
      paramUpdateOp2.OooO0O0 = n;
    }
    else
    {
      i2 = paramUpdateOp2.OooO0Oo;
      n += i2;
      if (j < n)
      {
        i2 -= k;
        paramUpdateOp2.OooO0Oo = i2;
        paramUpdateOp1.OooO00o = i1;
        paramUpdateOp1.OooO0Oo = k;
        paramInt1 = paramUpdateOp2.OooO0Oo;
        if (paramInt1 == 0)
        {
          paramList.remove(paramInt2);
          paramList = this.OooO00o;
          paramList.OooO00o(paramUpdateOp2);
        }
        return;
      }
    }
    j = paramUpdateOp1.OooO0O0;
    n = paramUpdateOp2.OooO0O0;
    int i2 = 0;
    AdapterHelper.UpdateOp localUpdateOp = null;
    if (j <= n)
    {
      n += k;
      paramUpdateOp2.OooO0O0 = n;
    }
    else
    {
      int i3 = paramUpdateOp2.OooO0Oo;
      int i4 = n + i3;
      if (j < i4)
      {
        n = n + i3 - j;
        OpReorderer.Callback localCallback = this.OooO00o;
        j += k;
        localUpdateOp = localCallback.OooO0O0(i1, j, n, null);
        j = paramUpdateOp1.OooO0O0;
        k = paramUpdateOp2.OooO0O0;
        j -= k;
        paramUpdateOp2.OooO0Oo = j;
      }
    }
    if (m != 0)
    {
      paramList.set(paramInt1, paramUpdateOp2);
      paramList.remove(paramInt2);
      this.OooO00o.OooO00o(paramUpdateOp1);
      return;
    }
    if (i != 0)
    {
      if (localUpdateOp != null)
      {
        i = paramUpdateOp1.OooO0O0;
        j = localUpdateOp.OooO0O0;
        if (i > j)
        {
          j = localUpdateOp.OooO0Oo;
          i -= j;
          paramUpdateOp1.OooO0O0 = i;
        }
        i = paramUpdateOp1.OooO0Oo;
        j = localUpdateOp.OooO0O0;
        if (i > j)
        {
          j = localUpdateOp.OooO0Oo;
          i -= j;
          paramUpdateOp1.OooO0Oo = i;
        }
      }
      i = paramUpdateOp1.OooO0O0;
      j = paramUpdateOp2.OooO0O0;
      if (i > j)
      {
        j = paramUpdateOp2.OooO0Oo;
        i -= j;
        paramUpdateOp1.OooO0O0 = i;
      }
      i = paramUpdateOp1.OooO0Oo;
      j = paramUpdateOp2.OooO0O0;
      if (i <= j) {
        break label722;
      }
    }
    else
    {
      if (localUpdateOp != null)
      {
        i = paramUpdateOp1.OooO0O0;
        j = localUpdateOp.OooO0O0;
        if (i >= j)
        {
          j = localUpdateOp.OooO0Oo;
          i -= j;
          paramUpdateOp1.OooO0O0 = i;
        }
        i = paramUpdateOp1.OooO0Oo;
        j = localUpdateOp.OooO0O0;
        if (i >= j)
        {
          j = localUpdateOp.OooO0Oo;
          i -= j;
          paramUpdateOp1.OooO0Oo = i;
        }
      }
      i = paramUpdateOp1.OooO0O0;
      j = paramUpdateOp2.OooO0O0;
      if (i >= j)
      {
        j = paramUpdateOp2.OooO0Oo;
        i -= j;
        paramUpdateOp1.OooO0O0 = i;
      }
      i = paramUpdateOp1.OooO0Oo;
      j = paramUpdateOp2.OooO0O0;
      if (i < j) {
        break label722;
      }
    }
    j = paramUpdateOp2.OooO0Oo;
    i -= j;
    paramUpdateOp1.OooO0Oo = i;
    label722:
    paramList.set(paramInt1, paramUpdateOp2);
    int i5 = paramUpdateOp1.OooO0O0;
    i = paramUpdateOp1.OooO0Oo;
    if (i5 != i) {
      paramList.set(paramInt2, paramUpdateOp1);
    } else {
      paramList.remove(paramInt2);
    }
    if (localUpdateOp != null) {
      paramList.add(paramInt1, localUpdateOp);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.OpReorderer
 * JD-Core Version:    0.7.0.1
 */