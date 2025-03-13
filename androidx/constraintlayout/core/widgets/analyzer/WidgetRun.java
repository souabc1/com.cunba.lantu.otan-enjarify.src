package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.List;

public abstract class WidgetRun
  implements Dependency
{
  public DependencyNode OooO;
  public int OooO00o;
  public ConstraintWidget OooO0O0;
  public RunGroup OooO0OO;
  public ConstraintWidget.DimensionBehaviour OooO0Oo;
  public int OooO0o;
  public DimensionDependency OooO0o0;
  public boolean OooO0oO;
  public DependencyNode OooO0oo;
  public WidgetRun.RunType OooOO0;
  
  public WidgetRun(ConstraintWidget paramConstraintWidget)
  {
    Object localObject = new androidx/constraintlayout/core/widgets/analyzer/DimensionDependency;
    ((DimensionDependency)localObject).<init>(this);
    this.OooO0o0 = ((DimensionDependency)localObject);
    this.OooO0o = 0;
    this.OooO0oO = false;
    localObject = new androidx/constraintlayout/core/widgets/analyzer/DependencyNode;
    ((DependencyNode)localObject).<init>(this);
    this.OooO0oo = ((DependencyNode)localObject);
    localObject = new androidx/constraintlayout/core/widgets/analyzer/DependencyNode;
    ((DependencyNode)localObject).<init>(this);
    this.OooO = ((DependencyNode)localObject);
    localObject = WidgetRun.RunType.o00OoOoo;
    this.OooOO0 = ((WidgetRun.RunType)localObject);
    this.OooO0O0 = paramConstraintWidget;
  }
  
  public final DependencyNode OooO(ConstraintAnchor paramConstraintAnchor, int paramInt)
  {
    paramConstraintAnchor = paramConstraintAnchor.OooO0o;
    DependencyNode localDependencyNode = null;
    if (paramConstraintAnchor == null) {
      return null;
    }
    Object localObject1 = paramConstraintAnchor.OooO0Oo;
    Object localObject2;
    if (paramInt == 0) {
      localObject2 = ((ConstraintWidget)localObject1).OooO0o0;
    } else {
      localObject2 = ((ConstraintWidget)localObject1).OooO0o;
    }
    paramConstraintAnchor = paramConstraintAnchor.OooO0o0;
    localObject1 = WidgetRun.1.OooO00o;
    int i = paramConstraintAnchor.ordinal();
    i = localObject1[i];
    int j = 1;
    if (i != j)
    {
      j = 2;
      if (i != j)
      {
        j = 3;
        if (i != j)
        {
          j = 5;
          if (i != j) {
            return localDependencyNode;
          }
        }
      }
      else
      {
        return ((WidgetRun)localObject2).OooO;
      }
    }
    localDependencyNode = ((WidgetRun)localObject2).OooO0oo;
    return localDependencyNode;
  }
  
  public void OooO00o(Dependency paramDependency) {}
  
  public final void OooO0O0(DependencyNode paramDependencyNode1, DependencyNode paramDependencyNode2, int paramInt)
  {
    paramDependencyNode1.OooOO0o.add(paramDependencyNode2);
    paramDependencyNode1.OooO0o = paramInt;
    paramDependencyNode2.OooOO0O.add(paramDependencyNode1);
  }
  
  public final void OooO0OO(DependencyNode paramDependencyNode1, DependencyNode paramDependencyNode2, int paramInt, DimensionDependency paramDimensionDependency)
  {
    paramDependencyNode1.OooOO0o.add(paramDependencyNode2);
    List localList = paramDependencyNode1.OooOO0o;
    DimensionDependency localDimensionDependency = this.OooO0o0;
    localList.add(localDimensionDependency);
    paramDependencyNode1.OooO0oo = paramInt;
    paramDependencyNode1.OooO = paramDimensionDependency;
    paramDependencyNode2.OooOO0O.add(paramDependencyNode1);
    paramDimensionDependency.OooOO0O.add(paramDependencyNode1);
  }
  
  public abstract void OooO0Oo();
  
  public abstract void OooO0o();
  
  public abstract void OooO0o0();
  
  public final int OooO0oO(int paramInt1, int paramInt2)
  {
    ConstraintWidget localConstraintWidget;
    int i;
    if (paramInt2 == 0)
    {
      localConstraintWidget = this.OooO0O0;
      i = localConstraintWidget.OooOoOO;
      paramInt2 = Math.max(localConstraintWidget.OooOoO, paramInt1);
      if (i > 0) {
        paramInt2 = Math.min(i, paramInt1);
      }
      if (paramInt2 == paramInt1) {
        return paramInt1;
      }
    }
    else
    {
      localConstraintWidget = this.OooO0O0;
      i = localConstraintWidget.OooOooO;
      paramInt2 = Math.max(localConstraintWidget.OooOoo, paramInt1);
      if (i > 0) {
        paramInt2 = Math.min(i, paramInt1);
      }
      if (paramInt2 == paramInt1) {
        return paramInt1;
      }
    }
    paramInt1 = paramInt2;
    return paramInt1;
  }
  
  public final DependencyNode OooO0oo(ConstraintAnchor paramConstraintAnchor)
  {
    paramConstraintAnchor = paramConstraintAnchor.OooO0o;
    DependencyNode localDependencyNode = null;
    if (paramConstraintAnchor == null) {
      return null;
    }
    ConstraintWidget localConstraintWidget = paramConstraintAnchor.OooO0Oo;
    paramConstraintAnchor = paramConstraintAnchor.OooO0o0;
    int[] arrayOfInt = WidgetRun.1.OooO00o;
    int i = paramConstraintAnchor.ordinal();
    i = arrayOfInt[i];
    int j = 1;
    if (i != j)
    {
      j = 2;
      if (i != j)
      {
        j = 3;
        if (i != j)
        {
          j = 4;
          if (i != j)
          {
            j = 5;
            if (i != j) {
              return localDependencyNode;
            }
            paramConstraintAnchor = localConstraintWidget.OooO0o;
          }
          else
          {
            paramConstraintAnchor = localConstraintWidget.OooO0o;
            return paramConstraintAnchor.OooOO0O;
          }
        }
        else
        {
          paramConstraintAnchor = localConstraintWidget.OooO0o;
          break label141;
        }
      }
      else
      {
        paramConstraintAnchor = localConstraintWidget.OooO0o0;
      }
      return paramConstraintAnchor.OooO;
    }
    else
    {
      paramConstraintAnchor = localConstraintWidget.OooO0o0;
    }
    label141:
    localDependencyNode = paramConstraintAnchor.OooO0oo;
    return localDependencyNode;
  }
  
  public final void OooOO0(int paramInt1, int paramInt2)
  {
    int i = this.OooO00o;
    if (i != 0)
    {
      int k = 1;
      if (i != k)
      {
        paramInt2 = 2;
        float f1 = 2.802597E-045F;
        float f2 = 0.5F;
        if (i != paramInt2)
        {
          paramInt2 = 3;
          f1 = 4.203895E-045F;
          if (i != paramInt2) {
            return;
          }
          localObject1 = this.OooO0O0;
          Object localObject2 = ((ConstraintWidget)localObject1).OooO0o0;
          Object localObject3 = ((WidgetRun)localObject2).OooO0Oo;
          ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          if (localObject3 == localDimensionBehaviour1)
          {
            int m = ((WidgetRun)localObject2).OooO00o;
            if (m == paramInt2)
            {
              localObject3 = ((ConstraintWidget)localObject1).OooO0o;
              ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = ((WidgetRun)localObject3).OooO0Oo;
              if (localDimensionBehaviour2 == localDimensionBehaviour1)
              {
                m = ((WidgetRun)localObject3).OooO00o;
                if (m == paramInt2) {
                  return;
                }
              }
            }
          }
          if (paramInt1 == 0) {
            localObject2 = ((ConstraintWidget)localObject1).OooO0o;
          }
          localObject4 = ((WidgetRun)localObject2).OooO0o0;
          paramInt2 = ((DependencyNode)localObject4).OooOO0;
          if (paramInt2 == 0) {
            return;
          }
          f1 = ((ConstraintWidget)localObject1).getDimensionRatio();
          DimensionDependency localDimensionDependency;
          float f3;
          if (paramInt1 == k)
          {
            localDimensionDependency = ((WidgetRun)localObject2).OooO0o0;
            f3 = localDimensionDependency.OooO0oO / f1 + f2;
            paramInt1 = (int)f3;
          }
          else
          {
            localDimensionDependency = ((WidgetRun)localObject2).OooO0o0;
            f3 = localDimensionDependency.OooO0oO;
            f1 = f1 * f3 + f2;
            paramInt1 = (int)f1;
          }
          localObject4 = this.OooO0o0;
          ((DimensionDependency)localObject4).OooO0Oo(paramInt1);
          return;
        }
        Object localObject4 = this.OooO0O0.getParent();
        if (localObject4 == null) {
          return;
        }
        if (paramInt1 == 0) {
          localObject4 = ((ConstraintWidget)localObject4).OooO0o0;
        } else {
          localObject4 = ((ConstraintWidget)localObject4).OooO0o;
        }
        localObject4 = ((WidgetRun)localObject4).OooO0o0;
        boolean bool = ((DependencyNode)localObject4).OooOO0;
        if (!bool) {
          return;
        }
        localObject1 = this.OooO0O0;
        float f4;
        if (paramInt1 == 0) {
          f4 = ((ConstraintWidget)localObject1).OooOoo0;
        } else {
          f4 = ((ConstraintWidget)localObject1).OooOooo;
        }
        f1 = ((DependencyNode)localObject4).OooO0oO * f4 + f2;
        paramInt2 = (int)f1;
      }
      else
      {
        int j = this.OooO0o0.OooOOO0;
        paramInt1 = OooO0oO(j, paramInt1);
        localObject1 = this.OooO0o0;
        paramInt1 = Math.min(paramInt1, paramInt2);
        break label385;
      }
    }
    Object localObject1 = this.OooO0o0;
    paramInt1 = OooO0oO(paramInt2, paramInt1);
    label385:
    ((DimensionDependency)localObject1).OooO0Oo(paramInt1);
  }
  
  public abstract boolean OooOO0O();
  
  public void OooOO0o(Dependency paramDependency, ConstraintAnchor paramConstraintAnchor1, ConstraintAnchor paramConstraintAnchor2, int paramInt)
  {
    paramDependency = OooO0oo(paramConstraintAnchor1);
    DependencyNode localDependencyNode = OooO0oo(paramConstraintAnchor2);
    boolean bool1 = paramDependency.OooOO0;
    if (bool1)
    {
      bool1 = localDependencyNode.OooOO0;
      if (bool1)
      {
        int i = paramDependency.OooO0oO;
        int j = paramConstraintAnchor1.getMargin();
        i += j;
        j = localDependencyNode.OooO0oO;
        int k = paramConstraintAnchor2.getMargin();
        j -= k;
        k = j - i;
        Object localObject = this.OooO0o0;
        boolean bool2 = ((DependencyNode)localObject).OooOO0;
        if (!bool2)
        {
          localObject = this.OooO0Oo;
          ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          if (localObject == localDimensionBehaviour) {
            OooOO0(paramInt, k);
          }
        }
        localObject = this.OooO0o0;
        boolean bool3 = ((DependencyNode)localObject).OooOO0;
        if (!bool3) {
          return;
        }
        int m = ((DependencyNode)localObject).OooO0oO;
        if (m == k)
        {
          this.OooO0oo.OooO0Oo(i);
          paramDependency = this.OooO;
        }
        for (;;)
        {
          paramDependency.OooO0Oo(j);
          return;
          paramConstraintAnchor2 = this.OooO0O0;
          float f1;
          if (paramInt == 0) {
            f1 = paramConstraintAnchor2.getHorizontalBiasPercent();
          } else {
            f1 = paramConstraintAnchor2.getVerticalBiasPercent();
          }
          paramInt = 1056964608;
          float f2 = 0.5F;
          if (paramDependency == localDependencyNode)
          {
            i = paramDependency.OooO0oO;
            j = localDependencyNode.OooO0oO;
            k = paramInt;
            f1 = f2;
          }
          j -= i;
          int n = this.OooO0o0.OooO0oO;
          j -= n;
          paramDependency = this.OooO0oo;
          float f3 = i + f2;
          float f4 = j * f1;
          f3 += f4;
          j = (int)f3;
          paramDependency.OooO0Oo(j);
          paramDependency = this.OooO;
          paramConstraintAnchor1 = this.OooO0oo;
          j = paramConstraintAnchor1.OooO0oO;
          paramConstraintAnchor2 = this.OooO0o0;
          k = paramConstraintAnchor2.OooO0oO;
          j += k;
        }
      }
    }
  }
  
  public void OooOOO(Dependency paramDependency) {}
  
  public void OooOOO0(Dependency paramDependency) {}
  
  public long getWrapDimension()
  {
    DimensionDependency localDimensionDependency = this.OooO0o0;
    boolean bool = localDimensionDependency.OooOO0;
    if (bool) {
      return localDimensionDependency.OooO0oO;
    }
    return 0L;
  }
  
  public boolean isCenterConnection()
  {
    List localList = this.OooO0oo.OooOO0o;
    int i = localList.size();
    boolean bool = false;
    int j = 0;
    int k = 0;
    WidgetRun localWidgetRun;
    while (j < i)
    {
      localWidgetRun = ((DependencyNode)this.OooO0oo.OooOO0o.get(j)).OooO0Oo;
      if (localWidgetRun != this) {
        k += 1;
      }
      j += 1;
    }
    localList = this.OooO.OooOO0o;
    i = localList.size();
    j = 0;
    while (j < i)
    {
      localWidgetRun = ((DependencyNode)this.OooO.OooOO0o.get(j)).OooO0Oo;
      if (localWidgetRun != this) {
        k += 1;
      }
      j += 1;
    }
    i = 2;
    if (k >= i) {
      bool = true;
    }
    return bool;
  }
  
  public boolean isDimensionResolved()
  {
    return this.OooO0o0.OooOO0;
  }
  
  public boolean isResolved()
  {
    return this.OooO0oO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.WidgetRun
 * JD-Core Version:    0.7.0.1
 */