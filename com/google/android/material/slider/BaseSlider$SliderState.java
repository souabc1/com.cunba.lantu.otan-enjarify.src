package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import java.util.ArrayList;
import java.util.List;

class BaseSlider$SliderState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  boolean hasFocus;
  float stepSize;
  float valueFrom;
  float valueTo;
  ArrayList values;
  
  static
  {
    BaseSlider.SliderState.1 local1 = new com/google/android/material/slider/BaseSlider$SliderState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  private BaseSlider$SliderState(Parcel paramParcel)
  {
    super(paramParcel);
    float f = paramParcel.readFloat();
    this.valueFrom = f;
    f = paramParcel.readFloat();
    this.valueTo = f;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.values = localArrayList;
    ClassLoader localClassLoader = Float.class.getClassLoader();
    paramParcel.readList(localArrayList, localClassLoader);
    f = paramParcel.readFloat();
    this.stepSize = f;
    int i = paramParcel.createBooleanArray()[0];
    this.hasFocus = i;
  }
  
  public BaseSlider$SliderState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    float f = this.valueFrom;
    paramParcel.writeFloat(f);
    f = this.valueTo;
    paramParcel.writeFloat(f);
    Object localObject = this.values;
    paramParcel.writeList((List)localObject);
    f = this.stepSize;
    paramParcel.writeFloat(f);
    localObject = new boolean[1];
    boolean bool = this.hasFocus;
    localObject[0] = bool;
    paramParcel.writeBooleanArray((boolean[])localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.slider.BaseSlider.SliderState
 * JD-Core Version:    0.7.0.1
 */