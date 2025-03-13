package androidx.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

class ChangeBounds$6
  extends Property
{
  public ChangeBounds$6(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public PointF OooO00o(View paramView)
  {
    return null;
  }
  
  public void OooO0O0(View paramView, PointF paramPointF)
  {
    int i = Math.round(paramPointF.x);
    int j = Math.round(paramPointF.y);
    int k = paramView.getWidth() + i;
    int m = paramView.getHeight() + j;
    ViewUtils.OooO0oO(paramView, i, j, k, m);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.ChangeBounds.6
 * JD-Core Version:    0.7.0.1
 */