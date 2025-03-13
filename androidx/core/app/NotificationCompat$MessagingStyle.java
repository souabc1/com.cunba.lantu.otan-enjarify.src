package androidx.core.app;

import android.app.Notification.MessagingStyle;
import android.app.Notification.MessagingStyle.Message;
import android.app.Notification.Style;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotificationCompat$MessagingStyle
  extends NotificationCompat.Style
{
  public Boolean OooO;
  public final List OooO0o;
  public final List OooO0o0;
  public Person OooO0oO;
  public CharSequence OooO0oo;
  
  public NotificationCompat$MessagingStyle()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0o0 = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0o = localArrayList;
  }
  
  public void OooO00o(Bundle paramBundle)
  {
    super.OooO00o(paramBundle);
    Object localObject1 = this.OooO0oO.getName();
    paramBundle.putCharSequence("android.selfDisplayName", (CharSequence)localObject1);
    localObject1 = this.OooO0oO.OooO0O0();
    paramBundle.putBundle("android.messagingStyleUser", (Bundle)localObject1);
    Object localObject2 = this.OooO0oo;
    paramBundle.putCharSequence("android.hiddenConversationTitle", (CharSequence)localObject2);
    localObject1 = this.OooO0oo;
    if (localObject1 != null)
    {
      localObject1 = this.OooO;
      bool = ((Boolean)localObject1).booleanValue();
      if (bool)
      {
        localObject1 = "android.conversationTitle";
        localObject2 = this.OooO0oo;
        paramBundle.putCharSequence((String)localObject1, (CharSequence)localObject2);
      }
    }
    localObject1 = this.OooO0o0;
    boolean bool = ((List)localObject1).isEmpty();
    if (!bool)
    {
      localObject1 = NotificationCompat.MessagingStyle.Message.OooO00o(this.OooO0o0);
      localObject2 = "android.messages";
      paramBundle.putParcelableArray((String)localObject2, (Parcelable[])localObject1);
    }
    localObject1 = this.OooO0o;
    bool = ((List)localObject1).isEmpty();
    if (!bool)
    {
      localObject1 = NotificationCompat.MessagingStyle.Message.OooO00o(this.OooO0o);
      localObject2 = "android.messages.historic";
      paramBundle.putParcelableArray((String)localObject2, (Parcelable[])localObject1);
    }
    localObject1 = this.OooO;
    if (localObject1 != null)
    {
      localObject2 = "android.isGroupConversation";
      bool = ((Boolean)localObject1).booleanValue();
      paramBundle.putBoolean((String)localObject2, bool);
    }
  }
  
  public void OooO0O0(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    boolean bool1 = isGroupConversation();
    OooO0o(bool1);
    Notification.MessagingStyle localMessagingStyle = new android/app/Notification$MessagingStyle;
    Object localObject = this.OooO0oO.OooO00o();
    localMessagingStyle.<init>((android.app.Person)localObject);
    localObject = this.OooO0o0.iterator();
    boolean bool2;
    Notification.MessagingStyle.Message localMessage;
    for (;;)
    {
      bool2 = ((Iterator)localObject).hasNext();
      if (!bool2) {
        break;
      }
      localMessage = ((NotificationCompat.MessagingStyle.Message)((Iterator)localObject).next()).OooO0O0();
      localMessagingStyle.addMessage(localMessage);
    }
    localObject = this.OooO0o.iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject).hasNext();
      if (!bool2) {
        break;
      }
      localMessage = ((NotificationCompat.MessagingStyle.Message)((Iterator)localObject).next()).OooO0O0();
      localMessagingStyle.addHistoricMessage(localMessage);
    }
    boolean bool3 = this.OooO.booleanValue();
    localObject = this.OooO0oo;
    localMessagingStyle.setConversationTitle((CharSequence)localObject);
    bool3 = this.OooO.booleanValue();
    localMessagingStyle.setGroupConversation(bool3);
    paramNotificationBuilderWithBuilderAccessor = paramNotificationBuilderWithBuilderAccessor.getBuilder();
    localMessagingStyle.setBuilder(paramNotificationBuilderWithBuilderAccessor);
  }
  
  public MessagingStyle OooO0o(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.OooO = localBoolean;
    return this;
  }
  
  public String getClassName()
  {
    return "androidx.core.app.NotificationCompat$MessagingStyle";
  }
  
  public CharSequence getConversationTitle()
  {
    return this.OooO0oo;
  }
  
  public List getHistoricMessages()
  {
    return this.OooO0o;
  }
  
  public List getMessages()
  {
    return this.OooO0o0;
  }
  
  public Person getUser()
  {
    return this.OooO0oO;
  }
  
  public CharSequence getUserDisplayName()
  {
    return this.OooO0oO.getName();
  }
  
  public boolean isGroupConversation()
  {
    Object localObject = this.OooO00o;
    boolean bool = false;
    if (localObject != null)
    {
      localObject = ((NotificationCompat.Builder)localObject).OooO00o.getApplicationInfo();
      int i = ((ApplicationInfo)localObject).targetSdkVersion;
      int j = 28;
      if (i < j)
      {
        localObject = this.OooO;
        if (localObject == null)
        {
          localObject = this.OooO0oo;
          if (localObject != null) {
            bool = true;
          }
          return bool;
        }
      }
    }
    localObject = this.OooO;
    if (localObject != null) {
      bool = ((Boolean)localObject).booleanValue();
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompat.MessagingStyle
 * JD-Core Version:    0.7.0.1
 */