package androidx.recyclerview.widget;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public class AsyncListDiffer
{
  public static final Executor OooO0oo;
  public final ListUpdateCallback OooO00o;
  public final AsyncDifferConfig OooO0O0;
  public Executor OooO0OO;
  public final List OooO0Oo;
  public List OooO0o;
  public List OooO0o0;
  public int OooO0oO;
  
  static
  {
    AsyncListDiffer.MainThreadExecutor localMainThreadExecutor = new androidx/recyclerview/widget/AsyncListDiffer$MainThreadExecutor;
    localMainThreadExecutor.<init>();
    OooO0oo = localMainThreadExecutor;
  }
  
  public void OooO00o(List paramList, DiffUtil.DiffResult paramDiffResult, Runnable paramRunnable)
  {
    List localList = this.OooO0o;
    this.OooO0o0 = paramList;
    paramList = Collections.unmodifiableList(paramList);
    this.OooO0o = paramList;
    paramList = this.OooO00o;
    paramDiffResult.OooO0O0(paramList);
    OooO0O0(localList, paramRunnable);
  }
  
  public final void OooO0O0(List paramList, Runnable paramRunnable)
  {
    Iterator localIterator = this.OooO0Oo.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      AsyncListDiffer.ListListener localListListener = (AsyncListDiffer.ListListener)localIterator.next();
      List localList = this.OooO0o;
      localListListener.OooO00o(paramList, localList);
    }
    if (paramRunnable != null) {
      paramRunnable.run();
    }
  }
  
  public List getCurrentList()
  {
    return this.OooO0o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.AsyncListDiffer
 * JD-Core Version:    0.7.0.1
 */