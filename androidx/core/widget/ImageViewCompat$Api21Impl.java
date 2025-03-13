package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;

class ImageViewCompat$Api21Impl
{
  public static ColorStateList OooO00o(ImageView paramImageView)
  {
    return paramImageView.getImageTintList();
  }
  
  public static PorterDuff.Mode OooO0O0(ImageView paramImageView)
  {
    return paramImageView.getImageTintMode();
  }
  
  public static void OooO0OO(ImageView paramImageView, ColorStateList paramColorStateList)
  {
    paramImageView.setImageTintList(paramColorStateList);
  }
  
  public static void OooO0Oo(ImageView paramImageView, PorterDuff.Mode paramMode)
  {
    paramImageView.setImageTintMode(paramMode);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.ImageViewCompat.Api21Impl
 * JD-Core Version:    0.7.0.1
 */