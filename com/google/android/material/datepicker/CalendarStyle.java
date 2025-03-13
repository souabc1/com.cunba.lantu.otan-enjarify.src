package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.R.attr;
import com.google.android.material.R.styleable;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;

final class CalendarStyle
{
  final CalendarItemStyle day;
  final CalendarItemStyle invalidDay;
  final Paint rangeFill;
  final CalendarItemStyle selectedDay;
  final CalendarItemStyle selectedYear;
  final CalendarItemStyle todayDay;
  final CalendarItemStyle todayYear;
  final CalendarItemStyle year;
  
  public CalendarStyle(Context paramContext)
  {
    int i = R.attr.materialCalendarStyle;
    Object localObject = MaterialCalendar.class.getCanonicalName();
    i = MaterialAttributes.resolveOrThrow(paramContext, i, (String)localObject);
    localObject = R.styleable.MaterialCalendar;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(i, (int[])localObject);
    int j = R.styleable.MaterialCalendar_dayStyle;
    j = localTypedArray.getResourceId(j, 0);
    localObject = CalendarItemStyle.create(paramContext, j);
    this.day = ((CalendarItemStyle)localObject);
    j = R.styleable.MaterialCalendar_dayInvalidStyle;
    j = localTypedArray.getResourceId(j, 0);
    localObject = CalendarItemStyle.create(paramContext, j);
    this.invalidDay = ((CalendarItemStyle)localObject);
    j = R.styleable.MaterialCalendar_daySelectedStyle;
    j = localTypedArray.getResourceId(j, 0);
    localObject = CalendarItemStyle.create(paramContext, j);
    this.selectedDay = ((CalendarItemStyle)localObject);
    j = R.styleable.MaterialCalendar_dayTodayStyle;
    j = localTypedArray.getResourceId(j, 0);
    localObject = CalendarItemStyle.create(paramContext, j);
    this.todayDay = ((CalendarItemStyle)localObject);
    j = R.styleable.MaterialCalendar_rangeFillColor;
    localObject = MaterialResources.getColorStateList(paramContext, localTypedArray, j);
    int k = R.styleable.MaterialCalendar_yearStyle;
    k = localTypedArray.getResourceId(k, 0);
    CalendarItemStyle localCalendarItemStyle = CalendarItemStyle.create(paramContext, k);
    this.year = localCalendarItemStyle;
    k = R.styleable.MaterialCalendar_yearSelectedStyle;
    k = localTypedArray.getResourceId(k, 0);
    localCalendarItemStyle = CalendarItemStyle.create(paramContext, k);
    this.selectedYear = localCalendarItemStyle;
    k = R.styleable.MaterialCalendar_yearTodayStyle;
    int m = localTypedArray.getResourceId(k, 0);
    paramContext = CalendarItemStyle.create(paramContext, m);
    this.todayYear = paramContext;
    paramContext = new android/graphics/Paint;
    paramContext.<init>();
    this.rangeFill = paramContext;
    j = ((ColorStateList)localObject).getDefaultColor();
    paramContext.setColor(j);
    localTypedArray.recycle();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.CalendarStyle
 * JD-Core Version:    0.7.0.1
 */