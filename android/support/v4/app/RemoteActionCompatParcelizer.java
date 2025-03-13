package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import androidx.versionedparcelable.VersionedParcel;

public final class RemoteActionCompatParcelizer
  extends androidx.core.app.RemoteActionCompatParcelizer
{
  public static RemoteActionCompat read(VersionedParcel paramVersionedParcel)
  {
    return androidx.core.app.RemoteActionCompatParcelizer.read(paramVersionedParcel);
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, VersionedParcel paramVersionedParcel)
  {
    androidx.core.app.RemoteActionCompatParcelizer.write(paramRemoteActionCompat, paramVersionedParcel);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     android.support.v4.app.RemoteActionCompatParcelizer
 * JD-Core Version:    0.7.0.1
 */