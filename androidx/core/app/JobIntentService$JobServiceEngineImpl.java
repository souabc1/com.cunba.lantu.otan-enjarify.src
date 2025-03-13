package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

final class JobIntentService$JobServiceEngineImpl
  extends JobServiceEngine
  implements JobIntentService.CompatJobEngine
{
  public final JobIntentService OooO00o;
  public final Object OooO0O0;
  public JobParameters OooO0OO;
  
  public JobIntentService$JobServiceEngineImpl(JobIntentService paramJobIntentService)
  {
    super(paramJobIntentService);
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.OooO0O0 = localObject;
    this.OooO00o = paramJobIntentService;
  }
  
  public IBinder OooO00o()
  {
    return getBinder();
  }
  
  public JobIntentService.GenericWorkItem OooO0O0()
  {
    synchronized (this.OooO0O0)
    {
      Object localObject2 = this.OooO0OO;
      ClassLoader localClassLoader = null;
      if (localObject2 == null) {
        return null;
      }
      localObject2 = ((JobParameters)localObject2).dequeueWork();
      if (localObject2 != null)
      {
        ??? = ((JobWorkItem)localObject2).getIntent();
        localClassLoader = this.OooO00o.getClassLoader();
        ((Intent)???).setExtrasClassLoader(localClassLoader);
        ??? = new androidx/core/app/JobIntentService$JobServiceEngineImpl$WrapperWorkItem;
        ((JobIntentService.JobServiceEngineImpl.WrapperWorkItem)???).<init>(this, (JobWorkItem)localObject2);
        return ???;
      }
      return null;
    }
  }
  
  public boolean onStartJob(JobParameters paramJobParameters)
  {
    this.OooO0OO = paramJobParameters;
    this.OooO00o.OooO0OO(false);
    return true;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters)
  {
    paramJobParameters = this.OooO00o;
    boolean bool = paramJobParameters.OooO0O0();
    synchronized (this.OooO0O0)
    {
      this.OooO0OO = null;
      return bool;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.JobIntentService.JobServiceEngineImpl
 * JD-Core Version:    0.7.0.1
 */