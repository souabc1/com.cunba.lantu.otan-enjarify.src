package androidx.drawerlayout.widget;

import android.view.View;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper.Callback;

class DrawerLayout$ViewDragCallback
  extends ViewDragHelper.Callback
{
  public final int OooO00o;
  public ViewDragHelper OooO0O0;
  public final Runnable OooO0OO;
  
  public final void OooO00o()
  {
    int i = this.OooO00o;
    int j = 3;
    if (i == j) {
      j = 5;
    }
    View localView = this.OooO0Oo.OooOOO(j);
    if (localView != null)
    {
      DrawerLayout localDrawerLayout = this.OooO0Oo;
      localDrawerLayout.OooO0o(localView);
    }
  }
  
  public void OooO0O0()
  {
    Object localObject = this.OooO0O0;
    int i = ((ViewDragHelper)localObject).getEdgeSize();
    int j = this.OooO00o;
    int k = 1;
    int m = 0;
    DrawerLayout localDrawerLayout1 = null;
    int n = 3;
    ViewDragHelper localViewDragHelper;
    if (j == n)
    {
      j = k;
    }
    else
    {
      j = 0;
      localViewDragHelper = null;
    }
    View localView;
    if (j != 0)
    {
      DrawerLayout localDrawerLayout2 = this.OooO0Oo;
      localView = localDrawerLayout2.OooOOO(n);
      if (localView != null) {
        m = -localView.getWidth();
      }
      m += i;
    }
    else
    {
      localDrawerLayout1 = this.OooO0Oo;
      n = 5;
      localView = localDrawerLayout1.OooOOO(n);
      localDrawerLayout1 = this.OooO0Oo;
      m = localDrawerLayout1.getWidth() - i;
    }
    if (localView != null)
    {
      if (j != 0)
      {
        i = localView.getLeft();
        if (i < m) {}
      }
      else
      {
        if (j != 0) {
          return;
        }
        i = localView.getLeft();
        if (i <= m) {
          return;
        }
      }
      localObject = this.OooO0Oo;
      i = ((DrawerLayout)localObject).OooOOo0(localView);
      if (i == 0)
      {
        localObject = (DrawerLayout.LayoutParams)localView.getLayoutParams();
        localViewDragHelper = this.OooO0O0;
        int i1 = localView.getTop();
        localViewDragHelper.Oooo00o(localView, m, i1);
        ((DrawerLayout.LayoutParams)localObject).OooO0OO = k;
        this.OooO0Oo.invalidate();
        OooO00o();
        localObject = this.OooO0Oo;
        ((DrawerLayout)localObject).OooO0O0();
      }
    }
  }
  
  public void OooO0OO()
  {
    DrawerLayout localDrawerLayout = this.OooO0Oo;
    Runnable localRunnable = this.OooO0OO;
    localDrawerLayout.removeCallbacks(localRunnable);
  }
  
  public int clampViewPositionHorizontal(View paramView, int paramInt1, int paramInt2)
  {
    DrawerLayout localDrawerLayout = this.OooO0Oo;
    int i = 3;
    paramInt2 = localDrawerLayout.OooO0OO(paramView, i);
    int j;
    if (paramInt2 != 0)
    {
      j = -paramView.getWidth();
      paramInt2 = 0;
      localDrawerLayout = null;
    }
    for (;;)
    {
      paramInt1 = Math.min(paramInt1, paramInt2);
      return Math.max(j, paramInt1);
      localDrawerLayout = this.OooO0Oo;
      paramInt2 = localDrawerLayout.getWidth();
      j = paramView.getWidth();
      j = paramInt2 - j;
    }
  }
  
  public int clampViewPositionVertical(View paramView, int paramInt1, int paramInt2)
  {
    return paramView.getTop();
  }
  
  public int getViewHorizontalDragRange(View paramView)
  {
    DrawerLayout localDrawerLayout = this.OooO0Oo;
    boolean bool = localDrawerLayout.OooOoo0(paramView);
    int i;
    if (bool)
    {
      i = paramView.getWidth();
    }
    else
    {
      i = 0;
      paramView = null;
    }
    return i;
  }
  
  public void onEdgeDragStarted(int paramInt1, int paramInt2)
  {
    int i = 1;
    paramInt1 &= i;
    if (paramInt1 == i)
    {
      localObject1 = this.OooO0Oo;
      i = 3;
    }
    else
    {
      localObject1 = this.OooO0Oo;
      i = 5;
    }
    Object localObject1 = ((DrawerLayout)localObject1).OooOOO(i);
    if (localObject1 != null)
    {
      Object localObject2 = this.OooO0Oo;
      i = ((DrawerLayout)localObject2).OooOOo0((View)localObject1);
      if (i == 0)
      {
        localObject2 = this.OooO0O0;
        ((ViewDragHelper)localObject2).OooO0OO((View)localObject1, paramInt2);
      }
    }
  }
  
  public boolean onEdgeLock(int paramInt)
  {
    return false;
  }
  
  public void onEdgeTouched(int paramInt1, int paramInt2)
  {
    DrawerLayout localDrawerLayout = this.OooO0Oo;
    Runnable localRunnable = this.OooO0OO;
    localDrawerLayout.postDelayed(localRunnable, 160L);
  }
  
  public void onViewCaptured(View paramView, int paramInt)
  {
    ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).OooO0OO = false;
    OooO00o();
  }
  
  public void onViewDragStateChanged(int paramInt)
  {
    DrawerLayout localDrawerLayout = this.OooO0Oo;
    View localView = this.OooO0O0.getCapturedView();
    localDrawerLayout.OoooO(paramInt, localView);
  }
  
  public void onViewPositionChanged(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = paramView.getWidth();
    DrawerLayout localDrawerLayout = this.OooO0Oo;
    paramInt4 = 3;
    paramInt3 = localDrawerLayout.OooO0OO(paramView, paramInt4);
    float f1;
    if (paramInt3 != 0)
    {
      paramInt1 += paramInt2;
      f1 = paramInt1;
    }
    else
    {
      localDrawerLayout = this.OooO0Oo;
      paramInt3 = localDrawerLayout.getWidth() - paramInt1;
      f1 = paramInt3;
    }
    float f2 = paramInt2;
    f1 /= f2;
    this.OooO0Oo.OoooO00(paramView, f1);
    paramInt2 = 0;
    f2 = 0.0F;
    paramInt1 = f1 < 0.0F;
    if (paramInt1 == 0)
    {
      paramInt1 = 4;
      f1 = 5.605194E-045F;
    }
    else
    {
      paramInt1 = 0;
      f1 = 0.0F;
    }
    paramView.setVisibility(paramInt1);
    this.OooO0Oo.invalidate();
  }
  
  public void onViewReleased(View paramView, float paramFloat1, float paramFloat2)
  {
    Object localObject = this.OooO0Oo;
    paramFloat2 = ((DrawerLayout)localObject).OooOOoo(paramView);
    int i = paramView.getWidth();
    DrawerLayout localDrawerLayout = this.OooO0Oo;
    boolean bool1 = localDrawerLayout.OooO0OO(paramView, 3);
    float f = 0.5F;
    int m;
    if (bool1)
    {
      boolean bool2 = paramFloat1 < 0.0F;
      if (!bool2) {
        if (!bool2)
        {
          bool2 = paramFloat2 < f;
          if (bool2) {}
        }
        else
        {
          k = -i;
          break label143;
        }
      }
      int k = 0;
      paramFloat1 = 0.0F;
    }
    else
    {
      localDrawerLayout = this.OooO0Oo;
      int j = localDrawerLayout.getWidth();
      boolean bool3 = paramFloat1 < 0.0F;
      if (!bool3)
      {
        m = paramFloat1 < 0.0F;
        if (m == 0)
        {
          m = paramFloat2 < f;
          if (m <= 0) {}
        }
      }
      else
      {
        j -= i;
      }
      m = j;
    }
    label143:
    localObject = this.OooO0O0;
    int n = paramView.getTop();
    ((ViewDragHelper)localObject).Oooo000(m, n);
    this.OooO0Oo.invalidate();
  }
  
  public void setDragger(ViewDragHelper paramViewDragHelper)
  {
    this.OooO0O0 = paramViewDragHelper;
  }
  
  public boolean tryCaptureView(View paramView, int paramInt)
  {
    DrawerLayout localDrawerLayout = this.OooO0Oo;
    paramInt = localDrawerLayout.OooOoo0(paramView);
    if (paramInt != 0)
    {
      localDrawerLayout = this.OooO0Oo;
      int i = this.OooO00o;
      paramInt = localDrawerLayout.OooO0OO(paramView, i);
      if (paramInt != 0)
      {
        localDrawerLayout = this.OooO0Oo;
        j = localDrawerLayout.OooOOo0(paramView);
        if (j == 0)
        {
          j = 1;
          break label66;
        }
      }
    }
    int j = 0;
    paramView = null;
    label66:
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback
 * JD-Core Version:    0.7.0.1
 */