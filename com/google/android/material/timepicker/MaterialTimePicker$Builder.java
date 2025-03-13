package com.google.android.material.timepicker;

public final class MaterialTimePicker$Builder
{
  private Integer inputMode;
  private CharSequence negativeButtonText;
  private int negativeButtonTextResId;
  private int overrideThemeResId;
  private CharSequence positiveButtonText;
  private int positiveButtonTextResId;
  private TimeModel time;
  private CharSequence titleText;
  private int titleTextResId;
  
  public MaterialTimePicker$Builder()
  {
    TimeModel localTimeModel = new com/google/android/material/timepicker/TimeModel;
    localTimeModel.<init>();
    this.time = localTimeModel;
    this.titleTextResId = 0;
    this.positiveButtonTextResId = 0;
    this.negativeButtonTextResId = 0;
    this.overrideThemeResId = 0;
  }
  
  public MaterialTimePicker build()
  {
    return MaterialTimePicker.access$1400(this);
  }
  
  public Builder setHour(int paramInt)
  {
    this.time.setHourOfDay(paramInt);
    return this;
  }
  
  public Builder setInputMode(int paramInt)
  {
    Integer localInteger = Integer.valueOf(paramInt);
    this.inputMode = localInteger;
    return this;
  }
  
  public Builder setMinute(int paramInt)
  {
    this.time.setMinute(paramInt);
    return this;
  }
  
  public Builder setNegativeButtonText(int paramInt)
  {
    this.negativeButtonTextResId = paramInt;
    return this;
  }
  
  public Builder setNegativeButtonText(CharSequence paramCharSequence)
  {
    this.negativeButtonText = paramCharSequence;
    return this;
  }
  
  public Builder setPositiveButtonText(int paramInt)
  {
    this.positiveButtonTextResId = paramInt;
    return this;
  }
  
  public Builder setPositiveButtonText(CharSequence paramCharSequence)
  {
    this.positiveButtonText = paramCharSequence;
    return this;
  }
  
  public Builder setTheme(int paramInt)
  {
    this.overrideThemeResId = paramInt;
    return this;
  }
  
  public Builder setTimeFormat(int paramInt)
  {
    TimeModel localTimeModel1 = this.time;
    int i = localTimeModel1.hour;
    int j = localTimeModel1.minute;
    TimeModel localTimeModel2 = new com/google/android/material/timepicker/TimeModel;
    localTimeModel2.<init>(paramInt);
    this.time = localTimeModel2;
    localTimeModel2.setMinute(j);
    this.time.setHourOfDay(i);
    return this;
  }
  
  public Builder setTitleText(int paramInt)
  {
    this.titleTextResId = paramInt;
    return this;
  }
  
  public Builder setTitleText(CharSequence paramCharSequence)
  {
    this.titleText = paramCharSequence;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.timepicker.MaterialTimePicker.Builder
 * JD-Core Version:    0.7.0.1
 */