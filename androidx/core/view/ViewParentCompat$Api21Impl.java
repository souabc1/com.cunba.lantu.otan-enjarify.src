package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

class ViewParentCompat$Api21Impl
{
  public static boolean OooO00o(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
  }
  
  public static boolean OooO0O0(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    return paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
  }
  
  public static void OooO0OO(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    paramViewParent.onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
  }
  
  public static void OooO0Oo(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramViewParent.onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static boolean OooO0o(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    return paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt);
  }
  
  public static void OooO0o0(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    paramViewParent.onNestedScrollAccepted(paramView1, paramView2, paramInt);
  }
  
  public static void OooO0oO(ViewParent paramViewParent, View paramView)
  {
    paramViewParent.onStopNestedScroll(paramView);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewParentCompat.Api21Impl
 * JD-Core Version:    0.7.0.1
 */