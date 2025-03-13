package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

class ActivityCompat$Api16Impl
{
  public static void OooO00o(Activity paramActivity)
  {
    paramActivity.finishAffinity();
  }
  
  public static void OooO0O0(Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    paramActivity.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  public static void OooO0OO(Activity paramActivity, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    paramActivity.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityCompat.Api16Impl
 * JD-Core Version:    0.7.0.1
 */