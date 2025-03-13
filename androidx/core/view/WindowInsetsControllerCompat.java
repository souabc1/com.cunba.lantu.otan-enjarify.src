package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public final class WindowInsetsControllerCompat
{
  public final WindowInsetsControllerCompat.Impl OooO00o;
  
  public WindowInsetsControllerCompat(Window paramWindow, View paramView)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j)
    {
      paramView = new androidx/core/view/WindowInsetsControllerCompat$Impl30;
      paramView.<init>(paramWindow, this);
      this.OooO00o = paramView;
    }
    else
    {
      WindowInsetsControllerCompat.Impl26 localImpl26 = new androidx/core/view/WindowInsetsControllerCompat$Impl26;
      localImpl26.<init>(paramWindow, paramView);
      this.OooO00o = localImpl26;
    }
  }
  
  public WindowInsetsControllerCompat(WindowInsetsController paramWindowInsetsController)
  {
    WindowInsetsControllerCompat.Impl30 localImpl30 = new androidx/core/view/WindowInsetsControllerCompat$Impl30;
    localImpl30.<init>(paramWindowInsetsController, this);
    this.OooO00o = localImpl30;
  }
  
  public static WindowInsetsControllerCompat OooO0OO(WindowInsetsController paramWindowInsetsController)
  {
    WindowInsetsControllerCompat localWindowInsetsControllerCompat = new androidx/core/view/WindowInsetsControllerCompat;
    localWindowInsetsControllerCompat.<init>(paramWindowInsetsController);
    return localWindowInsetsControllerCompat;
  }
  
  public void OooO00o(int paramInt)
  {
    this.OooO00o.OooO00o(paramInt);
  }
  
  public void OooO0O0(int paramInt)
  {
    this.OooO00o.OooO0O0(paramInt);
  }
  
  public int getSystemBarsBehavior()
  {
    return this.OooO00o.getSystemBarsBehavior();
  }
  
  public boolean isAppearanceLightNavigationBars()
  {
    return this.OooO00o.isAppearanceLightNavigationBars();
  }
  
  public boolean isAppearanceLightStatusBars()
  {
    return this.OooO00o.isAppearanceLightStatusBars();
  }
  
  public void setAppearanceLightNavigationBars(boolean paramBoolean)
  {
    this.OooO00o.setAppearanceLightNavigationBars(paramBoolean);
  }
  
  public void setAppearanceLightStatusBars(boolean paramBoolean)
  {
    this.OooO00o.setAppearanceLightStatusBars(paramBoolean);
  }
  
  public void setSystemBarsBehavior(int paramInt)
  {
    this.OooO00o.setSystemBarsBehavior(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsControllerCompat
 * JD-Core Version:    0.7.0.1
 */