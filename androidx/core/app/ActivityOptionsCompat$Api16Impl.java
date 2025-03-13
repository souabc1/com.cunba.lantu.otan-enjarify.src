package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;

class ActivityOptionsCompat$Api16Impl
{
  public static ActivityOptions OooO00o(Context paramContext, int paramInt1, int paramInt2)
  {
    return ActivityOptions.makeCustomAnimation(paramContext, paramInt1, paramInt2);
  }
  
  public static ActivityOptions OooO0O0(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return ActivityOptions.makeScaleUpAnimation(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static ActivityOptions OooO0OO(View paramView, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    return ActivityOptions.makeThumbnailScaleUpAnimation(paramView, paramBitmap, paramInt1, paramInt2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityOptionsCompat.Api16Impl
 * JD-Core Version:    0.7.0.1
 */