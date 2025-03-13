package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

public final class DispatchQueue
{
  public boolean OooO00o = true;
  public boolean OooO0O0;
  public boolean OooO0OO;
  public final Queue OooO0Oo;
  
  public DispatchQueue()
  {
    ArrayDeque localArrayDeque = new java/util/ArrayDeque;
    localArrayDeque.<init>();
    this.OooO0Oo = localArrayDeque;
  }
  
  public static final void OooO0Oo(DispatchQueue paramDispatchQueue, Runnable paramRunnable)
  {
    Intrinsics.OooO0o(paramDispatchQueue, "this$0");
    Intrinsics.OooO0o(paramRunnable, "$runnable");
    paramDispatchQueue.OooO0o(paramRunnable);
  }
  
  public final void OooO()
  {
    boolean bool = this.OooO00o;
    if (!bool) {
      return;
    }
    bool = this.OooO0O0 ^ true;
    if (bool)
    {
      this.OooO00o = false;
      OooO0o0();
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    String str = "Cannot resume a finished dispatcher".toString();
    localIllegalStateException.<init>(str);
    throw localIllegalStateException;
  }
  
  public final boolean OooO0O0()
  {
    boolean bool = this.OooO0O0;
    if (!bool)
    {
      bool = this.OooO00o;
      if (bool) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public final void OooO0OO(CoroutineContext paramCoroutineContext, Runnable paramRunnable)
  {
    Intrinsics.OooO0o(paramCoroutineContext, "context");
    Intrinsics.OooO0o(paramRunnable, "runnable");
    MainCoroutineDispatcher localMainCoroutineDispatcher = Dispatchers.getMain().getImmediate();
    boolean bool = localMainCoroutineDispatcher.Ooooo00(paramCoroutineContext);
    if (!bool)
    {
      bool = OooO0O0();
      if (!bool)
      {
        OooO0o(paramRunnable);
        return;
      }
    }
    OooO0OO localOooO0OO = new androidx/lifecycle/OooO0OO;
    localOooO0OO.<init>(this, paramRunnable);
    localMainCoroutineDispatcher.OoooOoO(paramCoroutineContext, localOooO0OO);
  }
  
  public final void OooO0o(Runnable paramRunnable)
  {
    Object localObject = this.OooO0Oo;
    boolean bool = ((Queue)localObject).offer(paramRunnable);
    if (bool)
    {
      OooO0o0();
      return;
    }
    paramRunnable = new java/lang/IllegalStateException;
    localObject = "cannot enqueue any more runnables".toString();
    paramRunnable.<init>((String)localObject);
    throw paramRunnable;
  }
  
  public final void OooO0o0()
  {
    boolean bool1 = this.OooO0OO;
    if (bool1) {
      return;
    }
    bool1 = false;
    boolean bool2 = true;
    try
    {
      this.OooO0OO = bool2;
      for (;;)
      {
        Object localObject1 = this.OooO0Oo;
        boolean bool3 = ((Collection)localObject1).isEmpty() ^ bool2;
        if (!bool3) {
          break;
        }
        bool3 = OooO0O0();
        if (!bool3) {
          break;
        }
        localObject1 = this.OooO0Oo;
        localObject1 = ((Queue)localObject1).poll();
        localObject1 = (Runnable)localObject1;
        if (localObject1 != null) {
          ((Runnable)localObject1).run();
        }
      }
      return;
    }
    finally
    {
      this.OooO0OO = false;
    }
  }
  
  public final void OooO0oO()
  {
    this.OooO0O0 = true;
    OooO0o0();
  }
  
  public final void OooO0oo()
  {
    this.OooO00o = true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.DispatchQueue
 * JD-Core Version:    0.7.0.1
 */