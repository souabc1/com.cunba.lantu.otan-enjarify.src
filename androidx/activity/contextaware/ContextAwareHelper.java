package androidx.activity.contextaware;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

public final class ContextAwareHelper
{
  public final Set OooO00o;
  public volatile Context OooO0O0;
  
  public ContextAwareHelper()
  {
    CopyOnWriteArraySet localCopyOnWriteArraySet = new java/util/concurrent/CopyOnWriteArraySet;
    localCopyOnWriteArraySet.<init>();
    this.OooO00o = localCopyOnWriteArraySet;
  }
  
  public final void OooO00o(OnContextAvailableListener paramOnContextAvailableListener)
  {
    Intrinsics.OooO0o(paramOnContextAvailableListener, "listener");
    Context localContext = this.OooO0O0;
    if (localContext != null) {
      paramOnContextAvailableListener.OooO00o(localContext);
    }
    this.OooO00o.add(paramOnContextAvailableListener);
  }
  
  public final void OooO0O0()
  {
    this.OooO0O0 = null;
  }
  
  public final void OooO0OO(Context paramContext)
  {
    Intrinsics.OooO0o(paramContext, "context");
    this.OooO0O0 = paramContext;
    Iterator localIterator = this.OooO00o.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      OnContextAvailableListener localOnContextAvailableListener = (OnContextAvailableListener)localIterator.next();
      localOnContextAvailableListener.OooO00o(paramContext);
    }
  }
  
  public final void OooO0Oo(OnContextAvailableListener paramOnContextAvailableListener)
  {
    Intrinsics.OooO0o(paramOnContextAvailableListener, "listener");
    this.OooO00o.remove(paramOnContextAvailableListener);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.contextaware.ContextAwareHelper
 * JD-Core Version:    0.7.0.1
 */