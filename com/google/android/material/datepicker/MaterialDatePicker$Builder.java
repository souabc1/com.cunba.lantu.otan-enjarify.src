package com.google.android.material.datepicker;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Iterator;

public final class MaterialDatePicker$Builder
{
  CalendarConstraints calendarConstraints;
  final DateSelector dateSelector;
  DayViewDecorator dayViewDecorator;
  int inputMode = 0;
  CharSequence negativeButtonText = null;
  int negativeButtonTextResId = 0;
  int overrideThemeResId = 0;
  CharSequence positiveButtonText = null;
  int positiveButtonTextResId = 0;
  Object selection = null;
  CharSequence titleText = null;
  int titleTextResId = 0;
  
  private MaterialDatePicker$Builder(DateSelector paramDateSelector)
  {
    this.dateSelector = paramDateSelector;
  }
  
  private Month createDefaultOpenAt()
  {
    Object localObject = this.dateSelector.getSelectedDays();
    boolean bool1 = ((Collection)localObject).isEmpty();
    if (!bool1)
    {
      long l = ((Long)this.dateSelector.getSelectedDays().iterator().next()).longValue();
      localObject = Month.create(l);
      localCalendarConstraints = this.calendarConstraints;
      bool2 = monthInValidRange((Month)localObject, localCalendarConstraints);
      if (bool2) {
        return localObject;
      }
    }
    localObject = Month.current();
    CalendarConstraints localCalendarConstraints = this.calendarConstraints;
    boolean bool2 = monthInValidRange((Month)localObject, localCalendarConstraints);
    if (!bool2) {
      localObject = this.calendarConstraints.getStart();
    }
    return localObject;
  }
  
  public static Builder customDatePicker(DateSelector paramDateSelector)
  {
    Builder localBuilder = new com/google/android/material/datepicker/MaterialDatePicker$Builder;
    localBuilder.<init>(paramDateSelector);
    return localBuilder;
  }
  
  public static Builder datePicker()
  {
    Builder localBuilder = new com/google/android/material/datepicker/MaterialDatePicker$Builder;
    SingleDateSelector localSingleDateSelector = new com/google/android/material/datepicker/SingleDateSelector;
    localSingleDateSelector.<init>();
    localBuilder.<init>(localSingleDateSelector);
    return localBuilder;
  }
  
  public static Builder dateRangePicker()
  {
    Builder localBuilder = new com/google/android/material/datepicker/MaterialDatePicker$Builder;
    RangeDateSelector localRangeDateSelector = new com/google/android/material/datepicker/RangeDateSelector;
    localRangeDateSelector.<init>();
    localBuilder.<init>(localRangeDateSelector);
    return localBuilder;
  }
  
  private static boolean monthInValidRange(Month paramMonth, CalendarConstraints paramCalendarConstraints)
  {
    Month localMonth = paramCalendarConstraints.getStart();
    int i = paramMonth.compareTo(localMonth);
    if (i >= 0)
    {
      paramCalendarConstraints = paramCalendarConstraints.getEnd();
      j = paramMonth.compareTo(paramCalendarConstraints);
      if (j <= 0)
      {
        j = 1;
        break label43;
      }
    }
    int j = 0;
    paramMonth = null;
    label43:
    return j;
  }
  
  public MaterialDatePicker build()
  {
    Object localObject1 = this.calendarConstraints;
    if (localObject1 == null)
    {
      localObject1 = new com/google/android/material/datepicker/CalendarConstraints$Builder;
      ((CalendarConstraints.Builder)localObject1).<init>();
      localObject1 = ((CalendarConstraints.Builder)localObject1).build();
      this.calendarConstraints = ((CalendarConstraints)localObject1);
    }
    int i = this.titleTextResId;
    if (i == 0)
    {
      localObject1 = this.dateSelector;
      i = ((DateSelector)localObject1).getDefaultTitleResId();
      this.titleTextResId = i;
    }
    localObject1 = this.selection;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = this.dateSelector;
      ((DateSelector)localObject2).setSelection(localObject1);
    }
    localObject1 = this.calendarConstraints.getOpenAt();
    if (localObject1 == null)
    {
      localObject1 = this.calendarConstraints;
      localObject2 = createDefaultOpenAt();
      ((CalendarConstraints)localObject1).setOpenAt((Month)localObject2);
    }
    return MaterialDatePicker.newInstance(this);
  }
  
  public Builder setCalendarConstraints(CalendarConstraints paramCalendarConstraints)
  {
    this.calendarConstraints = paramCalendarConstraints;
    return this;
  }
  
  public Builder setDayViewDecorator(DayViewDecorator paramDayViewDecorator)
  {
    this.dayViewDecorator = paramDayViewDecorator;
    return this;
  }
  
  public Builder setInputMode(int paramInt)
  {
    this.inputMode = paramInt;
    return this;
  }
  
  public Builder setNegativeButtonText(int paramInt)
  {
    this.negativeButtonTextResId = paramInt;
    this.negativeButtonText = null;
    return this;
  }
  
  public Builder setNegativeButtonText(CharSequence paramCharSequence)
  {
    this.negativeButtonText = paramCharSequence;
    this.negativeButtonTextResId = 0;
    return this;
  }
  
  public Builder setPositiveButtonText(int paramInt)
  {
    this.positiveButtonTextResId = paramInt;
    this.positiveButtonText = null;
    return this;
  }
  
  public Builder setPositiveButtonText(CharSequence paramCharSequence)
  {
    this.positiveButtonText = paramCharSequence;
    this.positiveButtonTextResId = 0;
    return this;
  }
  
  public Builder setSelection(Object paramObject)
  {
    this.selection = paramObject;
    return this;
  }
  
  public Builder setTextInputFormat(SimpleDateFormat paramSimpleDateFormat)
  {
    this.dateSelector.setTextInputFormat(paramSimpleDateFormat);
    return this;
  }
  
  public Builder setTheme(int paramInt)
  {
    this.overrideThemeResId = paramInt;
    return this;
  }
  
  public Builder setTitleText(int paramInt)
  {
    this.titleTextResId = paramInt;
    this.titleText = null;
    return this;
  }
  
  public Builder setTitleText(CharSequence paramCharSequence)
  {
    this.titleText = paramCharSequence;
    this.titleTextResId = 0;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.MaterialDatePicker.Builder
 * JD-Core Version:    0.7.0.1
 */