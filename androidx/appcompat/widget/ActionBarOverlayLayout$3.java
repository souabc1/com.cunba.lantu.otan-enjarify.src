package androidx.appcompat.widget;

import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

class ActionBarOverlayLayout$3
  implements Runnable
{
  public ActionBarOverlayLayout$3(ActionBarOverlayLayout paramActionBarOverlayLayout) {}
  
  public void run()
  {
    this.o00OoOoo.OooOOO0();
    ActionBarOverlayLayout localActionBarOverlayLayout = this.o00OoOoo;
    ViewPropertyAnimator localViewPropertyAnimator = localActionBarOverlayLayout.o00Ooo0O.animate();
    float f = -this.o00OoOoo.o00Ooo0O.getHeight();
    localViewPropertyAnimator = localViewPropertyAnimator.translationY(f);
    AnimatorListenerAdapter localAnimatorListenerAdapter = this.o00OoOoo.o00o0O0O;
    localViewPropertyAnimator = localViewPropertyAnimator.setListener(localAnimatorListenerAdapter);
    localActionBarOverlayLayout.o00o0O0 = localViewPropertyAnimator;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActionBarOverlayLayout.3
 * JD-Core Version:    0.7.0.1
 */