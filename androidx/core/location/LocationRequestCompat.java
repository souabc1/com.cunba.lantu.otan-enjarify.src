package androidx.core.location;

import android.location.LocationRequest;
import android.os.Build.VERSION;
import androidx.core.util.TimeUtils;

public final class LocationRequestCompat
{
  public final int OooO00o;
  public final long OooO0O0;
  public final long OooO0OO;
  public final long OooO0Oo;
  public final float OooO0o;
  public final int OooO0o0;
  public final long OooO0oO;
  
  public LocationRequest OooO00o()
  {
    return LocationRequestCompat.Api31Impl.OooO00o(this);
  }
  
  public LocationRequest OooO0O0(String paramString)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 31;
    if (i >= j) {
      return OooO00o();
    }
    return o00O0O.OooO00o(LocationRequestCompat.Api19Impl.OooO00o(this, paramString));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof LocationRequestCompat;
    if (!bool2) {
      return false;
    }
    paramObject = (LocationRequestCompat)paramObject;
    int i = this.OooO00o;
    int k = paramObject.OooO00o;
    if (i == k)
    {
      long l1 = this.OooO0O0;
      long l2 = paramObject.OooO0O0;
      boolean bool3 = l1 < l2;
      if (!bool3)
      {
        l1 = this.OooO0OO;
        l2 = paramObject.OooO0OO;
        bool3 = l1 < l2;
        if (!bool3)
        {
          l1 = this.OooO0Oo;
          l2 = paramObject.OooO0Oo;
          bool3 = l1 < l2;
          if (!bool3)
          {
            int j = this.OooO0o0;
            k = paramObject.OooO0o0;
            if (j == k)
            {
              float f1 = paramObject.OooO0o;
              float f2 = this.OooO0o;
              j = Float.compare(f1, f2);
              if (j == 0)
              {
                l1 = this.OooO0oO;
                l2 = paramObject.OooO0oO;
                boolean bool4 = l1 < l2;
                if (!bool4) {
                  return bool1;
                }
              }
            }
          }
        }
      }
    }
    bool1 = false;
    return bool1;
  }
  
  public long getDurationMillis()
  {
    return this.OooO0Oo;
  }
  
  public long getIntervalMillis()
  {
    return this.OooO0O0;
  }
  
  public long getMaxUpdateDelayMillis()
  {
    return this.OooO0oO;
  }
  
  public int getMaxUpdates()
  {
    return this.OooO0o0;
  }
  
  public float getMinUpdateDistanceMeters()
  {
    return this.OooO0o;
  }
  
  public long getMinUpdateIntervalMillis()
  {
    long l1 = this.OooO0OO;
    long l2 = -1;
    boolean bool = l1 < l2;
    if (!bool) {
      l1 = this.OooO0O0;
    }
    return l1;
  }
  
  public int getQuality()
  {
    return this.OooO00o;
  }
  
  public int hashCode()
  {
    int i = this.OooO00o * 31;
    long l1 = this.OooO0O0;
    int j = 32;
    long l2 = l1 >>> j;
    int k = (int)(l1 ^ l2);
    i = (i + k) * 31;
    l1 = this.OooO0OO;
    long l3 = l1 >>> j;
    k = (int)(l1 ^ l3);
    return i + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = "Request[";
    localStringBuilder.append(str);
    long l1 = this.OooO0O0;
    long l2 = 9223372036854775807L;
    double d1 = 0.0D / 0.0D;
    boolean bool1 = l1 < l2;
    if (bool1)
    {
      str = "@";
      localStringBuilder.append(str);
      l1 = this.OooO0O0;
      TimeUtils.OooO0o0(l1, localStringBuilder);
      int i = this.OooO00o;
      k = 100;
      if (i != k)
      {
        k = 102;
        if (i != k)
        {
          k = 104;
          if (i != k) {
            break label131;
          }
          str = " LOW_POWER";
        }
        else
        {
          str = " BALANCED";
        }
      }
      else
      {
        str = " HIGH_ACCURACY";
      }
    }
    else
    {
      str = "PASSIVE";
    }
    localStringBuilder.append(str);
    label131:
    l1 = this.OooO0Oo;
    boolean bool2 = l1 < l2;
    if (bool2)
    {
      str = ", duration=";
      localStringBuilder.append(str);
      l1 = this.OooO0Oo;
      TimeUtils.OooO0o0(l1, localStringBuilder);
    }
    int j = this.OooO0o0;
    int k = -1 >>> 1;
    if (j != k)
    {
      str = ", maxUpdates=";
      localStringBuilder.append(str);
      j = this.OooO0o0;
      localStringBuilder.append(j);
    }
    l1 = this.OooO0OO;
    l2 = -1;
    d1 = 0.0D / 0.0D;
    boolean bool4 = l1 < l2;
    if (bool4)
    {
      l2 = this.OooO0O0;
      bool3 = l1 < l2;
      if (bool3)
      {
        str = ", minUpdateInterval=";
        localStringBuilder.append(str);
        l1 = this.OooO0OO;
        TimeUtils.OooO0o0(l1, localStringBuilder);
      }
    }
    float f = this.OooO0o;
    double d2 = f;
    l2 = 0L;
    d1 = 0.0D;
    boolean bool3 = d2 < d1;
    if (bool3)
    {
      str = ", minUpdateDistance=";
      localStringBuilder.append(str);
      f = this.OooO0o;
      localStringBuilder.append(f);
    }
    l1 = this.OooO0oO;
    d1 = 9.881312916824931E-324D;
    l1 /= 2;
    l2 = this.OooO0O0;
    bool3 = l1 < l2;
    if (bool3)
    {
      str = ", maxUpdateDelay=";
      localStringBuilder.append(str);
      l1 = this.OooO0oO;
      TimeUtils.OooO0o0(l1, localStringBuilder);
    }
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationRequestCompat
 * JD-Core Version:    0.7.0.1
 */