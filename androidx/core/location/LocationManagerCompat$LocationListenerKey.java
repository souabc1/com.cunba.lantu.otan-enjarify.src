package androidx.core.location;

import androidx.core.util.ObjectsCompat;

class LocationManagerCompat$LocationListenerKey
{
  public final String OooO00o;
  public final LocationListenerCompat OooO0O0;
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof LocationListenerKey;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (LocationListenerKey)paramObject;
    Object localObject = this.OooO00o;
    String str = paramObject.OooO00o;
    bool1 = ((String)localObject).equals(str);
    if (bool1)
    {
      localObject = this.OooO0O0;
      paramObject = paramObject.OooO0O0;
      boolean bool3 = localObject.equals(paramObject);
      if (bool3) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public int hashCode()
  {
    String str = this.OooO00o;
    LocationListenerCompat localLocationListenerCompat = this.OooO0O0;
    return ObjectsCompat.OooO0O0(new Object[] { str, localLocationListenerCompat });
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationManagerCompat.LocationListenerKey
 * JD-Core Version:    0.7.0.1
 */