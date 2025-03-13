package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class FitWindowsFrameLayout
  extends FrameLayout
  implements FitWindowsViewGroup
{
  public FitWindowsViewGroup.OnFitSystemWindowsListener o00OoOoo;
  
  public FitWindowsFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean fitSystemWindows(Rect paramRect)
  {
    FitWindowsViewGroup.OnFitSystemWindowsListener localOnFitSystemWindowsListener = this.o00OoOoo;
    if (localOnFitSystemWindowsListener != null) {
      localOnFitSystemWindowsListener.OooO00o(paramRect);
    }
    return super.fitSystemWindows(paramRect);
  }
  
  public void setOnFitSystemWindowsListener(FitWindowsViewGroup.OnFitSystemWindowsListener paramOnFitSystemWindowsListener)
  {
    this.o00OoOoo = paramOnFitSystemWindowsListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.FitWindowsFrameLayout
 * JD-Core Version:    0.7.0.1
 */