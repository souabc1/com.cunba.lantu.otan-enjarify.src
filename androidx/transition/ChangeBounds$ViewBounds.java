package androidx.transition;

import android.graphics.PointF;
import android.view.View;

class ChangeBounds$ViewBounds
{
  public int OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public View OooO0o0;
  public int OooO0oO;
  
  public ChangeBounds$ViewBounds(View paramView)
  {
    this.OooO0o0 = paramView;
  }
  
  public final void OooO00o()
  {
    View localView = this.OooO0o0;
    int i = this.OooO00o;
    int j = this.OooO0O0;
    int k = this.OooO0OO;
    int m = this.OooO0Oo;
    ViewUtils.OooO0oO(localView, i, j, k, m);
    this.OooO0o = 0;
    this.OooO0oO = 0;
  }
  
  public void setBottomRight(PointF paramPointF)
  {
    float f1 = paramPointF.x;
    int i = Math.round(f1);
    this.OooO0OO = i;
    float f2 = paramPointF.y;
    int j = Math.round(f2);
    this.OooO0Oo = j;
    j = this.OooO0oO + 1;
    this.OooO0oO = j;
    i = this.OooO0o;
    if (i == j) {
      OooO00o();
    }
  }
  
  public void setTopLeft(PointF paramPointF)
  {
    float f1 = paramPointF.x;
    int i = Math.round(f1);
    this.OooO00o = i;
    float f2 = paramPointF.y;
    int j = Math.round(f2);
    this.OooO0O0 = j;
    j = this.OooO0o + 1;
    this.OooO0o = j;
    i = this.OooO0oO;
    if (j == i) {
      OooO00o();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.ChangeBounds.ViewBounds
 * JD-Core Version:    0.7.0.1
 */