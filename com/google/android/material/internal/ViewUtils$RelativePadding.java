package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.ViewCompat;

public class ViewUtils$RelativePadding
{
  public int bottom;
  public int end;
  public int start;
  public int top;
  
  public ViewUtils$RelativePadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.start = paramInt1;
    this.top = paramInt2;
    this.end = paramInt3;
    this.bottom = paramInt4;
  }
  
  public ViewUtils$RelativePadding(RelativePadding paramRelativePadding)
  {
    int i = paramRelativePadding.start;
    this.start = i;
    i = paramRelativePadding.top;
    this.top = i;
    i = paramRelativePadding.end;
    this.end = i;
    int j = paramRelativePadding.bottom;
    this.bottom = j;
  }
  
  public void applyToView(View paramView)
  {
    int i = this.start;
    int j = this.top;
    int k = this.end;
    int m = this.bottom;
    ViewCompat.o00000O(paramView, i, j, k, m);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ViewUtils.RelativePadding
 * JD-Core Version:    0.7.0.1
 */