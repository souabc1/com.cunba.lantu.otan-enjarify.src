package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.Easing;

class MotionController$1
  implements Interpolator
{
  public MotionController$1(Easing paramEasing) {}
  
  public float getInterpolation(float paramFloat)
  {
    Easing localEasing = this.OooO00o;
    double d = paramFloat;
    return (float)localEasing.OooO00o(d);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionController.1
 * JD-Core Version:    0.7.0.1
 */