package androidx.dynamicanimation.animation;

public final class SpringForce
  implements Force
{
  public double OooO;
  public double OooO00o;
  public double OooO0O0;
  public boolean OooO0OO;
  public double OooO0Oo;
  public double OooO0o;
  public double OooO0o0;
  public double OooO0oO;
  public double OooO0oo;
  public final DynamicAnimation.MassState OooOO0;
  
  public SpringForce()
  {
    double d = Math.sqrt(1500.0D);
    this.OooO00o = d;
    this.OooO0O0 = 0.5D;
    this.OooO0OO = false;
    this.OooO = 1.7976931348623157E+308D;
    DynamicAnimation.MassState localMassState = new androidx/dynamicanimation/animation/DynamicAnimation$MassState;
    localMassState.<init>();
    this.OooOO0 = localMassState;
  }
  
  public SpringForce(float paramFloat)
  {
    double d = Math.sqrt(1500.0D);
    this.OooO00o = d;
    this.OooO0O0 = 0.5D;
    this.OooO0OO = false;
    this.OooO = 1.7976931348623157E+308D;
    DynamicAnimation.MassState localMassState = new androidx/dynamicanimation/animation/DynamicAnimation$MassState;
    localMassState.<init>();
    this.OooOO0 = localMassState;
    d = paramFloat;
    this.OooO = d;
  }
  
  public final void OooO00o()
  {
    boolean bool1 = this.OooO0OO;
    if (bool1) {
      return;
    }
    double d1 = this.OooO;
    double d2 = 1.7976931348623157E+308D;
    bool1 = d1 < d2;
    if (bool1)
    {
      d1 = this.OooO0O0;
      d2 = 1.0D;
      boolean bool2 = d1 < d2;
      double d3;
      if (bool2)
      {
        d3 = -d1;
        double d4 = this.OooO00o;
        d3 *= d4;
        d1 = Math.sqrt(d1 * d1 - d2);
        d4 *= d1;
        d3 += d4;
        this.OooO0o = d3;
        d1 = this.OooO0O0;
        d3 = -d1;
        d4 = this.OooO00o;
        d3 *= d4;
        d1 = Math.sqrt(d1 * d1 - d2);
        d4 *= d1;
        d3 -= d4;
        this.OooO0oO = d3;
      }
      else
      {
        d3 = 0.0D;
        bool2 = d1 < d3;
        if (!bool2)
        {
          bool2 = d1 < d2;
          if (bool2)
          {
            d3 = this.OooO00o;
            d1 *= d1;
            d2 -= d1;
            d1 = Math.sqrt(d2);
            d3 *= d1;
            this.OooO0oo = d3;
          }
        }
      }
      this.OooO0OO = true;
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Error: Final position of the spring must be set before the animation starts");
    throw localIllegalStateException;
  }
  
  public boolean OooO0O0(float paramFloat1, float paramFloat2)
  {
    paramFloat2 = Math.abs(paramFloat2);
    double d1 = paramFloat2;
    double d2 = this.OooO0o0;
    boolean bool1 = d1 < d2;
    if (bool1)
    {
      paramFloat2 = getFinalPosition();
      paramFloat1 = Math.abs(paramFloat1 - paramFloat2);
      double d3 = paramFloat1;
      d1 = this.OooO0Oo;
      boolean bool2 = d3 < d1;
      if (bool2) {
        return true;
      }
    }
    return false;
  }
  
  public SpringForce OooO0OO(float paramFloat)
  {
    boolean bool = paramFloat < 0.0F;
    if (!bool)
    {
      double d = paramFloat;
      this.OooO0O0 = d;
      this.OooO0OO = false;
      return this;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("Damping ratio must be non-negative");
    throw localIllegalArgumentException;
  }
  
  public SpringForce OooO0Oo(float paramFloat)
  {
    double d = paramFloat;
    this.OooO = d;
    return this;
  }
  
  public DynamicAnimation.MassState OooO0o(double paramDouble1, double paramDouble2, long paramLong)
  {
    SpringForce localSpringForce = this;
    OooO00o();
    double d1 = paramLong / 1000.0D;
    double d2 = this.OooO;
    d2 = paramDouble1 - d2;
    double d3 = this.OooO0O0;
    double d4 = 1.0D;
    boolean bool = d3 < d4;
    double d5 = 2.718281828459045D;
    double d6;
    double d7;
    if (bool)
    {
      d3 = this.OooO0oO;
      d4 = d3 * d2 - paramDouble2;
      d6 = this.OooO0o;
      d7 = d3 - d6;
      d4 /= d7;
      d4 = d2 - d4;
      d2 = d2 * d3 - paramDouble2;
      d6 = d3 - d6;
      d2 /= d6;
      d3 *= d1;
      d3 = Math.pow(d5, d3) * d4;
      d6 = this.OooO0o * d1;
      d6 = Math.pow(d5, d6) * d2;
      d3 += d6;
      d6 = this.OooO0oO;
      d4 *= d6;
      d6 *= d1;
      d6 = Math.pow(d5, d6);
      d4 *= d6;
      d6 = this.OooO0o;
      d2 *= d6;
      d6 *= d1;
      d1 = Math.pow(d5, d6);
      d2 *= d1;
      d4 += d2;
    }
    else
    {
      bool = d3 < d4;
      if (!bool)
      {
        d3 = this.OooO00o;
        d4 = d3 * d2;
        d4 = paramDouble2 + d4;
        d6 = d4 * d1;
        d2 += d6;
        d3 = -d3 * d1;
        d3 = Math.pow(d5, d3) * d2;
        d6 = -this.OooO00o * d1;
        d6 = Math.pow(d5, d6);
        d2 *= d6;
        d6 = this.OooO00o;
        d7 = -d6;
        d2 *= d7;
        d6 = -d6 * d1;
        d1 = Math.pow(d5, d6);
        d4 = d4 * d1 + d2;
      }
      else
      {
        d6 = this.OooO0oo;
        d4 /= d6;
        d6 = this.OooO00o;
        d7 = d3 * d6 * d2 + paramDouble2;
        d4 *= d7;
        d3 = -d3 * d6 * d1;
        d3 = Math.pow(d5, d3);
        d6 = Math.cos(this.OooO0oo * d1) * d2;
        d7 = Math.sin(this.OooO0oo * d1) * d4;
        d6 += d7;
        d3 *= d6;
        d6 = this.OooO00o;
        d7 = -d6 * d3;
        d5 = this.OooO0O0;
        d7 *= d5;
        double d8 = -d5 * d6 * d1;
        d8 = Math.pow(2.718281828459045D, d8);
        double d9 = this.OooO0oo;
        paramDouble1 = d3;
        d3 = -d9 * d2;
        d9 *= d1;
        d2 = Math.sin(d9);
        d3 *= d2;
        d2 = this.OooO0oo;
        d4 *= d2;
        d2 *= d1;
        d1 = Math.cos(d2);
        d4 *= d1;
        d3 += d4;
        d8 *= d3;
        d4 = d7 + d8;
        d3 = paramDouble1;
      }
    }
    DynamicAnimation.MassState localMassState = localSpringForce.OooOO0;
    double d10 = localSpringForce.OooO;
    float f = (float)(d3 + d10);
    localMassState.OooO00o = f;
    f = (float)d4;
    localMassState.OooO0O0 = f;
    return localMassState;
  }
  
  public SpringForce OooO0o0(float paramFloat)
  {
    boolean bool = paramFloat < 0.0F;
    if (bool)
    {
      double d = Math.sqrt(paramFloat);
      this.OooO00o = d;
      this.OooO0OO = false;
      return this;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("Spring stiffness constant must be positive.");
    throw localIllegalArgumentException;
  }
  
  public float getDampingRatio()
  {
    return (float)this.OooO0O0;
  }
  
  public float getFinalPosition()
  {
    return (float)this.OooO;
  }
  
  public float getStiffness()
  {
    double d = this.OooO00o;
    return (float)(d * d);
  }
  
  public void setValueThreshold(double paramDouble)
  {
    paramDouble = Math.abs(paramDouble);
    this.OooO0Oo = paramDouble;
    paramDouble *= 62.5D;
    this.OooO0o0 = paramDouble;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.dynamicanimation.animation.SpringForce
 * JD-Core Version:    0.7.0.1
 */