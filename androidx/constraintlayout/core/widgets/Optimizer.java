package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;

public class Optimizer
{
  public static boolean[] OooO00o = new boolean[3];
  
  public static void OooO00o(ConstraintWidgetContainer paramConstraintWidgetContainer, LinearSystem paramLinearSystem, ConstraintWidget paramConstraintWidget)
  {
    int i = -1;
    paramConstraintWidget.OooOo00 = i;
    paramConstraintWidget.OooOo0 = i;
    Object localObject1 = paramConstraintWidgetContainer.Ooooo00;
    int j = 0;
    Object localObject2 = null;
    localObject1 = localObject1[0];
    Object localObject3 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
    int k = 2;
    if (localObject1 != localObject3)
    {
      localObject1 = paramConstraintWidget.Ooooo00[0];
      localObject2 = ConstraintWidget.DimensionBehaviour.o00Ooo0O;
      if (localObject1 == localObject2)
      {
        localObject1 = paramConstraintWidget.OoooO00;
        i = ((ConstraintAnchor)localObject1).OooO0oO;
        j = paramConstraintWidgetContainer.getWidth();
        int m = paramConstraintWidget.OoooO0O.OooO0oO;
        j -= m;
        Object localObject4 = paramConstraintWidget.OoooO00;
        SolverVariable localSolverVariable = paramLinearSystem.OooOOo0(localObject4);
        ((ConstraintAnchor)localObject4).OooO = localSolverVariable;
        localObject4 = paramConstraintWidget.OoooO0O;
        localSolverVariable = paramLinearSystem.OooOOo0(localObject4);
        ((ConstraintAnchor)localObject4).OooO = localSolverVariable;
        localObject4 = paramConstraintWidget.OoooO00.OooO;
        paramLinearSystem.OooO0o((SolverVariable)localObject4, i);
        localObject4 = paramConstraintWidget.OoooO0O.OooO;
        paramLinearSystem.OooO0o((SolverVariable)localObject4, j);
        paramConstraintWidget.OooOo00 = k;
        paramConstraintWidget.setHorizontalDimension(i, j);
      }
    }
    localObject1 = paramConstraintWidgetContainer.Ooooo00;
    j = 1;
    localObject1 = localObject1[j];
    if (localObject1 != localObject3)
    {
      localObject1 = paramConstraintWidget.Ooooo00[j];
      localObject2 = ConstraintWidget.DimensionBehaviour.o00Ooo0O;
      if (localObject1 == localObject2)
      {
        localObject1 = paramConstraintWidget.OoooO0;
        i = ((ConstraintAnchor)localObject1).OooO0oO;
        int n = paramConstraintWidgetContainer.getHeight();
        j = paramConstraintWidget.OoooO.OooO0oO;
        n -= j;
        localObject2 = paramConstraintWidget.OoooO0;
        localObject3 = paramLinearSystem.OooOOo0(localObject2);
        ((ConstraintAnchor)localObject2).OooO = ((SolverVariable)localObject3);
        localObject2 = paramConstraintWidget.OoooO;
        localObject3 = paramLinearSystem.OooOOo0(localObject2);
        ((ConstraintAnchor)localObject2).OooO = ((SolverVariable)localObject3);
        localObject2 = paramConstraintWidget.OoooO0.OooO;
        paramLinearSystem.OooO0o((SolverVariable)localObject2, i);
        localObject2 = paramConstraintWidget.OoooO.OooO;
        paramLinearSystem.OooO0o((SolverVariable)localObject2, n);
        j = paramConstraintWidget.o00Oo0;
        int i1;
        if (j <= 0)
        {
          j = paramConstraintWidget.getVisibility();
          i1 = 8;
          if (j != i1) {}
        }
        else
        {
          localObject2 = paramConstraintWidget.OoooOO0;
          localObject3 = paramLinearSystem.OooOOo0(localObject2);
          ((ConstraintAnchor)localObject2).OooO = ((SolverVariable)localObject3);
          localObject2 = paramConstraintWidget.OoooOO0.OooO;
          i1 = paramConstraintWidget.o00Oo0 + i;
          paramLinearSystem.OooO0o((SolverVariable)localObject2, i1);
        }
        paramConstraintWidget.OooOo0 = k;
        paramConstraintWidget.setVerticalDimension(i, n);
      }
    }
  }
  
  public static final boolean OooO0O0(int paramInt1, int paramInt2)
  {
    paramInt1 &= paramInt2;
    if (paramInt1 == paramInt2) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    return paramInt1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.Optimizer
 * JD-Core Version:    0.7.0.1
 */