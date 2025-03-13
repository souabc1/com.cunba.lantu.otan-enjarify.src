package androidx.core.widget;

import android.view.View;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar
  extends ProgressBar
{
  public final Runnable o00OoOoo;
  public final Runnable o00Ooo00;
  
  public final void OooO00o()
  {
    Runnable localRunnable = this.o00OoOoo;
    removeCallbacks(localRunnable);
    localRunnable = this.o00Ooo00;
    removeCallbacks(localRunnable);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    OooO00o();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    OooO00o();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.ContentLoadingProgressBar
 * JD-Core Version:    0.7.0.1
 */