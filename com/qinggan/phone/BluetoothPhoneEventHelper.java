package com.qinggan.phone;

import com.qinggan.bus.QGBus;
import com.qinggan.bus.QGBusEventFilter;
import com.qinggan.bus.QGBusEventHandler;
import java.util.HashSet;
import m54207b69;

public class BluetoothPhoneEventHelper
{
  public HashSet OooO00o;
  public PhoneEventHandleDelegate OooO0O0;
  public QGBus OooO0OO;
  public QGBusEventHandler OooO0Oo;
  
  public final void OooO0OO()
  {
    QGBusEventFilter localQGBusEventFilter = new com/qinggan/bus/QGBusEventFilter;
    localQGBusEventFilter.<init>();
    Object localObject1 = m54207b69.F54207b69_11("ZF05080C0D6D1715120B");
    localQGBusEventFilter.OooO00o((String)localObject1);
    Object localObject2 = m54207b69.F54207b69_11(",'77706A6C660D7A7A6E7C7C7F");
    localQGBusEventFilter.OooO00o((String)localObject2);
    localObject2 = m54207b69.F54207b69_11("6P13323E3F8318172324222822");
    localQGBusEventFilter.OooO00o((String)localObject2);
    localObject2 = m54207b69.F54207b69_11("~m2E0D030446333228292A2C35");
    localQGBusEventFilter.OooO00o((String)localObject2);
    localObject2 = m54207b69.F54207b69_11("hl2F0E020347283F3F3B38372B2C2D313A433137524C");
    localQGBusEventFilter.OooO00o((String)localObject2);
    localQGBusEventFilter.OooO00o((String)localObject1);
    localObject1 = this.OooO0OO;
    localObject2 = this.OooO0Oo;
    ((QGBus)localObject1).OooO0O0(localQGBusEventFilter, (QGBusEventHandler)localObject2);
  }
  
  public void setBluetoothPhoneHandler(BluetoothPhoneHandler paramBluetoothPhoneHandler)
  {
    if (paramBluetoothPhoneHandler == null) {
      return;
    }
    HashSet localHashSet = this.OooO00o;
    if (localHashSet != null)
    {
      boolean bool = localHashSet.isEmpty();
      if (bool)
      {
        localHashSet = this.OooO00o;
        localHashSet.add(paramBluetoothPhoneHandler);
        OooO0OO();
        return;
      }
    }
    localHashSet = this.OooO00o;
    if (localHashSet != null) {
      localHashSet.add(paramBluetoothPhoneHandler);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.phone.BluetoothPhoneEventHelper
 * JD-Core Version:    0.7.0.1
 */