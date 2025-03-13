package com.qinggan.airtrip;

import android.os.IInterface;
import com.qinggan.airtrip.bean.Airport;
import com.qinggan.airtrip.bean.AirportSearchInfo;
import com.qinggan.airtrip.bean.CheckinResult;
import com.qinggan.airtrip.bean.FlightInfoByCode;
import com.qinggan.airtrip.bean.FlightListInfo;
import com.qinggan.airtrip.bean.FlightPathInfo;
import com.qinggan.airtrip.bean.PersonalFlight;
import com.qinggan.airtrip.bean.PersonalFlightInfo;
import com.qinggan.airtrip.bean.SearchInfo;
import com.qinggan.airtrip.bean.SeatInfoRequestParam;
import com.qinggan.airtrip.bean.SeatSelectRequestParam;
import com.qinggan.airtrip.bean.SubscribeResult;
import com.qinggan.airtrip.bean.SubscribedListInfo;
import java.util.List;

public abstract interface IAirTripService
  extends IInterface
{
  public abstract void OooOOOO();
  
  public abstract boolean isLogin();
  
  public abstract SubscribedListInfo o0000();
  
  public abstract void o0000oOo(String paramString, IAirTripServiceCallback paramIAirTripServiceCallback);
  
  public abstract void o000OOo0(SeatSelectRequestParam paramSeatSelectRequestParam, IAirTripServiceCallback paramIAirTripServiceCallback);
  
  public abstract void o00O0oOo(IAirTripServiceCallback paramIAirTripServiceCallback);
  
  public abstract PersonalFlightInfo o00OO00o(boolean paramBoolean);
  
  public abstract void o00OOO0(PersonalFlight paramPersonalFlight, boolean paramBoolean, IAirTripServiceCallback paramIAirTripServiceCallback);
  
  public abstract List o00OOOO();
  
  public abstract SubscribeResult o00OoOOO(String paramString);
  
  public abstract FlightListInfo o00OoOoO(SearchInfo paramSearchInfo, boolean paramBoolean);
  
  public abstract void o00oOo0O();
  
  public abstract FlightPathInfo o00oo0OO(SearchInfo paramSearchInfo);
  
  public abstract FlightInfoByCode o00oo0Oo(SearchInfo paramSearchInfo, boolean paramBoolean);
  
  public abstract void o00oo0oO(IAirTripServiceCallback paramIAirTripServiceCallback);
  
  public abstract void o0O000(IAirTripServiceCallback paramIAirTripServiceCallback);
  
  public abstract boolean o0O0000O(IAirTripServiceCallback paramIAirTripServiceCallback);
  
  public abstract void o0O0000o(SearchInfo paramSearchInfo, boolean paramBoolean, IAirTripServiceCallback paramIAirTripServiceCallback);
  
  public abstract PersonalFlightInfo o0O00o00();
  
  public abstract CheckinResult o0O0o0O(PersonalFlight paramPersonalFlight, boolean paramBoolean);
  
  public abstract void o0O0oOo(SearchInfo paramSearchInfo, boolean paramBoolean, IAirTripServiceCallback paramIAirTripServiceCallback);
  
  public abstract SubscribeResult o0O0oOo0(String paramString1, String paramString2, String paramString3, String paramString4);
  
  public abstract void o0O0oo(SeatInfoRequestParam paramSeatInfoRequestParam, IAirTripServiceCallback paramIAirTripServiceCallback);
  
  public abstract void o0O0ooo0(String paramString1, String paramString2, String paramString3, String paramString4, IAirTripServiceCallback paramIAirTripServiceCallback);
  
  public abstract boolean o0OOO00o(IAirTripServiceCallback paramIAirTripServiceCallback);
  
  public abstract List o0OOOOOO();
  
  public abstract void o0OOOOOo(IAirTripServiceCallback paramIAirTripServiceCallback);
  
  public abstract Airport o0Oo0(AirportSearchInfo paramAirportSearchInfo);
  
  public abstract void o0Oo0OoO(AirportSearchInfo paramAirportSearchInfo, IAirTripServiceCallback paramIAirTripServiceCallback);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.IAirTripService
 * JD-Core Version:    0.7.0.1
 */