package androidx.constraintlayout.motion.widget;

import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.KeyCache;

class ViewTransition$Animate
{
  public Interpolator OooO;
  public final int OooO00o;
  public final int OooO0O0;
  public long OooO0OO;
  public MotionController OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public KeyCache OooO0oO;
  public ViewTransitionController OooO0oo;
  public boolean OooOO0;
  public float OooOO0O;
  public float OooOO0o;
  public Rect OooOOO;
  public long OooOOO0;
  public boolean OooOOOO;
  
  public ViewTransition$Animate(ViewTransitionController paramViewTransitionController, MotionController paramMotionController, int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator, int paramInt4, int paramInt5)
  {
    KeyCache localKeyCache = new androidx/constraintlayout/core/motion/utils/KeyCache;
    localKeyCache.<init>();
    this.OooO0oO = localKeyCache;
    localKeyCache = null;
    this.OooOO0 = false;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.OooOOO = localRect;
    this.OooOOOO = false;
    this.OooO0oo = paramViewTransitionController;
    this.OooO0Oo = paramMotionController;
    this.OooO0o0 = paramInt1;
    this.OooO0o = paramInt2;
    long l = System.nanoTime();
    this.OooO0OO = l;
    this.OooOOO0 = l;
    paramViewTransitionController = this.OooO0oo;
    paramViewTransitionController.OooO0O0(this);
    this.OooO = paramInterpolator;
    this.OooO00o = paramInt4;
    this.OooO0O0 = paramInt5;
    int i = 3;
    float f1 = 4.203895E-045F;
    if (paramInt3 == i)
    {
      i = 1;
      f1 = 1.4E-45F;
      this.OooOOOO = i;
    }
    if (paramInt1 == 0)
    {
      i = 2139095039;
      f1 = 3.4028235E+38F;
    }
    else
    {
      i = 1065353216;
      float f2 = paramInt1;
      f1 = 1.0F / f2;
    }
    this.OooOO0o = f1;
    OooO00o();
  }
  
  public void OooO00o()
  {
    boolean bool = this.OooOO0;
    if (bool) {
      OooO0OO();
    } else {
      OooO0O0();
    }
  }
  
  public void OooO0O0()
  {
    long l1 = System.nanoTime();
    long l2 = this.OooOOO0;
    l2 = l1 - l2;
    this.OooOOO0 = l1;
    float f1 = this.OooOO0O;
    double d1 = l2;
    double d2 = 1.0E-006D;
    d1 *= d2;
    float f2 = (float)d1;
    float f3 = this.OooOO0o;
    f2 *= f3;
    f1 += f2;
    this.OooOO0O = f1;
    float f4 = 1.0F;
    boolean bool1 = f1 < f4;
    if (!bool1) {
      this.OooOO0O = f4;
    }
    Object localObject1 = this.OooO;
    if (localObject1 == null)
    {
      f2 = this.OooOO0O;
    }
    else
    {
      f3 = this.OooOO0O;
      f2 = ((TimeInterpolator)localObject1).getInterpolation(f3);
    }
    f1 = f2;
    localObject1 = this.OooO0Oo;
    Object localObject2 = ((MotionController)localObject1).OooO0O0;
    KeyCache localKeyCache = this.OooO0oO;
    bool1 = ((MotionController)localObject1).OooOOO0((View)localObject2, f2, l1, localKeyCache);
    f3 = this.OooOO0O;
    boolean bool2 = f3 < f4;
    if (!bool2)
    {
      int i = this.OooO00o;
      int j = -1;
      f1 = 0.0F / 0.0F;
      int k;
      if (i != j)
      {
        localObject2 = this.OooO0Oo.getView();
        k = this.OooO00o;
        long l3 = System.nanoTime();
        Long localLong = Long.valueOf(l3);
        ((View)localObject2).setTag(k, localLong);
      }
      i = this.OooO0O0;
      if (i != j)
      {
        localObject2 = this.OooO0Oo.getView();
        j = this.OooO0O0;
        k = 0;
        ((View)localObject2).setTag(j, null);
      }
      bool3 = this.OooOOOO;
      if (!bool3)
      {
        localObject2 = this.OooO0oo;
        ((ViewTransitionController)localObject2).OooO0oO(this);
      }
    }
    f3 = this.OooOO0O;
    boolean bool3 = f3 < f4;
    if ((bool3) || (bool1))
    {
      localObject1 = this.OooO0oo;
      ((ViewTransitionController)localObject1).OooO0o0();
    }
  }
  
  public void OooO0OO()
  {
    long l1 = System.nanoTime();
    long l2 = this.OooOOO0;
    l2 = l1 - l2;
    this.OooOOO0 = l1;
    float f1 = this.OooOO0O;
    double d1 = l2;
    double d2 = 1.0E-006D;
    d1 *= d2;
    float f2 = (float)d1;
    float f3 = this.OooOO0o;
    f2 *= f3;
    f1 -= f2;
    this.OooOO0O = f1;
    boolean bool1 = f1 < 0.0F;
    if (bool1) {
      this.OooOO0O = 0.0F;
    }
    Object localObject1 = this.OooO;
    if (localObject1 == null)
    {
      f2 = this.OooOO0O;
    }
    else
    {
      f3 = this.OooOO0O;
      f2 = ((TimeInterpolator)localObject1).getInterpolation(f3);
    }
    f1 = f2;
    localObject1 = this.OooO0Oo;
    Object localObject2 = ((MotionController)localObject1).OooO0O0;
    KeyCache localKeyCache = this.OooO0oO;
    bool1 = ((MotionController)localObject1).OooOOO0((View)localObject2, f2, l1, localKeyCache);
    f3 = this.OooOO0O;
    boolean bool2 = f3 < 0.0F;
    if (!bool2)
    {
      int i = this.OooO00o;
      int j = -1;
      f1 = 0.0F / 0.0F;
      int k;
      if (i != j)
      {
        localObject2 = this.OooO0Oo.getView();
        k = this.OooO00o;
        long l3 = System.nanoTime();
        Long localLong = Long.valueOf(l3);
        ((View)localObject2).setTag(k, localLong);
      }
      i = this.OooO0O0;
      if (i != j)
      {
        localObject2 = this.OooO0Oo.getView();
        j = this.OooO0O0;
        k = 0;
        ((View)localObject2).setTag(j, null);
      }
      localObject2 = this.OooO0oo;
      ((ViewTransitionController)localObject2).OooO0oO(this);
    }
    f3 = this.OooOO0O;
    boolean bool3 = f3 < 0.0F;
    if ((bool3) || (bool1))
    {
      localObject1 = this.OooO0oo;
      ((ViewTransitionController)localObject1).OooO0o0();
    }
  }
  
  public void OooO0Oo(int paramInt, float paramFloat1, float paramFloat2)
  {
    int i = 1;
    if (paramInt != i)
    {
      int j = 2;
      if (paramInt == j)
      {
        Object localObject = this.OooO0Oo.getView();
        Rect localRect = this.OooOOO;
        ((View)localObject).getHitRect(localRect);
        localObject = this.OooOOO;
        int k = (int)paramFloat1;
        int m = (int)paramFloat2;
        paramInt = ((Rect)localObject).contains(k, m);
        if (paramInt == 0)
        {
          paramInt = this.OooOO0;
          if (paramInt == 0) {
            OooO0o0(i);
          }
        }
      }
      return;
    }
    paramInt = this.OooOO0;
    if (paramInt == 0) {
      OooO0o0(i);
    }
  }
  
  public void OooO0o0(boolean paramBoolean)
  {
    this.OooOO0 = paramBoolean;
    if (paramBoolean)
    {
      paramBoolean = this.OooO0o;
      boolean bool = true;
      float f1 = 0.0F / 0.0F;
      if (paramBoolean != bool)
      {
        float f2;
        if (!paramBoolean)
        {
          paramBoolean = 2139095039;
          f2 = 3.4028235E+38F;
        }
        else
        {
          int i = 1065353216;
          f1 = 1.0F;
          f2 = paramBoolean;
          f2 = f1 / f2;
        }
        this.OooOO0o = f2;
      }
    }
    this.OooO0oo.OooO0o0();
    long l = System.nanoTime();
    this.OooOOO0 = l;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.ViewTransition.Animate
 * JD-Core Version:    0.7.0.1
 */