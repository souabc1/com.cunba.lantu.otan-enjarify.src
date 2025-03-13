package com.google.android.material.ripple;

import android.graphics.drawable.Drawable.ConstantState;
import com.google.android.material.shape.MaterialShapeDrawable;

final class RippleDrawableCompat$RippleDrawableCompatState
  extends Drawable.ConstantState
{
  MaterialShapeDrawable delegate;
  boolean shouldDrawDelegate;
  
  public RippleDrawableCompat$RippleDrawableCompatState(RippleDrawableCompatState paramRippleDrawableCompatState)
  {
    MaterialShapeDrawable localMaterialShapeDrawable = (MaterialShapeDrawable)paramRippleDrawableCompatState.delegate.getConstantState().newDrawable();
    this.delegate = localMaterialShapeDrawable;
    boolean bool = paramRippleDrawableCompatState.shouldDrawDelegate;
    this.shouldDrawDelegate = bool;
  }
  
  public RippleDrawableCompat$RippleDrawableCompatState(MaterialShapeDrawable paramMaterialShapeDrawable)
  {
    this.delegate = paramMaterialShapeDrawable;
    this.shouldDrawDelegate = false;
  }
  
  public int getChangingConfigurations()
  {
    return 0;
  }
  
  public RippleDrawableCompat newDrawable()
  {
    RippleDrawableCompat localRippleDrawableCompat = new com/google/android/material/ripple/RippleDrawableCompat;
    RippleDrawableCompatState localRippleDrawableCompatState = new com/google/android/material/ripple/RippleDrawableCompat$RippleDrawableCompatState;
    localRippleDrawableCompatState.<init>(this);
    localRippleDrawableCompat.<init>(localRippleDrawableCompatState, null);
    return localRippleDrawableCompat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState
 * JD-Core Version:    0.7.0.1
 */