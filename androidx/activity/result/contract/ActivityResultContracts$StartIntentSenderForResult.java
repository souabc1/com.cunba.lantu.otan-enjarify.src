package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityResultContracts$StartIntentSenderForResult
  extends ActivityResultContract
{
  public static final ActivityResultContracts.StartIntentSenderForResult.Companion OooO00o;
  
  static
  {
    ActivityResultContracts.StartIntentSenderForResult.Companion localCompanion = new androidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult$Companion;
    localCompanion.<init>(null);
    OooO00o = localCompanion;
  }
  
  public Intent OooO0Oo(Context paramContext, IntentSenderRequest paramIntentSenderRequest)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramIntentSenderRequest, "input");
    paramContext = new android/content/Intent;
    paramContext.<init>("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
    paramContext = paramContext.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", paramIntentSenderRequest);
    Intrinsics.OooO0o0(paramContext, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
    return paramContext;
  }
  
  public ActivityResult OooO0o0(int paramInt, Intent paramIntent)
  {
    ActivityResult localActivityResult = new androidx/activity/result/ActivityResult;
    localActivityResult.<init>(paramInt, paramIntent);
    return localActivityResult;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult
 * JD-Core Version:    0.7.0.1
 */