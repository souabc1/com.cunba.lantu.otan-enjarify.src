package androidx.window.layout;

import android.app.Activity;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

final class ExtensionWindowLayoutInfoBackend$MulticastConsumer
  implements java.util.function.Consumer
{
  public final Activity o00OoOoo;
  public WindowLayoutInfo o00Ooo0;
  public final ReentrantLock o00Ooo00;
  public final Set o00Ooo0O;
  
  public ExtensionWindowLayoutInfoBackend$MulticastConsumer(Activity paramActivity)
  {
    this.o00OoOoo = paramActivity;
    paramActivity = new java/util/concurrent/locks/ReentrantLock;
    paramActivity.<init>();
    this.o00Ooo00 = paramActivity;
    paramActivity = new java/util/LinkedHashSet;
    paramActivity.<init>();
    this.o00Ooo0O = paramActivity;
  }
  
  public void OooO00o(androidx.window.extensions.layout.WindowLayoutInfo paramWindowLayoutInfo)
  {
    Intrinsics.OooO0o(paramWindowLayoutInfo, "value");
    ReentrantLock localReentrantLock = this.o00Ooo00;
    localReentrantLock.lock();
    try
    {
      Object localObject1 = ExtensionsWindowLayoutInfoAdapter.OooO00o;
      Object localObject2 = this.o00OoOoo;
      paramWindowLayoutInfo = ((ExtensionsWindowLayoutInfoAdapter)localObject1).OooO0O0((Activity)localObject2, paramWindowLayoutInfo);
      this.o00Ooo0 = paramWindowLayoutInfo;
      paramWindowLayoutInfo = this.o00Ooo0O;
      paramWindowLayoutInfo = paramWindowLayoutInfo.iterator();
      for (;;)
      {
        boolean bool = paramWindowLayoutInfo.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = paramWindowLayoutInfo.next();
        localObject1 = (androidx.core.util.Consumer)localObject1;
        localObject2 = this.o00Ooo0;
        ((androidx.core.util.Consumer)localObject1).accept(localObject2);
      }
      paramWindowLayoutInfo = Unit.OooO00o;
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public final void OooO0O0(androidx.core.util.Consumer paramConsumer)
  {
    Intrinsics.OooO0o(paramConsumer, "listener");
    ReentrantLock localReentrantLock = this.o00Ooo00;
    localReentrantLock.lock();
    try
    {
      Object localObject = this.o00Ooo0;
      if (localObject != null) {
        paramConsumer.accept(localObject);
      }
      localObject = this.o00Ooo0O;
      ((Set)localObject).add(paramConsumer);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public final void OooO0OO(androidx.core.util.Consumer paramConsumer)
  {
    Intrinsics.OooO0o(paramConsumer, "listener");
    ReentrantLock localReentrantLock = this.o00Ooo00;
    localReentrantLock.lock();
    try
    {
      Set localSet = this.o00Ooo0O;
      localSet.remove(paramConsumer);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public final boolean isEmpty()
  {
    return this.o00Ooo0O.isEmpty();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.ExtensionWindowLayoutInfoBackend.MulticastConsumer
 * JD-Core Version:    0.7.0.1
 */