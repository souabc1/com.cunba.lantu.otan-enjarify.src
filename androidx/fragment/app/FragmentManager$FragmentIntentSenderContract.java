package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.IntentSenderRequest.Builder;
import androidx.activity.result.contract.ActivityResultContract;

class FragmentManager$FragmentIntentSenderContract
  extends ActivityResultContract
{
  public Intent OooO0Oo(Context paramContext, IntentSenderRequest paramIntentSenderRequest)
  {
    paramContext = new android/content/Intent;
    paramContext.<init>("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
    Object localObject1 = paramIntentSenderRequest.getFillInIntent();
    if (localObject1 != null)
    {
      Object localObject2 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";
      Bundle localBundle = ((Intent)localObject1).getBundleExtra((String)localObject2);
      if (localBundle != null)
      {
        paramContext.putExtra((String)localObject2, localBundle);
        ((Intent)localObject1).removeExtra((String)localObject2);
        localObject2 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
        localBundle = null;
        boolean bool1 = ((Intent)localObject1).getBooleanExtra((String)localObject2, false);
        if (bool1)
        {
          localObject1 = new androidx/activity/result/IntentSenderRequest$Builder;
          localObject2 = paramIntentSenderRequest.getIntentSender();
          ((IntentSenderRequest.Builder)localObject1).<init>((IntentSender)localObject2);
          localObject2 = null;
          localObject1 = ((IntentSenderRequest.Builder)localObject1).OooO0O0(null);
          int i = paramIntentSenderRequest.getFlagsValues();
          int j = paramIntentSenderRequest.getFlagsMask();
          paramIntentSenderRequest = ((IntentSenderRequest.Builder)localObject1).OooO0OO(i, j).OooO00o();
        }
      }
    }
    localObject1 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
    paramContext.putExtra((String)localObject1, paramIntentSenderRequest);
    boolean bool2 = FragmentManager.isLoggingEnabled(2);
    if (bool2)
    {
      paramIntentSenderRequest = new java/lang/StringBuilder;
      paramIntentSenderRequest.<init>();
      localObject1 = "CreateIntent created the following intent: ";
      paramIntentSenderRequest.append((String)localObject1);
      paramIntentSenderRequest.append(paramContext);
    }
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
 * Qualified Name:     androidx.fragment.app.FragmentManager.FragmentIntentSenderContract
 * JD-Core Version:    0.7.0.1
 */