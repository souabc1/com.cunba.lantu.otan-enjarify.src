package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

final class JobIntentService$JobServiceEngineImpl$WrapperWorkItem
  implements JobIntentService.GenericWorkItem
{
  public final JobWorkItem OooO00o;
  
  public JobIntentService$JobServiceEngineImpl$WrapperWorkItem(JobIntentService.JobServiceEngineImpl paramJobServiceEngineImpl, JobWorkItem paramJobWorkItem)
  {
    this.OooO00o = paramJobWorkItem;
  }
  
  public void OooO00o()
  {
    synchronized (this.OooO0O0.OooO0O0)
    {
      Object localObject2 = this.OooO0O0;
      localObject2 = ((JobIntentService.JobServiceEngineImpl)localObject2).OooO0OO;
      if (localObject2 != null)
      {
        JobWorkItem localJobWorkItem = this.OooO00o;
        ((JobParameters)localObject2).completeWork(localJobWorkItem);
      }
      return;
    }
  }
  
  public Intent getIntent()
  {
    return this.OooO00o.getIntent();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.JobIntentService.JobServiceEngineImpl.WrapperWorkItem
 * JD-Core Version:    0.7.0.1
 */