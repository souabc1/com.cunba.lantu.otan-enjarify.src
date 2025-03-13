package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

class RoundedBitmapDrawable21
  extends RoundedBitmapDrawable
{
  public void OooO0O0(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2)
  {
    Gravity.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, 0);
  }
  
  public void getOutline(Outline paramOutline)
  {
    OooO0o0();
    Rect localRect = this.OooO0oo;
    float f = getCornerRadius();
    paramOutline.setRoundRect(localRect, f);
  }
  
  public void setMipMap(boolean paramBoolean)
  {
    Bitmap localBitmap = this.OooO00o;
    if (localBitmap != null)
    {
      localBitmap.setHasMipMap(paramBoolean);
      invalidateSelf();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.drawable.RoundedBitmapDrawable21
 * JD-Core Version:    0.7.0.1
 */