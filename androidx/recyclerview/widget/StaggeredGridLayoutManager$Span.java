package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

class StaggeredGridLayoutManager$Span
{
  public ArrayList OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public final int OooO0o0;
  
  public StaggeredGridLayoutManager$Span(StaggeredGridLayoutManager paramStaggeredGridLayoutManager, int paramInt)
  {
    paramStaggeredGridLayoutManager = new java/util/ArrayList;
    paramStaggeredGridLayoutManager.<init>();
    this.OooO00o = paramStaggeredGridLayoutManager;
    int i = -1 << -1;
    this.OooO0O0 = i;
    this.OooO0OO = i;
    this.OooO0Oo = 0;
    this.OooO0o0 = paramInt;
  }
  
  public int OooO(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    OrientationHelper localOrientationHelper1 = this.OooO0o.OooO0OO;
    int i = localOrientationHelper1.getStartAfterPadding();
    OrientationHelper localOrientationHelper2 = this.OooO0o.OooO0OO;
    int j = localOrientationHelper2.getEndAfterPadding();
    int k = -1;
    int m = 1;
    int n;
    if (paramInt2 > paramInt1) {
      n = m;
    } else {
      n = k;
    }
    while (paramInt1 != paramInt2)
    {
      View localView = (View)this.OooO00o.get(paramInt1);
      OrientationHelper localOrientationHelper3 = this.OooO0o.OooO0OO;
      int i1 = localOrientationHelper3.OooO0oO(localView);
      OrientationHelper localOrientationHelper4 = this.OooO0o.OooO0OO;
      int i2 = localOrientationHelper4.OooO0Oo(localView);
      int i3 = 0;
      int i4;
      if (paramBoolean3 ? i1 <= j : i1 < j) {
        i4 = m;
      } else {
        i4 = 0;
      }
      if (paramBoolean3 ? i2 >= i : i2 > i) {
        i3 = m;
      }
      if ((i4 != 0) && (i3 != 0)) {
        if ((paramBoolean1) && (paramBoolean2))
        {
          if ((i1 < i) || (i2 > j)) {}
        }
        else {
          while ((paramBoolean2) || (i1 < i) || (i2 > j)) {
            return this.OooO0o.getPosition(localView);
          }
        }
      }
      paramInt1 += n;
    }
    return k;
  }
  
  public void OooO00o(View paramView)
  {
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = OooOOO0(paramView);
    localLayoutParams.OooO0o0 = this;
    Object localObject = this.OooO00o;
    ((ArrayList)localObject).add(paramView);
    int i = -1 << -1;
    this.OooO0OO = i;
    ArrayList localArrayList = this.OooO00o;
    int j = localArrayList.size();
    int k = 1;
    if (j == k) {
      this.OooO0O0 = i;
    }
    boolean bool1 = localLayoutParams.isItemRemoved();
    if (!bool1)
    {
      boolean bool2 = localLayoutParams.isItemChanged();
      if (!bool2) {}
    }
    else
    {
      int m = this.OooO0Oo;
      localObject = this.OooO0o.OooO0OO;
      int n = ((OrientationHelper)localObject).OooO0o0(paramView);
      m += n;
      this.OooO0Oo = m;
    }
  }
  
  public void OooO0O0(boolean paramBoolean, int paramInt)
  {
    int i = -1 << -1;
    int j;
    if (paramBoolean) {
      j = getEndLine(i);
    } else {
      j = getStartLine(i);
    }
    OooO0o0();
    if (j == i) {
      return;
    }
    if (paramBoolean)
    {
      OrientationHelper localOrientationHelper1 = this.OooO0o.OooO0OO;
      int k = localOrientationHelper1.getEndAfterPadding();
      if (j < k) {}
    }
    else
    {
      if (paramBoolean) {
        break label89;
      }
      OrientationHelper localOrientationHelper2 = this.OooO0o.OooO0OO;
      paramBoolean = localOrientationHelper2.getStartAfterPadding();
      if (j <= paramBoolean) {
        break label89;
      }
    }
    return;
    label89:
    if (paramInt != i) {
      j += paramInt;
    }
    this.OooO0OO = j;
    this.OooO0O0 = j;
  }
  
  public void OooO0OO()
  {
    Object localObject = this.OooO00o;
    int i = ((ArrayList)localObject).size();
    int j = 1;
    i -= j;
    localObject = (View)((ArrayList)localObject).get(i);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = OooOOO0((View)localObject);
    OrientationHelper localOrientationHelper = this.OooO0o.OooO0OO;
    int k = localOrientationHelper.OooO0Oo((View)localObject);
    this.OooO0OO = k;
    boolean bool = localLayoutParams.OooO0o;
    if (bool)
    {
      localObject = this.OooO0o.OooOOO0;
      i = localLayoutParams.getViewLayoutPosition();
      localObject = ((StaggeredGridLayoutManager.LazySpanLookup)localObject).getFullSpanItem(i);
      if (localObject != null)
      {
        i = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).o00Ooo00;
        if (i == j)
        {
          i = this.OooO0OO;
          j = this.OooO0o0;
          int m = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).getGapForSpan(j);
          i += m;
          this.OooO0OO = i;
        }
      }
    }
  }
  
  public void OooO0Oo()
  {
    Object localObject = this.OooO00o;
    int i = 0;
    localObject = (View)((ArrayList)localObject).get(0);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = OooOOO0((View)localObject);
    OrientationHelper localOrientationHelper = this.OooO0o.OooO0OO;
    int j = localOrientationHelper.OooO0oO((View)localObject);
    this.OooO0O0 = j;
    boolean bool = localLayoutParams.OooO0o;
    if (bool)
    {
      localObject = this.OooO0o.OooOOO0;
      i = localLayoutParams.getViewLayoutPosition();
      localObject = ((StaggeredGridLayoutManager.LazySpanLookup)localObject).getFullSpanItem(i);
      if (localObject != null)
      {
        i = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).o00Ooo00;
        int m = -1;
        if (i == m)
        {
          i = this.OooO0O0;
          m = this.OooO0o0;
          int k = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).getGapForSpan(m);
          i -= k;
          this.OooO0O0 = i;
        }
      }
    }
  }
  
  public int OooO0o()
  {
    Object localObject = this.OooO0o;
    boolean bool = ((StaggeredGridLayoutManager)localObject).OooO0oo;
    int j = 1;
    int i;
    int k;
    if (bool)
    {
      localObject = this.OooO00o;
      i = ((ArrayList)localObject).size() - j;
      k = -1;
      i = OooOO0(i, k, j);
    }
    else
    {
      localObject = this.OooO00o;
      i = ((ArrayList)localObject).size();
      k = 0;
      i = OooOO0(0, i, j);
    }
    return i;
  }
  
  public void OooO0o0()
  {
    this.OooO00o.clear();
    OooOOO();
    this.OooO0Oo = 0;
  }
  
  public int OooO0oO()
  {
    Object localObject = this.OooO0o;
    boolean bool = ((StaggeredGridLayoutManager)localObject).OooO0oo;
    int i;
    if (bool)
    {
      localObject = this.OooO00o;
      i = ((ArrayList)localObject).size() + -1;
      int j = -1;
      i = OooOO0O(i, j, false);
    }
    else
    {
      localObject = this.OooO00o;
      i = ((ArrayList)localObject).size();
      i = OooOO0O(0, i, false);
    }
    return i;
  }
  
  public int OooO0oo()
  {
    Object localObject = this.OooO0o;
    boolean bool = ((StaggeredGridLayoutManager)localObject).OooO0oo;
    int j = 1;
    int i;
    int k;
    if (bool)
    {
      localObject = this.OooO00o;
      i = ((ArrayList)localObject).size();
      k = 0;
      i = OooOO0(0, i, j);
    }
    else
    {
      localObject = this.OooO00o;
      i = ((ArrayList)localObject).size() - j;
      k = -1;
      i = OooOO0(i, k, j);
    }
    return i;
  }
  
  public int OooOO0(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return OooO(paramInt1, paramInt2, false, false, paramBoolean);
  }
  
  public int OooOO0O(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return OooO(paramInt1, paramInt2, paramBoolean, true, false);
  }
  
  public View OooOO0o(int paramInt1, int paramInt2)
  {
    int i = -1;
    Object localObject1 = null;
    View localView;
    Object localObject2;
    boolean bool2;
    if (paramInt2 == i)
    {
      localArrayList = this.OooO00o;
      paramInt2 = localArrayList.size();
      i = 0;
      localView = null;
      while (i < paramInt2)
      {
        localObject2 = (View)this.OooO00o.get(i);
        StaggeredGridLayoutManager localStaggeredGridLayoutManager = this.OooO0o;
        boolean bool1 = localStaggeredGridLayoutManager.OooO0oo;
        int j;
        if (bool1)
        {
          j = localStaggeredGridLayoutManager.getPosition((View)localObject2);
          if (j <= paramInt1) {
            break;
          }
        }
        localStaggeredGridLayoutManager = this.OooO0o;
        bool1 = localStaggeredGridLayoutManager.OooO0oo;
        if (!bool1)
        {
          j = localStaggeredGridLayoutManager.getPosition((View)localObject2);
          if (j >= paramInt1) {
            break;
          }
        }
        bool2 = ((View)localObject2).hasFocusable();
        if (!bool2) {
          break;
        }
        i += 1;
        localObject1 = localObject2;
      }
    }
    ArrayList localArrayList = this.OooO00o;
    paramInt2 = localArrayList.size() + -1;
    while (paramInt2 >= 0)
    {
      localView = (View)this.OooO00o.get(paramInt2);
      localObject2 = this.OooO0o;
      bool2 = ((StaggeredGridLayoutManager)localObject2).OooO0oo;
      int k;
      if (bool2)
      {
        k = ((RecyclerView.LayoutManager)localObject2).getPosition(localView);
        if (k >= paramInt1) {
          break;
        }
      }
      localObject2 = this.OooO0o;
      bool2 = ((StaggeredGridLayoutManager)localObject2).OooO0oo;
      if (!bool2)
      {
        k = ((RecyclerView.LayoutManager)localObject2).getPosition(localView);
        if (k <= paramInt1) {
          break;
        }
      }
      boolean bool3 = localView.hasFocusable();
      if (!bool3) {
        break;
      }
      paramInt2 += -1;
      localObject1 = localView;
    }
    return localObject1;
  }
  
  public void OooOOO()
  {
    int i = -1 << -1;
    this.OooO0O0 = i;
    this.OooO0OO = i;
  }
  
  public StaggeredGridLayoutManager.LayoutParams OooOOO0(View paramView)
  {
    return (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
  }
  
  public void OooOOOO(int paramInt)
  {
    int i = this.OooO0O0;
    int j = -1 << -1;
    if (i != j)
    {
      i += paramInt;
      this.OooO0O0 = i;
    }
    i = this.OooO0OO;
    if (i != j)
    {
      i += paramInt;
      this.OooO0OO = i;
    }
  }
  
  public void OooOOOo()
  {
    ArrayList localArrayList = this.OooO00o;
    int i = localArrayList.size();
    Object localObject = this.OooO00o;
    int j = i + -1;
    localObject = (View)((ArrayList)localObject).remove(j);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = OooOOO0((View)localObject);
    OrientationHelper localOrientationHelper = null;
    localLayoutParams.OooO0o0 = null;
    boolean bool2 = localLayoutParams.isItemRemoved();
    if (!bool2)
    {
      boolean bool1 = localLayoutParams.isItemChanged();
      if (!bool1) {}
    }
    else
    {
      k = this.OooO0Oo;
      localOrientationHelper = this.OooO0o.OooO0OO;
      m = localOrientationHelper.OooO0o0((View)localObject);
      k -= m;
      this.OooO0Oo = k;
    }
    int m = -1 << -1;
    int k = 1;
    if (i == k) {
      this.OooO0O0 = m;
    }
    this.OooO0OO = m;
  }
  
  public void OooOOo(View paramView)
  {
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = OooOOO0(paramView);
    localLayoutParams.OooO0o0 = this;
    Object localObject = this.OooO00o;
    ((ArrayList)localObject).add(0, paramView);
    int i = -1 << -1;
    this.OooO0O0 = i;
    ArrayList localArrayList = this.OooO00o;
    int j = localArrayList.size();
    int k = 1;
    if (j == k) {
      this.OooO0OO = i;
    }
    boolean bool1 = localLayoutParams.isItemRemoved();
    if (!bool1)
    {
      boolean bool2 = localLayoutParams.isItemChanged();
      if (!bool2) {}
    }
    else
    {
      int m = this.OooO0Oo;
      localObject = this.OooO0o.OooO0OO;
      int n = ((OrientationHelper)localObject).OooO0o0(paramView);
      m += n;
      this.OooO0Oo = m;
    }
  }
  
  public void OooOOo0()
  {
    Object localObject1 = this.OooO00o;
    boolean bool1 = false;
    localObject1 = (View)((ArrayList)localObject1).remove(0);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = OooOOO0((View)localObject1);
    localLayoutParams.OooO0o0 = null;
    Object localObject2 = this.OooO00o;
    int j = ((ArrayList)localObject2).size();
    int k = -1 << -1;
    if (j == 0) {
      this.OooO0OO = k;
    }
    boolean bool2 = localLayoutParams.isItemRemoved();
    if (!bool2)
    {
      bool1 = localLayoutParams.isItemChanged();
      if (!bool1) {}
    }
    else
    {
      int i = this.OooO0Oo;
      localObject2 = this.OooO0o.OooO0OO;
      int m = ((OrientationHelper)localObject2).OooO0o0((View)localObject1);
      i -= m;
      this.OooO0Oo = i;
    }
    this.OooO0O0 = k;
  }
  
  public int getDeletedSize()
  {
    return this.OooO0Oo;
  }
  
  public int getEndLine()
  {
    int i = this.OooO0OO;
    int j = -1 << -1;
    if (i != j) {
      return i;
    }
    OooO0OO();
    return this.OooO0OO;
  }
  
  public int getEndLine(int paramInt)
  {
    int i = this.OooO0OO;
    int j = -1 << -1;
    if (i != j) {
      return i;
    }
    ArrayList localArrayList = this.OooO00o;
    i = localArrayList.size();
    if (i == 0) {
      return paramInt;
    }
    OooO0OO();
    return this.OooO0OO;
  }
  
  public int getStartLine()
  {
    int i = this.OooO0O0;
    int j = -1 << -1;
    if (i != j) {
      return i;
    }
    OooO0Oo();
    return this.OooO0O0;
  }
  
  public int getStartLine(int paramInt)
  {
    int i = this.OooO0O0;
    int j = -1 << -1;
    if (i != j) {
      return i;
    }
    ArrayList localArrayList = this.OooO00o;
    i = localArrayList.size();
    if (i == 0) {
      return paramInt;
    }
    OooO0Oo();
    return this.OooO0O0;
  }
  
  public void setLine(int paramInt)
  {
    this.OooO0O0 = paramInt;
    this.OooO0OO = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager.Span
 * JD-Core Version:    0.7.0.1
 */