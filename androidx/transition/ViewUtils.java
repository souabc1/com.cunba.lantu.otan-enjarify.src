package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;

class ViewUtils
{
  public static final ViewUtilsBase OooO00o;
  public static final Property OooO0O0;
  public static final Property OooO0OO;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      localObject = new androidx/transition/ViewUtilsApi29;
      ((ViewUtilsApi29)localObject).<init>();
    }
    for (;;)
    {
      OooO00o = (ViewUtilsBase)localObject;
      break;
      localObject = new androidx/transition/ViewUtilsApi23;
      ((ViewUtilsApi23)localObject).<init>();
    }
    Object localObject = new androidx/transition/ViewUtils$1;
    ((ViewUtils.1)localObject).<init>(Float.class, "translationAlpha");
    OooO0O0 = (Property)localObject;
    localObject = new androidx/transition/ViewUtils$2;
    ((ViewUtils.2)localObject).<init>(Rect.class, "clipBounds");
    OooO0OO = (Property)localObject;
  }
  
  public static void OooO(View paramView, int paramInt)
  {
    OooO00o.OooO0oo(paramView, paramInt);
  }
  
  public static void OooO00o(View paramView)
  {
    OooO00o.OooO00o(paramView);
  }
  
  public static ViewOverlayImpl OooO0O0(View paramView)
  {
    ViewOverlayApi18 localViewOverlayApi18 = new androidx/transition/ViewOverlayApi18;
    localViewOverlayApi18.<init>(paramView);
    return localViewOverlayApi18;
  }
  
  public static float OooO0OO(View paramView)
  {
    return OooO00o.OooO0OO(paramView);
  }
  
  public static WindowIdImpl OooO0Oo(View paramView)
  {
    WindowIdApi18 localWindowIdApi18 = new androidx/transition/WindowIdApi18;
    localWindowIdApi18.<init>(paramView);
    return localWindowIdApi18;
  }
  
  public static void OooO0o(View paramView, Matrix paramMatrix)
  {
    OooO00o.OooO0o0(paramView, paramMatrix);
  }
  
  public static void OooO0o0(View paramView)
  {
    OooO00o.OooO0Oo(paramView);
  }
  
  public static void OooO0oO(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    OooO00o.OooO0o(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void OooO0oo(View paramView, float paramFloat)
  {
    OooO00o.OooO0oO(paramView, paramFloat);
  }
  
  public static void OooOO0(View paramView, Matrix paramMatrix)
  {
    OooO00o.OooO(paramView, paramMatrix);
  }
  
  public static void OooOO0O(View paramView, Matrix paramMatrix)
  {
    OooO00o.OooOO0(paramView, paramMatrix);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.ViewUtils
 * JD-Core Version:    0.7.0.1
 */