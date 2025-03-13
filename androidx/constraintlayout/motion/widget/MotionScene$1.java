package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.Easing;

class MotionScene$1
  implements Interpolator
{
  public MotionScene$1(MotionScene paramMotionScene, Easing paramEasing) {}
  
  public float getInterpolation(float paramFloat)
  {
    Easing localEasing = this.OooO00o;
    double d = paramFloat;
    return (float)localEasing.OooO00o(d);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionScene.1
 * JD-Core Version:    0.7.0.1
 */