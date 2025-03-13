package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

class BottomAppBar$9
  extends AnimatorListenerAdapter
{
  public BottomAppBar$9(BottomAppBar paramBottomAppBar) {}
  
  public void onAnimationStart(Animator paramAnimator)
  {
    Object localObject = this.this$0.fabAnimationListener;
    ((AnimatorListenerAdapter)localObject).onAnimationStart(paramAnimator);
    paramAnimator = BottomAppBar.access$2300(this.this$0);
    if (paramAnimator != null)
    {
      localObject = this.this$0;
      float f = BottomAppBar.access$2400((BottomAppBar)localObject);
      paramAnimator.setTranslationX(f);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.bottomappbar.BottomAppBar.9
 * JD-Core Version:    0.7.0.1
 */