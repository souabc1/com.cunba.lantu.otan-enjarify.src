package androidx.appcompat.graphics.drawable;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

class AnimatedStateListDrawableCompat$FrameInterpolator
  implements TimeInterpolator
{
  public int[] OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  
  public AnimatedStateListDrawableCompat$FrameInterpolator(AnimationDrawable paramAnimationDrawable, boolean paramBoolean)
  {
    OooO00o(paramAnimationDrawable, paramBoolean);
  }
  
  public int OooO00o(AnimationDrawable paramAnimationDrawable, boolean paramBoolean)
  {
    int i = paramAnimationDrawable.getNumberOfFrames();
    this.OooO0O0 = i;
    int[] arrayOfInt = this.OooO00o;
    if (arrayOfInt != null)
    {
      int j = arrayOfInt.length;
      if (j >= i) {}
    }
    else
    {
      arrayOfInt = new int[i];
      this.OooO00o = arrayOfInt;
    }
    arrayOfInt = this.OooO00o;
    int k = 0;
    int m = 0;
    while (k < i)
    {
      if (paramBoolean) {
        n = i - k + -1;
      } else {
        n = k;
      }
      int n = paramAnimationDrawable.getDuration(n);
      arrayOfInt[k] = n;
      m += n;
      k += 1;
    }
    this.OooO0OO = m;
    return m;
  }
  
  public float getInterpolation(float paramFloat)
  {
    float f1 = this.OooO0OO;
    paramFloat *= f1;
    f1 = 0.5F;
    paramFloat += f1;
    int i = (int)paramFloat;
    int j = this.OooO0O0;
    int[] arrayOfInt = this.OooO00o;
    int k = 0;
    while (k < j)
    {
      int m = arrayOfInt[k];
      if (i < m) {
        break;
      }
      i -= m;
      k += 1;
    }
    if (k < j)
    {
      paramFloat = i;
      int n = this.OooO0OO;
      f2 = n;
      paramFloat /= f2;
    }
    else
    {
      i = 0;
      paramFloat = 0.0F;
    }
    float f2 = k;
    f1 = j;
    return f2 / f1 + paramFloat;
  }
  
  public int getTotalDuration()
  {
    return this.OooO0OO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.FrameInterpolator
 * JD-Core Version:    0.7.0.1
 */