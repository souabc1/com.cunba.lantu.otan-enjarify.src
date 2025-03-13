package androidx.constraintlayout.core;

import java.util.ArrayList;

public class ArrayRow
  implements LinearSystem.Row
{
  public SolverVariable OooO00o = null;
  public float OooO0O0 = 0.0F;
  public boolean OooO0OO = false;
  public ArrayList OooO0Oo;
  public boolean OooO0o;
  public ArrayRow.ArrayRowVariables OooO0o0;
  
  public ArrayRow()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0Oo = localArrayList;
    this.OooO0o = false;
  }
  
  public ArrayRow(Cache paramCache)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0Oo = localArrayList;
    this.OooO0o = false;
    ArrayLinkedVariables localArrayLinkedVariables = new androidx/constraintlayout/core/ArrayLinkedVariables;
    localArrayLinkedVariables.<init>(this, paramCache);
    this.OooO0o0 = localArrayLinkedVariables;
  }
  
  public ArrayRow OooO(SolverVariable paramSolverVariable, int paramInt)
  {
    this.OooO00o = paramSolverVariable;
    float f = paramInt;
    paramSolverVariable.o00OooO0 = f;
    this.OooO0O0 = f;
    this.OooO0o = true;
    return this;
  }
  
  public void OooO00o(LinearSystem.Row paramRow)
  {
    int i = paramRow instanceof ArrayRow;
    if (i != 0)
    {
      paramRow = (ArrayRow)paramRow;
      this.OooO00o = null;
      this.OooO0o0.clear();
      i = 0;
      for (;;)
      {
        Object localObject = paramRow.OooO0o0;
        int k = ((ArrayRow.ArrayRowVariables)localObject).getCurrentSize();
        if (i >= k) {
          break;
        }
        localObject = paramRow.OooO0o0.getVariable(i);
        ArrayRow.ArrayRowVariables localArrayRowVariables1 = paramRow.OooO0o0;
        float f = localArrayRowVariables1.getVariableValue(i);
        ArrayRow.ArrayRowVariables localArrayRowVariables2 = this.OooO0o0;
        boolean bool = true;
        localArrayRowVariables2.OooO0Oo((SolverVariable)localObject, f, bool);
        int j;
        i += 1;
      }
    }
  }
  
  public SolverVariable OooO0O0(LinearSystem paramLinearSystem, boolean[] paramArrayOfBoolean)
  {
    return OooOo0o(paramArrayOfBoolean, null);
  }
  
  public void OooO0OO(SolverVariable paramSolverVariable)
  {
    int i = paramSolverVariable.o00Ooo0o;
    int j = 1;
    float f = 1.0F;
    if (i != j)
    {
      j = 2;
      if (i == j)
      {
        f = 1000.0F;
      }
      else
      {
        j = 3;
        if (i == j)
        {
          f = 1000000.0F;
        }
        else
        {
          j = 4;
          if (i == j)
          {
            f = 1.0E+009F;
          }
          else
          {
            j = 5;
            if (i == j) {
              f = 1.0E+012F;
            }
          }
        }
      }
    }
    this.OooO0o0.OooO0OO(paramSolverVariable, f);
  }
  
  public ArrayRow OooO0Oo(LinearSystem paramLinearSystem, int paramInt)
  {
    ArrayRow.ArrayRowVariables localArrayRowVariables = this.OooO0o0;
    SolverVariable localSolverVariable = paramLinearSystem.OooOOOO(paramInt, "ep");
    localArrayRowVariables.OooO0OO(localSolverVariable, 1.0F);
    localArrayRowVariables = this.OooO0o0;
    paramLinearSystem = paramLinearSystem.OooOOOO(paramInt, "em");
    localArrayRowVariables.OooO0OO(paramLinearSystem, -1.0F);
    return this;
  }
  
  public boolean OooO0o(LinearSystem paramLinearSystem)
  {
    paramLinearSystem = OooO0oO(paramLinearSystem);
    boolean bool1 = true;
    boolean bool2;
    if (paramLinearSystem == null)
    {
      bool2 = bool1;
    }
    else
    {
      OooOo(paramLinearSystem);
      bool2 = false;
      paramLinearSystem = null;
    }
    ArrayRow.ArrayRowVariables localArrayRowVariables = this.OooO0o0;
    int i = localArrayRowVariables.getCurrentSize();
    if (i == 0) {
      this.OooO0o = bool1;
    }
    return bool2;
  }
  
  public ArrayRow OooO0o0(SolverVariable paramSolverVariable, int paramInt)
  {
    ArrayRow.ArrayRowVariables localArrayRowVariables = this.OooO0o0;
    float f = paramInt;
    localArrayRowVariables.OooO0OO(paramSolverVariable, f);
    return this;
  }
  
  public SolverVariable OooO0oO(LinearSystem paramLinearSystem)
  {
    ArrayRow.ArrayRowVariables localArrayRowVariables1 = this.OooO0o0;
    int i = localArrayRowVariables1.getCurrentSize();
    boolean bool1 = false;
    Object localObject1 = null;
    float f1 = 0.0F;
    float f2 = 0.0F;
    int j = 0;
    int k = 0;
    int m = 0;
    boolean bool2 = false;
    Object localObject2 = null;
    while (j < i)
    {
      ArrayRow.ArrayRowVariables localArrayRowVariables2 = this.OooO0o0;
      float f3 = localArrayRowVariables2.getVariableValue(j);
      SolverVariable localSolverVariable = this.OooO0o0.getVariable(j);
      SolverVariable.Type localType1 = localSolverVariable.o0O00o0;
      SolverVariable.Type localType2 = SolverVariable.Type.o00OoOoo;
      int n = 1;
      boolean bool3;
      if (localType1 == localType2)
      {
        if (localObject1 == null) {}
        do
        {
          bool1 = OooOo0(localSolverVariable, paramLinearSystem);
          k = bool1;
          f1 = f3;
          localObject1 = localSolverVariable;
          break;
          bool3 = f1 < f3;
        } while (bool3);
        if (k == 0)
        {
          bool3 = OooOo0(localSolverVariable, paramLinearSystem);
          if (bool3)
          {
            f1 = f3;
            localObject1 = localSolverVariable;
            k = n;
          }
        }
      }
      else if (localObject1 == null)
      {
        bool3 = f3 < 0.0F;
        if (bool3)
        {
          if (localObject2 == null) {}
          do
          {
            bool2 = OooOo0(localSolverVariable, paramLinearSystem);
            m = bool2;
            f2 = f3;
            localObject2 = localSolverVariable;
            break;
            bool3 = f2 < f3;
          } while (bool3);
          if (m == 0)
          {
            bool3 = OooOo0(localSolverVariable, paramLinearSystem);
            if (bool3)
            {
              f2 = f3;
              localObject2 = localSolverVariable;
              m = n;
            }
          }
        }
      }
      j += 1;
    }
    if (localObject1 != null) {
      return localObject1;
    }
    return localObject2;
  }
  
  public ArrayRow OooO0oo(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, float paramFloat, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, int paramInt2)
  {
    float f1 = 1.0F;
    if (paramSolverVariable2 == paramSolverVariable3)
    {
      this.OooO0o0.OooO0OO(paramSolverVariable1, f1);
      this.OooO0o0.OooO0OO(paramSolverVariable4, f1);
      this.OooO0o0.OooO0OO(paramSolverVariable2, -2.0F);
      return this;
    }
    float f2 = 0.5F;
    boolean bool = paramFloat < f2;
    float f3 = -1.0F;
    ArrayRow.ArrayRowVariables localArrayRowVariables1;
    int i;
    ArrayRow.ArrayRowVariables localArrayRowVariables2;
    if (!bool)
    {
      localArrayRowVariables1 = this.OooO0o0;
      localArrayRowVariables1.OooO0OO(paramSolverVariable1, f1);
      this.OooO0o0.OooO0OO(paramSolverVariable2, f3);
      this.OooO0o0.OooO0OO(paramSolverVariable3, f3);
      paramSolverVariable1 = this.OooO0o0;
      paramSolverVariable1.OooO0OO(paramSolverVariable4, f1);
      if ((paramInt1 <= 0) && (paramInt2 <= 0)) {
        return this;
      }
      i = -paramInt1 + paramInt2;
      f4 = i;
    }
    else
    {
      f2 = 0.0F;
      localArrayRowVariables2 = null;
      bool = paramFloat < 0.0F;
      if (bool) {
        break label209;
      }
      localArrayRowVariables1 = this.OooO0o0;
      localArrayRowVariables1.OooO0OO(paramSolverVariable1, f3);
      paramSolverVariable1 = this.OooO0o0;
      paramSolverVariable1.OooO0OO(paramSolverVariable2, f1);
    }
    label209:
    float f7;
    for (float f4 = paramInt1;; f4 += f7)
    {
      this.OooO0O0 = f4;
      return this;
      bool = paramFloat < f1;
      if (!bool)
      {
        this.OooO0o0.OooO0OO(paramSolverVariable4, f3);
        paramSolverVariable1 = this.OooO0o0;
        paramSolverVariable1.OooO0OO(paramSolverVariable3, f1);
        i = -paramInt2;
        break;
      }
      localArrayRowVariables2 = this.OooO0o0;
      float f5 = f1 - paramFloat;
      float f6 = f5 * f1;
      localArrayRowVariables2.OooO0OO(paramSolverVariable1, f6);
      paramSolverVariable1 = this.OooO0o0;
      f2 = f5 * f3;
      paramSolverVariable1.OooO0OO(paramSolverVariable2, f2);
      paramSolverVariable1 = this.OooO0o0;
      f3 *= paramFloat;
      paramSolverVariable1.OooO0OO(paramSolverVariable3, f3);
      paramSolverVariable1 = this.OooO0o0;
      f1 *= paramFloat;
      paramSolverVariable1.OooO0OO(paramSolverVariable4, f1);
      if ((paramInt1 <= 0) && (paramInt2 <= 0)) {
        return this;
      }
      i = -paramInt1;
      f4 = i * f5;
      f7 = paramInt2 * paramFloat;
    }
    return this;
  }
  
  public ArrayRow OooOO0(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, float paramFloat)
  {
    this.OooO0o0.OooO0OO(paramSolverVariable1, -1.0F);
    this.OooO0o0.OooO0OO(paramSolverVariable2, paramFloat);
    return this;
  }
  
  public ArrayRow OooOO0O(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, float paramFloat)
  {
    this.OooO0o0.OooO0OO(paramSolverVariable1, -1.0F);
    this.OooO0o0.OooO0OO(paramSolverVariable2, 1.0F);
    this.OooO0o0.OooO0OO(paramSolverVariable3, paramFloat);
    paramSolverVariable1 = this.OooO0o0;
    float f = -paramFloat;
    paramSolverVariable1.OooO0OO(paramSolverVariable4, f);
    return this;
  }
  
  public ArrayRow OooOO0o(float paramFloat1, float paramFloat2, float paramFloat3, SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4)
  {
    boolean bool1 = false;
    this.OooO0O0 = 0.0F;
    boolean bool2 = paramFloat2 < 0.0F;
    float f1 = -1.0F;
    float f2 = 1.0F;
    if (bool2)
    {
      bool2 = paramFloat1 < paramFloat3;
      if (bool2)
      {
        bool2 = paramFloat1 < 0.0F;
        if (!bool2)
        {
          this.OooO0o0.OooO0OO(paramSolverVariable1, f2);
          localArrayRowVariables1 = this.OooO0o0;
          localArrayRowVariables1.OooO0OO(paramSolverVariable2, f1);
          return this;
        }
        bool1 = paramFloat3 < 0.0F;
        if (!bool1)
        {
          this.OooO0o0.OooO0OO(paramSolverVariable3, f2);
          localArrayRowVariables1 = this.OooO0o0;
          localArrayRowVariables1.OooO0OO(paramSolverVariable4, f1);
          return this;
        }
        paramFloat1 /= paramFloat2;
        paramFloat3 /= paramFloat2;
        paramFloat1 /= paramFloat3;
        this.OooO0o0.OooO0OO(paramSolverVariable1, f2);
        this.OooO0o0.OooO0OO(paramSolverVariable2, f1);
        this.OooO0o0.OooO0OO(paramSolverVariable4, paramFloat1);
        ArrayRow.ArrayRowVariables localArrayRowVariables2 = this.OooO0o0;
        paramFloat1 = -paramFloat1;
        localArrayRowVariables2.OooO0OO(paramSolverVariable3, paramFloat1);
        return this;
      }
    }
    this.OooO0o0.OooO0OO(paramSolverVariable1, f2);
    this.OooO0o0.OooO0OO(paramSolverVariable2, f1);
    this.OooO0o0.OooO0OO(paramSolverVariable4, f2);
    ArrayRow.ArrayRowVariables localArrayRowVariables1 = this.OooO0o0;
    localArrayRowVariables1.OooO0OO(paramSolverVariable3, f1);
    return this;
  }
  
  public ArrayRow OooOOO(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt)
  {
    int i = 0;
    ArrayRow.ArrayRowVariables localArrayRowVariables = null;
    if (paramInt != 0)
    {
      if (paramInt < 0)
      {
        paramInt *= -1;
        i = 1;
      }
      f1 = paramInt;
      this.OooO0O0 = f1;
    }
    paramInt = -1082130432;
    float f1 = -1.0F;
    float f2 = 1.0F;
    if (i == 0)
    {
      localArrayRowVariables = this.OooO0o0;
      localArrayRowVariables.OooO0OO(paramSolverVariable1, f1);
      paramSolverVariable1 = this.OooO0o0;
      paramSolverVariable1.OooO0OO(paramSolverVariable2, f2);
    }
    else
    {
      localArrayRowVariables = this.OooO0o0;
      localArrayRowVariables.OooO0OO(paramSolverVariable1, f2);
      paramSolverVariable1 = this.OooO0o0;
      paramSolverVariable1.OooO0OO(paramSolverVariable2, f1);
    }
    return this;
  }
  
  public ArrayRow OooOOO0(SolverVariable paramSolverVariable, int paramInt)
  {
    float f1;
    ArrayRow.ArrayRowVariables localArrayRowVariables;
    float f2;
    if (paramInt < 0)
    {
      paramInt *= -1;
      f1 = paramInt;
      this.OooO0O0 = f1;
      localArrayRowVariables = this.OooO0o0;
      f2 = 1.0F;
    }
    else
    {
      f1 = paramInt;
      this.OooO0O0 = f1;
      localArrayRowVariables = this.OooO0o0;
      f2 = -1.0F;
    }
    localArrayRowVariables.OooO0OO(paramSolverVariable, f2);
    return this;
  }
  
  public ArrayRow OooOOOO(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, int paramInt)
  {
    int i = 0;
    ArrayRow.ArrayRowVariables localArrayRowVariables = null;
    if (paramInt != 0)
    {
      if (paramInt < 0)
      {
        paramInt *= -1;
        i = 1;
      }
      f1 = paramInt;
      this.OooO0O0 = f1;
    }
    paramInt = -1082130432;
    float f1 = -1.0F;
    float f2 = 1.0F;
    if (i == 0)
    {
      localArrayRowVariables = this.OooO0o0;
      localArrayRowVariables.OooO0OO(paramSolverVariable1, f1);
      this.OooO0o0.OooO0OO(paramSolverVariable2, f2);
      paramSolverVariable1 = this.OooO0o0;
      paramSolverVariable1.OooO0OO(paramSolverVariable3, f2);
    }
    else
    {
      localArrayRowVariables = this.OooO0o0;
      localArrayRowVariables.OooO0OO(paramSolverVariable1, f2);
      this.OooO0o0.OooO0OO(paramSolverVariable2, f1);
      paramSolverVariable1 = this.OooO0o0;
      paramSolverVariable1.OooO0OO(paramSolverVariable3, f1);
    }
    return this;
  }
  
  public ArrayRow OooOOOo(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, int paramInt)
  {
    int i = 0;
    ArrayRow.ArrayRowVariables localArrayRowVariables = null;
    if (paramInt != 0)
    {
      if (paramInt < 0)
      {
        paramInt *= -1;
        i = 1;
      }
      f1 = paramInt;
      this.OooO0O0 = f1;
    }
    paramInt = -1082130432;
    float f1 = -1.0F;
    float f2 = 1.0F;
    if (i == 0)
    {
      localArrayRowVariables = this.OooO0o0;
      localArrayRowVariables.OooO0OO(paramSolverVariable1, f1);
      this.OooO0o0.OooO0OO(paramSolverVariable2, f2);
      paramSolverVariable1 = this.OooO0o0;
      paramSolverVariable1.OooO0OO(paramSolverVariable3, f1);
    }
    else
    {
      localArrayRowVariables = this.OooO0o0;
      localArrayRowVariables.OooO0OO(paramSolverVariable1, f2);
      this.OooO0o0.OooO0OO(paramSolverVariable2, f1);
      paramSolverVariable1 = this.OooO0o0;
      paramSolverVariable1.OooO0OO(paramSolverVariable3, f2);
    }
    return this;
  }
  
  public void OooOOo()
  {
    float f1 = this.OooO0O0;
    float f2 = 0.0F;
    boolean bool = f1 < 0.0F;
    if (bool)
    {
      int i = -1082130432;
      f2 = -1.0F;
      f1 *= f2;
      this.OooO0O0 = f1;
      ArrayRow.ArrayRowVariables localArrayRowVariables = this.OooO0o0;
      localArrayRowVariables.OooO0o0();
    }
  }
  
  public ArrayRow OooOOo0(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, float paramFloat)
  {
    ArrayRow.ArrayRowVariables localArrayRowVariables = this.OooO0o0;
    float f1 = 0.5F;
    localArrayRowVariables.OooO0OO(paramSolverVariable3, f1);
    this.OooO0o0.OooO0OO(paramSolverVariable4, f1);
    paramSolverVariable3 = this.OooO0o0;
    float f2 = -0.5F;
    paramSolverVariable3.OooO0OO(paramSolverVariable1, f2);
    this.OooO0o0.OooO0OO(paramSolverVariable2, f2);
    float f3 = -paramFloat;
    this.OooO0O0 = f3;
    return this;
  }
  
  public boolean OooOOoo()
  {
    Object localObject = this.OooO00o;
    if (localObject != null)
    {
      localObject = ((SolverVariable)localObject).o0O00o0;
      SolverVariable.Type localType = SolverVariable.Type.o00OoOoo;
      if (localObject != localType)
      {
        f = this.OooO0O0;
        localType = null;
        bool = f < 0.0F;
        if (bool) {}
      }
      else
      {
        bool = true;
        f = 1.4E-45F;
        break label56;
      }
    }
    boolean bool = false;
    float f = 0.0F;
    localObject = null;
    label56:
    return bool;
  }
  
  public void OooOo(SolverVariable paramSolverVariable)
  {
    Object localObject = this.OooO00o;
    float f1 = -1.0F;
    if (localObject != null)
    {
      ArrayRow.ArrayRowVariables localArrayRowVariables = this.OooO0o0;
      localArrayRowVariables.OooO0OO((SolverVariable)localObject, f1);
      localObject = this.OooO00o;
      i = -1;
      ((SolverVariable)localObject).o00Ooo0O = i;
      f2 = 0.0F;
      localObject = null;
      this.OooO00o = null;
    }
    localObject = this.OooO0o0;
    int i = 1;
    float f2 = ((ArrayRow.ArrayRowVariables)localObject).OooO0o(paramSolverVariable, i) * f1;
    this.OooO00o = paramSolverVariable;
    float f3 = 1.0F;
    boolean bool = f2 < f3;
    if (!bool) {
      return;
    }
    f3 = this.OooO0O0 / f2;
    this.OooO0O0 = f3;
    this.OooO0o0.OooO(f2);
  }
  
  public final boolean OooOo0(SolverVariable paramSolverVariable, LinearSystem paramLinearSystem)
  {
    int i = paramSolverVariable.o00o0000;
    int j = 1;
    if (i > j) {
      j = 0;
    }
    return j;
  }
  
  public boolean OooOo00(SolverVariable paramSolverVariable)
  {
    return this.OooO0o0.OooO00o(paramSolverVariable);
  }
  
  public SolverVariable OooOo0O(SolverVariable paramSolverVariable)
  {
    return OooOo0o(null, paramSolverVariable);
  }
  
  public final SolverVariable OooOo0o(boolean[] paramArrayOfBoolean, SolverVariable paramSolverVariable)
  {
    ArrayRow.ArrayRowVariables localArrayRowVariables1 = this.OooO0o0;
    int i = localArrayRowVariables1.getCurrentSize();
    Object localObject = null;
    int j = 0;
    float f1 = 0.0F;
    while (j < i)
    {
      ArrayRow.ArrayRowVariables localArrayRowVariables2 = this.OooO0o0;
      float f2 = localArrayRowVariables2.getVariableValue(j);
      boolean bool1 = f2 < 0.0F;
      if (bool1)
      {
        SolverVariable localSolverVariable = this.OooO0o0.getVariable(j);
        if (paramArrayOfBoolean != null)
        {
          int k = localSolverVariable.o00Ooo0;
          k = paramArrayOfBoolean[k];
          if (k != 0) {}
        }
        else if (localSolverVariable != paramSolverVariable)
        {
          SolverVariable.Type localType1 = localSolverVariable.o0O00o0;
          SolverVariable.Type localType2 = SolverVariable.Type.o00Ooo0;
          if (localType1 != localType2)
          {
            localType2 = SolverVariable.Type.o00Ooo0O;
            if (localType1 != localType2) {}
          }
          else
          {
            boolean bool2 = f2 < f1;
            if (bool2)
            {
              f1 = f2;
              localObject = localSolverVariable;
            }
          }
        }
      }
      j += 1;
    }
    return localObject;
  }
  
  public int OooOoO()
  {
    SolverVariable localSolverVariable = this.OooO00o;
    int i = 4;
    if (localSolverVariable != null)
    {
      j = i;
    }
    else
    {
      j = 0;
      localSolverVariable = null;
    }
    int j = j + i + i;
    i = this.OooO0o0.OooO0oo();
    return j + i;
  }
  
  public void OooOoO0()
  {
    this.OooO00o = null;
    this.OooO0o0.clear();
    this.OooO0O0 = 0.0F;
    this.OooO0o = false;
  }
  
  public String OooOoOO()
  {
    Object localObject1 = this.OooO00o;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = "0";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    else
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = this.OooO00o;
      ((StringBuilder)localObject1).append(localObject2);
    }
    localObject1 = ((StringBuilder)localObject1).toString();
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append(" = ");
    localObject1 = ((StringBuilder)localObject2).toString();
    float f1 = this.OooO0O0;
    boolean bool1 = f1 < 0.0F;
    int i = 0;
    boolean bool2 = true;
    float f2 = 1.4E-45F;
    if (bool1)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append((String)localObject1);
      float f3 = this.OooO0O0;
      ((StringBuilder)localObject2).append(f3);
      localObject1 = ((StringBuilder)localObject2).toString();
      bool1 = bool2;
      f1 = f2;
    }
    else
    {
      bool1 = false;
      localObject2 = null;
      f1 = 0.0F;
    }
    ArrayRow.ArrayRowVariables localArrayRowVariables1 = this.OooO0o0;
    int j = localArrayRowVariables1.getCurrentSize();
    while (i < j)
    {
      Object localObject3 = this.OooO0o0.getVariable(i);
      if (localObject3 != null)
      {
        ArrayRow.ArrayRowVariables localArrayRowVariables2 = this.OooO0o0;
        float f4 = localArrayRowVariables2.getVariableValue(i);
        boolean bool3 = f4 < 0.0F;
        if (bool3)
        {
          localObject3 = ((SolverVariable)localObject3).toString();
          float f5 = -1.0F;
          if (!bool1)
          {
            bool1 = f4 < 0.0F;
            if (!bool1) {
              break label354;
            }
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((StringBuilder)localObject2).append((String)localObject1);
            localObject1 = "- ";
          }
          else
          {
            localObject2 = new java/lang/StringBuilder;
            if (bool3)
            {
              ((StringBuilder)localObject2).<init>();
              ((StringBuilder)localObject2).append((String)localObject1);
              ((StringBuilder)localObject2).append(" + ");
              localObject1 = ((StringBuilder)localObject2).toString();
              break label354;
            }
            ((StringBuilder)localObject2).<init>();
            ((StringBuilder)localObject2).append((String)localObject1);
            localObject1 = " - ";
          }
          ((StringBuilder)localObject2).append((String)localObject1);
          localObject1 = ((StringBuilder)localObject2).toString();
          f4 *= f5;
          label354:
          f1 = 1.0F;
          bool1 = f4 < f1;
          if (!bool1)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
          }
          else
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((StringBuilder)localObject2).append((String)localObject1);
            ((StringBuilder)localObject2).append(f4);
            localObject1 = " ";
          }
          ((StringBuilder)localObject2).append((String)localObject1);
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject1 = ((StringBuilder)localObject2).toString();
          bool1 = bool2;
          f1 = f2;
        }
      }
      i += 1;
    }
    if (!bool1)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("0.0");
      localObject1 = ((StringBuilder)localObject2).toString();
    }
    return localObject1;
  }
  
  public void OooOoo(LinearSystem paramLinearSystem, ArrayRow paramArrayRow, boolean paramBoolean)
  {
    ArrayRow.ArrayRowVariables localArrayRowVariables = this.OooO0o0;
    float f1 = localArrayRowVariables.OooO0O0(paramArrayRow, paramBoolean);
    float f2 = this.OooO0O0;
    float f3 = paramArrayRow.OooO0O0 * f1;
    f2 += f3;
    this.OooO0O0 = f2;
    if (paramBoolean)
    {
      paramArrayRow = paramArrayRow.OooO00o;
      paramArrayRow.OooO0o0(this);
    }
    boolean bool = LinearSystem.OooOo00;
    if (bool)
    {
      paramArrayRow = this.OooO00o;
      if (paramArrayRow != null)
      {
        paramArrayRow = this.OooO0o0;
        int i = paramArrayRow.getCurrentSize();
        if (i == 0)
        {
          i = 1;
          this.OooO0o = i;
          paramLinearSystem.OooO00o = i;
        }
      }
    }
  }
  
  public void OooOoo0(LinearSystem paramLinearSystem, SolverVariable paramSolverVariable, boolean paramBoolean)
  {
    if (paramSolverVariable != null)
    {
      boolean bool1 = paramSolverVariable.o00OooO;
      if (bool1)
      {
        float f1 = this.OooO0o0.OooO0oO(paramSolverVariable);
        float f2 = this.OooO0O0;
        float f3 = paramSolverVariable.o00OooO0 * f1;
        f2 += f3;
        this.OooO0O0 = f2;
        ArrayRow.ArrayRowVariables localArrayRowVariables = this.OooO0o0;
        localArrayRowVariables.OooO0o(paramSolverVariable, paramBoolean);
        if (paramBoolean) {
          paramSolverVariable.OooO0o0(this);
        }
        boolean bool2 = LinearSystem.OooOo00;
        if (bool2)
        {
          paramSolverVariable = this.OooO0o0;
          int i = paramSolverVariable.getCurrentSize();
          if (i == 0)
          {
            i = 1;
            this.OooO0o = i;
            paramLinearSystem.OooO00o = i;
          }
        }
      }
    }
  }
  
  public void OooOooO(LinearSystem paramLinearSystem, SolverVariable paramSolverVariable, boolean paramBoolean)
  {
    if (paramSolverVariable != null)
    {
      boolean bool1 = paramSolverVariable.o00o000;
      if (bool1)
      {
        ArrayRow.ArrayRowVariables localArrayRowVariables1 = this.OooO0o0;
        float f1 = localArrayRowVariables1.OooO0oO(paramSolverVariable);
        float f2 = this.OooO0O0;
        float f3 = paramSolverVariable.o00o000o * f1;
        f2 += f3;
        this.OooO0O0 = f2;
        ArrayRow.ArrayRowVariables localArrayRowVariables2 = this.OooO0o0;
        localArrayRowVariables2.OooO0o(paramSolverVariable, paramBoolean);
        if (paramBoolean) {
          paramSolverVariable.OooO0o0(this);
        }
        localArrayRowVariables2 = this.OooO0o0;
        SolverVariable[] arrayOfSolverVariable = paramLinearSystem.OooOOO.OooO0Oo;
        int i = paramSolverVariable.o00o000O;
        paramSolverVariable = arrayOfSolverVariable[i];
        localArrayRowVariables2.OooO0Oo(paramSolverVariable, f1, paramBoolean);
        boolean bool2 = LinearSystem.OooOo00;
        if (bool2)
        {
          paramSolverVariable = this.OooO0o0;
          int j = paramSolverVariable.getCurrentSize();
          if (j == 0)
          {
            j = 1;
            this.OooO0o = j;
            paramLinearSystem.OooO00o = j;
          }
        }
      }
    }
  }
  
  public void OooOooo(LinearSystem paramLinearSystem)
  {
    Object localObject1 = paramLinearSystem.OooO0oO;
    int i = localObject1.length;
    if (i == 0) {
      return;
    }
    i = 0;
    localObject1 = null;
    int k = 0;
    boolean bool2;
    for (;;)
    {
      bool2 = true;
      if (k != 0) {
        break;
      }
      Object localObject2 = this.OooO0o0;
      int m = ((ArrayRow.ArrayRowVariables)localObject2).getCurrentSize();
      int n = 0;
      SolverVariable localSolverVariable;
      boolean bool3;
      Object localObject3;
      while (n < m)
      {
        localSolverVariable = this.OooO0o0.getVariable(n);
        int i1 = localSolverVariable.o00Ooo0O;
        int i2 = -1;
        if (i1 == i2)
        {
          bool3 = localSolverVariable.o00OooO;
          if (!bool3)
          {
            bool3 = localSolverVariable.o00o000;
            if (!bool3) {
              break label121;
            }
          }
        }
        localObject3 = this.OooO0Oo;
        ((ArrayList)localObject3).add(localSolverVariable);
        label121:
        n += 1;
      }
      localObject2 = this.OooO0Oo;
      m = ((ArrayList)localObject2).size();
      if (m > 0)
      {
        n = 0;
        while (n < m)
        {
          localSolverVariable = (SolverVariable)this.OooO0Oo.get(n);
          bool3 = localSolverVariable.o00OooO;
          if (bool3)
          {
            OooOoo0(paramLinearSystem, localSolverVariable, bool2);
          }
          else
          {
            bool3 = localSolverVariable.o00o000;
            if (bool3)
            {
              OooOooO(paramLinearSystem, localSolverVariable, bool2);
            }
            else
            {
              localObject3 = paramLinearSystem.OooO0oO;
              int i3 = localSolverVariable.o00Ooo0O;
              localSolverVariable = localObject3[i3];
              OooOoo(paramLinearSystem, localSolverVariable, bool2);
            }
          }
          n += 1;
        }
        ArrayList localArrayList = this.OooO0Oo;
        localArrayList.clear();
      }
      else
      {
        k = bool2;
      }
    }
    boolean bool1 = LinearSystem.OooOo00;
    if (bool1)
    {
      localObject1 = this.OooO00o;
      if (localObject1 != null)
      {
        localObject1 = this.OooO0o0;
        int j = ((ArrayRow.ArrayRowVariables)localObject1).getCurrentSize();
        if (j == 0)
        {
          this.OooO0o = bool2;
          paramLinearSystem.OooO00o = bool2;
        }
      }
    }
  }
  
  public void clear()
  {
    this.OooO0o0.clear();
    this.OooO00o = null;
    this.OooO0O0 = 0.0F;
  }
  
  public SolverVariable getKey()
  {
    return this.OooO00o;
  }
  
  public boolean isEmpty()
  {
    Object localObject = this.OooO00o;
    if (localObject == null)
    {
      f = this.OooO0O0;
      boolean bool = f < 0.0F;
      if (!bool)
      {
        localObject = this.OooO0o0;
        i = ((ArrayRow.ArrayRowVariables)localObject).getCurrentSize();
        if (i == 0)
        {
          i = 1;
          f = 1.4E-45F;
          return i;
        }
      }
    }
    int i = 0;
    float f = 0.0F;
    localObject = null;
    return i;
  }
  
  public String toString()
  {
    return OooOoOO();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.ArrayRow
 * JD-Core Version:    0.7.0.1
 */