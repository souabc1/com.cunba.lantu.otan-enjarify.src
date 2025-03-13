package androidx.recyclerview.widget;

import java.util.Comparator;

class GapWorker$1
  implements Comparator
{
  public int OooO00o(GapWorker.Task paramTask1, GapWorker.Task paramTask2)
  {
    RecyclerView localRecyclerView1 = paramTask1.OooO0Oo;
    int i = 1;
    int j;
    if (localRecyclerView1 == null) {
      j = i;
    } else {
      j = 0;
    }
    RecyclerView localRecyclerView2 = paramTask2.OooO0Oo;
    int k;
    if (localRecyclerView2 == null)
    {
      k = i;
    }
    else
    {
      k = 0;
      localRecyclerView2 = null;
    }
    int m = -1;
    float f = 0.0F / 0.0F;
    if (j != k)
    {
      if (localRecyclerView1 != null) {
        i = m;
      }
      return i;
    }
    boolean bool2 = paramTask1.OooO00o;
    boolean bool1 = paramTask2.OooO00o;
    if (bool2 != bool1)
    {
      if (bool2) {
        i = m;
      }
      return i;
    }
    int n = paramTask2.OooO0O0;
    i = paramTask1.OooO0O0;
    n -= i;
    if (n != 0) {
      return n;
    }
    int i1 = paramTask1.OooO0OO;
    int i2 = paramTask2.OooO0OO;
    i1 -= i2;
    if (i1 != 0) {
      return i1;
    }
    return 0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.GapWorker.1
 * JD-Core Version:    0.7.0.1
 */