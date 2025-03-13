package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

class AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState
  extends Drawable.ConstantState
{
  public int OooO00o;
  public VectorDrawableCompat OooO0O0;
  public AnimatorSet OooO0OO;
  public ArrayList OooO0Oo;
  public ArrayMap OooO0o0;
  
  public AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState(Context paramContext, AnimatedVectorDrawableCompatState paramAnimatedVectorDrawableCompatState, Drawable.Callback paramCallback, Resources paramResources)
  {
    if (paramAnimatedVectorDrawableCompatState != null)
    {
      int i = paramAnimatedVectorDrawableCompatState.OooO00o;
      this.OooO00o = i;
      paramContext = paramAnimatedVectorDrawableCompatState.OooO0O0;
      int j = 0;
      if (paramContext != null)
      {
        paramContext = paramContext.getConstantState();
        if (paramResources != null) {
          paramContext = paramContext.newDrawable(paramResources);
        } else {
          paramContext = paramContext.newDrawable();
        }
        paramContext = (VectorDrawableCompat)paramContext;
        this.OooO0O0 = paramContext;
        paramContext = (VectorDrawableCompat)this.OooO0O0.mutate();
        this.OooO0O0 = paramContext;
        paramContext.setCallback(paramCallback);
        paramContext = this.OooO0O0;
        paramCallback = paramAnimatedVectorDrawableCompatState.OooO0O0.getBounds();
        paramContext.setBounds(paramCallback);
        paramContext = this.OooO0O0;
        paramContext.setAllowCaching(false);
      }
      paramContext = paramAnimatedVectorDrawableCompatState.OooO0Oo;
      if (paramContext != null)
      {
        i = paramContext.size();
        paramCallback = new java/util/ArrayList;
        paramCallback.<init>(i);
        this.OooO0Oo = paramCallback;
        paramCallback = new androidx/collection/ArrayMap;
        paramCallback.<init>(i);
        this.OooO0o0 = paramCallback;
        while (j < i)
        {
          paramCallback = (Animator)paramAnimatedVectorDrawableCompatState.OooO0Oo.get(j);
          paramResources = paramCallback.clone();
          paramCallback = (String)paramAnimatedVectorDrawableCompatState.OooO0o0.get(paramCallback);
          Object localObject = this.OooO0O0.OooO0Oo(paramCallback);
          paramResources.setTarget(localObject);
          this.OooO0Oo.add(paramResources);
          localObject = this.OooO0o0;
          ((SimpleArrayMap)localObject).put(paramResources, paramCallback);
          j += 1;
        }
        OooO00o();
      }
    }
  }
  
  public void OooO00o()
  {
    AnimatorSet localAnimatorSet = this.OooO0OO;
    if (localAnimatorSet == null)
    {
      localAnimatorSet = new android/animation/AnimatorSet;
      localAnimatorSet.<init>();
      this.OooO0OO = localAnimatorSet;
    }
    localAnimatorSet = this.OooO0OO;
    ArrayList localArrayList = this.OooO0Oo;
    localAnimatorSet.playTogether(localArrayList);
  }
  
  public int getChangingConfigurations()
  {
    return this.OooO00o;
  }
  
  public Drawable newDrawable()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("No constant state support for SDK < 24.");
    throw localIllegalStateException;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    paramResources = new java/lang/IllegalStateException;
    paramResources.<init>("No constant state support for SDK < 24.");
    throw paramResources;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState
 * JD-Core Version:    0.7.0.1
 */