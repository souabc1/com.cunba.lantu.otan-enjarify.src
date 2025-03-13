package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer
{
  public static IconCompat read(VersionedParcel paramVersionedParcel)
  {
    IconCompat localIconCompat = new androidx/core/graphics/drawable/IconCompat;
    localIconCompat.<init>();
    int i = localIconCompat.OooO00o;
    i = paramVersionedParcel.OooOOOO(i, 1);
    localIconCompat.OooO00o = i;
    Object localObject = localIconCompat.OooO0OO;
    localObject = paramVersionedParcel.OooO((byte[])localObject, 2);
    localIconCompat.OooO0OO = ((byte[])localObject);
    localObject = localIconCompat.OooO0Oo;
    localObject = paramVersionedParcel.OooOOo0((Parcelable)localObject, 3);
    localIconCompat.OooO0Oo = ((Parcelable)localObject);
    i = localIconCompat.OooO0o0;
    i = paramVersionedParcel.OooOOOO(i, 4);
    localIconCompat.OooO0o0 = i;
    i = localIconCompat.OooO0o;
    i = paramVersionedParcel.OooOOOO(i, 5);
    localIconCompat.OooO0o = i;
    localObject = localIconCompat.OooO0oO;
    localObject = (ColorStateList)paramVersionedParcel.OooOOo0((Parcelable)localObject, 6);
    localIconCompat.OooO0oO = ((ColorStateList)localObject);
    localObject = localIconCompat.OooO;
    localObject = paramVersionedParcel.OooOOoo((String)localObject, 7);
    localIconCompat.OooO = ((String)localObject);
    localObject = localIconCompat.OooOO0;
    paramVersionedParcel = paramVersionedParcel.OooOOoo((String)localObject, 8);
    localIconCompat.OooOO0 = paramVersionedParcel;
    localIconCompat.OooO();
    return localIconCompat;
  }
  
  public static void write(IconCompat paramIconCompat, VersionedParcel paramVersionedParcel)
  {
    int i = 1;
    paramVersionedParcel.OooOo0O(i, i);
    boolean bool = paramVersionedParcel.isStream();
    paramIconCompat.OooOO0(bool);
    int k = paramIconCompat.OooO00o;
    int m = -1;
    if (m != k) {
      paramVersionedParcel.OooOooO(k, i);
    }
    Object localObject = paramIconCompat.OooO0OO;
    if (localObject != null)
    {
      k = 2;
      paramVersionedParcel.OooOoO((byte[])localObject, k);
    }
    localObject = paramIconCompat.OooO0Oo;
    if (localObject != null)
    {
      k = 3;
      paramVersionedParcel.Oooo000((Parcelable)localObject, k);
    }
    int j = paramIconCompat.OooO0o0;
    if (j != 0)
    {
      k = 4;
      paramVersionedParcel.OooOooO(j, k);
    }
    j = paramIconCompat.OooO0o;
    if (j != 0)
    {
      k = 5;
      paramVersionedParcel.OooOooO(j, k);
    }
    localObject = paramIconCompat.OooO0oO;
    if (localObject != null)
    {
      k = 6;
      paramVersionedParcel.Oooo000((Parcelable)localObject, k);
    }
    localObject = paramIconCompat.OooO;
    if (localObject != null)
    {
      k = 7;
      paramVersionedParcel.Oooo00o((String)localObject, k);
    }
    paramIconCompat = paramIconCompat.OooOO0;
    if (paramIconCompat != null)
    {
      j = 8;
      paramVersionedParcel.Oooo00o(paramIconCompat, j);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.drawable.IconCompatParcelizer
 * JD-Core Version:    0.7.0.1
 */