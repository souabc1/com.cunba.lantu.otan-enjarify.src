package com.qinggan.bus.impl;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.qinggan.bus.QGBusEvent;
import com.qinggan.bus.QGBusEventFilter;
import m54207b69;

public class ProtocolMessage
{
  public static QGBusEvent OooO00o(Message paramMessage)
  {
    paramMessage = (Bundle)paramMessage.obj;
    Object localObject = QGBusEvent.class.getClassLoader();
    paramMessage.setClassLoader((ClassLoader)localObject);
    localObject = m54207b69.F54207b69_11("h95C505E5A51");
    return (QGBusEvent)paramMessage.getParcelable((String)localObject);
  }
  
  public static boolean OooO0O0(Messenger paramMessenger, Message paramMessage)
  {
    if (paramMessenger != null) {
      try
      {
        paramMessenger.send(paramMessage);
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
        return false;
      }
    }
    return true;
  }
  
  public static Message OooO0OO(QGBusEvent paramQGBusEvent)
  {
    Message localMessage = Message.obtain(null, 3);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str = m54207b69.F54207b69_11("h95C505E5A51");
    localBundle.putParcelable(str, paramQGBusEvent);
    localMessage.obj = localBundle;
    return localMessage;
  }
  
  public static Message OooO0Oo()
  {
    return Message.obtain(null, 5);
  }
  
  public static Message OooO0o(String paramString, QGBusEventFilter paramQGBusEventFilter)
  {
    int i = 1;
    Message localMessage = Message.obtain(null, i);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str1 = m54207b69.F54207b69_11("NI2729262F");
    localBundle.putString(str1, paramString);
    if (paramQGBusEventFilter != null)
    {
      String str2 = "ME232D2B34243C";
      paramString = m54207b69.F54207b69_11(str2);
      paramQGBusEventFilter = paramQGBusEventFilter.getEventList();
      localBundle.putStringArrayList(paramString, paramQGBusEventFilter);
    }
    localMessage.setData(localBundle);
    return localMessage;
  }
  
  public static void OooO0o0(Messenger paramMessenger)
  {
    Message localMessage = Message.obtain(null, 7);
    OooO0O0(paramMessenger, localMessage);
  }
  
  public static Message OooO0oO(String paramString, QGBusEventFilter paramQGBusEventFilter)
  {
    int i = 2;
    Message localMessage = Message.obtain(null, i);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str1 = m54207b69.F54207b69_11("NI2729262F");
    localBundle.putString(str1, paramString);
    if (paramQGBusEventFilter != null)
    {
      String str2 = "ME232D2B34243C";
      paramString = m54207b69.F54207b69_11(str2);
      paramQGBusEventFilter = paramQGBusEventFilter.getEventList();
      localBundle.putStringArrayList(paramString, paramQGBusEventFilter);
    }
    localMessage.setData(localBundle);
    return localMessage;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bus.impl.ProtocolMessage
 * JD-Core Version:    0.7.0.1
 */