package androidx.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContract.SynchronousResult;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

class ComponentActivity$2
  extends ActivityResultRegistry
{
  public ComponentActivity$2(ComponentActivity paramComponentActivity) {}
  
  public void OooO0o(int paramInt, ActivityResultContract paramActivityResultContract, Object paramObject, ActivityOptionsCompat paramActivityOptionsCompat)
  {
    ComponentActivity localComponentActivity = this.OooO;
    Object localObject1 = paramActivityResultContract.OooO0O0(localComponentActivity, paramObject);
    if (localObject1 != null)
    {
      paramActivityResultContract = new android/os/Handler;
      paramObject = Looper.getMainLooper();
      paramActivityResultContract.<init>(paramObject);
      paramObject = new androidx/activity/ComponentActivity$2$1;
      paramObject.<init>(this, paramInt, (ActivityResultContract.SynchronousResult)localObject1);
      paramActivityResultContract.post(paramObject);
      return;
    }
    paramActivityResultContract = paramActivityResultContract.OooO00o(localComponentActivity, paramObject);
    paramObject = paramActivityResultContract.getExtras();
    if (paramObject != null)
    {
      paramObject = paramActivityResultContract.getExtras().getClassLoader();
      if (paramObject == null)
      {
        paramObject = localComponentActivity.getClassLoader();
        paramActivityResultContract.setExtrasClassLoader(paramObject);
      }
    }
    paramObject = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";
    boolean bool1 = paramActivityResultContract.hasExtra(paramObject);
    Object localObject2;
    if (bool1)
    {
      paramActivityOptionsCompat = paramActivityResultContract.getBundleExtra(paramObject);
      paramActivityResultContract.removeExtra(paramObject);
      localObject2 = paramActivityOptionsCompat;
    }
    else
    {
      if (paramActivityOptionsCompat != null)
      {
        paramObject = paramActivityOptionsCompat.OooO00o();
      }
      else
      {
        bool2 = false;
        paramObject = null;
      }
      localObject2 = paramObject;
    }
    paramObject = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
    paramActivityOptionsCompat = paramActivityResultContract.getAction();
    boolean bool2 = paramObject.equals(paramActivityOptionsCompat);
    if (bool2)
    {
      paramObject = "androidx.activity.result.contract.extra.PERMISSIONS";
      paramActivityResultContract = paramActivityResultContract.getStringArrayExtra(paramObject);
      if (paramActivityResultContract == null) {
        paramActivityResultContract = new String[0];
      }
      ActivityCompat.OooOOOO(localComponentActivity, paramActivityResultContract, paramInt);
    }
    else
    {
      paramObject = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
      paramActivityOptionsCompat = paramActivityResultContract.getAction();
      bool2 = paramObject.equals(paramActivityOptionsCompat);
      if (bool2)
      {
        paramObject = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        paramActivityResultContract = (IntentSenderRequest)paramActivityResultContract.getParcelableExtra(paramObject);
        try
        {
          localObject1 = paramActivityResultContract.getIntentSender();
          Intent localIntent = paramActivityResultContract.getFillInIntent();
          int i = paramActivityResultContract.getFlagsMask();
          int j = paramActivityResultContract.getFlagsValues();
          ActivityCompat.OooOo00(localComponentActivity, (IntentSender)localObject1, paramInt, localIntent, i, j, 0, (Bundle)localObject2);
        }
        catch (IntentSender.SendIntentException paramActivityResultContract)
        {
          paramObject = new android/os/Handler;
          paramActivityOptionsCompat = Looper.getMainLooper();
          paramObject.<init>(paramActivityOptionsCompat);
          paramActivityOptionsCompat = new androidx/activity/ComponentActivity$2$2;
          paramActivityOptionsCompat.<init>(this, paramInt, paramActivityResultContract);
          paramObject.post(paramActivityOptionsCompat);
        }
      }
      else
      {
        ActivityCompat.OooOOoo(localComponentActivity, paramActivityResultContract, paramInt, (Bundle)localObject2);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.ComponentActivity.2
 * JD-Core Version:    0.7.0.1
 */