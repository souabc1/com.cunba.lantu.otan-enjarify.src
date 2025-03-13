package androidx.activity;

import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import androidx.activity.result.ActivityResultRegistry;

class ComponentActivity$2$2
  implements Runnable
{
  public ComponentActivity$2$2(ComponentActivity.2 param2, int paramInt, IntentSender.SendIntentException paramSendIntentException) {}
  
  public void run()
  {
    ComponentActivity.2 local2 = this.o00Ooo0;
    int i = this.o00OoOoo;
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    localIntent = localIntent.setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
    IntentSender.SendIntentException localSendIntentException = this.o00Ooo00;
    localIntent = localIntent.putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", localSendIntentException);
    local2.OooO0O0(i, 0, localIntent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.ComponentActivity.2.2
 * JD-Core Version:    0.7.0.1
 */