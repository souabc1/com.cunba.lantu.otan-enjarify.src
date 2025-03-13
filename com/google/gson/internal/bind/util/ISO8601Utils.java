package com.google.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import m54207b69;

public class ISO8601Utils
{
  private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone("UTC");
  private static final String UTC_ID = "UTC";
  
  private static boolean checkOffset(String paramString, int paramInt, char paramChar)
  {
    int i = paramString.length();
    if (paramInt < i)
    {
      c = paramString.charAt(paramInt);
      if (c == paramChar)
      {
        c = '\001';
        break label34;
      }
    }
    char c = '\000';
    paramString = null;
    label34:
    return c;
  }
  
  public static String format(Date paramDate)
  {
    TimeZone localTimeZone = TIMEZONE_UTC;
    return format(paramDate, false, localTimeZone);
  }
  
  public static String format(Date paramDate, boolean paramBoolean)
  {
    TimeZone localTimeZone = TIMEZONE_UTC;
    return format(paramDate, paramBoolean, localTimeZone);
  }
  
  public static String format(Date paramDate, boolean paramBoolean, TimeZone paramTimeZone)
  {
    GregorianCalendar localGregorianCalendar = new java/util/GregorianCalendar;
    Object localObject = Locale.US;
    localGregorianCalendar.<init>(paramTimeZone, (Locale)localObject);
    localGregorianCalendar.setTime(paramDate);
    char c1 = '\004';
    char c2;
    if (paramBoolean)
    {
      c2 = c1;
    }
    else
    {
      c2 = '\000';
      localObject = null;
    }
    int j = '\023' + c2;
    int i = paramTimeZone.getRawOffset();
    int k = 1;
    if (i == 0) {
      i = k;
    } else {
      i = 6;
    }
    j += i;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>(j);
    j = localGregorianCalendar.get(k);
    padInt((StringBuilder)localObject, j, c1);
    c1 = '-';
    ((StringBuilder)localObject).append(c1);
    j = 2;
    int m = localGregorianCalendar.get(j) + k;
    padInt((StringBuilder)localObject, m, j);
    ((StringBuilder)localObject).append(c1);
    k = localGregorianCalendar.get(5);
    padInt((StringBuilder)localObject, k, j);
    ((StringBuilder)localObject).append('T');
    k = localGregorianCalendar.get(11);
    padInt((StringBuilder)localObject, k, j);
    k = 58;
    ((StringBuilder)localObject).append(k);
    m = localGregorianCalendar.get(12);
    padInt((StringBuilder)localObject, m, j);
    ((StringBuilder)localObject).append(k);
    m = localGregorianCalendar.get(13);
    padInt((StringBuilder)localObject, m, j);
    if (paramBoolean)
    {
      ((StringBuilder)localObject).append('.');
      paramBoolean = localGregorianCalendar.get(14);
      m = 3;
      padInt((StringBuilder)localObject, paramBoolean, m);
    }
    long l = localGregorianCalendar.getTimeInMillis();
    paramBoolean = paramTimeZone.getOffset(l);
    if (paramBoolean)
    {
      int n = paramBoolean / 60000;
      int i1 = Math.abs(n / 60);
      n = Math.abs(n % 60);
      if (!paramBoolean) {
        c1 = '+';
      }
      ((StringBuilder)localObject).append(c1);
      padInt((StringBuilder)localObject, i1, j);
      ((StringBuilder)localObject).append(k);
      padInt((StringBuilder)localObject, n, j);
    }
    else
    {
      c1 = 'Z';
      ((StringBuilder)localObject).append(c1);
    }
    return ((StringBuilder)localObject).toString();
  }
  
  private static int indexOfNonDigit(String paramString, int paramInt)
  {
    for (;;)
    {
      int i = paramString.length();
      if (paramInt >= i) {
        break label44;
      }
      i = paramString.charAt(paramInt);
      int j = 48;
      if (i < j) {
        break;
      }
      j = 57;
      if (i > j) {
        break;
      }
      paramInt += 1;
    }
    return paramInt;
    label44:
    return paramString.length();
  }
  
  private static void padInt(StringBuilder paramStringBuilder, int paramInt1, int paramInt2)
  {
    String str = Integer.toString(paramInt1);
    int i = str.length();
    paramInt2 -= i;
    while (paramInt2 > 0)
    {
      i = 48;
      paramStringBuilder.append(i);
      paramInt2 += -1;
    }
    paramStringBuilder.append(str);
  }
  
  public static Date parse(String paramString, ParsePosition paramParsePosition)
  {
    String str1 = paramString;
    ParsePosition localParsePosition = paramParsePosition;
    int k;
    try
    {
      int i = paramParsePosition.getIndex();
      int j = i + 4;
      i = parseInt(paramString, i, j);
      k = 45;
      boolean bool2 = checkOffset(paramString, j, k);
      if (bool2) {
        j += 1;
      }
      int m = j + 2;
      j = parseInt(str1, j, m);
      boolean bool3 = checkOffset(str1, m, k);
      if (bool3) {
        m += 1;
      }
      int n = m + 2;
      m = parseInt(str1, m, n);
      char c1 = 'T';
      boolean bool4 = checkOffset(str1, n, c1);
      int i2 = 1;
      if (!bool4)
      {
        i3 = paramString.length();
        if (i3 <= n)
        {
          localObject1 = new java/util/GregorianCalendar;
          j -= i2;
          ((GregorianCalendar)localObject1).<init>(i, j, m);
          localParsePosition.setIndex(n);
          return ((Calendar)localObject1).getTime();
        }
      }
      int i3 = 43;
      int i4 = 90;
      int i5 = 2;
      int i1;
      int i7;
      int i12;
      if (bool4)
      {
        n += 1;
        i1 = n + 2;
        n = parseInt(str1, n, i1);
        char c2 = ':';
        boolean bool8 = checkOffset(str1, i1, c2);
        if (bool8) {
          i1 += 1;
        }
        int i8 = i1 + 2;
        i1 = parseInt(str1, i1, i8);
        boolean bool7 = checkOffset(str1, i8, c2);
        if (bool7) {
          i8 += 1;
        }
        int i6 = paramString.length();
        if (i6 > i8)
        {
          i6 = str1.charAt(i8);
          if ((i6 != i4) && (i6 != i3) && (i6 != k))
          {
            i7 = i8 + 2;
            i9 = parseInt(str1, i8, i7);
            int i10 = 59;
            if (i9 > i10)
            {
              i10 = 63;
              if (i9 < i10) {
                i9 = 59;
              }
            }
            i10 = 46;
            boolean bool9 = checkOffset(str1, i7, i10);
            if (bool9)
            {
              i7 += 1;
              i11 = i7 + 1;
              i11 = indexOfNonDigit(str1, i11);
              i12 = i7 + 3;
              i12 = Math.min(i11, i12);
              int i13 = parseInt(str1, i7, i12);
              i12 -= i7;
              if (i12 != i2)
              {
                if (i12 == i5) {
                  i13 *= 10;
                }
              }
              else {
                i13 *= 100;
              }
              i12 = i1;
              i7 = i13;
              i1 = n;
              n = i11;
              break label530;
            }
            i12 = i1;
            i1 = n;
            n = i7;
            i7 = 0;
            break label530;
          }
        }
        i12 = i1;
        i7 = 0;
        i1 = n;
        n = i9;
      }
      else
      {
        i1 = 0;
        i12 = 0;
        i7 = 0;
      }
      int i9 = 0;
      label530:
      int i11 = paramString.length();
      if (i11 > n)
      {
        i11 = str1.charAt(n);
        i5 = 5;
        if (i11 == i4)
        {
          localObject1 = TIMEZONE_UTC;
          n += i2;
        }
        else
        {
          if ((i11 != i3) && (i11 != k))
          {
            localObject2 = new java/lang/IndexOutOfBoundsException;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject1 = "e77E5A43595F63591E4B67645D235A66686228706C67736A6D5B715F322C";
            localObject1 = m54207b69.F54207b69_11((String)localObject1);
            ((StringBuilder)localObject3).append((String)localObject1);
            ((StringBuilder)localObject3).append(i11);
            localObject1 = "'";
            ((StringBuilder)localObject3).append((String)localObject1);
            localObject3 = ((StringBuilder)localObject3).toString();
            ((IndexOutOfBoundsException)localObject2).<init>((String)localObject3);
            throw ((Throwable)localObject2);
          }
          localObject1 = str1.substring(n);
          i3 = ((String)localObject1).length();
          if (i3 < i5)
          {
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append((String)localObject1);
            localObject1 = "00";
            ((StringBuilder)localObject4).append((String)localObject1);
            localObject1 = ((StringBuilder)localObject4).toString();
          }
          i3 = ((String)localObject1).length();
          n += i3;
          localObject4 = "%J617B7C7D7E";
          localObject4 = m54207b69.F54207b69_11((String)localObject4);
          boolean bool5 = ((String)localObject4).equals(localObject1);
          if (!bool5)
          {
            localObject4 = "mA6A72737E7576";
            localObject4 = m54207b69.F54207b69_11((String)localObject4);
            bool5 = ((String)localObject4).equals(localObject1);
            if (!bool5)
            {
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              String str2 = "GMT";
              ((StringBuilder)localObject4).append(str2);
              ((StringBuilder)localObject4).append((String)localObject1);
              localObject1 = ((StringBuilder)localObject4).toString();
              localObject4 = TimeZone.getTimeZone((String)localObject1);
              str2 = ((TimeZone)localObject4).getID();
              boolean bool10 = str2.equals(localObject1);
              if (!bool10)
              {
                String str3 = ":";
                String str4 = "";
                str2 = str2.replace(str3, str4);
                boolean bool6 = str2.equals(localObject1);
                if (!bool6)
                {
                  localObject2 = new java/lang/IndexOutOfBoundsException;
                  localObject3 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject3).<init>();
                  localObject5 = "f37E5B4261564C566262665E1E53676C65235A6E706A2870746F736A6D63795F2833";
                  localObject5 = m54207b69.F54207b69_11((String)localObject5);
                  ((StringBuilder)localObject3).append((String)localObject5);
                  ((StringBuilder)localObject3).append((String)localObject1);
                  localObject1 = "rV76324123373D807D2C3C2F44462D413486334B89";
                  localObject1 = m54207b69.F54207b69_11((String)localObject1);
                  ((StringBuilder)localObject3).append((String)localObject1);
                  localObject1 = ((TimeZone)localObject4).getID();
                  ((StringBuilder)localObject3).append((String)localObject1);
                  localObject3 = ((StringBuilder)localObject3).toString();
                  ((IndexOutOfBoundsException)localObject2).<init>((String)localObject3);
                  throw ((Throwable)localObject2);
                }
              }
              localObject1 = localObject4;
              break label999;
            }
          }
          localObject1 = TIMEZONE_UTC;
        }
        label999:
        Object localObject4 = new java/util/GregorianCalendar;
        ((GregorianCalendar)localObject4).<init>((TimeZone)localObject1);
        k = 0;
        localObject1 = null;
        ((Calendar)localObject4).setLenient(false);
        ((Calendar)localObject4).set(i2, i);
        j -= i2;
        i = 2;
        ((Calendar)localObject4).set(i, j);
        i = 5;
        ((Calendar)localObject4).set(i, m);
        i = 11;
        ((Calendar)localObject4).set(i, i1);
        i = 12;
        ((Calendar)localObject4).set(i, i12);
        i = 13;
        ((Calendar)localObject4).set(i, i9);
        i = 14;
        ((Calendar)localObject4).set(i, i7);
        localParsePosition.setIndex(n);
        return ((Calendar)localObject4).getTime();
      }
      Object localObject2 = new java/lang/IllegalArgumentException;
      localObject3 = "u+65450D62464B5412594D4F59174F535E52595C72586E";
      localObject3 = m54207b69.F54207b69_11((String)localObject3);
      ((IllegalArgumentException)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
    }
    catch (IllegalArgumentException localIllegalArgumentException) {}catch (NumberFormatException localNumberFormatException) {}catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {}
    if (str1 == null)
    {
      str1 = null;
    }
    else
    {
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      k = 34;
      ((StringBuilder)localObject3).append(k);
      ((StringBuilder)localObject3).append(str1);
      ((StringBuilder)localObject3).append(k);
      str1 = ((StringBuilder)localObject3).toString();
    }
    Object localObject3 = localIndexOutOfBoundsException.getMessage();
    if (localObject3 != null)
    {
      boolean bool1 = ((String)localObject3).isEmpty();
      if (!bool1) {}
    }
    else
    {
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append("(");
      localObject1 = localIndexOutOfBoundsException.getClass().getName();
      ((StringBuilder)localObject3).append((String)localObject1);
      localObject1 = ")";
      ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = ((StringBuilder)localObject3).toString();
    }
    Object localObject1 = new java/text/ParseException;
    Object localObject5 = new java/lang/StringBuilder;
    ((StringBuilder)localObject5).<init>();
    String str5 = m54207b69.F54207b69_11("_u33151E1C14165B08225E0F1F13131E64212513236943");
    ((StringBuilder)localObject5).append(str5);
    ((StringBuilder)localObject5).append(str1);
    ((StringBuilder)localObject5).append("]: ");
    ((StringBuilder)localObject5).append((String)localObject3);
    str1 = ((StringBuilder)localObject5).toString();
    int i14 = paramParsePosition.getIndex();
    ((ParseException)localObject1).<init>(str1, i14);
    ((Throwable)localObject1).initCause(localIndexOutOfBoundsException);
    throw ((Throwable)localObject1);
  }
  
  private static int parseInt(String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      int i = paramString.length();
      if ((paramInt2 <= i) && (paramInt1 <= paramInt2))
      {
        String str = m54207b69.F54207b69_11("-S1A3E2735433F3D7A452F483C422E7782");
        int j = 10;
        int k;
        int m;
        NumberFormatException localNumberFormatException1;
        StringBuilder localStringBuilder;
        if (paramInt1 < paramInt2)
        {
          k = paramInt1 + 1;
          m = Character.digit(paramString.charAt(paramInt1), j);
          if (m >= 0)
          {
            m = -m;
          }
          else
          {
            localNumberFormatException1 = new java/lang/NumberFormatException;
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append(str);
            paramString = paramString.substring(paramInt1, paramInt2);
            localStringBuilder.append(paramString);
            paramString = localStringBuilder.toString();
            localNumberFormatException1.<init>(paramString);
            throw localNumberFormatException1;
          }
        }
        else
        {
          m = 0;
          k = paramInt1;
        }
        while (k < paramInt2)
        {
          int n = k + 1;
          k = Character.digit(paramString.charAt(k), j);
          if (k >= 0)
          {
            m = m * 10 - k;
            k = n;
          }
          else
          {
            localNumberFormatException1 = new java/lang/NumberFormatException;
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append(str);
            paramString = paramString.substring(paramInt1, paramInt2);
            localStringBuilder.append(paramString);
            paramString = localStringBuilder.toString();
            localNumberFormatException1.<init>(paramString);
            throw localNumberFormatException1;
          }
        }
        return -m;
      }
    }
    NumberFormatException localNumberFormatException2 = new java/lang/NumberFormatException;
    localNumberFormatException2.<init>(paramString);
    throw localNumberFormatException2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.bind.util.ISO8601Utils
 * JD-Core Version:    0.7.0.1
 */