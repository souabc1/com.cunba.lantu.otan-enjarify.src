package com.qinggan.multidisplay;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.util.concurrent.TimeUnit;
import m54207b69;

class ActivityAnimationController$ActivityAnimation$FlingFrameCallback
  implements Choreographer.FrameCallback
{
  public long OooO00o;
  
  public ActivityAnimationController$ActivityAnimation$FlingFrameCallback(ActivityAnimationController.ActivityAnimation paramActivityAnimation, long paramLong)
  {
    this.OooO00o = paramLong;
  }
  
  public final int OooO00o(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < paramInt2)
    {
      float f1 = paramInt1;
      float f2 = 1.0F;
      f1 *= f2;
      float f3 = paramInt2;
      f1 /= f3;
      f2 -= f1;
      f1 = 5.0F;
      int i = (int)(f2 * f1);
      int j = 1;
      f2 = 1.4E-45F;
      if (paramInt3 <= 0) {
        paramInt3 = j;
      }
      paramInt2 -= paramInt1;
      paramInt1 = Math.min(i + j, paramInt3);
      return paramInt2 / paramInt1;
    }
    return 0;
  }
  
  public void doFrame(long paramLong)
  {
    Object localObject1 = MultiDisplayManager.OooOOOO;
    boolean bool1 = ((Boolean)localObject1).booleanValue();
    if (bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11(">I0F26222A3214412F2C351433313239373A337B4E503C7B8045555543593D444693");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = TimeUnit.NANOSECONDS;
      long l1 = this.OooO00o;
      l1 = paramLong - l1;
      long l2 = ((TimeUnit)localObject2).toMillis(l1);
      ((StringBuilder)localObject1).append(l2);
    }
    localObject1 = this.OooO0O0;
    Object localObject2 = ((ActivityAnimationController.ActivityAnimation)localObject1).OooOO0O;
    int m = ((AnimationController)localObject2).OooO00o;
    Object localObject3 = m54207b69.F54207b69_11("_n03020C0A0C1C540A452315292E180E182A17606662");
    int n = 1098907648;
    float f1 = 16.0F;
    int i1 = 1;
    int i2 = 80;
    Object localObject4;
    int i3;
    float f2;
    long l3;
    long l4;
    float f3;
    ActivityAnimationController.ActivityAnimation localActivityAnimation;
    int j;
    if (m == 0)
    {
      int i = ActivityAnimationController.ActivityAnimation.OooO00o((ActivityAnimationController.ActivityAnimation)localObject1);
      localObject2 = this.OooO0O0;
      localObject4 = ((ActivityAnimationController.ActivityAnimation)localObject2).OooOO0O;
      i3 = ((AnimationController)localObject4).OooOOO0;
      if (i < i3)
      {
        f2 = ActivityAnimationController.ActivityAnimation.OooO0Oo((ActivityAnimationController.ActivityAnimation)localObject2);
        localObject4 = TimeUnit.NANOSECONDS;
        l3 = this.OooO00o;
        l3 = paramLong - l3;
        l4 = ((TimeUnit)localObject4).toMillis(l3);
        f3 = (float)l4 / f1;
        f2 *= f3;
        ActivityAnimationController.ActivityAnimation.OooO0O0((ActivityAnimationController.ActivityAnimation)localObject2, f2);
        localObject1 = this.OooO0O0;
        i = ActivityAnimationController.ActivityAnimation.OooO0Oo((ActivityAnimationController.ActivityAnimation)localObject1);
        if (i < i2)
        {
          localObject1 = this.OooO0O0;
          m = ActivityAnimationController.ActivityAnimation.OooO0Oo((ActivityAnimationController.ActivityAnimation)localObject1);
          localActivityAnimation = this.OooO0O0;
          localObject4 = localActivityAnimation.OooOO0O;
          i3 = ((AnimationController)localObject4).OooOOO0;
          n = ActivityAnimationController.ActivityAnimation.OooO00o(localActivityAnimation);
          i3 -= n;
          localActivityAnimation = this.OooO0O0;
          n = ActivityAnimationController.ActivityAnimation.OooO0Oo(localActivityAnimation);
          i3 /= n;
          m = OooO00o(m, i2, i3);
          ActivityAnimationController.ActivityAnimation.OooO0o0((ActivityAnimationController.ActivityAnimation)localObject1, m);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append((String)localObject3);
          localObject2 = this.OooO0O0;
          m = ActivityAnimationController.ActivityAnimation.OooO0Oo((ActivityAnimationController.ActivityAnimation)localObject2);
          ((StringBuilder)localObject1).append(m);
        }
      }
      localObject1 = this.OooO0O0;
      i = ActivityAnimationController.ActivityAnimation.OooO00o((ActivityAnimationController.ActivityAnimation)localObject1);
      localObject2 = this.OooO0O0;
      localObject3 = ((ActivityAnimationController.ActivityAnimation)localObject2).OooOO0O;
      n = ((AnimationController)localObject3).OooOOO0;
      if (i >= n)
      {
        boolean bool2 = ActivityAnimationController.ActivityAnimation.OooO0o((ActivityAnimationController.ActivityAnimation)localObject2);
        if (bool2)
        {
          localObject1 = this.OooO0O0.OooOO0O;
          m = ((AnimationController)localObject1).OooOOO0 - i1;
          ((AnimationController)localObject1).OooOO0(m, 0);
          localObject1 = this.OooO0O0.OooOO0O;
          localObject2 = ((AnimationController)localObject1).OooO0oo;
          localObject1 = ActivityAnimationController.OooOOo0((ActivityAnimationController)localObject1);
          localObject3 = ActivityAnimationController.OooOOo(this.OooO0O0.OooOO0O);
          ((MultiDisplayManager)localObject2).OooOo0O((String)localObject1, (String)localObject3);
        }
        localObject1 = this.OooO0O0.OooOO0O;
        m = ((AnimationController)localObject1).OooOOO0;
        ((AnimationController)localObject1).OooOO0(m, 0);
        localObject1 = this.OooO0O0.OooOO0O;
        m = ((AnimationController)localObject1).OooOOO0;
        ((AnimationController)localObject1).OooO0oo(m, 0);
        localObject1 = this.OooO0O0.OooOO0O;
        m = ActivityAnimationController.OooOOOO((ActivityAnimationController)localObject1);
        localObject3 = this.OooO0O0.OooOO0O;
        int i4 = ActivityAnimationController.OooOOOo((ActivityAnimationController)localObject3);
        ((AnimationController)localObject1).OooO(m, i4);
        localObject1 = this.OooO0O0;
        ActivityAnimationController.ActivityAnimation.OooO0oo((ActivityAnimationController.ActivityAnimation)localObject1, null);
      }
      else
      {
        j = ActivityAnimationController.ActivityAnimation.OooO00o((ActivityAnimationController.ActivityAnimation)localObject2);
        ((AnimationController)localObject3).OooOO0(j, 0);
        localObject1 = ActivityAnimationController.ActivityAnimation.OooO0oO(this.OooO0O0);
        if (localObject1 == null) {}
      }
    }
    else
    {
      do
      {
        localObject1 = ActivityAnimationController.ActivityAnimation.OooO(this.OooO0O0);
        localObject2 = ActivityAnimationController.ActivityAnimation.OooO0oO(this.OooO0O0);
        ((Choreographer)localObject1).postFrameCallback((Choreographer.FrameCallback)localObject2);
        break label1032;
        if (m != i1) {
          break label1032;
        }
        j = ActivityAnimationController.ActivityAnimation.OooO00o((ActivityAnimationController.ActivityAnimation)localObject1);
        localObject2 = this.OooO0O0;
        localObject4 = ((ActivityAnimationController.ActivityAnimation)localObject2).OooOO0O;
        i3 = ((AnimationController)localObject4).OooOOO0;
        j += i3;
        if (j > 0)
        {
          f2 = ActivityAnimationController.ActivityAnimation.OooO0Oo((ActivityAnimationController.ActivityAnimation)localObject2);
          localObject4 = TimeUnit.NANOSECONDS;
          l3 = this.OooO00o;
          l3 = paramLong - l3;
          l4 = ((TimeUnit)localObject4).toMillis(l3);
          f3 = (float)l4 / f1;
          f2 *= f3;
          ActivityAnimationController.ActivityAnimation.OooO0OO((ActivityAnimationController.ActivityAnimation)localObject2, f2);
          localObject1 = this.OooO0O0;
          j = ActivityAnimationController.ActivityAnimation.OooO0Oo((ActivityAnimationController.ActivityAnimation)localObject1);
          if (j < i2)
          {
            localObject1 = this.OooO0O0;
            m = ActivityAnimationController.ActivityAnimation.OooO0Oo((ActivityAnimationController.ActivityAnimation)localObject1);
            localActivityAnimation = this.OooO0O0;
            localObject4 = localActivityAnimation.OooOO0O;
            i3 = ((AnimationController)localObject4).OooOOO0;
            n = ActivityAnimationController.ActivityAnimation.OooO00o(localActivityAnimation);
            i3 += n;
            localActivityAnimation = this.OooO0O0;
            n = ActivityAnimationController.ActivityAnimation.OooO0Oo(localActivityAnimation);
            i3 /= n;
            m = OooO00o(m, i2, i3);
            ActivityAnimationController.ActivityAnimation.OooO0o0((ActivityAnimationController.ActivityAnimation)localObject1, m);
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append((String)localObject3);
            localObject2 = this.OooO0O0;
            m = ActivityAnimationController.ActivityAnimation.OooO0Oo((ActivityAnimationController.ActivityAnimation)localObject2);
            ((StringBuilder)localObject1).append(m);
          }
        }
        localObject1 = this.OooO0O0;
        j = ActivityAnimationController.ActivityAnimation.OooO00o((ActivityAnimationController.ActivityAnimation)localObject1);
        localObject2 = this.OooO0O0;
        localObject3 = ((ActivityAnimationController.ActivityAnimation)localObject2).OooOO0O;
        n = ((AnimationController)localObject3).OooOOO0;
        j += n;
        if (j <= 0)
        {
          boolean bool3 = ActivityAnimationController.ActivityAnimation.OooO0o((ActivityAnimationController.ActivityAnimation)localObject2);
          if (bool3)
          {
            localObject1 = this.OooO0O0.OooOO0O;
            m = -((AnimationController)localObject1).OooOOO0 + i1;
            ((AnimationController)localObject1).OooOO0(m, 0);
            localObject1 = this.OooO0O0.OooOO0O;
            localObject2 = ((AnimationController)localObject1).OooO0oo;
            localObject1 = ActivityAnimationController.OooOOo0((ActivityAnimationController)localObject1);
            localObject3 = ActivityAnimationController.OooOOo(this.OooO0O0.OooOO0O);
            ((MultiDisplayManager)localObject2).OooOo0O((String)localObject1, (String)localObject3);
          }
          localObject1 = this.OooO0O0.OooOO0O;
          m = -((AnimationController)localObject1).OooOOO0;
          ((AnimationController)localObject1).OooOO0(m, 0);
          localObject1 = this.OooO0O0.OooOO0O;
          m = -((AnimationController)localObject1).OooOOO0;
          break;
        }
        int k = ActivityAnimationController.ActivityAnimation.OooO00o((ActivityAnimationController.ActivityAnimation)localObject2);
        ((AnimationController)localObject3).OooOO0(k, 0);
        localObject1 = ActivityAnimationController.ActivityAnimation.OooO0oO(this.OooO0O0);
      } while (localObject1 != null);
    }
    label1032:
    this.OooO00o = paramLong;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.multidisplay.ActivityAnimationController.ActivityAnimation.FlingFrameCallback
 * JD-Core Version:    0.7.0.1
 */