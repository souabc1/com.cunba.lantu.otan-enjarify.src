package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import androidx.core.view.WindowInsetsCompat;

public abstract class CoordinatorLayout$Behavior
{
  public CoordinatorLayout$Behavior() {}
  
  public CoordinatorLayout$Behavior(Context paramContext, AttributeSet paramAttributeSet) {}
  
  public static Object getTag(View paramView)
  {
    return ((CoordinatorLayout.LayoutParams)paramView.getLayoutParams()).OooOOo;
  }
  
  public static void setTag(View paramView, Object paramObject)
  {
    ((CoordinatorLayout.LayoutParams)paramView.getLayoutParams()).OooOOo = paramObject;
  }
  
  public boolean blocksInteractionBelow(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    float f = getScrimOpacity(paramCoordinatorLayout, paramView);
    paramView = null;
    boolean bool = f < 0.0F;
    if (bool)
    {
      bool = true;
      f = 1.4E-45F;
    }
    else
    {
      bool = false;
      f = 0.0F;
      paramCoordinatorLayout = null;
    }
    return bool;
  }
  
  public boolean getInsetDodgeRect(CoordinatorLayout paramCoordinatorLayout, View paramView, Rect paramRect)
  {
    return false;
  }
  
  public int getScrimColor(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    return -16777216;
  }
  
  public float getScrimOpacity(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    return 0.0F;
  }
  
  public boolean layoutDependsOn(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    return false;
  }
  
  public WindowInsetsCompat onApplyWindowInsets(CoordinatorLayout paramCoordinatorLayout, View paramView, WindowInsetsCompat paramWindowInsetsCompat)
  {
    return paramWindowInsetsCompat;
  }
  
  public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams paramLayoutParams) {}
  
  public boolean onDependentViewChanged(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    return false;
  }
  
  public void onDependentViewRemoved(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2) {}
  
  public void onDetachedFromLayoutParams() {}
  
  public boolean onInterceptTouchEvent(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean onLayoutChild(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    return false;
  }
  
  public boolean onMeasureChild(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return false;
  }
  
  public boolean onNestedFling(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return false;
  }
  
  public boolean onNestedPreFling(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onNestedPreScroll(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void onNestedPreScroll(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    if (paramInt3 == 0) {
      onNestedPreScroll(paramCoordinatorLayout, paramView1, paramView2, paramInt1, paramInt2, paramArrayOfInt);
    }
  }
  
  public void onNestedScroll(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void onNestedScroll(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0) {
      onNestedScroll(paramCoordinatorLayout, paramView1, paramView2, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void onNestedScroll(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0] + paramInt3;
    paramArrayOfInt[0] = i;
    int j = 1;
    i = paramArrayOfInt[j] + paramInt4;
    paramArrayOfInt[j] = i;
    onNestedScroll(paramCoordinatorLayout, paramView1, paramView2, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void onNestedScrollAccepted(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, View paramView3, int paramInt) {}
  
  public void onNestedScrollAccepted(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, View paramView3, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      onNestedScrollAccepted(paramCoordinatorLayout, paramView1, paramView2, paramView3, paramInt1);
    }
  }
  
  public boolean onRequestChildRectangleOnScreen(CoordinatorLayout paramCoordinatorLayout, View paramView, Rect paramRect, boolean paramBoolean)
  {
    return false;
  }
  
  public void onRestoreInstanceState(CoordinatorLayout paramCoordinatorLayout, View paramView, Parcelable paramParcelable) {}
  
  public Parcelable onSaveInstanceState(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    return View.BaseSavedState.EMPTY_STATE;
  }
  
  public boolean onStartNestedScroll(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, View paramView3, int paramInt)
  {
    return false;
  }
  
  public boolean onStartNestedScroll(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, View paramView3, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return onStartNestedScroll(paramCoordinatorLayout, paramView1, paramView2, paramView3, paramInt1);
    }
    return false;
  }
  
  public void onStopNestedScroll(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2) {}
  
  public void onStopNestedScroll(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt)
  {
    if (paramInt == 0) {
      onStopNestedScroll(paramCoordinatorLayout, paramView1, paramView2);
    }
  }
  
  public boolean onTouchEvent(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
 * JD-Core Version:    0.7.0.1
 */