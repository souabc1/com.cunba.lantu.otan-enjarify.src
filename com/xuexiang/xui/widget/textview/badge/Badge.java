package com.xuexiang.xui.widget.textview.badge;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.View;

public abstract interface Badge
{
  public abstract Badge OooO(boolean paramBoolean);
  
  public abstract Badge OooO00o(int paramInt);
  
  public abstract Badge OooO0O0(int paramInt, float paramFloat, boolean paramBoolean);
  
  public abstract Badge OooO0OO(int paramInt);
  
  public abstract Badge OooO0Oo(Badge.OnDragStateChangedListener paramOnDragStateChangedListener);
  
  public abstract Badge OooO0o(int paramInt);
  
  public abstract Badge OooO0o0(String paramString);
  
  public abstract Badge OooO0oO(int paramInt);
  
  public abstract Badge OooO0oo(float paramFloat1, float paramFloat2, boolean paramBoolean);
  
  public abstract Badge OooOO0(boolean paramBoolean);
  
  public abstract Badge OooOO0O(float paramFloat, boolean paramBoolean);
  
  public abstract Badge OooOO0o(float paramFloat, boolean paramBoolean);
  
  public abstract Badge OooOOO0(Drawable paramDrawable, boolean paramBoolean);
  
  public abstract Drawable getBadgeBackground();
  
  public abstract int getBadgeBackgroundColor();
  
  public abstract int getBadgeGravity();
  
  public abstract int getBadgeNumber();
  
  public abstract String getBadgeText();
  
  public abstract int getBadgeTextColor();
  
  public abstract PointF getDragCenter();
  
  public abstract View getTargetView();
  
  public abstract boolean isDraggable();
  
  public abstract boolean isExactMode();
  
  public abstract boolean isShowShadow();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.textview.badge.Badge
 * JD-Core Version:    0.7.0.1
 */