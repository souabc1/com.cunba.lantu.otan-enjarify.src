package androidx.fragment.app;

import android.content.Context;
import androidx.core.os.CancellationSignal;
import kotlin.jvm.internal.Intrinsics;

final class DefaultSpecialEffectsController$AnimationInfo
  extends DefaultSpecialEffectsController.SpecialEffectsInfo
{
  public final boolean OooO0OO;
  public boolean OooO0Oo;
  public FragmentAnim.AnimationOrAnimator OooO0o0;
  
  public DefaultSpecialEffectsController$AnimationInfo(SpecialEffectsController.Operation paramOperation, CancellationSignal paramCancellationSignal, boolean paramBoolean)
  {
    super(paramOperation, paramCancellationSignal);
    this.OooO0OO = paramBoolean;
  }
  
  public final FragmentAnim.AnimationOrAnimator OooO0O0(Context paramContext)
  {
    Object localObject = "context";
    Intrinsics.OooO0o(paramContext, (String)localObject);
    boolean bool1 = this.OooO0Oo;
    if (bool1)
    {
      paramContext = this.OooO0o0;
    }
    else
    {
      localObject = getOperation().getFragment();
      SpecialEffectsController.Operation.State localState1 = getOperation().getFinalState();
      SpecialEffectsController.Operation.State localState2 = SpecialEffectsController.Operation.State.o00Ooo0;
      boolean bool2 = true;
      boolean bool3;
      if (localState1 == localState2)
      {
        bool3 = bool2;
      }
      else
      {
        bool3 = false;
        localState1 = null;
      }
      boolean bool4 = this.OooO0OO;
      paramContext = FragmentAnim.OooO0O0(paramContext, (Fragment)localObject, bool3, bool4);
      this.OooO0o0 = paramContext;
      this.OooO0Oo = bool2;
    }
    return paramContext;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo
 * JD-Core Version:    0.7.0.1
 */