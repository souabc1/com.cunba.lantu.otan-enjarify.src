package androidx.dynamicanimation.animation;

final class FlingAnimation$DragForce
  implements Force
{
  public float OooO00o = -4.2F;
  public float OooO0O0;
  public final DynamicAnimation.MassState OooO0OO;
  
  public FlingAnimation$DragForce()
  {
    DynamicAnimation.MassState localMassState = new androidx/dynamicanimation/animation/DynamicAnimation$MassState;
    localMassState.<init>();
    this.OooO0OO = localMassState;
  }
  
  public boolean OooO00o(float paramFloat1, float paramFloat2)
  {
    paramFloat1 = Math.abs(paramFloat2);
    paramFloat2 = this.OooO0O0;
    boolean bool = paramFloat1 < paramFloat2;
    if (bool)
    {
      bool = true;
      paramFloat1 = 1.4E-45F;
    }
    else
    {
      bool = false;
      paramFloat1 = 0.0F;
    }
    return bool;
  }
  
  public DynamicAnimation.MassState OooO0O0(float paramFloat1, float paramFloat2, long paramLong)
  {
    DynamicAnimation.MassState localMassState1 = this.OooO0OO;
    double d1 = paramFloat2;
    float f1 = (float)paramLong;
    float f2 = 1000.0F;
    float f3 = f1 / f2;
    float f4 = this.OooO00o;
    f3 *= f4;
    double d2 = Math.exp(f3);
    d1 *= d2;
    float f5 = (float)d1;
    localMassState1.OooO0O0 = f5;
    localMassState1 = this.OooO0OO;
    f5 = this.OooO00o;
    float f6 = paramFloat2 / f5;
    double d3 = paramFloat1 - f6;
    double d4 = paramFloat2 / f5;
    f5 = f5 * f1 / f2;
    double d5 = Math.exp(f5);
    d4 *= d5;
    d3 += d4;
    paramFloat1 = (float)d3;
    localMassState1.OooO00o = paramFloat1;
    DynamicAnimation.MassState localMassState2 = this.OooO0OO;
    paramFloat2 = localMassState2.OooO00o;
    paramFloat1 = localMassState2.OooO0O0;
    boolean bool = OooO00o(paramFloat2, paramFloat1);
    if (bool)
    {
      localMassState2 = this.OooO0OO;
      paramFloat2 = 0.0F;
      localMassState2.OooO0O0 = 0.0F;
    }
    return this.OooO0OO;
  }
  
  public float getFrictionScalar()
  {
    return this.OooO00o / -4.2F;
  }
  
  public void setFrictionScalar(float paramFloat)
  {
    paramFloat *= -4.2F;
    this.OooO00o = paramFloat;
  }
  
  public void setValueThreshold(float paramFloat)
  {
    paramFloat *= 62.5F;
    this.OooO0O0 = paramFloat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.dynamicanimation.animation.FlingAnimation.DragForce
 * JD-Core Version:    0.7.0.1
 */