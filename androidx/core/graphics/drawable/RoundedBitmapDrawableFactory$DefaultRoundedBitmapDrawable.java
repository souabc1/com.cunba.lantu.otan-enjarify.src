package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.BitmapCompat;
import androidx.core.view.GravityCompat;

class RoundedBitmapDrawableFactory$DefaultRoundedBitmapDrawable
  extends RoundedBitmapDrawable
{
  public void OooO0O0(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2)
  {
    GravityCompat.OooO00o(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, 0);
  }
  
  public void setMipMap(boolean paramBoolean)
  {
    Bitmap localBitmap = this.OooO00o;
    if (localBitmap != null)
    {
      BitmapCompat.OooO00o(localBitmap, paramBoolean);
      invalidateSelf();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.drawable.RoundedBitmapDrawableFactory.DefaultRoundedBitmapDrawable
 * JD-Core Version:    0.7.0.1
 */