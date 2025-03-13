package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

class ActionBarBackgroundDrawable
  extends Drawable
{
  public final ActionBarContainer OooO00o;
  
  public ActionBarBackgroundDrawable(ActionBarContainer paramActionBarContainer)
  {
    this.OooO00o = paramActionBarContainer;
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object localObject = this.OooO00o;
    boolean bool1 = ((ActionBarContainer)localObject).o00OooOO;
    if (bool1)
    {
      localObject = ((ActionBarContainer)localObject).o00OooO;
      if (localObject != null) {
        ((Drawable)localObject).draw(paramCanvas);
      }
    }
    else
    {
      localObject = ((ActionBarContainer)localObject).o00Ooo0o;
      if (localObject != null) {
        ((Drawable)localObject).draw(paramCanvas);
      }
      localObject = this.OooO00o;
      Drawable localDrawable = ((ActionBarContainer)localObject).o00OooO0;
      if (localDrawable != null)
      {
        boolean bool2 = ((ActionBarContainer)localObject).o00OooOo;
        if (bool2) {
          localDrawable.draw(paramCanvas);
        }
      }
    }
  }
  
  public int getOpacity()
  {
    return 0;
  }
  
  public void getOutline(Outline paramOutline)
  {
    Object localObject = this.OooO00o;
    boolean bool = ((ActionBarContainer)localObject).o00OooOO;
    if (bool)
    {
      Drawable localDrawable = ((ActionBarContainer)localObject).o00OooO;
      if (localDrawable == null) {
        return;
      }
      localObject = ((ActionBarContainer)localObject).o00Ooo0o;
    }
    else
    {
      localObject = ((ActionBarContainer)localObject).o00Ooo0o;
      if (localObject == null) {
        return;
      }
    }
    ActionBarBackgroundDrawable.Api21Impl.OooO00o((Drawable)localObject, paramOutline);
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActionBarBackgroundDrawable
 * JD-Core Version:    0.7.0.1
 */