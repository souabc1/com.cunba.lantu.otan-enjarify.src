package androidx.constraintlayout.core.motion.utils;

public class ArcCurveFit
  extends CurveFit
{
  public final double[] OooO00o;
  public ArcCurveFit.Arc[] OooO0O0;
  public boolean OooO0OO;
  
  public ArcCurveFit(int[] paramArrayOfInt, double[] paramArrayOfDouble, double[][] paramArrayOfDouble1)
  {
    int i = 1;
    float f1 = 1.4E-45F;
    this.OooO0OO = i;
    this.OooO00o = paramArrayOfDouble;
    ArcCurveFit.Arc[] arrayOfArc1 = new ArcCurveFit.Arc[paramArrayOfDouble.length - i];
    this.OooO0O0 = arrayOfArc1;
    arrayOfArc1 = null;
    int j = i;
    float f2 = f1;
    int k = i;
    float f3 = f1;
    label160:
    label179:
    int i3;
    for (int m = 0;; m = i3)
    {
      ArcCurveFit.Arc[] arrayOfArc2 = localArcCurveFit.OooO0O0;
      int n = arrayOfArc2.length;
      if (m >= n) {
        break;
      }
      n = paramArrayOfInt[m];
      int i1 = 3;
      float f4 = 4.203895E-045F;
      if (n != 0)
      {
        if (n != i)
        {
          int i2 = 2;
          float f5 = 2.802597E-045F;
          if (n != i2)
          {
            if (n != i1) {
              break label179;
            }
            if (j != i) {}
          }
          else
          {
            j = i2;
            f2 = f5;
            break label160;
          }
        }
        j = i;
        f2 = f1;
        k = j;
        f3 = f2;
      }
      else
      {
        k = i1;
        f3 = f4;
      }
      ArcCurveFit.Arc localArc = new androidx/constraintlayout/core/motion/utils/ArcCurveFit$Arc;
      double d1 = arrayOfDouble[m];
      i3 = m + 1;
      double d2 = arrayOfDouble[i3];
      Object localObject = paramArrayOfDouble1[m];
      double d3 = localObject[0];
      double d4 = localObject[i];
      localObject = paramArrayOfDouble1[i3];
      double d5 = localObject[0];
      double d6 = localObject[i];
      localObject = localArc;
      i1 = k;
      f4 = f3;
      localArc.<init>(k, d1, d2, d3, d4, d5, d6);
      arrayOfArc2[m] = localArc;
    }
  }
  
  public double OooO0OO(double paramDouble, int paramInt)
  {
    boolean bool1 = this.OooO0OO;
    int i = 0;
    Object localObject1 = null;
    Object localObject2;
    Object localObject3;
    double d4;
    ArcCurveFit.Arc[] arrayOfArc;
    if (bool1)
    {
      localObject2 = this.OooO0O0;
      localObject3 = localObject2[0];
      double d1 = localObject3.OooO0OO;
      boolean bool2 = paramDouble < d1;
      ArcCurveFit.Arc localArc;
      double d3;
      if (bool2)
      {
        paramDouble -= d1;
        bool1 = localObject3.OooOOo;
        if (bool1)
        {
          double d2;
          if (paramInt == 0)
          {
            d2 = localObject3.OooO0Oo(d1);
            localArc = this.OooO0O0[0];
          }
          for (d3 = localArc.OooO0O0(d1);; d3 = localArc.OooO0OO(d1))
          {
            paramDouble *= d3;
            return d2 + paramDouble;
            d2 = localObject3.OooO0o0(d1);
            localArc = this.OooO0O0[0];
          }
        }
        localObject3.setPoint(d1);
        if (paramInt == 0)
        {
          d4 = this.OooO0O0[0].getX();
          localArc = this.OooO0O0[0];
        }
        for (d3 = localArc.getDX();; d3 = localArc.getDY())
        {
          paramDouble *= d3;
          return d4 + paramDouble;
          d4 = this.OooO0O0[0].getY();
          localArc = this.OooO0O0[0];
        }
      }
      int j = localObject2.length + -1;
      localObject3 = localObject2[j];
      d4 = localObject3.OooO0Oo;
      boolean bool3 = paramDouble < d4;
      if (bool3)
      {
        i = localObject2.length + -1;
        localObject1 = localObject2[i];
        double d5 = localObject1.OooO0Oo;
        paramDouble -= d5;
        int n = localObject2.length + -1;
        double d6;
        if (paramInt == 0)
        {
          d6 = localObject2[n].OooO0Oo(d5);
          localArc = this.OooO0O0[n];
        }
        for (d3 = localArc.OooO0O0(d5);; d3 = localArc.OooO0OO(d5))
        {
          paramDouble *= d3;
          return d6 + paramDouble;
          d6 = localObject2[n].OooO0o0(d5);
          localArc = this.OooO0O0[n];
        }
      }
    }
    else
    {
      localObject2 = this.OooO0O0;
      localObject3 = localObject2[0];
      d4 = localObject3.OooO0OO;
      boolean bool6 = paramDouble < d4;
      if (bool6)
      {
        paramDouble = d4;
      }
      else
      {
        int k = localObject2.length + -1;
        localObject3 = localObject2[k];
        d4 = localObject3.OooO0Oo;
        boolean bool4 = paramDouble < d4;
        if (bool4)
        {
          int i1 = localObject2.length + -1;
          arrayOfArc = localObject2[i1];
          paramDouble = arrayOfArc.OooO0Oo;
        }
      }
    }
    for (;;)
    {
      localObject2 = this.OooO0O0;
      int m = localObject2.length;
      if (i >= m) {
        break;
      }
      localObject2 = localObject2[i];
      d4 = ((ArcCurveFit.Arc)localObject2).OooO0Oo;
      boolean bool5 = paramDouble < d4;
      if (!bool5)
      {
        bool5 = ((ArcCurveFit.Arc)localObject2).OooOOo;
        if (bool5)
        {
          if (paramInt == 0) {
            return ((ArcCurveFit.Arc)localObject2).OooO0Oo(paramDouble);
          }
          return ((ArcCurveFit.Arc)localObject2).OooO0o0(paramDouble);
        }
        ((ArcCurveFit.Arc)localObject2).setPoint(paramDouble);
        arrayOfArc = this.OooO0O0;
        if (paramInt == 0) {
          return arrayOfArc[i].getX();
        }
        return arrayOfArc[i].getY();
      }
      i += 1;
    }
    return 0.0D / 0.0D;
  }
  
  public void OooO0Oo(double paramDouble, double[] paramArrayOfDouble)
  {
    int i = this.OooO0OO;
    int k = 1;
    Object localObject2;
    double d1;
    double d5;
    int n;
    ArcCurveFit.Arc localArc;
    if (i != 0)
    {
      localObject1 = this.OooO0O0;
      localObject2 = localObject1[0];
      d1 = ((ArcCurveFit.Arc)localObject2).OooO0OO;
      boolean bool1 = paramDouble < d1;
      double d3;
      double d4;
      double d6;
      if (bool1)
      {
        paramDouble -= d1;
        i = ((ArcCurveFit.Arc)localObject2).OooOOo;
        if (i != 0)
        {
          double d2 = ((ArcCurveFit.Arc)localObject2).OooO0Oo(d1);
          d3 = this.OooO0O0[0].OooO0O0(d1) * paramDouble;
          d2 += d3;
          paramArrayOfDouble[0] = d2;
          d2 = this.OooO0O0[0].OooO0o0(d1);
          localObject1 = this.OooO0O0[0];
          d4 = ((ArcCurveFit.Arc)localObject1).OooO0OO(d1);
          paramDouble *= d4;
          d2 += paramDouble;
          paramArrayOfDouble[k] = d2;
        }
        else
        {
          ((ArcCurveFit.Arc)localObject2).setPoint(d1);
          d5 = this.OooO0O0[0].getX();
          d6 = this.OooO0O0[0].getDX() * paramDouble;
          d5 += d6;
          paramArrayOfDouble[0] = d5;
          d5 = this.OooO0O0[0].getY();
          localObject1 = this.OooO0O0[0];
          d4 = ((ArcCurveFit.Arc)localObject1).getDY();
          paramDouble *= d4;
          d5 += paramDouble;
          paramArrayOfDouble[k] = d5;
        }
        return;
      }
      int m = localObject1.length - k;
      localObject2 = localObject1[m];
      d5 = ((ArcCurveFit.Arc)localObject2).OooO0Oo;
      boolean bool2 = paramDouble < d5;
      if (bool2)
      {
        n = localObject1.length - k;
        localObject2 = localObject1[n];
        d5 = ((ArcCurveFit.Arc)localObject2).OooO0Oo;
        d6 = paramDouble - d5;
        int i1 = localObject1.length - k;
        localObject1 = localObject1[i1];
        boolean bool4 = ((ArcCurveFit.Arc)localObject1).OooOOo;
        if (bool4)
        {
          paramDouble = ((ArcCurveFit.Arc)localObject1).OooO0Oo(d5);
          d3 = this.OooO0O0[i1].OooO0O0(d5) * d6;
          paramDouble += d3;
          paramArrayOfDouble[0] = paramDouble;
          localArc = this.OooO0O0[i1];
          paramDouble = localArc.OooO0o0(d5);
          localObject1 = this.OooO0O0[i1];
          d4 = ((ArcCurveFit.Arc)localObject1).OooO0OO(d5);
          d6 *= d4;
          paramDouble += d6;
          paramArrayOfDouble[k] = paramDouble;
        }
        else
        {
          ((ArcCurveFit.Arc)localObject1).setPoint(paramDouble);
          paramDouble = this.OooO0O0[i1].getX();
          d5 = this.OooO0O0[i1].getDX() * d6;
          paramDouble += d5;
          paramArrayOfDouble[0] = paramDouble;
          localArc = this.OooO0O0[i1];
          paramDouble = localArc.getY();
          localObject1 = this.OooO0O0[i1];
          d4 = ((ArcCurveFit.Arc)localObject1).getDY();
          d6 *= d4;
          paramDouble += d6;
          paramArrayOfDouble[k] = paramDouble;
        }
      }
    }
    else
    {
      localObject1 = this.OooO0O0;
      localObject2 = localObject1[0];
      d5 = ((ArcCurveFit.Arc)localObject2).OooO0OO;
      boolean bool5 = paramDouble < d5;
      if (bool5) {
        paramDouble = d5;
      }
      n = localObject1.length - k;
      localObject2 = localObject1[n];
      d5 = ((ArcCurveFit.Arc)localObject2).OooO0Oo;
      boolean bool3 = paramDouble < d5;
      if (bool3)
      {
        int i2 = localObject1.length - k;
        localArc = localObject1[i2];
        paramDouble = localArc.OooO0Oo;
      }
    }
    i = 0;
    Object localObject1 = null;
    for (;;)
    {
      localObject2 = this.OooO0O0;
      int i3 = localObject2.length;
      if (i >= i3) {
        break;
      }
      localObject2 = localObject2[i];
      d1 = ((ArcCurveFit.Arc)localObject2).OooO0Oo;
      boolean bool6 = paramDouble < d1;
      if (!bool6)
      {
        bool6 = ((ArcCurveFit.Arc)localObject2).OooOOo;
        if (bool6)
        {
          d5 = ((ArcCurveFit.Arc)localObject2).OooO0Oo(paramDouble);
          paramArrayOfDouble[0] = d5;
          paramDouble = this.OooO0O0[i].OooO0o0(paramDouble);
          paramArrayOfDouble[k] = paramDouble;
          return;
        }
        ((ArcCurveFit.Arc)localObject2).setPoint(paramDouble);
        paramDouble = this.OooO0O0[i].getX();
        paramArrayOfDouble[0] = paramDouble;
        paramDouble = this.OooO0O0[i].getY();
        paramArrayOfDouble[k] = paramDouble;
        return;
      }
      int j;
      i += 1;
    }
  }
  
  public double OooO0o(double paramDouble, int paramInt)
  {
    Object localObject1 = this.OooO0O0;
    int i = 0;
    Object localObject2 = localObject1[0];
    double d = localObject2.OooO0OO;
    boolean bool1 = paramDouble < d;
    if (bool1) {
      paramDouble = d;
    }
    int j = localObject1.length + -1;
    localObject2 = localObject1[j];
    d = localObject2.OooO0Oo;
    boolean bool2 = paramDouble < d;
    ArcCurveFit.Arc[] arrayOfArc;
    if (bool2)
    {
      int m = localObject1.length + -1;
      arrayOfArc = localObject1[m];
      paramDouble = arrayOfArc.OooO0Oo;
    }
    for (;;)
    {
      localObject1 = this.OooO0O0;
      int k = localObject1.length;
      if (i >= k) {
        break;
      }
      localObject1 = localObject1[i];
      d = ((ArcCurveFit.Arc)localObject1).OooO0Oo;
      boolean bool3 = paramDouble < d;
      if (!bool3)
      {
        bool3 = ((ArcCurveFit.Arc)localObject1).OooOOo;
        if (bool3)
        {
          if (paramInt == 0) {
            return ((ArcCurveFit.Arc)localObject1).OooO0O0(paramDouble);
          }
          return ((ArcCurveFit.Arc)localObject1).OooO0OO(paramDouble);
        }
        ((ArcCurveFit.Arc)localObject1).setPoint(paramDouble);
        arrayOfArc = this.OooO0O0;
        if (paramInt == 0) {
          return arrayOfArc[i].getDX();
        }
        return arrayOfArc[i].getDY();
      }
      i += 1;
    }
    return 0.0D / 0.0D;
  }
  
  public void OooO0o0(double paramDouble, float[] paramArrayOfFloat)
  {
    int i = this.OooO0OO;
    int k = 1;
    Object localObject2;
    double d1;
    float f2;
    double d5;
    int n;
    ArcCurveFit.Arc localArc;
    if (i != 0)
    {
      localObject1 = this.OooO0O0;
      localObject2 = localObject1[0];
      d1 = ((ArcCurveFit.Arc)localObject2).OooO0OO;
      boolean bool1 = paramDouble < d1;
      double d3;
      double d4;
      double d6;
      if (bool1)
      {
        paramDouble -= d1;
        i = ((ArcCurveFit.Arc)localObject2).OooOOo;
        if (i != 0)
        {
          double d2 = ((ArcCurveFit.Arc)localObject2).OooO0Oo(d1);
          d3 = this.OooO0O0[0].OooO0O0(d1) * paramDouble;
          f1 = (float)(d2 + d3);
          paramArrayOfFloat[0] = f1;
          d2 = this.OooO0O0[0].OooO0o0(d1);
          localObject1 = this.OooO0O0[0];
          d4 = ((ArcCurveFit.Arc)localObject1).OooO0OO(d1);
          paramDouble *= d4;
          d2 += paramDouble;
          f2 = (float)d2;
          paramArrayOfFloat[k] = f2;
        }
        else
        {
          ((ArcCurveFit.Arc)localObject2).setPoint(d1);
          d5 = this.OooO0O0[0].getX();
          d6 = this.OooO0O0[0].getDX() * paramDouble;
          f1 = (float)(d5 + d6);
          paramArrayOfFloat[0] = f1;
          d5 = this.OooO0O0[0].getY();
          localObject1 = this.OooO0O0[0];
          d4 = ((ArcCurveFit.Arc)localObject1).getDY();
          paramDouble *= d4;
          d5 += paramDouble;
          f2 = (float)d5;
          paramArrayOfFloat[k] = f2;
        }
        return;
      }
      int m = localObject1.length - k;
      localObject2 = localObject1[m];
      d5 = ((ArcCurveFit.Arc)localObject2).OooO0Oo;
      boolean bool2 = paramDouble < d5;
      if (bool2)
      {
        n = localObject1.length - k;
        localObject2 = localObject1[n];
        d5 = ((ArcCurveFit.Arc)localObject2).OooO0Oo;
        d6 = paramDouble - d5;
        int i1 = localObject1.length - k;
        localObject1 = localObject1[i1];
        boolean bool4 = ((ArcCurveFit.Arc)localObject1).OooOOo;
        if (bool4)
        {
          paramDouble = ((ArcCurveFit.Arc)localObject1).OooO0Oo(d5);
          d3 = this.OooO0O0[i1].OooO0O0(d5) * d6;
          f2 = (float)(paramDouble + d3);
          paramArrayOfFloat[0] = f2;
          localArc = this.OooO0O0[i1];
          paramDouble = localArc.OooO0o0(d5);
          localObject1 = this.OooO0O0[i1];
          d4 = ((ArcCurveFit.Arc)localObject1).OooO0OO(d5);
          d6 *= d4;
          paramDouble += d6;
          f2 = (float)paramDouble;
          paramArrayOfFloat[k] = f2;
        }
        else
        {
          ((ArcCurveFit.Arc)localObject1).setPoint(paramDouble);
          f2 = (float)this.OooO0O0[i1].getX();
          paramArrayOfFloat[0] = f2;
          localArc = this.OooO0O0[i1];
          paramDouble = localArc.getY();
          f2 = (float)paramDouble;
          paramArrayOfFloat[k] = f2;
        }
      }
    }
    else
    {
      localObject1 = this.OooO0O0;
      localObject2 = localObject1[0];
      d5 = ((ArcCurveFit.Arc)localObject2).OooO0OO;
      boolean bool5 = paramDouble < d5;
      if (bool5)
      {
        paramDouble = d5;
      }
      else
      {
        n = localObject1.length - k;
        localObject2 = localObject1[n];
        d5 = ((ArcCurveFit.Arc)localObject2).OooO0Oo;
        boolean bool3 = paramDouble < d5;
        if (bool3)
        {
          int i2 = localObject1.length - k;
          localArc = localObject1[i2];
          paramDouble = localArc.OooO0Oo;
        }
      }
    }
    i = 0;
    Object localObject1 = null;
    float f1 = 0.0F;
    for (;;)
    {
      localObject2 = this.OooO0O0;
      int i3 = localObject2.length;
      if (i >= i3) {
        break;
      }
      localObject2 = localObject2[i];
      d1 = ((ArcCurveFit.Arc)localObject2).OooO0Oo;
      boolean bool6 = paramDouble < d1;
      if (!bool6)
      {
        bool6 = ((ArcCurveFit.Arc)localObject2).OooOOo;
        if (bool6)
        {
          float f3 = (float)((ArcCurveFit.Arc)localObject2).OooO0Oo(paramDouble);
          paramArrayOfFloat[0] = f3;
          f2 = (float)this.OooO0O0[i].OooO0o0(paramDouble);
          paramArrayOfFloat[k] = f2;
          return;
        }
        ((ArcCurveFit.Arc)localObject2).setPoint(paramDouble);
        f2 = (float)this.OooO0O0[i].getX();
        paramArrayOfFloat[0] = f2;
        f2 = (float)this.OooO0O0[i].getY();
        paramArrayOfFloat[k] = f2;
        return;
      }
      int j;
      i += 1;
    }
  }
  
  public void OooO0oO(double paramDouble, double[] paramArrayOfDouble)
  {
    ArcCurveFit.Arc[] arrayOfArc = this.OooO0O0;
    Object localObject = arrayOfArc[0];
    double d1 = ((ArcCurveFit.Arc)localObject).OooO0OO;
    boolean bool1 = paramDouble < d1;
    int i = 1;
    if (bool1)
    {
      paramDouble = d1;
    }
    else
    {
      int j = arrayOfArc.length - i;
      localObject = arrayOfArc[j];
      d1 = ((ArcCurveFit.Arc)localObject).OooO0Oo;
      boolean bool2 = paramDouble < d1;
      if (bool2)
      {
        int k = arrayOfArc.length - i;
        ArcCurveFit.Arc localArc = arrayOfArc[k];
        paramDouble = localArc.OooO0Oo;
      }
    }
    int m = 0;
    arrayOfArc = null;
    for (;;)
    {
      localObject = this.OooO0O0;
      int n = localObject.length;
      if (m >= n) {
        break;
      }
      localObject = localObject[m];
      double d2 = ((ArcCurveFit.Arc)localObject).OooO0Oo;
      boolean bool3 = paramDouble < d2;
      if (!bool3)
      {
        bool3 = ((ArcCurveFit.Arc)localObject).OooOOo;
        if (bool3)
        {
          d1 = ((ArcCurveFit.Arc)localObject).OooO0O0(paramDouble);
          paramArrayOfDouble[0] = d1;
          paramDouble = this.OooO0O0[m].OooO0OO(paramDouble);
          paramArrayOfDouble[i] = paramDouble;
          return;
        }
        ((ArcCurveFit.Arc)localObject).setPoint(paramDouble);
        paramDouble = this.OooO0O0[m].getDX();
        paramArrayOfDouble[0] = paramDouble;
        paramDouble = this.OooO0O0[m].getDY();
        paramArrayOfDouble[i] = paramDouble;
        return;
      }
      m += 1;
    }
  }
  
  public double[] getTimePoints()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.ArcCurveFit
 * JD-Core Version:    0.7.0.1
 */