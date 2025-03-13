package com.qinggan.wechat;

import android.os.BaseBundle;
import android.os.Bundle;
import com.qinggan.bus.QGBus;
import com.qinggan.bus.QGBusEvent;
import com.qinggan.bus.QGBusEventFilter;
import com.qinggan.bus.QGBusEventHandler;
import com.qinggan.util.Log;
import m54207b69;

public class WeChatEventHelper
{
  public QGBus OooO00o;
  public QGBusEventHandler OooO0O0;
  public WeChatEventHelper.WeChatEventHandler OooO0OO;
  
  public final boolean OooO0OO(QGBusEvent paramQGBusEvent)
  {
    String str = paramQGBusEvent.getEventType();
    Object localObject1 = m54207b69.F54207b69_11("(16655745C544A24867C6F866D82");
    boolean bool = ((String)localObject1).equals(str);
    if (!bool)
    {
      paramQGBusEvent = m54207b69.F54207b69_11("{?685B7E5A62508050625A558266605D695D");
      str = m54207b69.F54207b69_11("e:1B6E617C5660541C7C887782758A28576F5F615B68");
      Log.OooO00o(paramQGBusEvent, str);
      return false;
    }
    paramQGBusEvent = paramQGBusEvent.getData();
    bool = true;
    if (paramQGBusEvent == null) {
      return bool;
    }
    localObject1 = MessageChat.class.getClassLoader();
    paramQGBusEvent.setClassLoader((ClassLoader)localObject1);
    localObject1 = new com/qinggan/wechat/WeChatNewMsgInfo;
    ((WeChatNewMsgInfo)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("wP3340402735382A");
    localObject2 = (Contact)paramQGBusEvent.getParcelable((String)localObject2);
    ((WeChatNewMsgInfo)localObject1).setContact((Contact)localObject2);
    localObject2 = m54207b69.F54207b69_11("Wf0B0417180B0609");
    localObject2 = (MessageChat)paramQGBusEvent.getParcelable((String)localObject2);
    ((WeChatNewMsgInfo)localObject1).setMsg((MessageChat)localObject2);
    localObject2 = m54207b69.F54207b69_11("NB24312F320532333033303B");
    localObject2 = paramQGBusEvent.getString((String)localObject2);
    ((WeChatNewMsgInfo)localObject1).setFromCookies((String)localObject2);
    localObject2 = m54207b69.F54207b69_11("D?52477E5354595C6154");
    localObject2 = paramQGBusEvent.getString((String)localObject2);
    ((WeChatNewMsgInfo)localObject1).setMyCookies((String)localObject2);
    localObject2 = m54207b69.F54207b69_11("hD22372D2C10262B27193F32");
    localObject2 = paramQGBusEvent.getString((String)localObject2);
    ((WeChatNewMsgInfo)localObject1).setFromHeadImageUrl((String)localObject2);
    localObject2 = m54207b69.F54207b69_11("|r1F0C3C1A171B2D0726");
    paramQGBusEvent = paramQGBusEvent.getString((String)localObject2);
    ((WeChatNewMsgInfo)localObject1).setMyHeadImageUrl(paramQGBusEvent);
    this.OooO0OO.OooO00o((WeChatNewMsgInfo)localObject1);
    return bool;
  }
  
  public final void OooO0Oo()
  {
    Object localObject1 = this.OooO00o;
    if (localObject1 != null)
    {
      localObject1 = new com/qinggan/bus/QGBusEventFilter;
      ((QGBusEventFilter)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11("(16655745C544A24867C6F866D82");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = this.OooO00o;
      QGBusEventHandler localQGBusEventHandler = this.OooO0O0;
      ((QGBus)localObject2).OooO0O0((QGBusEventFilter)localObject1, localQGBusEventHandler);
    }
  }
  
  public final void OooO0o0()
  {
    Object localObject1 = this.OooO00o;
    if (localObject1 != null)
    {
      localObject1 = new com/qinggan/bus/QGBusEventFilter;
      ((QGBusEventFilter)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11("(16655745C544A24867C6F866D82");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = this.OooO00o;
      ((QGBus)localObject2).OooO0OO((QGBusEventFilter)localObject1);
    }
  }
  
  public void setWeChatEventHandler(WeChatEventHelper.WeChatEventHandler paramWeChatEventHandler)
  {
    WeChatEventHelper.WeChatEventHandler localWeChatEventHandler = this.OooO0OO;
    if (paramWeChatEventHandler == null)
    {
      if (localWeChatEventHandler != null) {
        OooO0o0();
      }
    }
    else if (localWeChatEventHandler == null) {
      OooO0Oo();
    }
    this.OooO0OO = paramWeChatEventHandler;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.WeChatEventHelper
 * JD-Core Version:    0.7.0.1
 */