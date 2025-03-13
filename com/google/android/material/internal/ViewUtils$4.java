package com.google.android.material.internal;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import androidx.core.view.ViewCompat;

class ViewUtils$4
  implements View.OnAttachStateChangeListener
{
  public void onViewAttachedToWindow(View paramView)
  {
    paramView.removeOnAttachStateChangeListener(this);
    ViewCompat.o00o0O(paramView);
  }
  
  public void onViewDetachedFromWindow(View paramView) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ViewUtils.4
 * JD-Core Version:    0.7.0.1
 */