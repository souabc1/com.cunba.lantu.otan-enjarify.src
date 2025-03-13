package com.google.android.material.carousel;

import android.graphics.Outline;
import android.graphics.Path;
import android.view.View;
import android.view.ViewOutlineProvider;

class MaskableFrameLayout$MaskableDelegateV33$1
  extends ViewOutlineProvider
{
  public MaskableFrameLayout$MaskableDelegateV33$1(MaskableFrameLayout.MaskableDelegateV33 paramMaskableDelegateV33) {}
  
  public void getOutline(View paramView, Outline paramOutline)
  {
    paramView = this.this$0.shapePath;
    boolean bool = paramView.isEmpty();
    if (!bool)
    {
      paramView = this.this$0.shapePath;
      OooO0OO.OooO00o(paramOutline, paramView);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegateV33.1
 * JD-Core Version:    0.7.0.1
 */