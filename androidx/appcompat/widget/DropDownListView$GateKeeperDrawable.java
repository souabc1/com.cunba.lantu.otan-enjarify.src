package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;

class DropDownListView$GateKeeperDrawable
  extends DrawableWrapperCompat
{
  public boolean o00Ooo00 = true;
  
  public DropDownListView$GateKeeperDrawable(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  public void draw(Canvas paramCanvas)
  {
    boolean bool = this.o00Ooo00;
    if (bool) {
      super.draw(paramCanvas);
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.o00Ooo00 = paramBoolean;
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    boolean bool = this.o00Ooo00;
    if (bool) {
      super.setHotspot(paramFloat1, paramFloat2);
    }
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = this.o00Ooo00;
    if (bool) {
      super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    boolean bool = this.o00Ooo00;
    if (bool) {
      return super.setState(paramArrayOfInt);
    }
    return false;
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = this.o00Ooo00;
    if (bool) {
      return super.setVisible(paramBoolean1, paramBoolean2);
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.DropDownListView.GateKeeperDrawable
 * JD-Core Version:    0.7.0.1
 */