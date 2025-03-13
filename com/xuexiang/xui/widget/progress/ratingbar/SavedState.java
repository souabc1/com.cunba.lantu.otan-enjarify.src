package com.xuexiang.xui.widget.progress.ratingbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import m54207b69;

class SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  public float o00OoOoo;
  
  static
  {
    SavedState.1 local1 = new com/xuexiang/xui/widget/progress/ratingbar/SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    float f = paramParcel.readFloat();
    this.o00OoOoo = f;
  }
  
  public SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public float getRating()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(5443, arrayOfObject);
  }
  
  public void setRating(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(5444, arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramParcel;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(5445, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.progress.ratingbar.SavedState
 * JD-Core Version:    0.7.0.1
 */