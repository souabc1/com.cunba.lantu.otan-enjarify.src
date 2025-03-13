package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewOverlay;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ToolbarUtils;
import m54207b69;

public class BadgeUtils
{
  private static final String LOG_TAG = "BadgeUtils";
  public static final boolean USE_COMPAT_PARENT = false;
  
  private static void attachBadgeContentDescription(BadgeDrawable paramBadgeDrawable, View paramView)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      boolean bool = ViewCompat.OoooO00(paramView);
      if (bool)
      {
        localObject = new com/google/android/material/badge/BadgeUtils$2;
        View.AccessibilityDelegate localAccessibilityDelegate = OooO00o.OooO00o(paramView);
        ((BadgeUtils.2)localObject).<init>(localAccessibilityDelegate, paramBadgeDrawable);
        break label54;
      }
    }
    Object localObject = new com/google/android/material/badge/BadgeUtils$3;
    ((BadgeUtils.3)localObject).<init>(paramBadgeDrawable);
    label54:
    ViewCompat.o00oO0o(paramView, (AccessibilityDelegateCompat)localObject);
  }
  
  public static void attachBadgeDrawable(BadgeDrawable paramBadgeDrawable, View paramView)
  {
    attachBadgeDrawable(paramBadgeDrawable, paramView, null);
  }
  
  public static void attachBadgeDrawable(BadgeDrawable paramBadgeDrawable, View paramView, FrameLayout paramFrameLayout)
  {
    setBadgeDrawableBounds(paramBadgeDrawable, paramView, paramFrameLayout);
    paramFrameLayout = paramBadgeDrawable.getCustomBadgeParent();
    if (paramFrameLayout != null)
    {
      paramView = paramBadgeDrawable.getCustomBadgeParent();
      paramView.setForeground(paramBadgeDrawable);
    }
    else
    {
      boolean bool = USE_COMPAT_PARENT;
      if (bool) {
        break label47;
      }
      paramView = paramView.getOverlay();
      paramView.add(paramBadgeDrawable);
    }
    return;
    label47:
    paramBadgeDrawable = new java/lang/IllegalArgumentException;
    paramView = m54207b69.F54207b69_11("K[0F2A2435394181363C843349494B374D4549508E49434D4E935148434B5154385A605E612F5F4F655D58");
    paramBadgeDrawable.<init>(paramView);
    throw paramBadgeDrawable;
  }
  
  public static void attachBadgeDrawable(BadgeDrawable paramBadgeDrawable, Toolbar paramToolbar, int paramInt)
  {
    attachBadgeDrawable(paramBadgeDrawable, paramToolbar, paramInt, null);
  }
  
  public static void attachBadgeDrawable(BadgeDrawable paramBadgeDrawable, Toolbar paramToolbar, int paramInt, FrameLayout paramFrameLayout)
  {
    BadgeUtils.1 local1 = new com/google/android/material/badge/BadgeUtils$1;
    local1.<init>(paramToolbar, paramInt, paramBadgeDrawable, paramFrameLayout);
    paramToolbar.post(local1);
  }
  
  public static SparseArray createBadgeDrawablesFromSavedStates(Context paramContext, ParcelableSparseArray paramParcelableSparseArray)
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    int i = paramParcelableSparseArray.size();
    localSparseArray.<init>(i);
    i = 0;
    for (;;)
    {
      int j = paramParcelableSparseArray.size();
      if (i >= j) {
        return localSparseArray;
      }
      j = paramParcelableSparseArray.keyAt(i);
      Object localObject = (BadgeState.State)paramParcelableSparseArray.valueAt(i);
      if (localObject == null) {
        break;
      }
      localObject = BadgeDrawable.createFromSavedState(paramContext, (BadgeState.State)localObject);
      localSparseArray.put(j, localObject);
      i += 1;
    }
    paramContext = new java/lang/IllegalArgumentException;
    paramParcelableSparseArray = m54207b69.F54207b69_11("_G0527252326083B2D382F2F362E6D4276443743353729493D4B3B813F42464747538847458B4E585253");
    paramContext.<init>(paramParcelableSparseArray);
    throw paramContext;
    return localSparseArray;
  }
  
  public static ParcelableSparseArray createParcelableBadgeStates(SparseArray paramSparseArray)
  {
    Object localObject1 = new com/google/android/material/internal/ParcelableSparseArray;
    ((ParcelableSparseArray)localObject1).<init>();
    int i = 0;
    for (;;)
    {
      int j = paramSparseArray.size();
      if (i >= j) {
        return localObject1;
      }
      j = paramSparseArray.keyAt(i);
      Object localObject2 = (BadgeDrawable)paramSparseArray.valueAt(i);
      if (localObject2 == null) {
        break;
      }
      localObject2 = ((BadgeDrawable)localObject2).getSavedState();
      ((SparseArray)localObject1).put(j, localObject2);
      i += 1;
    }
    paramSparseArray = new java/lang/IllegalArgumentException;
    localObject1 = m54207b69.F54207b69_11("I*484C505053735E52655452515B17575A545557711E5D65215C786061");
    paramSparseArray.<init>((String)localObject1);
    throw paramSparseArray;
    return localObject1;
  }
  
  private static void detachBadgeContentDescription(View paramView)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      bool = ViewCompat.OoooO00(paramView);
      if (bool)
      {
        local4 = new com/google/android/material/badge/BadgeUtils$4;
        View.AccessibilityDelegate localAccessibilityDelegate = OooO00o.OooO00o(paramView);
        local4.<init>(localAccessibilityDelegate);
        break label44;
      }
    }
    boolean bool = false;
    BadgeUtils.4 local4 = null;
    label44:
    ViewCompat.o00oO0o(paramView, local4);
  }
  
  public static void detachBadgeDrawable(BadgeDrawable paramBadgeDrawable, View paramView)
  {
    if (paramBadgeDrawable == null) {
      return;
    }
    boolean bool = USE_COMPAT_PARENT;
    if (!bool)
    {
      FrameLayout localFrameLayout = paramBadgeDrawable.getCustomBadgeParent();
      if (localFrameLayout == null)
      {
        paramView = paramView.getOverlay();
        paramView.remove(paramBadgeDrawable);
        return;
      }
    }
    paramBadgeDrawable = paramBadgeDrawable.getCustomBadgeParent();
    paramView = null;
    paramBadgeDrawable.setForeground(null);
  }
  
  public static void detachBadgeDrawable(BadgeDrawable paramBadgeDrawable, Toolbar paramToolbar, int paramInt)
  {
    if (paramBadgeDrawable == null) {
      return;
    }
    paramToolbar = ToolbarUtils.getActionMenuItemView(paramToolbar, paramInt);
    if (paramToolbar != null)
    {
      removeToolbarOffset(paramBadgeDrawable);
      detachBadgeDrawable(paramBadgeDrawable, paramToolbar);
      detachBadgeContentDescription(paramToolbar);
    }
    else
    {
      paramBadgeDrawable = new java/lang/StringBuilder;
      paramBadgeDrawable.<init>();
      paramToolbar = m54207b69.F54207b69_11("4'735660514D450D5A50105F4D56555F511756585654571D586D616422622467716B6C296D666E78957B6B749C7A6F7E4C37");
      paramBadgeDrawable.append(paramToolbar);
      paramBadgeDrawable.append(paramInt);
    }
  }
  
  public static void removeToolbarOffset(BadgeDrawable paramBadgeDrawable)
  {
    paramBadgeDrawable.setAdditionalHorizontalOffset(0);
    paramBadgeDrawable.setAdditionalVerticalOffset(0);
  }
  
  public static void setBadgeDrawableBounds(BadgeDrawable paramBadgeDrawable, View paramView, FrameLayout paramFrameLayout)
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    paramView.getDrawingRect(localRect);
    paramBadgeDrawable.setBounds(localRect);
    paramBadgeDrawable.updateBadgeCoordinates(paramView, paramFrameLayout);
  }
  
  public static void setToolbarOffset(BadgeDrawable paramBadgeDrawable, Resources paramResources)
  {
    int i = R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset;
    i = paramResources.getDimensionPixelOffset(i);
    paramBadgeDrawable.setAdditionalHorizontalOffset(i);
    i = R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset;
    int j = paramResources.getDimensionPixelOffset(i);
    paramBadgeDrawable.setAdditionalVerticalOffset(j);
  }
  
  public static void updateBadgeBounds(Rect paramRect, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i = (int)(paramFloat1 - paramFloat3);
    int j = (int)(paramFloat2 - paramFloat4);
    int k = (int)(paramFloat1 + paramFloat3);
    int m = (int)(paramFloat2 + paramFloat4);
    paramRect.set(i, j, k, m);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.badge.BadgeUtils
 * JD-Core Version:    0.7.0.1
 */