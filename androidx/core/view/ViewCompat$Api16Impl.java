package androidx.core.view;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.accessibility.AccessibilityNodeProvider;

class ViewCompat$Api16Impl
{
  public static boolean OooO(View paramView)
  {
    return paramView.hasTransientState();
  }
  
  public static AccessibilityNodeProvider OooO00o(View paramView)
  {
    return paramView.getAccessibilityNodeProvider();
  }
  
  public static boolean OooO0O0(View paramView)
  {
    return paramView.getFitsSystemWindows();
  }
  
  public static int OooO0OO(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }
  
  public static int OooO0Oo(View paramView)
  {
    return paramView.getMinimumHeight();
  }
  
  public static ViewParent OooO0o(View paramView)
  {
    return paramView.getParentForAccessibility();
  }
  
  public static int OooO0o0(View paramView)
  {
    return paramView.getMinimumWidth();
  }
  
  public static int OooO0oO(View paramView)
  {
    return paramView.getWindowSystemUiVisibility();
  }
  
  public static boolean OooO0oo(View paramView)
  {
    return paramView.hasOverlappingRendering();
  }
  
  public static boolean OooOO0(View paramView, int paramInt, Bundle paramBundle)
  {
    return paramView.performAccessibilityAction(paramInt, paramBundle);
  }
  
  public static void OooOO0O(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }
  
  public static void OooOO0o(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.postInvalidateOnAnimation(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void OooOOO(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }
  
  public static void OooOOO0(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }
  
  public static void OooOOOO(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramViewTreeObserver.removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
  }
  
  public static void OooOOOo(View paramView)
  {
    paramView.requestFitSystemWindows();
  }
  
  public static void OooOOo(View paramView, boolean paramBoolean)
  {
    paramView.setHasTransientState(paramBoolean);
  }
  
  public static void OooOOo0(View paramView, Drawable paramDrawable)
  {
    paramView.setBackground(paramDrawable);
  }
  
  public static void OooOOoo(View paramView, int paramInt)
  {
    paramView.setImportantForAccessibility(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.Api16Impl
 * JD-Core Version:    0.7.0.1
 */