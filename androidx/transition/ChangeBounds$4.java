package androidx.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

class ChangeBounds$4
  extends Property
{
  public ChangeBounds$4(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public PointF OooO00o(View paramView)
  {
    return null;
  }
  
  public void OooO0O0(View paramView, PointF paramPointF)
  {
    int i = paramView.getLeft();
    int j = paramView.getTop();
    int k = Math.round(paramPointF.x);
    int m = Math.round(paramPointF.y);
    ViewUtils.OooO0oO(paramView, i, j, k, m);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.ChangeBounds.4
 * JD-Core Version:    0.7.0.1
 */