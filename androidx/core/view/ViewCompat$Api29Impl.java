package androidx.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import java.util.List;

class ViewCompat$Api29Impl
{
  public static View.AccessibilityDelegate OooO00o(View paramView)
  {
    return paramView.getAccessibilityDelegate();
  }
  
  public static List OooO0O0(View paramView)
  {
    return paramView.getSystemGestureExclusionRects();
  }
  
  public static void OooO0OO(View paramView, Context paramContext, int[] paramArrayOfInt, AttributeSet paramAttributeSet, TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    paramView.saveAttributeDataForStyleable(paramContext, paramArrayOfInt, paramAttributeSet, paramTypedArray, paramInt1, paramInt2);
  }
  
  public static void OooO0Oo(View paramView, List paramList)
  {
    paramView.setSystemGestureExclusionRects(paramList);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.Api29Impl
 * JD-Core Version:    0.7.0.1
 */