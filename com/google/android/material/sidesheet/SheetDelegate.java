package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

abstract class SheetDelegate
{
  public abstract int calculateInnerMargin(ViewGroup.MarginLayoutParams paramMarginLayoutParams);
  
  public abstract float calculateSlideOffset(int paramInt);
  
  public abstract int calculateTargetStateOnViewReleased(View paramView, float paramFloat1, float paramFloat2);
  
  public abstract int getExpandedOffset();
  
  public abstract int getHiddenOffset();
  
  public abstract int getOuterEdge(View paramView);
  
  public abstract int getSheetEdge();
  
  public abstract boolean isSettling(View paramView, int paramInt, boolean paramBoolean);
  
  public abstract boolean shouldHide(View paramView, float paramFloat);
  
  public abstract void updateCoplanarSiblingLayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt1, int paramInt2);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.sidesheet.SheetDelegate
 * JD-Core Version:    0.7.0.1
 */