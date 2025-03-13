package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

final class AnimateLayoutChangeDetector
{
  public static final ViewGroup.MarginLayoutParams OooO0O0;
  public LinearLayoutManager OooO00o;
  
  static
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = new android/view/ViewGroup$MarginLayoutParams;
    int i = -1;
    localMarginLayoutParams.<init>(i, i);
    OooO0O0 = localMarginLayoutParams;
    localMarginLayoutParams.setMargins(0, 0, 0, 0);
  }
  
  public AnimateLayoutChangeDetector(LinearLayoutManager paramLinearLayoutManager)
  {
    this.OooO00o = paramLinearLayoutManager;
  }
  
  public static boolean OooO0OO(View paramView)
  {
    boolean bool1 = paramView instanceof ViewGroup;
    if (bool1)
    {
      paramView = (ViewGroup)paramView;
      LayoutTransition localLayoutTransition = paramView.getLayoutTransition();
      boolean bool2 = true;
      if (localLayoutTransition != null)
      {
        bool1 = localLayoutTransition.isChangingLayout();
        if (bool1) {
          return bool2;
        }
      }
      int i = paramView.getChildCount();
      int j = 0;
      while (j < i)
      {
        View localView = paramView.getChildAt(j);
        boolean bool3 = OooO0OO(localView);
        if (bool3) {
          return bool2;
        }
        j += 1;
      }
    }
    return false;
  }
  
  public final boolean OooO00o()
  {
    Object localObject1 = this.OooO00o;
    int i = ((RecyclerView.LayoutManager)localObject1).getChildCount();
    int j = 1;
    if (i == 0) {
      return j;
    }
    Object localObject2 = this.OooO00o;
    int k = ((LinearLayoutManager)localObject2).getOrientation();
    if (k == 0)
    {
      k = j;
    }
    else
    {
      k = 0;
      localObject2 = null;
    }
    int n = 2;
    Object localObject3 = { i, n };
    localObject3 = (int[][])Array.newInstance(Integer.TYPE, (int[])localObject3);
    int i1 = 0;
    Object localObject4 = null;
    View localView;
    int i5;
    while (i1 < i)
    {
      localView = this.OooO00o.getChildAt(i1);
      if (localView != null)
      {
        Object localObject5 = localView.getLayoutParams();
        boolean bool = localObject5 instanceof ViewGroup.MarginLayoutParams;
        if (bool) {
          localObject5 = (ViewGroup.MarginLayoutParams)localObject5;
        } else {
          localObject5 = OooO0O0;
        }
        Object localObject6 = localObject3[i1];
        int i3;
        int i4;
        if (k != 0)
        {
          i3 = localView.getLeft();
          i4 = ((ViewGroup.MarginLayoutParams)localObject5).leftMargin;
        }
        else
        {
          i3 = localView.getTop();
          i4 = ((ViewGroup.MarginLayoutParams)localObject5).topMargin;
        }
        i3 -= i4;
        localObject6[0] = i3;
        localObject6 = localObject3[i1];
        int i6;
        if (k != 0)
        {
          i5 = localView.getRight();
          i6 = ((ViewGroup.MarginLayoutParams)localObject5).rightMargin;
        }
        else
        {
          i5 = localView.getBottom();
          i6 = ((ViewGroup.MarginLayoutParams)localObject5).bottomMargin;
        }
        i5 += i6;
        localObject6[j] = i5;
        i1 += 1;
      }
      else
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("null view contained in the view hierarchy");
        throw ((Throwable)localObject1);
      }
    }
    localObject2 = new androidx/viewpager2/widget/AnimateLayoutChangeDetector$1;
    ((AnimateLayoutChangeDetector.1)localObject2).<init>(this);
    Arrays.sort((Object[])localObject3, (Comparator)localObject2);
    k = j;
    while (k < i)
    {
      i2 = k + -1;
      localObject4 = localObject3[i2];
      i2 = localObject4[j];
      localView = localObject3[k];
      i5 = localView[0];
      if (i2 != i5) {
        return false;
      }
      k += 1;
    }
    localObject2 = localObject3[0];
    int i2 = localObject2[j];
    int m = localObject2[0];
    i2 -= m;
    if (m <= 0)
    {
      i -= j;
      localObject1 = localObject3[i];
      i = localObject1[j];
      if (i >= i2) {
        return j;
      }
    }
    return false;
  }
  
  public final boolean OooO0O0()
  {
    LinearLayoutManager localLinearLayoutManager = this.OooO00o;
    int i = localLinearLayoutManager.getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = this.OooO00o.getChildAt(j);
      boolean bool = OooO0OO(localView);
      if (bool) {
        return true;
      }
      j += 1;
    }
    return false;
  }
  
  public boolean OooO0Oo()
  {
    boolean bool1 = OooO00o();
    int j = 1;
    if (bool1)
    {
      LinearLayoutManager localLinearLayoutManager = this.OooO00o;
      int i = localLinearLayoutManager.getChildCount();
      if (i > j) {}
    }
    else
    {
      boolean bool2 = OooO0O0();
      if (bool2) {
        return j;
      }
    }
    j = 0;
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.viewpager2.widget.AnimateLayoutChangeDetector
 * JD-Core Version:    0.7.0.1
 */