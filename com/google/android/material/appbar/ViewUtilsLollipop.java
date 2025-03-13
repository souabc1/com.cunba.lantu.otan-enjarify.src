package com.google.android.material.appbar;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.R.attr;
import com.google.android.material.R.integer;
import com.google.android.material.internal.ThemeEnforcement;
import m54207b69;

class ViewUtilsLollipop
{
  private static final int[] STATE_LIST_ANIM_ATTRS = { 16843848 };
  
  public static void setBoundsViewOutlineProvider(View paramView)
  {
    ViewOutlineProvider localViewOutlineProvider = ViewOutlineProvider.BOUNDS;
    paramView.setOutlineProvider(localViewOutlineProvider);
  }
  
  public static void setDefaultAppBarLayoutStateListAnimator(View paramView, float paramFloat)
  {
    Object localObject1 = paramView.getResources();
    int i = R.integer.app_bar_elevation_anim_duration;
    int j = ((Resources)localObject1).getInteger(i);
    StateListAnimator localStateListAnimator = new android/animation/StateListAnimator;
    localStateListAnimator.<init>();
    int k = R.attr.state_liftable;
    int m = -R.attr.state_lifted;
    int n = 16842910;
    int[] tmp44_42 = new int[3];
    int[] tmp45_44 = tmp44_42;
    int[] tmp45_44 = tmp44_42;
    tmp45_44[0] = n;
    tmp45_44[1] = k;
    tmp45_44[2] = m;
    Object localObject2 = tmp45_44;
    m = 1;
    Object localObject3 = new float[m];
    localObject3[0] = 0.0F;
    String str = m54207b69.F54207b69_11("D+4E4850604E64484B4D");
    localObject3 = ObjectAnimator.ofFloat(paramView, str, (float[])localObject3);
    long l = j;
    localObject1 = ((ObjectAnimator)localObject3).setDuration(l);
    localStateListAnimator.addState((int[])localObject2, (Animator)localObject1);
    localObject1 = new int[] { n };
    localObject2 = new float[m];
    localObject2[0] = paramFloat;
    Object localObject4 = ObjectAnimator.ofFloat(paramView, str, (float[])localObject2).setDuration(l);
    localStateListAnimator.addState((int[])localObject1, (Animator)localObject4);
    localObject4 = new int[0];
    localObject1 = new float[m];
    localObject1[0] = 0.0F;
    localObject1 = ObjectAnimator.ofFloat(paramView, str, (float[])localObject1).setDuration(0L);
    localStateListAnimator.addState((int[])localObject4, (Animator)localObject1);
    paramView.setStateListAnimator(localStateListAnimator);
  }
  
  public static void setStateListAnimatorFromAttrs(View paramView, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    Context localContext = paramView.getContext();
    int[] arrayOfInt1 = STATE_LIST_ANIM_ATTRS;
    int[] arrayOfInt2 = new int[0];
    paramAttributeSet = ThemeEnforcement.obtainStyledAttributes(localContext, paramAttributeSet, arrayOfInt1, paramInt1, paramInt2, arrayOfInt2);
    try
    {
      paramInt1 = paramAttributeSet.hasValue(0);
      if (paramInt1 != 0)
      {
        paramInt1 = paramAttributeSet.getResourceId(0, 0);
        StateListAnimator localStateListAnimator = AnimatorInflater.loadStateListAnimator(localContext, paramInt1);
        paramView.setStateListAnimator(localStateListAnimator);
      }
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.appbar.ViewUtilsLollipop
 * JD-Core Version:    0.7.0.1
 */