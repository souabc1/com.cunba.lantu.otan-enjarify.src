package com.qinggan.navi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import java.util.ArrayList;
import m54207b69;
import org.json.JSONException;
import org.json.JSONObject;

class QGNaviManager$NaviMsgReceiver
  extends BroadcastReceiver
{
  public Handler OooO00o;
  
  public final void OooO00o(JSONObject paramJSONObject)
  {
    Object localObject1 = "h95C505E5A51";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = paramJSONObject.getString((String)localObject1);
      localObject2 = m54207b69.F54207b69_11("jh0F1E030F113C1325150F26421318192C2A");
      boolean bool = ((String)localObject1).equals(localObject2);
      if (bool)
      {
        paramJSONObject = NaviDataParser.OooO00o(paramJSONObject.toString());
        localObject1 = GuideState.o0O00o0;
        if (paramJSONObject != localObject1)
        {
          int j = 0;
          localObject1 = null;
          for (;;)
          {
            localObject2 = this.OooO0O0.OooO0OO;
            int i = ((ArrayList)localObject2).size();
            if (j >= i) {
              break;
            }
            localObject2 = (NaviEventListener)this.OooO0O0.OooO0OO.get(j);
            if (localObject2 != null)
            {
              Handler localHandler = this.OooO00o;
              QGNaviManager.NaviMsgReceiver.2 local2 = new com/qinggan/navi/QGNaviManager$NaviMsgReceiver$2;
              local2.<init>(this, (NaviEventListener)localObject2, paramJSONObject);
              localHandler.post(local2);
            }
            j += 1;
          }
        }
      }
      else
      {
        QGNaviManager.OooO00o();
        paramJSONObject = new java/lang/StringBuilder;
        paramJSONObject.<init>();
        localObject2 = m54207b69.F54207b69_11("ox0D1715191B145E1D21171B6322241A202E126A2C2F21272E2E5B");
        paramJSONObject.append((String)localObject2);
        paramJSONObject.append((String)localObject1);
      }
      return;
    }
    catch (JSONException paramJSONObject)
    {
      QGNaviManager.OooO00o();
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11("p}0D1D11111C3822121C3512231B114A2D2641202D712D1B353026232F2E3065");
      ((StringBuilder)localObject1).append((String)localObject2);
      paramJSONObject = paramJSONObject.getMessage();
      ((StringBuilder)localObject1).append(paramJSONObject);
    }
  }
  
  public final void OooO0O0(JSONObject paramJSONObject)
  {
    Object localObject1 = "CY383B2F333A3C";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = paramJSONObject.getString((String)localObject1);
      localObject2 = "J\\31303D06393D";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      paramJSONObject.getString((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("tU3B35253F0E41413A42");
      int i = ((String)localObject1).equals(localObject2);
      if (i != 0)
      {
        localObject1 = this.OooO0O0.OooO0O0;
        if (localObject1 != null)
        {
          i = ((ArrayList)localObject1).isEmpty();
          if (i == 0)
          {
            paramJSONObject = NaviDataParser.OooO0O0(paramJSONObject.toString());
            i = 0;
            localObject1 = null;
            for (;;)
            {
              localObject2 = this.OooO0O0.OooO0O0;
              int k = ((ArrayList)localObject2).size();
              if (i >= k) {
                break;
              }
              localObject2 = (ResultListener)this.OooO0O0.OooO0O0.get(i);
              if (localObject2 != null)
              {
                Handler localHandler = this.OooO00o;
                QGNaviManager.NaviMsgReceiver.1 local1 = new com/qinggan/navi/QGNaviManager$NaviMsgReceiver$1;
                local1.<init>(this, (ResultListener)localObject2, paramJSONObject);
                localHandler.post(local1);
              }
              int j;
              i += 1;
            }
            paramJSONObject = this.OooO0O0.OooO0O0;
            paramJSONObject.clear();
            break label181;
          }
        }
        QGNaviManager.OooO00o();
      }
      label181:
      return;
    }
    catch (JSONException paramJSONObject)
    {
      QGNaviManager.OooO00o();
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11("p}0D1D11111C3822121C3512231B114A2D2641202D712D1B353026232F2E3065");
      ((StringBuilder)localObject1).append((String)localObject2);
      paramJSONObject = paramJSONObject.getMessage();
      ((StringBuilder)localObject1).append(paramJSONObject);
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = m54207b69.F54207b69_11("Eh180A1C1E114D1F2415231B5315181157172B5A2032221C3360262A2629353A20272774");
    localObject1 = paramIntent.getAction();
    Object localObject2 = m54207b69.F54207b69_11("Z*4E50604E474B");
    localObject2 = paramIntent.getStringExtra((String)localObject2);
    QGNaviManager.OooO00o();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("+a0E10350706090E1E0C4A121A21111D246B");
    localStringBuilder.append(str);
    localStringBuilder.append(paramIntent);
    paramIntent = m54207b69.F54207b69_11("Q)054E4E604C454B1A");
    localStringBuilder.append(paramIntent);
    localStringBuilder.append((String)localObject2);
    paramIntent = new android/os/Handler;
    paramIntent.<init>();
    this.OooO00o = paramIntent;
    try
    {
      paramIntent = new org/json/JSONObject;
      paramIntent.<init>((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("'j090609471E1024160D4D0E162810522A2F202A2658201F18");
      boolean bool1 = ((String)localObject1).equals(localObject2);
      if (!bool1) {
        break label268;
      }
      localObject1 = "J\\31303D06393D";
      try
      {
        localObject1 = m54207b69.F54207b69_11((String)localObject1);
        localObject1 = paramIntent.getString((String)localObject1);
        localObject2 = this.OooO0O0;
        localObject2 = ((QGNaviManager)localObject2).OooO00o;
        boolean bool2 = ((String)localObject1).startsWith((String)localObject2);
        if (!bool2)
        {
          QGNaviManager.OooO00o();
          return;
        }
        localObject1 = "UK38402C42423D";
        localObject1 = m54207b69.F54207b69_11((String)localObject1);
        int i = paramIntent.getInt((String)localObject1);
        if (i != 0)
        {
          QGNaviManager.OooO00o();
          paramIntent = new java/lang/StringBuilder;
          paramIntent.<init>();
          localObject2 = "@C2D23372D67373C2D39436D302E373D88";
          localObject2 = m54207b69.F54207b69_11((String)localObject2);
          paramIntent.append((String)localObject2);
          paramIntent.append(i);
          return;
        }
        OooO0O0(paramIntent);
      }
      catch (JSONException paramIntent)
      {
        QGNaviManager.OooO00o();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
      }
    }
    catch (JSONException paramIntent)
    {
      for (;;)
      {
        boolean bool3;
        QGNaviManager.OooO00o();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
      }
    }
    ((StringBuilder)localObject1).append(paramContext);
    paramContext = paramIntent.getMessage();
    ((StringBuilder)localObject1).append(paramContext);
    return;
    label268:
    paramContext = m54207b69.F54207b69_11("e|1F14135510220E201B5B1C28162260212329272D19");
    bool3 = ((String)localObject1).equals(paramContext);
    if (bool3) {
      OooO00o(paramIntent);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.QGNaviManager.NaviMsgReceiver
 * JD-Core Version:    0.7.0.1
 */