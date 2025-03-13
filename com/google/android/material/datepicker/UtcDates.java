package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.icu.text.DisplayContext;
import com.google.android.material.R.string;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import m54207b69;

class UtcDates
{
  static final String UTC = "UTC";
  static AtomicReference timeSourceRef;
  
  static
  {
    AtomicReference localAtomicReference = new java/util/concurrent/atomic/AtomicReference;
    localAtomicReference.<init>();
    timeSourceRef = localAtomicReference;
  }
  
  public static long canonicalYearMonthDay(long paramLong)
  {
    Calendar localCalendar = getUtcCalendar();
    localCalendar.setTimeInMillis(paramLong);
    return getDayCopy(localCalendar).getTimeInMillis();
  }
  
  private static int findCharactersInDateFormatPattern(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    while (paramInt2 >= 0)
    {
      int i = paramString1.length();
      if (paramInt2 >= i) {
        break;
      }
      i = paramString1.charAt(paramInt2);
      i = paramString2.indexOf(i);
      int j = -1;
      if (i != j) {
        break;
      }
      i = paramString1.charAt(paramInt2);
      j = 39;
      if (i == j) {
        do
        {
          paramInt2 += paramInt1;
          if (paramInt2 < 0) {
            break;
          }
          i = paramString1.length();
          if (paramInt2 >= i) {
            break;
          }
          i = paramString1.charAt(paramInt2);
        } while (i != j);
      }
      paramInt2 += paramInt1;
    }
    return paramInt2;
  }
  
  public static android.icu.text.DateFormat getAbbrMonthDayFormat(Locale paramLocale)
  {
    return getAndroidFormat(m54207b69.F54207b69_11("}e28292A04"), paramLocale);
  }
  
  public static android.icu.text.DateFormat getAbbrMonthWeekdayDayFormat(Locale paramLocale)
  {
    return getAndroidFormat(m54207b69.F54207b69_11("zl2122232C0C"), paramLocale);
  }
  
  private static android.icu.text.DateFormat getAndroidFormat(String paramString, Locale paramLocale)
  {
    paramString = android.icu.text.DateFormat.getInstanceForSkeleton(paramString, paramLocale);
    paramLocale = getUtcAndroidTimeZone();
    paramString.setTimeZone(paramLocale);
    paramLocale = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
    paramString.setContext(paramLocale);
    return paramString;
  }
  
  public static Calendar getDayCopy(Calendar paramCalendar)
  {
    paramCalendar = getUtcCalendarOf(paramCalendar);
    Calendar localCalendar = getUtcCalendar();
    int i = paramCalendar.get(1);
    int j = paramCalendar.get(2);
    int k = paramCalendar.get(5);
    localCalendar.set(i, j, k);
    return localCalendar;
  }
  
  public static SimpleDateFormat getDefaultTextInputFormat()
  {
    Object localObject1 = Locale.getDefault();
    Object localObject2 = ((SimpleDateFormat)java.text.DateFormat.getDateInstance(3, (Locale)localObject1)).toPattern().replaceAll("\\s+", "");
    localObject1 = new java/text/SimpleDateFormat;
    Locale localLocale = Locale.getDefault();
    ((SimpleDateFormat)localObject1).<init>((String)localObject2, localLocale);
    localObject2 = getTimeZone();
    ((java.text.DateFormat)localObject1).setTimeZone((java.util.TimeZone)localObject2);
    ((java.text.DateFormat)localObject1).setLenient(false);
    return localObject1;
  }
  
  public static String getDefaultTextInputHint(Resources paramResources, SimpleDateFormat paramSimpleDateFormat)
  {
    paramSimpleDateFormat = paramSimpleDateFormat.toPattern();
    int i = R.string.mtrl_picker_text_input_year_abbr;
    String str1 = paramResources.getString(i);
    int j = R.string.mtrl_picker_text_input_month_abbr;
    String str2 = paramResources.getString(j);
    int k = R.string.mtrl_picker_text_input_day_abbr;
    paramResources = paramResources.getString(k);
    String str3 = m54207b69.F54207b69_11("=:6165456A");
    String str4 = "";
    str3 = paramSimpleDateFormat.replaceAll(str3, str4);
    k = str3.length();
    int m = 1;
    String str5 = "y";
    if (k == m)
    {
      str3 = m54207b69.F54207b69_11(">m14151617");
      paramSimpleDateFormat = paramSimpleDateFormat.replace(str5, str3);
    }
    return paramSimpleDateFormat.replace("d", paramResources).replace("M", str2).replace(str5, str1);
  }
  
  private static java.text.DateFormat getFormat(int paramInt, Locale paramLocale)
  {
    java.text.DateFormat localDateFormat = java.text.DateFormat.getDateInstance(paramInt, paramLocale);
    paramLocale = getTimeZone();
    localDateFormat.setTimeZone(paramLocale);
    return localDateFormat;
  }
  
  public static java.text.DateFormat getFullFormat()
  {
    return getFullFormat(Locale.getDefault());
  }
  
  public static java.text.DateFormat getFullFormat(Locale paramLocale)
  {
    return getFormat(0, paramLocale);
  }
  
  public static java.text.DateFormat getMediumFormat()
  {
    return getMediumFormat(Locale.getDefault());
  }
  
  public static java.text.DateFormat getMediumFormat(Locale paramLocale)
  {
    return getFormat(2, paramLocale);
  }
  
  public static java.text.DateFormat getMediumNoYear()
  {
    return getMediumNoYear(Locale.getDefault());
  }
  
  public static java.text.DateFormat getMediumNoYear(Locale paramLocale)
  {
    paramLocale = (SimpleDateFormat)getMediumFormat(paramLocale);
    String str = removeYearFromDateFormatPattern(paramLocale.toPattern());
    paramLocale.applyPattern(str);
    return paramLocale;
  }
  
  public static SimpleDateFormat getSimpleFormat(String paramString)
  {
    Locale localLocale = Locale.getDefault();
    return getSimpleFormat(paramString, localLocale);
  }
  
  private static SimpleDateFormat getSimpleFormat(String paramString, Locale paramLocale)
  {
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>(paramString, paramLocale);
    paramString = getTimeZone();
    localSimpleDateFormat.setTimeZone(paramString);
    return localSimpleDateFormat;
  }
  
  public static TimeSource getTimeSource()
  {
    TimeSource localTimeSource = (TimeSource)timeSourceRef.get();
    if (localTimeSource == null) {
      localTimeSource = TimeSource.system();
    }
    return localTimeSource;
  }
  
  private static java.util.TimeZone getTimeZone()
  {
    return java.util.TimeZone.getTimeZone("UTC");
  }
  
  public static Calendar getTodayCalendar()
  {
    Calendar localCalendar = getTimeSource().now();
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    java.util.TimeZone localTimeZone = getTimeZone();
    localCalendar.setTimeZone(localTimeZone);
    return localCalendar;
  }
  
  private static android.icu.util.TimeZone getUtcAndroidTimeZone()
  {
    return android.icu.util.TimeZone.getTimeZone("UTC");
  }
  
  public static Calendar getUtcCalendar()
  {
    return getUtcCalendarOf(null);
  }
  
  public static Calendar getUtcCalendarOf(Calendar paramCalendar)
  {
    Calendar localCalendar = Calendar.getInstance(getTimeZone());
    if (paramCalendar == null)
    {
      localCalendar.clear();
    }
    else
    {
      long l = paramCalendar.getTimeInMillis();
      localCalendar.setTimeInMillis(l);
    }
    return localCalendar;
  }
  
  public static android.icu.text.DateFormat getYearAbbrMonthDayFormat(Locale paramLocale)
  {
    return getAndroidFormat(m54207b69.F54207b69_11("n[2217181943"), paramLocale);
  }
  
  public static android.icu.text.DateFormat getYearAbbrMonthWeekdayDayFormat(Locale paramLocale)
  {
    return getAndroidFormat(m54207b69.F54207b69_11("wc1A2F30312A0C"), paramLocale);
  }
  
  public static android.icu.text.DateFormat getYearMonthFormat(Locale paramLocale)
  {
    return getAndroidFormat(m54207b69.F54207b69_11("y^2714151617"), paramLocale);
  }
  
  private static String removeYearFromDateFormatPattern(String paramString)
  {
    String str1 = null;
    String str2 = "yY";
    int i = 1;
    int j = findCharactersInDateFormatPattern(paramString, str2, i, 0);
    int k = paramString.length();
    if (j >= k) {
      return paramString;
    }
    str2 = "EMd";
    int m = findCharactersInDateFormatPattern(paramString, str2, i, j);
    int n = paramString.length();
    if (m < n)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(str2);
      localStringBuilder.append(",");
      str2 = localStringBuilder.toString();
    }
    j = findCharactersInDateFormatPattern(paramString, str2, -1, j) + i;
    str1 = paramString.substring(j, m);
    return paramString.replace(str1, " ").trim();
  }
  
  public static void setTimeSource(TimeSource paramTimeSource)
  {
    timeSourceRef.set(paramTimeSource);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.UtcDates
 * JD-Core Version:    0.7.0.1
 */