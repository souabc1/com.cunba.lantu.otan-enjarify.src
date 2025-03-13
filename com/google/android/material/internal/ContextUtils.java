package com.google.android.material.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

public class ContextUtils
{
  public static Activity getActivity(Context paramContext)
  {
    for (;;)
    {
      boolean bool = paramContext instanceof ContextWrapper;
      if (!bool) {
        break;
      }
      bool = paramContext instanceof Activity;
      if (bool) {
        return (Activity)paramContext;
      }
      paramContext = ((ContextWrapper)paramContext).getBaseContext();
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ContextUtils
 * JD-Core Version:    0.7.0.1
 */