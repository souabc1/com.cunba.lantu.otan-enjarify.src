package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Objects;
import m54207b69;

public final class CalendarConstraints$Builder
{
  private static final String DEEP_COPY_VALIDATOR_KEY = "DEEP_COPY_VALIDATOR_KEY";
  static final long DEFAULT_END = UtcDates.canonicalYearMonthDay(Month.create(2100, 11).timeInMillis);
  static final long DEFAULT_START = UtcDates.canonicalYearMonthDay(Month.create(1900, 0).timeInMillis);
  private long end;
  private int firstDayOfWeek;
  private Long openAt;
  private long start;
  private CalendarConstraints.DateValidator validator;
  
  public CalendarConstraints$Builder()
  {
    long l = DEFAULT_START;
    this.start = l;
    l = DEFAULT_END;
    this.end = l;
    DateValidatorPointForward localDateValidatorPointForward = DateValidatorPointForward.from(-9223372036854775808L);
    this.validator = localDateValidatorPointForward;
  }
  
  public CalendarConstraints$Builder(CalendarConstraints paramCalendarConstraints)
  {
    long l = DEFAULT_START;
    this.start = l;
    l = DEFAULT_END;
    this.end = l;
    Object localObject = DateValidatorPointForward.from(-9223372036854775808L);
    this.validator = ((CalendarConstraints.DateValidator)localObject);
    l = CalendarConstraints.access$100(paramCalendarConstraints).timeInMillis;
    this.start = l;
    l = CalendarConstraints.access$200(paramCalendarConstraints).timeInMillis;
    this.end = l;
    localObject = Long.valueOf(CalendarConstraints.access$300(paramCalendarConstraints).timeInMillis);
    this.openAt = ((Long)localObject);
    int i = CalendarConstraints.access$400(paramCalendarConstraints);
    this.firstDayOfWeek = i;
    paramCalendarConstraints = CalendarConstraints.access$500(paramCalendarConstraints);
    this.validator = paramCalendarConstraints;
  }
  
  public CalendarConstraints build()
  {
    Object localObject1 = new android/os/Bundle;
    ((Bundle)localObject1).<init>();
    Object localObject2 = this.validator;
    String str = m54207b69.F54207b69_11("_j2E30313D392E2B413B3E463632303C3A4E364A48354449");
    ((Bundle)localObject1).putParcelable(str, (Parcelable)localObject2);
    localObject2 = new com/google/android/material/datepicker/CalendarConstraints;
    long l1 = this.start;
    Month localMonth1 = Month.create(l1);
    long l2 = this.end;
    Month localMonth2 = Month.create(l2);
    localObject1 = ((Bundle)localObject1).getParcelable(str);
    Object localObject3 = localObject1;
    localObject3 = (CalendarConstraints.DateValidator)localObject1;
    localObject1 = this.openAt;
    if (localObject1 == null)
    {
      localObject1 = null;
    }
    else
    {
      long l3 = ((Long)localObject1).longValue();
      localObject1 = Month.create(l3);
    }
    int i = this.firstDayOfWeek;
    ((CalendarConstraints)localObject2).<init>(localMonth1, localMonth2, (CalendarConstraints.DateValidator)localObject3, (Month)localObject1, i, null);
    return localObject2;
  }
  
  public Builder setEnd(long paramLong)
  {
    this.end = paramLong;
    return this;
  }
  
  public Builder setFirstDayOfWeek(int paramInt)
  {
    this.firstDayOfWeek = paramInt;
    return this;
  }
  
  public Builder setOpenAt(long paramLong)
  {
    Long localLong = Long.valueOf(paramLong);
    this.openAt = localLong;
    return this;
  }
  
  public Builder setStart(long paramLong)
  {
    this.start = paramLong;
    return this;
  }
  
  public Builder setValidator(CalendarConstraints.DateValidator paramDateValidator)
  {
    String str = m54207b69.F54207b69_11("z*5C4C48465250644C601353565051536D1A59611D58745C5D");
    Objects.requireNonNull(paramDateValidator, str);
    this.validator = paramDateValidator;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.CalendarConstraints.Builder
 * JD-Core Version:    0.7.0.1
 */