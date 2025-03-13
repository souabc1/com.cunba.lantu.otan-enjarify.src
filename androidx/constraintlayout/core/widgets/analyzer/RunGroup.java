package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.List;

class RunGroup
{
  public static int OooO0oo;
  public int OooO00o = 0;
  public boolean OooO0O0 = false;
  public WidgetRun OooO0OO = null;
  public WidgetRun OooO0Oo = null;
  public int OooO0o;
  public ArrayList OooO0o0;
  public int OooO0oO;
  
  public RunGroup(WidgetRun paramWidgetRun, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0o0 = localArrayList;
    int i = OooO0oo;
    this.OooO0o = i;
    OooO0oo = i + 1;
    this.OooO0OO = paramWidgetRun;
    this.OooO0Oo = paramWidgetRun;
    this.OooO0oO = paramInt;
  }
  
  public void OooO00o(WidgetRun paramWidgetRun)
  {
    this.OooO0o0.add(paramWidgetRun);
    this.OooO0Oo = paramWidgetRun;
  }
  
  public long OooO0O0(ConstraintWidgetContainer paramConstraintWidgetContainer, int paramInt)
  {
    Object localObject1 = this.OooO0OO;
    boolean bool1 = localObject1 instanceof ChainRun;
    long l1 = 0L;
    if (bool1)
    {
      localObject2 = localObject1;
      localObject2 = (ChainRun)localObject1;
      int i = ((WidgetRun)localObject2).OooO0o;
      if (i != paramInt) {
        return l1;
      }
    }
    else
    {
      boolean bool2;
      if (paramInt == 0)
      {
        bool2 = localObject1 instanceof HorizontalWidgetRun;
        if (!bool2) {
          return l1;
        }
      }
      else
      {
        bool2 = localObject1 instanceof VerticalWidgetRun;
        if (!bool2) {
          return l1;
        }
      }
    }
    if (paramInt == 0) {
      localObject2 = paramConstraintWidgetContainer.OooO0o0;
    } else {
      localObject2 = paramConstraintWidgetContainer.OooO0o;
    }
    Object localObject2 = ((WidgetRun)localObject2).OooO0oo;
    if (paramInt == 0) {
      paramConstraintWidgetContainer = paramConstraintWidgetContainer.OooO0o0;
    } else {
      paramConstraintWidgetContainer = paramConstraintWidgetContainer.OooO0o;
    }
    paramConstraintWidgetContainer = paramConstraintWidgetContainer.OooO;
    localObject1 = ((WidgetRun)localObject1).OooO0oo.OooOO0o;
    boolean bool3 = ((List)localObject1).contains(localObject2);
    boolean bool4 = this.OooO0OO.OooO.OooOO0o.contains(paramConstraintWidgetContainer);
    localObject2 = this.OooO0OO;
    long l2 = ((WidgetRun)localObject2).getWrapDimension();
    long l3;
    DependencyNode localDependencyNode2;
    if ((bool3) && (bool4))
    {
      paramConstraintWidgetContainer = this.OooO0OO.OooO0oo;
      l3 = OooO0Oo(paramConstraintWidgetContainer, l1);
      paramConstraintWidgetContainer = this.OooO0OO.OooO;
      long l4 = OooO0OO(paramConstraintWidgetContainer, l1);
      l3 -= l2;
      paramConstraintWidgetContainer = this.OooO0OO;
      DependencyNode localDependencyNode1 = paramConstraintWidgetContainer.OooO;
      int n = localDependencyNode1.OooO0o;
      long l5 = -n;
      boolean bool5 = l3 < l5;
      long l6;
      if (!bool5)
      {
        l6 = n;
        l3 += l6;
      }
      l4 = -l4 - l2;
      localDependencyNode1 = paramConstraintWidgetContainer.OooO0oo;
      n = localDependencyNode1.OooO0o;
      l5 = n;
      l4 -= l5;
      l5 = n;
      bool5 = l4 < l5;
      if (!bool5)
      {
        l6 = n;
        l4 -= l6;
      }
      paramConstraintWidgetContainer = paramConstraintWidgetContainer.OooO0O0;
      float f1 = paramConstraintWidgetContainer.getBiasPercent(paramInt);
      float f2 = 0.0F;
      localDependencyNode2 = null;
      paramInt = f1 < 0.0F;
      n = 1065353216;
      float f3 = 1.0F;
      if (paramInt > 0)
      {
        f2 = (float)l4 / f1;
        f4 = (float)l3;
        f5 = f3 - f1;
        f4 /= f5;
        f2 += f4;
        l1 = f2;
      }
      f2 = (float)l1;
      float f4 = f2 * f1;
      int j = 1056964608;
      float f5 = 0.5F;
      f4 += f5;
      l1 = f4;
      f3 -= f1;
      f2 = f2 * f3 + f5;
      l7 = f2;
      l1 = l1 + l2 + l7;
      paramConstraintWidgetContainer = this.OooO0OO;
      localDependencyNode2 = paramConstraintWidgetContainer.OooO0oo;
      paramInt = localDependencyNode2.OooO0o;
      l3 = paramInt + l1;
    }
    else
    {
      int k;
      if (bool3)
      {
        paramConstraintWidgetContainer = this.OooO0OO.OooO0oo;
        paramInt = paramConstraintWidgetContainer.OooO0o;
        l3 = paramInt;
        l7 = OooO0Oo(paramConstraintWidgetContainer, l3);
        localObject1 = this.OooO0OO.OooO0oo;
        k = ((DependencyNode)localObject1).OooO0o;
        l3 = k + l2;
      }
      for (;;)
      {
        l3 = Math.max(l7, l3);
        break label691;
        if (!bool4) {
          break;
        }
        paramConstraintWidgetContainer = this.OooO0OO.OooO;
        paramInt = paramConstraintWidgetContainer.OooO0o;
        l3 = paramInt;
        l7 = OooO0OO(paramConstraintWidgetContainer, l3);
        localObject1 = this.OooO0OO.OooO;
        k = -((DependencyNode)localObject1).OooO0o;
        l3 = k + l2;
        l7 = -l7;
      }
      paramConstraintWidgetContainer = this.OooO0OO;
      localDependencyNode2 = paramConstraintWidgetContainer.OooO0oo;
      paramInt = localDependencyNode2.OooO0o;
      l3 = paramInt;
      l7 = paramConstraintWidgetContainer.getWrapDimension();
      l3 += l7;
      paramConstraintWidgetContainer = this.OooO0OO;
    }
    paramConstraintWidgetContainer = paramConstraintWidgetContainer.OooO;
    int m = paramConstraintWidgetContainer.OooO0o;
    long l7 = m;
    l3 -= l7;
    label691:
    return l3;
  }
  
  public final long OooO0OO(DependencyNode paramDependencyNode, long paramLong)
  {
    WidgetRun localWidgetRun1 = paramDependencyNode.OooO0Oo;
    boolean bool1 = localWidgetRun1 instanceof HelperReferences;
    if (bool1) {
      return paramLong;
    }
    Object localObject1 = paramDependencyNode.OooOO0O;
    int i = ((List)localObject1).size();
    int j = 0;
    long l1 = paramLong;
    while (j < i)
    {
      Object localObject2 = (Dependency)paramDependencyNode.OooOO0O.get(j);
      boolean bool2 = localObject2 instanceof DependencyNode;
      if (bool2)
      {
        localObject2 = (DependencyNode)localObject2;
        WidgetRun localWidgetRun2 = ((DependencyNode)localObject2).OooO0Oo;
        if (localWidgetRun2 != localWidgetRun1)
        {
          int k = ((DependencyNode)localObject2).OooO0o;
          long l2 = k + paramLong;
          long l3 = OooO0OO((DependencyNode)localObject2, l2);
          l1 = Math.min(l1, l3);
        }
      }
      j += 1;
    }
    localObject1 = localWidgetRun1.OooO;
    if (paramDependencyNode == localObject1)
    {
      long l4 = localWidgetRun1.getWrapDimension();
      paramDependencyNode = localWidgetRun1.OooO0oo;
      paramLong -= l4;
      l4 = OooO0OO(paramDependencyNode, paramLong);
      l4 = Math.min(l1, l4);
      paramDependencyNode = localWidgetRun1.OooO0oo;
      int m = paramDependencyNode.OooO0o;
      l1 = m;
      paramLong -= l1;
      l1 = Math.min(l4, paramLong);
    }
    return l1;
  }
  
  public final long OooO0Oo(DependencyNode paramDependencyNode, long paramLong)
  {
    WidgetRun localWidgetRun1 = paramDependencyNode.OooO0Oo;
    boolean bool1 = localWidgetRun1 instanceof HelperReferences;
    if (bool1) {
      return paramLong;
    }
    Object localObject1 = paramDependencyNode.OooOO0O;
    int i = ((List)localObject1).size();
    int j = 0;
    long l1 = paramLong;
    while (j < i)
    {
      Object localObject2 = (Dependency)paramDependencyNode.OooOO0O.get(j);
      boolean bool2 = localObject2 instanceof DependencyNode;
      if (bool2)
      {
        localObject2 = (DependencyNode)localObject2;
        WidgetRun localWidgetRun2 = ((DependencyNode)localObject2).OooO0Oo;
        if (localWidgetRun2 != localWidgetRun1)
        {
          int k = ((DependencyNode)localObject2).OooO0o;
          long l2 = k + paramLong;
          long l3 = OooO0Oo((DependencyNode)localObject2, l2);
          l1 = Math.max(l1, l3);
        }
      }
      j += 1;
    }
    localObject1 = localWidgetRun1.OooO0oo;
    if (paramDependencyNode == localObject1)
    {
      long l4 = localWidgetRun1.getWrapDimension();
      paramDependencyNode = localWidgetRun1.OooO;
      paramLong += l4;
      l4 = OooO0Oo(paramDependencyNode, paramLong);
      l4 = Math.max(l1, l4);
      paramDependencyNode = localWidgetRun1.OooO;
      int m = paramDependencyNode.OooO0o;
      l1 = m;
      paramLong -= l1;
      l1 = Math.max(l4, paramLong);
    }
    return l1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.RunGroup
 * JD-Core Version:    0.7.0.1
 */