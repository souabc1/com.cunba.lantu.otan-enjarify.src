package androidx.core.view;

import android.view.WindowInsetsAnimationController;
import androidx.core.graphics.Insets;

public final class WindowInsetsAnimationControllerCompat
{
  public final WindowInsetsAnimationControllerCompat.Impl OooO00o;
  
  public WindowInsetsAnimationControllerCompat(WindowInsetsAnimationController paramWindowInsetsAnimationController)
  {
    WindowInsetsAnimationControllerCompat.Impl30 localImpl30 = new androidx/core/view/WindowInsetsAnimationControllerCompat$Impl30;
    localImpl30.<init>(paramWindowInsetsAnimationController);
    this.OooO00o = localImpl30;
  }
  
  public float getCurrentAlpha()
  {
    return this.OooO00o.getCurrentAlpha();
  }
  
  public float getCurrentFraction()
  {
    return this.OooO00o.getCurrentFraction();
  }
  
  public Insets getCurrentInsets()
  {
    return this.OooO00o.getCurrentInsets();
  }
  
  public Insets getHiddenStateInsets()
  {
    return this.OooO00o.getHiddenStateInsets();
  }
  
  public Insets getShownStateInsets()
  {
    return this.OooO00o.getShownStateInsets();
  }
  
  public int getTypes()
  {
    return this.OooO00o.getTypes();
  }
  
  public boolean isCancelled()
  {
    return this.OooO00o.isCancelled();
  }
  
  public boolean isFinished()
  {
    return this.OooO00o.isFinished();
  }
  
  public boolean isReady()
  {
    boolean bool = isFinished();
    if (!bool)
    {
      bool = isCancelled();
      if (!bool) {
        return true;
      }
    }
    bool = false;
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationControllerCompat
 * JD-Core Version:    0.7.0.1
 */