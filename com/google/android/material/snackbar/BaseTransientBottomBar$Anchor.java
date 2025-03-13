package com.google.android.material.snackbar;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.ViewUtils;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class BaseTransientBottomBar$Anchor
  implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener
{
  private final WeakReference anchorView;
  private final WeakReference transientBottomBar;
  
  private BaseTransientBottomBar$Anchor(BaseTransientBottomBar paramBaseTransientBottomBar, View paramView)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramBaseTransientBottomBar);
    this.transientBottomBar = localWeakReference;
    paramBaseTransientBottomBar = new java/lang/ref/WeakReference;
    paramBaseTransientBottomBar.<init>(paramView);
    this.anchorView = paramBaseTransientBottomBar;
  }
  
  public static Anchor anchor(BaseTransientBottomBar paramBaseTransientBottomBar, View paramView)
  {
    Anchor localAnchor = new com/google/android/material/snackbar/BaseTransientBottomBar$Anchor;
    localAnchor.<init>(paramBaseTransientBottomBar, paramView);
    boolean bool = ViewCompat.o000oOoO(paramView);
    if (bool) {
      ViewUtils.addOnGlobalLayoutListener(paramView, localAnchor);
    }
    paramView.addOnAttachStateChangeListener(localAnchor);
    return localAnchor;
  }
  
  private boolean unanchorIfNoTransientBottomBar()
  {
    Object localObject = this.transientBottomBar.get();
    if (localObject == null)
    {
      unanchor();
      return true;
    }
    return false;
  }
  
  public View getAnchorView()
  {
    return (View)this.anchorView.get();
  }
  
  public void onGlobalLayout()
  {
    boolean bool = unanchorIfNoTransientBottomBar();
    if (!bool)
    {
      BaseTransientBottomBar localBaseTransientBottomBar = (BaseTransientBottomBar)this.transientBottomBar.get();
      bool = BaseTransientBottomBar.access$2100(localBaseTransientBottomBar);
      if (bool)
      {
        localBaseTransientBottomBar = (BaseTransientBottomBar)this.transientBottomBar.get();
        BaseTransientBottomBar.access$2200(localBaseTransientBottomBar);
      }
    }
  }
  
  public void onViewAttachedToWindow(View paramView)
  {
    boolean bool = unanchorIfNoTransientBottomBar();
    if (bool) {
      return;
    }
    ViewUtils.addOnGlobalLayoutListener(paramView, this);
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    boolean bool = unanchorIfNoTransientBottomBar();
    if (bool) {
      return;
    }
    ViewUtils.removeOnGlobalLayoutListener(paramView, this);
  }
  
  public void unanchor()
  {
    Object localObject = this.anchorView.get();
    if (localObject != null)
    {
      ((View)this.anchorView.get()).removeOnAttachStateChangeListener(this);
      localObject = (View)this.anchorView.get();
      ViewUtils.removeOnGlobalLayoutListener((View)localObject, this);
    }
    this.anchorView.clear();
    this.transientBottomBar.clear();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.BaseTransientBottomBar.Anchor
 * JD-Core Version:    0.7.0.1
 */