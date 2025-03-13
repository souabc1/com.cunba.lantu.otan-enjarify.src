package com.lzf.easyfloat.anim;

import android.animation.Animator;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.lzf.easyfloat.data.FloatConfig;
import com.lzf.easyfloat.enums.SidePattern;
import com.lzf.easyfloat.interfaces.OnFloatAnimator;

public final class AnimatorManager
{
  public final View OooO00o;
  public final WindowManager.LayoutParams OooO0O0;
  public final WindowManager OooO0OO;
  public final FloatConfig OooO0Oo;
  
  public AnimatorManager(View paramView, WindowManager.LayoutParams paramLayoutParams, WindowManager paramWindowManager, FloatConfig paramFloatConfig)
  {
    this.OooO00o = paramView;
    this.OooO0O0 = paramLayoutParams;
    this.OooO0OO = paramWindowManager;
    this.OooO0Oo = paramFloatConfig;
  }
  
  public final Animator OooO00o()
  {
    Object localObject = this.OooO0Oo.getFloatAnimator();
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      View localView = this.OooO00o;
      WindowManager.LayoutParams localLayoutParams = this.OooO0O0;
      WindowManager localWindowManager = this.OooO0OO;
      SidePattern localSidePattern = this.OooO0Oo.getSidePattern();
      localObject = ((OnFloatAnimator)localObject).OooO00o(localView, localLayoutParams, localWindowManager, localSidePattern);
    }
    return localObject;
  }
  
  public final Animator OooO0O0()
  {
    Object localObject = this.OooO0Oo.getFloatAnimator();
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      View localView = this.OooO00o;
      WindowManager.LayoutParams localLayoutParams = this.OooO0O0;
      WindowManager localWindowManager = this.OooO0OO;
      SidePattern localSidePattern = this.OooO0Oo.getSidePattern();
      localObject = ((OnFloatAnimator)localObject).OooO0O0(localView, localLayoutParams, localWindowManager, localSidePattern);
    }
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.anim.AnimatorManager
 * JD-Core Version:    0.7.0.1
 */