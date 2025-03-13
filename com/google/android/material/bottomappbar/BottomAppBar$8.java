package com.google.android.material.bottomappbar;

import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

class BottomAppBar$8
  implements Runnable
{
  public BottomAppBar$8(BottomAppBar paramBottomAppBar, ActionMenuView paramActionMenuView, int paramInt, boolean paramBoolean) {}
  
  public void run()
  {
    ActionMenuView localActionMenuView = this.val$actionMenuView;
    BottomAppBar localBottomAppBar = this.this$0;
    int i = this.val$fabAlignmentMode;
    boolean bool = this.val$fabAttached;
    float f = localBottomAppBar.getActionMenuViewTranslationX(localActionMenuView, i, bool);
    localActionMenuView.setTranslationX(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.bottomappbar.BottomAppBar.8
 * JD-Core Version:    0.7.0.1
 */