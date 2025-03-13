package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class ParcelableCompat$ParcelableCompatCreatorHoneycombMR2
  implements Parcelable.ClassLoaderCreator
{
  public final ParcelableCompatCreatorCallbacks OooO00o;
  
  public Object createFromParcel(Parcel paramParcel)
  {
    return this.OooO00o.createFromParcel(paramParcel, null);
  }
  
  public Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return this.OooO00o.createFromParcel(paramParcel, paramClassLoader);
  }
  
  public Object[] newArray(int paramInt)
  {
    return this.OooO00o.newArray(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.ParcelableCompat.ParcelableCompatCreatorHoneycombMR2
 * JD-Core Version:    0.7.0.1
 */