package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub;

public abstract class UnusedAppRestrictionsBackportService
  extends Service
{
  public IUnusedAppRestrictionsBackportService.Stub o00OoOoo;
  
  public UnusedAppRestrictionsBackportService()
  {
    UnusedAppRestrictionsBackportService.1 local1 = new androidx/core/content/UnusedAppRestrictionsBackportService$1;
    local1.<init>(this);
    this.o00OoOoo = local1;
  }
  
  public abstract void OooO00o(UnusedAppRestrictionsBackportCallback paramUnusedAppRestrictionsBackportCallback);
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.o00OoOoo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.UnusedAppRestrictionsBackportService
 * JD-Core Version:    0.7.0.1
 */