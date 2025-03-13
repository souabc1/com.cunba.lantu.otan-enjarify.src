package com.google.android.material.shape;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ScrollView;
import m54207b69;

public class InterpolateOnScrollPositionChangeHelper
{
  private final int[] containerLocation;
  private ScrollView containingScrollView;
  private MaterialShapeDrawable materialShapeDrawable;
  private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
  private final int[] scrollLocation;
  private View shapedView;
  
  public InterpolateOnScrollPositionChangeHelper(View paramView, MaterialShapeDrawable paramMaterialShapeDrawable, ScrollView paramScrollView)
  {
    int i = 2;
    int[] arrayOfInt = new int[i];
    this.scrollLocation = arrayOfInt;
    Object localObject = new int[i];
    this.containerLocation = ((int[])localObject);
    localObject = new com/google/android/material/shape/InterpolateOnScrollPositionChangeHelper$1;
    ((InterpolateOnScrollPositionChangeHelper.1)localObject).<init>(this);
    this.scrollChangedListener = ((ViewTreeObserver.OnScrollChangedListener)localObject);
    this.shapedView = paramView;
    this.materialShapeDrawable = paramMaterialShapeDrawable;
    this.containingScrollView = paramScrollView;
  }
  
  public void setContainingScrollView(ScrollView paramScrollView)
  {
    this.containingScrollView = paramScrollView;
  }
  
  public void setMaterialShapeDrawable(MaterialShapeDrawable paramMaterialShapeDrawable)
  {
    this.materialShapeDrawable = paramMaterialShapeDrawable;
  }
  
  public void startListeningForScrollChanges(ViewTreeObserver paramViewTreeObserver)
  {
    ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = this.scrollChangedListener;
    paramViewTreeObserver.addOnScrollChangedListener(localOnScrollChangedListener);
  }
  
  public void stopListeningForScrollChanges(ViewTreeObserver paramViewTreeObserver)
  {
    ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = this.scrollChangedListener;
    paramViewTreeObserver.removeOnScrollChangedListener(localOnScrollChangedListener);
  }
  
  public void updateInterpolationForScreenPosition()
  {
    Object localObject1 = this.containingScrollView;
    if (localObject1 == null) {
      return;
    }
    int i = ((ViewGroup)localObject1).getChildCount();
    if (i != 0)
    {
      localObject1 = this.containingScrollView;
      localObject2 = this.scrollLocation;
      ((View)localObject1).getLocationInWindow((int[])localObject2);
      localObject1 = this.containingScrollView;
      float f1 = 0.0F;
      localObject1 = ((ViewGroup)localObject1).getChildAt(0);
      localObject2 = this.containerLocation;
      ((View)localObject1).getLocationInWindow((int[])localObject2);
      localObject1 = this.shapedView;
      i = ((View)localObject1).getTop();
      localObject2 = this.scrollLocation;
      int j = 1;
      int k = localObject2[j];
      i -= k;
      k = this.containerLocation[j];
      i += k;
      localObject2 = this.shapedView;
      k = ((View)localObject2).getHeight();
      Object localObject3 = this.containingScrollView;
      j = ((View)localObject3).getHeight();
      float f2 = 1.0F;
      float f3;
      if (i < 0)
      {
        localObject3 = this.materialShapeDrawable;
        f3 = i;
        f1 = k;
        f3 = f3 / f1 + f2;
        f3 = Math.min(f2, f3);
        f3 = Math.max(0.0F, f3);
        ((MaterialShapeDrawable)localObject3).setInterpolation(f3);
      }
      for (;;)
      {
        localObject1 = this.shapedView;
        ((View)localObject1).invalidate();
        break label277;
        i += k;
        if (i > j)
        {
          i -= j;
          localObject3 = this.materialShapeDrawable;
          f3 = i;
          f1 = k;
          f3 /= f1;
          f3 = f2 - f3;
          break;
        }
        localObject1 = this.materialShapeDrawable;
        f3 = ((MaterialShapeDrawable)localObject1).getInterpolation();
        boolean bool = f3 < f2;
        if (!bool) {
          break label277;
        }
        localObject1 = this.materialShapeDrawable;
        ((MaterialShapeDrawable)localObject1).setInterpolation(f2);
      }
      label277:
      return;
    }
    localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = m54207b69.F54207b69_11("U|2F201016141562252517661C151C166B2F24241B312A28733575392F312D367B28347E42413545303846324488424037493F3E4644523E4C4B4B8C");
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper
 * JD-Core Version:    0.7.0.1
 */