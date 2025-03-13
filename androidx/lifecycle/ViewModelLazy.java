package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

public final class ViewModelLazy
  implements Lazy
{
  public final KClass o00OoOoo;
  public final Function0 o00Ooo0;
  public final Function0 o00Ooo00;
  public final Function0 o00Ooo0O;
  public ViewModel o00Ooo0o;
  
  public ViewModel getValue()
  {
    Object localObject = this.o00Ooo0o;
    if (localObject == null)
    {
      localObject = (ViewModelProvider.Factory)this.o00Ooo0.OooO00o();
      ViewModelStore localViewModelStore = (ViewModelStore)this.o00Ooo00.OooO00o();
      ViewModelProvider localViewModelProvider = new androidx/lifecycle/ViewModelProvider;
      CreationExtras localCreationExtras = (CreationExtras)this.o00Ooo0O.OooO00o();
      localViewModelProvider.<init>(localViewModelStore, (ViewModelProvider.Factory)localObject, localCreationExtras);
      localObject = JvmClassMappingKt.OooO00o(this.o00OoOoo);
      localObject = localViewModelProvider.OooO00o((Class)localObject);
      this.o00Ooo0o = ((ViewModel)localObject);
    }
    return localObject;
  }
  
  public boolean isInitialized()
  {
    ViewModel localViewModel = this.o00Ooo0o;
    boolean bool;
    if (localViewModel != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localViewModel = null;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ViewModelLazy
 * JD-Core Version:    0.7.0.1
 */