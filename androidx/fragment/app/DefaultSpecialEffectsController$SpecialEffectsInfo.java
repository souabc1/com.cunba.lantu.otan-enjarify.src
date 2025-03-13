package androidx.fragment.app;

import android.view.View;
import androidx.core.os.CancellationSignal;
import kotlin.jvm.internal.Intrinsics;

class DefaultSpecialEffectsController$SpecialEffectsInfo
{
  public final SpecialEffectsController.Operation OooO00o;
  public final CancellationSignal OooO0O0;
  
  public DefaultSpecialEffectsController$SpecialEffectsInfo(SpecialEffectsController.Operation paramOperation, CancellationSignal paramCancellationSignal)
  {
    this.OooO00o = paramOperation;
    this.OooO0O0 = paramCancellationSignal;
  }
  
  public final void OooO00o()
  {
    SpecialEffectsController.Operation localOperation = this.OooO00o;
    CancellationSignal localCancellationSignal = this.OooO0O0;
    localOperation.OooO0o(localCancellationSignal);
  }
  
  public final SpecialEffectsController.Operation getOperation()
  {
    return this.OooO00o;
  }
  
  public final CancellationSignal getSignal()
  {
    return this.OooO0O0;
  }
  
  public final boolean isVisibilityUnchanged()
  {
    Object localObject1 = SpecialEffectsController.Operation.State.o00OoOoo;
    Object localObject2 = this.OooO00o.getFragment().mView;
    Object localObject3 = "operation.fragment.mView";
    Intrinsics.OooO0o0(localObject2, (String)localObject3);
    localObject1 = ((SpecialEffectsController.Operation.State.Companion)localObject1).OooO00o((View)localObject2);
    localObject2 = this.OooO00o.getFinalState();
    if (localObject1 != localObject2)
    {
      localObject3 = SpecialEffectsController.Operation.State.o00Ooo0;
      if ((localObject1 == localObject3) || (localObject2 == localObject3))
      {
        bool = false;
        localObject1 = null;
        break label70;
      }
    }
    boolean bool = true;
    label70:
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo
 * JD-Core Version:    0.7.0.1
 */