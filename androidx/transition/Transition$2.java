package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

class Transition$2
  extends AnimatorListenerAdapter
{
  public Transition$2(Transition paramTransition, ArrayMap paramArrayMap) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.o00OoOoo.remove(paramAnimator);
    this.o00Ooo00.mCurrentAnimators.remove(paramAnimator);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.o00Ooo00.mCurrentAnimators.add(paramAnimator);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.Transition.2
 * JD-Core Version:    0.7.0.1
 */