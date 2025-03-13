package androidx.transition;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

class ChangeBounds$1
  extends Property
{
  public Rect OooO00o;
  
  public ChangeBounds$1(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
    paramClass = new android/graphics/Rect;
    paramClass.<init>();
    this.OooO00o = paramClass;
  }
  
  public PointF OooO00o(Drawable paramDrawable)
  {
    Rect localRect = this.OooO00o;
    paramDrawable.copyBounds(localRect);
    paramDrawable = new android/graphics/PointF;
    localRect = this.OooO00o;
    float f1 = localRect.left;
    float f2 = localRect.top;
    paramDrawable.<init>(f1, f2);
    return paramDrawable;
  }
  
  public void OooO0O0(Drawable paramDrawable, PointF paramPointF)
  {
    Rect localRect = this.OooO00o;
    paramDrawable.copyBounds(localRect);
    localRect = this.OooO00o;
    int i = Math.round(paramPointF.x);
    int j = Math.round(paramPointF.y);
    localRect.offsetTo(i, j);
    paramPointF = this.OooO00o;
    paramDrawable.setBounds(paramPointF);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.ChangeBounds.1
 * JD-Core Version:    0.7.0.1
 */