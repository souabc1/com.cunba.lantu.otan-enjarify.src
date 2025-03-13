package androidx.constraintlayout.core;

import java.util.Arrays;

public class SolverVariableValues
  implements ArrayRow.ArrayRowVariables
{
  public static float OooOOO = 0.001F;
  public int[] OooO;
  public final int OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int[] OooO0Oo;
  public int[] OooO0o;
  public int[] OooO0o0;
  public float[] OooO0oO;
  public int[] OooO0oo;
  public int OooOO0;
  public int OooOO0O;
  public final ArrayRow OooOO0o;
  public final Cache OooOOO0;
  
  public SolverVariableValues(ArrayRow paramArrayRow, Cache paramCache)
  {
    int i = -1;
    this.OooO00o = i;
    int j = 16;
    this.OooO0O0 = j;
    this.OooO0OO = j;
    Object localObject = new int[j];
    this.OooO0Oo = ((int[])localObject);
    localObject = new int[j];
    this.OooO0o0 = ((int[])localObject);
    localObject = new int[j];
    this.OooO0o = ((int[])localObject);
    localObject = new float[j];
    this.OooO0oO = ((float[])localObject);
    localObject = new int[j];
    this.OooO0oo = ((int[])localObject);
    int[] arrayOfInt = new int[j];
    this.OooO = arrayOfInt;
    this.OooOO0 = 0;
    this.OooOO0O = i;
    this.OooOO0o = paramArrayRow;
    this.OooOOO0 = paramCache;
    clear();
  }
  
  public void OooO(float paramFloat)
  {
    int i = this.OooOO0;
    int j = this.OooOO0O;
    int k = 0;
    while (k < i)
    {
      Object localObject = this.OooO0oO;
      float f = localObject[j] / paramFloat;
      localObject[j] = f;
      localObject = this.OooO;
      j = localObject[j];
      int m = -1;
      if (j == m) {
        break;
      }
      k += 1;
    }
  }
  
  public boolean OooO00o(SolverVariable paramSolverVariable)
  {
    int i = OooOOO(paramSolverVariable);
    int j = -1;
    if (i != j)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramSolverVariable = null;
    }
    return i;
  }
  
  public float OooO0O0(ArrayRow paramArrayRow, boolean paramBoolean)
  {
    SolverVariable localSolverVariable1 = paramArrayRow.OooO00o;
    float f1 = OooO0oO(localSolverVariable1);
    SolverVariable localSolverVariable2 = paramArrayRow.OooO00o;
    OooO0o(localSolverVariable2, paramBoolean);
    paramArrayRow = (SolverVariableValues)paramArrayRow.OooO0o0;
    int i = paramArrayRow.getCurrentSize();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      int[] arrayOfInt = paramArrayRow.OooO0o;
      int m = arrayOfInt[k];
      int n = -1;
      float f2 = 0.0F / 0.0F;
      if (m != n)
      {
        float[] arrayOfFloat = paramArrayRow.OooO0oO;
        f2 = arrayOfFloat[k];
        SolverVariable[] arrayOfSolverVariable = this.OooOOO0.OooO0Oo;
        arrayOfInt = arrayOfSolverVariable[m];
        f2 *= f1;
        OooO0Oo(arrayOfInt, f2, paramBoolean);
        j += 1;
      }
      k += 1;
    }
    return f1;
  }
  
  public void OooO0OO(SolverVariable paramSolverVariable, float paramFloat)
  {
    float f1 = OooOOO;
    float f2 = -f1;
    int i = paramFloat < f2;
    int k = 1;
    if (i > 0)
    {
      boolean bool = paramFloat < f1;
      if (bool)
      {
        OooO0o(paramSolverVariable, k);
        return;
      }
    }
    int n = this.OooOO0;
    i = 0;
    f2 = 0.0F;
    if (n == 0)
    {
      OooOO0O(0, paramSolverVariable, paramFloat);
      OooOO0(paramSolverVariable, 0);
      this.OooOO0O = 0;
    }
    else
    {
      n = OooOOO(paramSolverVariable);
      int i1 = -1;
      if (n != i1)
      {
        paramSolverVariable = this.OooO0oO;
        paramSolverVariable[n] = paramFloat;
      }
      else
      {
        n = this.OooOO0 + k;
        int m = this.OooO0O0;
        if (n >= m) {
          OooOOO0();
        }
        n = this.OooOO0;
        m = this.OooOO0O;
        int i2 = i1;
        while (i < n)
        {
          int[] arrayOfInt = this.OooO0o;
          int i3 = arrayOfInt[m];
          int i4 = paramSolverVariable.o00Ooo0;
          if (i3 == i4)
          {
            this.OooO0oO[m] = paramFloat;
            return;
          }
          if (i3 < i4) {
            i2 = m;
          }
          arrayOfInt = this.OooO;
          m = arrayOfInt[m];
          if (m == i1) {
            break;
          }
          int j;
          i += 1;
        }
        OooOOOO(i2, paramSolverVariable, paramFloat);
      }
    }
  }
  
  public void OooO0Oo(SolverVariable paramSolverVariable, float paramFloat, boolean paramBoolean)
  {
    float f1 = OooOOO;
    float f2 = -f1;
    boolean bool1 = paramFloat < f2;
    if (bool1)
    {
      boolean bool2 = paramFloat < f1;
      if (bool2) {
        return;
      }
    }
    int j = OooOOO(paramSolverVariable);
    int i = -1;
    f2 = 0.0F / 0.0F;
    if (j == i)
    {
      OooO0OO(paramSolverVariable, paramFloat);
    }
    else
    {
      float[] arrayOfFloat = this.OooO0oO;
      float f3 = arrayOfFloat[j] + paramFloat;
      arrayOfFloat[j] = f3;
      paramFloat = OooOOO;
      float f4 = -paramFloat;
      boolean bool3 = f3 < f4;
      if (bool3)
      {
        boolean bool4 = f3 < paramFloat;
        if (bool4)
        {
          bool4 = false;
          paramFloat = 0.0F;
          arrayOfFloat[j] = 0.0F;
          OooO0o(paramSolverVariable, paramBoolean);
        }
      }
    }
  }
  
  public float OooO0o(SolverVariable paramSolverVariable, boolean paramBoolean)
  {
    int i = OooOOO(paramSolverVariable);
    int j = -1;
    if (i == j) {
      return 0.0F;
    }
    OooOOOo(paramSolverVariable);
    float[] arrayOfFloat = this.OooO0oO;
    float f = arrayOfFloat[i];
    int k = this.OooOO0O;
    if (k == i)
    {
      arrayOfInt1 = this.OooO;
      k = arrayOfInt1[i];
      this.OooOO0O = k;
    }
    this.OooO0o[i] = j;
    int[] arrayOfInt1 = this.OooO0oo;
    int m = arrayOfInt1[i];
    if (m != j)
    {
      int[] arrayOfInt2 = this.OooO;
      int n = arrayOfInt2[i];
      arrayOfInt2[m] = n;
    }
    int[] arrayOfInt3 = this.OooO;
    m = arrayOfInt3[i];
    if (m != j)
    {
      i = arrayOfInt1[i];
      arrayOfInt1[m] = i;
    }
    i = this.OooOO0 + -1;
    this.OooOO0 = i;
    i = paramSolverVariable.o00o0000 + -1;
    paramSolverVariable.o00o0000 = i;
    if (paramBoolean)
    {
      ArrayRow localArrayRow = this.OooOO0o;
      paramSolverVariable.OooO0o0(localArrayRow);
    }
    return f;
  }
  
  public void OooO0o0()
  {
    int i = this.OooOO0;
    int j = this.OooOO0O;
    int k = 0;
    while (k < i)
    {
      Object localObject = this.OooO0oO;
      float f1 = localObject[j];
      float f2 = -1.0F;
      f1 *= f2;
      localObject[j] = f1;
      localObject = this.OooO;
      j = localObject[j];
      int m = -1;
      if (j == m) {
        break;
      }
      k += 1;
    }
  }
  
  public float OooO0oO(SolverVariable paramSolverVariable)
  {
    int i = OooOOO(paramSolverVariable);
    int j = -1;
    if (i != j) {
      return this.OooO0oO[i];
    }
    return 0.0F;
  }
  
  public int OooO0oo()
  {
    return 0;
  }
  
  public final void OooOO0(SolverVariable paramSolverVariable, int paramInt)
  {
    int i = paramSolverVariable.o00Ooo0;
    int j = this.OooO0OO;
    i %= j;
    int[] arrayOfInt = this.OooO0Oo;
    int k = arrayOfInt[i];
    int m = -1;
    if (k == m)
    {
      arrayOfInt[i] = paramInt;
    }
    else
    {
      for (;;)
      {
        paramSolverVariable = this.OooO0o0;
        j = paramSolverVariable[k];
        if (j == m) {
          break;
        }
        k = j;
      }
      paramSolverVariable[k] = paramInt;
    }
    this.OooO0o0[paramInt] = m;
  }
  
  public final void OooOO0O(int paramInt, SolverVariable paramSolverVariable, float paramFloat)
  {
    int[] arrayOfInt1 = this.OooO0o;
    int i = paramSolverVariable.o00Ooo0;
    arrayOfInt1[paramInt] = i;
    this.OooO0oO[paramInt] = paramFloat;
    int[] arrayOfInt2 = this.OooO0oo;
    int j = -1;
    arrayOfInt2[paramInt] = j;
    this.OooO[paramInt] = j;
    ArrayRow localArrayRow = this.OooOO0o;
    paramSolverVariable.OooO0O0(localArrayRow);
    paramInt = paramSolverVariable.o00o0000 + 1;
    paramSolverVariable.o00o0000 = paramInt;
    paramInt = this.OooOO0 + 1;
    this.OooOO0 = paramInt;
  }
  
  public final int OooOO0o()
  {
    int i = 0;
    int k;
    for (;;)
    {
      int j = this.OooO0O0;
      k = -1;
      if (i >= j) {
        break;
      }
      int[] arrayOfInt = this.OooO0o;
      j = arrayOfInt[i];
      if (j == k) {
        return i;
      }
      i += 1;
    }
    return k;
  }
  
  public int OooOOO(SolverVariable paramSolverVariable)
  {
    int i = this.OooOO0;
    int j = -1;
    if ((i != 0) && (paramSolverVariable != null))
    {
      int k = paramSolverVariable.o00Ooo0;
      i = this.OooO0OO;
      i = k % i;
      int[] arrayOfInt = this.OooO0Oo;
      i = arrayOfInt[i];
      if (i == j) {
        return j;
      }
      arrayOfInt = this.OooO0o;
      int m = arrayOfInt[i];
      if (m == k) {
        return i;
      }
      do
      {
        arrayOfInt = this.OooO0o0;
        i = arrayOfInt[i];
        if (i == j) {
          break;
        }
        arrayOfInt = this.OooO0o;
        m = arrayOfInt[i];
      } while (m != k);
      if (i == j) {
        return j;
      }
      arrayOfInt = this.OooO0o;
      m = arrayOfInt[i];
      if (m == k) {
        return i;
      }
    }
    return j;
  }
  
  public final void OooOOO0()
  {
    int i = this.OooO0O0 * 2;
    Object localObject = Arrays.copyOf(this.OooO0o, i);
    this.OooO0o = ((int[])localObject);
    localObject = Arrays.copyOf(this.OooO0oO, i);
    this.OooO0oO = ((float[])localObject);
    localObject = Arrays.copyOf(this.OooO0oo, i);
    this.OooO0oo = ((int[])localObject);
    localObject = Arrays.copyOf(this.OooO, i);
    this.OooO = ((int[])localObject);
    localObject = Arrays.copyOf(this.OooO0o0, i);
    this.OooO0o0 = ((int[])localObject);
    int j = this.OooO0O0;
    while (j < i)
    {
      int[] arrayOfInt = this.OooO0o;
      int k = -1;
      arrayOfInt[j] = k;
      arrayOfInt = this.OooO0o0;
      arrayOfInt[j] = k;
      j += 1;
    }
    this.OooO0O0 = i;
  }
  
  public final void OooOOOO(int paramInt, SolverVariable paramSolverVariable, float paramFloat)
  {
    int i = OooOO0o();
    OooOO0O(i, paramSolverVariable, paramFloat);
    int j = -1;
    paramFloat = 0.0F / 0.0F;
    if (paramInt != j)
    {
      this.OooO0oo[i] = paramInt;
      int[] arrayOfInt1 = this.OooO;
      int k = arrayOfInt1[paramInt];
      arrayOfInt1[i] = k;
      arrayOfInt1[paramInt] = i;
    }
    else
    {
      arrayOfInt2 = this.OooO0oo;
      arrayOfInt2[i] = j;
      paramInt = this.OooOO0;
      if (paramInt > 0)
      {
        arrayOfInt2 = this.OooO;
        int m = this.OooOO0O;
        arrayOfInt2[i] = m;
        this.OooOO0O = i;
      }
      else
      {
        arrayOfInt2 = this.OooO;
        arrayOfInt2[i] = j;
      }
    }
    int[] arrayOfInt2 = this.OooO;
    paramInt = arrayOfInt2[i];
    if (paramInt != j)
    {
      int[] arrayOfInt3 = this.OooO0oo;
      arrayOfInt3[paramInt] = i;
    }
    OooOO0(paramSolverVariable, i);
  }
  
  public final void OooOOOo(SolverVariable paramSolverVariable)
  {
    int i = paramSolverVariable.o00Ooo0;
    int j = this.OooO0OO;
    j = i % j;
    int[] arrayOfInt1 = this.OooO0Oo;
    int k = arrayOfInt1[j];
    int m = -1;
    if (k == m) {
      return;
    }
    int[] arrayOfInt2 = this.OooO0o;
    int n = arrayOfInt2[k];
    if (n == i)
    {
      paramSolverVariable = this.OooO0o0;
      n = paramSolverVariable[k];
      arrayOfInt1[j] = n;
      paramSolverVariable[k] = m;
    }
    else
    {
      int[] arrayOfInt3;
      int i1;
      for (;;)
      {
        arrayOfInt3 = this.OooO0o0;
        i1 = arrayOfInt3[k];
        if (i1 == m) {
          break;
        }
        arrayOfInt2 = this.OooO0o;
        n = arrayOfInt2[i1];
        if (n == i) {
          break;
        }
        k = i1;
      }
      if (i1 != m)
      {
        arrayOfInt2 = this.OooO0o;
        n = arrayOfInt2[i1];
        if (n == i)
        {
          i = arrayOfInt3[i1];
          arrayOfInt3[k] = i;
          arrayOfInt3[i1] = m;
        }
      }
    }
  }
  
  public void clear()
  {
    int i = this.OooOO0;
    int j = 0;
    int[] arrayOfInt = null;
    while (j < i)
    {
      SolverVariable localSolverVariable = getVariable(j);
      if (localSolverVariable != null)
      {
        ArrayRow localArrayRow = this.OooOO0o;
        localSolverVariable.OooO0o0(localArrayRow);
      }
      j += 1;
    }
    i = 0;
    int k;
    for (;;)
    {
      j = this.OooO0O0;
      k = -1;
      if (i >= j) {
        break;
      }
      this.OooO0o[i] = k;
      arrayOfInt = this.OooO0o0;
      arrayOfInt[i] = k;
      i += 1;
    }
    i = 0;
    for (;;)
    {
      j = this.OooO0OO;
      if (i >= j) {
        break;
      }
      arrayOfInt = this.OooO0Oo;
      arrayOfInt[i] = k;
      i += 1;
    }
    this.OooOO0 = 0;
    this.OooOO0O = k;
  }
  
  public int getCurrentSize()
  {
    return this.OooOO0;
  }
  
  public SolverVariable getVariable(int paramInt)
  {
    int i = this.OooOO0;
    if (i == 0) {
      return null;
    }
    int j = this.OooOO0O;
    int k = 0;
    while (k < i)
    {
      int m = -1;
      if ((k == paramInt) && (j != m))
      {
        SolverVariable[] arrayOfSolverVariable = this.OooOOO0.OooO0Oo;
        i = this.OooO0o[j];
        return arrayOfSolverVariable[i];
      }
      int[] arrayOfInt = this.OooO;
      j = arrayOfInt[j];
      if (j == m) {
        break;
      }
      k += 1;
    }
    return null;
  }
  
  public float getVariableValue(int paramInt)
  {
    int i = this.OooOO0;
    int j = this.OooOO0O;
    int k = 0;
    while (k < i)
    {
      if (k == paramInt) {
        return this.OooO0oO[j];
      }
      int[] arrayOfInt = this.OooO;
      j = arrayOfInt[j];
      int m = -1;
      if (j == m) {
        break;
      }
      k += 1;
    }
    return 0.0F;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    int i = hashCode();
    ((StringBuilder)localObject1).append(i);
    Object localObject2 = " { ";
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    i = this.OooOO0;
    int j = 0;
    while (j < i)
    {
      Object localObject3 = getVariable(j);
      if (localObject3 != null)
      {
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((StringBuilder)localObject4).append((String)localObject1);
        ((StringBuilder)localObject4).append(localObject3);
        ((StringBuilder)localObject4).append(" = ");
        float f = getVariableValue(j);
        ((StringBuilder)localObject4).append(f);
        ((StringBuilder)localObject4).append(" ");
        localObject1 = ((StringBuilder)localObject4).toString();
        int k = OooOOO((SolverVariable)localObject3);
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((StringBuilder)localObject4).append((String)localObject1);
        ((StringBuilder)localObject4).append("[p: ");
        localObject1 = ((StringBuilder)localObject4).toString();
        localObject4 = this.OooO0oo;
        int m = localObject4[k];
        Object localObject5 = "none";
        int n = -1;
        if (m != n)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append((String)localObject1);
          localObject1 = this.OooOOO0.OooO0Oo;
          int[] arrayOfInt1 = this.OooO0o;
          int[] arrayOfInt2 = this.OooO0oo;
          int i1 = arrayOfInt2[k];
          int i2 = arrayOfInt1[i1];
          localObject1 = localObject1[i2];
          ((StringBuilder)localObject4).append(localObject1);
        }
        else
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append((String)localObject1);
          ((StringBuilder)localObject4).append((String)localObject5);
        }
        localObject1 = ((StringBuilder)localObject4).toString();
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((StringBuilder)localObject4).append((String)localObject1);
        ((StringBuilder)localObject4).append(", n: ");
        localObject1 = ((StringBuilder)localObject4).toString();
        localObject4 = this.OooO;
        m = localObject4[k];
        if (m != n)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append((String)localObject1);
          localObject1 = this.OooOOO0.OooO0Oo;
          localObject5 = this.OooO0o;
          int[] arrayOfInt3 = this.OooO;
          k = arrayOfInt3[k];
          k = localObject5[k];
          localObject1 = localObject1[k];
          ((StringBuilder)localObject4).append(localObject1);
          localObject1 = ((StringBuilder)localObject4).toString();
        }
        else
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append((String)localObject1);
          ((StringBuilder)localObject3).append((String)localObject5);
          localObject1 = ((StringBuilder)localObject3).toString();
        }
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        ((StringBuilder)localObject3).append((String)localObject1);
        ((StringBuilder)localObject3).append("]");
        localObject1 = ((StringBuilder)localObject3).toString();
      }
      j += 1;
    }
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append(" }");
    return ((StringBuilder)localObject2).toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.SolverVariableValues
 * JD-Core Version:    0.7.0.1
 */