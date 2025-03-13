package androidx.activity;

import android.os.Build.VERSION;
import kotlin.collections.ArrayDeque;

final class OnBackPressedDispatcher$OnBackPressedCancellable
  implements Cancellable
{
  public final OnBackPressedCallback o00OoOoo;
  
  public OnBackPressedDispatcher$OnBackPressedCancellable(OnBackPressedDispatcher paramOnBackPressedDispatcher, OnBackPressedCallback paramOnBackPressedCallback)
  {
    this.o00OoOoo = paramOnBackPressedCallback;
  }
  
  public void cancel()
  {
    Object localObject = OnBackPressedDispatcher.OooO00o(this.o00Ooo00);
    OnBackPressedCallback localOnBackPressedCallback = this.o00OoOoo;
    ((ArrayDeque)localObject).remove(localOnBackPressedCallback);
    localObject = this.o00OoOoo;
    ((OnBackPressedCallback)localObject).OooO0oO(this);
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j)
    {
      localObject = this.o00OoOoo;
      j = 0;
      localOnBackPressedCallback = null;
      ((OnBackPressedCallback)localObject).setEnabledChangedCallback$activity_release(null);
      localObject = this.o00Ooo00;
      ((OnBackPressedDispatcher)localObject).OooO0o();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.OnBackPressedDispatcher.OnBackPressedCancellable
 * JD-Core Version:    0.7.0.1
 */