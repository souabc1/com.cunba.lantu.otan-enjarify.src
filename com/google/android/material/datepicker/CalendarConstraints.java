package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.core.util.ObjectsCompat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;
import m54207b69;

public final class CalendarConstraints
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  private final Month end;
  private final int firstDayOfWeek;
  private final int monthSpan;
  private Month openAt;
  private final Month start;
  private final CalendarConstraints.DateValidator validator;
  private final int yearSpan;
  
  static
  {
    CalendarConstraints.1 local1 = new com/google/android/material/datepicker/CalendarConstraints$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  private CalendarConstraints(Month paramMonth1, Month paramMonth2, CalendarConstraints.DateValidator paramDateValidator, Month paramMonth3, int paramInt)
  {
    String str = m54207b69.F54207b69_11("cR212735232A77373A444547317E3D45814C385051");
    Objects.requireNonNull(paramMonth1, str);
    str = m54207b69.F54207b69_11("3g020A054A080B0F10101C51100E5417211B1C");
    Objects.requireNonNull(paramMonth2, str);
    str = m54207b69.F54207b69_11("z*5C4C48465250644C601353565051536D1A59611D58745C5D");
    Objects.requireNonNull(paramDateValidator, str);
    this.start = paramMonth1;
    this.end = paramMonth2;
    this.openAt = paramMonth3;
    this.firstDayOfWeek = paramInt;
    this.validator = paramDateValidator;
    int i;
    if (paramMonth3 != null)
    {
      i = paramMonth1.compareTo(paramMonth3);
      if (i > 0)
      {
        paramMonth1 = new java/lang/IllegalArgumentException;
        paramMonth2 = m54207b69.F54207b69_11("kW24243828277C203F412C49824043474848348948468C4C483B4B3F92503F4344525A459A3E5D5F4A67");
        paramMonth1.<init>(paramMonth2);
        throw paramMonth1;
      }
    }
    if (paramMonth3 != null)
    {
      i = paramMonth3.compareTo(paramMonth2);
      if (i > 0)
      {
        paramMonth1 = new java/lang/IllegalArgumentException;
        paramMonth2 = m54207b69.F54207b69_11("\\M2E3941422C283F74082B2D44317A3C3B3334344C81443E84444453435B8A4642498E2245475E4B");
        paramMonth1.<init>(paramMonth2);
        throw paramMonth1;
      }
    }
    if (paramInt >= 0)
    {
      paramDateValidator = UtcDates.getUtcCalendar();
      int j = 7;
      i = paramDateValidator.getMaximum(j);
      if (paramInt <= i)
      {
        i = paramMonth1.monthsUntil(paramMonth2) + 1;
        this.monthSpan = i;
        int k = paramMonth2.year;
        int m = paramMonth1.year;
        k = k - m + 1;
        this.yearSpan = k;
        return;
      }
    }
    paramMonth1 = new java/lang/IllegalArgumentException;
    paramMonth2 = m54207b69.F54207b69_11("kf0010161816270D2631093B0E0F1A541E25571A1C265B261E22281C");
    paramMonth1.<init>(paramMonth2);
    throw paramMonth1;
  }
  
  public Month clamp(Month paramMonth)
  {
    Month localMonth = this.start;
    int i = paramMonth.compareTo(localMonth);
    if (i < 0) {
      return this.start;
    }
    localMonth = this.end;
    i = paramMonth.compareTo(localMonth);
    if (i > 0) {
      paramMonth = this.end;
    }
    return paramMonth;
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
    boolean bool2 = paramObject instanceof CalendarConstraints;
    if (!bool2) {
      return false;
    }
    paramObject = (CalendarConstraints)paramObject;
    Object localObject = this.start;
    Month localMonth = paramObject.start;
    bool2 = ((Month)localObject).equals(localMonth);
    if (bool2)
    {
      localObject = this.end;
      localMonth = paramObject.end;
      bool2 = ((Month)localObject).equals(localMonth);
      if (bool2)
      {
        localObject = this.openAt;
        localMonth = paramObject.openAt;
        bool2 = ObjectsCompat.OooO00o(localObject, localMonth);
        if (bool2)
        {
          int i = this.firstDayOfWeek;
          int j = paramObject.firstDayOfWeek;
          if (i == j)
          {
            localObject = this.validator;
            paramObject = paramObject.validator;
            boolean bool3 = localObject.equals(paramObject);
            if (bool3) {
              return bool1;
            }
          }
        }
      }
    }
    bool1 = false;
    return bool1;
  }
  
  public CalendarConstraints.DateValidator getDateValidator()
  {
    return this.validator;
  }
  
  public Month getEnd()
  {
    return this.end;
  }
  
  public long getEndMs()
  {
    return this.end.timeInMillis;
  }
  
  public int getFirstDayOfWeek()
  {
    return this.firstDayOfWeek;
  }
  
  public int getMonthSpan()
  {
    return this.monthSpan;
  }
  
  public Month getOpenAt()
  {
    return this.openAt;
  }
  
  public Long getOpenAtMs()
  {
    Object localObject = this.openAt;
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      long l = ((Month)localObject).timeInMillis;
      localObject = Long.valueOf(l);
    }
    return localObject;
  }
  
  public Month getStart()
  {
    return this.start;
  }
  
  public long getStartMs()
  {
    return this.start.timeInMillis;
  }
  
  public int getYearSpan()
  {
    return this.yearSpan;
  }
  
  public int hashCode()
  {
    Month localMonth1 = this.start;
    Month localMonth2 = this.end;
    Month localMonth3 = this.openAt;
    Integer localInteger = Integer.valueOf(this.firstDayOfWeek);
    CalendarConstraints.DateValidator localDateValidator = this.validator;
    Object[] tmp34_31 = new Object[5];
    Object[] tmp35_34 = tmp34_31;
    Object[] tmp35_34 = tmp34_31;
    tmp35_34[0] = localMonth1;
    tmp35_34[1] = localMonth2;
    Object[] tmp42_35 = tmp35_34;
    Object[] tmp42_35 = tmp35_34;
    tmp42_35[2] = localMonth3;
    tmp42_35[3] = localInteger;
    tmp42_35[4] = localDateValidator;
    return Arrays.hashCode(tmp42_35);
  }
  
  public boolean isWithinBounds(long paramLong)
  {
    Month localMonth = this.start;
    int i = 1;
    long l = localMonth.getDay(i);
    boolean bool1 = l < paramLong;
    if (!bool1)
    {
      localMonth = this.end;
      int j = localMonth.daysInMonth;
      l = localMonth.getDay(j);
      boolean bool2 = paramLong < l;
      if (!bool2) {}
    }
    else
    {
      i = 0;
    }
    return i;
  }
  
  public void setOpenAt(Month paramMonth)
  {
    this.openAt = paramMonth;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.start;
    paramParcel.writeParcelable((Parcelable)localObject, 0);
    localObject = this.end;
    paramParcel.writeParcelable((Parcelable)localObject, 0);
    localObject = this.openAt;
    paramParcel.writeParcelable((Parcelable)localObject, 0);
    localObject = this.validator;
    paramParcel.writeParcelable((Parcelable)localObject, 0);
    paramInt = this.firstDayOfWeek;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.CalendarConstraints
 * JD-Core Version:    0.7.0.1
 */