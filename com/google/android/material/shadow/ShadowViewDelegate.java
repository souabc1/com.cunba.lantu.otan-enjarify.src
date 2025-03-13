package com.google.android.material.shadow;

import android.graphics.drawable.Drawable;

public abstract interface ShadowViewDelegate
{
  public abstract float getRadius();
  
  public abstract boolean isCompatPaddingEnabled();
  
  public abstract void setBackgroundDrawable(Drawable paramDrawable);
  
  public abstract void setShadowPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shadow.ShadowViewDelegate
 * JD-Core Version:    0.7.0.1
 */