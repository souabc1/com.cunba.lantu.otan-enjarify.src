package com.qinggan.now;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.qinggan.now.common.CarWash;
import com.qinggan.now.common.GasStation;
import com.qinggan.now.common.MaintenanceStation;
import com.qinggan.now.common.ParkingLot;
import com.qinggan.now.common.Poi;
import com.qinggan.now.common.ResultListener;
import java.util.ArrayList;
import m54207b69;
import org.json.JSONException;
import org.json.JSONObject;

class NaviManager$NaviMsgReceiver
  extends BroadcastReceiver
{
  public Handler OooO00o;
  
  public final void OooO00o(ArrayList paramArrayList)
  {
    ArrayList localArrayList = this.OooO0O0.OooO;
    if (localArrayList != null)
    {
      boolean bool = localArrayList.isEmpty();
      if (!bool)
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int i = 0;
        int j = 0;
        Handler localHandler = null;
        Object localObject;
        for (;;)
        {
          int k = paramArrayList.size();
          if (j >= k) {
            break;
          }
          localObject = new com/qinggan/now/common/CarWash;
          Poi localPoi = (Poi)paramArrayList.get(j);
          ((CarWash)localObject).<init>(localPoi);
          localArrayList.add(localObject);
          j += 1;
        }
        for (;;)
        {
          paramArrayList = this.OooO0O0.OooO;
          int m = paramArrayList.size();
          if (i >= m) {
            break;
          }
          paramArrayList = (ResultListener)this.OooO0O0.OooO.get(i);
          if (paramArrayList != null)
          {
            localHandler = this.OooO00o;
            localObject = new com/qinggan/now/NaviManager$NaviMsgReceiver$7;
            ((NaviManager.NaviMsgReceiver.7)localObject).<init>(this, paramArrayList, localArrayList);
            localHandler.post((Runnable)localObject);
          }
          i += 1;
        }
        this.OooO0O0.OooO.clear();
        return;
      }
    }
    NaviManager.OooO00o();
  }
  
  public final void OooO0O0(ArrayList paramArrayList)
  {
    ArrayList localArrayList = this.OooO0O0.OooOO0o;
    if (localArrayList != null)
    {
      boolean bool = localArrayList.isEmpty();
      if (!bool)
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int i = 0;
        int j = 0;
        Handler localHandler = null;
        Object localObject;
        for (;;)
        {
          int k = paramArrayList.size();
          if (j >= k) {
            break;
          }
          localObject = new com/qinggan/now/common/GasStation;
          Poi localPoi = (Poi)paramArrayList.get(j);
          ((GasStation)localObject).<init>(localPoi);
          localArrayList.add(localObject);
          j += 1;
        }
        for (;;)
        {
          paramArrayList = this.OooO0O0.OooOO0o;
          int m = paramArrayList.size();
          if (i >= m) {
            break;
          }
          paramArrayList = (ResultListener)this.OooO0O0.OooOO0o.get(i);
          if (paramArrayList != null)
          {
            localHandler = this.OooO00o;
            localObject = new com/qinggan/now/NaviManager$NaviMsgReceiver$9;
            ((NaviManager.NaviMsgReceiver.9)localObject).<init>(this, paramArrayList, localArrayList);
            localHandler.post((Runnable)localObject);
          }
          i += 1;
        }
        this.OooO0O0.OooOO0o.clear();
        return;
      }
    }
    NaviManager.OooO00o();
  }
  
  public final void OooO0OO(ArrayList paramArrayList)
  {
    ArrayList localArrayList = this.OooO0O0.OooOOoo;
    if (localArrayList != null)
    {
      boolean bool = localArrayList.isEmpty();
      if (!bool)
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int i = 0;
        int j = 0;
        Handler localHandler = null;
        Object localObject;
        for (;;)
        {
          int k = paramArrayList.size();
          if (j >= k) {
            break;
          }
          localObject = new com/qinggan/now/common/MaintenanceStation;
          Poi localPoi = (Poi)paramArrayList.get(j);
          ((MaintenanceStation)localObject).<init>(localPoi);
          localArrayList.add(localObject);
          j += 1;
        }
        for (;;)
        {
          paramArrayList = this.OooO0O0.OooOOoo;
          int m = paramArrayList.size();
          if (i >= m) {
            break;
          }
          paramArrayList = (ResultListener)this.OooO0O0.OooOOoo.get(i);
          if (paramArrayList != null)
          {
            localHandler = this.OooO00o;
            localObject = new com/qinggan/now/NaviManager$NaviMsgReceiver$8;
            ((NaviManager.NaviMsgReceiver.8)localObject).<init>(this, paramArrayList, localArrayList);
            localHandler.post((Runnable)localObject);
          }
          i += 1;
        }
        this.OooO0O0.OooOOoo.clear();
        return;
      }
    }
    NaviManager.OooO00o();
  }
  
  public final void OooO0Oo(ArrayList paramArrayList)
  {
    ArrayList localArrayList = this.OooO0O0.OooOOOO;
    if (localArrayList != null)
    {
      boolean bool = localArrayList.isEmpty();
      if (!bool)
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int i = 0;
        int j = 0;
        Handler localHandler = null;
        Object localObject;
        for (;;)
        {
          int k = paramArrayList.size();
          if (j >= k) {
            break;
          }
          localObject = new com/qinggan/now/common/GasStation;
          Poi localPoi = (Poi)paramArrayList.get(j);
          ((GasStation)localObject).<init>(localPoi);
          localArrayList.add(localObject);
          j += 1;
        }
        for (;;)
        {
          paramArrayList = this.OooO0O0.OooOOOO;
          int m = paramArrayList.size();
          if (i >= m) {
            break;
          }
          paramArrayList = (ResultListener)this.OooO0O0.OooOOOO.get(i);
          if (paramArrayList != null)
          {
            localHandler = this.OooO00o;
            localObject = new com/qinggan/now/NaviManager$NaviMsgReceiver$12;
            ((NaviManager.NaviMsgReceiver.12)localObject).<init>(this, paramArrayList, localArrayList);
            localHandler.post((Runnable)localObject);
          }
          i += 1;
        }
        this.OooO0O0.OooOOOO.clear();
        return;
      }
    }
    NaviManager.OooO00o();
  }
  
  public final void OooO0o(ArrayList paramArrayList)
  {
    ArrayList localArrayList = this.OooO0O0.OooOOo0;
    if (localArrayList != null)
    {
      int i = localArrayList.isEmpty();
      if (i == 0)
      {
        i = 0;
        localArrayList = null;
        for (;;)
        {
          Object localObject = this.OooO0O0.OooOOo0;
          int k = ((ArrayList)localObject).size();
          if (i >= k) {
            break;
          }
          localObject = (ResultListener)this.OooO0O0.OooOOo0.get(i);
          if (localObject != null)
          {
            Handler localHandler = this.OooO00o;
            NaviManager.NaviMsgReceiver.11 local11 = new com/qinggan/now/NaviManager$NaviMsgReceiver$11;
            local11.<init>(this, (ResultListener)localObject, paramArrayList);
            localHandler.post(local11);
          }
          int j;
          i += 1;
        }
        this.OooO0O0.OooOOo0.clear();
        return;
      }
    }
    NaviManager.OooO00o();
  }
  
  public final void OooO0o0(ArrayList paramArrayList)
  {
    ArrayList localArrayList = this.OooO0O0.OooOOOo;
    if (localArrayList != null)
    {
      boolean bool = localArrayList.isEmpty();
      if (!bool)
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int i = 0;
        int j = 0;
        Handler localHandler = null;
        Object localObject;
        for (;;)
        {
          int k = paramArrayList.size();
          if (j >= k) {
            break;
          }
          localObject = new com/qinggan/now/common/ParkingLot;
          Poi localPoi = (Poi)paramArrayList.get(j);
          ((ParkingLot)localObject).<init>(localPoi);
          localArrayList.add(localObject);
          j += 1;
        }
        for (;;)
        {
          paramArrayList = this.OooO0O0.OooOOOo;
          int m = paramArrayList.size();
          if (i >= m) {
            break;
          }
          paramArrayList = (ResultListener)this.OooO0O0.OooOOOo.get(i);
          if (paramArrayList != null)
          {
            localHandler = this.OooO00o;
            localObject = new com/qinggan/now/NaviManager$NaviMsgReceiver$10;
            ((NaviManager.NaviMsgReceiver.10)localObject).<init>(this, paramArrayList, localArrayList);
            localHandler.post((Runnable)localObject);
          }
          i += 1;
        }
        this.OooO0O0.OooOOOo.clear();
        return;
      }
    }
    NaviManager.OooO00o();
  }
  
  public final void OooO0oO(JSONObject paramJSONObject)
  {
    Object localObject1 = "CY383B2F333A3C";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = paramJSONObject.getString((String)localObject1);
      localObject2 = "J\\31303D06393D";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject2 = paramJSONObject.getString((String)localObject2);
      Object localObject3 = m54207b69.F54207b69_11("|[2B3534072C434030403C0E3B4A2F3A433950");
      boolean bool1 = ((String)localObject1).equals(localObject3);
      if (!bool1)
      {
        localObject3 = m54207b69.F54207b69_11("M)594742795E514E62524A80525855695A60");
        bool1 = ((String)localObject1).equals(localObject3);
        if (!bool1)
        {
          localObject3 = m54207b69.F54207b69_11("~b0C081C194106111D231A470E1A1A1A144D211F2A2A1C");
          bool1 = ((String)localObject1).equals(localObject3);
          int i = 0;
          if (bool1)
          {
            localObject1 = this.OooO0O0.OooO0oo;
            if (localObject1 != null)
            {
              boolean bool2 = ((ArrayList)localObject1).isEmpty();
              if (!bool2)
              {
                paramJSONObject = NaviDataParser.OooO00o(paramJSONObject.toString());
                for (;;)
                {
                  localObject1 = this.OooO0O0.OooO0oo;
                  int j = ((ArrayList)localObject1).size();
                  if (i >= j) {
                    break;
                  }
                  localObject1 = (ResultListener)this.OooO0O0.OooO0oo.get(i);
                  if (localObject1 != null)
                  {
                    localObject2 = this.OooO00o;
                    localObject3 = new com/qinggan/now/NaviManager$NaviMsgReceiver$1;
                    ((NaviManager.NaviMsgReceiver.1)localObject3).<init>(this, (ResultListener)localObject1, paramJSONObject);
                    ((Handler)localObject2).post((Runnable)localObject3);
                  }
                  i += 1;
                }
                paramJSONObject = this.OooO0O0.OooO0oo;
              }
            }
          }
          for (;;)
          {
            paramJSONObject.clear();
            break label1277;
            NaviManager.OooO00o();
            return;
            localObject3 = m54207b69.F54207b69_11("r)474D53607A5F52626749545766");
            bool1 = ((String)localObject1).equals(localObject3);
            if (bool1)
            {
              localObject1 = this.OooO0O0.OooOO0O;
              if (localObject1 != null)
              {
                boolean bool3 = ((ArrayList)localObject1).isEmpty();
                if (!bool3)
                {
                  paramJSONObject = NaviDataParser.OooO0oo(paramJSONObject.toString());
                  for (;;)
                  {
                    localObject1 = this.OooO0O0.OooOO0O;
                    int k = ((ArrayList)localObject1).size();
                    if (i >= k) {
                      break;
                    }
                    localObject1 = (ResultListener)this.OooO0O0.OooOO0O.get(i);
                    if (localObject1 != null)
                    {
                      localObject2 = this.OooO00o;
                      localObject3 = new com/qinggan/now/NaviManager$NaviMsgReceiver$2;
                      ((NaviManager.NaviMsgReceiver.2)localObject3).<init>(this, (ResultListener)localObject1, paramJSONObject);
                      ((Handler)localObject2).post((Runnable)localObject3);
                    }
                    i += 1;
                  }
                  paramJSONObject = this.OooO0O0.OooOO0O;
                  continue;
                }
              }
              NaviManager.OooO00o();
            }
            else
            {
              localObject3 = m54207b69.F54207b69_11("tU3B35253F0E41413A42");
              bool1 = ((String)localObject1).equals(localObject3);
              if (bool1)
              {
                localObject1 = this.OooO0O0.OooOOO;
                if (localObject1 != null)
                {
                  boolean bool4 = ((ArrayList)localObject1).isEmpty();
                  if (!bool4)
                  {
                    paramJSONObject = NaviDataParser.OooO0OO(paramJSONObject.toString());
                    for (;;)
                    {
                      localObject1 = this.OooO0O0.OooOOO;
                      int m = ((ArrayList)localObject1).size();
                      if (i >= m) {
                        break;
                      }
                      localObject1 = (ResultListener)this.OooO0O0.OooOOO.get(i);
                      if (localObject1 != null)
                      {
                        localObject2 = this.OooO00o;
                        localObject3 = new com/qinggan/now/NaviManager$NaviMsgReceiver$3;
                        ((NaviManager.NaviMsgReceiver.3)localObject3).<init>(this, (ResultListener)localObject1, paramJSONObject);
                        ((Handler)localObject2).post((Runnable)localObject3);
                      }
                      i += 1;
                    }
                    paramJSONObject = this.OooO0O0.OooOOO;
                    continue;
                  }
                }
                NaviManager.OooO00o();
              }
              else
              {
                localObject3 = m54207b69.F54207b69_11("L3435D5C6F445B58485864766A685D60566A6D6F");
                bool1 = ((String)localObject1).equals(localObject3);
                if (bool1)
                {
                  localObject1 = this.OooO0O0.OooOOo;
                  if (localObject1 != null)
                  {
                    boolean bool5 = ((ArrayList)localObject1).isEmpty();
                    if (!bool5)
                    {
                      paramJSONObject = NaviDataParser.OooO0o(paramJSONObject.toString());
                      for (;;)
                      {
                        localObject1 = this.OooO0O0.OooOOo;
                        int n = ((ArrayList)localObject1).size();
                        if (i >= n) {
                          break;
                        }
                        localObject1 = (ResultListener)this.OooO0O0.OooOOo.get(i);
                        if (localObject1 != null)
                        {
                          localObject2 = this.OooO00o;
                          localObject3 = new com/qinggan/now/NaviManager$NaviMsgReceiver$4;
                          ((NaviManager.NaviMsgReceiver.4)localObject3).<init>(this, (ResultListener)localObject1, paramJSONObject);
                          ((Handler)localObject2).post((Runnable)localObject3);
                        }
                        i += 1;
                      }
                      paramJSONObject = this.OooO0O0.OooOOo;
                      continue;
                    }
                  }
                  NaviManager.OooO00o();
                }
                else
                {
                  localObject3 = m54207b69.F54207b69_11("8s1D170D0A300622191F350A121E14140F");
                  bool1 = ((String)localObject1).equals(localObject3);
                  if (bool1)
                  {
                    localObject1 = this.OooO0O0.OooOOO0;
                    if (localObject1 != null)
                    {
                      boolean bool6 = ((ArrayList)localObject1).isEmpty();
                      if (!bool6)
                      {
                        paramJSONObject = NaviDataParser.OooO0oO(paramJSONObject.toString());
                        for (;;)
                        {
                          localObject1 = this.OooO0O0.OooOOO0;
                          int i1 = ((ArrayList)localObject1).size();
                          if (i >= i1) {
                            break;
                          }
                          localObject1 = (ResultListener)this.OooO0O0.OooOOO0.get(i);
                          if (localObject1 != null)
                          {
                            localObject2 = this.OooO00o;
                            localObject3 = new com/qinggan/now/NaviManager$NaviMsgReceiver$5;
                            ((NaviManager.NaviMsgReceiver.5)localObject3).<init>(this, (ResultListener)localObject1, paramJSONObject);
                            ((Handler)localObject2).post((Runnable)localObject3);
                          }
                          i += 1;
                        }
                        paramJSONObject = this.OooO0O0.OooOOO0;
                        continue;
                      }
                    }
                    NaviManager.OooO00o();
                  }
                  else
                  {
                    localObject3 = m54207b69.F54207b69_11("UX393D37343A0C31444133453B1341454A493D434A4A");
                    bool1 = ((String)localObject1).equals(localObject3);
                    if (!bool1) {
                      break label948;
                    }
                    localObject1 = this.OooO0O0.OooOO0;
                    if (localObject1 == null) {
                      break;
                    }
                    boolean bool7 = ((ArrayList)localObject1).isEmpty();
                    if (bool7) {
                      break;
                    }
                    paramJSONObject = NaviDataParser.OooO00o(paramJSONObject.toString());
                    for (;;)
                    {
                      localObject1 = this.OooO0O0.OooOO0;
                      int i2 = ((ArrayList)localObject1).size();
                      if (i >= i2) {
                        break;
                      }
                      localObject1 = (ResultListener)this.OooO0O0.OooOO0.get(i);
                      if (localObject1 != null)
                      {
                        localObject2 = this.OooO00o;
                        localObject3 = new com/qinggan/now/NaviManager$NaviMsgReceiver$6;
                        ((NaviManager.NaviMsgReceiver.6)localObject3).<init>(this, (ResultListener)localObject1, paramJSONObject);
                        ((Handler)localObject2).post((Runnable)localObject3);
                      }
                      i += 1;
                    }
                    paramJSONObject = this.OooO0O0.OooOO0;
                  }
                }
              }
            }
          }
          NaviManager.OooO00o();
          return;
          label948:
          localObject3 = m54207b69.F54207b69_11("SI272D33401A3E2C2742");
          bool1 = ((String)localObject1).equals(localObject3);
          if (bool1)
          {
            paramJSONObject = NaviDataParser.OooO0Oo(paramJSONObject.toString());
            localObject1 = this.OooO0O0.OooO0o0;
            bool8 = ((String)localObject2).equals(localObject1);
            if (bool8)
            {
              OooO0Oo(paramJSONObject);
              break label1277;
            }
            NaviManager.OooO00o();
            paramJSONObject = new java/lang/StringBuilder;
            paramJSONObject.<init>();
            localObject1 = m54207b69.F54207b69_11("<Z2F353337393280444737843F4B2F3C893A46453C8E504F4878");
            break label1265;
          }
          localObject2 = m54207b69.F54207b69_11("~G34302A331C3C2E353C");
          boolean bool8 = ((String)localObject1).equals(localObject2);
          if (!bool8) {
            break label1277;
          }
          NaviManager.OooO00o();
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = m54207b69.F54207b69_11("c=545B5555535D23555D5B546D595F625D2D6D70691B");
          ((StringBuilder)localObject1).append((String)localObject2);
          paramJSONObject = paramJSONObject.toString();
          ((StringBuilder)localObject1).append(paramJSONObject);
          break label1277;
        }
      }
      paramJSONObject = NaviDataParser.OooO0o(paramJSONObject.toString());
      if (paramJSONObject != null)
      {
        int i3 = paramJSONObject.size();
        if (i3 != 0)
        {
          localObject1 = this.OooO0O0.OooO0O0;
          boolean bool9 = ((String)localObject2).equals(localObject1);
          if (bool9)
          {
            OooO00o(paramJSONObject);
          }
          else
          {
            localObject1 = this.OooO0O0.OooO0Oo;
            bool9 = ((String)localObject2).equals(localObject1);
            if (bool9)
            {
              OooO0OO(paramJSONObject);
            }
            else
            {
              localObject1 = this.OooO0O0.OooO0o;
              bool9 = ((String)localObject2).equals(localObject1);
              if (bool9)
              {
                OooO0o0(paramJSONObject);
              }
              else
              {
                localObject1 = this.OooO0O0.OooO0OO;
                bool9 = ((String)localObject2).equals(localObject1);
                if (bool9)
                {
                  OooO0O0(paramJSONObject);
                }
                else
                {
                  localObject1 = this.OooO0O0.OooO0oO;
                  bool9 = ((String)localObject2).equals(localObject1);
                  if (bool9)
                  {
                    OooO0o(paramJSONObject);
                  }
                  else
                  {
                    NaviManager.OooO00o();
                    paramJSONObject = new java/lang/StringBuilder;
                    paramJSONObject.<init>();
                    localObject1 = m54207b69.F54207b69_11("`V23393F3B3D267C2D414880322F40323E8648475080");
                    label1265:
                    paramJSONObject.append((String)localObject1);
                    paramJSONObject.append((String)localObject2);
                  }
                }
              }
            }
          }
          label1277:
          return;
        }
      }
      NaviManager.OooO00o();
      return;
    }
    catch (JSONException paramJSONObject)
    {
      NaviManager.OooO00o();
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
    NaviManager.OooO00o();
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
        break label275;
      }
      localObject1 = "J\\31303D06393D";
      try
      {
        localObject1 = m54207b69.F54207b69_11((String)localObject1);
        localObject1 = paramIntent.getString((String)localObject1);
        localObject2 = this.OooO0O0;
        localObject2 = ((NaviManager)localObject2).OooO00o;
        boolean bool2 = ((String)localObject1).startsWith((String)localObject2);
        if (!bool2)
        {
          NaviManager.OooO00o();
          return;
        }
        localObject1 = "UK38402C42423D";
        localObject1 = m54207b69.F54207b69_11((String)localObject1);
        int i = paramIntent.getInt((String)localObject1);
        if (i != 0)
        {
          NaviManager.OooO00o();
          paramIntent = new java/lang/StringBuilder;
          paramIntent.<init>();
          localObject2 = "@C2D23372D67373C2D39436D302E373D88";
          localObject2 = m54207b69.F54207b69_11((String)localObject2);
          paramIntent.append((String)localObject2);
          paramIntent.append(i);
          return;
        }
        OooO0oO(paramIntent);
      }
      catch (JSONException paramIntent)
      {
        NaviManager.OooO00o();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
      }
    }
    catch (JSONException paramIntent)
    {
      for (;;)
      {
        NaviManager.OooO00o();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
      }
    }
    ((StringBuilder)localObject1).append(paramContext);
    paramContext = paramIntent.getMessage();
    ((StringBuilder)localObject1).append(paramContext);
    return;
    label275:
    paramContext = m54207b69.F54207b69_11("sX3B3837792C3E32443F7F40443A3E8445473D435135");
    ((String)localObject1).equals(paramContext);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.NaviManager.NaviMsgReceiver
 * JD-Core Version:    0.7.0.1
 */