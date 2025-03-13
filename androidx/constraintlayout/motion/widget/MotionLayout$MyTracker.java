package androidx.constraintlayout.motion.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;

class MotionLayout$MyTracker
  implements MotionLayout.MotionTracker
{
  public static MyTracker OooO0O0;
  public VelocityTracker OooO00o;
  
  static
  {
    MyTracker localMyTracker = new androidx/constraintlayout/motion/widget/MotionLayout$MyTracker;
    localMyTracker.<init>();
    OooO0O0 = localMyTracker;
  }
  
  public static MyTracker OooO0OO()
  {
    MyTracker localMyTracker = OooO0O0;
    VelocityTracker localVelocityTracker = VelocityTracker.obtain();
    localMyTracker.OooO00o = localVelocityTracker;
    return OooO0O0;
  }
  
  public void OooO00o(MotionEvent paramMotionEvent)
  {
    VelocityTracker localVelocityTracker = this.OooO00o;
    if (localVelocityTracker != null) {
      localVelocityTracker.addMovement(paramMotionEvent);
    }
  }
  
  public void OooO0O0(int paramInt)
  {
    VelocityTracker localVelocityTracker = this.OooO00o;
    if (localVelocityTracker != null) {
      localVelocityTracker.computeCurrentVelocity(paramInt);
    }
  }
  
  public float getXVelocity()
  {
    VelocityTracker localVelocityTracker = this.OooO00o;
    if (localVelocityTracker != null) {
      return localVelocityTracker.getXVelocity();
    }
    return 0.0F;
  }
  
  public float getXVelocity(int paramInt)
  {
    VelocityTracker localVelocityTracker = this.OooO00o;
    if (localVelocityTracker != null) {
      return localVelocityTracker.getXVelocity(paramInt);
    }
    return 0.0F;
  }
  
  public float getYVelocity()
  {
    VelocityTracker localVelocityTracker = this.OooO00o;
    if (localVelocityTracker != null) {
      return localVelocityTracker.getYVelocity();
    }
    return 0.0F;
  }
  
  public float getYVelocity(int paramInt)
  {
    VelocityTracker localVelocityTracker = this.OooO00o;
    if (localVelocityTracker != null) {
      return getYVelocity(paramInt);
    }
    return 0.0F;
  }
  
  public void recycle()
  {
    VelocityTracker localVelocityTracker = this.OooO00o;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      localVelocityTracker = null;
      this.OooO00o = null;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionLayout.MyTracker
 * JD-Core Version:    0.7.0.1
 */