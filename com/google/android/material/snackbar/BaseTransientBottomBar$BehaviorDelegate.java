package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$BehaviorDelegate
{
  private SnackbarManager.Callback managerCallback;
  
  public BaseTransientBottomBar$BehaviorDelegate(SwipeDismissBehavior paramSwipeDismissBehavior)
  {
    paramSwipeDismissBehavior.setStartAlphaSwipeDistance(0.1F);
    paramSwipeDismissBehavior.setEndAlphaSwipeDistance(0.6F);
    paramSwipeDismissBehavior.setSwipeDirection(0);
  }
  
  public boolean canSwipeDismissView(View paramView)
  {
    return paramView instanceof BaseTransientBottomBar.SnackbarBaseLayout;
  }
  
  public void onInterceptTouchEvent(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i != 0)
    {
      int j = 1;
      if (i != j)
      {
        j = 3;
        if (i != j) {}
      }
      else
      {
        paramCoordinatorLayout = SnackbarManager.getInstance();
        paramView = this.managerCallback;
        paramCoordinatorLayout.restoreTimeoutIfPaused(paramView);
      }
    }
    else
    {
      float f1 = paramMotionEvent.getX();
      i = (int)f1;
      float f2 = paramMotionEvent.getY();
      int k = (int)f2;
      boolean bool = paramCoordinatorLayout.isPointInChildBounds(paramView, i, k);
      if (bool)
      {
        paramCoordinatorLayout = SnackbarManager.getInstance();
        paramView = this.managerCallback;
        paramCoordinatorLayout.pauseTimeout(paramView);
      }
    }
  }
  
  public void setBaseTransientBottomBar(BaseTransientBottomBar paramBaseTransientBottomBar)
  {
    paramBaseTransientBottomBar = paramBaseTransientBottomBar.managerCallback;
    this.managerCallback = paramBaseTransientBottomBar;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.BaseTransientBottomBar.BehaviorDelegate
 * JD-Core Version:    0.7.0.1
 */