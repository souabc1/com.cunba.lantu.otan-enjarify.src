package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

final class LocalBroadcastManager$ReceiverRecord
{
  public final IntentFilter OooO00o;
  public final BroadcastReceiver OooO0O0;
  public boolean OooO0OO;
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    localStringBuilder.append("Receiver{");
    Object localObject = this.OooO0O0;
    localStringBuilder.append(localObject);
    localStringBuilder.append(" filter=");
    localObject = this.OooO00o;
    localStringBuilder.append(localObject);
    boolean bool = this.OooO0OO;
    if (bool)
    {
      localObject = " DEAD";
      localStringBuilder.append((String)localObject);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord
 * JD-Core Version:    0.7.0.1
 */