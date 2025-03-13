package androidx.recyclerview.widget;

import android.view.View;

class ScrollbarHelper
{
  public static int OooO00o(RecyclerView.State paramState, OrientationHelper paramOrientationHelper, View paramView1, View paramView2, RecyclerView.LayoutManager paramLayoutManager, boolean paramBoolean)
  {
    int i = paramLayoutManager.getChildCount();
    if (i != 0)
    {
      int j = paramState.getItemCount();
      if ((j != 0) && (paramView1 != null) && (paramView2 != null))
      {
        if (!paramBoolean)
        {
          j = paramLayoutManager.getPosition(paramView1);
          int k = paramLayoutManager.getPosition(paramView2);
          return Math.abs(j - k) + 1;
        }
        j = paramOrientationHelper.OooO0Oo(paramView2);
        int m = paramOrientationHelper.OooO0oO(paramView1);
        j -= m;
        return Math.min(paramOrientationHelper.getTotalSpace(), j);
      }
    }
    return 0;
  }
  
  public static int OooO0O0(RecyclerView.State paramState, OrientationHelper paramOrientationHelper, View paramView1, View paramView2, RecyclerView.LayoutManager paramLayoutManager, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = paramLayoutManager.getChildCount();
    if (i != 0)
    {
      i = paramState.getItemCount();
      if ((i != 0) && (paramView1 != null) && (paramView2 != null))
      {
        i = paramLayoutManager.getPosition(paramView1);
        int j = paramLayoutManager.getPosition(paramView2);
        i = Math.min(i, j);
        j = paramLayoutManager.getPosition(paramView1);
        int k = paramLayoutManager.getPosition(paramView2);
        j = Math.max(j, k);
        int m;
        if (paramBoolean2)
        {
          m = paramState.getItemCount() - j + -1;
          m = Math.max(0, m);
        }
        else
        {
          m = Math.max(0, i);
        }
        if (!paramBoolean1) {
          return m;
        }
        paramBoolean1 = paramOrientationHelper.OooO0Oo(paramView2);
        paramBoolean2 = paramOrientationHelper.OooO0oO(paramView1);
        paramBoolean1 = Math.abs(paramBoolean1 - paramBoolean2);
        paramBoolean2 = paramLayoutManager.getPosition(paramView1);
        boolean bool = paramLayoutManager.getPosition(paramView2);
        int n = Math.abs(paramBoolean2 - bool) + 1;
        float f1 = paramBoolean1;
        float f2 = n;
        f1 /= f2;
        float f3 = m * f1;
        n = paramOrientationHelper.getStartAfterPadding();
        int i1 = paramOrientationHelper.OooO0oO(paramView1);
        float f4 = n - i1;
        return Math.round(f3 + f4);
      }
    }
    return 0;
  }
  
  public static int OooO0OO(RecyclerView.State paramState, OrientationHelper paramOrientationHelper, View paramView1, View paramView2, RecyclerView.LayoutManager paramLayoutManager, boolean paramBoolean)
  {
    int i = paramLayoutManager.getChildCount();
    if (i != 0)
    {
      i = paramState.getItemCount();
      if ((i != 0) && (paramView1 != null) && (paramView2 != null))
      {
        if (!paramBoolean) {
          return paramState.getItemCount();
        }
        paramBoolean = paramOrientationHelper.OooO0Oo(paramView2);
        boolean bool = paramOrientationHelper.OooO0oO(paramView1);
        paramBoolean -= bool;
        int j = paramLayoutManager.getPosition(paramView1);
        int k = paramLayoutManager.getPosition(paramView2);
        j = Math.abs(j - k) + 1;
        float f1 = paramBoolean;
        float f2 = j;
        f1 /= f2;
        float f3 = paramState.getItemCount();
        return (int)(f1 * f3);
      }
    }
    return 0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.ScrollbarHelper
 * JD-Core Version:    0.7.0.1
 */