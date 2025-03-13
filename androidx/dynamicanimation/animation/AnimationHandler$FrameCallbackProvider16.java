package androidx.dynamicanimation.animation;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

class AnimationHandler$FrameCallbackProvider16
  extends AnimationHandler.AnimationFrameCallbackProvider
{
  public final Choreographer OooO0O0;
  public final Choreographer.FrameCallback OooO0OO;
  
  public AnimationHandler$FrameCallbackProvider16(AnimationHandler.AnimationCallbackDispatcher paramAnimationCallbackDispatcher)
  {
    super(paramAnimationCallbackDispatcher);
    paramAnimationCallbackDispatcher = Choreographer.getInstance();
    this.OooO0O0 = paramAnimationCallbackDispatcher;
    paramAnimationCallbackDispatcher = new androidx/dynamicanimation/animation/AnimationHandler$FrameCallbackProvider16$1;
    paramAnimationCallbackDispatcher.<init>(this);
    this.OooO0OO = paramAnimationCallbackDispatcher;
  }
  
  public void OooO00o()
  {
    Choreographer localChoreographer = this.OooO0O0;
    Choreographer.FrameCallback localFrameCallback = this.OooO0OO;
    localChoreographer.postFrameCallback(localFrameCallback);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider16
 * JD-Core Version:    0.7.0.1
 */