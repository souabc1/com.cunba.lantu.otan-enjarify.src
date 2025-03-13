package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import androidx.core.R.id;

class ViewCompat$Api21Impl
{
  public static float OooO(View paramView)
  {
    return paramView.getElevation();
  }
  
  public static void OooO00o(WindowInsets paramWindowInsets, View paramView)
  {
    int i = R.id.tag_window_insets_animation_callback;
    View.OnApplyWindowInsetsListener localOnApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)paramView.getTag(i);
    if (localOnApplyWindowInsetsListener != null) {
      localOnApplyWindowInsetsListener.onApplyWindowInsets(paramView, paramWindowInsets);
    }
  }
  
  public static WindowInsetsCompat OooO0O0(View paramView, WindowInsetsCompat paramWindowInsetsCompat, Rect paramRect)
  {
    WindowInsets localWindowInsets = paramWindowInsetsCompat.OooO();
    if (localWindowInsets != null) {
      return WindowInsetsCompat.OooOO0O(paramView.computeSystemWindowInsets(localWindowInsets, paramRect), paramView);
    }
    paramRect.setEmpty();
    return paramWindowInsetsCompat;
  }
  
  public static boolean OooO0OO(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return paramView.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public static boolean OooO0Oo(View paramView, float paramFloat1, float paramFloat2)
  {
    return paramView.dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public static boolean OooO0o(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return paramView.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  public static boolean OooO0o0(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return paramView.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public static ColorStateList OooO0oO(View paramView)
  {
    return paramView.getBackgroundTintList();
  }
  
  public static PorterDuff.Mode OooO0oo(View paramView)
  {
    return paramView.getBackgroundTintMode();
  }
  
  public static WindowInsetsCompat OooOO0(View paramView)
  {
    return WindowInsetsCompat.Api21ReflectionHolder.OooO00o(paramView);
  }
  
  public static String OooOO0O(View paramView)
  {
    return paramView.getTransitionName();
  }
  
  public static float OooOO0o(View paramView)
  {
    return paramView.getTranslationZ();
  }
  
  public static boolean OooOOO(View paramView)
  {
    return paramView.hasNestedScrollingParent();
  }
  
  public static float OooOOO0(View paramView)
  {
    return paramView.getZ();
  }
  
  public static boolean OooOOOO(View paramView)
  {
    return paramView.isImportantForAccessibility();
  }
  
  public static boolean OooOOOo(View paramView)
  {
    return paramView.isNestedScrollingEnabled();
  }
  
  public static void OooOOo(View paramView, PorterDuff.Mode paramMode)
  {
    paramView.setBackgroundTintMode(paramMode);
  }
  
  public static void OooOOo0(View paramView, ColorStateList paramColorStateList)
  {
    paramView.setBackgroundTintList(paramColorStateList);
  }
  
  public static void OooOOoo(View paramView, float paramFloat)
  {
    paramView.setElevation(paramFloat);
  }
  
  public static void OooOo(View paramView, float paramFloat)
  {
    paramView.setZ(paramFloat);
  }
  
  public static void OooOo0(View paramView, OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i < j)
    {
      i = R.id.tag_on_apply_window_listener;
      paramView.setTag(i, paramOnApplyWindowInsetsListener);
    }
    if (paramOnApplyWindowInsetsListener == null)
    {
      int k = R.id.tag_window_insets_animation_callback;
      paramOnApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)paramView.getTag(k);
      paramView.setOnApplyWindowInsetsListener(paramOnApplyWindowInsetsListener);
      return;
    }
    ViewCompat.Api21Impl.1 local1 = new androidx/core/view/ViewCompat$Api21Impl$1;
    local1.<init>(paramView, paramOnApplyWindowInsetsListener);
    paramView.setOnApplyWindowInsetsListener(local1);
  }
  
  public static void OooOo00(View paramView, boolean paramBoolean)
  {
    paramView.setNestedScrollingEnabled(paramBoolean);
  }
  
  public static void OooOo0O(View paramView, String paramString)
  {
    paramView.setTransitionName(paramString);
  }
  
  public static void OooOo0o(View paramView, float paramFloat)
  {
    paramView.setTranslationZ(paramFloat);
  }
  
  public static void OooOoO(View paramView)
  {
    paramView.stopNestedScroll();
  }
  
  public static boolean OooOoO0(View paramView, int paramInt)
  {
    return paramView.startNestedScroll(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.Api21Impl
 * JD-Core Version:    0.7.0.1
 */