package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public class AppCompatRatingBar
  extends RatingBar
{
  public final AppCompatProgressBarHelper o00OoOoo;
  
  public AppCompatRatingBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public AppCompatRatingBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = getContext();
    ThemeUtils.OooO00o(this, paramContext);
    paramContext = new androidx/appcompat/widget/AppCompatProgressBarHelper;
    paramContext.<init>(this);
    this.o00OoOoo = paramContext;
    paramContext.OooO00o(paramAttributeSet, paramInt);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      Object localObject1 = this.o00OoOoo;
      localObject1 = ((AppCompatProgressBarHelper)localObject1).getSampleTile();
      if (localObject1 != null)
      {
        paramInt2 = ((Bitmap)localObject1).getWidth();
        int i = getNumStars();
        paramInt2 *= i;
        i = 0;
        paramInt1 = View.resolveSizeAndState(paramInt2, paramInt1, 0);
        paramInt2 = getMeasuredHeight();
        setMeasuredDimension(paramInt1, paramInt2);
      }
      return;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatRatingBar
 * JD-Core Version:    0.7.0.1
 */