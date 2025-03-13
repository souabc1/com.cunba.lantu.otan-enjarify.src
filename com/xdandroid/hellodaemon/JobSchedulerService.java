package com.xdandroid.hellodaemon;

import android.app.job.JobParameters;
import android.app.job.JobService;

public class JobSchedulerService
  extends JobService
{
  public boolean onStartJob(JobParameters paramJobParameters)
  {
    boolean bool = DaemonEnv.OooO0Oo;
    if (!bool) {
      return false;
    }
    DaemonEnv.OooO0O0(DaemonEnv.OooO0O0);
    return false;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters)
  {
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xdandroid.hellodaemon.JobSchedulerService
 * JD-Core Version:    0.7.0.1
 */