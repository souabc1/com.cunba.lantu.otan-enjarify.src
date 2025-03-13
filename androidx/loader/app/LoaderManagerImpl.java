package androidx.loader.app;

import androidx.core.util.DebugUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class LoaderManagerImpl
  extends LoaderManager
{
  public static boolean OooO0OO = false;
  public final LifecycleOwner OooO00o;
  public final LoaderManagerImpl.LoaderViewModel OooO0O0;
  
  public LoaderManagerImpl(LifecycleOwner paramLifecycleOwner, ViewModelStore paramViewModelStore)
  {
    this.OooO00o = paramLifecycleOwner;
    paramLifecycleOwner = LoaderManagerImpl.LoaderViewModel.OooO0oo(paramViewModelStore);
    this.OooO0O0 = paramLifecycleOwner;
  }
  
  public void OooO00o(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.OooO0O0.OooO0oO(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public void OooO0OO()
  {
    this.OooO0O0.OooO();
  }
  
  public Loader getLoader(int paramInt)
  {
    LoaderManagerImpl.LoaderViewModel localLoaderViewModel = this.OooO0O0;
    boolean bool = localLoaderViewModel.isCreatingLoader();
    if (!bool)
    {
      localLoaderViewModel = this.OooO0O0;
      localObject = localLoaderViewModel.getLoader(paramInt);
      if (localObject != null)
      {
        localObject = ((LoaderManagerImpl.LoaderInfo)localObject).getLoader();
      }
      else
      {
        paramInt = 0;
        localObject = null;
      }
      return localObject;
    }
    Object localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("Called while creating a loader");
    throw ((Throwable)localObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    localStringBuilder.append("LoaderManager{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    localStringBuilder.append(" in ");
    DebugUtils.OooO00o(this.OooO00o, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.loader.app.LoaderManagerImpl
 * JD-Core Version:    0.7.0.1
 */