package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;

public class AnimatorInflaterCompat
{
  public static Animator OooO00o(Context paramContext, int paramInt)
  {
    return AnimatorInflater.loadAnimator(paramContext, paramInt);
  }
  
  private static boolean isColorType(int paramInt)
  {
    int i = 28;
    if (paramInt >= i)
    {
      i = 31;
      if (paramInt <= i) {
        return 1;
      }
    }
    paramInt = 0;
    return paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat
 * JD-Core Version:    0.7.0.1
 */