package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.Easing;

class ViewTransition$1
  implements Interpolator
{
  public ViewTransition$1(ViewTransition paramViewTransition, Easing paramEasing) {}
  
  public float getInterpolation(float paramFloat)
  {
    Easing localEasing = this.OooO00o;
    double d = paramFloat;
    return (float)localEasing.OooO00o(d);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.ViewTransition.1
 * JD-Core Version:    0.7.0.1
 */