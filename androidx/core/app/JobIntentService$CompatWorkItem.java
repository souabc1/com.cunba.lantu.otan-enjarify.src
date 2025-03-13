package androidx.core.app;

import android.app.Service;
import android.content.Intent;

final class JobIntentService$CompatWorkItem
  implements JobIntentService.GenericWorkItem
{
  public final Intent OooO00o;
  public final int OooO0O0;
  
  public JobIntentService$CompatWorkItem(JobIntentService paramJobIntentService, Intent paramIntent, int paramInt)
  {
    this.OooO00o = paramIntent;
    this.OooO0O0 = paramInt;
  }
  
  public void OooO00o()
  {
    JobIntentService localJobIntentService = this.OooO0OO;
    int i = this.OooO0O0;
    localJobIntentService.stopSelf(i);
  }
  
  public Intent getIntent()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.JobIntentService.CompatWorkItem
 * JD-Core Version:    0.7.0.1
 */