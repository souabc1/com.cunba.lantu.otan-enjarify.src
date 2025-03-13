package com.google.android.material.snackbar;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.material.internal.WindowUtils;

class BaseTransientBottomBar$2
  implements Runnable
{
  public BaseTransientBottomBar$2(BaseTransientBottomBar paramBaseTransientBottomBar) {}
  
  public void run()
  {
    Object localObject1 = this.this$0;
    Object localObject2 = ((BaseTransientBottomBar)localObject1).view;
    if (localObject2 != null)
    {
      localObject1 = BaseTransientBottomBar.access$000((BaseTransientBottomBar)localObject1);
      if (localObject1 != null)
      {
        localObject1 = WindowUtils.getCurrentWindowBounds(BaseTransientBottomBar.access$000(this.this$0));
        int i = ((Rect)localObject1).height();
        int j = BaseTransientBottomBar.access$100(this.this$0);
        i -= j;
        float f = this.this$0.view.getTranslationY();
        j = (int)f;
        i += j;
        localObject2 = this.this$0;
        j = BaseTransientBottomBar.access$200((BaseTransientBottomBar)localObject2);
        if (i >= j)
        {
          localObject1 = this.this$0;
          j = BaseTransientBottomBar.access$200((BaseTransientBottomBar)localObject1);
          BaseTransientBottomBar.access$302((BaseTransientBottomBar)localObject1, j);
          return;
        }
        localObject2 = this.this$0.view.getLayoutParams();
        boolean bool = localObject2 instanceof ViewGroup.MarginLayoutParams;
        if (!bool)
        {
          BaseTransientBottomBar.access$400();
          return;
        }
        BaseTransientBottomBar localBaseTransientBottomBar1 = this.this$0;
        int m = BaseTransientBottomBar.access$200(localBaseTransientBottomBar1);
        BaseTransientBottomBar.access$302(localBaseTransientBottomBar1, m);
        localObject2 = (ViewGroup.MarginLayoutParams)localObject2;
        int k = ((ViewGroup.MarginLayoutParams)localObject2).bottomMargin;
        BaseTransientBottomBar localBaseTransientBottomBar2 = this.this$0;
        m = BaseTransientBottomBar.access$200(localBaseTransientBottomBar2) - i;
        k += m;
        ((ViewGroup.MarginLayoutParams)localObject2).bottomMargin = k;
        localObject1 = this.this$0.view;
        ((View)localObject1).requestLayout();
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.BaseTransientBottomBar.2
 * JD-Core Version:    0.7.0.1
 */