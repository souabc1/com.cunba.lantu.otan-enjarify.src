package com.google.android.material.internal;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.color.MaterialColors;

public class EdgeToEdgeUtils
{
  private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;
  
  public static void applyEdgeToEdge(Window paramWindow, boolean paramBoolean)
  {
    applyEdgeToEdge(paramWindow, paramBoolean, null, null);
  }
  
  public static void applyEdgeToEdge(Window paramWindow, boolean paramBoolean, Integer paramInteger1, Integer paramInteger2)
  {
    boolean bool1 = false;
    int j = 1;
    if (paramInteger1 != null)
    {
      k = paramInteger1.intValue();
      if (k != 0)
      {
        k = 0;
        break label34;
      }
    }
    int k = j;
    label34:
    int m;
    if (paramInteger2 != null)
    {
      m = paramInteger2.intValue();
      if (m != 0) {}
    }
    else
    {
      bool1 = j;
    }
    if ((k != 0) || (bool1))
    {
      Context localContext = paramWindow.getContext();
      m = 16842801;
      int n = -16777216;
      j = MaterialColors.getColor(localContext, m, n);
      if (k != 0) {
        paramInteger1 = Integer.valueOf(j);
      }
      if (bool1) {
        paramInteger2 = Integer.valueOf(j);
      }
    }
    bool1 = paramBoolean ^ true;
    WindowCompat.OooO0O0(paramWindow, bool1);
    int i = getStatusBarColor(paramWindow.getContext(), paramBoolean);
    paramBoolean = getNavigationBarColor(paramWindow.getContext(), paramBoolean);
    paramWindow.setStatusBarColor(i);
    paramWindow.setNavigationBarColor(paramBoolean);
    boolean bool2 = MaterialColors.isColorLight(paramInteger1.intValue());
    bool2 = isUsingLightSystemBar(i, bool2);
    setLightStatusBar(paramWindow, bool2);
    bool2 = MaterialColors.isColorLight(paramInteger2.intValue());
    paramBoolean = isUsingLightSystemBar(paramBoolean, bool2);
    setLightNavigationBar(paramWindow, paramBoolean);
  }
  
  private static int getNavigationBarColor(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {
      return 0;
    }
    return MaterialColors.getColor(paramContext, 16843858, -16777216);
  }
  
  private static int getStatusBarColor(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {
      return 0;
    }
    return MaterialColors.getColor(paramContext, 16843857, -16777216);
  }
  
  private static boolean isUsingLightSystemBar(int paramInt, boolean paramBoolean)
  {
    boolean bool = MaterialColors.isColorLight(paramInt);
    if ((!bool) && ((paramInt != 0) || (!paramBoolean))) {
      paramInt = 0;
    } else {
      paramInt = 1;
    }
    return paramInt;
  }
  
  public static void setLightNavigationBar(Window paramWindow, boolean paramBoolean)
  {
    View localView = paramWindow.getDecorView();
    WindowCompat.OooO00o(paramWindow, localView).setAppearanceLightNavigationBars(paramBoolean);
  }
  
  public static void setLightStatusBar(Window paramWindow, boolean paramBoolean)
  {
    View localView = paramWindow.getDecorView();
    WindowCompat.OooO00o(paramWindow, localView).setAppearanceLightStatusBars(paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.EdgeToEdgeUtils
 * JD-Core Version:    0.7.0.1
 */