package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.Window;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import com.google.android.material.R.id;
import com.google.android.material.internal.ContextUtils;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

public class MaterialContainerTransformSharedElementCallback
  extends SharedElementCallback
{
  private static WeakReference capturedSharedElement;
  private boolean entering;
  private Rect returnEndBounds;
  private MaterialContainerTransformSharedElementCallback.ShapeProvider shapeProvider;
  private boolean sharedElementReenterTransitionEnabled;
  private boolean transparentWindowBackgroundEnabled;
  
  public MaterialContainerTransformSharedElementCallback()
  {
    boolean bool = true;
    this.entering = bool;
    this.transparentWindowBackgroundEnabled = bool;
    this.sharedElementReenterTransitionEnabled = false;
    MaterialContainerTransformSharedElementCallback.ShapeableViewShapeProvider localShapeableViewShapeProvider = new com/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$ShapeableViewShapeProvider;
    localShapeableViewShapeProvider.<init>();
    this.shapeProvider = localShapeableViewShapeProvider;
  }
  
  private static Drawable getWindowBackground(Window paramWindow)
  {
    return paramWindow.getDecorView().getBackground();
  }
  
  private static void removeWindowBackground(Window paramWindow)
  {
    paramWindow = getWindowBackground(paramWindow);
    if (paramWindow == null) {
      return;
    }
    paramWindow = paramWindow.mutate();
    BlendModeCompat localBlendModeCompat = BlendModeCompat.o00OoOoo;
    ColorFilter localColorFilter = BlendModeColorFilterCompat.OooO00o(0, localBlendModeCompat);
    paramWindow.setColorFilter(localColorFilter);
  }
  
  private static void restoreWindowBackground(Window paramWindow)
  {
    paramWindow = getWindowBackground(paramWindow);
    if (paramWindow == null) {
      return;
    }
    paramWindow.mutate().clearColorFilter();
  }
  
  private void setUpEnterTransform(Window paramWindow)
  {
    Object localObject = paramWindow.getSharedElementEnterTransition();
    boolean bool = localObject instanceof MaterialContainerTransform;
    if (bool)
    {
      localObject = (MaterialContainerTransform)localObject;
      bool = this.sharedElementReenterTransitionEnabled;
      MaterialContainerTransformSharedElementCallback.1 local1;
      if (!bool)
      {
        bool = false;
        local1 = null;
        paramWindow.setSharedElementReenterTransition(null);
      }
      bool = this.transparentWindowBackgroundEnabled;
      if (bool)
      {
        updateBackgroundFadeDuration(paramWindow, (MaterialContainerTransform)localObject);
        local1 = new com/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$1;
        local1.<init>(this, paramWindow);
        ((Transition)localObject).addListener(local1);
      }
    }
  }
  
  private void setUpReturnTransform(Activity paramActivity, Window paramWindow)
  {
    Object localObject = paramWindow.getSharedElementReturnTransition();
    boolean bool1 = localObject instanceof MaterialContainerTransform;
    if (bool1)
    {
      localObject = (MaterialContainerTransform)localObject;
      bool1 = true;
      ((MaterialContainerTransform)localObject).setHoldAtEndEnabled(bool1);
      MaterialContainerTransformSharedElementCallback.2 local2 = new com/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$2;
      local2.<init>(this, paramActivity);
      ((Transition)localObject).addListener(local2);
      boolean bool2 = this.transparentWindowBackgroundEnabled;
      if (bool2)
      {
        updateBackgroundFadeDuration(paramWindow, (MaterialContainerTransform)localObject);
        paramActivity = new com/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$3;
        paramActivity.<init>(this, paramWindow);
        ((Transition)localObject).addListener(paramActivity);
      }
    }
  }
  
  private static void updateBackgroundFadeDuration(Window paramWindow, MaterialContainerTransform paramMaterialContainerTransform)
  {
    long l1 = paramMaterialContainerTransform.getDuration();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool)
    {
      l1 = paramMaterialContainerTransform.getDuration();
      paramWindow.setTransitionBackgroundFadeDuration(l1);
    }
  }
  
  public MaterialContainerTransformSharedElementCallback.ShapeProvider getShapeProvider()
  {
    return this.shapeProvider;
  }
  
  public boolean isSharedElementReenterTransitionEnabled()
  {
    return this.sharedElementReenterTransitionEnabled;
  }
  
  public boolean isTransparentWindowBackgroundEnabled()
  {
    return this.transparentWindowBackgroundEnabled;
  }
  
  public Parcelable onCaptureSharedElementSnapshot(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    capturedSharedElement = localWeakReference;
    return super.onCaptureSharedElementSnapshot(paramView, paramMatrix, paramRectF);
  }
  
  public View onCreateSnapshotView(Context paramContext, Parcelable paramParcelable)
  {
    paramContext = super.onCreateSnapshotView(paramContext, paramParcelable);
    if (paramContext != null)
    {
      paramParcelable = capturedSharedElement;
      if (paramParcelable != null)
      {
        MaterialContainerTransformSharedElementCallback.ShapeProvider localShapeProvider = this.shapeProvider;
        if (localShapeProvider != null)
        {
          paramParcelable = (View)paramParcelable.get();
          if (paramParcelable != null)
          {
            localShapeProvider = this.shapeProvider;
            paramParcelable = localShapeProvider.provideShape(paramParcelable);
            if (paramParcelable != null)
            {
              int i = R.id.mtrl_motion_snapshot_view;
              paramContext.setTag(i, paramParcelable);
            }
          }
        }
      }
    }
    return paramContext;
  }
  
  public void onMapSharedElements(List paramList, Map paramMap)
  {
    boolean bool = paramList.isEmpty();
    if (!bool)
    {
      bool = paramMap.isEmpty();
      if (!bool)
      {
        bool = false;
        paramList = paramList.get(0);
        paramList = (View)paramMap.get(paramList);
        if (paramList != null)
        {
          paramList = ContextUtils.getActivity(paramList.getContext());
          if (paramList != null)
          {
            paramMap = paramList.getWindow();
            bool = this.entering;
            if (bool) {
              setUpEnterTransform(paramMap);
            } else {
              setUpReturnTransform(paramList, paramMap);
            }
          }
        }
      }
    }
  }
  
  public void onSharedElementEnd(List paramList1, List paramList2, List paramList3)
  {
    boolean bool = paramList2.isEmpty();
    if (!bool)
    {
      paramList1 = (View)paramList2.get(0);
      int i = R.id.mtrl_motion_snapshot_view;
      paramList1 = paramList1.getTag(i);
      bool = paramList1 instanceof View;
      if (bool)
      {
        paramList1 = (View)paramList2.get(0);
        i = R.id.mtrl_motion_snapshot_view;
        paramList1.setTag(i, null);
      }
    }
    bool = this.entering;
    if (!bool)
    {
      bool = paramList2.isEmpty();
      if (!bool)
      {
        paramList1 = TransitionUtils.getRelativeBoundsRect((View)paramList2.get(0));
        this.returnEndBounds = paramList1;
      }
    }
    this.entering = false;
  }
  
  public void onSharedElementStart(List paramList1, List paramList2, List paramList3)
  {
    boolean bool = paramList2.isEmpty();
    int i = 0;
    Rect localRect = null;
    int j;
    if (!bool)
    {
      bool = paramList3.isEmpty();
      if (!bool)
      {
        paramList1 = (View)paramList2.get(0);
        j = R.id.mtrl_motion_snapshot_view;
        paramList3 = paramList3.get(0);
        paramList1.setTag(j, paramList3);
      }
    }
    bool = this.entering;
    if (!bool)
    {
      bool = paramList2.isEmpty();
      if (!bool)
      {
        paramList1 = this.returnEndBounds;
        if (paramList1 != null)
        {
          paramList1 = (View)paramList2.get(0);
          int k = this.returnEndBounds.width();
          int m = 1073741824;
          k = View.MeasureSpec.makeMeasureSpec(k, m);
          localRect = this.returnEndBounds;
          m = View.MeasureSpec.makeMeasureSpec(localRect.height(), m);
          paramList1.measure(k, m);
          paramList2 = this.returnEndBounds;
          m = paramList2.left;
          i = paramList2.top;
          j = paramList2.right;
          k = paramList2.bottom;
          paramList1.layout(m, i, j, k);
        }
      }
    }
  }
  
  public void setShapeProvider(MaterialContainerTransformSharedElementCallback.ShapeProvider paramShapeProvider)
  {
    this.shapeProvider = paramShapeProvider;
  }
  
  public void setSharedElementReenterTransitionEnabled(boolean paramBoolean)
  {
    this.sharedElementReenterTransitionEnabled = paramBoolean;
  }
  
  public void setTransparentWindowBackgroundEnabled(boolean paramBoolean)
  {
    this.transparentWindowBackgroundEnabled = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback
 * JD-Core Version:    0.7.0.1
 */