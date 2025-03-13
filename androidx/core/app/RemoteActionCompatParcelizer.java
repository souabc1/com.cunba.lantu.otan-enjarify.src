package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import androidx.versionedparcelable.VersionedParcelable;

public class RemoteActionCompatParcelizer
{
  public static RemoteActionCompat read(VersionedParcel paramVersionedParcel)
  {
    RemoteActionCompat localRemoteActionCompat = new androidx/core/app/RemoteActionCompat;
    localRemoteActionCompat.<init>();
    Object localObject = localRemoteActionCompat.OooO00o;
    localObject = (IconCompat)paramVersionedParcel.OooOo0((VersionedParcelable)localObject, 1);
    localRemoteActionCompat.OooO00o = ((IconCompat)localObject);
    localObject = localRemoteActionCompat.OooO0O0;
    localObject = paramVersionedParcel.OooOO0O((CharSequence)localObject, 2);
    localRemoteActionCompat.OooO0O0 = ((CharSequence)localObject);
    localObject = localRemoteActionCompat.OooO0OO;
    localObject = paramVersionedParcel.OooOO0O((CharSequence)localObject, 3);
    localRemoteActionCompat.OooO0OO = ((CharSequence)localObject);
    localObject = localRemoteActionCompat.OooO0Oo;
    localObject = (PendingIntent)paramVersionedParcel.OooOOo0((Parcelable)localObject, 4);
    localRemoteActionCompat.OooO0Oo = ((PendingIntent)localObject);
    boolean bool1 = localRemoteActionCompat.OooO0o0;
    bool1 = paramVersionedParcel.OooO0oO(bool1, 5);
    localRemoteActionCompat.OooO0o0 = bool1;
    bool1 = localRemoteActionCompat.OooO0o;
    boolean bool2 = paramVersionedParcel.OooO0oO(bool1, 6);
    localRemoteActionCompat.OooO0o = bool2;
    return localRemoteActionCompat;
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, VersionedParcel paramVersionedParcel)
  {
    paramVersionedParcel.OooOo0O(false, false);
    Object localObject = paramRemoteActionCompat.OooO00o;
    paramVersionedParcel.Oooo0OO((VersionedParcelable)localObject, 1);
    localObject = paramRemoteActionCompat.OooO0O0;
    paramVersionedParcel.OooOoo0((CharSequence)localObject, 2);
    localObject = paramRemoteActionCompat.OooO0OO;
    paramVersionedParcel.OooOoo0((CharSequence)localObject, 3);
    localObject = paramRemoteActionCompat.OooO0Oo;
    paramVersionedParcel.Oooo000((Parcelable)localObject, 4);
    boolean bool1 = paramRemoteActionCompat.OooO0o0;
    paramVersionedParcel.OooOo(bool1, 5);
    boolean bool2 = paramRemoteActionCompat.OooO0o;
    paramVersionedParcel.OooOo(bool2, 6);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.RemoteActionCompatParcelizer
 * JD-Core Version:    0.7.0.1
 */