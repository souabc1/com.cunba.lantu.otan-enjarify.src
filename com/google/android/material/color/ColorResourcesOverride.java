package com.google.android.material.color;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.core.os.BuildCompat;
import java.util.Map;

public abstract interface ColorResourcesOverride
{
  public static ColorResourcesOverride getInstance()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (j <= i)
    {
      j = 33;
      if (i <= j) {
        return ResourcesLoaderColorResourcesOverride.getInstance();
      }
    }
    boolean bool = BuildCompat.isAtLeastU();
    if (bool) {
      return ResourcesLoaderColorResourcesOverride.getInstance();
    }
    return null;
  }
  
  public abstract boolean applyIfPossible(Context paramContext, Map paramMap);
  
  public abstract Context wrapContextIfPossible(Context paramContext, Map paramMap);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.ColorResourcesOverride
 * JD-Core Version:    0.7.0.1
 */