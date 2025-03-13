package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;

public class AppCompatSeekBar
  extends SeekBar
{
  public final AppCompatSeekBarHelper o00OoOoo;
  
  public AppCompatSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public AppCompatSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = getContext();
    ThemeUtils.OooO00o(this, paramContext);
    paramContext = new androidx/appcompat/widget/AppCompatSeekBarHelper;
    paramContext.<init>(this);
    this.o00OoOoo = paramContext;
    paramContext.OooO00o(paramAttributeSet, paramInt);
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    this.o00OoOoo.OooO0o();
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    this.o00OoOoo.OooO0oO();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      AppCompatSeekBarHelper localAppCompatSeekBarHelper = this.o00OoOoo;
      localAppCompatSeekBarHelper.OooO0o0(paramCanvas);
      return;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatSeekBar
 * JD-Core Version:    0.7.0.1
 */