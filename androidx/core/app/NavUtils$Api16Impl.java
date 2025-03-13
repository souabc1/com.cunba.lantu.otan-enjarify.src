package androidx.core.app;

import android.app.Activity;
import android.content.Intent;

class NavUtils$Api16Impl
{
  public static Intent OooO00o(Activity paramActivity)
  {
    return paramActivity.getParentActivityIntent();
  }
  
  public static boolean OooO0O0(Activity paramActivity, Intent paramIntent)
  {
    return paramActivity.navigateUpTo(paramIntent);
  }
  
  public static boolean OooO0OO(Activity paramActivity, Intent paramIntent)
  {
    return paramActivity.shouldUpRecreateTask(paramIntent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NavUtils.Api16Impl
 * JD-Core Version:    0.7.0.1
 */