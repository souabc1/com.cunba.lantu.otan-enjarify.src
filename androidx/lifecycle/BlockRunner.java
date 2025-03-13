package androidx.lifecycle;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.MainCoroutineDispatcher;

public final class BlockRunner
{
  public final CoroutineLiveData OooO00o;
  public final Function2 OooO0O0;
  public final long OooO0OO;
  public final CoroutineScope OooO0Oo;
  public Job OooO0o;
  public final Function0 OooO0o0;
  public Job OooO0oO;
  
  public final void OooO0oO()
  {
    Object localObject1 = this.OooO0oO;
    if (localObject1 == null)
    {
      localObject2 = this.OooO0Oo;
      MainCoroutineDispatcher localMainCoroutineDispatcher = Dispatchers.getMain().getImmediate();
      BlockRunner.cancel.1 local1 = new androidx/lifecycle/BlockRunner$cancel$1;
      local1.<init>(this, null);
      localObject1 = BuildersKt.OooO0O0((CoroutineScope)localObject2, localMainCoroutineDispatcher, null, local1, 2, null);
      this.OooO0oO = ((Job)localObject1);
      return;
    }
    localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = "Cancel call cannot happen without a maybeRun".toString();
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public final void OooO0oo()
  {
    Job localJob = this.OooO0oO;
    if (localJob != null)
    {
      int i = 1;
      Job.DefaultImpls.OooO00o(localJob, null, i, null);
    }
    this.OooO0oO = null;
    localJob = this.OooO0o;
    if (localJob != null) {
      return;
    }
    CoroutineScope localCoroutineScope = this.OooO0Oo;
    BlockRunner.maybeRun.1 local1 = new androidx/lifecycle/BlockRunner$maybeRun$1;
    local1.<init>(this, null);
    localJob = BuildersKt.OooO0O0(localCoroutineScope, null, null, local1, 3, null);
    this.OooO0o = localJob;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.BlockRunner
 * JD-Core Version:    0.7.0.1
 */