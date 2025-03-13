package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

class ViewOffsetHelper
{
  private boolean horizontalOffsetEnabled;
  private int layoutLeft;
  private int layoutTop;
  private int offsetLeft;
  private int offsetTop;
  private boolean verticalOffsetEnabled;
  private final View view;
  
  public ViewOffsetHelper(View paramView)
  {
    boolean bool = true;
    this.verticalOffsetEnabled = bool;
    this.horizontalOffsetEnabled = bool;
    this.view = paramView;
  }
  
  public void applyOffsets()
  {
    View localView = this.view;
    int i = this.offsetTop;
    int j = localView.getTop();
    int k = this.layoutTop;
    j -= k;
    i -= j;
    ViewCompat.OooooO0(localView, i);
    localView = this.view;
    i = this.offsetLeft;
    j = localView.getLeft();
    k = this.layoutLeft;
    j -= k;
    i -= j;
    ViewCompat.Ooooo0o(localView, i);
  }
  
  public int getLayoutLeft()
  {
    return this.layoutLeft;
  }
  
  public int getLayoutTop()
  {
    return this.layoutTop;
  }
  
  public int getLeftAndRightOffset()
  {
    return this.offsetLeft;
  }
  
  public int getTopAndBottomOffset()
  {
    return this.offsetTop;
  }
  
  public boolean isHorizontalOffsetEnabled()
  {
    return this.horizontalOffsetEnabled;
  }
  
  public boolean isVerticalOffsetEnabled()
  {
    return this.verticalOffsetEnabled;
  }
  
  public void onViewLayout()
  {
    int i = this.view.getTop();
    this.layoutTop = i;
    i = this.view.getLeft();
    this.layoutLeft = i;
  }
  
  public void setHorizontalOffsetEnabled(boolean paramBoolean)
  {
    this.horizontalOffsetEnabled = paramBoolean;
  }
  
  public boolean setLeftAndRightOffset(int paramInt)
  {
    boolean bool = this.horizontalOffsetEnabled;
    if (bool)
    {
      int i = this.offsetLeft;
      if (i != paramInt)
      {
        this.offsetLeft = paramInt;
        applyOffsets();
        return true;
      }
    }
    return false;
  }
  
  public boolean setTopAndBottomOffset(int paramInt)
  {
    boolean bool = this.verticalOffsetEnabled;
    if (bool)
    {
      int i = this.offsetTop;
      if (i != paramInt)
      {
        this.offsetTop = paramInt;
        applyOffsets();
        return true;
      }
    }
    return false;
  }
  
  public void setVerticalOffsetEnabled(boolean paramBoolean)
  {
    this.verticalOffsetEnabled = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.appbar.ViewOffsetHelper
 * JD-Core Version:    0.7.0.1
 */