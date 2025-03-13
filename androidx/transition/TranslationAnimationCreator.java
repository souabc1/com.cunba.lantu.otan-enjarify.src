package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;

class TranslationAnimationCreator
{
  public static Animator OooO00o(View paramView, TransitionValues paramTransitionValues, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, TimeInterpolator paramTimeInterpolator, Transition paramTransition)
  {
    Object localObject1 = paramTransitionValues;
    float f1 = paramView.getTranslationX();
    float f2 = paramView.getTranslationY();
    Object localObject2 = paramTransitionValues.OooO0O0;
    int i = R.id.transition_position;
    localObject2 = (int[])((View)localObject2).getTag(i);
    i = 1;
    float f3;
    float f4;
    if (localObject2 != null)
    {
      int j = localObject2[0] - paramInt1;
      f3 = j + f1;
      int k = localObject2[i] - paramInt2;
      f4 = k + f2;
    }
    else
    {
      f3 = paramFloat1;
      f4 = paramFloat2;
    }
    float f5 = f3 - f1;
    int m = Math.round(f5);
    m = paramInt1 + m;
    float f6 = f4 - f2;
    int n = Math.round(f6);
    n = paramInt2 + n;
    paramView.setTranslationX(f3);
    paramView.setTranslationY(f4);
    boolean bool = f3 < paramFloat3;
    if (!bool)
    {
      bool = f4 < paramFloat4;
      if (!bool) {
        return null;
      }
    }
    int i1 = 2;
    PropertyValuesHolder[] arrayOfPropertyValuesHolder = new PropertyValuesHolder[i1];
    Property localProperty = View.TRANSLATION_X;
    float[] arrayOfFloat1 = new float[i1];
    arrayOfFloat1[0] = f3;
    arrayOfFloat1[i] = paramFloat3;
    Object localObject3 = PropertyValuesHolder.ofFloat(localProperty, arrayOfFloat1);
    arrayOfPropertyValuesHolder[0] = localObject3;
    localObject3 = View.TRANSLATION_Y;
    float[] arrayOfFloat2 = new float[i1];
    arrayOfFloat2[0] = f4;
    arrayOfFloat2[i] = paramFloat4;
    localObject2 = PropertyValuesHolder.ofFloat((Property)localObject3, arrayOfFloat2);
    arrayOfPropertyValuesHolder[i] = localObject2;
    localObject2 = ObjectAnimator.ofPropertyValuesHolder(paramView, arrayOfPropertyValuesHolder);
    TranslationAnimationCreator.TransitionPositionListener localTransitionPositionListener = new androidx/transition/TranslationAnimationCreator$TransitionPositionListener;
    localObject1 = ((TransitionValues)localObject1).OooO0O0;
    paramTransitionValues = localTransitionPositionListener;
    paramFloat3 = f1;
    paramFloat4 = f2;
    localTransitionPositionListener.<init>(paramView, (View)localObject1, m, n, f1, f2);
    paramTransition.addListener(localTransitionPositionListener);
    ((Animator)localObject2).addListener(localTransitionPositionListener);
    AnimatorUtils.OooO00o((Animator)localObject2, localTransitionPositionListener);
    ((Animator)localObject2).setInterpolator(paramTimeInterpolator);
    return localObject2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.TranslationAnimationCreator
 * JD-Core Version:    0.7.0.1
 */