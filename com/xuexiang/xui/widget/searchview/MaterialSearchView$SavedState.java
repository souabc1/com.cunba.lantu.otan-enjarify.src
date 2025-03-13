package com.xuexiang.xui.widget.searchview;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import m54207b69;

class MaterialSearchView$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public boolean o00Ooo00;
  
  static
  {
    MaterialSearchView.SavedState.1 local1 = new com/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public MaterialSearchView$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    String str = paramParcel.readString();
    this.o00OoOoo = str;
    int i = paramParcel.readInt();
    int j = 1;
    if (i != j)
    {
      j = 0;
      str = null;
    }
    this.o00Ooo00 = j;
  }
  
  public MaterialSearchView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramParcel;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(5482, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.searchview.MaterialSearchView.SavedState
 * JD-Core Version:    0.7.0.1
 */