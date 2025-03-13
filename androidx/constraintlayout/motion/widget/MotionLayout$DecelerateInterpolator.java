package androidx.constraintlayout.motion.widget;

class MotionLayout$DecelerateInterpolator
  extends MotionInterpolator
{
  public float OooO00o;
  public float OooO0O0;
  public float OooO0OO;
  
  public void OooO00o(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.OooO00o = paramFloat1;
    this.OooO0O0 = paramFloat2;
    this.OooO0OO = paramFloat3;
  }
  
  public float getInterpolation(float paramFloat)
  {
    float f1 = this.OooO00o;
    float f2 = 0.0F;
    MotionLayout localMotionLayout1 = null;
    boolean bool1 = f1 < 0.0F;
    float f3 = 2.0F;
    float f4;
    float f5;
    if (bool1)
    {
      f2 = this.OooO0OO;
      f4 = f1 / f2;
      boolean bool2 = f4 < paramFloat;
      if (bool2) {
        paramFloat = f1 / f2;
      }
      MotionLayout localMotionLayout2 = this.OooO0Oo;
      f5 = f2 * paramFloat;
      f5 = f1 - f5;
      localMotionLayout2.o00Ooo0O = f5;
      f1 *= paramFloat;
      f2 = f2 * paramFloat * paramFloat / f3;
    }
    for (f1 -= f2;; f1 += f4)
    {
      paramFloat = this.OooO0O0;
      return f1 + paramFloat;
      f2 = -f1;
      f4 = this.OooO0OO;
      f2 /= f4;
      bool1 = f2 < paramFloat;
      if (bool1) {
        paramFloat = -f1 / f4;
      }
      localMotionLayout1 = this.OooO0Oo;
      f5 = f4 * paramFloat + f1;
      localMotionLayout1.o00Ooo0O = f5;
      f1 *= paramFloat;
      f4 = f4 * paramFloat * paramFloat / f3;
    }
  }
  
  public float getVelocity()
  {
    return this.OooO0Oo.o00Ooo0O;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionLayout.DecelerateInterpolator
 * JD-Core Version:    0.7.0.1
 */