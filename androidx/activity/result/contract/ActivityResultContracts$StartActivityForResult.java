package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityResultContracts$StartActivityForResult
  extends ActivityResultContract
{
  public static final ActivityResultContracts.StartActivityForResult.Companion OooO00o;
  
  static
  {
    ActivityResultContracts.StartActivityForResult.Companion localCompanion = new androidx/activity/result/contract/ActivityResultContracts$StartActivityForResult$Companion;
    localCompanion.<init>(null);
    OooO00o = localCompanion;
  }
  
  public Intent OooO0Oo(Context paramContext, Intent paramIntent)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramIntent, "input");
    return paramIntent;
  }
  
  public ActivityResult OooO0o0(int paramInt, Intent paramIntent)
  {
    ActivityResult localActivityResult = new androidx/activity/result/ActivityResult;
    localActivityResult.<init>(paramInt, paramIntent);
    return localActivityResult;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
 * JD-Core Version:    0.7.0.1
 */