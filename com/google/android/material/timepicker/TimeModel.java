package com.google.android.material.timepicker;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.material.R.string;
import java.util.Arrays;
import m54207b69;

class TimeModel
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final String NUMBER_FORMAT = "%d";
  public static final String ZERO_LEADING_NUMBER_FORMAT = "%02d";
  final int format;
  int hour;
  private final MaxInputValidator hourInputValidator;
  int minute;
  private final MaxInputValidator minuteInputValidator;
  int period;
  int selection;
  
  static
  {
    TimeModel.1 local1 = new com/google/android/material/timepicker/TimeModel$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public TimeModel()
  {
    this(0);
  }
  
  public TimeModel(int paramInt)
  {
    this(0, 0, 10, paramInt);
  }
  
  public TimeModel(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.hour = paramInt1;
    this.minute = paramInt2;
    this.selection = paramInt3;
    this.format = paramInt4;
    paramInt1 = getPeriod(paramInt1);
    this.period = paramInt1;
    MaxInputValidator localMaxInputValidator = new com/google/android/material/timepicker/MaxInputValidator;
    localMaxInputValidator.<init>(59);
    this.minuteInputValidator = localMaxInputValidator;
    localMaxInputValidator = new com/google/android/material/timepicker/MaxInputValidator;
    paramInt2 = 1;
    if (paramInt4 == paramInt2) {
      paramInt2 = 23;
    } else {
      paramInt2 = 12;
    }
    localMaxInputValidator.<init>(paramInt2);
    this.hourInputValidator = localMaxInputValidator;
  }
  
  public TimeModel(Parcel paramParcel)
  {
    this(i, j, k, m);
  }
  
  public static String formatText(Resources paramResources, CharSequence paramCharSequence)
  {
    String str = m54207b69.F54207b69_11("8X7D696C3F");
    return formatText(paramResources, paramCharSequence, str);
  }
  
  public static String formatText(Resources paramResources, CharSequence paramCharSequence, String paramString)
  {
    try
    {
      paramResources = paramResources.getConfiguration();
      paramResources = paramResources.locale;
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      paramCharSequence = String.valueOf(paramCharSequence);
      int j = Integer.parseInt(paramCharSequence);
      paramCharSequence = Integer.valueOf(j);
      arrayOfObject[0] = paramCharSequence;
      return String.format(paramResources, paramString, arrayOfObject);
    }
    catch (NumberFormatException localNumberFormatException) {}
    return null;
  }
  
  private static int getPeriod(int paramInt)
  {
    int i = 12;
    if (paramInt >= i) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
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
    boolean bool2 = paramObject instanceof TimeModel;
    if (!bool2) {
      return false;
    }
    paramObject = (TimeModel)paramObject;
    int i = this.hour;
    int j = paramObject.hour;
    if (i == j)
    {
      i = this.minute;
      j = paramObject.minute;
      if (i == j)
      {
        i = this.format;
        j = paramObject.format;
        if (i == j)
        {
          i = this.selection;
          int k = paramObject.selection;
          if (i == k) {
            return bool1;
          }
        }
      }
    }
    bool1 = false;
    return bool1;
  }
  
  public int getHourContentDescriptionResId()
  {
    int i = this.format;
    int j = 1;
    if (i == j) {
      i = R.string.material_hour_24h_suffix;
    } else {
      i = R.string.material_hour_suffix;
    }
    return i;
  }
  
  public int getHourForDisplay()
  {
    int i = this.format;
    int j = 1;
    if (i == j) {
      return this.hour % 24;
    }
    i = this.hour;
    int k = i % 12;
    int m = 12;
    if (k == 0) {
      return m;
    }
    k = this.period;
    if (k == j) {
      i -= m;
    }
    return i;
  }
  
  public MaxInputValidator getHourInputValidator()
  {
    return this.hourInputValidator;
  }
  
  public MaxInputValidator getMinuteInputValidator()
  {
    return this.minuteInputValidator;
  }
  
  public int hashCode()
  {
    Integer localInteger1 = Integer.valueOf(this.format);
    Integer localInteger2 = Integer.valueOf(this.hour);
    Integer localInteger3 = Integer.valueOf(this.minute);
    Integer localInteger4 = Integer.valueOf(this.selection);
    Object[] tmp37_34 = new Object[4];
    Object[] tmp38_37 = tmp37_34;
    Object[] tmp38_37 = tmp37_34;
    tmp38_37[0] = localInteger1;
    tmp38_37[1] = localInteger2;
    tmp38_37[2] = localInteger3;
    Object[] tmp48_38 = tmp38_37;
    tmp48_38[3] = localInteger4;
    return Arrays.hashCode(tmp48_38);
  }
  
  public void setHour(int paramInt)
  {
    int i = this.format;
    int j = 1;
    if (i == j)
    {
      this.hour = paramInt;
      return;
    }
    i = 12;
    paramInt %= i;
    int k = this.period;
    if (k != j) {
      i = 0;
    }
    paramInt += i;
    this.hour = paramInt;
  }
  
  public void setHourOfDay(int paramInt)
  {
    int i = getPeriod(paramInt);
    this.period = i;
    this.hour = paramInt;
  }
  
  public void setMinute(int paramInt)
  {
    paramInt %= 60;
    this.minute = paramInt;
  }
  
  public void setPeriod(int paramInt)
  {
    int i = this.period;
    if (paramInt != i)
    {
      this.period = paramInt;
      i = this.hour;
      int j = 12;
      if (i < j)
      {
        int k = 1;
        if (paramInt == k) {
          i += j;
        }
      }
      for (;;)
      {
        this.hour = i;
        break;
        if ((i < j) || (paramInt != 0)) {
          break;
        }
        i -= j;
      }
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.hour;
    paramParcel.writeInt(paramInt);
    paramInt = this.minute;
    paramParcel.writeInt(paramInt);
    paramInt = this.selection;
    paramParcel.writeInt(paramInt);
    paramInt = this.format;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.timepicker.TimeModel
 * JD-Core Version:    0.7.0.1
 */