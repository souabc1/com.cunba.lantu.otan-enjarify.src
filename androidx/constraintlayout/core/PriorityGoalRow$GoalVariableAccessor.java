package androidx.constraintlayout.core;

import java.util.Arrays;

class PriorityGoalRow$GoalVariableAccessor
{
  public SolverVariable OooO00o;
  public PriorityGoalRow OooO0O0;
  
  public PriorityGoalRow$GoalVariableAccessor(PriorityGoalRow paramPriorityGoalRow1, PriorityGoalRow paramPriorityGoalRow2)
  {
    this.OooO0O0 = paramPriorityGoalRow2;
  }
  
  public boolean OooO00o(SolverVariable paramSolverVariable, float paramFloat)
  {
    Object localObject = this.OooO00o;
    int i = ((SolverVariable)localObject).o00OoOoo;
    float f1 = 1.0E-004F;
    int k = 9;
    boolean bool1 = true;
    int m = 0;
    float f2;
    float[] arrayOfFloat1;
    float f5;
    boolean bool2;
    int j;
    if (i != 0)
    {
      i = 0;
      localObject = null;
      f2 = 0.0F;
      while (i < k)
      {
        arrayOfFloat1 = this.OooO00o.o00OooOo;
        float f3 = arrayOfFloat1[i];
        float[] arrayOfFloat2 = paramSolverVariable.o00OooOo;
        float f4 = arrayOfFloat2[i] * paramFloat;
        f3 += f4;
        arrayOfFloat1[i] = f3;
        f5 = Math.abs(f3);
        bool2 = f5 < f1;
        if (bool2)
        {
          arrayOfFloat1 = this.OooO00o.o00OooOo;
          arrayOfFloat1[i] = 0.0F;
        }
        else
        {
          bool1 = false;
        }
        i += 1;
      }
      if (bool1)
      {
        paramSolverVariable = this.OooO0OO;
        SolverVariable localSolverVariable = this.OooO00o;
        PriorityGoalRow.Oooo000(paramSolverVariable, localSolverVariable);
      }
      return false;
    }
    while (m < k)
    {
      localObject = paramSolverVariable.o00OooOo;
      f2 = localObject[m];
      bool2 = f2 < 0.0F;
      if (bool2)
      {
        f2 *= paramFloat;
        f5 = Math.abs(f2);
        bool2 = f5 < f1;
        if (bool2)
        {
          j = 0;
          localObject = null;
          f2 = 0.0F;
        }
        arrayOfFloat1 = this.OooO00o.o00OooOo;
        arrayOfFloat1[m] = f2;
      }
      else
      {
        localObject = this.OooO00o.o00OooOo;
        localObject[m] = 0.0F;
      }
      int n;
      m += 1;
    }
    return bool1;
  }
  
  public void OooO0O0(SolverVariable paramSolverVariable)
  {
    this.OooO00o = paramSolverVariable;
  }
  
  public final boolean OooO0OO(SolverVariable paramSolverVariable)
  {
    int i = 8;
    while (i >= 0)
    {
      float[] arrayOfFloat1 = paramSolverVariable.o00OooOo;
      float f1 = arrayOfFloat1[i];
      float[] arrayOfFloat2 = this.OooO00o.o00OooOo;
      float f2 = arrayOfFloat2[i];
      boolean bool1 = f2 < f1;
      if (!bool1)
      {
        i += -1;
      }
      else
      {
        boolean bool2 = f2 < f1;
        if (bool2) {
          return true;
        }
      }
    }
    return false;
  }
  
  public void OooO0Oo()
  {
    Arrays.fill(this.OooO00o.o00OooOo, 0.0F);
  }
  
  public final boolean isNegative()
  {
    int i = 8;
    for (;;)
    {
      boolean bool1 = false;
      if (i < 0) {
        break;
      }
      float[] arrayOfFloat = this.OooO00o.o00OooOo;
      float f = arrayOfFloat[i];
      boolean bool2 = f < 0.0F;
      if (bool2) {
        return false;
      }
      bool1 = f < 0.0F;
      if (bool1) {
        return true;
      }
      i += -1;
    }
    return false;
  }
  
  public final boolean isNull()
  {
    int i = 0;
    for (;;)
    {
      int j = 9;
      float f = 1.261169E-044F;
      if (i >= j) {
        break;
      }
      float[] arrayOfFloat = this.OooO00o.o00OooOo;
      f = arrayOfFloat[i];
      boolean bool = f < 0.0F;
      if (bool) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  public String toString()
  {
    Object localObject1 = this.OooO00o;
    Object localObject2 = "[ ";
    if (localObject1 != null)
    {
      int i = 0;
      localObject1 = null;
      for (;;)
      {
        int j = 9;
        if (i >= j) {
          break;
        }
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append((String)localObject2);
        float f = this.OooO00o.o00OooOo[i];
        localStringBuilder.append(f);
        localStringBuilder.append(" ");
        localObject2 = localStringBuilder.toString();
        i += 1;
      }
    }
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append("] ");
    localObject2 = this.OooO00o;
    ((StringBuilder)localObject1).append(localObject2);
    return ((StringBuilder)localObject1).toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.PriorityGoalRow.GoalVariableAccessor
 * JD-Core Version:    0.7.0.1
 */