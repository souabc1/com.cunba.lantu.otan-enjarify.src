package com.google.android.material.snackbar;

import android.view.View;

class BaseTransientBottomBar$8
  implements Runnable
{
  public BaseTransientBottomBar$8(BaseTransientBottomBar paramBaseTransientBottomBar) {}
  
  public void run()
  {
    Object localObject = this.this$0.view;
    if (localObject == null) {
      return;
    }
    localObject = ((View)localObject).getParent();
    if (localObject != null)
    {
      localObject = this.this$0.view;
      i = 0;
      ((View)localObject).setVisibility(0);
    }
    localObject = this.this$0.view;
    int j = ((BaseTransientBottomBar.SnackbarBaseLayout)localObject).getAnimationMode();
    int i = 1;
    if (j == i)
    {
      localObject = this.this$0;
      BaseTransientBottomBar.access$1200((BaseTransientBottomBar)localObject);
    }
    else
    {
      localObject = this.this$0;
      BaseTransientBottomBar.access$1300((BaseTransientBottomBar)localObject);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.BaseTransientBottomBar.8
 * JD-Core Version:    0.7.0.1
 */