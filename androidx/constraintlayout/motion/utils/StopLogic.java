package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.motion.widget.MotionInterpolator;

public class StopLogic
  extends MotionInterpolator
{
  public StopLogicEngine OooO00o;
  public SpringStopEngine OooO0O0;
  public StopEngine OooO0OO;
  
  public StopLogic()
  {
    StopLogicEngine localStopLogicEngine = new androidx/constraintlayout/core/motion/utils/StopLogicEngine;
    localStopLogicEngine.<init>();
    this.OooO00o = localStopLogicEngine;
    this.OooO0OO = localStopLogicEngine;
  }
  
  public void OooO00o(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    StopLogicEngine localStopLogicEngine = this.OooO00o;
    this.OooO0OO = localStopLogicEngine;
    localStopLogicEngine.OooO0O0(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
  
  public void OooO0O0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, int paramInt)
  {
    StopLogic localStopLogic = this;
    SpringStopEngine localSpringStopEngine1 = this.OooO0O0;
    if (localSpringStopEngine1 == null)
    {
      localSpringStopEngine1 = new androidx/constraintlayout/core/motion/utils/SpringStopEngine;
      localSpringStopEngine1.<init>();
      this.OooO0O0 = localSpringStopEngine1;
    }
    SpringStopEngine localSpringStopEngine2 = localStopLogic.OooO0O0;
    localStopLogic.OooO0OO = localSpringStopEngine2;
    localSpringStopEngine2.OooO0O0(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramInt);
  }
  
  public float getInterpolation(float paramFloat)
  {
    return this.OooO0OO.getInterpolation(paramFloat);
  }
  
  public float getVelocity()
  {
    return this.OooO0OO.getVelocity();
  }
  
  public boolean isStopped()
  {
    return this.OooO0OO.isStopped();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.utils.StopLogic
 * JD-Core Version:    0.7.0.1
 */