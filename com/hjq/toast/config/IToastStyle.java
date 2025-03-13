package com.hjq.toast.config;

import android.content.Context;
import android.view.View;

public abstract interface IToastStyle
{
  public abstract View OooO00o(Context paramContext);
  
  public int getGravity()
  {
    return 17;
  }
  
  public float getHorizontalMargin()
  {
    return 0.0F;
  }
  
  public float getVerticalMargin()
  {
    return 0.0F;
  }
  
  public int getXOffset()
  {
    return 0;
  }
  
  public int getYOffset()
  {
    return 0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.toast.config.IToastStyle
 * JD-Core Version:    0.7.0.1
 */