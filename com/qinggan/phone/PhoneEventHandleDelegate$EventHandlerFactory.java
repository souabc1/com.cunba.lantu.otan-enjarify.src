package com.qinggan.phone;

import com.qinggan.bus.QGBusEvent;
import m54207b69;

class PhoneEventHandleDelegate$EventHandlerFactory
{
  public BluetoothPhoneHandler OooO00o;
  public QGBusEvent OooO0O0;
  
  public PhoneEventHandleDelegate$EventHandlerFactory(PhoneEventHandleDelegate paramPhoneEventHandleDelegate, QGBusEvent paramQGBusEvent, BluetoothPhoneHandler paramBluetoothPhoneHandler)
  {
    this.OooO00o = paramBluetoothPhoneHandler;
    this.OooO0O0 = paramQGBusEvent;
  }
  
  public PhoneEventHandleDelegate.EventHandler OooO00o()
  {
    Object localObject1 = this.OooO0O0.getEventType();
    int i = ((String)localObject1).hashCode();
    int j = 2;
    int k = 1;
    int m = 4;
    int n = 3;
    Object localObject2;
    boolean bool;
    switch (i)
    {
    default: 
      break;
    case 1742142837: 
      localObject2 = m54207b69.F54207b69_11("~m2E0D030446333228292A2C35");
      bool = ((String)localObject1).equals(localObject2);
      if (bool) {
        bool = j;
      }
      break;
    case 1742139923: 
      localObject2 = m54207b69.F54207b69_11("6P13323E3F8318172324222822");
      bool = ((String)localObject1).equals(localObject2);
      if (bool) {
        bool = k;
      }
      break;
    case 1725756382: 
      localObject2 = m54207b69.F54207b69_11("ZF05080C0D6D1715120B");
      bool = ((String)localObject1).equals(localObject2);
      if (bool) {
        bool = m;
      }
      break;
    case 531655635: 
      localObject2 = m54207b69.F54207b69_11(",'77706A6C660D7A7A6E7C7C7F");
      bool = ((String)localObject1).equals(localObject2);
      if (bool)
      {
        bool = false;
        localObject1 = null;
      }
      break;
    case -1504414183: 
      localObject2 = m54207b69.F54207b69_11("hl2F0E020347283F3F3B38372B2C2D313A433137524C");
      bool = ((String)localObject1).equals(localObject2);
      if (bool) {
        bool = n;
      }
      break;
    }
    int i1 = -1;
    QGBusEvent localQGBusEvent;
    BluetoothPhoneHandler localBluetoothPhoneHandler;
    if (i1 != 0)
    {
      if (i1 != k)
      {
        if (i1 != j)
        {
          if (i1 != n)
          {
            if (i1 != m)
            {
              i1 = 0;
              localObject1 = null;
            }
            else
            {
              localObject1 = new com/qinggan/phone/PhoneEventHandleDelegate$CallTimeHandler;
              localObject2 = this.OooO0OO;
              localQGBusEvent = this.OooO0O0;
              localBluetoothPhoneHandler = this.OooO00o;
              ((PhoneEventHandleDelegate.CallTimeHandler)localObject1).<init>((PhoneEventHandleDelegate)localObject2, localQGBusEvent, localBluetoothPhoneHandler);
            }
          }
          else
          {
            localObject1 = new com/qinggan/phone/PhoneEventHandleDelegate$CallListHandler;
            localObject2 = this.OooO0OO;
            localQGBusEvent = this.OooO0O0;
            localBluetoothPhoneHandler = this.OooO00o;
            ((PhoneEventHandleDelegate.CallListHandler)localObject1).<init>((PhoneEventHandleDelegate)localObject2, localQGBusEvent, localBluetoothPhoneHandler);
          }
        }
        else
        {
          localObject1 = new com/qinggan/phone/PhoneEventHandleDelegate$ReceiveMessageCallLogHandler;
          localObject2 = this.OooO0OO;
          localQGBusEvent = this.OooO0O0;
          localBluetoothPhoneHandler = this.OooO00o;
          ((PhoneEventHandleDelegate.ReceiveMessageCallLogHandler)localObject1).<init>((PhoneEventHandleDelegate)localObject2, localQGBusEvent, localBluetoothPhoneHandler);
        }
      }
      else
      {
        localObject1 = new com/qinggan/phone/PhoneEventHandleDelegate$ReceiveMessageCallingHandler;
        localObject2 = this.OooO0OO;
        localQGBusEvent = this.OooO0O0;
        localBluetoothPhoneHandler = this.OooO00o;
        ((PhoneEventHandleDelegate.ReceiveMessageCallingHandler)localObject1).<init>((PhoneEventHandleDelegate)localObject2, localQGBusEvent, localBluetoothPhoneHandler);
      }
    }
    else
    {
      localObject1 = new com/qinggan/phone/PhoneEventHandleDelegate$ConnectChangedHandler;
      localObject2 = this.OooO0OO;
      localQGBusEvent = this.OooO0O0;
      localBluetoothPhoneHandler = this.OooO00o;
      ((PhoneEventHandleDelegate.ConnectChangedHandler)localObject1).<init>((PhoneEventHandleDelegate)localObject2, localQGBusEvent, localBluetoothPhoneHandler);
    }
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.phone.PhoneEventHandleDelegate.EventHandlerFactory
 * JD-Core Version:    0.7.0.1
 */