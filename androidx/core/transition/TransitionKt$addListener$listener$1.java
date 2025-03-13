package androidx.core.transition;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class TransitionKt$addListener$listener$1
  implements Transition.TransitionListener
{
  public void onTransitionCancel(Transition paramTransition)
  {
    Intrinsics.OooO0o(paramTransition, "transition");
    this.OooO0Oo.invoke(paramTransition);
  }
  
  public void onTransitionEnd(Transition paramTransition)
  {
    Intrinsics.OooO0o(paramTransition, "transition");
    this.OooO00o.invoke(paramTransition);
  }
  
  public void onTransitionPause(Transition paramTransition)
  {
    Intrinsics.OooO0o(paramTransition, "transition");
    this.OooO0OO.invoke(paramTransition);
  }
  
  public void onTransitionResume(Transition paramTransition)
  {
    Intrinsics.OooO0o(paramTransition, "transition");
    this.OooO0O0.invoke(paramTransition);
  }
  
  public void onTransitionStart(Transition paramTransition)
  {
    Intrinsics.OooO0o(paramTransition, "transition");
    this.OooO0o0.invoke(paramTransition);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.transition.TransitionKt.addListener.listener.1
 * JD-Core Version:    0.7.0.1
 */