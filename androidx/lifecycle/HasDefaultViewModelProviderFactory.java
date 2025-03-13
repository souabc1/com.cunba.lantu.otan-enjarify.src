package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;

public abstract interface HasDefaultViewModelProviderFactory
{
  public CreationExtras getDefaultViewModelCreationExtras()
  {
    return CreationExtras.Empty.OooO0O0;
  }
  
  public abstract ViewModelProvider.Factory getDefaultViewModelProviderFactory();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.HasDefaultViewModelProviderFactory
 * JD-Core Version:    0.7.0.1
 */