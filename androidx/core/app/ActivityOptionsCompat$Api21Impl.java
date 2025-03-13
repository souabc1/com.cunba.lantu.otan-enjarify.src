package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.util.Pair;
import android.view.View;

class ActivityOptionsCompat$Api21Impl
{
  public static ActivityOptions OooO00o(Activity paramActivity, View paramView, String paramString)
  {
    return ActivityOptions.makeSceneTransitionAnimation(paramActivity, paramView, paramString);
  }
  
  public static ActivityOptions OooO0O0(Activity paramActivity, Pair... paramVarArgs)
  {
    return ActivityOptions.makeSceneTransitionAnimation(paramActivity, paramVarArgs);
  }
  
  public static ActivityOptions OooO0OO()
  {
    return ActivityOptions.makeTaskLaunchBehind();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityOptionsCompat.Api21Impl
 * JD-Core Version:    0.7.0.1
 */