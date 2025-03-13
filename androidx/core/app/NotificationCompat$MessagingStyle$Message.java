package androidx.core.app;

import android.app.Notification.MessagingStyle.Message;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

public final class NotificationCompat$MessagingStyle$Message
{
  public final CharSequence OooO00o;
  public final long OooO0O0;
  public final Person OooO0OO;
  public Bundle OooO0Oo;
  public Uri OooO0o;
  public String OooO0o0;
  
  public static Bundle[] OooO00o(List paramList)
  {
    int i = paramList.size();
    Bundle[] arrayOfBundle = new Bundle[i];
    int j = paramList.size();
    int k = 0;
    while (k < j)
    {
      Bundle localBundle = ((Message)paramList.get(k)).OooO0OO();
      arrayOfBundle[k] = localBundle;
      k += 1;
    }
    return arrayOfBundle;
  }
  
  public Notification.MessagingStyle.Message OooO0O0()
  {
    Object localObject1 = getPerson();
    Notification.MessagingStyle.Message localMessage = new android/app/Notification$MessagingStyle$Message;
    Object localObject2 = getText();
    long l = getTimestamp();
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((Person)localObject1).OooO00o();
    }
    localMessage.<init>((CharSequence)localObject2, l, (android.app.Person)localObject1);
    localObject1 = getDataMimeType();
    if (localObject1 != null)
    {
      localObject1 = getDataMimeType();
      localObject2 = getDataUri();
      localMessage.setData((String)localObject1, (Uri)localObject2);
    }
    return localMessage;
  }
  
  public final Bundle OooO0OO()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject = this.OooO00o;
    String str;
    if (localObject != null)
    {
      str = "text";
      localBundle.putCharSequence(str, (CharSequence)localObject);
    }
    long l = this.OooO0O0;
    localBundle.putLong("time", l);
    localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = ((Person)localObject).getName();
      localBundle.putCharSequence("sender", (CharSequence)localObject);
      localObject = this.OooO0OO.OooO00o();
      str = "sender_person";
      localBundle.putParcelable(str, (Parcelable)localObject);
    }
    localObject = this.OooO0o0;
    if (localObject != null)
    {
      str = "type";
      localBundle.putString(str, (String)localObject);
    }
    localObject = this.OooO0o;
    if (localObject != null)
    {
      str = "uri";
      localBundle.putParcelable(str, (Parcelable)localObject);
    }
    localObject = this.OooO0Oo;
    if (localObject != null)
    {
      str = "extras";
      localBundle.putBundle(str, (Bundle)localObject);
    }
    return localBundle;
  }
  
  public String getDataMimeType()
  {
    return this.OooO0o0;
  }
  
  public Uri getDataUri()
  {
    return this.OooO0o;
  }
  
  public Bundle getExtras()
  {
    return this.OooO0Oo;
  }
  
  public Person getPerson()
  {
    return this.OooO0OO;
  }
  
  public CharSequence getSender()
  {
    Object localObject = this.OooO0OO;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((Person)localObject).getName();
    }
    return localObject;
  }
  
  public CharSequence getText()
  {
    return this.OooO00o;
  }
  
  public long getTimestamp()
  {
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompat.MessagingStyle.Message
 * JD-Core Version:    0.7.0.1
 */