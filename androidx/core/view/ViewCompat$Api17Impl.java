package androidx.core.view;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

class ViewCompat$Api17Impl
{
  public static void OooO(View paramView, Paint paramPaint)
  {
    paramView.setLayerPaint(paramPaint);
  }
  
  public static int OooO00o()
  {
    return View.generateViewId();
  }
  
  public static Display OooO0O0(View paramView)
  {
    return paramView.getDisplay();
  }
  
  public static int OooO0OO(View paramView)
  {
    return paramView.getLabelFor();
  }
  
  public static int OooO0Oo(View paramView)
  {
    return paramView.getLayoutDirection();
  }
  
  public static int OooO0o(View paramView)
  {
    return paramView.getPaddingStart();
  }
  
  public static int OooO0o0(View paramView)
  {
    return paramView.getPaddingEnd();
  }
  
  public static boolean OooO0oO(View paramView)
  {
    return paramView.isPaddingRelative();
  }
  
  public static void OooO0oo(View paramView, int paramInt)
  {
    paramView.setLabelFor(paramInt);
  }
  
  public static void OooOO0(View paramView, int paramInt)
  {
    paramView.setLayoutDirection(paramInt);
  }
  
  public static void OooOO0O(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.Api17Impl
 * JD-Core Version:    0.7.0.1
 */