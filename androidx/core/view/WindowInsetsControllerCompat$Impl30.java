package androidx.core.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.collection.SimpleArrayMap;

class WindowInsetsControllerCompat$Impl30
  extends WindowInsetsControllerCompat.Impl
{
  public final WindowInsetsControllerCompat OooO00o;
  public final WindowInsetsController OooO0O0;
  public final SimpleArrayMap OooO0OO;
  public Window OooO0Oo;
  
  public WindowInsetsControllerCompat$Impl30(Window paramWindow, WindowInsetsControllerCompat paramWindowInsetsControllerCompat)
  {
    this(localWindowInsetsController, paramWindowInsetsControllerCompat);
    this.OooO0Oo = paramWindow;
  }
  
  public WindowInsetsControllerCompat$Impl30(WindowInsetsController paramWindowInsetsController, WindowInsetsControllerCompat paramWindowInsetsControllerCompat)
  {
    SimpleArrayMap localSimpleArrayMap = new androidx/collection/SimpleArrayMap;
    localSimpleArrayMap.<init>();
    this.OooO0OO = localSimpleArrayMap;
    this.OooO0O0 = paramWindowInsetsController;
    this.OooO00o = paramWindowInsetsControllerCompat;
  }
  
  public void OooO00o(int paramInt)
  {
    o00O0OOO.OooO00o(this.OooO0O0, paramInt);
  }
  
  public void OooO0O0(int paramInt)
  {
    Object localObject = this.OooO0Oo;
    if (localObject != null)
    {
      int i = paramInt & 0x8;
      if (i != 0)
      {
        i = Build.VERSION.SDK_INT;
        int j = 32;
        if (i < j)
        {
          localObject = ((Window)localObject).getContext();
          String str = "input_method";
          localObject = (InputMethodManager)((Context)localObject).getSystemService(str);
          ((InputMethodManager)localObject).isActive();
        }
      }
    }
    o00O0O00.OooO00o(this.OooO0O0, paramInt);
  }
  
  public void OooO0OO(int paramInt)
  {
    View localView = this.OooO0Oo.getDecorView();
    int i = localView.getSystemUiVisibility();
    paramInt = (paramInt ^ 0xFFFFFFFF) & i;
    localView.setSystemUiVisibility(paramInt);
  }
  
  public int getSystemBarsBehavior()
  {
    return o00O0O0O.OooO00o(this.OooO0O0);
  }
  
  public boolean isAppearanceLightNavigationBars()
  {
    WindowInsetsController localWindowInsetsController = this.OooO0O0;
    int i = o00O0O0.OooO00o(localWindowInsetsController) & 0x10;
    if (i != 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localWindowInsetsController = null;
    }
    return i;
  }
  
  public boolean isAppearanceLightStatusBars()
  {
    WindowInsetsController localWindowInsetsController = this.OooO0O0;
    int i = o00O0O0.OooO00o(localWindowInsetsController) & 0x8;
    if (i != 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localWindowInsetsController = null;
    }
    return i;
  }
  
  public void setAppearanceLightNavigationBars(boolean paramBoolean)
  {
    int i = 16;
    Object localObject;
    if (paramBoolean)
    {
      localObject = this.OooO0Oo;
      if (localObject != null) {
        setSystemUiFlag(i);
      }
      localObject = this.OooO0O0;
      oo0o0O0.OooO00o((WindowInsetsController)localObject, i, i);
    }
    else
    {
      localObject = this.OooO0Oo;
      if (localObject != null) {
        OooO0OO(i);
      }
      localObject = this.OooO0O0;
      oo0o0O0.OooO00o((WindowInsetsController)localObject, 0, i);
    }
  }
  
  public void setAppearanceLightStatusBars(boolean paramBoolean)
  {
    int i = 8192;
    int j = 8;
    Object localObject;
    if (paramBoolean)
    {
      localObject = this.OooO0Oo;
      if (localObject != null) {
        setSystemUiFlag(i);
      }
      localObject = this.OooO0O0;
      oo0o0O0.OooO00o((WindowInsetsController)localObject, j, j);
    }
    else
    {
      localObject = this.OooO0Oo;
      if (localObject != null) {
        OooO0OO(i);
      }
      localObject = this.OooO0O0;
      i = 0;
      oo0o0O0.OooO00o((WindowInsetsController)localObject, 0, j);
    }
  }
  
  public void setSystemBarsBehavior(int paramInt)
  {
    o00O0OO0.OooO00o(this.OooO0O0, paramInt);
  }
  
  public void setSystemUiFlag(int paramInt)
  {
    View localView = this.OooO0Oo.getDecorView();
    int i = localView.getSystemUiVisibility();
    paramInt |= i;
    localView.setSystemUiVisibility(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsControllerCompat.Impl30
 * JD-Core Version:    0.7.0.1
 */