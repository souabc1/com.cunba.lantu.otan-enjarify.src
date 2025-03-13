package androidx.core.view;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

class WindowInsetsControllerCompat$Impl20
  extends WindowInsetsControllerCompat.Impl
{
  public final Window OooO00o;
  public final View OooO0O0;
  
  public WindowInsetsControllerCompat$Impl20(Window paramWindow, View paramView)
  {
    this.OooO00o = paramWindow;
    this.OooO0O0 = paramView;
  }
  
  public void OooO00o(int paramInt)
  {
    int i = 1;
    for (;;)
    {
      int j = 256;
      if (i > j) {
        break;
      }
      j = paramInt & i;
      if (j != 0) {
        OooO0Oo(i);
      }
      i <<= 1;
    }
  }
  
  public void OooO0O0(int paramInt)
  {
    int i = 1;
    for (;;)
    {
      int j = 256;
      if (i > j) {
        break;
      }
      j = paramInt & i;
      if (j != 0) {
        OooO0o(i);
      }
      i <<= 1;
    }
  }
  
  public final void OooO0Oo(int paramInt)
  {
    int i = 1;
    if (paramInt != i)
    {
      i = 2;
      if (paramInt != i)
      {
        i = 8;
        if (paramInt == i)
        {
          InputMethodManager localInputMethodManager = (InputMethodManager)this.OooO00o.getContext().getSystemService("input_method");
          IBinder localIBinder = this.OooO00o.getDecorView().getWindowToken();
          localInputMethodManager.hideSoftInputFromWindow(localIBinder, 0);
        }
        return;
      }
      setSystemUiFlag(i);
      return;
    }
    setSystemUiFlag(4);
  }
  
  public final void OooO0o(int paramInt)
  {
    int i = 1;
    if (paramInt != i)
    {
      i = 2;
      label67:
      int k;
      if (paramInt != i)
      {
        i = 8;
        if (paramInt == i)
        {
          Object localObject = this.OooO0O0;
          boolean bool = ((View)localObject).isInEditMode();
          if (!bool)
          {
            bool = ((View)localObject).onCheckIsTextEditor();
            if (!bool)
            {
              localObject = this.OooO00o.getCurrentFocus();
              break label67;
            }
          }
          ((View)localObject).requestFocus();
          if (localObject == null)
          {
            localObject = this.OooO00o;
            int j = 16908290;
            localObject = ((Window)localObject).findViewById(j);
          }
          if (localObject != null)
          {
            k = ((View)localObject).hasWindowFocus();
            if (k != 0)
            {
              o00O0 localo00O0 = new androidx/core/view/o00O0;
              localo00O0.<init>((View)localObject);
              ((View)localObject).post(localo00O0);
            }
          }
        }
        return;
      }
      OooO0oO(k);
      return;
    }
    OooO0oO(4);
    OooO0oo(1024);
  }
  
  public void OooO0oO(int paramInt)
  {
    View localView = this.OooO00o.getDecorView();
    int i = localView.getSystemUiVisibility();
    paramInt = (paramInt ^ 0xFFFFFFFF) & i;
    localView.setSystemUiVisibility(paramInt);
  }
  
  public void OooO0oo(int paramInt)
  {
    this.OooO00o.clearFlags(paramInt);
  }
  
  public int getSystemBarsBehavior()
  {
    return 0;
  }
  
  public void setSystemBarsBehavior(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      int j = 2048;
      int k = 4096;
      if (paramInt != i)
      {
        i = 2;
        if (paramInt == i)
        {
          OooO0oO(j);
          setSystemUiFlag(k);
        }
      }
      else
      {
        OooO0oO(k);
        setSystemUiFlag(j);
      }
    }
    else
    {
      paramInt = 6144;
      OooO0oO(paramInt);
    }
  }
  
  public void setSystemUiFlag(int paramInt)
  {
    View localView = this.OooO00o.getDecorView();
    int i = localView.getSystemUiVisibility();
    paramInt |= i;
    localView.setSystemUiVisibility(paramInt);
  }
  
  public void setWindowFlag(int paramInt)
  {
    this.OooO00o.addFlags(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsControllerCompat.Impl20
 * JD-Core Version:    0.7.0.1
 */