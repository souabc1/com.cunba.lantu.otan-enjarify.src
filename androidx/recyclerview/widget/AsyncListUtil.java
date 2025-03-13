package androidx.recyclerview.widget;

import android.util.SparseIntArray;

public class AsyncListUtil
{
  public final int[] OooO;
  public final Class OooO00o;
  public final int OooO0O0;
  public final AsyncListUtil.DataCallback OooO0OO;
  public final AsyncListUtil.ViewCallback OooO0Oo;
  public final ThreadUtil.MainThreadCallback OooO0o;
  public final TileList OooO0o0;
  public final ThreadUtil.BackgroundCallback OooO0oO;
  public final int[] OooO0oo;
  public final int[] OooOO0;
  public boolean OooOO0O;
  public int OooOO0o;
  public int OooOOO;
  public int OooOOO0;
  public int OooOOOO;
  public final SparseIntArray OooOOOo;
  
  private boolean isRefreshPending()
  {
    int i = this.OooOOOO;
    int j = this.OooOOO;
    if (i != j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void OooO00o()
  {
    Object localObject1 = this.OooO0Oo;
    int[] arrayOfInt1 = this.OooO0oo;
    ((AsyncListUtil.ViewCallback)localObject1).OooO0O0(arrayOfInt1);
    localObject1 = this.OooO0oo;
    arrayOfInt1 = null;
    int i = localObject1[0];
    int j = 1;
    int k = localObject1[j];
    if ((i <= k) && (i >= 0))
    {
      int m = this.OooOOO0;
      if (k >= m) {
        return;
      }
      boolean bool = this.OooOO0O;
      if (!bool) {}
      do
      {
        do
        {
          this.OooOO0o = 0;
          break;
          arrayOfInt2 = this.OooO;
          i1 = arrayOfInt2[j];
        } while (i > i1);
        n = arrayOfInt2[0];
      } while (n > k);
      if (i < n)
      {
        this.OooOO0o = j;
      }
      else if (i > n)
      {
        n = 2;
        this.OooOO0o = n;
      }
      int[] arrayOfInt2 = this.OooO;
      arrayOfInt2[0] = i;
      arrayOfInt2[j] = k;
      Object localObject2 = this.OooO0Oo;
      Object localObject3 = this.OooOO0;
      int n = this.OooOO0o;
      ((AsyncListUtil.ViewCallback)localObject2).OooO00o((int[])localObject1, (int[])localObject3, n);
      localObject1 = this.OooOO0;
      i = this.OooO0oo[0];
      k = Math.max(localObject1[0], 0);
      i = Math.min(i, k);
      localObject1[0] = i;
      localObject1 = this.OooOO0;
      localObject2 = this.OooO0oo;
      i = localObject2[j];
      k = localObject1[j];
      n = this.OooOOO0 - j;
      k = Math.min(k, n);
      i = Math.max(i, k);
      localObject1[j] = i;
      localObject3 = this.OooO0oO;
      localObject1 = this.OooO0oo;
      n = localObject1[0];
      int i1 = localObject1[j];
      localObject1 = this.OooOO0;
      int i2 = localObject1[0];
      int i3 = localObject1[j];
      int i4 = this.OooOO0o;
      ((ThreadUtil.BackgroundCallback)localObject3).OooO00o(n, i1, i2, i3, i4);
    }
  }
  
  public Object getItem(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = this.OooOOO0;
      if (paramInt < i)
      {
        localObject1 = this.OooO0o0.getItemAt(paramInt);
        if (localObject1 == null)
        {
          boolean bool = isRefreshPending();
          if (!bool)
          {
            localObject2 = this.OooOOOo;
            ((SparseIntArray)localObject2).put(paramInt, 0);
          }
        }
        return localObject1;
      }
    }
    Object localObject1 = new java/lang/IndexOutOfBoundsException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append(paramInt);
    ((StringBuilder)localObject2).append(" is not within 0 and ");
    paramInt = this.OooOOO0;
    ((StringBuilder)localObject2).append(paramInt);
    String str = ((StringBuilder)localObject2).toString();
    ((IndexOutOfBoundsException)localObject1).<init>(str);
    throw ((Throwable)localObject1);
  }
  
  public int getItemCount()
  {
    return this.OooOOO0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.AsyncListUtil
 * JD-Core Version:    0.7.0.1
 */