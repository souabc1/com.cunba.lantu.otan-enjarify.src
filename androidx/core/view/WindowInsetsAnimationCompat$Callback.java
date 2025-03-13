package androidx.core.view;

import android.view.WindowInsets;
import java.util.List;

public abstract class WindowInsetsAnimationCompat$Callback
{
  public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
  public static final int DISPATCH_MODE_STOP;
  WindowInsets mDispachedInsets;
  private final int mDispatchMode;
  
  public WindowInsetsAnimationCompat$Callback(int paramInt)
  {
    this.mDispatchMode = paramInt;
  }
  
  public final int getDispatchMode()
  {
    return this.mDispatchMode;
  }
  
  public void onEnd(WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat) {}
  
  public void onPrepare(WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat) {}
  
  public abstract WindowInsetsCompat onProgress(WindowInsetsCompat paramWindowInsetsCompat, List paramList);
  
  public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat paramBoundsCompat)
  {
    return paramBoundsCompat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Callback
 * JD-Core Version:    0.7.0.1
 */