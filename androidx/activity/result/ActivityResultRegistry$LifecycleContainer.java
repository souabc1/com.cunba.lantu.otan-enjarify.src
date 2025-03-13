package androidx.activity.result;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import java.util.ArrayList;
import java.util.Iterator;

class ActivityResultRegistry$LifecycleContainer
{
  public final Lifecycle OooO00o;
  public final ArrayList OooO0O0;
  
  public ActivityResultRegistry$LifecycleContainer(Lifecycle paramLifecycle)
  {
    this.OooO00o = paramLifecycle;
    paramLifecycle = new java/util/ArrayList;
    paramLifecycle.<init>();
    this.OooO0O0 = paramLifecycle;
  }
  
  public void OooO00o(LifecycleEventObserver paramLifecycleEventObserver)
  {
    this.OooO00o.OooO00o(paramLifecycleEventObserver);
    this.OooO0O0.add(paramLifecycleEventObserver);
  }
  
  public void OooO0O0()
  {
    Iterator localIterator = this.OooO0O0.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      LifecycleEventObserver localLifecycleEventObserver = (LifecycleEventObserver)localIterator.next();
      Lifecycle localLifecycle = this.OooO00o;
      localLifecycle.OooO0O0(localLifecycleEventObserver);
    }
    this.OooO0O0.clear();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.ActivityResultRegistry.LifecycleContainer
 * JD-Core Version:    0.7.0.1
 */