package com.google.android.material.transformation;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.material.expandable.ExpandableWidget;

class ExpandableBehavior$1
  implements ViewTreeObserver.OnPreDrawListener
{
  public ExpandableBehavior$1(ExpandableBehavior paramExpandableBehavior, View paramView, int paramInt, ExpandableWidget paramExpandableWidget) {}
  
  public boolean onPreDraw()
  {
    this.val$child.getViewTreeObserver().removeOnPreDrawListener(this);
    ExpandableBehavior localExpandableBehavior = this.this$0;
    int i = ExpandableBehavior.access$000(localExpandableBehavior);
    int j = this.val$expectedState;
    if (i == j)
    {
      localExpandableBehavior = this.this$0;
      ExpandableWidget localExpandableWidget = this.val$dep;
      Object localObject = localExpandableWidget;
      localObject = (View)localExpandableWidget;
      View localView = this.val$child;
      boolean bool = localExpandableWidget.isExpanded();
      localExpandableBehavior.onExpandedStateChange((View)localObject, localView, bool, false);
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transformation.ExpandableBehavior.1
 * JD-Core Version:    0.7.0.1
 */