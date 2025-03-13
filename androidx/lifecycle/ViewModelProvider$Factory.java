package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.Intrinsics;

public abstract interface ViewModelProvider$Factory
{
  public static final ViewModelProvider.Factory.Companion OooO00o = ViewModelProvider.Factory.Companion.OooO00o;
  
  public ViewModel OooO00o(Class paramClass)
  {
    Intrinsics.OooO0o(paramClass, "modelClass");
    paramClass = new java/lang/UnsupportedOperationException;
    paramClass.<init>("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    throw paramClass;
  }
  
  public ViewModel OooO0O0(Class paramClass, CreationExtras paramCreationExtras)
  {
    Intrinsics.OooO0o(paramClass, "modelClass");
    Intrinsics.OooO0o(paramCreationExtras, "extras");
    return OooO00o(paramClass);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ViewModelProvider.Factory
 * JD-Core Version:    0.7.0.1
 */