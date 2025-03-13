package com.xuexiang.xui.widget.layout;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import m54207b69;

class ExpandableLayout$ExpansionListener
  implements Animator.AnimatorListener
{
  public int o00OoOoo;
  public boolean o00Ooo00;
  
  public ExpandableLayout$ExpansionListener(ExpandableLayout paramExpandableLayout, int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(4345, arrayOfObject);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(4346, arrayOfObject);
  }
  
  public void onAnimationRepeat(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(4347, arrayOfObject);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(4348, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.layout.ExpandableLayout.ExpansionListener
 * JD-Core Version:    0.7.0.1
 */