package com.google.android.material.appbar;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;

class HeaderBehavior$FlingRunnable
  implements Runnable
{
  private final View layout;
  private final CoordinatorLayout parent;
  
  public HeaderBehavior$FlingRunnable(HeaderBehavior paramHeaderBehavior, CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    this.parent = paramCoordinatorLayout;
    this.layout = paramView;
  }
  
  public void run()
  {
    Object localObject = this.layout;
    if (localObject != null)
    {
      localObject = this.this$0.scroller;
      if (localObject != null)
      {
        boolean bool = ((OverScroller)localObject).computeScrollOffset();
        CoordinatorLayout localCoordinatorLayout;
        View localView;
        if (bool)
        {
          localObject = this.this$0;
          localCoordinatorLayout = this.parent;
          localView = this.layout;
          OverScroller localOverScroller = ((HeaderBehavior)localObject).scroller;
          int i = localOverScroller.getCurrY();
          ((HeaderBehavior)localObject).setHeaderTopBottomOffset(localCoordinatorLayout, localView, i);
          localObject = this.layout;
          ViewCompat.o0OoOo0((View)localObject, this);
        }
        else
        {
          localObject = this.this$0;
          localCoordinatorLayout = this.parent;
          localView = this.layout;
          ((HeaderBehavior)localObject).onFlingFinished(localCoordinatorLayout, localView);
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.appbar.HeaderBehavior.FlingRunnable
 * JD-Core Version:    0.7.0.1
 */