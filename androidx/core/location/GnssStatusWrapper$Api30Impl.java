package androidx.core.location;

import android.location.GnssStatus;

class GnssStatusWrapper$Api30Impl
{
  public static float OooO00o(GnssStatus paramGnssStatus, int paramInt)
  {
    return paramGnssStatus.getBasebandCn0DbHz(paramInt);
  }
  
  public static boolean OooO0O0(GnssStatus paramGnssStatus, int paramInt)
  {
    return paramGnssStatus.hasBasebandCn0DbHz(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.GnssStatusWrapper.Api30Impl
 * JD-Core Version:    0.7.0.1
 */