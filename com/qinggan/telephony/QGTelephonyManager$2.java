package com.qinggan.telephony;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

class QGTelephonyManager$2
  extends PhoneStateListener
{
  public void onCallForwardingIndicatorChanged(boolean paramBoolean) {}
  
  public void onCallStateChanged(int paramInt, String paramString)
  {
    Iterator localIterator = QGTelephonyManager.OooO0O0(this.OooO00o).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      QGPhoneStateListener localQGPhoneStateListener = (QGPhoneStateListener)localIterator.next();
      if (localQGPhoneStateListener != null) {
        localQGPhoneStateListener.OooO00o(paramInt, paramString);
      }
    }
  }
  
  public void onCellInfoChanged(List paramList) {}
  
  public void onCellLocationChanged(CellLocation paramCellLocation) {}
  
  public void onDataActivity(int paramInt) {}
  
  public void onDataConnectionStateChanged(int paramInt)
  {
    Iterator localIterator = QGTelephonyManager.OooO0O0(this.OooO00o).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      QGPhoneStateListener localQGPhoneStateListener = (QGPhoneStateListener)localIterator.next();
      if (localQGPhoneStateListener != null) {
        localQGPhoneStateListener.Oooo0o(paramInt, 0);
      }
    }
  }
  
  public void onDataConnectionStateChanged(int paramInt1, int paramInt2)
  {
    Iterator localIterator = QGTelephonyManager.OooO0O0(this.OooO00o).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      QGPhoneStateListener localQGPhoneStateListener = (QGPhoneStateListener)localIterator.next();
      if (localQGPhoneStateListener != null) {
        localQGPhoneStateListener.Oooo0o(paramInt1, paramInt2);
      }
    }
  }
  
  public void onMessageWaitingIndicatorChanged(boolean paramBoolean) {}
  
  public void onServiceStateChanged(ServiceState paramServiceState) {}
  
  public void onSignalStrengthChanged(int paramInt) {}
  
  public void onSignalStrengthsChanged(SignalStrength paramSignalStrength)
  {
    try
    {
      Object localObject1 = this.OooO00o;
      localObject1 = QGTelephonyManager.OooO0OO((QGTelephonyManager)localObject1);
      if (localObject1 != null)
      {
        localObject1 = this.OooO00o;
        localObject1 = QGTelephonyManager.OooO0O0((QGTelephonyManager)localObject1);
        localObject1 = ((List)localObject1).iterator();
        for (;;)
        {
          boolean bool = ((Iterator)localObject1).hasNext();
          if (!bool) {
            break;
          }
          Object localObject2 = ((Iterator)localObject1).next();
          localObject2 = (QGPhoneStateListener)localObject2;
          if (localObject2 != null)
          {
            Object localObject3 = this.OooO00o;
            localObject3 = QGTelephonyManager.OooO0OO((QGTelephonyManager)localObject3);
            Object[] arrayOfObject = null;
            arrayOfObject = new Object[0];
            localObject3 = ((Method)localObject3).invoke(paramSignalStrength, arrayOfObject);
            localObject3 = (Integer)localObject3;
            int i = ((Integer)localObject3).intValue();
            ((QGPhoneStateListener)localObject2).o00Oo0(i);
          }
        }
        paramSignalStrength.printStackTrace();
      }
    }
    catch (InvocationTargetException paramSignalStrength) {}catch (IllegalAccessException paramSignalStrength) {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.telephony.QGTelephonyManager.2
 * JD-Core Version:    0.7.0.1
 */