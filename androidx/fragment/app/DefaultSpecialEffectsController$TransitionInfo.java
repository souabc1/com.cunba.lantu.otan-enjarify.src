package androidx.fragment.app;

import androidx.core.os.CancellationSignal;

final class DefaultSpecialEffectsController$TransitionInfo
  extends DefaultSpecialEffectsController.SpecialEffectsInfo
{
  public final Object OooO0OO;
  public final boolean OooO0Oo;
  public final Object OooO0o0;
  
  public DefaultSpecialEffectsController$TransitionInfo(SpecialEffectsController.Operation paramOperation, CancellationSignal paramCancellationSignal, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramOperation, paramCancellationSignal);
    paramCancellationSignal = paramOperation.getFinalState();
    SpecialEffectsController.Operation.State localState = SpecialEffectsController.Operation.State.o00Ooo0;
    if (paramCancellationSignal == localState)
    {
      paramCancellationSignal = paramOperation.getFragment();
      if (paramBoolean1) {
        paramCancellationSignal = paramCancellationSignal.getReenterTransition();
      } else {
        paramCancellationSignal = paramCancellationSignal.getEnterTransition();
      }
    }
    else
    {
      paramCancellationSignal = paramOperation.getFragment();
      if (paramBoolean1) {
        paramCancellationSignal = paramCancellationSignal.getReturnTransition();
      } else {
        paramCancellationSignal = paramCancellationSignal.getExitTransition();
      }
    }
    this.OooO0OO = paramCancellationSignal;
    paramCancellationSignal = paramOperation.getFinalState();
    boolean bool;
    if (paramCancellationSignal == localState)
    {
      paramCancellationSignal = paramOperation.getFragment();
      if (paramBoolean1) {
        bool = paramCancellationSignal.getAllowReturnTransitionOverlap();
      } else {
        bool = paramCancellationSignal.getAllowEnterTransitionOverlap();
      }
    }
    else
    {
      bool = true;
    }
    this.OooO0Oo = bool;
    if (paramBoolean2)
    {
      paramOperation = paramOperation.getFragment();
      if (paramBoolean1) {
        paramOperation = paramOperation.getSharedElementReturnTransition();
      } else {
        paramOperation = paramOperation.getSharedElementEnterTransition();
      }
    }
    else
    {
      paramOperation = null;
    }
    this.OooO0o0 = paramOperation;
  }
  
  public final FragmentTransitionImpl OooO0O0(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    Object localObject = FragmentTransition.OooO0O0;
    boolean bool;
    if (localObject != null)
    {
      bool = ((FragmentTransitionImpl)localObject).OooO0o0(paramObject);
      if (bool) {
        return localObject;
      }
    }
    localObject = FragmentTransition.OooO0OO;
    if (localObject != null)
    {
      bool = ((FragmentTransitionImpl)localObject).OooO0o0(paramObject);
      if (bool) {
        return localObject;
      }
    }
    localObject = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Transition ");
    localStringBuilder.append(paramObject);
    localStringBuilder.append(" for fragment ");
    paramObject = getOperation().getFragment();
    localStringBuilder.append(paramObject);
    localStringBuilder.append(" is not a valid framework Transition or AndroidX Transition");
    paramObject = localStringBuilder.toString();
    ((IllegalArgumentException)localObject).<init>(paramObject);
    throw ((Throwable)localObject);
  }
  
  public final boolean OooO0OO()
  {
    Object localObject = this.OooO0o0;
    boolean bool;
    if (localObject != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localObject = null;
    }
    return bool;
  }
  
  public final FragmentTransitionImpl getHandlingImpl()
  {
    Object localObject1 = this.OooO0OO;
    localObject1 = OooO0O0(localObject1);
    Object localObject2 = this.OooO0o0;
    localObject2 = OooO0O0(localObject2);
    int i;
    if ((localObject1 != null) && (localObject2 != null) && (localObject1 != localObject2)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      if (localObject1 == null) {
        localObject1 = localObject2;
      }
      return localObject1;
    }
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
    localObject2 = getOperation().getFragment();
    ((StringBuilder)localObject1).append(localObject2);
    ((StringBuilder)localObject1).append(" returned Transition ");
    localObject2 = this.OooO0OO;
    ((StringBuilder)localObject1).append(localObject2);
    ((StringBuilder)localObject1).append(" which uses a different Transition  type than its shared element transition ");
    localObject2 = this.OooO0o0;
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    localObject2 = new java/lang/IllegalArgumentException;
    localObject1 = localObject1.toString();
    ((IllegalArgumentException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
  
  public final Object getSharedElementTransition()
  {
    return this.OooO0o0;
  }
  
  public final Object getTransition()
  {
    return this.OooO0OO;
  }
  
  public final boolean isOverlapAllowed()
  {
    return this.OooO0Oo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo
 * JD-Core Version:    0.7.0.1
 */