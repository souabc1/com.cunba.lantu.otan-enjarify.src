package com.google.android.material.chip;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class Chip$2
  extends ViewOutlineProvider
{
  public Chip$2(Chip paramChip) {}
  
  public void getOutline(View paramView, Outline paramOutline)
  {
    paramView = Chip.access$000(this.this$0);
    if (paramView != null)
    {
      paramView = Chip.access$000(this.this$0);
      paramView.getOutline(paramOutline);
    }
    else
    {
      paramView = null;
      paramOutline.setAlpha(0.0F);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.chip.Chip.2
 * JD-Core Version:    0.7.0.1
 */