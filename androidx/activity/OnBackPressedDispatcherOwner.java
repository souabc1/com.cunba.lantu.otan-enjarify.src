package androidx.activity;

import androidx.lifecycle.LifecycleOwner;

public abstract interface OnBackPressedDispatcherOwner
  extends LifecycleOwner
{
  public abstract OnBackPressedDispatcher getOnBackPressedDispatcher();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.OnBackPressedDispatcherOwner
 * JD-Core Version:    0.7.0.1
 */