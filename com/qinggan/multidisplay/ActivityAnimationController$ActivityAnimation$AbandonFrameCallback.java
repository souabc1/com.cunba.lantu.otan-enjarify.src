package com.qinggan.multidisplay;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.util.concurrent.TimeUnit;
import m54207b69;

class ActivityAnimationController$ActivityAnimation$AbandonFrameCallback
  implements Choreographer.FrameCallback
{
  public long OooO00o;
  
  public ActivityAnimationController$ActivityAnimation$AbandonFrameCallback(ActivityAnimationController.ActivityAnimation paramActivityAnimation, long paramLong)
  {
    this.OooO00o = paramLong;
  }
  
  public void doFrame(long paramLong)
  {
    Object localObject1 = MultiDisplayManager.OooOOOO;
    boolean bool = ((Boolean)localObject1).booleanValue();
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("e9785C5A5A615B5D8653615E67866563646B696C652D60626E2D32776767756B6F767825");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = TimeUnit.NANOSECONDS;
      long l1 = this.OooO00o;
      l1 = paramLong - l1;
      long l2 = ((TimeUnit)localObject2).toMillis(l1);
      ((StringBuilder)localObject1).append(l2);
    }
    localObject1 = this.OooO0O0;
    Object localObject2 = ((ActivityAnimationController.ActivityAnimation)localObject1).OooOO0O;
    int j = ((AnimationController)localObject2).OooO00o;
    int k = 1117782016;
    float f1 = 80.0F;
    float f2 = 16.0F;
    int m = 80;
    int i;
    long l3;
    float f3;
    if (j == 0)
    {
      i = ActivityAnimationController.ActivityAnimation.OooO00o((ActivityAnimationController.ActivityAnimation)localObject1);
      if (i > m)
      {
        localObject1 = this.OooO0O0;
        localObject2 = TimeUnit.NANOSECONDS;
        l3 = this.OooO00o;
        l3 = paramLong - l3;
        l3 = ((TimeUnit)localObject2).toMillis(l3);
        f3 = (float)l3 / f2 * f1;
        ActivityAnimationController.ActivityAnimation.OooO0OO((ActivityAnimationController.ActivityAnimation)localObject1, f3);
        localObject1 = this.OooO0O0;
        localObject2 = ((ActivityAnimationController.ActivityAnimation)localObject1).OooOO0O;
        i = ActivityAnimationController.ActivityAnimation.OooO00o((ActivityAnimationController.ActivityAnimation)localObject1);
        ((AnimationController)localObject2).OooOO0(i, 0);
        localObject1 = ActivityAnimationController.ActivityAnimation.OooO0oO(this.OooO0O0);
        if (localObject1 == null) {
          break label423;
        }
      }
    }
    do
    {
      localObject1 = ActivityAnimationController.ActivityAnimation.OooO(this.OooO0O0);
      localObject2 = ActivityAnimationController.ActivityAnimation.OooO0oO(this.OooO0O0);
      ((Choreographer)localObject1).postFrameCallback((Choreographer.FrameCallback)localObject2);
      break;
      do
      {
        this.OooO0O0.OooOO0O.OooOO0(0, 0);
        this.OooO0O0.OooOO0O.OooO0oo(0, 0);
        localObject1 = this.OooO0O0.OooOO0O;
        j = ActivityAnimationController.OooOOOO((ActivityAnimationController)localObject1);
        ActivityAnimationController localActivityAnimationController = this.OooO0O0.OooOO0O;
        k = ActivityAnimationController.OooOOOo(localActivityAnimationController);
        ((AnimationController)localObject1).OooO(j, k);
        localObject1 = this.OooO0O0;
        ActivityAnimationController.ActivityAnimation.OooO0oo((ActivityAnimationController.ActivityAnimation)localObject1, null);
        break;
        int n = 1;
        if (j != n) {
          break;
        }
        i = ActivityAnimationController.ActivityAnimation.OooO00o((ActivityAnimationController.ActivityAnimation)localObject1) + m;
      } while (i >= 0);
      localObject1 = this.OooO0O0;
      localObject2 = TimeUnit.NANOSECONDS;
      l3 = this.OooO00o;
      l3 = paramLong - l3;
      l3 = ((TimeUnit)localObject2).toMillis(l3);
      f3 = (float)l3 / f2 * f1;
      ActivityAnimationController.ActivityAnimation.OooO0O0((ActivityAnimationController.ActivityAnimation)localObject1, f3);
      localObject1 = this.OooO0O0;
      localObject2 = ((ActivityAnimationController.ActivityAnimation)localObject1).OooOO0O;
      i = ActivityAnimationController.ActivityAnimation.OooO00o((ActivityAnimationController.ActivityAnimation)localObject1);
      ((AnimationController)localObject2).OooOO0(i, 0);
      localObject1 = ActivityAnimationController.ActivityAnimation.OooO0oO(this.OooO0O0);
    } while (localObject1 != null);
    label423:
    this.OooO00o = paramLong;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.multidisplay.ActivityAnimationController.ActivityAnimation.AbandonFrameCallback
 * JD-Core Version:    0.7.0.1
 */