package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;

public final class IntentSenderRequest$Builder
{
  public final IntentSender OooO00o;
  public Intent OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  
  public IntentSenderRequest$Builder(IntentSender paramIntentSender)
  {
    this.OooO00o = paramIntentSender;
  }
  
  public final IntentSenderRequest OooO00o()
  {
    IntentSenderRequest localIntentSenderRequest = new androidx/activity/result/IntentSenderRequest;
    IntentSender localIntentSender = this.OooO00o;
    Intent localIntent = this.OooO0O0;
    int i = this.OooO0OO;
    int j = this.OooO0Oo;
    localIntentSenderRequest.<init>(localIntentSender, localIntent, i, j);
    return localIntentSenderRequest;
  }
  
  public final Builder OooO0O0(Intent paramIntent)
  {
    this.OooO0O0 = paramIntent;
    return this;
  }
  
  public final Builder OooO0OO(int paramInt1, int paramInt2)
  {
    this.OooO0Oo = paramInt1;
    this.OooO0OO = paramInt2;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.IntentSenderRequest.Builder
 * JD-Core Version:    0.7.0.1
 */