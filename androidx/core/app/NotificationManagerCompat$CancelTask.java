package androidx.core.app;

import android.support.v4.app.INotificationSideChannel;

class NotificationManagerCompat$CancelTask
  implements NotificationManagerCompat.Task
{
  public final String OooO00o;
  public final int OooO0O0;
  public final String OooO0OO;
  public final boolean OooO0Oo;
  
  public void OooO00o(INotificationSideChannel paramINotificationSideChannel)
  {
    boolean bool = this.OooO0Oo;
    String str1;
    if (bool)
    {
      str1 = this.OooO00o;
      paramINotificationSideChannel.o00O0oo(str1);
    }
    else
    {
      str1 = this.OooO00o;
      int i = this.OooO0O0;
      String str2 = this.OooO0OO;
      paramINotificationSideChannel.o00ooo00(str1, i, str2);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("CancelTask[");
    localStringBuilder.append("packageName:");
    String str = this.OooO00o;
    localStringBuilder.append(str);
    localStringBuilder.append(", id:");
    int i = this.OooO0O0;
    localStringBuilder.append(i);
    localStringBuilder.append(", tag:");
    str = this.OooO0OO;
    localStringBuilder.append(str);
    localStringBuilder.append(", all:");
    boolean bool = this.OooO0Oo;
    localStringBuilder.append(bool);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationManagerCompat.CancelTask
 * JD-Core Version:    0.7.0.1
 */