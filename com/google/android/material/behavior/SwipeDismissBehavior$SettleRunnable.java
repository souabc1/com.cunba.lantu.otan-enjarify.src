package com.google.android.material.behavior;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;

class SwipeDismissBehavior$SettleRunnable
  implements Runnable
{
  private final boolean dismiss;
  private final View view;
  
  public SwipeDismissBehavior$SettleRunnable(SwipeDismissBehavior paramSwipeDismissBehavior, View paramView, boolean paramBoolean)
  {
    this.view = paramView;
    this.dismiss = paramBoolean;
  }
  
  public void run()
  {
    Object localObject = this.this$0.viewDragHelper;
    if (localObject != null)
    {
      boolean bool1 = true;
      bool2 = ((ViewDragHelper)localObject).OooOOO(bool1);
      if (bool2)
      {
        localObject = this.view;
        ViewCompat.o0OoOo0((View)localObject, this);
        return;
      }
    }
    boolean bool2 = this.dismiss;
    if (bool2)
    {
      localObject = this.this$0.listener;
      if (localObject != null)
      {
        View localView = this.view;
        ((SwipeDismissBehavior.OnDismissListener)localObject).onDismiss(localView);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.behavior.SwipeDismissBehavior.SettleRunnable
 * JD-Core Version:    0.7.0.1
 */