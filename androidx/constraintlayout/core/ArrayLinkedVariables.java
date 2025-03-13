package androidx.constraintlayout.core;

import java.util.Arrays;

public class ArrayLinkedVariables
  implements ArrayRow.ArrayRowVariables
{
  public static float OooOO0o = 0.001F;
  public int OooO;
  public int OooO00o = 0;
  public final ArrayRow OooO0O0;
  public final Cache OooO0OO;
  public int OooO0Oo;
  public int[] OooO0o;
  public SolverVariable OooO0o0;
  public int[] OooO0oO;
  public float[] OooO0oo;
  public int OooOO0;
  public boolean OooOO0O;
  
  public ArrayLinkedVariables(ArrayRow paramArrayRow, Cache paramCache)
  {
    int i = 8;
    this.OooO0Oo = i;
    this.OooO0o0 = null;
    int[] arrayOfInt = new int[i];
    this.OooO0o = arrayOfInt;
    arrayOfInt = new int[i];
    this.OooO0oO = arrayOfInt;
    float[] arrayOfFloat = new float[i];
    this.OooO0oo = arrayOfFloat;
    i = -1;
    this.OooO = i;
    this.OooOO0 = i;
    this.OooOO0O = false;
    this.OooO0O0 = paramArrayRow;
    this.OooO0OO = paramCache;
  }
  
  public void OooO(float paramFloat)
  {
    int i = this.OooO;
    int j = 0;
    for (;;)
    {
      int k = -1;
      if (i == k) {
        break;
      }
      k = this.OooO00o;
      if (j >= k) {
        break;
      }
      Object localObject = this.OooO0oo;
      float f = localObject[i] / paramFloat;
      localObject[i] = f;
      localObject = this.OooO0oO;
      i = localObject[i];
      j += 1;
    }
  }
  
  public boolean OooO00o(SolverVariable paramSolverVariable)
  {
    int i = this.OooO;
    int j = -1;
    if (i == j) {
      return false;
    }
    int k = 0;
    while (i != j)
    {
      int m = this.OooO00o;
      if (k >= m) {
        break;
      }
      int[] arrayOfInt = this.OooO0o;
      m = arrayOfInt[i];
      int n = paramSolverVariable.o00Ooo0;
      if (m == n) {
        return true;
      }
      arrayOfInt = this.OooO0oO;
      i = arrayOfInt[i];
      k += 1;
    }
    return false;
  }
  
  public float OooO0O0(ArrayRow paramArrayRow, boolean paramBoolean)
  {
    SolverVariable localSolverVariable1 = paramArrayRow.OooO00o;
    float f1 = OooO0oO(localSolverVariable1);
    SolverVariable localSolverVariable2 = paramArrayRow.OooO00o;
    OooO0o(localSolverVariable2, paramBoolean);
    paramArrayRow = paramArrayRow.OooO0o0;
    int i = paramArrayRow.getCurrentSize();
    int j = 0;
    while (j < i)
    {
      SolverVariable localSolverVariable3 = paramArrayRow.getVariable(j);
      float f2 = paramArrayRow.OooO0oO(localSolverVariable3) * f1;
      OooO0Oo(localSolverVariable3, f2, paramBoolean);
      j += 1;
    }
    return f1;
  }
  
  public final void OooO0OO(SolverVariable paramSolverVariable, float paramFloat)
  {
    float[] arrayOfFloat = null;
    boolean bool1 = paramFloat < 0.0F;
    int j = 1;
    if (!bool1)
    {
      OooO0o(paramSolverVariable, j);
      return;
    }
    int i = this.OooO;
    int k = 0;
    Object localObject1 = null;
    int m = -1;
    if (i == m)
    {
      this.OooO = 0;
      arrayOfFloat = this.OooO0oo;
      arrayOfFloat[0] = paramFloat;
      localObject2 = this.OooO0o;
      i = paramSolverVariable.o00Ooo0;
      localObject2[0] = i;
      this.OooO0oO[0] = m;
      n = paramSolverVariable.o00o0000 + j;
      paramSolverVariable.o00o0000 = n;
      localObject2 = this.OooO0O0;
      paramSolverVariable.OooO0O0((ArrayRow)localObject2);
      int i2 = this.OooO00o + j;
      this.OooO00o = i2;
      boolean bool3 = this.OooOO0O;
      if (!bool3)
      {
        i3 = this.OooOO0 + j;
        this.OooOO0 = i3;
        localObject2 = this.OooO0o;
        i = localObject2.length;
        if (i3 >= i)
        {
          this.OooOO0O = j;
          i3 = localObject2.length - j;
          this.OooOO0 = i3;
        }
      }
      return;
    }
    int i4 = 0;
    int[] arrayOfInt1 = null;
    int i5 = m;
    int[] arrayOfInt2;
    int i8;
    while (i != m)
    {
      int i6 = this.OooO00o;
      if (i4 >= i6) {
        break;
      }
      arrayOfInt2 = this.OooO0o;
      i6 = arrayOfInt2[i];
      i8 = paramSolverVariable.o00Ooo0;
      if (i6 == i8)
      {
        this.OooO0oo[i] = paramFloat;
        return;
      }
      if (i6 < i8) {
        i5 = i;
      }
      arrayOfInt2 = this.OooO0oO;
      i = arrayOfInt2[i];
      i4 += 1;
    }
    i = this.OooOO0;
    i4 = i + 1;
    boolean bool4 = this.OooOO0O;
    if (bool4)
    {
      arrayOfInt1 = this.OooO0o;
      i7 = arrayOfInt1[i];
      if (i7 != m) {
        i = arrayOfInt1.length;
      }
    }
    else
    {
      i = i4;
    }
    arrayOfInt1 = this.OooO0o;
    int i7 = arrayOfInt1.length;
    if (i >= i7)
    {
      i7 = this.OooO00o;
      i4 = arrayOfInt1.length;
      if (i7 < i4)
      {
        i4 = 0;
        arrayOfInt1 = null;
        for (;;)
        {
          arrayOfInt2 = this.OooO0o;
          i8 = arrayOfInt2.length;
          if (i4 >= i8) {
            break;
          }
          i7 = arrayOfInt2[i4];
          if (i7 == m)
          {
            i = i4;
            break;
          }
          i4 += 1;
        }
      }
    }
    arrayOfInt1 = this.OooO0o;
    i7 = arrayOfInt1.length;
    if (i >= i7)
    {
      i = arrayOfInt1.length;
      i4 = this.OooO0Oo * 2;
      this.OooO0Oo = i4;
      this.OooOO0O = false;
      k = i + -1;
      this.OooOO0 = k;
      localObject1 = Arrays.copyOf(this.OooO0oo, i4);
      this.OooO0oo = ((float[])localObject1);
      localObject1 = this.OooO0o;
      i4 = this.OooO0Oo;
      localObject1 = Arrays.copyOf((int[])localObject1, i4);
      this.OooO0o = ((int[])localObject1);
      localObject1 = this.OooO0oO;
      i4 = this.OooO0Oo;
      localObject1 = Arrays.copyOf((int[])localObject1, i4);
      this.OooO0oO = ((int[])localObject1);
    }
    localObject1 = this.OooO0o;
    i4 = paramSolverVariable.o00Ooo0;
    localObject1[i] = i4;
    localObject1 = this.OooO0oo;
    localObject1[i] = paramFloat;
    Object localObject2 = this.OooO0oO;
    if (i5 != m)
    {
      k = localObject2[i5];
      localObject2[i] = k;
      localObject2[i5] = i;
    }
    else
    {
      k = this.OooO;
      localObject2[i] = k;
      this.OooO = i;
    }
    int n = paramSolverVariable.o00o0000 + j;
    paramSolverVariable.o00o0000 = n;
    localObject2 = this.OooO0O0;
    paramSolverVariable.OooO0O0((ArrayRow)localObject2);
    int i3 = this.OooO00o + j;
    this.OooO00o = i3;
    boolean bool2 = this.OooOO0O;
    if (!bool2)
    {
      int i1 = this.OooOO0 + j;
      this.OooOO0 = i1;
    }
    localObject2 = this.OooO0o;
    i = localObject2.length;
    if (i3 >= i) {
      this.OooOO0O = j;
    }
    i3 = this.OooOO0;
    i = localObject2.length;
    if (i3 >= i)
    {
      this.OooOO0O = j;
      i3 = localObject2.length - j;
      this.OooOO0 = i3;
    }
  }
  
  public void OooO0Oo(SolverVariable paramSolverVariable, float paramFloat, boolean paramBoolean)
  {
    float f1 = OooOO0o;
    float f2 = -f1;
    boolean bool1 = paramFloat < f2;
    if (bool1)
    {
      boolean bool2 = paramFloat < f1;
      if (bool2) {
        return;
      }
    }
    boolean bool3 = this.OooO;
    bool1 = false;
    f2 = 0.0F;
    float[] arrayOfFloat1 = null;
    int j = -1;
    float f3 = 0.0F / 0.0F;
    int k = 1;
    if (bool3 == j)
    {
      this.OooO = 0;
      float[] arrayOfFloat2 = this.OooO0oo;
      arrayOfFloat2[0] = paramFloat;
      localObject1 = this.OooO0o;
      paramBoolean = paramSolverVariable.o00Ooo0;
      localObject1[0] = paramBoolean;
      this.OooO0oO[0] = j;
      int m = paramSolverVariable.o00o0000 + k;
      paramSolverVariable.o00o0000 = m;
      localObject1 = this.OooO0O0;
      paramSolverVariable.OooO0O0((ArrayRow)localObject1);
      int i2 = this.OooO00o + k;
      this.OooO00o = i2;
      boolean bool6 = this.OooOO0O;
      if (!bool6)
      {
        boolean bool7 = this.OooOO0 + k;
        this.OooOO0 = bool7;
        localObject1 = this.OooO0o;
        paramBoolean = localObject1.length;
        if (bool7 >= paramBoolean)
        {
          this.OooOO0O = k;
          i3 = localObject1.length - k;
          this.OooOO0 = i3;
        }
      }
      return;
    }
    int i5 = 0;
    int[] arrayOfInt1 = null;
    float f4 = 0.0F;
    int i7 = j;
    int i9;
    while (bool3 != j)
    {
      int i8 = this.OooO00o;
      if (i5 >= i8) {
        break;
      }
      int[] arrayOfInt2 = this.OooO0o;
      i9 = arrayOfInt2[bool3];
      int i10 = paramSolverVariable.o00Ooo0;
      if (i9 == i10)
      {
        arrayOfFloat1 = this.OooO0oo;
        f3 = arrayOfFloat1[bool3] + paramFloat;
        paramFloat = OooOO0o;
        f4 = -paramFloat;
        i5 = f3 < f4;
        i9 = 0;
        arrayOfInt2 = null;
        if (i5 > 0)
        {
          bool4 = f3 < paramFloat;
          if (bool4)
          {
            j = 0;
            f3 = 0.0F;
          }
        }
        arrayOfFloat1[bool3] = f3;
        boolean bool4 = f3 < 0.0F;
        if (!bool4)
        {
          int n = this.OooO;
          if (bool3 == n)
          {
            localObject1 = this.OooO0oO;
            n = localObject1[bool3];
            this.OooO = n;
          }
          else
          {
            localObject1 = this.OooO0oO;
            i = localObject1[bool3];
            localObject1[i7] = i;
          }
          if (paramBoolean)
          {
            localObject1 = this.OooO0O0;
            paramSolverVariable.OooO0o0((ArrayRow)localObject1);
          }
          boolean bool5 = this.OooOO0O;
          if (bool5) {
            this.OooOO0 = bool3;
          }
          i1 = paramSolverVariable.o00o0000 - k;
          paramSolverVariable.o00o0000 = i1;
          i3 = this.OooO00o - k;
          this.OooO00o = i3;
        }
        return;
      }
      if (i9 < i10) {
        i7 = bool3;
      }
      arrayOfInt2 = this.OooO0oO;
      bool3 = arrayOfInt2[bool3];
      int i6;
      i5 += 1;
    }
    paramBoolean = this.OooOO0;
    bool3 = paramBoolean + true;
    boolean bool10 = this.OooOO0O;
    if (bool10)
    {
      localObject2 = this.OooO0o;
      bool11 = localObject2[paramBoolean];
      if (bool11 != j) {
        paramBoolean = localObject2.length;
      }
    }
    else
    {
      paramBoolean = bool3;
    }
    Object localObject2 = this.OooO0o;
    boolean bool11 = localObject2.length;
    if (paramBoolean >= bool11)
    {
      bool12 = this.OooO00o;
      bool3 = localObject2.length;
      if (bool12 < bool3)
      {
        bool3 = false;
        localObject2 = null;
        f1 = 0.0F;
        for (;;)
        {
          arrayOfInt1 = this.OooO0o;
          i9 = arrayOfInt1.length;
          if (bool3 >= i9) {
            break;
          }
          bool12 = arrayOfInt1[bool3];
          if (bool12 == j)
          {
            paramBoolean = bool3;
            break;
          }
          bool3 += true;
        }
      }
    }
    localObject2 = this.OooO0o;
    boolean bool12 = localObject2.length;
    if (paramBoolean >= bool12)
    {
      paramBoolean = localObject2.length;
      bool3 = this.OooO0Oo * 2;
      this.OooO0Oo = bool3;
      this.OooOO0O = false;
      i = paramBoolean + true;
      this.OooOO0 = i;
      arrayOfFloat1 = this.OooO0oo;
      localObject2 = Arrays.copyOf(arrayOfFloat1, bool3);
      this.OooO0oo = ((float[])localObject2);
      localObject2 = this.OooO0o;
      i = this.OooO0Oo;
      localObject2 = Arrays.copyOf((int[])localObject2, i);
      this.OooO0o = ((int[])localObject2);
      localObject2 = this.OooO0oO;
      i = this.OooO0Oo;
      localObject2 = Arrays.copyOf((int[])localObject2, i);
      this.OooO0oO = ((int[])localObject2);
    }
    localObject2 = this.OooO0o;
    int i = paramSolverVariable.o00Ooo0;
    localObject2[paramBoolean] = i;
    localObject2 = this.OooO0oo;
    localObject2[paramBoolean] = paramFloat;
    Object localObject1 = this.OooO0oO;
    if (i7 != j)
    {
      bool3 = localObject1[i7];
      localObject1[paramBoolean] = bool3;
      localObject1[i7] = paramBoolean;
    }
    else
    {
      bool3 = this.OooO;
      localObject1[paramBoolean] = bool3;
      this.OooO = paramBoolean;
    }
    int i1 = paramSolverVariable.o00o0000 + k;
    paramSolverVariable.o00o0000 = i1;
    localObject1 = this.OooO0O0;
    paramSolverVariable.OooO0O0((ArrayRow)localObject1);
    int i3 = this.OooO00o + k;
    this.OooO00o = i3;
    boolean bool8 = this.OooOO0O;
    if (!bool8)
    {
      bool9 = this.OooOO0 + k;
      this.OooOO0 = bool9;
    }
    boolean bool9 = this.OooOO0;
    localObject1 = this.OooO0o;
    paramBoolean = localObject1.length;
    if (bool9 >= paramBoolean)
    {
      this.OooOO0O = k;
      int i4 = localObject1.length - k;
      this.OooOO0 = i4;
    }
  }
  
  public final float OooO0o(SolverVariable paramSolverVariable, boolean paramBoolean)
  {
    SolverVariable localSolverVariable = this.OooO0o0;
    if (localSolverVariable == paramSolverVariable)
    {
      i = 0;
      localSolverVariable = null;
      this.OooO0o0 = null;
    }
    int i = this.OooO;
    int j = 0;
    int[] arrayOfInt1 = null;
    int k = -1;
    if (i == k) {
      return 0.0F;
    }
    int m = 0;
    int n = k;
    while (i != k)
    {
      int i1 = this.OooO00o;
      if (m >= i1) {
        break;
      }
      int[] arrayOfInt2 = this.OooO0o;
      i1 = arrayOfInt2[i];
      int i2 = paramSolverVariable.o00Ooo0;
      if (i1 == i2)
      {
        j = this.OooO;
        if (i == j)
        {
          arrayOfInt1 = this.OooO0oO;
          j = arrayOfInt1[i];
          this.OooO = j;
        }
        else
        {
          arrayOfInt1 = this.OooO0oO;
          m = arrayOfInt1[i];
          arrayOfInt1[n] = m;
        }
        if (paramBoolean)
        {
          ArrayRow localArrayRow = this.OooO0O0;
          paramSolverVariable.OooO0o0(localArrayRow);
        }
        paramBoolean = paramSolverVariable.o00o0000 + -1;
        paramSolverVariable.o00o0000 = paramBoolean;
        int i3 = this.OooO00o + -1;
        this.OooO00o = i3;
        paramSolverVariable = this.OooO0o;
        paramSolverVariable[i] = k;
        boolean bool = this.OooOO0O;
        if (bool) {
          this.OooOO0 = i;
        }
        return this.OooO0oo[i];
      }
      int[] arrayOfInt3 = this.OooO0oO;
      n = arrayOfInt3[i];
      m += 1;
      int i4 = n;
      n = i;
      i = i4;
    }
    return 0.0F;
  }
  
  public void OooO0o0()
  {
    int i = this.OooO;
    int j = 0;
    for (;;)
    {
      int k = -1;
      if (i == k) {
        break;
      }
      k = this.OooO00o;
      if (j >= k) {
        break;
      }
      Object localObject = this.OooO0oo;
      float f1 = localObject[i];
      float f2 = -1.0F;
      f1 *= f2;
      localObject[i] = f1;
      localObject = this.OooO0oO;
      i = localObject[i];
      j += 1;
    }
  }
  
  public final float OooO0oO(SolverVariable paramSolverVariable)
  {
    int i = this.OooO;
    int j = 0;
    for (;;)
    {
      int k = -1;
      if (i == k) {
        break;
      }
      k = this.OooO00o;
      if (j >= k) {
        break;
      }
      int[] arrayOfInt = this.OooO0o;
      k = arrayOfInt[i];
      int m = paramSolverVariable.o00Ooo0;
      if (k == m) {
        return this.OooO0oo[i];
      }
      arrayOfInt = this.OooO0oO;
      i = arrayOfInt[i];
      j += 1;
    }
    return 0.0F;
  }
  
  public int OooO0oo()
  {
    return this.OooO0o.length * 4 * 3 + 0 + 36;
  }
  
  public final void clear()
  {
    int i = this.OooO;
    int j = 0;
    int k;
    for (;;)
    {
      k = -1;
      if (i == k) {
        break;
      }
      int m = this.OooO00o;
      if (j >= m) {
        break;
      }
      Object localObject1 = this.OooO0OO.OooO0Oo;
      Object localObject2 = this.OooO0o;
      m = localObject2[i];
      localObject1 = localObject1[m];
      if (localObject1 != null)
      {
        localObject2 = this.OooO0O0;
        ((SolverVariable)localObject1).OooO0o0((ArrayRow)localObject2);
      }
      localObject1 = this.OooO0oO;
      i = localObject1[i];
      j += 1;
    }
    this.OooO = k;
    this.OooOO0 = k;
    this.OooOO0O = false;
    this.OooO00o = 0;
  }
  
  public int getCurrentSize()
  {
    return this.OooO00o;
  }
  
  public int getHead()
  {
    return this.OooO;
  }
  
  public final int getId(int paramInt)
  {
    return this.OooO0o[paramInt];
  }
  
  public final int getNextIndice(int paramInt)
  {
    return this.OooO0oO[paramInt];
  }
  
  public SolverVariable getPivotCandidate()
  {
    SolverVariable localSolverVariable = this.OooO0o0;
    if (localSolverVariable == null)
    {
      int i = this.OooO;
      int j = 0;
      Object localObject1 = null;
      for (;;)
      {
        int k = -1;
        float f = 0.0F / 0.0F;
        if (i == k) {
          break;
        }
        k = this.OooO00o;
        if (j >= k) {
          break;
        }
        Object localObject2 = this.OooO0oo;
        f = localObject2[i];
        int m = 0;
        int[] arrayOfInt = null;
        boolean bool = f < 0.0F;
        if (bool)
        {
          localObject2 = this.OooO0OO.OooO0Oo;
          arrayOfInt = this.OooO0o;
          m = arrayOfInt[i];
          localObject2 = localObject2[m];
          if (localObject1 != null)
          {
            m = localObject1.o00Ooo0o;
            int n = ((SolverVariable)localObject2).o00Ooo0o;
            if (m >= n) {}
          }
          else
          {
            localObject1 = localObject2;
          }
        }
        localObject2 = this.OooO0oO;
        i = localObject2[i];
        j += 1;
      }
      return localObject1;
    }
    return localSolverVariable;
  }
  
  public final float getValue(int paramInt)
  {
    return this.OooO0oo[paramInt];
  }
  
  public SolverVariable getVariable(int paramInt)
  {
    int i = this.OooO;
    int j = 0;
    for (;;)
    {
      int k = -1;
      if (i == k) {
        break;
      }
      k = this.OooO00o;
      if (j >= k) {
        break;
      }
      if (j == paramInt)
      {
        SolverVariable[] arrayOfSolverVariable = this.OooO0OO.OooO0Oo;
        i = this.OooO0o[i];
        return arrayOfSolverVariable[i];
      }
      int[] arrayOfInt = this.OooO0oO;
      i = arrayOfInt[i];
      j += 1;
    }
    return null;
  }
  
  public float getVariableValue(int paramInt)
  {
    int i = this.OooO;
    int j = 0;
    for (;;)
    {
      int k = -1;
      if (i == k) {
        break;
      }
      k = this.OooO00o;
      if (j >= k) {
        break;
      }
      if (j == paramInt) {
        return this.OooO0oo[i];
      }
      int[] arrayOfInt = this.OooO0oO;
      i = arrayOfInt[i];
      j += 1;
    }
    return 0.0F;
  }
  
  public String toString()
  {
    int i = this.OooO;
    Object localObject1 = "";
    int j = 0;
    for (;;)
    {
      int k = -1;
      if (i == k) {
        break;
      }
      k = this.OooO00o;
      if (j >= k) {
        break;
      }
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" -> ");
      localObject1 = ((StringBuilder)localObject2).toString();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append((String)localObject1);
      float f = this.OooO0oo[i];
      ((StringBuilder)localObject2).append(f);
      ((StringBuilder)localObject2).append(" : ");
      localObject1 = ((StringBuilder)localObject2).toString();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = this.OooO0OO.OooO0Oo;
      int[] arrayOfInt = this.OooO0o;
      int m = arrayOfInt[i];
      localObject1 = localObject1[m];
      ((StringBuilder)localObject2).append(localObject1);
      localObject1 = ((StringBuilder)localObject2).toString();
      localObject2 = this.OooO0oO;
      i = localObject2[i];
      j += 1;
    }
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.ArrayLinkedVariables
 * JD-Core Version:    0.7.0.1
 */