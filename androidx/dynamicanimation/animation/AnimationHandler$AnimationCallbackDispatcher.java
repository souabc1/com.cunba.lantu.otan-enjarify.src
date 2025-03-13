package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import java.util.ArrayList;

class AnimationHandler$AnimationCallbackDispatcher
{
  public AnimationHandler$AnimationCallbackDispatcher(AnimationHandler paramAnimationHandler) {}
  
  public void OooO00o()
  {
    Object localObject = this.OooO00o;
    long l = SystemClock.uptimeMillis();
    ((AnimationHandler)localObject).OooO0o0 = l;
    localObject = this.OooO00o;
    l = ((AnimationHandler)localObject).OooO0o0;
    ((AnimationHandler)localObject).OooO0OO(l);
    localObject = this.OooO00o.OooO0O0;
    int i = ((ArrayList)localObject).size();
    if (i > 0)
    {
      localObject = this.OooO00o.getProvider();
      ((AnimationHandler.AnimationFrameCallbackProvider)localObject).OooO00o();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.dynamicanimation.animation.AnimationHandler.AnimationCallbackDispatcher
 * JD-Core Version:    0.7.0.1
 */