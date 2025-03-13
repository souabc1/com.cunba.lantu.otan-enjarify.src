package androidx.loader.app;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class LoaderManager
{
  public static LoaderManager OooO0O0(LifecycleOwner paramLifecycleOwner)
  {
    LoaderManagerImpl localLoaderManagerImpl = new androidx/loader/app/LoaderManagerImpl;
    Object localObject = paramLifecycleOwner;
    localObject = ((ViewModelStoreOwner)paramLifecycleOwner).getViewModelStore();
    localLoaderManagerImpl.<init>(paramLifecycleOwner, (ViewModelStore)localObject);
    return localLoaderManagerImpl;
  }
  
  public abstract void OooO00o(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract void OooO0OO();
  
  public abstract Loader getLoader(int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.loader.app.LoaderManager
 * JD-Core Version:    0.7.0.1
 */