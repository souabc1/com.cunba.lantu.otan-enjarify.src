package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.OneShotPreDrawListener;

class FragmentAnim$EndViewTransitionAnimation
  extends AnimationSet
  implements Runnable
{
  public final ViewGroup o00OoOoo;
  public boolean o00Ooo0;
  public final View o00Ooo00;
  public boolean o00Ooo0O;
  public boolean o00Ooo0o = true;
  
  public FragmentAnim$EndViewTransitionAnimation(Animation paramAnimation, ViewGroup paramViewGroup, View paramView)
  {
    super(false);
    this.o00OoOoo = paramViewGroup;
    this.o00Ooo00 = paramView;
    addAnimation(paramAnimation);
    paramViewGroup.post(this);
  }
  
  public boolean getTransformation(long paramLong, Transformation paramTransformation)
  {
    boolean bool1 = true;
    this.o00Ooo0o = bool1;
    boolean bool2 = this.o00Ooo0;
    if (bool2) {
      return this.o00Ooo0O ^ bool1;
    }
    boolean bool3 = super.getTransformation(paramLong, paramTransformation);
    if (!bool3)
    {
      this.o00Ooo0 = bool1;
      ViewGroup localViewGroup = this.o00OoOoo;
      OneShotPreDrawListener.OooO00o(localViewGroup, this);
    }
    return bool1;
  }
  
  public boolean getTransformation(long paramLong, Transformation paramTransformation, float paramFloat)
  {
    boolean bool1 = true;
    this.o00Ooo0o = bool1;
    boolean bool2 = this.o00Ooo0;
    if (bool2) {
      return this.o00Ooo0O ^ bool1;
    }
    boolean bool3 = super.getTransformation(paramLong, paramTransformation, paramFloat);
    if (!bool3)
    {
      this.o00Ooo0 = bool1;
      ViewGroup localViewGroup = this.o00OoOoo;
      OneShotPreDrawListener.OooO00o(localViewGroup, this);
    }
    return bool1;
  }
  
  public void run()
  {
    boolean bool = this.o00Ooo0;
    if (!bool)
    {
      bool = this.o00Ooo0o;
      if (bool)
      {
        bool = false;
        this.o00Ooo0o = false;
        localViewGroup = this.o00OoOoo;
        localViewGroup.post(this);
        return;
      }
    }
    ViewGroup localViewGroup = this.o00OoOoo;
    View localView = this.o00Ooo00;
    localViewGroup.endViewTransition(localView);
    bool = true;
    this.o00Ooo0O = bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentAnim.EndViewTransitionAnimation
 * JD-Core Version:    0.7.0.1
 */