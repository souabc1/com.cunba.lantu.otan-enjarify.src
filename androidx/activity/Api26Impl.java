package androidx.activity;

import android.app.Activity;
import android.app.PictureInPictureParams.Builder;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

public final class Api26Impl
{
  public static final Api26Impl OooO00o;
  
  static
  {
    Api26Impl localApi26Impl = new androidx/activity/Api26Impl;
    localApi26Impl.<init>();
    OooO00o = localApi26Impl;
  }
  
  public final void OooO00o(Activity paramActivity, Rect paramRect)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    Intrinsics.OooO0o(paramRect, "hint");
    PictureInPictureParams.Builder localBuilder = new android/app/PictureInPictureParams$Builder;
    localBuilder.<init>();
    paramRect = localBuilder.setSourceRectHint(paramRect).build();
    paramActivity.setPictureInPictureParams(paramRect);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.Api26Impl
 * JD-Core Version:    0.7.0.1
 */