package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelImpl
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public final VersionedParcelable o00OoOoo;
  
  static
  {
    ParcelImpl.1 local1 = new androidx/versionedparcelable/ParcelImpl$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public ParcelImpl(Parcel paramParcel)
  {
    VersionedParcelParcel localVersionedParcelParcel = new androidx/versionedparcelable/VersionedParcelParcel;
    localVersionedParcelParcel.<init>(paramParcel);
    paramParcel = localVersionedParcelParcel.OooOo00();
    this.o00OoOoo = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public VersionedParcelable getVersionedParcel()
  {
    return this.o00OoOoo;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    VersionedParcelParcel localVersionedParcelParcel = new androidx/versionedparcelable/VersionedParcelParcel;
    localVersionedParcelParcel.<init>(paramParcel);
    paramParcel = this.o00OoOoo;
    localVersionedParcelParcel.Oooo0O0(paramParcel);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.versionedparcelable.ParcelImpl
 * JD-Core Version:    0.7.0.1
 */