package androidx.core.view;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import androidx.core.R.id;
import androidx.core.graphics.Insets;
import java.util.List;

class WindowInsetsAnimationCompat$Impl21
  extends WindowInsetsAnimationCompat.Impl
{
  public WindowInsetsAnimationCompat$Impl21(int paramInt, Interpolator paramInterpolator, long paramLong)
  {
    super(paramInt, paramInterpolator, paramLong);
  }
  
  public static WindowInsetsAnimationCompat.Callback OooO(View paramView)
  {
    int i = R.id.tag_window_insets_animation_callback;
    paramView = paramView.getTag(i);
    boolean bool = paramView instanceof WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener;
    if (bool) {
      paramView = ((WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener)paramView).OooO00o;
    } else {
      paramView = null;
    }
    return paramView;
  }
  
  public static int OooO00o(WindowInsetsCompat paramWindowInsetsCompat1, WindowInsetsCompat paramWindowInsetsCompat2)
  {
    int i = 0;
    int j = 1;
    for (;;)
    {
      int k = 256;
      if (j > k) {
        break;
      }
      Insets localInsets1 = paramWindowInsetsCompat1.getInsets(j);
      Insets localInsets2 = paramWindowInsetsCompat2.getInsets(j);
      boolean bool = localInsets1.equals(localInsets2);
      if (!bool) {
        i |= j;
      }
      j <<= 1;
    }
    return i;
  }
  
  public static WindowInsetsAnimationCompat.BoundsCompat OooO0O0(WindowInsetsCompat paramWindowInsetsCompat1, WindowInsetsCompat paramWindowInsetsCompat2, int paramInt)
  {
    paramWindowInsetsCompat1 = paramWindowInsetsCompat1.getInsets(paramInt);
    paramWindowInsetsCompat2 = paramWindowInsetsCompat2.getInsets(paramInt);
    paramInt = paramWindowInsetsCompat1.OooO00o;
    int i = paramWindowInsetsCompat2.OooO00o;
    paramInt = Math.min(paramInt, i);
    i = paramWindowInsetsCompat1.OooO0O0;
    int j = paramWindowInsetsCompat2.OooO0O0;
    i = Math.min(i, j);
    j = paramWindowInsetsCompat1.OooO0OO;
    int k = paramWindowInsetsCompat2.OooO0OO;
    j = Math.min(j, k);
    k = paramWindowInsetsCompat1.OooO0Oo;
    int m = paramWindowInsetsCompat2.OooO0Oo;
    k = Math.min(k, m);
    Insets localInsets = Insets.OooO0O0(paramInt, i, j, k);
    i = paramWindowInsetsCompat1.OooO00o;
    j = paramWindowInsetsCompat2.OooO00o;
    i = Math.max(i, j);
    j = paramWindowInsetsCompat1.OooO0O0;
    k = paramWindowInsetsCompat2.OooO0O0;
    j = Math.max(j, k);
    k = paramWindowInsetsCompat1.OooO0OO;
    m = paramWindowInsetsCompat2.OooO0OO;
    k = Math.max(k, m);
    int n = paramWindowInsetsCompat1.OooO0Oo;
    int i1 = paramWindowInsetsCompat2.OooO0Oo;
    n = Math.max(n, i1);
    paramWindowInsetsCompat1 = Insets.OooO0O0(i, j, k, n);
    paramWindowInsetsCompat2 = new androidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;
    paramWindowInsetsCompat2.<init>(localInsets, paramWindowInsetsCompat1);
    return paramWindowInsetsCompat2;
  }
  
  public static View.OnApplyWindowInsetsListener OooO0OO(View paramView, WindowInsetsAnimationCompat.Callback paramCallback)
  {
    WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener localImpl21OnApplyWindowInsetsListener = new androidx/core/view/WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener;
    localImpl21OnApplyWindowInsetsListener.<init>(paramView, paramCallback);
    return localImpl21OnApplyWindowInsetsListener;
  }
  
  public static void OooO0Oo(View paramView, WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat)
  {
    WindowInsetsAnimationCompat.Callback localCallback = OooO(paramView);
    if (localCallback != null)
    {
      localCallback.onEnd(paramWindowInsetsAnimationCompat);
      int i = localCallback.getDispatchMode();
      if (i == 0) {
        return;
      }
    }
    int j = paramView instanceof ViewGroup;
    if (j != 0)
    {
      paramView = (ViewGroup)paramView;
      j = 0;
      localCallback = null;
      for (;;)
      {
        int m = paramView.getChildCount();
        if (j >= m) {
          break;
        }
        View localView = paramView.getChildAt(j);
        OooO0Oo(localView, paramWindowInsetsAnimationCompat);
        int k;
        j += 1;
      }
    }
  }
  
  public static void OooO0o(View paramView, WindowInsetsCompat paramWindowInsetsCompat, List paramList)
  {
    WindowInsetsAnimationCompat.Callback localCallback = OooO(paramView);
    if (localCallback != null)
    {
      paramWindowInsetsCompat = localCallback.onProgress(paramWindowInsetsCompat, paramList);
      int i = localCallback.getDispatchMode();
      if (i == 0) {
        return;
      }
    }
    int j = paramView instanceof ViewGroup;
    if (j != 0)
    {
      paramView = (ViewGroup)paramView;
      j = 0;
      localCallback = null;
      for (;;)
      {
        int m = paramView.getChildCount();
        if (j >= m) {
          break;
        }
        View localView = paramView.getChildAt(j);
        OooO0o(localView, paramWindowInsetsCompat, paramList);
        int k;
        j += 1;
      }
    }
  }
  
  public static void OooO0o0(View paramView, WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, WindowInsets paramWindowInsets, boolean paramBoolean)
  {
    Object localObject = OooO(paramView);
    int i = 0;
    if (localObject != null)
    {
      ((WindowInsetsAnimationCompat.Callback)localObject).mDispachedInsets = paramWindowInsets;
      if (!paramBoolean)
      {
        ((WindowInsetsAnimationCompat.Callback)localObject).onPrepare(paramWindowInsetsAnimationCompat);
        paramBoolean = ((WindowInsetsAnimationCompat.Callback)localObject).getDispatchMode();
        if (!paramBoolean) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
      }
    }
    boolean bool = paramView instanceof ViewGroup;
    if (bool)
    {
      paramView = (ViewGroup)paramView;
      for (;;)
      {
        int j = paramView.getChildCount();
        if (i >= j) {
          break;
        }
        localObject = paramView.getChildAt(i);
        OooO0o0((View)localObject, paramWindowInsetsAnimationCompat, paramWindowInsets, paramBoolean);
        i += 1;
      }
    }
  }
  
  public static void OooO0oO(View paramView, WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat paramBoundsCompat)
  {
    WindowInsetsAnimationCompat.Callback localCallback = OooO(paramView);
    if (localCallback != null)
    {
      localCallback.onStart(paramWindowInsetsAnimationCompat, paramBoundsCompat);
      int i = localCallback.getDispatchMode();
      if (i == 0) {
        return;
      }
    }
    int j = paramView instanceof ViewGroup;
    if (j != 0)
    {
      paramView = (ViewGroup)paramView;
      j = 0;
      localCallback = null;
      for (;;)
      {
        int m = paramView.getChildCount();
        if (j >= m) {
          break;
        }
        View localView = paramView.getChildAt(j);
        OooO0oO(localView, paramWindowInsetsAnimationCompat, paramBoundsCompat);
        int k;
        j += 1;
      }
    }
  }
  
  public static WindowInsets OooO0oo(View paramView, WindowInsets paramWindowInsets)
  {
    int i = R.id.tag_on_apply_window_listener;
    Object localObject = paramView.getTag(i);
    if (localObject != null) {
      return paramWindowInsets;
    }
    return paramView.onApplyWindowInsets(paramWindowInsets);
  }
  
  public static WindowInsetsCompat OooOO0(WindowInsetsCompat paramWindowInsetsCompat1, WindowInsetsCompat paramWindowInsetsCompat2, float paramFloat, int paramInt)
  {
    WindowInsetsCompat.Builder localBuilder = new androidx/core/view/WindowInsetsCompat$Builder;
    localBuilder.<init>(paramWindowInsetsCompat1);
    int i = 1;
    for (;;)
    {
      int j = 256;
      if (i > j) {
        break;
      }
      j = paramInt & i;
      Insets localInsets1;
      if (j == 0)
      {
        localInsets1 = paramWindowInsetsCompat1.getInsets(i);
      }
      else
      {
        localInsets1 = paramWindowInsetsCompat1.getInsets(i);
        Insets localInsets2 = paramWindowInsetsCompat2.getInsets(i);
        int k = localInsets1.OooO00o;
        int m = localInsets2.OooO00o;
        float f1 = k - m;
        m = 1065353216;
        float f2 = 1.0F - paramFloat;
        f1 *= f2;
        double d1 = f1;
        double d2 = 0.5D;
        k = (int)(d1 + d2);
        int n = localInsets1.OooO0O0;
        int i1 = localInsets2.OooO0O0;
        float f3 = (n - i1) * f2;
        d1 = f3 + d2;
        n = (int)d1;
        i1 = localInsets1.OooO0OO;
        int i2 = localInsets2.OooO0OO;
        float f4 = (i1 - i2) * f2;
        i1 = (int)(f4 + d2);
        i2 = localInsets1.OooO0Oo;
        int i3 = localInsets2.OooO0Oo;
        i2 -= i3;
        float f5 = i2 * f2;
        double d3 = f5 + d2;
        i3 = (int)d3;
        localInsets1 = WindowInsetsCompat.OooO0oO(localInsets1, k, n, i1, i3);
      }
      localBuilder.OooO0O0(i, localInsets1);
      i <<= 1;
    }
    return localBuilder.OooO00o();
  }
  
  public static void OooOO0O(View paramView, WindowInsetsAnimationCompat.Callback paramCallback)
  {
    int i = R.id.tag_on_apply_window_listener;
    Object localObject = paramView.getTag(i);
    int k;
    if (paramCallback == null)
    {
      int j = R.id.tag_window_insets_animation_callback;
      k = 0;
      paramView.setTag(j, null);
      if (localObject == null) {
        paramView.setOnApplyWindowInsetsListener(null);
      }
    }
    else
    {
      paramCallback = OooO0OO(paramView, paramCallback);
      k = R.id.tag_window_insets_animation_callback;
      paramView.setTag(k, paramCallback);
      if (localObject == null) {
        paramView.setOnApplyWindowInsetsListener(paramCallback);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Impl21
 * JD-Core Version:    0.7.0.1
 */