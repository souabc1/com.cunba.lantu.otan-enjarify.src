package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory2;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.Preconditions;
import androidx.loader.app.LoaderManager;

public class FragmentController
{
  public final FragmentHostCallback OooO00o;
  
  public FragmentController(FragmentHostCallback paramFragmentHostCallback)
  {
    this.OooO00o = paramFragmentHostCallback;
  }
  
  public static FragmentController OooO0O0(FragmentHostCallback paramFragmentHostCallback)
  {
    FragmentController localFragmentController = new androidx/fragment/app/FragmentController;
    paramFragmentHostCallback = (FragmentHostCallback)Preconditions.OooO(paramFragmentHostCallback, "callbacks == null");
    localFragmentController.<init>(paramFragmentHostCallback);
    return localFragmentController;
  }
  
  public void OooO()
  {
    this.OooO00o.o00Ooo0o.o000oOoO();
  }
  
  public void OooO00o(Fragment paramFragment)
  {
    FragmentHostCallback localFragmentHostCallback = this.OooO00o;
    localFragmentHostCallback.o00Ooo0o.OooOOOO(localFragmentHostCallback, localFragmentHostCallback, paramFragment);
  }
  
  public void OooO0OO()
  {
    this.OooO00o.o00Ooo0o.OooOoo0();
  }
  
  public boolean OooO0Oo(MenuItem paramMenuItem)
  {
    return this.OooO00o.o00Ooo0o.OooOooo(paramMenuItem);
  }
  
  public void OooO0o()
  {
    this.OooO00o.o00Ooo0o.Oooo00o();
  }
  
  public void OooO0o0()
  {
    this.OooO00o.o00Ooo0o.Oooo000();
  }
  
  public void OooO0oO()
  {
    this.OooO00o.o00Ooo0o.OoooO00();
  }
  
  public void OooO0oo()
  {
    this.OooO00o.o00Ooo0o.OoooOO0();
  }
  
  public void OooOO0()
  {
    this.OooO00o.o00Ooo0o.OoooOOo();
  }
  
  public boolean OooOO0O()
  {
    return this.OooO00o.o00Ooo0o.OooooOO(true);
  }
  
  public void OooOO0o()
  {
    this.OooO00o.o00Ooo0o.o00000oo();
  }
  
  public View OooOOO0(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.OooO00o.o00Ooo0o.getLayoutInflaterFactory().onCreateView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public int getActiveFragmentsCount()
  {
    return this.OooO00o.o00Ooo0o.getActiveFragmentCount();
  }
  
  public FragmentManager getSupportFragmentManager()
  {
    return this.OooO00o.o00Ooo0o;
  }
  
  public LoaderManager getSupportLoaderManager()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    throw localUnsupportedOperationException;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentController
 * JD-Core Version:    0.7.0.1
 */