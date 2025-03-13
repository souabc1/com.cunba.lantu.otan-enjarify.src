package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityResultCallerLauncher$resultContract$2$1
  extends ActivityResultContract
{
  public ActivityResultCallerLauncher$resultContract$2$1(ActivityResultCallerLauncher paramActivityResultCallerLauncher) {}
  
  public Object OooO0OO(int paramInt, Intent paramIntent)
  {
    return this.OooO00o.getCallerContract().OooO0OO(paramInt, paramIntent);
  }
  
  public Intent OooO0Oo(Context paramContext, Unit paramUnit)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramUnit, "input");
    paramUnit = this.OooO00o.getCallerContract();
    Object localObject = this.OooO00o.getCallerInput();
    return paramUnit.OooO00o(paramContext, localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.ActivityResultCallerLauncher.resultContract.2.1
 * JD-Core Version:    0.7.0.1
 */