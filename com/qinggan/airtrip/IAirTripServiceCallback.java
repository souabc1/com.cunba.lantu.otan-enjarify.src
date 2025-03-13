package com.qinggan.airtrip;

import android.os.IInterface;
import com.qinggan.airtrip.bean.Airport;
import com.qinggan.airtrip.bean.FlightInfoByCode;
import com.qinggan.airtrip.bean.FlightSeatsInfo;
import com.qinggan.airtrip.bean.Message;
import com.qinggan.airtrip.bean.PersonalFlightInfo;
import com.qinggan.airtrip.bean.SelectSeatResult;
import com.qinggan.airtrip.bean.SubscribeResult;
import com.qinggan.airtrip.bean.SubscribedListInfo;
import com.qinggan.airtrip.bean.User;
import java.util.List;

public abstract interface IAirTripServiceCallback
  extends IInterface
{
  public abstract void OooOo0o(User paramUser);
  
  public abstract void o0000O0(List paramList);
  
  public abstract void o0000o0o(SelectSeatResult paramSelectSeatResult);
  
  public abstract void o000OO0O(SubscribeResult paramSubscribeResult);
  
  public abstract void o000oo00(FlightInfoByCode paramFlightInfoByCode);
  
  public abstract void o00O0oO(Message paramMessage);
  
  public abstract void o00o0O0O(List paramList);
  
  public abstract void o00oO0o(String paramString);
  
  public abstract void o00oOO(SubscribeResult paramSubscribeResult);
  
  public abstract void o00ooo0O(boolean paramBoolean, String paramString1, String paramString2);
  
  public abstract void o0OO0oOo(FlightSeatsInfo paramFlightSeatsInfo);
  
  public abstract void o0OOo0oo(List paramList);
  
  public abstract void o0Oo0o00(Airport paramAirport);
  
  public abstract void o0OoO0o(PersonalFlightInfo paramPersonalFlightInfo);
  
  public abstract void o0oOo0o0(SubscribedListInfo paramSubscribedListInfo);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.IAirTripServiceCallback
 * JD-Core Version:    0.7.0.1
 */