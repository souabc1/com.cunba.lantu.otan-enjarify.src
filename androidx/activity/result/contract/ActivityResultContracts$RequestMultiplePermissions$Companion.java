package androidx.activity.result.contract;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityResultContracts$RequestMultiplePermissions$Companion
{
  public final Intent OooO00o(String[] paramArrayOfString)
  {
    Intrinsics.OooO0o(paramArrayOfString, "input");
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("androidx.activity.result.contract.action.REQUEST_PERMISSIONS");
    paramArrayOfString = localIntent.putExtra("androidx.activity.result.contract.extra.PERMISSIONS", paramArrayOfString);
    Intrinsics.OooO0o0(paramArrayOfString, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
    return paramArrayOfString;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion
 * JD-Core Version:    0.7.0.1
 */