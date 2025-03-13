package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.SystemClock;

class AnimationHandler$FrameCallbackProvider14
  extends AnimationHandler.AnimationFrameCallbackProvider
{
  public final Runnable OooO0O0;
  public final Handler OooO0OO;
  public long OooO0Oo;
  
  public void OooO00o()
  {
    long l1 = SystemClock.uptimeMillis();
    long l2 = this.OooO0Oo;
    l1 -= l2;
    l1 = Math.max(10 - l1, 0L);
    Handler localHandler = this.OooO0OO;
    Runnable localRunnable = this.OooO0O0;
    localHandler.postDelayed(localRunnable, l1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider14
 * JD-Core Version:    0.7.0.1
 */