package com.google.android.material.badge;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.ToolbarUtils;

class BadgeUtils$1
  implements Runnable
{
  public BadgeUtils$1(Toolbar paramToolbar, int paramInt, BadgeDrawable paramBadgeDrawable, FrameLayout paramFrameLayout) {}
  
  public void run()
  {
    Object localObject1 = this.val$toolbar;
    int i = this.val$menuItemId;
    localObject1 = ToolbarUtils.getActionMenuItemView((Toolbar)localObject1, i);
    if (localObject1 != null)
    {
      BadgeDrawable localBadgeDrawable = this.val$badgeDrawable;
      Object localObject2 = this.val$toolbar.getResources();
      BadgeUtils.setToolbarOffset(localBadgeDrawable, (Resources)localObject2);
      localBadgeDrawable = this.val$badgeDrawable;
      localObject2 = this.val$customBadgeParent;
      BadgeUtils.attachBadgeDrawable(localBadgeDrawable, (View)localObject1, (FrameLayout)localObject2);
      localBadgeDrawable = this.val$badgeDrawable;
      BadgeUtils.access$000(localBadgeDrawable, (View)localObject1);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.badge.BadgeUtils.1
 * JD-Core Version:    0.7.0.1
 */