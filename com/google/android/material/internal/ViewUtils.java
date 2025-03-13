package com.google.android.material.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat.Type;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.R.styleable;
import java.util.ArrayList;
import java.util.List;

public class ViewUtils
{
  public static final int EDGE_TO_EDGE_FLAGS = 768;
  
  public static void addOnGlobalLayoutListener(View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    if (paramView != null)
    {
      paramView = paramView.getViewTreeObserver();
      paramView.addOnGlobalLayoutListener(paramOnGlobalLayoutListener);
    }
  }
  
  public static Rect calculateRectFromBounds(View paramView)
  {
    return calculateRectFromBounds(paramView, 0);
  }
  
  public static Rect calculateRectFromBounds(View paramView, int paramInt)
  {
    Rect localRect = new android/graphics/Rect;
    int i = paramView.getLeft();
    int j = paramView.getTop() + paramInt;
    int k = paramView.getRight();
    int m = paramView.getBottom() + paramInt;
    localRect.<init>(i, j, k, m);
    return localRect;
  }
  
  public static void doOnApplyWindowInsets(View paramView, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    doOnApplyWindowInsets(paramView, paramAttributeSet, paramInt1, paramInt2, null);
  }
  
  public static void doOnApplyWindowInsets(View paramView, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, ViewUtils.OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener)
  {
    Context localContext = paramView.getContext();
    int[] arrayOfInt = R.styleable.Insets;
    paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt1, paramInt2);
    paramInt1 = R.styleable.Insets_paddingBottomSystemWindowInsets;
    paramInt1 = paramAttributeSet.getBoolean(paramInt1, false);
    int i = R.styleable.Insets_paddingLeftSystemWindowInsets;
    boolean bool = paramAttributeSet.getBoolean(i, false);
    int j = R.styleable.Insets_paddingRightSystemWindowInsets;
    paramInt2 = paramAttributeSet.getBoolean(j, false);
    paramAttributeSet.recycle();
    paramAttributeSet = new com/google/android/material/internal/ViewUtils$2;
    paramAttributeSet.<init>(paramInt1, bool, paramInt2, paramOnApplyWindowInsetsListener);
    doOnApplyWindowInsets(paramView, paramAttributeSet);
  }
  
  public static void doOnApplyWindowInsets(View paramView, ViewUtils.OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener)
  {
    ViewUtils.RelativePadding localRelativePadding = new com/google/android/material/internal/ViewUtils$RelativePadding;
    int i = ViewCompat.Oooo000(paramView);
    int j = paramView.getPaddingTop();
    int k = ViewCompat.OooOooo(paramView);
    int m = paramView.getPaddingBottom();
    localRelativePadding.<init>(i, j, k, m);
    ViewUtils.3 local3 = new com/google/android/material/internal/ViewUtils$3;
    local3.<init>(paramOnApplyWindowInsetsListener, localRelativePadding);
    ViewCompat.o00000O0(paramView, local3);
    requestApplyInsetsWhenAttached(paramView);
  }
  
  public static float dpToPx(Context paramContext, int paramInt)
  {
    paramContext = paramContext.getResources();
    float f = paramInt;
    paramContext = paramContext.getDisplayMetrics();
    return TypedValue.applyDimension(1, f, paramContext);
  }
  
  public static Integer getBackgroundColor(View paramView)
  {
    Drawable localDrawable = paramView.getBackground();
    boolean bool = localDrawable instanceof ColorDrawable;
    int i;
    if (bool)
    {
      i = ((ColorDrawable)paramView.getBackground()).getColor();
      paramView = Integer.valueOf(i);
    }
    else
    {
      i = 0;
      paramView = null;
    }
    return paramView;
  }
  
  public static List getChildren(View paramView)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramView instanceof ViewGroup;
    if (i != 0)
    {
      paramView = (ViewGroup)paramView;
      i = 0;
      for (;;)
      {
        int k = paramView.getChildCount();
        if (i >= k) {
          break;
        }
        View localView = paramView.getChildAt(i);
        localArrayList.add(localView);
        int j;
        i += 1;
      }
    }
    return localArrayList;
  }
  
  public static ViewGroup getContentView(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    View localView = paramView.getRootView();
    int i = 16908290;
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i);
    if (localViewGroup != null) {
      return localViewGroup;
    }
    if (localView != paramView)
    {
      boolean bool = localView instanceof ViewGroup;
      if (bool) {
        return (ViewGroup)localView;
      }
    }
    return null;
  }
  
  public static ViewOverlayImpl getContentViewOverlay(View paramView)
  {
    return getOverlay(getContentView(paramView));
  }
  
  private static InputMethodManager getInputMethodManager(View paramView)
  {
    return (InputMethodManager)ContextCompat.OooO(paramView.getContext(), InputMethodManager.class);
  }
  
  public static ViewOverlayImpl getOverlay(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    ViewOverlayApi18 localViewOverlayApi18 = new com/google/android/material/internal/ViewOverlayApi18;
    localViewOverlayApi18.<init>(paramView);
    return localViewOverlayApi18;
  }
  
  public static float getParentAbsoluteElevation(View paramView)
  {
    paramView = paramView.getParent();
    float f1 = 0.0F;
    for (;;)
    {
      boolean bool = paramView instanceof View;
      if (!bool) {
        break;
      }
      View localView = paramView;
      localView = (View)paramView;
      float f2 = ViewCompat.OooOo0O(localView);
      f1 += f2;
      paramView = ((ViewParent)paramView).getParent();
    }
    return f1;
  }
  
  public static void hideKeyboard(View paramView)
  {
    hideKeyboard(paramView, true);
  }
  
  public static void hideKeyboard(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      localObject = ViewCompat.Oooo0oO(paramView);
      if (localObject != null)
      {
        int i = WindowInsetsCompat.Type.OooO00o();
        ((WindowInsetsControllerCompat)localObject).OooO00o(i);
        return;
      }
    }
    Object localObject = getInputMethodManager(paramView);
    if (localObject != null)
    {
      paramView = paramView.getWindowToken();
      ((InputMethodManager)localObject).hideSoftInputFromWindow(paramView, 0);
    }
  }
  
  public static boolean isLayoutRtl(View paramView)
  {
    int i = ViewCompat.OooOoOO(paramView);
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public static PorterDuff.Mode parseTintMode(int paramInt, PorterDuff.Mode paramMode)
  {
    int i = 3;
    if (paramInt != i)
    {
      i = 5;
      if (paramInt != i)
      {
        i = 9;
        if (paramInt != i)
        {
          switch (paramInt)
          {
          default: 
            return paramMode;
          case 16: 
            return PorterDuff.Mode.ADD;
          case 15: 
            return PorterDuff.Mode.SCREEN;
          }
          return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_ATOP;
      }
      return PorterDuff.Mode.SRC_IN;
    }
    return PorterDuff.Mode.SRC_OVER;
  }
  
  public static void removeOnGlobalLayoutListener(View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    if (paramView != null)
    {
      paramView = paramView.getViewTreeObserver();
      removeOnGlobalLayoutListener(paramView, paramOnGlobalLayoutListener);
    }
  }
  
  public static void removeOnGlobalLayoutListener(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramViewTreeObserver.removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
  }
  
  public static void requestApplyInsetsWhenAttached(View paramView)
  {
    boolean bool = ViewCompat.o000oOoO(paramView);
    if (bool)
    {
      ViewCompat.o00o0O(paramView);
    }
    else
    {
      ViewUtils.4 local4 = new com/google/android/material/internal/ViewUtils$4;
      local4.<init>();
      paramView.addOnAttachStateChangeListener(local4);
    }
  }
  
  public static void requestFocusAndShowKeyboard(View paramView)
  {
    paramView.requestFocus();
    ViewUtils.1 local1 = new com/google/android/material/internal/ViewUtils$1;
    local1.<init>(paramView);
    paramView.post(local1);
  }
  
  public static void setBoundsFromRect(View paramView, Rect paramRect)
  {
    int i = paramRect.left;
    paramView.setLeft(i);
    i = paramRect.top;
    paramView.setTop(i);
    i = paramRect.right;
    paramView.setRight(i);
    int j = paramRect.bottom;
    paramView.setBottom(j);
  }
  
  public static void showKeyboard(View paramView)
  {
    showKeyboard(paramView, true);
  }
  
  public static void showKeyboard(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      WindowInsetsControllerCompat localWindowInsetsControllerCompat = ViewCompat.Oooo0oO(paramView);
      if (localWindowInsetsControllerCompat != null)
      {
        int i = WindowInsetsCompat.Type.OooO00o();
        localWindowInsetsControllerCompat.OooO0O0(i);
        return;
      }
    }
    getInputMethodManager(paramView).showSoftInput(paramView, 1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ViewUtils
 * JD-Core Version:    0.7.0.1
 */