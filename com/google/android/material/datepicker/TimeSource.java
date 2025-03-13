package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

class TimeSource
{
  private static final TimeSource SYSTEM_TIME_SOURCE;
  private final Long fixedTimeMs;
  private final TimeZone fixedTimeZone;
  
  static
  {
    TimeSource localTimeSource = new com/google/android/material/datepicker/TimeSource;
    localTimeSource.<init>(null, null);
    SYSTEM_TIME_SOURCE = localTimeSource;
  }
  
  private TimeSource(Long paramLong, TimeZone paramTimeZone)
  {
    this.fixedTimeMs = paramLong;
    this.fixedTimeZone = paramTimeZone;
  }
  
  public static TimeSource fixed(long paramLong)
  {
    TimeSource localTimeSource = new com/google/android/material/datepicker/TimeSource;
    Long localLong = Long.valueOf(paramLong);
    localTimeSource.<init>(localLong, null);
    return localTimeSource;
  }
  
  public static TimeSource fixed(long paramLong, TimeZone paramTimeZone)
  {
    TimeSource localTimeSource = new com/google/android/material/datepicker/TimeSource;
    Long localLong = Long.valueOf(paramLong);
    localTimeSource.<init>(localLong, paramTimeZone);
    return localTimeSource;
  }
  
  public static TimeSource system()
  {
    return SYSTEM_TIME_SOURCE;
  }
  
  public Calendar now()
  {
    TimeZone localTimeZone = this.fixedTimeZone;
    return now(localTimeZone);
  }
  
  public Calendar now(TimeZone paramTimeZone)
  {
    if (paramTimeZone == null) {
      paramTimeZone = Calendar.getInstance();
    } else {
      paramTimeZone = Calendar.getInstance(paramTimeZone);
    }
    Long localLong = this.fixedTimeMs;
    if (localLong != null)
    {
      long l = localLong.longValue();
      paramTimeZone.setTimeInMillis(l);
    }
    return paramTimeZone;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.TimeSource
 * JD-Core Version:    0.7.0.1
 */