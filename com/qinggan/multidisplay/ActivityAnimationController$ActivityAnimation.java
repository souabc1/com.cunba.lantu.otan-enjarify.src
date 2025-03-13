package com.qinggan.multidisplay;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import m54207b69;

class ActivityAnimationController$ActivityAnimation
{
  public int OooO;
  public final int OooO00o;
  public final float OooO0O0;
  public Choreographer.FrameCallback OooO0OO;
  public Choreographer OooO0Oo;
  public int OooO0o;
  public boolean OooO0o0;
  public int OooO0oO;
  public int OooO0oo;
  public float OooOO0;
  
  public ActivityAnimationController$ActivityAnimation(ActivityAnimationController paramActivityAnimationController)
  {
    int i = 80;
    this.OooO00o = i;
    this.OooO0O0 = 16.0F;
    this.OooO0oO = 0;
    this.OooO0o = 0;
    this.OooOO0 = 5.0F;
    this.OooO0oo = i;
    this.OooO0o0 = false;
    paramActivityAnimationController = Choreographer.getInstance();
    this.OooO0Oo = paramActivityAnimationController;
    this.OooO0OO = null;
  }
  
  public void OooOO0()
  {
    long l = System.nanoTime();
    int i = this.OooO;
    int j = 1;
    Object localObject1;
    if (i == j)
    {
      localObject1 = new com/qinggan/multidisplay/ActivityAnimationController$ActivityAnimation$FlingFrameCallback;
      ((ActivityAnimationController.ActivityAnimation.FlingFrameCallback)localObject1).<init>(this, l);
    }
    String str;
    int k;
    int m;
    for (;;)
    {
      this.OooO0OO = ((Choreographer.FrameCallback)localObject1);
      break label468;
      str = m54207b69.F54207b69_11("QC632F123A26363D226B");
      k = 2;
      if (i != k) {
        break label193;
      }
      localObject1 = this.OooOO0O;
      k = ((AnimationController)localObject1).OooO00o;
      if (k == 0)
      {
        m = this.OooO0oO;
        if (m >= 0) {}
      }
      else
      {
        if (k != j) {
          break;
        }
        j = this.OooO0oO;
        i = -((AnimationController)localObject1).OooOOO0;
        if ((j <= i) || (j >= 0)) {
          break;
        }
      }
      localObject1 = new com/qinggan/multidisplay/ActivityAnimationController$ActivityAnimation$AbandonFrameCallback;
      ((ActivityAnimationController.ActivityAnimation.AbandonFrameCallback)localObject1).<init>(this, l);
    }
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    for (Object localObject3 = m54207b69.F54207b69_11("_O2C2F236B3F7442423646457A1A3A3C303B31338222363C394654403B3D8C938E4B475E6247535C96");; localObject3 = m54207b69.F54207b69_11("?_3C3F337B2F8432324636358A2A3E44414E3C484345947B96534F464A4F5B449E"))
    {
      ((StringBuilder)localObject2).append((String)localObject3);
      localObject3 = this.OooOO0O;
      n = ((AnimationController)localObject3).OooO00o;
      ((StringBuilder)localObject2).append(n);
      ((StringBuilder)localObject2).append(str);
      n = this.OooO0oO;
      break label460;
      label193:
      if (i != 0) {
        break label429;
      }
      localObject1 = this.OooOO0O;
      m = ((AnimationController)localObject1).OooO00o;
      int i1;
      int i2;
      if (m == 0)
      {
        i1 = this.OooO0oO;
        if (i1 >= 0)
        {
          i2 = ((AnimationController)localObject1).OooOOO0 / k;
          if (i1 <= i2)
          {
            localObject1 = new com/qinggan/multidisplay/ActivityAnimationController$ActivityAnimation$AbandonFrameCallback;
            ((ActivityAnimationController.ActivityAnimation.AbandonFrameCallback)localObject1).<init>(this, l);
            break;
          }
        }
      }
      if (m == 0)
      {
        i1 = this.OooO0oO;
        i2 = ((AnimationController)localObject1).OooOOO0 / k;
        if (i1 > i2)
        {
          localObject1 = new com/qinggan/multidisplay/ActivityAnimationController$ActivityAnimation$FlingFrameCallback;
          ((ActivityAnimationController.ActivityAnimation.FlingFrameCallback)localObject1).<init>(this, l);
          break;
        }
      }
      if (m == j)
      {
        i1 = this.OooO0oO;
        i2 = -((AnimationController)localObject1).OooOOO0 / k;
        if ((i1 >= i2) && (i1 < 0))
        {
          localObject1 = new com/qinggan/multidisplay/ActivityAnimationController$ActivityAnimation$AbandonFrameCallback;
          ((ActivityAnimationController.ActivityAnimation.AbandonFrameCallback)localObject1).<init>(this, l);
          break;
        }
      }
      if (m == j)
      {
        j = this.OooO0oO;
        i = ((AnimationController)localObject1).OooOOO0;
        m = -i;
        if (j > m)
        {
          i = -i / k;
          if (j < i)
          {
            localObject1 = new com/qinggan/multidisplay/ActivityAnimationController$ActivityAnimation$FlingFrameCallback;
            ((ActivityAnimationController.ActivityAnimation.FlingFrameCallback)localObject1).<init>(this, l);
            break;
          }
        }
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
    }
    label429:
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject3 = m54207b69.F54207b69_11("&s10131F570B58060E1A0A115E3E2A282D22182C2F31685F6A1E3632383821713D47223C37383B274E322C407E");
    ((StringBuilder)localObject2).append((String)localObject3);
    int n = this.OooO;
    label460:
    ((StringBuilder)localObject2).append(n);
    label468:
    localObject2 = this.OooO0OO;
    if (localObject2 != null)
    {
      MultiDisplayManager.OooOOOO.booleanValue();
      localObject2 = this.OooO0Oo;
      localObject3 = this.OooO0OO;
      ((Choreographer)localObject2).postFrameCallback((Choreographer.FrameCallback)localObject3);
    }
    else
    {
      localObject2 = this.OooOO0O;
      localObject3 = null;
      ((AnimationController)localObject2).OooO0oo(0, 0);
      localObject2 = this.OooOO0O;
      n = ActivityAnimationController.OooOOOO((ActivityAnimationController)localObject2);
      localObject1 = this.OooOO0O;
      i = ActivityAnimationController.OooOOOo((ActivityAnimationController)localObject1);
      ((AnimationController)localObject2).OooO(n, i);
    }
  }
  
  public void OooOO0O()
  {
    MultiDisplayManager.OooOOOO.booleanValue();
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      this.OooO0Oo.removeFrameCallback((Choreographer.FrameCallback)localObject);
      this.OooO0OO = null;
      localObject = this.OooOO0O;
      ((AnimationController)localObject).OooO0oo(0, 0);
      localObject = this.OooOO0O;
      int i = ActivityAnimationController.OooOOOO((ActivityAnimationController)localObject);
      ActivityAnimationController localActivityAnimationController = this.OooOO0O;
      int j = ActivityAnimationController.OooOOOo(localActivityAnimationController);
      ((AnimationController)localObject).OooO(i, j);
    }
  }
  
  public void setForSwap(boolean paramBoolean)
  {
    this.OooO0o0 = paramBoolean;
  }
  
  public void setStartX(int paramInt)
  {
    this.OooO0oO = paramInt;
    this.OooO0o = paramInt;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("H^330E2C42302F0C856B87");
    localStringBuilder.append(str);
    int i = this.OooO0oO;
    localStringBuilder.append(i);
  }
  
  public void setTriggerType(int paramInt)
  {
    this.OooO = paramInt;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11(":v1B2306221516190B2A18101E625864");
    localStringBuilder.append(str);
    int i = this.OooO;
    localStringBuilder.append(i);
  }
  
  public void setVelocityX(float paramFloat)
  {
    this.OooOO0 = paramFloat;
    int i = Math.abs((int)(paramFloat * 16.0F / 1000.0F));
    this.OooO0oo = i;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("ha0C38061012070E1C20424B674D");
    localStringBuilder.append(str);
    float f = this.OooOO0;
    localStringBuilder.append(f);
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    str = m54207b69.F54207b69_11("}\\31102A3C30153F3943313E876D89");
    localStringBuilder.append(str);
    int j = this.OooO0oo;
    localStringBuilder.append(j);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.multidisplay.ActivityAnimationController.ActivityAnimation
 * JD-Core Version:    0.7.0.1
 */