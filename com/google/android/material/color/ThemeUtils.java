package com.google.android.material.color;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.view.View;
import android.view.Window;

final class ThemeUtils
{
  public static void applyThemeOverlay(Context paramContext, int paramInt)
  {
    Resources.Theme localTheme = paramContext.getTheme();
    boolean bool1 = true;
    localTheme.applyStyle(paramInt, bool1);
    boolean bool2 = paramContext instanceof Activity;
    if (bool2)
    {
      paramContext = getWindowDecorViewTheme((Activity)paramContext);
      if (paramContext != null) {
        paramContext.applyStyle(paramInt, bool1);
      }
    }
  }
  
  private static Resources.Theme getWindowDecorViewTheme(Activity paramActivity)
  {
    paramActivity = paramActivity.getWindow();
    if (paramActivity != null)
    {
      paramActivity = paramActivity.peekDecorView();
      if (paramActivity != null)
      {
        paramActivity = paramActivity.getContext();
        if (paramActivity != null) {
          return paramActivity.getTheme();
        }
      }
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.ThemeUtils
 * JD-Core Version:    0.7.0.1
 */