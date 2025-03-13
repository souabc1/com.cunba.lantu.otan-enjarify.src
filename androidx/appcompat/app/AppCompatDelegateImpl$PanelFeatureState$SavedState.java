package androidx.appcompat.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class AppCompatDelegateImpl$PanelFeatureState$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public Bundle o00Ooo0;
  public boolean o00Ooo00;
  
  static
  {
    AppCompatDelegateImpl.PanelFeatureState.SavedState.1 local1 = new androidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public static SavedState OooO00o(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    SavedState localSavedState = new androidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState$SavedState;
    localSavedState.<init>();
    int i = paramParcel.readInt();
    localSavedState.o00OoOoo = i;
    i = paramParcel.readInt();
    int j = 1;
    if (i != j) {
      j = 0;
    }
    localSavedState.o00Ooo00 = j;
    if (j != 0)
    {
      paramParcel = paramParcel.readBundle(paramClassLoader);
      localSavedState.o00Ooo0 = paramParcel;
    }
    return localSavedState;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo00;
    if (paramInt != 0)
    {
      Bundle localBundle = this.o00Ooo0;
      paramParcel.writeBundle(localBundle);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState
 * JD-Core Version:    0.7.0.1
 */