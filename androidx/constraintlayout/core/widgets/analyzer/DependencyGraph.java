package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class DependencyGraph
{
  public ArrayList OooO;
  public ConstraintWidgetContainer OooO00o;
  public boolean OooO0O0;
  public boolean OooO0OO;
  public ConstraintWidgetContainer OooO0Oo;
  public ArrayList OooO0o;
  public ArrayList OooO0o0;
  public BasicMeasure.Measurer OooO0oO;
  public BasicMeasure.Measure OooO0oo;
  
  public DependencyGraph(ConstraintWidgetContainer paramConstraintWidgetContainer)
  {
    boolean bool = true;
    this.OooO0O0 = bool;
    this.OooO0OO = bool;
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO0o0 = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO0o = ((ArrayList)localObject);
    this.OooO0oO = null;
    localObject = new androidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;
    ((BasicMeasure.Measure)localObject).<init>();
    this.OooO0oo = ((BasicMeasure.Measure)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO = ((ArrayList)localObject);
    this.OooO00o = paramConstraintWidgetContainer;
    this.OooO0Oo = paramConstraintWidgetContainer;
  }
  
  public final void OooO(WidgetRun paramWidgetRun, int paramInt, ArrayList paramArrayList)
  {
    Object localObject1 = paramWidgetRun.OooO0oo.OooOO0O.iterator();
    boolean bool1;
    Object localObject2;
    boolean bool2;
    Object localObject3;
    int i;
    DependencyNode localDependencyNode;
    Object localObject4;
    Object localObject5;
    int j;
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (Dependency)((Iterator)localObject1).next();
      bool2 = localObject2 instanceof DependencyNode;
      if (bool2)
      {
        localObject3 = localObject2;
        localObject3 = (DependencyNode)localObject2;
        i = 0;
        localDependencyNode = null;
        localObject4 = paramWidgetRun.OooO;
        localObject5 = this;
        j = paramInt;
        OooO00o((DependencyNode)localObject3, paramInt, 0, (DependencyNode)localObject4, paramArrayList, null);
      }
      else
      {
        bool2 = localObject2 instanceof WidgetRun;
        if (bool2)
        {
          localObject2 = (WidgetRun)localObject2;
          localObject5 = ((WidgetRun)localObject2).OooO0oo;
          j = 0;
          localDependencyNode = paramWidgetRun.OooO;
          localObject4 = paramArrayList;
          OooO00o((DependencyNode)localObject5, paramInt, 0, localDependencyNode, paramArrayList, null);
        }
      }
    }
    localObject1 = paramWidgetRun.OooO.OooOO0O.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (Dependency)((Iterator)localObject1).next();
      bool2 = localObject2 instanceof DependencyNode;
      if (bool2)
      {
        localObject3 = localObject2;
        localObject3 = (DependencyNode)localObject2;
        i = 1;
        localObject4 = paramWidgetRun.OooO0oo;
        localObject5 = this;
        j = paramInt;
        OooO00o((DependencyNode)localObject3, paramInt, i, (DependencyNode)localObject4, paramArrayList, null);
      }
      else
      {
        bool2 = localObject2 instanceof WidgetRun;
        if (bool2)
        {
          localObject2 = (WidgetRun)localObject2;
          localObject5 = ((WidgetRun)localObject2).OooO;
          j = 1;
          localDependencyNode = paramWidgetRun.OooO0oo;
          localObject4 = paramArrayList;
          OooO00o((DependencyNode)localObject5, paramInt, j, localDependencyNode, paramArrayList, null);
        }
      }
    }
    int k = 1;
    if (paramInt == k)
    {
      paramWidgetRun = ((VerticalWidgetRun)paramWidgetRun).OooOO0O.OooOO0O.iterator();
      for (;;)
      {
        boolean bool3 = paramWidgetRun.hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = (Dependency)paramWidgetRun.next();
        bool1 = localObject1 instanceof DependencyNode;
        if (bool1)
        {
          localObject5 = localObject1;
          localObject5 = (DependencyNode)localObject1;
          j = 2;
          i = 0;
          localDependencyNode = null;
          localObject4 = paramArrayList;
          OooO00o((DependencyNode)localObject5, paramInt, j, null, paramArrayList, null);
        }
      }
    }
  }
  
  public final void OooO00o(DependencyNode paramDependencyNode1, int paramInt1, int paramInt2, DependencyNode paramDependencyNode2, ArrayList paramArrayList, RunGroup paramRunGroup)
  {
    paramDependencyNode1 = paramDependencyNode1.OooO0Oo;
    Object localObject1 = paramDependencyNode1.OooO0OO;
    if (localObject1 == null)
    {
      localObject1 = this.OooO00o;
      Object localObject2 = ((ConstraintWidget)localObject1).OooO0o0;
      if (paramDependencyNode1 != localObject2)
      {
        localObject1 = ((ConstraintWidget)localObject1).OooO0o;
        if (paramDependencyNode1 != localObject1)
        {
          if (paramRunGroup == null)
          {
            paramRunGroup = new androidx/constraintlayout/core/widgets/analyzer/RunGroup;
            paramRunGroup.<init>(paramDependencyNode1, paramInt2);
            paramArrayList.add(paramRunGroup);
          }
          paramDependencyNode1.OooO0OO = paramRunGroup;
          paramRunGroup.OooO00o(paramDependencyNode1);
          Object localObject3 = paramDependencyNode1.OooO0oo.OooOO0O.iterator();
          boolean bool1;
          boolean bool2;
          int i;
          for (;;)
          {
            bool1 = ((Iterator)localObject3).hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = (Dependency)((Iterator)localObject3).next();
            bool2 = localObject1 instanceof DependencyNode;
            if (bool2)
            {
              localObject2 = localObject1;
              localObject2 = (DependencyNode)localObject1;
              i = 0;
              localObject1 = this;
              OooO00o((DependencyNode)localObject2, paramInt1, 0, paramDependencyNode2, paramArrayList, paramRunGroup);
            }
          }
          localObject3 = paramDependencyNode1.OooO.OooOO0O.iterator();
          for (;;)
          {
            bool1 = ((Iterator)localObject3).hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = (Dependency)((Iterator)localObject3).next();
            bool2 = localObject1 instanceof DependencyNode;
            if (bool2)
            {
              localObject2 = localObject1;
              localObject2 = (DependencyNode)localObject1;
              i = 1;
              localObject1 = this;
              OooO00o((DependencyNode)localObject2, paramInt1, i, paramDependencyNode2, paramArrayList, paramRunGroup);
            }
          }
          paramInt2 = 1;
          if (paramInt1 == paramInt2)
          {
            bool1 = paramDependencyNode1 instanceof VerticalWidgetRun;
            if (bool1)
            {
              localObject1 = paramDependencyNode1;
              localObject1 = ((VerticalWidgetRun)paramDependencyNode1).OooOO0O.OooOO0O;
              localIterator = ((List)localObject1).iterator();
              for (;;)
              {
                bool1 = localIterator.hasNext();
                if (!bool1) {
                  break;
                }
                localObject1 = (Dependency)localIterator.next();
                bool2 = localObject1 instanceof DependencyNode;
                if (bool2)
                {
                  localObject2 = localObject1;
                  localObject2 = (DependencyNode)localObject1;
                  i = 2;
                  localObject1 = this;
                  OooO00o((DependencyNode)localObject2, paramInt1, i, paramDependencyNode2, paramArrayList, paramRunGroup);
                }
              }
            }
          }
          localObject1 = ((WidgetRun)paramDependencyNode1).OooO0oo.OooOO0o;
          Iterator localIterator = ((List)localObject1).iterator();
          for (;;)
          {
            bool1 = localIterator.hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = localIterator.next();
            localObject2 = localObject1;
            localObject2 = (DependencyNode)localObject1;
            if (localObject2 == paramDependencyNode2) {
              paramRunGroup.OooO0O0 = paramInt2;
            }
            i = 0;
            localObject1 = this;
            OooO00o((DependencyNode)localObject2, paramInt1, 0, paramDependencyNode2, paramArrayList, paramRunGroup);
          }
          localObject1 = ((WidgetRun)paramDependencyNode1).OooO.OooOO0o;
          localIterator = ((List)localObject1).iterator();
          for (;;)
          {
            bool1 = localIterator.hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = localIterator.next();
            localObject2 = localObject1;
            localObject2 = (DependencyNode)localObject1;
            if (localObject2 == paramDependencyNode2) {
              paramRunGroup.OooO0O0 = paramInt2;
            }
            i = 1;
            localObject1 = this;
            OooO00o((DependencyNode)localObject2, paramInt1, i, paramDependencyNode2, paramArrayList, paramRunGroup);
          }
          if (paramInt1 == paramInt2)
          {
            paramInt2 = paramDependencyNode1 instanceof VerticalWidgetRun;
            if (paramInt2 != 0)
            {
              paramDependencyNode1 = ((VerticalWidgetRun)paramDependencyNode1).OooOO0O.OooOO0o.iterator();
              for (;;)
              {
                paramInt2 = paramDependencyNode1.hasNext();
                if (paramInt2 == 0) {
                  break;
                }
                localObject3 = paramDependencyNode1.next();
                localObject2 = localObject3;
                localObject2 = (DependencyNode)localObject3;
                i = 2;
                localObject1 = this;
                OooO00o((DependencyNode)localObject2, paramInt1, i, paramDependencyNode2, paramArrayList, paramRunGroup);
              }
            }
          }
        }
      }
    }
  }
  
  public final boolean OooO0O0(ConstraintWidgetContainer paramConstraintWidgetContainer)
  {
    ConstraintWidgetContainer localConstraintWidgetContainer = paramConstraintWidgetContainer;
    Iterator localIterator = paramConstraintWidgetContainer.o000OO.iterator();
    boolean bool1 = localIterator.hasNext();
    int j = 0;
    float f1 = 0.0F;
    DimensionDependency localDimensionDependency = null;
    if (bool1)
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)localIterator.next();
      Object localObject1 = localConstraintWidget.Ooooo00;
      Object localObject2 = localObject1[0];
      int k = 1;
      localObject1 = localObject1[k];
      int m = localConstraintWidget.getVisibility();
      int i1 = 8;
      if (m == i1) {}
      for (;;)
      {
        localConstraintWidget.OooO00o = k;
        break;
        float f2 = localConstraintWidget.OooOoo0;
        float f3 = 1.0F;
        boolean bool2 = f2 < f3;
        i1 = 2;
        if (bool2)
        {
          localObject3 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          if (localObject2 == localObject3) {
            localConstraintWidget.OooOo0o = i1;
          }
        }
        f2 = localConstraintWidget.OooOooo;
        bool2 = f2 < f3;
        if (bool2)
        {
          localObject3 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          if (localObject1 == localObject3) {
            localConstraintWidget.OooOo = i1;
          }
        }
        f2 = localConstraintWidget.getDimensionRatio();
        Object localObject4 = null;
        bool2 = f2 < 0.0F;
        int i2 = 3;
        if (bool2)
        {
          localObject3 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          if (localObject2 == localObject3)
          {
            localObject5 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
            if (localObject1 != localObject5)
            {
              localObject5 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
              if (localObject1 != localObject5) {}
            }
            else
            {
              localConstraintWidget.OooOo0o = i2;
              break label336;
            }
          }
          if (localObject1 == localObject3)
          {
            localObject5 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
            if (localObject2 != localObject5)
            {
              localObject5 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
              if (localObject2 != localObject5) {
                break label288;
              }
            }
          }
          label288:
          int n;
          do
          {
            localConstraintWidget.OooOo = i2;
            break;
            if ((localObject2 != localObject3) || (localObject1 != localObject3)) {
              break;
            }
            n = localConstraintWidget.OooOo0o;
            if (n == 0) {
              localConstraintWidget.OooOo0o = i2;
            }
            n = localConstraintWidget.OooOo;
          } while (n == 0);
        }
        label336:
        Object localObject3 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
        int i3;
        if (localObject2 == localObject3)
        {
          i3 = localConstraintWidget.OooOo0o;
          if (i3 == k)
          {
            localObject5 = localConstraintWidget.OoooO00.OooO0o;
            if (localObject5 != null)
            {
              localObject5 = localConstraintWidget.OoooO0O.OooO0o;
              if (localObject5 != null) {}
            }
            else
            {
              localObject2 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
            }
          }
        }
        Object localObject5 = localObject2;
        if (localObject1 == localObject3)
        {
          i4 = localConstraintWidget.OooOo;
          if (i4 == k)
          {
            localObject2 = localConstraintWidget.OoooO0.OooO0o;
            if (localObject2 != null)
            {
              localObject2 = localConstraintWidget.OoooO.OooO0o;
              if (localObject2 != null) {}
            }
            else
            {
              localObject1 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
            }
          }
        }
        Object localObject6 = localObject1;
        localObject1 = localConstraintWidget.OooO0o0;
        ((WidgetRun)localObject1).OooO0Oo = ((ConstraintWidget.DimensionBehaviour)localObject5);
        int i4 = localConstraintWidget.OooOo0o;
        ((WidgetRun)localObject1).OooO00o = i4;
        localObject1 = localConstraintWidget.OooO0o;
        ((WidgetRun)localObject1).OooO0Oo = localObject6;
        int i5 = localConstraintWidget.OooOo;
        ((WidgetRun)localObject1).OooO00o = i5;
        localObject1 = ConstraintWidget.DimensionBehaviour.o00Ooo0O;
        ConstraintWidget.DimensionBehaviour localDimensionBehaviour1;
        if (localObject5 != localObject1)
        {
          localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
          if (localObject5 != localDimensionBehaviour1)
          {
            localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
            if (localObject5 != localDimensionBehaviour1) {
              break label587;
            }
          }
        }
        if (localObject6 != localObject1)
        {
          localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
          if (localObject6 != localDimensionBehaviour1)
          {
            localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
            if (localObject6 != localDimensionBehaviour1)
            {
              label587:
              float f4 = 0.5F;
              ConstraintWidget.DimensionBehaviour localDimensionBehaviour2;
              Object localObject7;
              Object localObject8;
              float f5;
              if (localObject5 == localObject3)
              {
                localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
                if (localObject6 != localDimensionBehaviour2)
                {
                  localObject7 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
                  if (localObject6 != localObject7) {}
                }
                else if (i4 == i2)
                {
                  if (localObject6 == localDimensionBehaviour2)
                  {
                    i1 = 0;
                    localObject8 = null;
                    i3 = 0;
                    localObject5 = null;
                    localObject1 = this;
                    localObject2 = localConstraintWidget;
                    localObject3 = localDimensionBehaviour2;
                    localObject4 = localDimensionBehaviour2;
                    OooOO0o(localConstraintWidget, localDimensionBehaviour2, 0, localDimensionBehaviour2, 0);
                  }
                  i3 = localConstraintWidget.getHeight();
                  f1 = i3;
                  f5 = localConstraintWidget.OooooOo;
                  f1 = f1 * f5 + f4;
                  i1 = (int)f1;
                }
              }
              label714:
              int i;
              label791:
              label937:
              label944:
              float f6;
              for (;;)
              {
                localObject4 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
                localObject1 = this;
                localObject2 = localConstraintWidget;
                localObject3 = localObject4;
                break label1724;
                if (i4 == k)
                {
                  i1 = 0;
                  localObject8 = null;
                  i3 = 0;
                  localObject5 = null;
                  localObject1 = this;
                  localObject2 = localConstraintWidget;
                  localObject3 = localDimensionBehaviour2;
                  localObject4 = localObject6;
                  OooOO0o(localConstraintWidget, localDimensionBehaviour2, 0, localObject6, 0);
                  localDimensionDependency = localConstraintWidget.OooO0o0.OooO0o0;
                  i = localConstraintWidget.getWidth();
                  localDimensionDependency.OooOOO0 = i;
                  break;
                }
                if (i4 == i1)
                {
                  localObject7 = localConstraintWidgetContainer.Ooooo00[0];
                  localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
                  if ((localObject7 != localDimensionBehaviour2) && (localObject7 != localObject1)) {
                    break label944;
                  }
                  f1 = localConstraintWidget.OooOoo0;
                  i6 = paramConstraintWidgetContainer.getWidth();
                  f5 = i6;
                  f1 = f1 * f5 + f4;
                  i1 = (int)f1;
                  i3 = localConstraintWidget.getHeight();
                }
                else
                {
                  localObject7 = localConstraintWidget.OoooOo0;
                  localObject8 = localObject7[0].OooO0o;
                  if (localObject8 != null)
                  {
                    localObject8 = localObject7[k].OooO0o;
                    if (localObject8 != null) {
                      break label944;
                    }
                  }
                  i1 = 0;
                  localObject8 = null;
                  i3 = 0;
                  localObject5 = null;
                }
                localObject1 = this;
                localObject2 = localConstraintWidget;
                localObject3 = localDimensionBehaviour2;
                localObject4 = localObject6;
                break label1724;
                if (localObject6 != localObject3) {
                  break label1339;
                }
                localObject7 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
                if (localObject5 != localObject7)
                {
                  localObject8 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
                  if (localObject5 != localObject8) {
                    break label1339;
                  }
                }
                if (i5 != i2) {
                  break label1098;
                }
                if (localObject5 == localObject7)
                {
                  i1 = 0;
                  localObject8 = null;
                  i3 = 0;
                  localObject5 = null;
                  localObject1 = this;
                  localObject2 = localConstraintWidget;
                  localObject3 = localObject7;
                  localObject4 = localObject7;
                  OooOO0o(localConstraintWidget, (ConstraintWidget.DimensionBehaviour)localObject7, 0, (ConstraintWidget.DimensionBehaviour)localObject7, 0);
                }
                i1 = localConstraintWidget.getWidth();
                f1 = localConstraintWidget.OooooOo;
                i6 = localConstraintWidget.getDimensionRatioSide();
                i4 = -1;
                f6 = 0.0F / 0.0F;
                if (i6 == i4)
                {
                  i6 = 1065353216;
                  f5 = 1.0F;
                  f1 = f5 / f1;
                }
                f5 = i1 * f1 + f4;
                i3 = (int)f5;
              }
              label1098:
              if (i5 == k)
              {
                i1 = 0;
                localObject8 = null;
                j = 0;
                f1 = 0.0F;
                localDimensionDependency = null;
                localObject1 = this;
                localObject2 = localConstraintWidget;
                localObject3 = localObject5;
                localObject4 = localObject7;
                i3 = 0;
                localObject5 = null;
                OooOO0o(localConstraintWidget, (ConstraintWidget.DimensionBehaviour)localObject3, 0, (ConstraintWidget.DimensionBehaviour)localObject7, 0);
              }
              for (;;)
              {
                localDimensionDependency = localConstraintWidget.OooO0o.OooO0o0;
                i = localConstraintWidget.getHeight();
                break label791;
                i1 = 2;
                if (i5 == i1)
                {
                  localObject8 = localConstraintWidgetContainer.Ooooo00[k];
                  localObject4 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
                  if ((localObject8 == localObject4) || (localObject8 == localObject1))
                  {
                    f1 = localConstraintWidget.OooOooo;
                    i1 = localConstraintWidget.getWidth();
                    i6 = paramConstraintWidgetContainer.getHeight();
                    f5 = i6;
                    f1 = f1 * f5 + f4;
                    j = (int)f1;
                    localObject1 = this;
                    localObject2 = localConstraintWidget;
                    localObject3 = localObject5;
                    i3 = j;
                    break label1724;
                  }
                }
                else
                {
                  localObject1 = localConstraintWidget.OoooOo0;
                  i1 = 2;
                  localDimensionBehaviour2 = localObject1[i1];
                  localObject8 = localDimensionBehaviour2.OooO0o;
                  if (localObject8 != null)
                  {
                    localObject1 = localObject1[i2].OooO0o;
                    if (localObject1 != null) {}
                  }
                  else
                  {
                    i1 = 0;
                    localObject8 = null;
                    i3 = 0;
                    localObject5 = null;
                    localObject1 = this;
                    localObject2 = localConstraintWidget;
                    localObject3 = localObject7;
                    break label937;
                  }
                }
                label1339:
                if ((localObject5 != localObject3) || (localObject6 != localObject3)) {
                  break;
                }
                if ((i4 != k) && (i5 != k))
                {
                  i6 = 2;
                  f5 = 2.802597E-045F;
                  if ((i5 != i6) || (i4 != i6)) {
                    break;
                  }
                  localObject1 = localConstraintWidgetContainer.Ooooo00;
                  localDimensionDependency = localObject1[0];
                  localObject4 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
                  if (localDimensionDependency != localObject4) {
                    break;
                  }
                  localDimensionDependency = localObject1[k];
                  if (localDimensionDependency != localObject4) {
                    break;
                  }
                  f1 = localConstraintWidget.OooOoo0;
                  f5 = localConstraintWidget.OooOooo;
                  i4 = paramConstraintWidgetContainer.getWidth();
                  f6 = i4;
                  i1 = (int)(f1 * f6 + f4);
                  j = paramConstraintWidgetContainer.getHeight();
                  f1 = j;
                  f5 = f5 * f1 + f4;
                  i3 = (int)f5;
                  break label714;
                }
                localObject4 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
                i1 = 0;
                localObject8 = null;
                i3 = 0;
                localObject5 = null;
                localObject1 = this;
                localObject2 = localConstraintWidget;
                localObject3 = localObject4;
                OooOO0o(localConstraintWidget, (ConstraintWidget.DimensionBehaviour)localObject4, 0, (ConstraintWidget.DimensionBehaviour)localObject4, 0);
                localDimensionDependency = localConstraintWidget.OooO0o0.OooO0o0;
                i6 = localConstraintWidget.getWidth();
                localDimensionDependency.OooOOO0 = i6;
              }
            }
          }
        }
        j = localConstraintWidget.getWidth();
        if (localObject5 == localObject1)
        {
          j = paramConstraintWidgetContainer.getWidth();
          i4 = localConstraintWidget.OoooO00.OooO0oO;
          j -= i4;
          i4 = localConstraintWidget.OoooO0O.OooO0oO;
          j -= i4;
          localObject2 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
          i1 = j;
          localObject3 = localObject2;
        }
        else
        {
          i1 = j;
          localObject3 = localObject5;
        }
        j = localConstraintWidget.getHeight();
        if (localObject6 == localObject1)
        {
          j = paramConstraintWidgetContainer.getHeight();
          i6 = localConstraintWidget.OoooO0.OooO0oO;
          j -= i6;
          i6 = localConstraintWidget.OoooO.OooO0oO;
          j -= i6;
          localObject1 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
          i3 = j;
          localObject4 = localObject1;
        }
        else
        {
          i3 = j;
          localObject4 = localObject6;
        }
        localObject1 = this;
        localObject2 = localConstraintWidget;
        label1724:
        ((DependencyGraph)localObject1).OooOO0o((ConstraintWidget)localObject2, (ConstraintWidget.DimensionBehaviour)localObject3, i1, (ConstraintWidget.DimensionBehaviour)localObject4, i3);
        localDimensionDependency = localConstraintWidget.OooO0o0.OooO0o0;
        int i6 = localConstraintWidget.getWidth();
        localDimensionDependency.OooO0Oo(i6);
        localDimensionDependency = localConstraintWidget.OooO0o.OooO0o0;
        i6 = localConstraintWidget.getHeight();
        localDimensionDependency.OooO0Oo(i6);
      }
    }
    return false;
  }
  
  public void OooO0OO()
  {
    ArrayList localArrayList1 = this.OooO0o0;
    OooO0Oo(localArrayList1);
    this.OooO.clear();
    RunGroup.OooO0oo = 0;
    Object localObject = this.OooO00o.OooO0o0;
    ArrayList localArrayList2 = this.OooO;
    OooO((WidgetRun)localObject, 0, localArrayList2);
    localObject = this.OooO00o.OooO0o;
    ArrayList localArrayList3 = this.OooO;
    OooO((WidgetRun)localObject, 1, localArrayList3);
    this.OooO0O0 = false;
  }
  
  public void OooO0Oo(ArrayList paramArrayList)
  {
    paramArrayList.clear();
    this.OooO0Oo.OooO0o0.OooO0o();
    this.OooO0Oo.OooO0o.OooO0o();
    Object localObject1 = this.OooO0Oo.OooO0o0;
    paramArrayList.add(localObject1);
    localObject1 = this.OooO0Oo.OooO0o;
    paramArrayList.add(localObject1);
    localObject1 = this.OooO0Oo.o000OO.iterator();
    boolean bool1 = false;
    Object localObject2 = null;
    boolean bool2 = ((Iterator)localObject1).hasNext();
    Object localObject3;
    if (bool2)
    {
      localObject3 = (ConstraintWidget)((Iterator)localObject1).next();
      boolean bool3 = localObject3 instanceof Guideline;
      Object localObject4;
      if (bool3)
      {
        localObject4 = new androidx/constraintlayout/core/widgets/analyzer/GuidelineReference;
        ((GuidelineReference)localObject4).<init>((ConstraintWidget)localObject3);
      }
      for (;;)
      {
        paramArrayList.add(localObject4);
        break;
        bool3 = ((ConstraintWidget)localObject3).isInHorizontalChain();
        int i;
        if (bool3)
        {
          localObject4 = ((ConstraintWidget)localObject3).OooO0OO;
          if (localObject4 == null)
          {
            localObject4 = new androidx/constraintlayout/core/widgets/analyzer/ChainRun;
            i = 0;
            ((ChainRun)localObject4).<init>((ConstraintWidget)localObject3, 0);
            ((ConstraintWidget)localObject3).OooO0OO = ((ChainRun)localObject4);
          }
          if (localObject2 == null)
          {
            localObject2 = new java/util/HashSet;
            ((HashSet)localObject2).<init>();
          }
          localObject4 = ((ConstraintWidget)localObject3).OooO0OO;
          ((HashSet)localObject2).add(localObject4);
        }
        else
        {
          localObject4 = ((ConstraintWidget)localObject3).OooO0o0;
          paramArrayList.add(localObject4);
        }
        bool3 = ((ConstraintWidget)localObject3).isInVerticalChain();
        if (bool3)
        {
          localObject4 = ((ConstraintWidget)localObject3).OooO0Oo;
          if (localObject4 == null)
          {
            localObject4 = new androidx/constraintlayout/core/widgets/analyzer/ChainRun;
            i = 1;
            ((ChainRun)localObject4).<init>((ConstraintWidget)localObject3, i);
            ((ConstraintWidget)localObject3).OooO0Oo = ((ChainRun)localObject4);
          }
          if (localObject2 == null)
          {
            localObject2 = new java/util/HashSet;
            ((HashSet)localObject2).<init>();
          }
          localObject4 = ((ConstraintWidget)localObject3).OooO0Oo;
          ((HashSet)localObject2).add(localObject4);
        }
        else
        {
          localObject4 = ((ConstraintWidget)localObject3).OooO0o;
          paramArrayList.add(localObject4);
        }
        bool3 = localObject3 instanceof HelperWidget;
        if (!bool3) {
          break;
        }
        localObject4 = new androidx/constraintlayout/core/widgets/analyzer/HelperReferences;
        ((HelperReferences)localObject4).<init>((ConstraintWidget)localObject3);
      }
    }
    if (localObject2 != null) {
      paramArrayList.addAll((Collection)localObject2);
    }
    localObject1 = paramArrayList.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (WidgetRun)((Iterator)localObject1).next();
      ((WidgetRun)localObject2).OooO0o();
    }
    paramArrayList = paramArrayList.iterator();
    for (;;)
    {
      boolean bool4 = paramArrayList.hasNext();
      if (!bool4) {
        break;
      }
      localObject1 = (WidgetRun)paramArrayList.next();
      localObject2 = ((WidgetRun)localObject1).OooO0O0;
      localObject3 = this.OooO0Oo;
      if (localObject2 != localObject3) {
        ((WidgetRun)localObject1).OooO0Oo();
      }
    }
  }
  
  public boolean OooO0o(boolean paramBoolean)
  {
    boolean bool1 = true;
    paramBoolean &= bool1;
    boolean bool2 = this.OooO0O0;
    if (!bool2)
    {
      bool2 = this.OooO0OO;
      if (!bool2) {}
    }
    else
    {
      localObject1 = this.OooO00o.o000OO.iterator();
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject1).hasNext();
        if (!bool3) {
          break;
        }
        localObject2 = (ConstraintWidget)((Iterator)localObject1).next();
        ((ConstraintWidget)localObject2).OooOOOo();
        ((ConstraintWidget)localObject2).OooO00o = false;
        localObject3 = ((ConstraintWidget)localObject2).OooO0o0;
        ((HorizontalWidgetRun)localObject3).OooOOOo();
        localObject2 = ((ConstraintWidget)localObject2).OooO0o;
        ((VerticalWidgetRun)localObject2).OooOOOO();
      }
      this.OooO00o.OooOOOo();
      localObject1 = this.OooO00o;
      ((ConstraintWidget)localObject1).OooO00o = false;
      ((ConstraintWidget)localObject1).OooO0o0.OooOOOo();
      localObject1 = this.OooO00o.OooO0o;
      ((VerticalWidgetRun)localObject1).OooOOOO();
      this.OooO0OO = false;
    }
    Object localObject1 = this.OooO0Oo;
    bool2 = OooO0O0((ConstraintWidgetContainer)localObject1);
    if (bool2) {
      return false;
    }
    this.OooO00o.setX(0);
    this.OooO00o.setY(0);
    localObject1 = this.OooO00o.getDimensionBehaviour(0);
    Object localObject2 = this.OooO00o.getDimensionBehaviour(bool1);
    boolean bool4 = this.OooO0O0;
    if (bool4) {
      OooO0OO();
    }
    Object localObject3 = this.OooO00o;
    boolean bool5 = ((ConstraintWidget)localObject3).getX();
    Object localObject4 = this.OooO00o;
    boolean bool6 = ((ConstraintWidget)localObject4).getY();
    this.OooO00o.OooO0o0.OooO0oo.OooO0Oo(bool5);
    this.OooO00o.OooO0o.OooO0oo.OooO0Oo(bool6);
    OooOOO0();
    Object localObject5 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
    if ((localObject1 == localObject5) || (localObject2 == localObject5))
    {
      if (paramBoolean)
      {
        localObject5 = this.OooO0o0.iterator();
        boolean bool7;
        do
        {
          bool7 = ((Iterator)localObject5).hasNext();
          if (!bool7) {
            break;
          }
          localObject6 = (WidgetRun)((Iterator)localObject5).next();
          bool7 = ((WidgetRun)localObject6).OooOO0O();
        } while (bool7);
        paramBoolean = false;
        localObject7 = null;
      }
      int j;
      if (paramBoolean)
      {
        localObject5 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
        if (localObject1 == localObject5)
        {
          localObject5 = this.OooO00o;
          localObject6 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
          ((ConstraintWidget)localObject5).setHorizontalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject6);
          localObject5 = this.OooO00o;
          int i = OooO0o0((ConstraintWidgetContainer)localObject5, 0);
          ((ConstraintWidget)localObject5).setWidth(i);
          localObject5 = this.OooO00o;
          localObject6 = ((ConstraintWidget)localObject5).OooO0o0.OooO0o0;
          j = ((ConstraintWidget)localObject5).getWidth();
          ((DimensionDependency)localObject6).OooO0Oo(j);
        }
      }
      if (paramBoolean)
      {
        localObject7 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
        if (localObject2 == localObject7)
        {
          localObject7 = this.OooO00o;
          localObject5 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
          ((ConstraintWidget)localObject7).setVerticalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject5);
          localObject7 = this.OooO00o;
          j = OooO0o0((ConstraintWidgetContainer)localObject7, bool1);
          ((ConstraintWidget)localObject7).setHeight(j);
          localObject7 = this.OooO00o;
          localObject5 = ((ConstraintWidget)localObject7).OooO0o.OooO0o0;
          paramBoolean = ((ConstraintWidget)localObject7).getHeight();
          ((DimensionDependency)localObject5).OooO0Oo(paramBoolean);
        }
      }
    }
    Object localObject7 = this.OooO00o;
    localObject5 = localObject7.Ooooo00[0];
    Object localObject6 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
    if (localObject5 != localObject6)
    {
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.o00Ooo0O;
      if (localObject5 != localDimensionBehaviour)
      {
        paramBoolean = false;
        localObject7 = null;
        break label707;
      }
    }
    paramBoolean = ((ConstraintWidget)localObject7).getWidth() + bool5;
    this.OooO00o.OooO0o0.OooO.OooO0Oo(paramBoolean);
    localObject5 = this.OooO00o.OooO0o0.OooO0o0;
    paramBoolean -= bool5;
    ((DimensionDependency)localObject5).OooO0Oo(paramBoolean);
    OooOOO0();
    localObject7 = this.OooO00o;
    localObject3 = localObject7.Ooooo00[bool1];
    if (localObject3 != localObject6)
    {
      localObject5 = ConstraintWidget.DimensionBehaviour.o00Ooo0O;
      if (localObject3 != localObject5) {}
    }
    else
    {
      paramBoolean = ((ConstraintWidget)localObject7).getHeight() + bool6;
      this.OooO00o.OooO0o.OooO.OooO0Oo(paramBoolean);
      localObject3 = this.OooO00o.OooO0o.OooO0o0;
      paramBoolean -= bool6;
      ((DimensionDependency)localObject3).OooO0Oo(paramBoolean);
    }
    OooOOO0();
    paramBoolean = bool1;
    label707:
    localObject3 = this.OooO0o0.iterator();
    for (;;)
    {
      bool6 = ((Iterator)localObject3).hasNext();
      if (!bool6) {
        break;
      }
      localObject4 = (WidgetRun)((Iterator)localObject3).next();
      localObject5 = ((WidgetRun)localObject4).OooO0O0;
      localObject6 = this.OooO00o;
      if (localObject5 == localObject6)
      {
        bool8 = ((WidgetRun)localObject4).OooO0oO;
        if (!bool8) {}
      }
      else
      {
        ((WidgetRun)localObject4).OooO0o0();
      }
    }
    localObject3 = this.OooO0o0.iterator();
    do
    {
      bool6 = ((Iterator)localObject3).hasNext();
      if (!bool6) {
        break label954;
      }
      localObject4 = (WidgetRun)((Iterator)localObject3).next();
      if (paramBoolean) {
        break;
      }
      localObject5 = ((WidgetRun)localObject4).OooO0O0;
      localObject6 = this.OooO00o;
    } while (localObject5 == localObject6);
    localObject5 = ((WidgetRun)localObject4).OooO0oo;
    boolean bool8 = ((DependencyNode)localObject5).OooOO0;
    if (!bool8) {}
    for (;;)
    {
      bool1 = false;
      break label954;
      localObject5 = ((WidgetRun)localObject4).OooO;
      bool8 = ((DependencyNode)localObject5).OooOO0;
      if (!bool8)
      {
        bool8 = localObject4 instanceof GuidelineReference;
        if (!bool8) {}
      }
      else
      {
        localObject5 = ((WidgetRun)localObject4).OooO0o0;
        bool8 = ((DependencyNode)localObject5).OooOO0;
        if (bool8) {
          break;
        }
        bool8 = localObject4 instanceof ChainRun;
        if (bool8) {
          break;
        }
        bool6 = localObject4 instanceof GuidelineReference;
        if (bool6) {
          break;
        }
      }
    }
    label954:
    this.OooO00o.setHorizontalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject1);
    this.OooO00o.setVerticalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject2);
    return bool1;
  }
  
  public final int OooO0o0(ConstraintWidgetContainer paramConstraintWidgetContainer, int paramInt)
  {
    ArrayList localArrayList = this.OooO;
    int i = localArrayList.size();
    long l1 = 0L;
    int j = 0;
    while (j < i)
    {
      RunGroup localRunGroup = (RunGroup)this.OooO.get(j);
      long l2 = localRunGroup.OooO0O0(paramConstraintWidgetContainer, paramInt);
      l1 = Math.max(l1, l2);
      j += 1;
    }
    return (int)l1;
  }
  
  public boolean OooO0oO(boolean paramBoolean)
  {
    paramBoolean = this.OooO0O0;
    if (paramBoolean)
    {
      localObject1 = this.OooO00o.o000OO.iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject1).hasNext();
        if (!bool) {
          break;
        }
        localObject2 = (ConstraintWidget)((Iterator)localObject1).next();
        ((ConstraintWidget)localObject2).OooOOOo();
        ((ConstraintWidget)localObject2).OooO00o = false;
        Object localObject3 = ((ConstraintWidget)localObject2).OooO0o0;
        DimensionDependency localDimensionDependency = ((WidgetRun)localObject3).OooO0o0;
        localDimensionDependency.OooOO0 = false;
        ((WidgetRun)localObject3).OooO0oO = false;
        ((HorizontalWidgetRun)localObject3).OooOOOo();
        localObject2 = ((ConstraintWidget)localObject2).OooO0o;
        localObject3 = ((WidgetRun)localObject2).OooO0o0;
        ((DependencyNode)localObject3).OooOO0 = false;
        ((WidgetRun)localObject2).OooO0oO = false;
        ((VerticalWidgetRun)localObject2).OooOOOO();
      }
      this.OooO00o.OooOOOo();
      localObject1 = this.OooO00o;
      ((ConstraintWidget)localObject1).OooO00o = false;
      localObject1 = ((ConstraintWidget)localObject1).OooO0o0;
      ((WidgetRun)localObject1).OooO0o0.OooOO0 = false;
      ((WidgetRun)localObject1).OooO0oO = false;
      ((HorizontalWidgetRun)localObject1).OooOOOo();
      localObject1 = this.OooO00o.OooO0o;
      Object localObject2 = ((WidgetRun)localObject1).OooO0o0;
      ((DependencyNode)localObject2).OooOO0 = false;
      ((WidgetRun)localObject1).OooO0oO = false;
      ((VerticalWidgetRun)localObject1).OooOOOO();
      OooO0OO();
    }
    Object localObject1 = this.OooO0Oo;
    paramBoolean = OooO0O0((ConstraintWidgetContainer)localObject1);
    if (paramBoolean) {
      return false;
    }
    this.OooO00o.setX(0);
    this.OooO00o.setY(0);
    this.OooO00o.OooO0o0.OooO0oo.OooO0Oo(0);
    this.OooO00o.OooO0o.OooO0oo.OooO0Oo(0);
    return true;
  }
  
  public boolean OooO0oo(boolean paramBoolean, int paramInt)
  {
    boolean bool1 = true;
    paramBoolean &= bool1;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = this.OooO00o.getDimensionBehaviour(0);
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = this.OooO00o.getDimensionBehaviour(bool1);
    Object localObject1 = this.OooO00o;
    boolean bool2 = ((ConstraintWidget)localObject1).getX();
    Object localObject2 = this.OooO00o;
    boolean bool3 = ((ConstraintWidget)localObject2).getY();
    Object localObject4;
    int j;
    if (paramBoolean)
    {
      localObject3 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
      if ((localDimensionBehaviour1 == localObject3) || (localDimensionBehaviour2 == localObject3))
      {
        localObject3 = this.OooO0o0.iterator();
        boolean bool4;
        do
        {
          int i;
          do
          {
            bool4 = ((Iterator)localObject3).hasNext();
            if (!bool4) {
              break;
            }
            localObject4 = (WidgetRun)((Iterator)localObject3).next();
            i = ((WidgetRun)localObject4).OooO0o;
          } while (i != paramInt);
          bool4 = ((WidgetRun)localObject4).OooOO0O();
        } while (bool4);
        paramBoolean = false;
        localObject5 = null;
        if (paramInt == 0)
        {
          if (!paramBoolean) {
            break label309;
          }
          localObject5 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
          if (localDimensionBehaviour1 != localObject5) {
            break label309;
          }
          localObject5 = this.OooO00o;
          localObject3 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
          ((ConstraintWidget)localObject5).setHorizontalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject3);
          localObject5 = this.OooO00o;
          j = OooO0o0((ConstraintWidgetContainer)localObject5, 0);
          ((ConstraintWidget)localObject5).setWidth(j);
          localObject5 = this.OooO00o;
          localObject3 = ((ConstraintWidget)localObject5).OooO0o0.OooO0o0;
          paramBoolean = ((ConstraintWidget)localObject5).getWidth();
        }
        else
        {
          if (!paramBoolean) {
            break label309;
          }
          localObject5 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
          if (localDimensionBehaviour2 != localObject5) {
            break label309;
          }
          localObject5 = this.OooO00o;
          localObject3 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
          ((ConstraintWidget)localObject5).setVerticalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject3);
          localObject5 = this.OooO00o;
          j = OooO0o0((ConstraintWidgetContainer)localObject5, bool1);
          ((ConstraintWidget)localObject5).setHeight(j);
          localObject5 = this.OooO00o;
          localObject3 = ((ConstraintWidget)localObject5).OooO0o.OooO0o0;
          paramBoolean = ((ConstraintWidget)localObject5).getHeight();
        }
        ((DimensionDependency)localObject3).OooO0Oo(paramBoolean);
      }
    }
    label309:
    Object localObject5 = this.OooO00o;
    if (paramInt == 0)
    {
      localObject2 = localObject5.Ooooo00[0];
      localObject3 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
      if (localObject2 != localObject3)
      {
        localObject3 = ConstraintWidget.DimensionBehaviour.o00Ooo0O;
        if (localObject2 != localObject3) {}
      }
      else
      {
        paramBoolean = ((ConstraintWidget)localObject5).getWidth() + bool2;
        this.OooO00o.OooO0o0.OooO.OooO0Oo(paramBoolean);
        localObject2 = this.OooO00o.OooO0o0.OooO0o0;
        paramBoolean -= bool2;
        ((DimensionDependency)localObject2).OooO0Oo(paramBoolean);
        break label491;
      }
    }
    else
    {
      localObject1 = localObject5.Ooooo00[bool1];
      localObject3 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
      if (localObject1 == localObject3) {
        break label445;
      }
      localObject3 = ConstraintWidget.DimensionBehaviour.o00Ooo0O;
      if (localObject1 == localObject3) {
        break label445;
      }
    }
    paramBoolean = false;
    localObject5 = null;
    break label493;
    label445:
    paramBoolean = ((ConstraintWidget)localObject5).getHeight() + bool3;
    this.OooO00o.OooO0o.OooO.OooO0Oo(paramBoolean);
    localObject1 = this.OooO00o.OooO0o.OooO0o0;
    paramBoolean -= bool3;
    ((DimensionDependency)localObject1).OooO0Oo(paramBoolean);
    label491:
    paramBoolean = bool1;
    label493:
    OooOOO0();
    localObject1 = this.OooO0o0.iterator();
    for (;;)
    {
      bool3 = ((Iterator)localObject1).hasNext();
      if (!bool3) {
        break;
      }
      localObject2 = (WidgetRun)((Iterator)localObject1).next();
      j = ((WidgetRun)localObject2).OooO0o;
      if (j == paramInt)
      {
        localObject3 = ((WidgetRun)localObject2).OooO0O0;
        localObject4 = this.OooO00o;
        if (localObject3 == localObject4)
        {
          boolean bool5 = ((WidgetRun)localObject2).OooO0oO;
          if (!bool5) {}
        }
        else
        {
          ((WidgetRun)localObject2).OooO0o0();
        }
      }
    }
    localObject1 = this.OooO0o0.iterator();
    do
    {
      int k;
      do
      {
        bool3 = ((Iterator)localObject1).hasNext();
        if (!bool3) {
          break;
        }
        localObject2 = (WidgetRun)((Iterator)localObject1).next();
        k = ((WidgetRun)localObject2).OooO0o;
      } while (k != paramInt);
      if (paramBoolean) {
        break;
      }
      localObject3 = ((WidgetRun)localObject2).OooO0O0;
      localObject4 = this.OooO00o;
    } while (localObject3 == localObject4);
    Object localObject3 = ((WidgetRun)localObject2).OooO0oo;
    boolean bool6 = ((DependencyNode)localObject3).OooOO0;
    if (!bool6) {}
    for (;;)
    {
      bool1 = false;
      break label749;
      localObject3 = ((WidgetRun)localObject2).OooO;
      bool6 = ((DependencyNode)localObject3).OooOO0;
      if (bool6)
      {
        bool6 = localObject2 instanceof ChainRun;
        if (bool6) {
          break;
        }
        localObject2 = ((WidgetRun)localObject2).OooO0o0;
        bool3 = ((DependencyNode)localObject2).OooOO0;
        if (bool3) {
          break;
        }
      }
    }
    label749:
    this.OooO00o.setHorizontalDimensionBehaviour(localDimensionBehaviour1);
    this.OooO00o.setVerticalDimensionBehaviour(localDimensionBehaviour2);
    return bool1;
  }
  
  public void OooOO0()
  {
    this.OooO0O0 = true;
  }
  
  public void OooOO0O()
  {
    this.OooO0OO = true;
  }
  
  public final void OooOO0o(ConstraintWidget paramConstraintWidget, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour1, int paramInt1, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour2, int paramInt2)
  {
    BasicMeasure.Measure localMeasure = this.OooO0oo;
    localMeasure.OooO00o = paramDimensionBehaviour1;
    localMeasure.OooO0O0 = paramDimensionBehaviour2;
    localMeasure.OooO0OO = paramInt1;
    localMeasure.OooO0Oo = paramInt2;
    this.OooO0oO.OooO0O0(paramConstraintWidget, localMeasure);
    int i = this.OooO0oo.OooO0o0;
    paramConstraintWidget.setWidth(i);
    i = this.OooO0oo.OooO0o;
    paramConstraintWidget.setHeight(i);
    boolean bool = this.OooO0oo.OooO0oo;
    paramConstraintWidget.setHasBaseline(bool);
    int j = this.OooO0oo.OooO0oO;
    paramConstraintWidget.setBaselineDistance(j);
  }
  
  public void OooOOO0()
  {
    Iterator localIterator = this.OooO00o.o000OO.iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      ConstraintWidget localConstraintWidget = (ConstraintWidget)localIterator.next();
      boolean bool2 = localConstraintWidget.OooO00o;
      if (!bool2)
      {
        Object localObject1 = localConstraintWidget.Ooooo00;
        int k = 0;
        Object localObject2 = localObject1[0];
        int m = 1;
        ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = localObject1[m];
        int j = localConstraintWidget.OooOo0o;
        int n = localConstraintWidget.OooOo;
        ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
        ConstraintWidget.DimensionBehaviour localDimensionBehaviour3;
        if (localObject2 != localDimensionBehaviour2)
        {
          localDimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          if ((localObject2 != localDimensionBehaviour3) || (j != m))
          {
            j = 0;
            localObject1 = null;
            break label130;
          }
        }
        j = m;
        label130:
        if (localDimensionBehaviour1 != localDimensionBehaviour2)
        {
          localDimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          if ((localDimensionBehaviour1 != localDimensionBehaviour3) || (n != m)) {}
        }
        else
        {
          k = m;
        }
        Object localObject3 = localConstraintWidget.OooO0o0.OooO0o0;
        boolean bool4 = ((DependencyNode)localObject3).OooOO0;
        DimensionDependency localDimensionDependency = localConstraintWidget.OooO0o.OooO0o0;
        boolean bool5 = localDimensionDependency.OooOO0;
        int i1;
        int i2;
        if ((bool4) && (bool5))
        {
          localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
          i1 = ((DependencyNode)localObject3).OooO0oO;
          i2 = localDimensionDependency.OooO0oO;
          localObject1 = this;
          localObject3 = localDimensionBehaviour2;
          OooOO0o(localConstraintWidget, localDimensionBehaviour2, i1, localDimensionBehaviour2, i2);
          localConstraintWidget.OooO00o = m;
        }
        else if ((i1 != 0) && (k != 0))
        {
          localDimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
          int i3 = ((DependencyNode)localObject3).OooO0oO;
          i2 = localDimensionDependency.OooO0oO;
          localObject1 = this;
          localObject3 = localDimensionBehaviour3;
          i1 = i3;
          OooOO0o(localConstraintWidget, localDimensionBehaviour3, i3, localDimensionBehaviour2, i2);
          localObject1 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          if (localDimensionBehaviour1 == localObject1)
          {
            localObject1 = localConstraintWidget.OooO0o.OooO0o0;
            k = localConstraintWidget.getHeight();
            label330:
            ((DimensionDependency)localObject1).OooOOO0 = k;
          }
          else
          {
            localObject1 = localConstraintWidget.OooO0o.OooO0o0;
          }
        }
        else
        {
          for (k = localConstraintWidget.getHeight();; k = localConstraintWidget.getWidth())
          {
            ((DimensionDependency)localObject1).OooO0Oo(k);
            break;
            if ((!bool5) || (j == 0)) {
              break label466;
            }
            i1 = ((DependencyNode)localObject3).OooO0oO;
            localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
            i2 = localDimensionDependency.OooO0oO;
            localObject1 = this;
            localObject3 = localDimensionBehaviour2;
            localDimensionBehaviour2 = localDimensionBehaviour1;
            OooOO0o(localConstraintWidget, (ConstraintWidget.DimensionBehaviour)localObject3, i1, localDimensionBehaviour1, i2);
            localObject1 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
            if (localObject2 == localObject1)
            {
              localObject1 = localConstraintWidget.OooO0o0.OooO0o0;
              k = localConstraintWidget.getWidth();
              break label330;
            }
            localObject1 = localConstraintWidget.OooO0o0.OooO0o0;
          }
        }
        label466:
        boolean bool3 = localConstraintWidget.OooO00o;
        if (bool3)
        {
          localObject1 = localConstraintWidget.OooO0o.OooOO0o;
          if (localObject1 != null)
          {
            int i = localConstraintWidget.getBaselineDistance();
            ((DimensionDependency)localObject1).OooO0Oo(i);
          }
        }
      }
    }
  }
  
  public void setMeasurer(BasicMeasure.Measurer paramMeasurer)
  {
    this.OooO0oO = paramMeasurer;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.DependencyGraph
 * JD-Core Version:    0.7.0.1
 */