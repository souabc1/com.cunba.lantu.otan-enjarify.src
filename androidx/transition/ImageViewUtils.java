package androidx.transition;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.ImageView;

class ImageViewUtils
{
  public static boolean OooO00o = true;
  
  public static void OooO00o(ImageView paramImageView, Matrix paramMatrix)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      OooO0OO.OooO00o(paramImageView, paramMatrix);
    }
    else if (paramMatrix == null)
    {
      paramMatrix = paramImageView.getDrawable();
      if (paramMatrix != null)
      {
        i = paramImageView.getWidth();
        j = paramImageView.getPaddingLeft();
        i -= j;
        j = paramImageView.getPaddingRight();
        i -= j;
        j = paramImageView.getHeight();
        int k = paramImageView.getPaddingTop();
        j -= k;
        k = paramImageView.getPaddingBottom();
        j -= k;
        k = 0;
        paramMatrix.setBounds(0, 0, i, j);
        paramImageView.invalidate();
      }
    }
    else
    {
      OooO0O0(paramImageView, paramMatrix);
    }
  }
  
  public static void OooO0O0(ImageView paramImageView, Matrix paramMatrix)
  {
    boolean bool = OooO00o;
    if (bool) {
      try
      {
        OooO0OO.OooO00o(paramImageView, paramMatrix);
      }
      catch (NoSuchMethodError localNoSuchMethodError)
      {
        paramImageView = null;
        OooO00o = false;
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.ImageViewUtils
 * JD-Core Version:    0.7.0.1
 */