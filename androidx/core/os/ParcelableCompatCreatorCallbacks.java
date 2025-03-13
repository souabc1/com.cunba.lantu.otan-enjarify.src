package androidx.core.os;

import android.os.Parcel;

public abstract interface ParcelableCompatCreatorCallbacks
{
  public abstract Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader);
  
  public abstract Object[] newArray(int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.ParcelableCompatCreatorCallbacks
 * JD-Core Version:    0.7.0.1
 */