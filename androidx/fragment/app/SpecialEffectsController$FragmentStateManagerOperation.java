package androidx.fragment.app;

import android.view.View;
import androidx.core.os.CancellationSignal;
import kotlin.jvm.internal.Intrinsics;

final class SpecialEffectsController$FragmentStateManagerOperation
  extends SpecialEffectsController.Operation
{
  public final FragmentStateManager OooO0oo;
  
  public SpecialEffectsController$FragmentStateManagerOperation(SpecialEffectsController.Operation.State paramState, SpecialEffectsController.Operation.LifecycleImpact paramLifecycleImpact, FragmentStateManager paramFragmentStateManager, CancellationSignal paramCancellationSignal)
  {
    super(paramState, paramLifecycleImpact, localFragment, paramCancellationSignal);
    this.OooO0oo = paramFragmentStateManager;
  }
  
  public void OooO()
  {
    Object localObject1 = getLifecycleImpact();
    Object localObject2 = SpecialEffectsController.Operation.LifecycleImpact.o00Ooo00;
    Object localObject3 = " for Fragment ";
    int i = 2;
    Object localObject4 = "fragmentStateManager.fragment";
    int j;
    StringBuilder localStringBuilder;
    if (localObject1 == localObject2)
    {
      localObject1 = this.OooO0oo.getFragment();
      Intrinsics.OooO0o0(localObject1, (String)localObject4);
      localObject2 = ((Fragment)localObject1).mView.findFocus();
      if (localObject2 != null)
      {
        ((Fragment)localObject1).setFocusedView((View)localObject2);
        j = FragmentManager.isLoggingEnabled(i);
        if (j != 0)
        {
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localObject4 = "requestFocus: Saved focused view ";
          localStringBuilder.append((String)localObject4);
          localStringBuilder.append(localObject2);
          localStringBuilder.append((String)localObject3);
          localStringBuilder.append(localObject1);
        }
      }
      localObject2 = getFragment().requireView();
      Intrinsics.OooO0o0(localObject2, "this.fragment.requireView()");
      localObject3 = ((View)localObject2).getParent();
      j = 0;
      localStringBuilder = null;
      if (localObject3 == null)
      {
        localObject3 = this.OooO0oo;
        ((FragmentStateManager)localObject3).OooO0O0();
        ((View)localObject2).setAlpha(0.0F);
      }
      float f1 = ((View)localObject2).getAlpha();
      boolean bool2 = f1 < 0.0F;
      if (!bool2)
      {
        bool2 = true;
        f1 = 1.4E-45F;
      }
      else
      {
        bool2 = false;
        f1 = 0.0F;
        localObject3 = null;
      }
      if (bool2)
      {
        int k = ((View)localObject2).getVisibility();
        if (k == 0)
        {
          k = 4;
          f1 = 5.605194E-045F;
          ((View)localObject2).setVisibility(k);
        }
      }
      float f2 = ((Fragment)localObject1).getPostOnViewCreatedAlpha();
      ((View)localObject2).setAlpha(f2);
    }
    else
    {
      localObject1 = getLifecycleImpact();
      localObject2 = SpecialEffectsController.Operation.LifecycleImpact.o00Ooo0;
      if (localObject1 == localObject2)
      {
        localObject1 = this.OooO0oo.getFragment();
        Intrinsics.OooO0o0(localObject1, (String)localObject4);
        localObject2 = ((Fragment)localObject1).requireView();
        localObject4 = "fragment.requireView()";
        Intrinsics.OooO0o0(localObject2, (String)localObject4);
        boolean bool1 = FragmentManager.isLoggingEnabled(j);
        if (bool1)
        {
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("Clearing focus ");
          localObject4 = ((View)localObject2).findFocus();
          localStringBuilder.append(localObject4);
          localObject4 = " on view ";
          localStringBuilder.append((String)localObject4);
          localStringBuilder.append(localObject2);
          localStringBuilder.append((String)localObject3);
          localStringBuilder.append(localObject1);
        }
        ((View)localObject2).clearFocus();
      }
    }
  }
  
  public void OooO0o0()
  {
    super.OooO0o0();
    this.OooO0oo.OooOO0o();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation
 * JD-Core Version:    0.7.0.1
 */