package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import m54207b69;

final class Month
  implements Comparable, Parcelable
{
  public static final Parcelable.Creator CREATOR;
  final int daysInMonth;
  final int daysInWeek;
  private final Calendar firstOfMonth;
  private String longName;
  final int month;
  final long timeInMillis;
  final int year;
  
  static
  {
    Month.1 local1 = new com/google/android/material/datepicker/Month$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  private Month(Calendar paramCalendar)
  {
    int i = 5;
    int j = 1;
    paramCalendar.set(i, j);
    paramCalendar = UtcDates.getDayCopy(paramCalendar);
    this.firstOfMonth = paramCalendar;
    int k = paramCalendar.get(2);
    this.month = k;
    j = paramCalendar.get(j);
    this.year = j;
    j = paramCalendar.getMaximum(7);
    this.daysInWeek = j;
    i = paramCalendar.getActualMaximum(i);
    this.daysInMonth = i;
    long l = paramCalendar.getTimeInMillis();
    this.timeInMillis = l;
  }
  
  public static Month create(int paramInt1, int paramInt2)
  {
    Calendar localCalendar = UtcDates.getUtcCalendar();
    localCalendar.set(1, paramInt1);
    localCalendar.set(2, paramInt2);
    Month localMonth = new com/google/android/material/datepicker/Month;
    localMonth.<init>(localCalendar);
    return localMonth;
  }
  
  public static Month create(long paramLong)
  {
    Calendar localCalendar = UtcDates.getUtcCalendar();
    localCalendar.setTimeInMillis(paramLong);
    Month localMonth = new com/google/android/material/datepicker/Month;
    localMonth.<init>(localCalendar);
    return localMonth;
  }
  
  public static Month current()
  {
    Month localMonth = new com/google/android/material/datepicker/Month;
    Calendar localCalendar = UtcDates.getTodayCalendar();
    localMonth.<init>(localCalendar);
    return localMonth;
  }
  
  public int compareTo(Month paramMonth)
  {
    Calendar localCalendar = this.firstOfMonth;
    paramMonth = paramMonth.firstOfMonth;
    return localCalendar.compareTo(paramMonth);
  }
  
  public int daysFromStartOfWeekToFirstOfMonth(int paramInt)
  {
    Calendar localCalendar1 = this.firstOfMonth;
    int i = 7;
    int j = localCalendar1.get(i);
    if (paramInt <= 0)
    {
      Calendar localCalendar2 = this.firstOfMonth;
      paramInt = localCalendar2.getFirstDayOfWeek();
    }
    j -= paramInt;
    if (j < 0)
    {
      paramInt = this.daysInWeek;
      j += paramInt;
    }
    return j;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof Month;
    if (!bool2) {
      return false;
    }
    paramObject = (Month)paramObject;
    int i = this.month;
    int j = paramObject.month;
    if (i == j)
    {
      i = this.year;
      int k = paramObject.year;
      if (i == k) {}
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public long getDay(int paramInt)
  {
    Calendar localCalendar = UtcDates.getDayCopy(this.firstOfMonth);
    localCalendar.set(5, paramInt);
    return localCalendar.getTimeInMillis();
  }
  
  public int getDayOfMonth(long paramLong)
  {
    Calendar localCalendar = UtcDates.getDayCopy(this.firstOfMonth);
    localCalendar.setTimeInMillis(paramLong);
    return localCalendar.get(5);
  }
  
  public String getLongName()
  {
    String str = this.longName;
    if (str == null)
    {
      long l = this.firstOfMonth.getTimeInMillis();
      str = DateStrings.getYearMonth(l);
      this.longName = str;
    }
    return this.longName;
  }
  
  public long getStableId()
  {
    return this.firstOfMonth.getTimeInMillis();
  }
  
  public int hashCode()
  {
    Integer localInteger1 = Integer.valueOf(this.month);
    Integer localInteger2 = Integer.valueOf(this.year);
    return Arrays.hashCode(new Object[] { localInteger1, localInteger2 });
  }
  
  public Month monthsLater(int paramInt)
  {
    Calendar localCalendar = UtcDates.getDayCopy(this.firstOfMonth);
    localCalendar.add(2, paramInt);
    Month localMonth = new com/google/android/material/datepicker/Month;
    localMonth.<init>(localCalendar);
    return localMonth;
  }
  
  public int monthsUntil(Month paramMonth)
  {
    Object localObject = this.firstOfMonth;
    boolean bool = localObject instanceof GregorianCalendar;
    if (bool)
    {
      int i = paramMonth.year;
      int j = this.year;
      i = (i - j) * 12;
      int k = paramMonth.month;
      j = this.month;
      k -= j;
      return i + k;
    }
    paramMonth = new java/lang/IllegalArgumentException;
    localObject = m54207b69.F54207b69_11("+b2D0D101E462A160E0D161A160F195010131F191F1A1826285A1C2A225E2E3531322E32392B2B72");
    paramMonth.<init>((String)localObject);
    throw paramMonth;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.year;
    paramParcel.writeInt(paramInt);
    paramInt = this.month;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.Month
 * JD-Core Version:    0.7.0.1
 */