package com.google.android.material.datepicker;

import android.content.Context;
import androidx.core.util.Pair;
import com.google.android.material.R.string;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class DateStrings
{
  public static Pair getDateRangeString(Long paramLong1, Long paramLong2)
  {
    return getDateRangeString(paramLong1, paramLong2, null);
  }
  
  public static Pair getDateRangeString(Long paramLong1, Long paramLong2, SimpleDateFormat paramSimpleDateFormat)
  {
    Object localObject = null;
    if ((paramLong1 == null) && (paramLong2 == null)) {
      return Pair.OooO00o(null, null);
    }
    if (paramLong1 == null)
    {
      paramLong1 = getDateString(paramLong2.longValue(), paramSimpleDateFormat);
      return Pair.OooO00o(null, paramLong1);
    }
    if (paramLong2 == null) {
      return Pair.OooO00o(getDateString(paramLong1.longValue(), paramSimpleDateFormat), null);
    }
    localObject = UtcDates.getTodayCalendar();
    Calendar localCalendar1 = UtcDates.getUtcCalendar();
    long l1 = paramLong1.longValue();
    localCalendar1.setTimeInMillis(l1);
    Calendar localCalendar2 = UtcDates.getUtcCalendar();
    long l2 = paramLong2.longValue();
    localCalendar2.setTimeInMillis(l2);
    if (paramSimpleDateFormat != null)
    {
      localObject = new java/util/Date;
      long l3 = paramLong1.longValue();
      ((Date)localObject).<init>(l3);
      paramLong1 = new java/util/Date;
      l3 = paramLong2.longValue();
      paramLong1.<init>(l3);
      paramLong2 = paramSimpleDateFormat.format((Date)localObject);
      paramLong1 = paramSimpleDateFormat.format(paramLong1);
      return Pair.OooO00o(paramLong2, paramLong1);
    }
    int i = 1;
    int j = localCalendar1.get(i);
    int k = localCalendar2.get(i);
    if (j == k)
    {
      int m = localCalendar1.get(i);
      i = ((Calendar)localObject).get(i);
      if (m == i)
      {
        l4 = paramLong1.longValue();
        paramLong1 = Locale.getDefault();
        paramLong1 = getMonthDay(l4, paramLong1);
        l5 = paramLong2.longValue();
        localObject = Locale.getDefault();
        paramLong2 = getMonthDay(l5, (Locale)localObject);
        return Pair.OooO00o(paramLong1, paramLong2);
      }
      l4 = paramLong1.longValue();
      paramLong1 = Locale.getDefault();
      paramLong1 = getMonthDay(l4, paramLong1);
      l5 = paramLong2.longValue();
      localObject = Locale.getDefault();
      paramLong2 = getYearMonthDay(l5, (Locale)localObject);
      return Pair.OooO00o(paramLong1, paramLong2);
    }
    long l4 = paramLong1.longValue();
    paramLong1 = Locale.getDefault();
    paramLong1 = getYearMonthDay(l4, paramLong1);
    long l5 = paramLong2.longValue();
    localObject = Locale.getDefault();
    paramLong2 = getYearMonthDay(l5, (Locale)localObject);
    return Pair.OooO00o(paramLong1, paramLong2);
  }
  
  public static String getDateString(long paramLong)
  {
    return getDateString(paramLong, null);
  }
  
  public static String getDateString(long paramLong, SimpleDateFormat paramSimpleDateFormat)
  {
    if (paramSimpleDateFormat != null)
    {
      Date localDate = new java/util/Date;
      localDate.<init>(paramLong);
      return paramSimpleDateFormat.format(localDate);
    }
    boolean bool = isDateWithinCurrentYear(paramLong);
    if (bool) {
      return getMonthDay(paramLong);
    }
    return getYearMonthDay(paramLong);
  }
  
  public static String getDayContentDescription(Context paramContext, long paramLong, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Object localObject = getOptionalYearMonthDayOfWeekDay(paramLong);
    int i;
    if (paramBoolean1)
    {
      i = R.string.mtrl_picker_today_description;
      String str = paramContext.getString(i);
      localObject = new Object[] { localObject };
      localObject = String.format(str, (Object[])localObject);
    }
    if (paramBoolean2)
    {
      i = R.string.mtrl_picker_start_date_description;
      paramContext = paramContext.getString(i);
      localObject = new Object[] { localObject };
      return String.format(paramContext, (Object[])localObject);
    }
    if (paramBoolean3)
    {
      i = R.string.mtrl_picker_end_date_description;
      paramContext = paramContext.getString(i);
      localObject = new Object[] { localObject };
      return String.format(paramContext, (Object[])localObject);
    }
    return localObject;
  }
  
  public static String getMonthDay(long paramLong)
  {
    Locale localLocale = Locale.getDefault();
    return getMonthDay(paramLong, localLocale);
  }
  
  public static String getMonthDay(long paramLong, Locale paramLocale)
  {
    paramLocale = UtcDates.getAbbrMonthDayFormat(paramLocale);
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    return paramLocale.format(localDate);
  }
  
  public static String getMonthDayOfWeekDay(long paramLong)
  {
    Locale localLocale = Locale.getDefault();
    return getMonthDayOfWeekDay(paramLong, localLocale);
  }
  
  public static String getMonthDayOfWeekDay(long paramLong, Locale paramLocale)
  {
    paramLocale = UtcDates.getAbbrMonthWeekdayDayFormat(paramLocale);
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    return paramLocale.format(localDate);
  }
  
  public static String getOptionalYearMonthDayOfWeekDay(long paramLong)
  {
    boolean bool = isDateWithinCurrentYear(paramLong);
    if (bool) {
      return getMonthDayOfWeekDay(paramLong);
    }
    return getYearMonthDayOfWeekDay(paramLong);
  }
  
  public static String getYearContentDescription(Context paramContext, int paramInt)
  {
    Calendar localCalendar = UtcDates.getTodayCalendar();
    int i = 1;
    int j = localCalendar.get(i);
    if (j == paramInt)
    {
      j = R.string.mtrl_picker_navigate_to_current_year_description;
      paramContext = paramContext.getString(j);
      localObject = Integer.valueOf(paramInt);
      localObject = new Object[] { localObject };
      return String.format(paramContext, (Object[])localObject);
    }
    j = R.string.mtrl_picker_navigate_to_year_description;
    paramContext = paramContext.getString(j);
    Object localObject = Integer.valueOf(paramInt);
    localObject = new Object[] { localObject };
    return String.format(paramContext, (Object[])localObject);
  }
  
  public static String getYearMonth(long paramLong)
  {
    android.icu.text.DateFormat localDateFormat = UtcDates.getYearMonthFormat(Locale.getDefault());
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    return localDateFormat.format(localDate);
  }
  
  public static String getYearMonthDay(long paramLong)
  {
    Locale localLocale = Locale.getDefault();
    return getYearMonthDay(paramLong, localLocale);
  }
  
  public static String getYearMonthDay(long paramLong, Locale paramLocale)
  {
    paramLocale = UtcDates.getYearAbbrMonthDayFormat(paramLocale);
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    return paramLocale.format(localDate);
  }
  
  public static String getYearMonthDayOfWeekDay(long paramLong)
  {
    Locale localLocale = Locale.getDefault();
    return getYearMonthDayOfWeekDay(paramLong, localLocale);
  }
  
  public static String getYearMonthDayOfWeekDay(long paramLong, Locale paramLocale)
  {
    paramLocale = UtcDates.getYearAbbrMonthWeekdayDayFormat(paramLocale);
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    return paramLocale.format(localDate);
  }
  
  private static boolean isDateWithinCurrentYear(long paramLong)
  {
    Calendar localCalendar1 = UtcDates.getTodayCalendar();
    Calendar localCalendar2 = UtcDates.getUtcCalendar();
    localCalendar2.setTimeInMillis(paramLong);
    int i = 1;
    int j = localCalendar1.get(i);
    int k = localCalendar2.get(i);
    if (j != k) {
      i = 0;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.DateStrings
 * JD-Core Version:    0.7.0.1
 */