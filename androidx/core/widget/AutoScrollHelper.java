package androidx.core.widget;

import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;

public abstract class AutoScrollHelper
  implements View.OnTouchListener
{
  public static final int o00o00 = ;
  public final AutoScrollHelper.ClampedScroller o00OoOoo;
  public final View o00Ooo0;
  public final Interpolator o00Ooo00;
  public Runnable o00Ooo0O;
  public float[] o00Ooo0o;
  public int o00OooO;
  public float[] o00OooO0;
  public int o00OooOO;
  public float[] o00OooOo;
  public float[] o00OoooO;
  public boolean o00Ooooo;
  public boolean o00o000;
  public boolean o00o0000;
  public boolean o00o000O;
  public boolean o00o000o;
  public float[] o0O00o0;
  public boolean oo00oO;
  
  public AutoScrollHelper(View paramView)
  {
    Object localObject = new androidx/core/widget/AutoScrollHelper$ClampedScroller;
    ((AutoScrollHelper.ClampedScroller)localObject).<init>();
    this.o00OoOoo = ((AutoScrollHelper.ClampedScroller)localObject);
    localObject = new android/view/animation/AccelerateInterpolator;
    ((AccelerateInterpolator)localObject).<init>();
    this.o00Ooo00 = ((Interpolator)localObject);
    int i = 2;
    float[] arrayOfFloat = new float[i];
    float[] tmp39_37 = arrayOfFloat;
    tmp39_37[0] = 0.0F;
    tmp39_37[1] = 0.0F;
    this.o00Ooo0o = arrayOfFloat;
    arrayOfFloat = new float[i];
    float[] tmp59_57 = arrayOfFloat;
    tmp59_57[0] = 3.4028235E+38F;
    tmp59_57[1] = 3.4028235E+38F;
    this.o00OooO0 = arrayOfFloat;
    arrayOfFloat = new float[i];
    float[] tmp81_79 = arrayOfFloat;
    tmp81_79[0] = 0.0F;
    tmp81_79[1] = 0.0F;
    this.o00OooOo = arrayOfFloat;
    arrayOfFloat = new float[i];
    float[] tmp101_99 = arrayOfFloat;
    tmp101_99[0] = 0.0F;
    tmp101_99[1] = 0.0F;
    this.o0O00o0 = arrayOfFloat;
    localObject = new float[i];
    Object tmp119_118 = localObject;
    tmp119_118[0] = 3.4028235E+38F;
    tmp119_118[1] = 3.4028235E+38F;
    this.o00OoooO = ((float[])localObject);
    this.o00Ooo0 = paramView;
    float f1 = Resources.getSystem().getDisplayMetrics().density;
    float f2 = 1575.0F * f1;
    float f3 = 0.5F;
    i = (int)(f2 + f3);
    int j = (int)(f1 * 315.0F + f3);
    f2 = i;
    OooOOOO(f2, f2);
    f1 = j;
    OooOOOo(f1, f1);
    OooOO0o(1);
    f1 = 3.4028235E+38F;
    OooOOO(f1, f1);
    f1 = 0.2F;
    OooOOoo(f1, f1);
    f1 = 1.0F;
    OooOo00(f1, f1);
    j = o00o00;
    OooOO0O(j);
    j = 500;
    OooOOo(j);
    OooOOo0(j);
  }
  
  public static int OooO0o(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > paramInt3) {
      return paramInt3;
    }
    if (paramInt1 < paramInt2) {
      return paramInt2;
    }
    return paramInt1;
  }
  
  public static float OooO0o0(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool1 = paramFloat1 < paramFloat3;
    if (bool1) {
      return paramFloat3;
    }
    boolean bool2 = paramFloat1 < paramFloat2;
    if (bool2) {
      return paramFloat2;
    }
    return paramFloat1;
  }
  
  public final void OooO()
  {
    boolean bool = this.o00o0000;
    AutoScrollHelper.ClampedScroller localClampedScroller;
    if (bool)
    {
      bool = false;
      localClampedScroller = null;
      this.o00o000O = false;
    }
    else
    {
      localClampedScroller = this.o00OoOoo;
      localClampedScroller.OooO0Oo();
    }
  }
  
  public abstract boolean OooO00o(int paramInt);
  
  public abstract boolean OooO0O0(int paramInt);
  
  public void OooO0OO()
  {
    long l = SystemClock.uptimeMillis();
    MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
    this.o00Ooo0.onTouchEvent(localMotionEvent);
    localMotionEvent.recycle();
  }
  
  public final float OooO0Oo(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float[] arrayOfFloat1 = this.o00Ooo0o;
    float f1 = arrayOfFloat1[paramInt];
    float[] arrayOfFloat2 = this.o00OooO0;
    float f2 = arrayOfFloat2[paramInt];
    paramFloat1 = OooO0oo(f1, paramFloat2, f2, paramFloat1);
    paramFloat2 = 0.0F;
    float[] arrayOfFloat3 = null;
    boolean bool = paramFloat1 < 0.0F;
    if (!bool) {
      return 0.0F;
    }
    arrayOfFloat3 = this.o00OooOo;
    paramFloat2 = arrayOfFloat3[paramInt];
    arrayOfFloat2 = this.o0O00o0;
    f2 = arrayOfFloat2[paramInt];
    float[] arrayOfFloat4 = this.o00OoooO;
    float f3 = arrayOfFloat4[paramInt];
    paramFloat2 *= paramFloat3;
    if (bool) {
      return OooO0o0(paramFloat1 * paramFloat2, f2, f3);
    }
    return -OooO0o0(-paramFloat1 * paramFloat2, f2, f3);
  }
  
  public final float OooO0oO(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = paramFloat2 < 0.0F;
    if (!bool1) {
      return 0.0F;
    }
    int i = this.o00OooO;
    int k = 1;
    int j;
    if ((i != 0) && (i != k))
    {
      k = 2;
      if (i == k)
      {
        j = paramFloat1 < 0.0F;
        if (j < 0)
        {
          paramFloat2 = -paramFloat2;
          return paramFloat1 / paramFloat2;
        }
      }
    }
    else
    {
      boolean bool2 = paramFloat1 < paramFloat2;
      if (bool2)
      {
        bool2 = paramFloat1 < 0.0F;
        float f = 1.0F;
        if (!bool2)
        {
          paramFloat1 /= paramFloat2;
          return f - paramFloat1;
        }
        boolean bool3 = this.o00o000O;
        if ((bool3) && (j == k)) {
          return f;
        }
      }
    }
    return 0.0F;
  }
  
  public final float OooO0oo(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat1 = OooO0o0(paramFloat1 * paramFloat2, 0.0F, paramFloat3);
    paramFloat3 = OooO0oO(paramFloat4, paramFloat1);
    paramFloat2 -= paramFloat4;
    paramFloat1 = OooO0oO(paramFloat2, paramFloat1) - paramFloat3;
    boolean bool = paramFloat1 < 0.0F;
    Interpolator localInterpolator;
    if (bool)
    {
      localInterpolator = this.o00Ooo00;
      paramFloat1 = -paramFloat1;
      paramFloat1 = -localInterpolator.getInterpolation(paramFloat1);
    }
    else
    {
      bool = paramFloat1 < 0.0F;
      if (!bool) {
        break label97;
      }
      localInterpolator = this.o00Ooo00;
      paramFloat1 = localInterpolator.getInterpolation(paramFloat1);
    }
    return OooO0o0(paramFloat1, -1.0F, 1.0F);
    label97:
    return 0.0F;
  }
  
  public abstract void OooOO0(int paramInt1, int paramInt2);
  
  public AutoScrollHelper OooOO0O(int paramInt)
  {
    this.o00OooOO = paramInt;
    return this;
  }
  
  public AutoScrollHelper OooOO0o(int paramInt)
  {
    this.o00OooO = paramInt;
    return this;
  }
  
  public AutoScrollHelper OooOOO(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.o00OooO0;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public AutoScrollHelper OooOOO0(boolean paramBoolean)
  {
    boolean bool = this.o00o000o;
    if ((bool) && (!paramBoolean)) {
      OooO();
    }
    this.o00o000o = paramBoolean;
    return this;
  }
  
  public AutoScrollHelper OooOOOO(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.o00OoooO;
    float f = 1000.0F;
    paramFloat1 /= f;
    arrayOfFloat[0] = paramFloat1;
    paramFloat2 /= f;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public AutoScrollHelper OooOOOo(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.o0O00o0;
    float f = 1000.0F;
    paramFloat1 /= f;
    arrayOfFloat[0] = paramFloat1;
    paramFloat2 /= f;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public AutoScrollHelper OooOOo(int paramInt)
  {
    this.o00OoOoo.setRampUpDuration(paramInt);
    return this;
  }
  
  public AutoScrollHelper OooOOo0(int paramInt)
  {
    this.o00OoOoo.setRampDownDuration(paramInt);
    return this;
  }
  
  public AutoScrollHelper OooOOoo(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.o00Ooo0o;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public boolean OooOo0()
  {
    AutoScrollHelper.ClampedScroller localClampedScroller = this.o00OoOoo;
    int i = localClampedScroller.getVerticalDirection();
    int j = localClampedScroller.getHorizontalDirection();
    if (i != 0)
    {
      boolean bool1 = OooO0O0(i);
      if (bool1) {}
    }
    else
    {
      if (j == 0) {
        break label48;
      }
      bool2 = OooO00o(j);
      if (!bool2) {
        break label48;
      }
    }
    boolean bool2 = true;
    return bool2;
    label48:
    bool2 = false;
    localClampedScroller = null;
    return bool2;
  }
  
  public AutoScrollHelper OooOo00(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.o00OooOo;
    float f = 1000.0F;
    paramFloat1 /= f;
    arrayOfFloat[0] = paramFloat1;
    paramFloat2 /= f;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public final void OooOo0O()
  {
    Object localObject = this.o00Ooo0O;
    if (localObject == null)
    {
      localObject = new androidx/core/widget/AutoScrollHelper$ScrollAnimationRunnable;
      ((AutoScrollHelper.ScrollAnimationRunnable)localObject).<init>(this);
      this.o00Ooo0O = ((Runnable)localObject);
    }
    boolean bool1 = true;
    this.o00o000O = bool1;
    this.o00o0000 = bool1;
    boolean bool2 = this.o00Ooooo;
    if (!bool2)
    {
      int i = this.o00OooOO;
      if (i > 0)
      {
        View localView = this.o00Ooo0;
        Runnable localRunnable1 = this.o00Ooo0O;
        long l = i;
        ViewCompat.ooOO(localView, localRunnable1, l);
        break label94;
      }
    }
    Runnable localRunnable2 = this.o00Ooo0O;
    localRunnable2.run();
    label94:
    this.o00Ooooo = bool1;
  }
  
  public boolean isEnabled()
  {
    return this.o00o000o;
  }
  
  public boolean isExclusive()
  {
    return this.oo00oO;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = this.o00o000o;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    int i = paramMotionEvent.getActionMasked();
    int j = 1;
    if (i != 0)
    {
      if (i != j)
      {
        k = 2;
        f1 = 2.802597E-045F;
        if (i != k)
        {
          int m = 3;
          f2 = 4.203895E-045F;
          if (i != m) {
            break label207;
          }
        }
      }
      else
      {
        OooO();
        break label207;
      }
    }
    else
    {
      this.o00o000 = j;
      this.o00Ooooo = false;
    }
    float f3 = paramMotionEvent.getX();
    float f1 = paramView.getWidth();
    View localView1 = this.o00Ooo0;
    int n = localView1.getWidth();
    float f4 = n;
    f3 = OooO0Oo(0, f3, f1, f4);
    float f5 = paramMotionEvent.getY();
    float f2 = paramView.getHeight();
    View localView2 = this.o00Ooo0;
    int k = localView2.getHeight();
    f1 = k;
    f2 = OooO0Oo(j, f5, f2, f1);
    paramMotionEvent = this.o00OoOoo;
    paramMotionEvent.OooO0o0(f3, f2);
    boolean bool3 = this.o00o000O;
    if (!bool3)
    {
      bool3 = OooOo0();
      if (bool3) {
        OooOo0O();
      }
    }
    label207:
    bool3 = this.oo00oO;
    if (bool3)
    {
      bool3 = this.o00o000O;
      if (bool3) {
        bool2 = j;
      }
    }
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.AutoScrollHelper
 * JD-Core Version:    0.7.0.1
 */