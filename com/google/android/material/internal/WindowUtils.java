package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.WindowManager;
import m54207b69;

public class WindowUtils
{
  private static final String TAG = "WindowUtils";
  
  public static Rect getCurrentWindowBounds(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("LM3A25252C263F");
    paramContext = (WindowManager)paramContext.getSystemService(str);
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j) {
      return WindowUtils.Api30Impl.getCurrentWindowBounds(paramContext);
    }
    return WindowUtils.Api17Impl.getCurrentWindowBounds(paramContext);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.WindowUtils
 * JD-Core Version:    0.7.0.1
 */