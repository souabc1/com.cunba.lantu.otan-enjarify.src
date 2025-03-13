package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.R.animator;
import androidx.fragment.R.id;

class FragmentAnim
{
  public static int OooO00o(Fragment paramFragment, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2)
    {
      if (paramBoolean1) {
        return paramFragment.getPopEnterAnim();
      }
      return paramFragment.getPopExitAnim();
    }
    if (paramBoolean1) {
      return paramFragment.getEnterAnim();
    }
    return paramFragment.getExitAnim();
  }
  
  public static FragmentAnim.AnimationOrAnimator OooO0O0(Context paramContext, Fragment paramFragment, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = paramFragment.getNextTransition();
    paramBoolean2 = OooO00o(paramFragment, paramBoolean1, paramBoolean2);
    int j = 0;
    paramFragment.setAnimations(0, 0, 0, 0);
    Object localObject1 = paramFragment.mContainer;
    if (localObject1 != null)
    {
      int k = R.id.visible_removing_fragment_view_tag;
      localObject1 = ((View)localObject1).getTag(k);
      if (localObject1 != null)
      {
        localObject1 = paramFragment.mContainer;
        k = R.id.visible_removing_fragment_view_tag;
        ((View)localObject1).setTag(k, null);
      }
    }
    localObject1 = paramFragment.mContainer;
    if (localObject1 != null)
    {
      localObject1 = ((ViewGroup)localObject1).getLayoutTransition();
      if (localObject1 != null) {
        return null;
      }
    }
    localObject1 = paramFragment.onCreateAnimation(i, paramBoolean1, paramBoolean2);
    if (localObject1 != null)
    {
      paramContext = new androidx/fragment/app/FragmentAnim$AnimationOrAnimator;
      paramContext.<init>((Animation)localObject1);
      return paramContext;
    }
    paramFragment = paramFragment.onCreateAnimator(i, paramBoolean1, paramBoolean2);
    if (paramFragment != null)
    {
      paramContext = new androidx/fragment/app/FragmentAnim$AnimationOrAnimator;
      paramContext.<init>(paramFragment);
      return paramContext;
    }
    if ((!paramBoolean2) && (i != 0)) {
      paramBoolean2 = OooO0Oo(paramContext, i, paramBoolean1);
    }
    if (paramBoolean2)
    {
      paramFragment = paramContext.getResources().getResourceTypeName(paramBoolean2);
      Object localObject2 = "anim";
      boolean bool = ((String)localObject2).equals(paramFragment);
      FragmentAnim.AnimationOrAnimator localAnimationOrAnimator;
      if (bool) {
        try
        {
          localObject2 = AnimationUtils.loadAnimation(paramContext, paramBoolean2);
          if (localObject2 != null)
          {
            localAnimationOrAnimator = new androidx/fragment/app/FragmentAnim$AnimationOrAnimator;
            localAnimationOrAnimator.<init>((Animation)localObject2);
            return localAnimationOrAnimator;
          }
          j = 1;
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          throw localNotFoundException;
        }
        catch (RuntimeException localRuntimeException2) {}
      }
      if (j == 0) {
        try
        {
          localObject2 = AnimatorInflater.loadAnimator(paramContext, paramBoolean2);
          if (localObject2 != null)
          {
            localAnimationOrAnimator = new androidx/fragment/app/FragmentAnim$AnimationOrAnimator;
            localAnimationOrAnimator.<init>((Animator)localObject2);
            return localAnimationOrAnimator;
          }
        }
        catch (RuntimeException localRuntimeException1)
        {
          if (!bool)
          {
            paramContext = AnimationUtils.loadAnimation(paramContext, paramBoolean2);
            if (paramContext != null)
            {
              paramFragment = new androidx/fragment/app/FragmentAnim$AnimationOrAnimator;
              paramFragment.<init>(paramContext);
              return paramFragment;
            }
          }
          else
          {
            throw localRuntimeException1;
          }
        }
      }
    }
    return null;
  }
  
  public static int OooO0OO(Context paramContext, int paramInt)
  {
    int[] arrayOfInt = { paramInt };
    paramContext = paramContext.obtainStyledAttributes(16973825, arrayOfInt);
    paramInt = paramContext.getResourceId(0, -1);
    paramContext.recycle();
    return paramInt;
  }
  
  public static int OooO0Oo(Context paramContext, int paramInt, boolean paramBoolean)
  {
    int i = 4097;
    int j;
    if (paramInt != i)
    {
      i = 8194;
      if (paramInt != i)
      {
        i = 8197;
        if (paramInt != i)
        {
          i = 4099;
          if (paramInt != i)
          {
            i = 4100;
            if (paramInt != i)
            {
              j = -1;
              break label147;
            }
            if (paramBoolean) {
              paramInt = 16842936;
            } else {
              paramInt = 16842937;
            }
          }
        }
        for (;;)
        {
          j = OooO0OO(paramContext, paramInt);
          break;
          if (paramBoolean)
          {
            j = R.animator.fragment_fade_enter;
            break;
          }
          j = R.animator.fragment_fade_exit;
          break;
          if (paramBoolean) {
            paramInt = 16842938;
          } else {
            paramInt = 16842939;
          }
        }
      }
      else if (paramBoolean)
      {
        j = R.animator.fragment_close_enter;
      }
      else
      {
        j = R.animator.fragment_close_exit;
      }
    }
    else if (paramBoolean)
    {
      j = R.animator.fragment_open_enter;
    }
    else
    {
      j = R.animator.fragment_open_exit;
    }
    label147:
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentAnim
 * JD-Core Version:    0.7.0.1
 */