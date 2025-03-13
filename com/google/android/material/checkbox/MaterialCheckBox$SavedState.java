package com.google.android.material.checkbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import m54207b69;

class MaterialCheckBox$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  int checkedState;
  
  static
  {
    MaterialCheckBox.SavedState.1 local1 = new com/google/android/material/checkbox/MaterialCheckBox$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  private MaterialCheckBox$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    ClassLoader localClassLoader = getClass().getClassLoader();
    int i = ((Integer)paramParcel.readValue(localClassLoader)).intValue();
    this.checkedState = i;
  }
  
  public MaterialCheckBox$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  private String getCheckedStateString()
  {
    int i = this.checkedState;
    int j = 1;
    if (i != j)
    {
      j = 2;
      if (i != j) {
        return m54207b69.F54207b69_11("oK3E262A26322D263537");
      }
      return m54207b69.F54207b69_11("Sa081007071909191310180A2010");
    }
    return m54207b69.F54207b69_11("Yt171D131A231616");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11(",`2D021608160E07132B110F0E172F1D275E4413291919492B192D1F36");
    localStringBuilder.append(str);
    str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("vP70143A3837403B3B0B2D3B2F417A");
    localStringBuilder.append(str);
    str = getCheckedStateString();
    localStringBuilder.append(str);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    Integer localInteger = Integer.valueOf(this.checkedState);
    paramParcel.writeValue(localInteger);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.checkbox.MaterialCheckBox.SavedState
 * JD-Core Version:    0.7.0.1
 */