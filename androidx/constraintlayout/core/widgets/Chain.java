package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

public class Chain
{
  public static void OooO00o(ConstraintWidgetContainer paramConstraintWidgetContainer, LinearSystem paramLinearSystem, int paramInt1, int paramInt2, ChainHead paramChainHead)
  {
    Object localObject1 = paramConstraintWidgetContainer;
    LinearSystem localLinearSystem = paramLinearSystem;
    int i = paramInt1;
    Object localObject2 = paramChainHead;
    Object localObject3 = paramChainHead.OooO00o;
    ConstraintWidget localConstraintWidget1 = paramChainHead.OooO0OO;
    ConstraintWidget localConstraintWidget2 = paramChainHead.OooO0O0;
    ConstraintWidget localConstraintWidget3 = paramChainHead.OooO0Oo;
    Object localObject4 = paramChainHead.OooO0o0;
    float f1 = paramChainHead.OooOO0O;
    Object localObject5 = paramConstraintWidgetContainer.Ooooo00[paramInt1];
    Object localObject6 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
    int j = 1;
    float f2 = 1.4E-45F;
    int m;
    float f3;
    if (localObject5 == localObject6)
    {
      m = j;
      f3 = f2;
    }
    else
    {
      m = 0;
      f3 = 0.0F;
      localObject5 = null;
    }
    int n = 2;
    float f4 = 2.802597E-045F;
    if (i == 0)
    {
      i1 = ((ConstraintWidget)localObject4).o00000OO;
      if (i1 == 0)
      {
        i2 = j;
        f5 = f2;
      }
      else
      {
        i2 = 0;
        f5 = 0.0F;
        localObject7 = null;
      }
      if (i1 == j) {
        i3 = j;
      } else {
        i3 = 0;
      }
      if (i1 != n) {
        break label240;
      }
    }
    else
    {
      i1 = ((ConstraintWidget)localObject4).o00000Oo;
      if (i1 == 0)
      {
        i2 = j;
        f5 = f2;
      }
      else
      {
        i2 = 0;
        f5 = 0.0F;
        localObject7 = null;
      }
      if (i1 == j) {
        i3 = j;
      } else {
        i3 = 0;
      }
      if (i1 != n) {
        break label240;
      }
    }
    n = j;
    f4 = f2;
    break label249;
    label240:
    n = 0;
    f4 = 0.0F;
    localObject6 = null;
    label249:
    int i4 = i3;
    int i1 = 0;
    float f6 = 0.0F;
    Object localObject8 = null;
    int i3 = i2;
    Object localObject7 = localObject3;
    Object localObject9;
    Object localObject10;
    float f7;
    Object localObject11;
    Object localObject12;
    label396:
    int i11;
    float f10;
    int i10;
    label616:
    int i12;
    float f11;
    int i13;
    int i15;
    float f12;
    for (;;)
    {
      localObject9 = null;
      if (i1 != 0) {
        break;
      }
      localObject10 = localObject7.OoooOo0[paramInt2];
      int i5;
      if (n != 0)
      {
        i5 = 1;
        f7 = 1.4E-45F;
      }
      else
      {
        i5 = 4;
        f7 = 5.605194E-045F;
      }
      int i7 = ((ConstraintAnchor)localObject10).getMargin();
      localObject11 = localObject7.Ooooo00[i];
      f8 = f1;
      localObject12 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
      if (localObject11 == localObject12)
      {
        localObject11 = ((ConstraintWidget)localObject7).OooOoO0;
        j = localObject11[i];
        if (j == 0)
        {
          i8 = i1;
          f9 = f6;
          j = 1;
          f2 = 1.4E-45F;
          break label396;
        }
      }
      int i8 = i1;
      float f9 = f6;
      j = 0;
      f2 = 0.0F;
      localObject11 = null;
      localObject8 = ((ConstraintAnchor)localObject10).OooO0o;
      if ((localObject8 != null) && (localObject7 != localObject3))
      {
        i1 = ((ConstraintAnchor)localObject8).getMargin();
        i7 += i1;
      }
      i1 = i7;
      if ((n != 0) && (localObject7 != localObject3) && (localObject7 != localConstraintWidget2))
      {
        localObject13 = localObject4;
        i5 = 8;
        f7 = 1.121039E-044F;
      }
      else
      {
        localObject13 = localObject4;
      }
      localObject4 = ((ConstraintAnchor)localObject10).OooO0o;
      localObject14 = localObject3;
      if (localObject4 != null)
      {
        if (localObject7 == localConstraintWidget2)
        {
          localObject3 = ((ConstraintAnchor)localObject10).OooO;
          localObject4 = ((ConstraintAnchor)localObject4).OooO;
          int i9 = 6;
          localLinearSystem.OooO0oo((SolverVariable)localObject3, (SolverVariable)localObject4, i1, i9);
        }
        else
        {
          localObject2 = ((ConstraintAnchor)localObject10).OooO;
          localObject4 = ((ConstraintAnchor)localObject4).OooO;
          i11 = 8;
          f10 = 1.121039E-044F;
          localLinearSystem.OooO0oo((SolverVariable)localObject2, (SolverVariable)localObject4, i1, i11);
        }
        if ((j != 0) && (n == 0))
        {
          i5 = 5;
          f7 = 7.006492E-045F;
        }
        if ((localObject7 == localConstraintWidget2) && (n != 0))
        {
          boolean bool3 = ((ConstraintWidget)localObject7).isInBarrier(i);
          if (bool3)
          {
            i10 = 5;
            break label616;
          }
        }
        i10 = i5;
        localObject4 = ((ConstraintAnchor)localObject10).OooO;
        localObject10 = ((ConstraintAnchor)localObject10).OooO0o.OooO;
        localLinearSystem.OooO0o0((SolverVariable)localObject4, (SolverVariable)localObject10, i1, i10);
      }
      if (m != 0)
      {
        i10 = ((ConstraintWidget)localObject7).getVisibility();
        i12 = 8;
        f11 = 1.121039E-044F;
        if (i10 != i12)
        {
          localObject2 = localObject7.Ooooo00[i];
          if (localObject2 == localObject12)
          {
            localObject2 = ((ConstraintWidget)localObject7).OoooOo0;
            i12 = paramInt2 + 1;
            localObject4 = localObject2[i12].OooO;
            localObject2 = localObject2[paramInt2].OooO;
            i13 = 5;
            f1 = 7.006492E-045F;
            i15 = 0;
            f12 = 0.0F;
            localObject10 = null;
            localLinearSystem.OooO0oo((SolverVariable)localObject4, (SolverVariable)localObject2, 0, i13);
            break label762;
          }
        }
        i15 = 0;
        f12 = 0.0F;
        localObject10 = null;
        label762:
        localObject2 = localObject7.OoooOo0[paramInt2].OooO;
        localObject4 = localObject1.OoooOo0[paramInt2].OooO;
        i13 = 8;
        f1 = 1.121039E-044F;
        localLinearSystem.OooO0oo((SolverVariable)localObject2, (SolverVariable)localObject4, 0, i13);
      }
      localObject2 = ((ConstraintWidget)localObject7).OoooOo0;
      i12 = paramInt2 + 1;
      localObject2 = localObject2[i12].OooO0o;
      if (localObject2 != null)
      {
        localObject2 = ((ConstraintAnchor)localObject2).OooO0Oo;
        localObject4 = localObject2.OoooOo0[paramInt2].OooO0o;
        if (localObject4 != null)
        {
          localObject4 = ((ConstraintAnchor)localObject4).OooO0Oo;
          if (localObject4 == localObject7) {
            localObject9 = localObject2;
          }
        }
      }
      if (localObject9 != null)
      {
        localObject7 = localObject9;
        i1 = i8;
        f6 = f9;
      }
      else
      {
        i1 = 1;
        f6 = 1.4E-45F;
      }
      localObject2 = paramChainHead;
      localObject4 = localObject13;
      f1 = f8;
      localObject3 = localObject14;
    }
    Object localObject13 = localObject4;
    float f8 = f1;
    Object localObject14 = localObject3;
    if (localConstraintWidget3 != null)
    {
      localObject2 = localConstraintWidget1.OoooOo0;
      i12 = paramInt2 + 1;
      localObject2 = localObject2[i12].OooO0o;
      if (localObject2 != null)
      {
        localObject2 = localConstraintWidget3.OoooOo0[i12];
        localObject12 = localConstraintWidget3.Ooooo00[i];
        localObject10 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
        if (localObject12 == localObject10)
        {
          localObject12 = localConstraintWidget3.OooOoO0;
          i13 = localObject12[i];
          if (i13 == 0)
          {
            i13 = 1;
            f1 = 1.4E-45F;
            break label1038;
          }
        }
        i13 = 0;
        f1 = 0.0F;
        localObject12 = null;
        label1038:
        if ((i13 != 0) && (n == 0))
        {
          localObject12 = ((ConstraintAnchor)localObject2).OooO0o;
          localObject10 = ((ConstraintAnchor)localObject12).OooO0Oo;
          if (localObject10 == localObject1)
          {
            localObject10 = ((ConstraintAnchor)localObject2).OooO;
            localObject12 = ((ConstraintAnchor)localObject12).OooO;
            i1 = -((ConstraintAnchor)localObject2).getMargin();
            i2 = 5;
            f5 = 7.006492E-045F;
            localLinearSystem.OooO0o0((SolverVariable)localObject10, (SolverVariable)localObject12, i1, i2);
            break label1191;
          }
        }
        i2 = 5;
        f5 = 7.006492E-045F;
        if (n != 0)
        {
          localObject12 = ((ConstraintAnchor)localObject2).OooO0o;
          localObject10 = ((ConstraintAnchor)localObject12).OooO0Oo;
          if (localObject10 == localObject1)
          {
            localObject10 = ((ConstraintAnchor)localObject2).OooO;
            localObject12 = ((ConstraintAnchor)localObject12).OooO;
            i1 = -((ConstraintAnchor)localObject2).getMargin();
            i11 = 4;
            f10 = 5.605194E-045F;
            localLinearSystem.OooO0o0((SolverVariable)localObject10, (SolverVariable)localObject12, i1, i11);
          }
        }
        label1191:
        localObject12 = ((ConstraintAnchor)localObject2).OooO;
        localObject10 = localConstraintWidget1.OoooOo0;
        localObject4 = localObject10[i12].OooO0o.OooO;
        i10 = -((ConstraintAnchor)localObject2).getMargin();
        i15 = 6;
        f12 = 8.407791E-045F;
        localLinearSystem.OooOO0((SolverVariable)localObject12, (SolverVariable)localObject4, i10, i15);
        break label1257;
      }
    }
    int i2 = 5;
    float f5 = 7.006492E-045F;
    label1257:
    if (m != 0)
    {
      localObject1 = ((ConstraintWidget)localObject1).OoooOo0;
      i10 = paramInt2 + 1;
      localObject1 = localObject1[i10].OooO;
      localObject2 = localConstraintWidget1.OoooOo0[i10];
      localObject4 = ((ConstraintAnchor)localObject2).OooO;
      i10 = ((ConstraintAnchor)localObject2).getMargin();
      i13 = 8;
      f1 = 1.121039E-044F;
      localLinearSystem.OooO0oo((SolverVariable)localObject1, (SolverVariable)localObject4, i10, i13);
    }
    localObject1 = paramChainHead;
    localObject2 = paramChainHead.OooO0oo;
    int i14;
    label1409:
    int k;
    label1665:
    int i17;
    if (localObject2 != null)
    {
      i12 = ((ArrayList)localObject2).size();
      i13 = 1;
      f1 = 1.4E-45F;
      if (i12 > i13)
      {
        boolean bool4 = paramChainHead.OooOOo;
        if (bool4)
        {
          bool4 = paramChainHead.OooOo00;
          if (!bool4)
          {
            i14 = paramChainHead.OooOO0;
            f1 = i14;
            break label1409;
          }
        }
        f1 = f8;
        m = 0;
        f3 = 0.0F;
        localObject5 = null;
        float f13 = 0.0F;
        i1 = 0;
        localObject8 = null;
        f6 = 0.0F;
        i15 = 0;
        f12 = 0.0F;
        localObject10 = null;
        while (i15 < i12)
        {
          localObject3 = (ConstraintWidget)((ArrayList)localObject2).get(i15);
          localObject11 = ((ConstraintWidget)localObject3).o00000oO;
          f2 = localObject11[i];
          boolean bool5 = f2 < 0.0F;
          if (bool5)
          {
            boolean bool1 = ((ChainHead)localObject1).OooOo00;
            if (bool1)
            {
              localObject3 = ((ConstraintWidget)localObject3).OoooOo0;
              k = paramInt2 + 1;
              localObject11 = localObject3[k].OooO;
              localObject3 = localObject3[paramInt2].OooO;
              m = 0;
              f3 = 0.0F;
              localObject5 = null;
              localLinearSystem.OooO0o0((SolverVariable)localObject11, (SolverVariable)localObject3, 0, 4);
              i2 = 0;
              localObject7 = null;
              f5 = 0.0F;
              break label1665;
            }
            i2 = 4;
            f5 = 5.605194E-045F;
            k = 1065353216;
            f2 = 1.0F;
            m = 0;
            f3 = 0.0F;
            localObject5 = null;
          }
          else
          {
            i2 = 4;
            f5 = 5.605194E-045F;
          }
          boolean bool2 = f2 < 0.0F;
          Object localObject15;
          if (!bool2)
          {
            localObject3 = ((ConstraintWidget)localObject3).OoooOo0;
            k = paramInt2 + 1;
            localObject11 = localObject3[k].OooO;
            localObject3 = localObject3[paramInt2].OooO;
            m = 8;
            f3 = 1.121039E-044F;
            i2 = 0;
            f5 = 0.0F;
            localObject7 = null;
            localLinearSystem.OooO0o0((SolverVariable)localObject11, (SolverVariable)localObject3, 0, m);
            localObject15 = localObject2;
            i17 = i12;
          }
          else
          {
            i2 = 0;
            f5 = 0.0F;
            localObject7 = null;
            if (localObject8 != null)
            {
              localObject5 = ((ConstraintWidget)localObject8).OoooOo0;
              localObject8 = localObject5[paramInt2].OooO;
              i17 = paramInt2 + 1;
              localObject5 = localObject5[i17].OooO;
              localObject7 = ((ConstraintWidget)localObject3).OoooOo0;
              localObject15 = localObject2;
              localObject2 = localObject7[paramInt2].OooO;
              localObject7 = localObject7[i17].OooO;
              i17 = i12;
              localObject4 = paramLinearSystem.OooOOo();
              ((ArrayRow)localObject4).OooOO0o(f13, f1, f2, (SolverVariable)localObject8, (SolverVariable)localObject5, (SolverVariable)localObject2, (SolverVariable)localObject7);
              localLinearSystem.OooO0Oo((ArrayRow)localObject4);
            }
            else
            {
              localObject15 = localObject2;
              i17 = i12;
            }
            localObject8 = localObject3;
            f13 = f2;
          }
          i15 += 1;
          i12 = i17;
          localObject2 = localObject15;
          m = 0;
          f3 = 0.0F;
          localObject5 = null;
          i2 = 5;
          f5 = 7.006492E-045F;
        }
      }
    }
    float f14;
    label2158:
    label2800:
    SolverVariable localSolverVariable;
    if ((localConstraintWidget2 != null) && ((localConstraintWidget2 == localConstraintWidget3) || (n != 0)))
    {
      localObject3 = localObject14;
      localObject1 = localObject14.OoooOo0[paramInt2];
      localObject2 = localConstraintWidget1.OoooOo0;
      i12 = paramInt2 + 1;
      localObject2 = localObject2[i12];
      localObject1 = ((ConstraintAnchor)localObject1).OooO0o;
      if (localObject1 != null)
      {
        localObject1 = ((ConstraintAnchor)localObject1).OooO;
        localObject12 = localObject1;
      }
      else
      {
        i14 = 0;
        localObject12 = null;
        f1 = 0.0F;
      }
      localObject1 = ((ConstraintAnchor)localObject2).OooO0o;
      if (localObject1 != null)
      {
        localObject1 = ((ConstraintAnchor)localObject1).OooO;
        localObject6 = localObject1;
      }
      else
      {
        n = 0;
        localObject6 = null;
        f4 = 0.0F;
      }
      localObject1 = localConstraintWidget2.OoooOo0[paramInt2];
      if (localConstraintWidget3 != null) {
        localObject2 = localConstraintWidget3.OoooOo0[i12];
      }
      if ((localObject12 != null) && (localObject6 != null))
      {
        localObject4 = localObject13;
        if (i == 0) {
          f11 = localObject13.o00ooo;
        } else {
          f11 = localObject13.oo000o;
        }
        f3 = f11;
        i15 = ((ConstraintAnchor)localObject1).getMargin();
        i1 = ((ConstraintAnchor)localObject2).getMargin();
        localObject4 = ((ConstraintAnchor)localObject1).OooO;
        localObject7 = ((ConstraintAnchor)localObject2).OooO;
        i = 7;
        f14 = 9.809089E-045F;
        localObject1 = paramLinearSystem;
        localObject2 = localObject4;
        localObject4 = localObject12;
        i14 = i15;
        localObject10 = localObject7;
        i2 = i;
        f5 = f14;
        paramLinearSystem.OooO0OO((SolverVariable)localObject2, (SolverVariable)localObject12, i15, f11, (SolverVariable)localObject6, (SolverVariable)localObject7, i1, i);
      }
    }
    else
    {
      localObject3 = localObject14;
      int i18;
      int i19;
      if ((i3 != 0) && (localConstraintWidget2 != null))
      {
        i10 = ((ChainHead)localObject1).OooOO0;
        if (i10 > 0)
        {
          i18 = ((ChainHead)localObject1).OooO;
          if (i18 == i10)
          {
            i19 = 1;
            break label2158;
          }
        }
        i19 = 0;
        localObject7 = localConstraintWidget2;
        localObject11 = localConstraintWidget2;
      }
      while (localObject11 != null)
      {
        localObject1 = localObject11.o0000[i];
        for (localObject8 = localObject1; localObject8 != null; localObject8 = localObject1[i])
        {
          i18 = ((ConstraintWidget)localObject8).getVisibility();
          i15 = 8;
          f12 = 1.121039E-044F;
          if (i18 != i15) {
            break label2237;
          }
          localObject1 = ((ConstraintWidget)localObject8).o0000;
        }
        i15 = 8;
        f12 = 1.121039E-044F;
        label2237:
        if ((localObject8 == null) && (localObject11 != localConstraintWidget3)) {}
        Object localObject17;
        for (Object localObject16 = localObject8;; localObject16 = paramConstraintWidgetContainer)
        {
          localObject17 = localObject7;
          break;
          localObject1 = localObject11.OoooOo0[paramInt2];
          localObject2 = ((ConstraintAnchor)localObject1).OooO;
          localObject4 = ((ConstraintAnchor)localObject1).OooO0o;
          if (localObject4 != null)
          {
            localObject4 = ((ConstraintAnchor)localObject4).OooO;
          }
          else
          {
            i12 = 0;
            localObject4 = null;
            f11 = 0.0F;
          }
          if (localObject7 != localObject11)
          {
            localObject4 = ((ConstraintWidget)localObject7).OoooOo0;
            i14 = paramInt2 + 1;
            localObject4 = localObject4[i14];
          }
          do
          {
            localObject4 = ((ConstraintAnchor)localObject4).OooO;
            break;
            if (localObject11 != localConstraintWidget2) {
              break;
            }
            localObject4 = localObject3.OoooOo0[paramInt2].OooO0o;
          } while (localObject4 != null);
          i12 = 0;
          localObject4 = null;
          f11 = 0.0F;
          i18 = ((ConstraintAnchor)localObject1).getMargin();
          localObject12 = ((ConstraintWidget)localObject11).OoooOo0;
          m = paramInt2 + 1;
          localObject12 = localObject12[m];
          i14 = ((ConstraintAnchor)localObject12).getMargin();
          if (localObject8 != null) {
            localObject6 = localObject8.OoooOo0[paramInt2];
          }
          do
          {
            localObject10 = ((ConstraintAnchor)localObject6).OooO;
            paramConstraintWidgetContainer = (ConstraintWidgetContainer)localObject8;
            break;
            localObject6 = localConstraintWidget1.OoooOo0[m].OooO0o;
          } while (localObject6 != null);
          paramConstraintWidgetContainer = (ConstraintWidgetContainer)localObject8;
          i15 = 0;
          localObject10 = null;
          f12 = 0.0F;
          localObject8 = localObject11.OoooOo0[m].OooO;
          if (localObject6 != null)
          {
            n = ((ConstraintAnchor)localObject6).getMargin();
            i14 += n;
          }
          localObject6 = localObject7.OoooOo0[m];
          n = ((ConstraintAnchor)localObject6).getMargin();
          i18 += n;
          if ((localObject2 != null) && (localObject4 != null) && (localObject10 != null) && (localObject8 != null))
          {
            if (localObject11 == localConstraintWidget2)
            {
              localObject1 = localConstraintWidget2.OoooOo0[paramInt2];
              i18 = ((ConstraintAnchor)localObject1).getMargin();
            }
            n = i18;
            if (localObject11 == localConstraintWidget3)
            {
              localObject1 = localConstraintWidget3.OoooOo0[m];
              i18 = ((ConstraintAnchor)localObject1).getMargin();
              i17 = i18;
            }
            else
            {
              i17 = i14;
            }
            int i6;
            if (i19 != 0)
            {
              i6 = 8;
              f7 = 1.121039E-044F;
            }
            else
            {
              i6 = 5;
              f7 = 7.006492E-045F;
            }
            m = 1056964608;
            f3 = 0.5F;
            localObject1 = paramLinearSystem;
            i14 = n;
            localObject6 = localObject10;
            localObject10 = localObject8;
            localObject16 = paramConstraintWidgetContainer;
            i1 = i17;
            localObject17 = localObject7;
            i2 = i6;
            f5 = f7;
            paramLinearSystem.OooO0OO((SolverVariable)localObject2, (SolverVariable)localObject4, n, f3, (SolverVariable)localObject6, (SolverVariable)localObject8, i17, i6);
            break;
          }
        }
        i18 = ((ConstraintWidget)localObject11).getVisibility();
        i2 = 8;
        f5 = 1.121039E-044F;
        if (i18 == i2) {
          localObject11 = localObject17;
        }
        localObject7 = localObject11;
        localObject11 = localObject16;
        continue;
        i2 = 8;
        f5 = 1.121039E-044F;
        if ((i4 != 0) && (localConstraintWidget2 != null))
        {
          i10 = ((ChainHead)localObject1).OooOO0;
          if (i10 > 0)
          {
            i18 = ((ChainHead)localObject1).OooO;
            if (i18 == i10)
            {
              i19 = 1;
              break label2800;
            }
          }
          i19 = 0;
          localObject8 = localConstraintWidget2;
          localObject11 = localConstraintWidget2;
          while (localObject11 != null)
          {
            for (localObject1 = localObject11.o0000[i]; localObject1 != null; localObject1 = localObject1.o0000[i])
            {
              i10 = ((ConstraintWidget)localObject1).getVisibility();
              if (i10 != i2) {
                break;
              }
            }
            if ((localObject11 != localConstraintWidget2) && (localObject11 != localConstraintWidget3) && (localObject1 != null))
            {
              if (localObject1 == localConstraintWidget3)
              {
                i15 = 0;
                localObject10 = null;
                f12 = 0.0F;
              }
              else
              {
                localObject10 = localObject1;
              }
              localObject1 = localObject11.OoooOo0[paramInt2];
              localObject2 = ((ConstraintAnchor)localObject1).OooO;
              localObject4 = ((ConstraintAnchor)localObject1).OooO0o;
              if (localObject4 != null) {
                localObject4 = ((ConstraintAnchor)localObject4).OooO;
              }
              localObject4 = ((ConstraintWidget)localObject8).OoooOo0;
              i14 = paramInt2 + 1;
              localObject4 = localObject4[i14].OooO;
              i18 = ((ConstraintAnchor)localObject1).getMargin();
              localObject5 = localObject11.OoooOo0[i14];
              m = ((ConstraintAnchor)localObject5).getMargin();
              if (localObject10 != null)
              {
                localObject6 = localObject10.OoooOo0[paramInt2];
                localObject7 = ((ConstraintAnchor)localObject6).OooO;
                paramConstraintWidgetContainer = (ConstraintWidgetContainer)localObject10;
                localObject10 = ((ConstraintAnchor)localObject6).OooO0o;
                if (localObject10 != null)
                {
                  localObject10 = ((ConstraintAnchor)localObject10).OooO;
                }
                else
                {
                  i15 = 0;
                  localObject10 = null;
                  f12 = 0.0F;
                }
                Object localObject18 = localObject7;
                localObject7 = localObject10;
                localObject10 = localObject18;
              }
              else
              {
                paramConstraintWidgetContainer = (ConstraintWidgetContainer)localObject10;
                localObject6 = localConstraintWidget3.OoooOo0[paramInt2];
                if (localObject6 != null)
                {
                  localObject10 = ((ConstraintAnchor)localObject6).OooO;
                }
                else
                {
                  i15 = 0;
                  localObject10 = null;
                  f12 = 0.0F;
                }
                localObject7 = localObject11.OoooOo0[i14].OooO;
              }
              if (localObject6 != null)
              {
                n = ((ConstraintAnchor)localObject6).getMargin();
                m += n;
              }
              i17 = m;
              localObject5 = ((ConstraintWidget)localObject8).OoooOo0;
              localObject12 = localObject5[i14];
              i14 = ((ConstraintAnchor)localObject12).getMargin() + i18;
              int i16;
              float f15;
              if (i19 != 0)
              {
                i16 = 8;
                f15 = 1.121039E-044F;
              }
              else
              {
                i16 = 4;
                f15 = 5.605194E-045F;
              }
              ConstraintWidgetContainer localConstraintWidgetContainer;
              if ((localObject2 != null) && (localObject4 != null) && (localObject10 != null) && (localObject7 != null))
              {
                m = 1056964608;
                f3 = 0.5F;
                localObject1 = paramLinearSystem;
                localObject6 = localObject10;
                localConstraintWidgetContainer = paramConstraintWidgetContainer;
                localObject10 = localObject7;
                localObject13 = localObject8;
                i1 = i17;
                i = 8;
                f14 = 1.121039E-044F;
                i2 = i16;
                f5 = f15;
                paramLinearSystem.OooO0OO((SolverVariable)localObject2, (SolverVariable)localObject4, i14, f3, (SolverVariable)localObject6, (SolverVariable)localObject7, i17, i16);
              }
              else
              {
                localConstraintWidgetContainer = paramConstraintWidgetContainer;
                localObject13 = localObject8;
                i = 8;
                f14 = 1.121039E-044F;
              }
              localObject1 = localConstraintWidgetContainer;
            }
            else
            {
              localObject13 = localObject8;
              i = i2;
              f14 = f5;
            }
            i10 = ((ConstraintWidget)localObject11).getVisibility();
            if (i10 != i) {
              localObject8 = localObject11;
            } else {
              localObject8 = localObject13;
            }
            localObject11 = localObject1;
            i2 = i;
            f5 = f14;
            i = paramInt1;
          }
          localObject1 = localConstraintWidget2.OoooOo0[paramInt2];
          localObject2 = localObject3.OoooOo0[paramInt2].OooO0o;
          localObject4 = localConstraintWidget3.OoooOo0;
          i14 = paramInt2 + 1;
          localSolverVariable = localObject4[i14];
          localObject4 = localConstraintWidget1.OoooOo0[i14];
          localObject3 = ((ConstraintAnchor)localObject4).OooO0o;
          if (localObject2 != null)
          {
            if (localConstraintWidget2 != localConstraintWidget3)
            {
              localObject4 = ((ConstraintAnchor)localObject1).OooO;
              localObject2 = ((ConstraintAnchor)localObject2).OooO;
              i18 = ((ConstraintAnchor)localObject1).getMargin();
              k = 5;
              f2 = 7.006492E-045F;
              localLinearSystem.OooO0o0((SolverVariable)localObject4, (SolverVariable)localObject2, i18, k);
            }
            else
            {
              k = 5;
              f2 = 7.006492E-045F;
              if (localObject3 != null)
              {
                localObject4 = ((ConstraintAnchor)localObject1).OooO;
                localObject12 = ((ConstraintAnchor)localObject2).OooO;
                m = ((ConstraintAnchor)localObject1).getMargin();
                n = 1056964608;
                f4 = 0.5F;
                localObject10 = localSolverVariable.OooO;
                localObject8 = ((ConstraintAnchor)localObject3).OooO;
                i2 = localSolverVariable.getMargin();
                i17 = 5;
                float f16 = 7.006492E-045F;
                localObject1 = paramLinearSystem;
                localObject2 = localObject4;
                localObject4 = localObject12;
                i14 = m;
                m = n;
                f3 = f4;
                localObject6 = localObject10;
                localObject10 = localObject8;
                i1 = i2;
                i2 = i17;
                f5 = f16;
                paramLinearSystem.OooO0OO((SolverVariable)localObject2, (SolverVariable)localObject12, i14, f4, (SolverVariable)localObject6, (SolverVariable)localObject8, i1, i17);
              }
            }
          }
          else
          {
            k = 5;
            f2 = 7.006492E-045F;
          }
          if ((localObject3 != null) && (localConstraintWidget2 != localConstraintWidget3))
          {
            localObject1 = localSolverVariable.OooO;
            localObject2 = ((ConstraintAnchor)localObject3).OooO;
            i12 = -localSolverVariable.getMargin();
            localLinearSystem.OooO0o0((SolverVariable)localObject1, (SolverVariable)localObject2, i12, k);
          }
        }
      }
    }
    if (((i3 != 0) || (i4 != 0)) && (localConstraintWidget2 != null) && (localConstraintWidget2 != localConstraintWidget3))
    {
      localObject1 = localConstraintWidget2.OoooOo0;
      localObject2 = localObject1[paramInt2];
      if (localConstraintWidget3 == null) {
        localConstraintWidget3 = localConstraintWidget2;
      }
      localObject4 = localConstraintWidget3.OoooOo0;
      f1 = 1.4E-45F;
      i14 = paramInt2 + 1;
      localObject4 = localObject4[i14];
      localObject5 = ((ConstraintAnchor)localObject2).OooO0o;
      if (localObject5 != null)
      {
        localObject5 = ((ConstraintAnchor)localObject5).OooO;
      }
      else
      {
        m = 0;
        localObject5 = null;
        f3 = 0.0F;
      }
      localObject6 = ((ConstraintAnchor)localObject4).OooO0o;
      if (localObject6 != null)
      {
        localObject6 = ((ConstraintAnchor)localObject6).OooO;
      }
      else
      {
        n = 0;
        localObject6 = null;
        f4 = 0.0F;
      }
      if (localConstraintWidget1 != localConstraintWidget3)
      {
        localObject6 = localConstraintWidget1.OoooOo0[i14].OooO0o;
        if (localObject6 != null)
        {
          localObject6 = ((ConstraintAnchor)localObject6).OooO;
          localObject9 = localObject6;
        }
        localObject6 = localObject9;
      }
      if (localConstraintWidget2 == localConstraintWidget3) {
        localObject4 = localObject1[i14];
      }
      if ((localObject5 != null) && (localObject6 != null))
      {
        i15 = 1056964608;
        f12 = 0.5F;
        i1 = ((ConstraintAnchor)localObject2).getMargin();
        i2 = localConstraintWidget3.OoooOo0[i14].getMargin();
        localObject2 = ((ConstraintAnchor)localObject2).OooO;
        localSolverVariable = ((ConstraintAnchor)localObject4).OooO;
        i11 = 5;
        f10 = 7.006492E-045F;
        localObject1 = paramLinearSystem;
        localObject4 = localObject5;
        i14 = i1;
        m = i15;
        f3 = f12;
        localObject10 = localSolverVariable;
        i1 = i2;
        i2 = i11;
        f5 = f10;
        paramLinearSystem.OooO0OO((SolverVariable)localObject2, (SolverVariable)localObject5, i14, f12, (SolverVariable)localObject6, localSolverVariable, i1, i11);
      }
    }
  }
  
  public static void OooO0O0(ConstraintWidgetContainer paramConstraintWidgetContainer, LinearSystem paramLinearSystem, ArrayList paramArrayList, int paramInt)
  {
    int i = 0;
    int j;
    ChainHead[] arrayOfChainHead;
    int k;
    if (paramInt == 0)
    {
      j = paramConstraintWidgetContainer.o0000o;
      arrayOfChainHead = paramConstraintWidgetContainer.o0000oOo;
      k = 0;
    }
    else
    {
      j = paramConstraintWidgetContainer.o0000oO0;
      arrayOfChainHead = paramConstraintWidgetContainer.o0000oOO;
      k = 2;
    }
    while (i < j)
    {
      ChainHead localChainHead = arrayOfChainHead[i];
      localChainHead.OooO00o();
      if (paramArrayList != null)
      {
        ConstraintWidget localConstraintWidget = localChainHead.OooO00o;
        boolean bool = paramArrayList.contains(localConstraintWidget);
        if (!bool) {}
      }
      else
      {
        OooO00o(paramConstraintWidgetContainer, paramLinearSystem, paramInt, k, localChainHead);
      }
      i += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.Chain
 * JD-Core Version:    0.7.0.1
 */