package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public abstract class OnBackPressedCallback
{
  public boolean OooO00o;
  public final CopyOnWriteArrayList OooO0O0;
  public Function0 OooO0OO;
  
  public OnBackPressedCallback(boolean paramBoolean)
  {
    this.OooO00o = paramBoolean;
    CopyOnWriteArrayList localCopyOnWriteArrayList = new java/util/concurrent/CopyOnWriteArrayList;
    localCopyOnWriteArrayList.<init>();
    this.OooO0O0 = localCopyOnWriteArrayList;
  }
  
  public final void OooO0Oo(Cancellable paramCancellable)
  {
    Intrinsics.OooO0o(paramCancellable, "cancellable");
    this.OooO0O0.add(paramCancellable);
  }
  
  public final void OooO0o()
  {
    Iterator localIterator = this.OooO0O0.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Cancellable localCancellable = (Cancellable)localIterator.next();
      localCancellable.cancel();
    }
  }
  
  public abstract void OooO0o0();
  
  public final void OooO0oO(Cancellable paramCancellable)
  {
    Intrinsics.OooO0o(paramCancellable, "cancellable");
    this.OooO0O0.remove(paramCancellable);
  }
  
  public final Function0 getEnabledChangedCallback$activity_release()
  {
    return this.OooO0OO;
  }
  
  public final boolean isEnabled()
  {
    return this.OooO00o;
  }
  
  public final void setEnabled(boolean paramBoolean)
  {
    this.OooO00o = paramBoolean;
    Function0 localFunction0 = this.OooO0OO;
    if (localFunction0 != null) {
      localFunction0.OooO00o();
    }
  }
  
  public final void setEnabledChangedCallback$activity_release(Function0 paramFunction0)
  {
    this.OooO0OO = paramFunction0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.OnBackPressedCallback
 * JD-Core Version:    0.7.0.1
 */