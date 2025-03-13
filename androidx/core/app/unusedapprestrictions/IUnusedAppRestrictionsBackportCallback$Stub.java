package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class IUnusedAppRestrictionsBackportCallback$Stub
  extends Binder
  implements IUnusedAppRestrictionsBackportCallback
{
  public IUnusedAppRestrictionsBackportCallback$Stub()
  {
    attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
  }
  
  public static IUnusedAppRestrictionsBackportCallback o0Oo0o0O(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    Object localObject = paramIBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
    if (localObject != null)
    {
      boolean bool = localObject instanceof IUnusedAppRestrictionsBackportCallback;
      if (bool) {
        return (IUnusedAppRestrictionsBackportCallback)localObject;
      }
    }
    localObject = new androidx/core/app/unusedapprestrictions/IUnusedAppRestrictionsBackportCallback$Stub$Proxy;
    ((IUnusedAppRestrictionsBackportCallback.Stub.Proxy)localObject).<init>(paramIBinder);
    return localObject;
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    String str = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";
    int i = 1;
    if (paramInt1 >= i)
    {
      j = 16777215;
      if (paramInt1 <= j) {
        paramParcel1.enforceInterface(str);
      }
    }
    int j = 1598968902;
    if (paramInt1 != j)
    {
      if (paramInt1 != i) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      paramInt1 = paramParcel1.readInt();
      int k = 0;
      paramParcel2 = null;
      if (paramInt1 != 0) {
        paramInt1 = i;
      } else {
        paramInt1 = 0;
      }
      int m = paramParcel1.readInt();
      if (m != 0) {
        k = i;
      }
      o0OO0(paramInt1, k);
      return i;
    }
    paramParcel2.writeString(str);
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub
 * JD-Core Version:    0.7.0.1
 */