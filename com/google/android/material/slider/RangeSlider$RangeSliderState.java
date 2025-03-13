package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.AbsSavedState;

class RangeSlider$RangeSliderState
  extends AbsSavedState
{
  public static final Parcelable.Creator CREATOR;
  private float minSeparation;
  private int separationUnit;
  
  static
  {
    RangeSlider.RangeSliderState.1 local1 = new com/google/android/material/slider/RangeSlider$RangeSliderState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  private RangeSlider$RangeSliderState(Parcel paramParcel)
  {
    super((Parcelable)localObject);
    float f = paramParcel.readFloat();
    this.minSeparation = f;
    int i = paramParcel.readInt();
    this.separationUnit = i;
  }
  
  public RangeSlider$RangeSliderState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    float f = this.minSeparation;
    paramParcel.writeFloat(f);
    paramInt = this.separationUnit;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.slider.RangeSlider.RangeSliderState
 * JD-Core Version:    0.7.0.1
 */