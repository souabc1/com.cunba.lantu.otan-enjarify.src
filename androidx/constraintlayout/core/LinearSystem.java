package androidx.constraintlayout.core;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

public class LinearSystem
{
  public static boolean OooOOo = false;
  public static boolean OooOOoo = true;
  public static Metrics OooOo;
  public static boolean OooOo0 = true;
  public static boolean OooOo00 = true;
  public static boolean OooOo0O = false;
  public static int OooOo0o = 1000;
  public static long OooOoO;
  public static long OooOoO0;
  public boolean OooO;
  public boolean OooO00o = false;
  public int OooO0O0 = 0;
  public HashMap OooO0OO = null;
  public LinearSystem.Row OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public ArrayRow[] OooO0oO;
  public boolean OooO0oo;
  public boolean[] OooOO0;
  public int OooOO0O;
  public int OooOO0o;
  public final Cache OooOOO;
  public int OooOOO0;
  public SolverVariable[] OooOOOO;
  public int OooOOOo;
  public LinearSystem.Row OooOOo0;
  
  public LinearSystem()
  {
    int i = 32;
    this.OooO0o0 = i;
    this.OooO0o = i;
    this.OooO0oO = null;
    this.OooO0oo = false;
    this.OooO = false;
    Object localObject1 = new boolean[i];
    this.OooOO0 = ((boolean[])localObject1);
    this.OooOO0O = 1;
    this.OooOO0o = 0;
    this.OooOOO0 = i;
    localObject1 = new SolverVariable[OooOo0o];
    this.OooOOOO = ((SolverVariable[])localObject1);
    this.OooOOOo = 0;
    Object localObject2 = new ArrayRow[i];
    this.OooO0oO = ((ArrayRow[])localObject2);
    OooOoo0();
    localObject2 = new androidx/constraintlayout/core/Cache;
    ((Cache)localObject2).<init>();
    this.OooOOO = ((Cache)localObject2);
    localObject1 = new androidx/constraintlayout/core/PriorityGoalRow;
    ((PriorityGoalRow)localObject1).<init>((Cache)localObject2);
    this.OooO0Oo = ((LinearSystem.Row)localObject1);
    boolean bool = OooOo0O;
    if (bool)
    {
      localObject1 = new androidx/constraintlayout/core/LinearSystem$ValuesRow;
      ((LinearSystem.ValuesRow)localObject1).<init>(this, (Cache)localObject2);
    }
    else
    {
      localObject1 = new androidx/constraintlayout/core/ArrayRow;
      ((ArrayRow)localObject1).<init>((Cache)localObject2);
    }
    this.OooOOo0 = ((LinearSystem.Row)localObject1);
  }
  
  public static ArrayRow OooOOoo(LinearSystem paramLinearSystem, SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, float paramFloat)
  {
    return paramLinearSystem.OooOOo().OooOO0(paramSolverVariable1, paramSolverVariable2, paramFloat);
  }
  
  private String getDisplaySize(int paramInt)
  {
    paramInt *= 4;
    int i = paramInt / 1024;
    int j = i / 1024;
    String str = "";
    StringBuilder localStringBuilder1;
    if (j > 0)
    {
      localStringBuilder1 = new java/lang/StringBuilder;
      localStringBuilder1.<init>();
      localStringBuilder1.append(str);
      localStringBuilder1.append(j);
      localStringBuilder1.append(" Mb");
      return localStringBuilder1.toString();
    }
    if (i > 0)
    {
      localStringBuilder1 = new java/lang/StringBuilder;
      localStringBuilder1.<init>();
      localStringBuilder1.append(str);
      localStringBuilder1.append(i);
      localStringBuilder1.append(" Kb");
      return localStringBuilder1.toString();
    }
    StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
    localStringBuilder2.<init>();
    localStringBuilder2.append(str);
    localStringBuilder2.append(paramInt);
    localStringBuilder2.append(" bytes");
    return localStringBuilder2.toString();
  }
  
  private String getDisplayStrength(int paramInt)
  {
    int i = 1;
    if (paramInt == i) {
      return "LOW";
    }
    i = 2;
    if (paramInt == i) {
      return "MEDIUM";
    }
    i = 3;
    if (paramInt == i) {
      return "HIGH";
    }
    i = 4;
    if (paramInt == i) {
      return "HIGHEST";
    }
    i = 5;
    if (paramInt == i) {
      return "EQUALITY";
    }
    i = 8;
    if (paramInt == i) {
      return "FIXED";
    }
    i = 6;
    if (paramInt == i) {
      return "BARRIER";
    }
    return "NONE";
  }
  
  public static Metrics getMetrics()
  {
    return OooOo;
  }
  
  public void OooO(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt, boolean paramBoolean)
  {
    ArrayRow localArrayRow = OooOOo();
    SolverVariable localSolverVariable = OooOo00();
    localSolverVariable.o00Ooo0o = 0;
    localArrayRow.OooOOOo(paramSolverVariable1, paramSolverVariable2, localSolverVariable, paramInt);
    OooO0Oo(localArrayRow);
  }
  
  public final SolverVariable OooO00o(SolverVariable.Type paramType, String paramString)
  {
    SolverVariable localSolverVariable = (SolverVariable)this.OooOOO.OooO0OO.OooO0O0();
    if (localSolverVariable == null)
    {
      localSolverVariable = new androidx/constraintlayout/core/SolverVariable;
      localSolverVariable.<init>(paramType, paramString);
    }
    else
    {
      localSolverVariable.OooO0o();
    }
    localSolverVariable.OooO0oo(paramType, paramString);
    int i = this.OooOOOo;
    int j = OooOo0o;
    if (i >= j)
    {
      j *= 2;
      OooOo0o = j;
      paramType = (SolverVariable[])Arrays.copyOf(this.OooOOOO, j);
      this.OooOOOO = paramType;
    }
    paramType = this.OooOOOO;
    j = this.OooOOOo;
    int k = j + 1;
    this.OooOOOo = k;
    paramType[j] = localSolverVariable;
    return localSolverVariable;
  }
  
  public void OooO0O0(ConstraintWidget paramConstraintWidget1, ConstraintWidget paramConstraintWidget2, float paramFloat, int paramInt)
  {
    Object localObject1 = paramConstraintWidget1;
    Object localObject2 = paramConstraintWidget2;
    Object localObject3 = ConstraintAnchor.Type.o00Ooo00;
    Object localObject4 = paramConstraintWidget1.OooOOo0((ConstraintAnchor.Type)localObject3);
    SolverVariable localSolverVariable1 = OooOOo0(localObject4);
    localObject4 = ConstraintAnchor.Type.o00Ooo0;
    Object localObject5 = paramConstraintWidget1.OooOOo0((ConstraintAnchor.Type)localObject4);
    Object localObject6 = OooOOo0(localObject5);
    localObject5 = ConstraintAnchor.Type.o00Ooo0O;
    Object localObject7 = paramConstraintWidget1.OooOOo0((ConstraintAnchor.Type)localObject5);
    SolverVariable localSolverVariable2 = OooOOo0(localObject7);
    localObject7 = ConstraintAnchor.Type.o00Ooo0o;
    localObject1 = paramConstraintWidget1.OooOOo0((ConstraintAnchor.Type)localObject7);
    Object localObject8 = OooOOo0(localObject1);
    localObject1 = paramConstraintWidget2.OooOOo0((ConstraintAnchor.Type)localObject3);
    localObject1 = OooOOo0(localObject1);
    localObject3 = paramConstraintWidget2.OooOOo0((ConstraintAnchor.Type)localObject4);
    SolverVariable localSolverVariable3 = OooOOo0(localObject3);
    localObject3 = paramConstraintWidget2.OooOOo0((ConstraintAnchor.Type)localObject5);
    localObject3 = OooOOo0(localObject3);
    localObject2 = paramConstraintWidget2.OooOOo0((ConstraintAnchor.Type)localObject7);
    SolverVariable localSolverVariable4 = OooOOo0(localObject2);
    localObject2 = OooOOo();
    double d1 = paramFloat;
    double d2 = Math.sin(d1);
    paramConstraintWidget1 = (ConstraintWidget)localObject3;
    double d3 = paramInt;
    float f1 = (float)(d2 * d3);
    localObject7 = localObject2;
    ((ArrayRow)localObject2).OooOOo0((SolverVariable)localObject6, (SolverVariable)localObject8, localSolverVariable3, localSolverVariable4, f1);
    OooO0Oo((ArrayRow)localObject2);
    localObject2 = OooOOo();
    float f2 = (float)(Math.cos(d1) * d3);
    localObject5 = localObject2;
    localObject7 = localSolverVariable2;
    localObject6 = localObject1;
    localObject8 = localObject3;
    ((ArrayRow)localObject2).OooOOo0(localSolverVariable1, localSolverVariable2, (SolverVariable)localObject1, (SolverVariable)localObject3, f2);
    OooO0Oo((ArrayRow)localObject2);
  }
  
  public void OooO0OO(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, float paramFloat, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, int paramInt2, int paramInt3)
  {
    ArrayRow localArrayRow = OooOOo();
    localArrayRow.OooO0oo(paramSolverVariable1, paramSolverVariable2, paramInt1, paramFloat, paramSolverVariable3, paramSolverVariable4, paramInt2);
    int i = 8;
    if (paramInt3 != i) {
      localArrayRow.OooO0Oo(this, paramInt3);
    }
    OooO0Oo(localArrayRow);
  }
  
  public void OooO0Oo(ArrayRow paramArrayRow)
  {
    if (paramArrayRow == null) {
      return;
    }
    Object localObject1 = OooOo;
    long l1 = 1L;
    if (localObject1 != null)
    {
      long l2 = ((Metrics)localObject1).OooO0o + l1;
      ((Metrics)localObject1).OooO0o = l2;
      i = paramArrayRow.OooO0o;
      if (i != 0)
      {
        l2 = ((Metrics)localObject1).OooO0oO + l1;
        ((Metrics)localObject1).OooO0oO = l2;
      }
    }
    int k = this.OooOO0o;
    int i = 1;
    int m;
    k += i;
    int i1 = this.OooOOO0;
    if (m < i1)
    {
      m = this.OooOO0O + i;
      i1 = this.OooO0o;
      if (m < i1) {}
    }
    else
    {
      OooOo();
    }
    boolean bool1 = paramArrayRow.OooO0o;
    i1 = 0;
    Object localObject2 = null;
    if (!bool1)
    {
      paramArrayRow.OooOooo(this);
      bool1 = paramArrayRow.isEmpty();
      if (bool1) {
        return;
      }
      paramArrayRow.OooOOo();
      bool1 = paramArrayRow.OooO0o(this);
      if (bool1)
      {
        localObject1 = OooOOOo();
        paramArrayRow.OooO00o = ((SolverVariable)localObject1);
        int i2 = this.OooOO0o;
        OooOO0o(paramArrayRow);
        int i4 = this.OooOO0o;
        int i3;
        i2 += i;
        if (i4 == i3)
        {
          this.OooOOo0.OooO00o(paramArrayRow);
          localObject2 = this.OooOOo0;
          OooOoOO((LinearSystem.Row)localObject2, i);
          i1 = ((SolverVariable)localObject1).o00Ooo0O;
          i3 = -1;
          if (i1 != i3) {
            break label374;
          }
          localObject2 = paramArrayRow.OooO00o;
          if (localObject2 == localObject1)
          {
            localObject1 = paramArrayRow.OooOo0O((SolverVariable)localObject1);
            if (localObject1 != null)
            {
              localObject2 = OooOo;
              if (localObject2 != null)
              {
                long l3 = ((Metrics)localObject2).OooOO0 + l1;
                ((Metrics)localObject2).OooOO0 = l3;
              }
              paramArrayRow.OooOo((SolverVariable)localObject1);
            }
          }
          bool1 = paramArrayRow.OooO0o;
          if (!bool1)
          {
            localObject1 = paramArrayRow.OooO00o;
            ((SolverVariable)localObject1).OooO(this, paramArrayRow);
          }
          bool1 = OooOo0O;
          if (bool1) {
            localObject1 = this.OooOOO.OooO00o;
          } else {
            localObject1 = this.OooOOO.OooO0O0;
          }
          ((Pools.Pool)localObject1).OooO00o(paramArrayRow);
          int n = this.OooOO0o - i;
          this.OooOO0o = n;
          break label374;
        }
      }
      int j = 0;
      label374:
      boolean bool2 = paramArrayRow.OooOOoo();
      if (!bool2) {
        return;
      }
      i1 = j;
    }
    if (i1 == 0) {
      OooOO0o(paramArrayRow);
    }
  }
  
  public void OooO0o(SolverVariable paramSolverVariable, int paramInt)
  {
    boolean bool1 = OooOOoo;
    int j = -1;
    int m = 1;
    ArrayRow localArrayRow;
    Object localObject;
    if (bool1)
    {
      i = paramSolverVariable.o00Ooo0O;
      if (i == j)
      {
        float f1 = paramInt;
        paramSolverVariable.OooO0oO(this, f1);
        i = 0;
        localArrayRow = null;
        for (;;)
        {
          j = this.OooO0O0 + m;
          if (i >= j) {
            break;
          }
          localObject = this.OooOOO.OooO0Oo[i];
          if (localObject != null)
          {
            boolean bool3 = ((SolverVariable)localObject).o00o000;
            if (bool3)
            {
              int n = ((SolverVariable)localObject).o00o000O;
              int i1 = paramSolverVariable.o00Ooo0;
              if (n == i1)
              {
                float f2 = ((SolverVariable)localObject).o00o000o + f1;
                ((SolverVariable)localObject).OooO0oO(this, f2);
              }
            }
          }
          i += 1;
        }
        return;
      }
    }
    int i = paramSolverVariable.o00Ooo0O;
    if (i != j)
    {
      localObject = this.OooO0oO;
      localArrayRow = localObject[i];
      boolean bool2 = localArrayRow.OooO0o;
      if (bool2) {}
      for (;;)
      {
        float f3 = paramInt;
        localArrayRow.OooO0O0 = f3;
        return;
        localObject = localArrayRow.OooO0o0;
        int k = ((ArrayRow.ArrayRowVariables)localObject).getCurrentSize();
        if (k != 0) {
          break;
        }
        localArrayRow.OooO0o = m;
      }
      localArrayRow = OooOOo();
      localArrayRow.OooOOO0(paramSolverVariable, paramInt);
    }
    else
    {
      localArrayRow = OooOOo();
      localArrayRow.OooO(paramSolverVariable, paramInt);
    }
    OooO0Oo(localArrayRow);
  }
  
  public ArrayRow OooO0o0(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, int paramInt2)
  {
    boolean bool = OooOOoo;
    int j = 8;
    if ((bool) && (paramInt2 == j))
    {
      bool = paramSolverVariable2.o00OooO;
      if (bool)
      {
        int i = paramSolverVariable1.o00Ooo0O;
        int k = -1;
        if (i == k)
        {
          float f1 = paramSolverVariable2.o00OooO0;
          float f2 = paramInt1;
          f1 += f2;
          paramSolverVariable1.OooO0oO(this, f1);
          return null;
        }
      }
    }
    ArrayRow localArrayRow = OooOOo();
    localArrayRow.OooOOO(paramSolverVariable1, paramSolverVariable2, paramInt1);
    if (paramInt2 != j) {
      localArrayRow.OooO0Oo(this, paramInt2);
    }
    OooO0Oo(localArrayRow);
    return localArrayRow;
  }
  
  public void OooO0oO(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt, boolean paramBoolean)
  {
    ArrayRow localArrayRow = OooOOo();
    SolverVariable localSolverVariable = OooOo00();
    localSolverVariable.o00Ooo0o = 0;
    localArrayRow.OooOOOO(paramSolverVariable1, paramSolverVariable2, localSolverVariable, paramInt);
    OooO0Oo(localArrayRow);
  }
  
  public void OooO0oo(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, int paramInt2)
  {
    ArrayRow localArrayRow = OooOOo();
    SolverVariable localSolverVariable = OooOo00();
    localSolverVariable.o00Ooo0o = 0;
    localArrayRow.OooOOOO(paramSolverVariable1, paramSolverVariable2, localSolverVariable, paramInt1);
    int i = 8;
    float f1 = 1.121039E-044F;
    if (paramInt2 != i)
    {
      paramSolverVariable1 = localArrayRow.OooO0o0;
      f1 = paramSolverVariable1.OooO0oO(localSolverVariable);
      float f2 = -1.0F;
      f1 *= f2;
      i = (int)f1;
      OooOOO0(localArrayRow, i, paramInt2);
    }
    OooO0Oo(localArrayRow);
  }
  
  public void OooOO0(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, int paramInt2)
  {
    ArrayRow localArrayRow = OooOOo();
    SolverVariable localSolverVariable = OooOo00();
    localSolverVariable.o00Ooo0o = 0;
    localArrayRow.OooOOOo(paramSolverVariable1, paramSolverVariable2, localSolverVariable, paramInt1);
    int i = 8;
    float f1 = 1.121039E-044F;
    if (paramInt2 != i)
    {
      paramSolverVariable1 = localArrayRow.OooO0o0;
      f1 = paramSolverVariable1.OooO0oO(localSolverVariable);
      float f2 = -1.0F;
      f1 *= f2;
      i = (int)f1;
      OooOOO0(localArrayRow, i, paramInt2);
    }
    OooO0Oo(localArrayRow);
  }
  
  public void OooOO0O(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, float paramFloat, int paramInt)
  {
    ArrayRow localArrayRow = OooOOo();
    localArrayRow.OooOO0O(paramSolverVariable1, paramSolverVariable2, paramSolverVariable3, paramSolverVariable4, paramFloat);
    int i = 8;
    if (paramInt != i) {
      localArrayRow.OooO0Oo(this, paramInt);
    }
    OooO0Oo(localArrayRow);
  }
  
  public final void OooOO0o(ArrayRow paramArrayRow)
  {
    int i = OooOo00;
    float f1;
    if (i != 0)
    {
      i = paramArrayRow.OooO0o;
      if (i != 0)
      {
        localObject1 = paramArrayRow.OooO00o;
        f1 = paramArrayRow.OooO0O0;
        ((SolverVariable)localObject1).OooO0oO(this, f1);
        break label83;
      }
    }
    Object localObject1 = this.OooO0oO;
    int k = this.OooOO0o;
    localObject1[k] = paramArrayRow;
    localObject1 = paramArrayRow.OooO00o;
    ((SolverVariable)localObject1).o00Ooo0O = k;
    k += 1;
    this.OooOO0o = k;
    ((SolverVariable)localObject1).OooO(this, paramArrayRow);
    label83:
    boolean bool1 = OooOo00;
    if (bool1)
    {
      bool1 = this.OooO00o;
      if (bool1)
      {
        bool1 = false;
        f1 = 0.0F;
        paramArrayRow = null;
        i = 0;
        localObject1 = null;
        for (;;)
        {
          k = this.OooOO0o;
          if (i >= k) {
            break;
          }
          Object localObject2 = this.OooO0oO[i];
          Object localObject3;
          if (localObject2 == null)
          {
            localObject2 = System.out;
            localObject3 = "WTF";
            ((PrintStream)localObject2).println((String)localObject3);
          }
          localObject2 = this.OooO0oO[i];
          int j;
          if (localObject2 != null)
          {
            boolean bool2 = ((ArrayRow)localObject2).OooO0o;
            if (bool2)
            {
              localObject3 = ((ArrayRow)localObject2).OooO00o;
              float f2 = ((ArrayRow)localObject2).OooO0O0;
              ((SolverVariable)localObject3).OooO0oO(this, f2);
              bool2 = OooOo0O;
              if (bool2) {
                localObject3 = this.OooOOO.OooO00o;
              } else {
                localObject3 = this.OooOOO.OooO0O0;
              }
              ((Pools.Pool)localObject3).OooO00o(localObject2);
              localObject2 = this.OooO0oO;
              bool2 = false;
              localObject3 = null;
              localObject2[i] = null;
              int m = i + 1;
              int n = m;
              int i1;
              for (;;)
              {
                i1 = this.OooOO0o;
                if (m >= i1) {
                  break;
                }
                Object localObject4 = this.OooO0oO;
                i1 = m + -1;
                Object localObject5 = localObject4[m];
                localObject4[i1] = localObject5;
                localObject4 = localObject5.OooO00o;
                int i2 = ((SolverVariable)localObject4).o00Ooo0O;
                if (i2 == m) {
                  ((SolverVariable)localObject4).o00Ooo0O = i1;
                }
                int i3 = m + 1;
                n = m;
                m = i3;
              }
              if (n < i1)
              {
                localObject2 = this.OooO0oO;
                localObject2[n] = null;
              }
              i1 += -1;
              this.OooOO0o = i1;
              i += -1;
            }
          }
          j += 1;
        }
        this.OooO00o = false;
      }
    }
  }
  
  public final void OooOOO()
  {
    int i = 0;
    for (;;)
    {
      int j = this.OooOO0o;
      if (i >= j) {
        break;
      }
      ArrayRow localArrayRow = this.OooO0oO[i];
      SolverVariable localSolverVariable = localArrayRow.OooO00o;
      float f = localArrayRow.OooO0O0;
      localSolverVariable.o00OooO0 = f;
      i += 1;
    }
  }
  
  public void OooOOO0(ArrayRow paramArrayRow, int paramInt1, int paramInt2)
  {
    SolverVariable localSolverVariable = OooOOOO(paramInt2, null);
    paramArrayRow.OooO0o0(localSolverVariable, paramInt1);
  }
  
  public SolverVariable OooOOOO(int paramInt, String paramString)
  {
    Object localObject = OooOo;
    if (localObject != null)
    {
      long l1 = ((Metrics)localObject).OooOO0o;
      long l2 = 1L;
      l1 += l2;
      ((Metrics)localObject).OooOO0o = l1;
    }
    int i = this.OooOO0O + 1;
    int j = this.OooO0o;
    if (i >= j) {
      OooOo();
    }
    localObject = SolverVariable.Type.o00Ooo0O;
    paramString = OooO00o((SolverVariable.Type)localObject, paramString);
    i = this.OooO0O0 + 1;
    this.OooO0O0 = i;
    j = this.OooOO0O + 1;
    this.OooOO0O = j;
    paramString.o00Ooo0 = i;
    paramString.o00Ooo0o = paramInt;
    this.OooOOO.OooO0Oo[i] = paramString;
    this.OooO0Oo.OooO0OO(paramString);
    return paramString;
  }
  
  public SolverVariable OooOOOo()
  {
    Object localObject = OooOo;
    if (localObject != null)
    {
      long l1 = ((Metrics)localObject).OooOOO;
      long l2 = 1L;
      l1 += l2;
      ((Metrics)localObject).OooOOO = l1;
    }
    int i = this.OooOO0O + 1;
    int j = this.OooO0o;
    if (i >= j) {
      OooOo();
    }
    localObject = SolverVariable.Type.o00Ooo0;
    localObject = OooO00o((SolverVariable.Type)localObject, null);
    j = this.OooO0O0 + 1;
    this.OooO0O0 = j;
    int k = this.OooOO0O + 1;
    this.OooOO0O = k;
    ((SolverVariable)localObject).o00Ooo0 = j;
    this.OooOOO.OooO0Oo[j] = localObject;
    return localObject;
  }
  
  public ArrayRow OooOOo()
  {
    boolean bool = OooOo0O;
    long l1 = 1L;
    Object localObject;
    Cache localCache;
    long l2;
    if (bool)
    {
      localObject = (ArrayRow)this.OooOOO.OooO00o.OooO0O0();
      if (localObject == null)
      {
        localObject = new androidx/constraintlayout/core/LinearSystem$ValuesRow;
        localCache = this.OooOOO;
        ((LinearSystem.ValuesRow)localObject).<init>(this, localCache);
        l2 = OooOoO + l1;
        OooOoO = l2;
        break label126;
      }
    }
    else
    {
      localObject = (ArrayRow)this.OooOOO.OooO0O0.OooO0O0();
      if (localObject == null)
      {
        localObject = new androidx/constraintlayout/core/ArrayRow;
        localCache = this.OooOOO;
        ((ArrayRow)localObject).<init>(localCache);
        l2 = OooOoO0 + l1;
        OooOoO0 = l2;
        break label126;
      }
    }
    ((ArrayRow)localObject).OooOoO0();
    label126:
    SolverVariable.OooO0Oo();
    return localObject;
  }
  
  public SolverVariable OooOOo0(Object paramObject)
  {
    Object localObject1 = null;
    if (paramObject == null) {
      return null;
    }
    int i = this.OooOO0O + 1;
    int k = this.OooO0o;
    if (i >= k) {
      OooOo();
    }
    boolean bool = paramObject instanceof ConstraintAnchor;
    if (bool)
    {
      paramObject = (ConstraintAnchor)paramObject;
      localObject1 = paramObject.getSolverVariable();
      if (localObject1 == null)
      {
        localObject1 = this.OooOOO;
        paramObject.OooOO0((Cache)localObject1);
        paramObject = paramObject.getSolverVariable();
        localObject1 = paramObject;
      }
      int m = ((SolverVariable)localObject1).o00Ooo0;
      int j = -1;
      if (m != j)
      {
        k = this.OooO0O0;
        if (m <= k)
        {
          SolverVariable localSolverVariable = this.OooOOO.OooO0Oo[m];
          if (localSolverVariable != null) {
            return localObject1;
          }
        }
      }
      if (m != j) {
        ((SolverVariable)localObject1).OooO0o();
      }
      m = this.OooO0O0 + 1;
      this.OooO0O0 = m;
      j = this.OooOO0O + 1;
      this.OooOO0O = j;
      ((SolverVariable)localObject1).o00Ooo0 = m;
      Object localObject2 = SolverVariable.Type.o00OoOoo;
      ((SolverVariable)localObject1).o0O00o0 = ((SolverVariable.Type)localObject2);
      localObject2 = this.OooOOO.OooO0Oo;
      localObject2[m] = localObject1;
    }
    return localObject1;
  }
  
  public final void OooOo()
  {
    int i = this.OooO0o0 * 2;
    this.OooO0o0 = i;
    Object localObject1 = (ArrayRow[])Arrays.copyOf(this.OooO0oO, i);
    this.OooO0oO = ((ArrayRow[])localObject1);
    localObject1 = this.OooOOO;
    Object localObject2 = ((Cache)localObject1).OooO0Oo;
    int j = this.OooO0o0;
    localObject2 = (SolverVariable[])Arrays.copyOf((Object[])localObject2, j);
    ((Cache)localObject1).OooO0Oo = ((SolverVariable[])localObject2);
    i = this.OooO0o0;
    localObject2 = new boolean[i];
    this.OooOO0 = ((boolean[])localObject2);
    this.OooO0o = i;
    this.OooOOO0 = i;
    localObject2 = OooOo;
    if (localObject2 != null)
    {
      long l1 = ((Metrics)localObject2).OooO0Oo + 1L;
      ((Metrics)localObject2).OooO0Oo = l1;
      l1 = ((Metrics)localObject2).OooOOOO;
      long l2 = i;
      l1 = Math.max(l1, l2);
      ((Metrics)localObject2).OooOOOO = l1;
      localObject1 = OooOo;
      long l3 = ((Metrics)localObject1).OooOOOO;
      ((Metrics)localObject1).OooOoO0 = l3;
    }
  }
  
  public final int OooOo0(LinearSystem.Row paramRow)
  {
    LinearSystem localLinearSystem = this;
    int i = 0;
    ArrayRow localArrayRow1;
    Object localObject1;
    Object localObject2;
    float f1;
    boolean bool1;
    for (;;)
    {
      int j = localLinearSystem.OooOO0o;
      if (i >= j) {
        break;
      }
      localArrayRow1 = localLinearSystem.OooO0oO[i];
      localObject1 = localArrayRow1.OooO00o.o0O00o0;
      localObject2 = SolverVariable.Type.o00OoOoo;
      if (localObject1 != localObject2)
      {
        f1 = localArrayRow1.OooO0O0;
        bool1 = f1 < 0.0F;
        if (bool1)
        {
          i = 1;
          break label81;
        }
      }
      i += 1;
    }
    i = 0;
    label81:
    Object localObject4;
    float f3;
    int i4;
    if (i != 0)
    {
      i = 0;
      bool1 = false;
      f1 = 0.0F;
      localArrayRow1 = null;
      int k;
      while (i == 0)
      {
        localObject1 = OooOo;
        long l1 = 1L;
        if (localObject1 != null)
        {
          long l2 = ((Metrics)localObject1).OooOO0O + l1;
          ((Metrics)localObject1).OooOO0O = l2;
        }
        bool1 += true;
        float f2 = 3.4028235E+38F;
        int m = 0;
        int n = -1;
        int i1 = -1;
        int i2 = 0;
        Object localObject5;
        for (;;)
        {
          int i3 = localLinearSystem.OooOO0o;
          if (m >= i3) {
            break;
          }
          ArrayRow localArrayRow2 = localLinearSystem.OooO0oO[m];
          Object localObject3 = localArrayRow2.OooO00o.o0O00o0;
          localObject4 = SolverVariable.Type.o00OoOoo;
          if (localObject3 != localObject4)
          {
            boolean bool2 = localArrayRow2.OooO0o;
            if (!bool2)
            {
              f3 = localArrayRow2.OooO0O0;
              bool2 = f3 < 0.0F;
              if (bool2)
              {
                bool2 = OooOo0;
                int i5 = 9;
                float f4 = 1.261169E-044F;
                int i6;
                float f5;
                float f6;
                if (bool2)
                {
                  localObject4 = localArrayRow2.OooO0o0;
                  i4 = ((ArrayRow.ArrayRowVariables)localObject4).getCurrentSize();
                  i6 = 0;
                  localObject5 = null;
                  while (i6 < i4)
                  {
                    localObject2 = localArrayRow2.OooO0o0.getVariable(i6);
                    ArrayRow.ArrayRowVariables localArrayRowVariables = localArrayRow2.OooO0o0;
                    f5 = localArrayRowVariables.OooO0oO((SolverVariable)localObject2);
                    boolean bool3 = f5 < 0.0F;
                    if (bool3)
                    {
                      int i7 = 0;
                      f6 = 0.0F;
                      localObject1 = null;
                      while (i7 < i5)
                      {
                        localObject3 = ((SolverVariable)localObject2).o00OooOO;
                        f4 = localObject3[i7] / f5;
                        boolean bool4 = f4 < f2;
                        if (((bool4) && (i7 == i2)) || (i7 > i2))
                        {
                          i1 = ((SolverVariable)localObject2).o00Ooo0;
                          i2 = i7;
                          n = m;
                          f2 = f4;
                        }
                        i7 += 1;
                        i5 = 9;
                        f4 = 1.261169E-044F;
                      }
                    }
                    i6 += 1;
                    l1 = 1L;
                    i5 = 9;
                    f4 = 1.261169E-044F;
                  }
                }
                i4 = 1;
                f3 = 1.4E-45F;
                for (;;)
                {
                  i6 = localLinearSystem.OooOO0O;
                  if (i4 >= i6) {
                    break;
                  }
                  localObject5 = localLinearSystem.OooOOO.OooO0Oo[i4];
                  localObject1 = localArrayRow2.OooO0o0;
                  f6 = ((ArrayRow.ArrayRowVariables)localObject1).OooO0oO((SolverVariable)localObject5);
                  int i8 = f6 < 0.0F;
                  int i10;
                  if (i8 <= 0)
                  {
                    i10 = 9;
                    f5 = 1.261169E-044F;
                  }
                  else
                  {
                    i8 = 0;
                    localObject2 = null;
                    i10 = 9;
                    f5 = 1.261169E-044F;
                    while (i8 < i10)
                    {
                      localObject3 = ((SolverVariable)localObject5).o00OooOO;
                      f4 = localObject3[i8] / f6;
                      boolean bool5 = f4 < f2;
                      if (((bool5) && (i8 == i2)) || (i8 > i2))
                      {
                        i1 = i4;
                        i2 = i8;
                        n = m;
                        f2 = f4;
                      }
                      int i9;
                      i8 += 1;
                    }
                  }
                  i4 += 1;
                }
              }
            }
          }
          m += 1;
          l1 = 1L;
        }
        i4 = -1;
        f3 = 0.0F / 0.0F;
        if (n != i4)
        {
          localObject5 = localLinearSystem.OooO0oO[n];
          localObject1 = ((ArrayRow)localObject5).OooO00o;
          ((SolverVariable)localObject1).o00Ooo0O = i4;
          localObject4 = OooOo;
          if (localObject4 != null)
          {
            long l3 = ((Metrics)localObject4).OooOO0;
            long l4 = 1L;
            l3 += l4;
            ((Metrics)localObject4).OooOO0 = l3;
          }
          localObject4 = localLinearSystem.OooOOO.OooO0Oo[i1];
          ((ArrayRow)localObject5).OooOo((SolverVariable)localObject4);
          localObject4 = ((ArrayRow)localObject5).OooO00o;
          ((SolverVariable)localObject4).o00Ooo0O = n;
          ((SolverVariable)localObject4).OooO(localLinearSystem, (ArrayRow)localObject5);
        }
        else
        {
          i = 1;
        }
        i4 = localLinearSystem.OooOO0O / 2;
        if (k > i4) {
          i = 1;
        }
      }
      i4 = k;
    }
    else
    {
      i4 = 0;
      f3 = 0.0F;
      localObject4 = null;
    }
    return i4;
  }
  
  public SolverVariable OooOo00()
  {
    Object localObject = OooOo;
    if (localObject != null)
    {
      long l1 = ((Metrics)localObject).OooOOO0;
      long l2 = 1L;
      l1 += l2;
      ((Metrics)localObject).OooOOO0 = l1;
    }
    int i = this.OooOO0O + 1;
    int j = this.OooO0o;
    if (i >= j) {
      OooOo();
    }
    localObject = SolverVariable.Type.o00Ooo0;
    localObject = OooO00o((SolverVariable.Type)localObject, null);
    j = this.OooO0O0 + 1;
    this.OooO0O0 = j;
    int k = this.OooOO0O + 1;
    this.OooOO0O = k;
    ((SolverVariable)localObject).o00Ooo0 = j;
    this.OooOOO.OooO0Oo[j] = localObject;
    return localObject;
  }
  
  public void OooOo0O(Metrics paramMetrics)
  {
    OooOo = paramMetrics;
  }
  
  public int OooOo0o(Object paramObject)
  {
    paramObject = ((ConstraintAnchor)paramObject).getSolverVariable();
    if (paramObject != null) {
      return (int)(paramObject.o00OooO0 + 0.5F);
    }
    return 0;
  }
  
  public void OooOoO(LinearSystem.Row paramRow)
  {
    Metrics localMetrics = OooOo;
    if (localMetrics != null)
    {
      long l1 = localMetrics.OooOo00 + 1L;
      localMetrics.OooOo00 = l1;
      l1 = localMetrics.OooOo0;
      long l2 = this.OooOO0O;
      l1 = Math.max(l1, l2);
      localMetrics.OooOo0 = l1;
      localMetrics = OooOo;
      l1 = localMetrics.OooOo0O;
      int i = this.OooOO0o;
      l2 = i;
      l1 = Math.max(l1, l2);
      localMetrics.OooOo0O = l1;
    }
    OooOo0(paramRow);
    OooOoOO(paramRow, false);
    OooOOO();
  }
  
  public void OooOoO0()
  {
    Object localObject = OooOo;
    long l1 = 1L;
    long l2;
    if (localObject != null)
    {
      l2 = ((Metrics)localObject).OooO0o0 + l1;
      ((Metrics)localObject).OooO0o0 = l2;
    }
    localObject = this.OooO0Oo;
    boolean bool1 = ((LinearSystem.Row)localObject).isEmpty();
    if (bool1)
    {
      OooOOO();
      return;
    }
    bool1 = this.OooO0oo;
    if (!bool1)
    {
      bool1 = this.OooO;
      if (bool1) {}
    }
    label164:
    do
    {
      localObject = this.OooO0Oo;
      OooOoO((LinearSystem.Row)localObject);
      break;
      localObject = OooOo;
      if (localObject != null)
      {
        l2 = ((Metrics)localObject).OooOOo0 + l1;
        ((Metrics)localObject).OooOOo0 = l2;
      }
      bool1 = false;
      localObject = null;
      int i = 0;
      for (;;)
      {
        int j = this.OooOO0o;
        if (i >= j) {
          break;
        }
        ArrayRow localArrayRow = this.OooO0oO[i];
        boolean bool2 = localArrayRow.OooO0o;
        if (!bool2) {
          break label164;
        }
        i += 1;
      }
      bool1 = true;
    } while (!bool1);
    localObject = OooOo;
    if (localObject != null)
    {
      l2 = ((Metrics)localObject).OooOOOo + l1;
      ((Metrics)localObject).OooOOOo = l2;
    }
    OooOOO();
  }
  
  public final int OooOoOO(LinearSystem.Row paramRow, boolean paramBoolean)
  {
    Metrics localMetrics1 = OooOo;
    long l1 = 1L;
    if (localMetrics1 != null)
    {
      long l2 = localMetrics1.OooO0oo + l1;
      localMetrics1.OooO0oo = l2;
    }
    localMetrics1 = null;
    int i = 0;
    for (;;)
    {
      j = this.OooOO0O;
      if (i >= j) {
        break;
      }
      arrayOfBoolean = this.OooOO0;
      arrayOfBoolean[i] = false;
      i += 1;
    }
    i = 0;
    int j = 0;
    boolean[] arrayOfBoolean = null;
    while (i == 0)
    {
      Object localObject1 = OooOo;
      if (localObject1 != null)
      {
        long l3 = ((Metrics)localObject1).OooO + l1;
        ((Metrics)localObject1).OooO = l3;
      }
      j += 1;
      int k = this.OooOO0O * 2;
      if (j >= k) {
        return j;
      }
      localObject1 = paramRow.getKey();
      int m = 1;
      Object localObject2;
      int n;
      if (localObject1 != null)
      {
        localObject1 = this.OooOO0;
        localObject2 = paramRow.getKey();
        n = ((SolverVariable)localObject2).o00Ooo0;
        localObject1[n] = m;
      }
      localObject1 = this.OooOO0;
      localObject1 = paramRow.OooO0O0(this, (boolean[])localObject1);
      int i1;
      int i2;
      if (localObject1 != null)
      {
        localObject2 = this.OooOO0;
        i1 = ((SolverVariable)localObject1).o00Ooo0;
        i2 = localObject2[i1];
        if (i2 != 0) {
          return j;
        }
        localObject2[i1] = m;
      }
      if (localObject1 != null)
      {
        m = -1;
        n = 2139095039;
        float f1 = 3.4028235E+38F;
        i1 = 0;
        SolverVariable localSolverVariable = null;
        i2 = m;
        for (;;)
        {
          int i3 = this.OooOO0o;
          if (i1 >= i3) {
            break;
          }
          ArrayRow localArrayRow = this.OooO0oO[i1];
          Object localObject3 = localArrayRow.OooO00o.o0O00o0;
          SolverVariable.Type localType = SolverVariable.Type.o00OoOoo;
          if (localObject3 != localType)
          {
            boolean bool1 = localArrayRow.OooO0o;
            if (!bool1)
            {
              bool1 = localArrayRow.OooOo00((SolverVariable)localObject1);
              if (bool1)
              {
                localObject3 = localArrayRow.OooO0o0;
                float f2 = ((ArrayRow.ArrayRowVariables)localObject3).OooO0oO((SolverVariable)localObject1);
                localType = null;
                boolean bool2 = f2 < 0.0F;
                if (bool2)
                {
                  float f3 = -localArrayRow.OooO0O0 / f2;
                  bool1 = f3 < f1;
                  if (bool1)
                  {
                    i2 = i1;
                    f1 = f3;
                  }
                }
              }
            }
          }
          i1 += 1;
        }
        if (i2 > m)
        {
          localObject2 = this.OooO0oO[i2];
          localSolverVariable = ((ArrayRow)localObject2).OooO00o;
          localSolverVariable.o00Ooo0O = m;
          Metrics localMetrics2 = OooOo;
          if (localMetrics2 != null)
          {
            long l4 = localMetrics2.OooOO0 + l1;
            localMetrics2.OooOO0 = l4;
          }
          ((ArrayRow)localObject2).OooOo((SolverVariable)localObject1);
          localObject1 = ((ArrayRow)localObject2).OooO00o;
          ((SolverVariable)localObject1).o00Ooo0O = i2;
          ((SolverVariable)localObject1).OooO(this, (ArrayRow)localObject2);
        }
      }
      else
      {
        i = m;
      }
    }
    return j;
  }
  
  public void OooOoo()
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = 0;
    Object localObject2 = null;
    for (;;)
    {
      localObject3 = this.OooOOO;
      SolverVariable[] arrayOfSolverVariable = ((Cache)localObject3).OooO0Oo;
      int j = arrayOfSolverVariable.length;
      if (i >= j) {
        break;
      }
      localObject3 = arrayOfSolverVariable[i];
      if (localObject3 != null) {
        ((SolverVariable)localObject3).OooO0o();
      }
      i += 1;
    }
    localObject2 = ((Cache)localObject3).OooO0OO;
    Object localObject3 = this.OooOOOO;
    int k = this.OooOOOo;
    ((Pools.Pool)localObject2).OooO0OO((Object[])localObject3, k);
    this.OooOOOo = 0;
    localObject2 = this.OooOOO.OooO0Oo;
    int m = 0;
    localObject3 = null;
    Arrays.fill((Object[])localObject2, null);
    localObject2 = this.OooO0OO;
    if (localObject2 != null) {
      ((HashMap)localObject2).clear();
    }
    this.OooO0O0 = 0;
    this.OooO0Oo.clear();
    this.OooOO0O = 1;
    i = 0;
    localObject2 = null;
    for (;;)
    {
      m = this.OooOO0o;
      if (i >= m) {
        break;
      }
      localObject3 = this.OooO0oO[i];
      if (localObject3 != null) {
        ((ArrayRow)localObject3).OooO0OO = false;
      }
      i += 1;
    }
    OooOoo0();
    this.OooOO0o = 0;
    bool = OooOo0O;
    if (bool)
    {
      localObject1 = new androidx/constraintlayout/core/LinearSystem$ValuesRow;
      localObject2 = this.OooOOO;
      ((LinearSystem.ValuesRow)localObject1).<init>(this, (Cache)localObject2);
    }
    else
    {
      localObject1 = new androidx/constraintlayout/core/ArrayRow;
      localObject2 = this.OooOOO;
      ((ArrayRow)localObject1).<init>((Cache)localObject2);
    }
    this.OooOOo0 = ((LinearSystem.Row)localObject1);
  }
  
  public final void OooOoo0()
  {
    boolean bool = OooOo0O;
    int j = 0;
    int i;
    Object localObject;
    Pools.Pool localPool;
    if (bool) {
      for (;;)
      {
        i = this.OooOO0o;
        if (j >= i) {
          break;
        }
        localObject = this.OooO0oO[j];
        if (localObject != null)
        {
          localPool = this.OooOOO.OooO00o;
          localPool.OooO00o(localObject);
        }
        localObject = this.OooO0oO;
        localObject[j] = null;
        j += 1;
      }
    }
    for (;;)
    {
      i = this.OooOO0o;
      if (j >= i) {
        break;
      }
      localObject = this.OooO0oO[j];
      if (localObject != null)
      {
        localPool = this.OooOOO.OooO0O0;
        localPool.OooO00o(localObject);
      }
      localObject = this.OooO0oO;
      localObject[j] = null;
      j += 1;
    }
  }
  
  public Cache getCache()
  {
    return this.OooOOO;
  }
  
  public LinearSystem.Row getGoal()
  {
    return this.OooO0Oo;
  }
  
  public int getMemoryUsed()
  {
    int i = 0;
    int j = 0;
    for (;;)
    {
      int k = this.OooOO0o;
      if (i >= k) {
        break;
      }
      ArrayRow localArrayRow = this.OooO0oO[i];
      if (localArrayRow != null)
      {
        k = localArrayRow.OooOoO();
        j += k;
      }
      i += 1;
    }
    return j;
  }
  
  public int getNumEquations()
  {
    return this.OooOO0o;
  }
  
  public int getNumVariables()
  {
    return this.OooO0O0;
  }
  
  public ArrayRow getRow(int paramInt)
  {
    return this.OooO0oO[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.LinearSystem
 * JD-Core Version:    0.7.0.1
 */