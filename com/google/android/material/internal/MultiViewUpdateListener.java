package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import java.util.Collection;

public class MultiViewUpdateListener
  implements ValueAnimator.AnimatorUpdateListener
{
  private final MultiViewUpdateListener.Listener listener;
  private final View[] views;
  
  public MultiViewUpdateListener(MultiViewUpdateListener.Listener paramListener, Collection paramCollection)
  {
    this.listener = paramListener;
    paramListener = new View[0];
    paramListener = (View[])paramCollection.toArray(paramListener);
    this.views = paramListener;
  }
  
  public MultiViewUpdateListener(MultiViewUpdateListener.Listener paramListener, View... paramVarArgs)
  {
    this.listener = paramListener;
    this.views = paramVarArgs;
  }
  
  public static MultiViewUpdateListener alphaListener(Collection paramCollection)
  {
    MultiViewUpdateListener localMultiViewUpdateListener = new com/google/android/material/internal/MultiViewUpdateListener;
    OooO localOooO = new com/google/android/material/internal/OooO;
    localOooO.<init>();
    localMultiViewUpdateListener.<init>(localOooO, paramCollection);
    return localMultiViewUpdateListener;
  }
  
  public static MultiViewUpdateListener alphaListener(View... paramVarArgs)
  {
    MultiViewUpdateListener localMultiViewUpdateListener = new com/google/android/material/internal/MultiViewUpdateListener;
    OooO localOooO = new com/google/android/material/internal/OooO;
    localOooO.<init>();
    localMultiViewUpdateListener.<init>(localOooO, paramVarArgs);
    return localMultiViewUpdateListener;
  }
  
  public static MultiViewUpdateListener scaleListener(Collection paramCollection)
  {
    MultiViewUpdateListener localMultiViewUpdateListener = new com/google/android/material/internal/MultiViewUpdateListener;
    OooO0OO localOooO0OO = new com/google/android/material/internal/OooO0OO;
    localOooO0OO.<init>();
    localMultiViewUpdateListener.<init>(localOooO0OO, paramCollection);
    return localMultiViewUpdateListener;
  }
  
  public static MultiViewUpdateListener scaleListener(View... paramVarArgs)
  {
    MultiViewUpdateListener localMultiViewUpdateListener = new com/google/android/material/internal/MultiViewUpdateListener;
    OooO0OO localOooO0OO = new com/google/android/material/internal/OooO0OO;
    localOooO0OO.<init>();
    localMultiViewUpdateListener.<init>(localOooO0OO, paramVarArgs);
    return localMultiViewUpdateListener;
  }
  
  private static void setAlpha(ValueAnimator paramValueAnimator, View paramView)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    paramView.setAlpha(f);
  }
  
  private static void setScale(ValueAnimator paramValueAnimator, View paramView)
  {
    paramValueAnimator = (Float)paramValueAnimator.getAnimatedValue();
    float f1 = paramValueAnimator.floatValue();
    paramView.setScaleX(f1);
    float f2 = paramValueAnimator.floatValue();
    paramView.setScaleY(f2);
  }
  
  private static void setTranslationX(ValueAnimator paramValueAnimator, View paramView)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    paramView.setTranslationX(f);
  }
  
  private static void setTranslationY(ValueAnimator paramValueAnimator, View paramView)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    paramView.setTranslationY(f);
  }
  
  public static MultiViewUpdateListener translationXListener(Collection paramCollection)
  {
    MultiViewUpdateListener localMultiViewUpdateListener = new com/google/android/material/internal/MultiViewUpdateListener;
    OooO0O0 localOooO0O0 = new com/google/android/material/internal/OooO0O0;
    localOooO0O0.<init>();
    localMultiViewUpdateListener.<init>(localOooO0O0, paramCollection);
    return localMultiViewUpdateListener;
  }
  
  public static MultiViewUpdateListener translationXListener(View... paramVarArgs)
  {
    MultiViewUpdateListener localMultiViewUpdateListener = new com/google/android/material/internal/MultiViewUpdateListener;
    OooO0O0 localOooO0O0 = new com/google/android/material/internal/OooO0O0;
    localOooO0O0.<init>();
    localMultiViewUpdateListener.<init>(localOooO0O0, paramVarArgs);
    return localMultiViewUpdateListener;
  }
  
  public static MultiViewUpdateListener translationYListener(Collection paramCollection)
  {
    MultiViewUpdateListener localMultiViewUpdateListener = new com/google/android/material/internal/MultiViewUpdateListener;
    OooO0o localOooO0o = new com/google/android/material/internal/OooO0o;
    localOooO0o.<init>();
    localMultiViewUpdateListener.<init>(localOooO0o, paramCollection);
    return localMultiViewUpdateListener;
  }
  
  public static MultiViewUpdateListener translationYListener(View... paramVarArgs)
  {
    MultiViewUpdateListener localMultiViewUpdateListener = new com/google/android/material/internal/MultiViewUpdateListener;
    OooO0o localOooO0o = new com/google/android/material/internal/OooO0o;
    localOooO0o.<init>();
    localMultiViewUpdateListener.<init>(localOooO0o, paramVarArgs);
    return localMultiViewUpdateListener;
  }
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    View[] arrayOfView = this.views;
    int i = arrayOfView.length;
    int j = 0;
    while (j < i)
    {
      View localView = arrayOfView[j];
      MultiViewUpdateListener.Listener localListener = this.listener;
      localListener.onAnimationUpdate(paramValueAnimator, localView);
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.MultiViewUpdateListener
 * JD-Core Version:    0.7.0.1
 */