package androidx.loader.app;

import androidx.collection.SparseArrayCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class LoaderManagerImpl$LoaderViewModel
  extends ViewModel
{
  public static final ViewModelProvider.Factory OooO0o;
  public SparseArrayCompat OooO0Oo;
  public boolean OooO0o0;
  
  static
  {
    LoaderManagerImpl.LoaderViewModel.1 local1 = new androidx/loader/app/LoaderManagerImpl$LoaderViewModel$1;
    local1.<init>();
    OooO0o = local1;
  }
  
  public LoaderManagerImpl$LoaderViewModel()
  {
    SparseArrayCompat localSparseArrayCompat = new androidx/collection/SparseArrayCompat;
    localSparseArrayCompat.<init>();
    this.OooO0Oo = localSparseArrayCompat;
    this.OooO0o0 = false;
  }
  
  public static LoaderViewModel OooO0oo(ViewModelStore paramViewModelStore)
  {
    ViewModelProvider localViewModelProvider = new androidx/lifecycle/ViewModelProvider;
    ViewModelProvider.Factory localFactory = OooO0o;
    localViewModelProvider.<init>(paramViewModelStore, localFactory);
    return (LoaderViewModel)localViewModelProvider.OooO00o(LoaderViewModel.class);
  }
  
  public void OooO()
  {
    SparseArrayCompat localSparseArrayCompat = this.OooO0Oo;
    int i = localSparseArrayCompat.OooOOOO();
    int j = 0;
    while (j < i)
    {
      LoaderManagerImpl.LoaderInfo localLoaderInfo = (LoaderManagerImpl.LoaderInfo)this.OooO0Oo.OooOOOo(j);
      localLoaderInfo.OooOOOO();
      j += 1;
    }
  }
  
  public void OooO0o0()
  {
    super.OooO0o0();
    SparseArrayCompat localSparseArrayCompat = this.OooO0Oo;
    int i = localSparseArrayCompat.OooOOOO();
    int j = 0;
    while (j < i)
    {
      LoaderManagerImpl.LoaderInfo localLoaderInfo = (LoaderManagerImpl.LoaderInfo)this.OooO0Oo.OooOOOo(j);
      boolean bool = true;
      localLoaderInfo.OooOOO0(bool);
      j += 1;
    }
    this.OooO0Oo.OooO0O0();
  }
  
  public void OooO0oO(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    Object localObject1 = this.OooO0Oo;
    int i = ((SparseArrayCompat)localObject1).OooOOOO();
    if (i > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loaders:");
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append("    ");
      localObject1 = ((StringBuilder)localObject1).toString();
      int j = 0;
      for (;;)
      {
        Object localObject2 = this.OooO0Oo;
        int k = ((SparseArrayCompat)localObject2).OooOOOO();
        if (j >= k) {
          break;
        }
        localObject2 = (LoaderManagerImpl.LoaderInfo)this.OooO0Oo.OooOOOo(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        int m = this.OooO0Oo.OooOO0O(j);
        paramPrintWriter.print(m);
        paramPrintWriter.print(": ");
        String str = ((LoaderManagerImpl.LoaderInfo)localObject2).toString();
        paramPrintWriter.println(str);
        ((LoaderManagerImpl.LoaderInfo)localObject2).OooOOO((String)localObject1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        j += 1;
      }
    }
  }
  
  public LoaderManagerImpl.LoaderInfo getLoader(int paramInt)
  {
    return (LoaderManagerImpl.LoaderInfo)this.OooO0Oo.get(paramInt);
  }
  
  public boolean isCreatingLoader()
  {
    return this.OooO0o0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.loader.app.LoaderManagerImpl.LoaderViewModel
 * JD-Core Version:    0.7.0.1
 */