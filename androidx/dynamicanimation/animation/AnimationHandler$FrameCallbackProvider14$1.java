package androidx.dynamicanimation.animation;

import android.os.SystemClock;

class AnimationHandler$FrameCallbackProvider14$1
  implements Runnable
{
  public void run()
  {
    AnimationHandler.FrameCallbackProvider14 localFrameCallbackProvider14 = this.o00OoOoo;
    long l = SystemClock.uptimeMillis();
    localFrameCallbackProvider14.OooO0Oo = l;
    this.o00OoOoo.OooO00o.OooO00o();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider14.1
 * JD-Core Version:    0.7.0.1
 */