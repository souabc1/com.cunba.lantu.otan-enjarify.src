package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.WindowUtils;

class NavigationView$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public NavigationView$2(NavigationView paramNavigationView) {}
  
  public void onGlobalLayout()
  {
    Object localObject1 = this.this$0;
    int[] arrayOfInt1 = NavigationView.access$000((NavigationView)localObject1);
    ((View)localObject1).getLocationOnScreen(arrayOfInt1);
    localObject1 = NavigationView.access$000(this.this$0);
    int i = 1;
    int j = localObject1[i];
    if (j == 0)
    {
      j = i;
    }
    else
    {
      j = 0;
      localObject1 = null;
    }
    NavigationView.access$100(this.this$0).setBehindStatusBar(j);
    Object localObject2 = this.this$0;
    if (j != 0)
    {
      bool1 = ((NavigationView)localObject2).isTopInsetScrimEnabled();
      if (bool1)
      {
        bool1 = i;
        break label92;
      }
    }
    boolean bool1 = false;
    localObject1 = null;
    label92:
    ((ScrimInsetsFrameLayout)localObject2).setDrawTopInsetForeground(bool1);
    localObject1 = NavigationView.access$000(this.this$0);
    int k = localObject1[0];
    if (k != 0)
    {
      localObject1 = NavigationView.access$000(this.this$0);
      k = localObject1[0];
      localObject2 = this.this$0;
      int i1 = ((View)localObject2).getWidth();
      k += i1;
      if (k != 0)
      {
        k = 0;
        localObject1 = null;
        break label169;
      }
    }
    k = i;
    label169:
    localObject2 = this.this$0;
    ((ScrimInsetsFrameLayout)localObject2).setDrawLeftInsetForeground(k);
    localObject1 = ContextUtils.getActivity(this.this$0.getContext());
    if (localObject1 != null)
    {
      localObject2 = WindowUtils.getCurrentWindowBounds((Context)localObject1);
      int i3 = ((Rect)localObject2).height();
      int i4 = this.this$0.getHeight();
      i3 -= i4;
      Object localObject3 = NavigationView.access$000(this.this$0);
      i4 = localObject3[i];
      if (i3 == i4)
      {
        i3 = i;
      }
      else
      {
        i3 = 0;
        arrayOfInt2 = null;
      }
      localObject1 = ((Activity)localObject1).getWindow();
      int m = Color.alpha(((Window)localObject1).getNavigationBarColor());
      if (m != 0)
      {
        m = i;
      }
      else
      {
        m = 0;
        localObject1 = null;
      }
      localObject3 = this.this$0;
      if ((i3 != 0) && (m != 0))
      {
        bool2 = ((NavigationView)localObject3).isBottomInsetScrimEnabled();
        if (bool2)
        {
          bool2 = i;
          break label329;
        }
      }
      boolean bool2 = false;
      localObject1 = null;
      label329:
      ((ScrimInsetsFrameLayout)localObject3).setDrawBottomInsetForeground(bool2);
      int n = ((Rect)localObject2).width();
      int[] arrayOfInt2 = NavigationView.access$000(this.this$0);
      i3 = arrayOfInt2[0];
      if (n != i3)
      {
        n = ((Rect)localObject2).width();
        int i2 = this.this$0.getWidth();
        n -= i2;
        localObject2 = NavigationView.access$000(this.this$0);
        i2 = localObject2[0];
        if (n != i2)
        {
          i = 0;
          arrayOfInt1 = null;
        }
      }
      localObject1 = this.this$0;
      ((ScrimInsetsFrameLayout)localObject1).setDrawRightInsetForeground(i);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.navigation.NavigationView.2
 * JD-Core Version:    0.7.0.1
 */