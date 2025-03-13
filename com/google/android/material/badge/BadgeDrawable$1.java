package com.google.android.material.badge;

import android.view.View;
import android.widget.FrameLayout;

class BadgeDrawable$1
  implements Runnable
{
  public BadgeDrawable$1(BadgeDrawable paramBadgeDrawable, View paramView, FrameLayout paramFrameLayout) {}
  
  public void run()
  {
    BadgeDrawable localBadgeDrawable = this.this$0;
    View localView = this.val$anchorView;
    FrameLayout localFrameLayout = this.val$frameLayout;
    localBadgeDrawable.updateBadgeCoordinates(localView, localFrameLayout);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.badge.BadgeDrawable.1
 * JD-Core Version:    0.7.0.1
 */