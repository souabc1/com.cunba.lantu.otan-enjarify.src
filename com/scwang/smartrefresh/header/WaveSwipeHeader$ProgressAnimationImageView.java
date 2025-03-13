package com.scwang.smartrefresh.header;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

public class WaveSwipeHeader$ProgressAnimationImageView
  extends ImageView
{
  public Animation.AnimationListener o00OoOoo;
  
  public void onAnimationEnd()
  {
    super.onAnimationEnd();
    Animation.AnimationListener localAnimationListener = this.o00OoOoo;
    if (localAnimationListener != null)
    {
      Animation localAnimation = getAnimation();
      localAnimationListener.onAnimationEnd(localAnimation);
    }
  }
  
  public void onAnimationStart()
  {
    super.onAnimationStart();
    Animation.AnimationListener localAnimationListener = this.o00OoOoo;
    if (localAnimationListener != null)
    {
      Animation localAnimation = getAnimation();
      localAnimationListener.onAnimationStart(localAnimation);
    }
  }
  
  public void setAnimationListener(Animation.AnimationListener paramAnimationListener)
  {
    this.o00OoOoo = paramAnimationListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.WaveSwipeHeader.ProgressAnimationImageView
 * JD-Core Version:    0.7.0.1
 */