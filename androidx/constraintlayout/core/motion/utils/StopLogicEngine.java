package androidx.constraintlayout.core.motion.utils;

public class StopLogicEngine
  implements StopEngine
{
  public float OooO;
  public float OooO00o;
  public float OooO0O0;
  public float OooO0OO;
  public float OooO0Oo;
  public float OooO0o;
  public float OooO0o0;
  public float OooO0oO;
  public float OooO0oo;
  public int OooOO0;
  public String OooOO0O;
  public boolean OooOO0o = false;
  public float OooOOO;
  public float OooOOO0;
  public boolean OooOOOO = false;
  
  public final float OooO00o(float paramFloat)
  {
    this.OooOOOO = false;
    float f1 = this.OooO0Oo;
    boolean bool1 = paramFloat < f1;
    float f2 = 2.0F;
    float f3;
    if (!bool1)
    {
      f3 = this.OooO00o;
      f4 = f3 * paramFloat;
      f5 = (this.OooO0O0 - f3) * paramFloat * paramFloat;
      f1 *= f2;
      f5 /= f1;
      return f4 + f5;
    }
    int i = this.OooOO0;
    int j = 1;
    float f4 = 1.4E-45F;
    if (i == j) {
      return this.OooO0oO;
    }
    paramFloat -= f1;
    f1 = this.OooO0o0;
    boolean bool3 = paramFloat < f1;
    if (bool3)
    {
      f3 = this.OooO0oO;
      f4 = this.OooO0O0;
      f5 = f4 * paramFloat;
      f3 += f5;
      f5 = (this.OooO0OO - f4) * paramFloat * paramFloat;
      f1 *= f2;
      f5 /= f1;
      return f3 + f5;
    }
    int k = 2;
    float f5 = 2.802597E-045F;
    if (i == k) {
      return this.OooO0oo;
    }
    paramFloat -= f1;
    f1 = this.OooO0o;
    boolean bool2 = paramFloat < f1;
    if (!bool2)
    {
      f3 = this.OooO0oo;
      f4 = this.OooO0OO;
      f5 = f4 * paramFloat;
      f3 += f5;
      f4 = f4 * paramFloat * paramFloat;
      f1 *= f2;
      f4 /= f1;
      return f3 - f4;
    }
    this.OooOOOO = j;
    return this.OooO;
  }
  
  public void OooO0O0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    this.OooOOOO = false;
    this.OooOOO0 = paramFloat1;
    boolean bool2 = paramFloat1 < paramFloat2;
    if (bool2)
    {
      bool1 = true;
      f1 = 1.4E-45F;
    }
    this.OooOO0o = bool1;
    float f2;
    StopLogicEngine localStopLogicEngine;
    if (bool1)
    {
      f1 = -paramFloat3;
      f2 = paramFloat1 - paramFloat2;
      localStopLogicEngine = this;
    }
    else
    {
      f2 = paramFloat2 - paramFloat1;
      localStopLogicEngine = this;
      f1 = paramFloat3;
    }
    localStopLogicEngine.OooO0Oo(f1, f2, paramFloat5, paramFloat6, paramFloat4);
  }
  
  public float OooO0OO(float paramFloat)
  {
    float f1 = this.OooO0Oo;
    boolean bool1 = paramFloat < f1;
    float f2;
    if (!bool1)
    {
      f2 = this.OooO00o;
      f3 = (this.OooO0O0 - f2) * paramFloat / f1;
      return f2 + f3;
    }
    int i = this.OooOO0;
    int j = 1;
    float f3 = 1.4E-45F;
    if (i == j) {
      return 0.0F;
    }
    paramFloat -= f1;
    f1 = this.OooO0o0;
    boolean bool3 = paramFloat < f1;
    if (bool3)
    {
      f2 = this.OooO0O0;
      f3 = (this.OooO0OO - f2) * paramFloat / f1;
      return f2 + f3;
    }
    int k = 2;
    f3 = 2.802597E-045F;
    if (i == k) {
      return this.OooO0oo;
    }
    paramFloat -= f1;
    f1 = this.OooO0o;
    boolean bool2 = paramFloat < f1;
    if (bool2)
    {
      f2 = this.OooO0OO;
      paramFloat = paramFloat * f2 / f1;
      return f2 - paramFloat;
    }
    return this.OooO;
  }
  
  public final void OooO0Oo(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    this.OooOOOO = false;
    boolean bool1 = paramFloat1 < 0.0F;
    if (!bool1) {
      paramFloat1 = 1.0E-004F;
    }
    this.OooO00o = paramFloat1;
    float f1 = paramFloat1 / paramFloat3;
    float f2 = f1 * paramFloat1;
    float f3 = 2.0F;
    f2 /= f3;
    boolean bool2 = paramFloat1 < 0.0F;
    int i = 3;
    int j = 2;
    if (bool2)
    {
      paramFloat5 = -paramFloat1 / paramFloat3 * paramFloat1 / f3;
      d = Math.sqrt((paramFloat2 - paramFloat5) * paramFloat3);
      paramFloat5 = (float)d;
      bool1 = paramFloat5 < paramFloat4;
      if (bool1)
      {
        this.OooOO0O = "backward accelerate, decelerate";
        this.OooOO0 = j;
        this.OooO00o = paramFloat1;
        this.OooO0O0 = paramFloat5;
        this.OooO0OO = 0.0F;
        paramFloat4 = (paramFloat5 - paramFloat1) / paramFloat3;
        this.OooO0Oo = paramFloat4;
        paramFloat3 = paramFloat5 / paramFloat3;
        this.OooO0o0 = paramFloat3;
        paramFloat1 = (paramFloat1 + paramFloat5) * paramFloat4 / f3;
        this.OooO0oO = paramFloat1;
        this.OooO0oo = paramFloat2;
        this.OooO = paramFloat2;
        return;
      }
      this.OooOO0O = "backward accelerate cruse decelerate";
      this.OooOO0 = i;
      this.OooO00o = paramFloat1;
      this.OooO0O0 = paramFloat4;
      this.OooO0OO = paramFloat4;
      paramFloat5 = (paramFloat4 - paramFloat1) / paramFloat3;
      this.OooO0Oo = paramFloat5;
      paramFloat3 = paramFloat4 / paramFloat3;
      this.OooO0o = paramFloat3;
      paramFloat1 = (paramFloat1 + paramFloat4) * paramFloat5 / f3;
      paramFloat3 = paramFloat3 * paramFloat4 / f3;
      paramFloat5 = (paramFloat2 - paramFloat1 - paramFloat3) / paramFloat4;
      this.OooO0o0 = paramFloat5;
      this.OooO0oO = paramFloat1;
      paramFloat1 = paramFloat2 - paramFloat3;
      this.OooO0oo = paramFloat1;
      this.OooO = paramFloat2;
      return;
    }
    bool2 = f2 < paramFloat2;
    if (!bool2)
    {
      this.OooOO0O = "hard stop";
      f3 = f3 * paramFloat2 / paramFloat1;
      this.OooOO0 = 1;
      this.OooO00o = paramFloat1;
      this.OooO0O0 = 0.0F;
      this.OooO0oO = paramFloat2;
      this.OooO0Oo = f3;
      return;
    }
    f2 = paramFloat2 - f2;
    float f4 = f2 / paramFloat1;
    float f5 = f4 + f1;
    boolean bool3 = f5 < paramFloat5;
    if (bool3)
    {
      this.OooOO0O = "cruse decelerate";
      this.OooOO0 = j;
      this.OooO00o = paramFloat1;
      this.OooO0O0 = paramFloat1;
      this.OooO0OO = 0.0F;
      this.OooO0oO = f2;
      this.OooO0oo = paramFloat2;
      this.OooO0Oo = f4;
      this.OooO0o0 = f1;
      return;
    }
    paramFloat5 = paramFloat3 * paramFloat2;
    f1 = paramFloat1 * paramFloat1 / f3;
    double d = Math.sqrt(paramFloat5 + f1);
    paramFloat5 = (float)d;
    f1 = (paramFloat5 - paramFloat1) / paramFloat3;
    this.OooO0Oo = f1;
    f2 = paramFloat5 / paramFloat3;
    this.OooO0o0 = f2;
    bool2 = paramFloat5 < paramFloat4;
    if (bool2)
    {
      this.OooOO0O = "accelerate decelerate";
      this.OooOO0 = j;
      this.OooO00o = paramFloat1;
      this.OooO0O0 = paramFloat5;
      this.OooO0OO = 0.0F;
      this.OooO0Oo = f1;
      this.OooO0o0 = f2;
      paramFloat1 = (paramFloat1 + paramFloat5) * f1 / f3;
      this.OooO0oO = paramFloat1;
      this.OooO0oo = paramFloat2;
      return;
    }
    this.OooOO0O = "accelerate cruse decelerate";
    this.OooOO0 = i;
    this.OooO00o = paramFloat1;
    this.OooO0O0 = paramFloat4;
    this.OooO0OO = paramFloat4;
    paramFloat5 = (paramFloat4 - paramFloat1) / paramFloat3;
    this.OooO0Oo = paramFloat5;
    paramFloat3 = paramFloat4 / paramFloat3;
    this.OooO0o = paramFloat3;
    paramFloat1 = (paramFloat1 + paramFloat4) * paramFloat5 / f3;
    paramFloat3 = paramFloat3 * paramFloat4 / f3;
    paramFloat5 = (paramFloat2 - paramFloat1 - paramFloat3) / paramFloat4;
    this.OooO0o0 = paramFloat5;
    this.OooO0oO = paramFloat1;
    paramFloat1 = paramFloat2 - paramFloat3;
    this.OooO0oo = paramFloat1;
    this.OooO = paramFloat2;
  }
  
  public float getInterpolation(float paramFloat)
  {
    float f = OooO00o(paramFloat);
    this.OooOOO = paramFloat;
    boolean bool = this.OooOO0o;
    if (bool) {
      paramFloat = this.OooOOO0 - f;
    } else {
      paramFloat = this.OooOOO0 + f;
    }
    return paramFloat;
  }
  
  public float getVelocity()
  {
    boolean bool = this.OooOO0o;
    float f;
    if (bool)
    {
      f = this.OooOOO;
      f = -OooO0OO(f);
    }
    else
    {
      f = this.OooOOO;
      f = OooO0OO(f);
    }
    return f;
  }
  
  public boolean isStopped()
  {
    float f1 = getVelocity();
    float f2 = 1.0E-005F;
    boolean bool = f1 < f2;
    if (bool)
    {
      f1 = this.OooO;
      float f3 = this.OooOOO;
      f1 = Math.abs(f1 - f3);
      bool = f1 < f2;
      if (bool)
      {
        bool = true;
        f1 = 1.4E-45F;
        return bool;
      }
    }
    bool = false;
    f1 = 0.0F;
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.StopLogicEngine
 * JD-Core Version:    0.7.0.1
 */