package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import m54207b69;

public class PreJava9DateFormatProvider
{
  private static String getDateFormatPattern(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        i = 2;
        if (paramInt != i)
        {
          i = 3;
          if (paramInt == i) {
            return m54207b69.F54207b69_11("\\`2D5006521D1E");
          }
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str1 = m54207b69.F54207b69_11("5]08343836362F398421453343273F3D3F4C3A8F413D39474F7F96");
          localStringBuilder.append(str1);
          localStringBuilder.append(paramInt);
          String str2 = localStringBuilder.toString();
          localIllegalArgumentException.<init>(str2);
          throw localIllegalArgumentException;
        }
        return m54207b69.F54207b69_11("iP1D1E1F7338817630");
      }
      return m54207b69.F54207b69_11(">M00010203712E67743C");
    }
    return m54207b69.F54207b69_11("_[1E1F20217B801C1D1E1F854A838830");
  }
  
  private static String getDatePartOfDateTimePattern(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        i = 2;
        if (paramInt != i)
        {
          i = 3;
          if (paramInt == i) {
            return m54207b69.F54207b69_11("\\`2D5006521D1E");
          }
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str1 = m54207b69.F54207b69_11("5]08343836362F398421453343273F3D3F4C3A8F413D39474F7F96");
          localStringBuilder.append(str1);
          localStringBuilder.append(paramInt);
          String str2 = localStringBuilder.toString();
          localIllegalArgumentException.<init>(str2);
          throw localIllegalArgumentException;
        }
        return m54207b69.F54207b69_11("}*6768690D520B105A5B5C5D");
      }
      return m54207b69.F54207b69_11("{s3E3F4041571C655A12131415");
    }
    return m54207b69.F54207b69_11("76737475761E1B81828384205D26235D5E5F60");
  }
  
  private static String getTimePartOfDateTimePattern(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        i = 2;
        if (paramInt != i)
        {
          i = 3;
          if (paramInt == i) {
            return m54207b69.F54207b69_11("|C2B7A30316727");
          }
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str1 = m54207b69.F54207b69_11("5]08343836362F398421453343273F3D3F4C3A8F413D39474F7F96");
          localStringBuilder.append(str1);
          localStringBuilder.append(paramInt);
          String str2 = localStringBuilder.toString();
          localIllegalArgumentException.<init>(str2);
          throw localIllegalArgumentException;
        }
        return m54207b69.F54207b69_11("g}154812134B13146424");
      }
    }
    return m54207b69.F54207b69_11("SQ396C3E3F6F272878387A35");
  }
  
  public static DateFormat getUSDateFormat(int paramInt)
  {
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    String str = getDateFormatPattern(paramInt);
    Locale localLocale = Locale.US;
    localSimpleDateFormat.<init>(str, localLocale);
    return localSimpleDateFormat;
  }
  
  public static DateFormat getUSDateTimeFormat(int paramInt1, int paramInt2)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = getDatePartOfDateTimePattern(paramInt1);
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(" ");
    str = getTimePartOfDateTimePattern(paramInt2);
    ((StringBuilder)localObject).append(str);
    str = ((StringBuilder)localObject).toString();
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localObject = Locale.US;
    localSimpleDateFormat.<init>(str, (Locale)localObject);
    return localSimpleDateFormat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.PreJava9DateFormatProvider
 * JD-Core Version:    0.7.0.1
 */