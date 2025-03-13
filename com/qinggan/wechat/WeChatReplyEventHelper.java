package com.qinggan.wechat;

import android.os.BaseBundle;
import android.os.Bundle;
import com.qinggan.bus.QGBus;
import com.qinggan.bus.QGBusEvent;
import com.qinggan.bus.QGBusEventFilter;
import com.qinggan.bus.QGBusEventHandler;
import com.qinggan.util.Log;
import m54207b69;

public class WeChatReplyEventHelper
{
  public QGBus OooO00o;
  public QGBusEventHandler OooO0O0;
  public WeChatReplyEventHelper.WeChatReplyEventHandler OooO0OO;
  
  public final boolean OooO0Oo(QGBusEvent paramQGBusEvent)
  {
    String str = paramQGBusEvent.getEventType();
    Object localObject = m54207b69.F54207b69_11("O,7B4A7147515D096C826C71786D8C79");
    boolean bool = ((String)localObject).equals(str);
    if (!bool)
    {
      paramQGBusEvent = m54207b69.F54207b69_11("946352795F59456C584C61577C4E5E684F8C626A57655B");
      str = m54207b69.F54207b69_11(">d4534032A100A1652353B353A3136453254271323252B20");
      Log.OooO00o(paramQGBusEvent, str);
      return false;
    }
    paramQGBusEvent = paramQGBusEvent.getData();
    bool = true;
    if (paramQGBusEvent == null) {
      return bool;
    }
    localObject = Contact.class.getClassLoader();
    paramQGBusEvent.setClassLoader((ClassLoader)localObject);
    return bool;
  }
  
  public final void OooO0o()
  {
    Object localObject1 = this.OooO00o;
    if (localObject1 != null)
    {
      localObject1 = new com/qinggan/bus/QGBusEventFilter;
      ((QGBusEventFilter)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11("qE122108302836701E081E1327142310");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("O,7B4A7147515D096C826C71786D8C79");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = this.OooO00o;
      QGBusEventHandler localQGBusEventHandler = this.OooO0O0;
      ((QGBus)localObject2).OooO0O0((QGBusEventFilter)localObject1, localQGBusEventHandler);
    }
  }
  
  public final boolean OooO0o0(QGBusEvent paramQGBusEvent)
  {
    String str = paramQGBusEvent.getEventType();
    Object localObject1 = m54207b69.F54207b69_11("qE122108302836701E081E1327142310");
    boolean bool = ((String)localObject1).equals(str);
    if (!bool)
    {
      paramQGBusEvent = m54207b69.F54207b69_11("946352795F59456C584C61577C4E5E684F8C626A57655B");
      str = m54207b69.F54207b69_11("qG66112407332B396F1D0B21162A17220F77463446464A3F");
      Log.OooO00o(paramQGBusEvent, str);
      return false;
    }
    paramQGBusEvent = paramQGBusEvent.getData();
    bool = true;
    if (paramQGBusEvent == null) {
      return bool;
    }
    localObject1 = Contact.class.getClassLoader();
    paramQGBusEvent.setClassLoader((ClassLoader)localObject1);
    localObject1 = new com/qinggan/wechat/WeChatReplyMsgInfo;
    ((WeChatReplyMsgInfo)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("wP3340402735382A");
    localObject2 = (Contact)paramQGBusEvent.getParcelable((String)localObject2);
    ((WeChatReplyMsgInfo)localObject1).setContact((Contact)localObject2);
    localObject2 = m54207b69.F54207b69_11("2@3226322F3D0835353C2E383F");
    paramQGBusEvent = paramQGBusEvent.getString((String)localObject2);
    ((WeChatReplyMsgInfo)localObject1).setReplyContent(paramQGBusEvent);
    this.OooO0OO.OooO00o((WeChatReplyMsgInfo)localObject1);
    return bool;
  }
  
  public final void OooO0oO()
  {
    Object localObject1 = this.OooO00o;
    if (localObject1 != null)
    {
      localObject1 = new com/qinggan/bus/QGBusEventFilter;
      ((QGBusEventFilter)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11("qE122108302836701E081E1327142310");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("O,7B4A7147515D096C826C71786D8C79");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = this.OooO00o;
      ((QGBus)localObject2).OooO0OO((QGBusEventFilter)localObject1);
    }
  }
  
  public void setWeChatReplyEventHandler(WeChatReplyEventHelper.WeChatReplyEventHandler paramWeChatReplyEventHandler)
  {
    WeChatReplyEventHelper.WeChatReplyEventHandler localWeChatReplyEventHandler = this.OooO0OO;
    if (paramWeChatReplyEventHandler == null)
    {
      if (localWeChatReplyEventHandler != null) {
        OooO0oO();
      }
    }
    else if (localWeChatReplyEventHandler == null) {
      OooO0o();
    }
    this.OooO0OO = paramWeChatReplyEventHandler;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.WeChatReplyEventHelper
 * JD-Core Version:    0.7.0.1
 */