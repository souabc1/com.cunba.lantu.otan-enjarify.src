package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class IUnusedAppRestrictionsBackportService$Stub
  extends Binder
  implements IUnusedAppRestrictionsBackportService
{
  public IUnusedAppRestrictionsBackportService$Stub()
  {
    attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
  }
  
  public static IUnusedAppRestrictionsBackportService o0Oo0o0O(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    Object localObject = paramIBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
    if (localObject != null)
    {
      boolean bool = localObject instanceof IUnusedAppRestrictionsBackportService;
      if (bool) {
        return (IUnusedAppRestrictionsBackportService)localObject;
      }
    }
    localObject = new androidx/core/app/unusedapprestrictions/IUnusedAppRestrictionsBackportService$Stub$Proxy;
    ((IUnusedAppRestrictionsBackportService.Stub.Proxy)localObject).<init>(paramIBinder);
    return localObject;
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    String str = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";
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
      IUnusedAppRestrictionsBackportCallback localIUnusedAppRestrictionsBackportCallback = IUnusedAppRestrictionsBackportCallback.Stub.o0Oo0o0O(paramParcel1.readStrongBinder());
      o00OO0O(localIUnusedAppRestrictionsBackportCallback);
      return i;
    }
    paramParcel2.writeString(str);
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub
 * JD-Core Version:    0.7.0.1
 */