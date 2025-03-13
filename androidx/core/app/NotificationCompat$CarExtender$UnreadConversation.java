package androidx.core.app;

import android.app.PendingIntent;

public class NotificationCompat$CarExtender$UnreadConversation
{
  public final String[] OooO00o;
  public final RemoteInput OooO0O0;
  public final PendingIntent OooO0OO;
  public final PendingIntent OooO0Oo;
  public final long OooO0o;
  public final String[] OooO0o0;
  
  public long getLatestTimestamp()
  {
    return this.OooO0o;
  }
  
  public String[] getMessages()
  {
    return this.OooO00o;
  }
  
  public String getParticipant()
  {
    Object localObject = this.OooO0o0;
    int i = localObject.length;
    if (i > 0)
    {
      i = 0;
      localObject = localObject[0];
    }
    else
    {
      localObject = null;
    }
    return localObject;
  }
  
  public String[] getParticipants()
  {
    return this.OooO0o0;
  }
  
  public PendingIntent getReadPendingIntent()
  {
    return this.OooO0Oo;
  }
  
  public RemoteInput getRemoteInput()
  {
    return this.OooO0O0;
  }
  
  public PendingIntent getReplyPendingIntent()
  {
    return this.OooO0OO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompat.CarExtender.UnreadConversation
 * JD-Core Version:    0.7.0.1
 */